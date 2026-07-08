package X;

/* JADX INFO: renamed from: X.19PC, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C19PC {
    public static final float[][] LIZ = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};
    public static final float[][] LIZIZ = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};
    public static final float[] LIZJ = {95.047f, 100.0f, 108.883f};
    public static final float[][] LIZLLL = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};

    public static float LIZJ() {
        return ((float) Math.pow((((double) 50.0f) + 16.0d) / 116.0d, 3.0d)) * 100.0f;
    }

    public static int LIZ(float f) {
        boolean z;
        float f2;
        float f3;
        if (f < 1.0f) {
            return -16777216;
        }
        if (f > 99.0f) {
            return -1;
        }
        float f4 = (f + 16.0f) / 116.0f;
        if (f > 8.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            f2 = f4 * f4 * f4;
        } else {
            f2 = f / 903.2963f;
        }
        float f5 = f4 * f4 * f4;
        if (f5 > 0.008856452f) {
            f3 = f5;
        } else {
            f3 = ((f4 * 116.0f) - 16.0f) / 903.2963f;
            f5 = ((f4 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = LIZJ;
        return C2441009hQ.LIZJ(f3 * fArr[0], f2 * fArr[1], f5 * fArr[2]);
    }

    public static float LIZIZ(int i) {
        float fPow;
        float f = i / 255.0f;
        if (f <= 0.04045f) {
            fPow = f / 12.92f;
        } else {
            fPow = (float) Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d);
        }
        return fPow * 100.0f;
    }
}
