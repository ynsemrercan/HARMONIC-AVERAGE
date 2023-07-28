
public class HarmonicAverage {
    public static void main(String[] args) {
        double sum = 0;
        int[] list = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < list.length; i++) {

            sum += (1.0 / list[i]);

        }

        double avarage = sum / list.length;

        System.out.println(avarage);

    }
}