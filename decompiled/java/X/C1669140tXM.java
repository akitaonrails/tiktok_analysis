package X;

/* JADX INFO: renamed from: X.0tXM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1669140tXM {
    public static final C1695950uEb LIZ(float f, float f2, long j) {
        int i;
        C1695950uEb c1695950uEbLIZ = C1695940uEa.LIZ();
        float fSqrt = (float) ((Math.sqrt(3.0d) * ((double) f)) / ((double) 2));
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) / 2.0f;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) / 2.0f;
        float[] fArr = {fIntBitsToFloat, fIntBitsToFloat2 + f};
        float f3 = fIntBitsToFloat - fSqrt;
        float f4 = f / 2.0f;
        float f5 = fIntBitsToFloat2 + f4;
        float[] fArr2 = {f3, f5};
        float f6 = fIntBitsToFloat2 - f4;
        float[] fArr3 = {fIntBitsToFloat, fIntBitsToFloat2 - f};
        float f7 = fIntBitsToFloat + fSqrt;
        float[][] fArr4 = {fArr, fArr2, new float[]{f3, f6}, fArr3, new float[]{f7, f6}, new float[]{f7, f5}};
        if (f2 <= 0.0f) {
            c1695950uEbLIZ.LIZJ(fArr[0], fArr[1]);
            int i2 = 1;
            do {
                float[] fArr5 = fArr4[i2];
                c1695950uEbLIZ.LJIIL(fArr5[0], fArr5[1]);
                i2++;
            } while (i2 < 6);
            c1695950uEbLIZ.close();
            return c1695950uEbLIZ;
        }
        float fSqrt2 = (float) Math.sqrt(3.0d);
        float f8 = (f * fSqrt2) / 2.0f;
        if (f2 <= f8) {
            f8 = f2;
        }
        float f9 = f8 / fSqrt2;
        int i3 = 0;
        do {
            float[] fArr6 = fArr4[i3];
            float[] fArr7 = fArr4[((i3 - 1) + 6) % 6];
            i = i3 + 1;
            float[] fArr8 = fArr4[i % 6];
            float[] fArrLIZIZ = LIZIZ(f9, fArr6, fArr7);
            float[] fArrLIZIZ2 = LIZIZ(f9, fArr6, fArr8);
            if (i3 == 0) {
                c1695950uEbLIZ.LIZJ(fArrLIZIZ[0], fArrLIZIZ[1]);
            } else {
                c1695950uEbLIZ.LJIIL(fArrLIZIZ[0], fArrLIZIZ[1]);
            }
            c1695950uEbLIZ.LJIIZILJ(fArr6[0], fArr6[1], fArrLIZIZ2[0], fArrLIZIZ2[1]);
            i3 = i;
        } while (i < 6);
        c1695950uEbLIZ.close();
        return c1695950uEbLIZ;
    }

    public static final float[] LIZIZ(float f, float[] fArr, float[] fArr2) {
        boolean z;
        float f2 = fArr2[0] - fArr[0];
        float f3 = fArr2[1] - fArr[1];
        float fSqrt = (float) Math.sqrt((f2 * f2) + (f3 * f3));
        if (fSqrt == 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return new float[]{fArr[0], fArr[1]};
        }
        float f4 = f / fSqrt;
        return new float[]{fArr[0] + (f2 * f4), fArr[1] + (f3 * f4)};
    }
}
