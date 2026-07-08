package X;

/* JADX INFO: renamed from: X.0ier, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1250950ier {
    public static final float[] LIZ = new float[16];
    public static final float[] LIZIZ = new float[16];

    static {
        int i = 0;
        do {
            float f = i / 15;
            LIZ[i] = f;
            float[] fArr = LIZIZ;
            float f2 = f;
            for (int i2 = 0; i2 < 8; i2++) {
                float f3 = 1.0f - f2;
                float f4 = f3 * 3.0f;
                float f5 = f3 * f4;
                float f6 = ((((f5 * f2) * 1.0f) + (((f4 * f2) * f2) * 0.54f)) + ((f2 * f2) * f2)) - f;
                if (Math.abs(f6) < 1.0E-4f) {
                    break;
                }
                float f7 = (f5 * 1.0f) + (f3 * 6.0f * f2 * (-0.45999998f)) + (f2 * 3.0f * f2 * 0.45999998f);
                if (Math.abs(f7) < 1.0E-4f) {
                    break;
                }
                f2 -= f6 / f7;
            }
            float f8 = 1.0f - f2;
            float f9 = 3.0f * f8;
            fArr[i] = (f8 * f9 * f2 * 0.0f) + (f9 * f2 * f2 * 0.99f) + (f2 * f2 * f2);
            i++;
        } while (i < 16);
    }
}
