package X;

import android.graphics.Matrix;

/* JADX INFO: renamed from: X.0jER, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1273010jER {
    public static final ThreadLocal<float[]> LIZ = new ThreadLocal<>();

    public static final float[] LJ() {
        return new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    }

    public static final float[] LJFF() {
        return new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f};
    }

    public static float[] LIZIZ(Matrix matrix) {
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        return new float[]{fArr[0], fArr[3], 0.0f, fArr[6], fArr[1], fArr[4], 0.0f, fArr[7], 0.0f, 0.0f, 1.0f, 0.0f, fArr[2], fArr[5], 0.0f, fArr[8]};
    }

    public static Matrix LIZJ(int i, float[] fArr) {
        Matrix matrix;
        if (C1273520jFG.LIZ()) {
            matrix = C1273520jFG.LIZIZ(i, false, null);
        } else {
            matrix = new Matrix();
        }
        LIZLLL(matrix, fArr);
        return matrix;
    }

    public static void LIZLLL(Matrix matrix, float[] fArr) {
        float[] fArr2;
        if (C1273520jFG.LIZ()) {
            ThreadLocal<float[]> threadLocal = LIZ;
            fArr2 = threadLocal.get();
            if (fArr2 == null) {
                fArr2 = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
                threadLocal.set(fArr2);
            }
            fArr2[0] = fArr[0];
            fArr2[1] = fArr[4];
            fArr2[2] = fArr[12];
            fArr2[3] = fArr[1];
            fArr2[4] = fArr[5];
            fArr2[5] = fArr[13];
            fArr2[6] = fArr[3];
            fArr2[7] = fArr[7];
            fArr2[8] = fArr[15];
        } else {
            fArr2 = new float[]{fArr[0], fArr[4], fArr[12], fArr[1], fArr[5], fArr[13], fArr[3], fArr[7], fArr[15]};
        }
        matrix.setValues(fArr2);
    }

    public static void LIZ(boolean z, boolean z2, boolean z3, int i, int i2, int i3, int i4, float[] fArr) {
        float f;
        float f2;
        float f3;
        float f4 = i3 / i4;
        float f5 = i / i2;
        if (!z ? f4 < f5 : f4 > f5) {
            f2 = f5 / f4;
            f = 1.0f;
        } else {
            f = f4 / f5;
            f2 = 1.0f;
        }
        float f6 = -1.0f;
        if (z2) {
            f3 = -1.0f;
        } else {
            f3 = 1.0f;
        }
        android.opengl.Matrix.scaleM(fArr, 0, f * f3, 1.0f, 1.0f);
        if (!z3) {
            f6 = 1.0f;
        }
        android.opengl.Matrix.scaleM(fArr, 0, 1.0f, f2 * f6, 1.0f);
    }
}
