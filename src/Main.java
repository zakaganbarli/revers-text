import java.util.Scanner;

public class Main {
            public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                System.out.println("Zəhmət olmasa bir söz və ya cümlə daxil edin:");
                String text = scanner.nextLine();

                String reversedText = "";

                for (int i = text.length() - 1; i >= 0; i--) {
                    reversedText += text.charAt(i);
                }

                System.out.println("Daxil etdiyiniz mətnin tərsi: " + reversedText);
            }
        }
