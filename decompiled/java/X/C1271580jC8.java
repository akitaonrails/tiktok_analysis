package X;

import android.graphics.Matrix;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0jC8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1271580jC8 {
    public float[] LIZ;
    public int LIZIZ;
    public Matrix LIZJ;

    public final void LIZ(int i, Matrix matrix) {
        Matrix matrix2;
        if (this.LIZ != null && this.LIZIZ == i && ((matrix == null && this.LIZJ == null) || Intrinsics.LJFF(matrix, this.LIZJ))) {
            return;
        }
        this.LIZIZ = i;
        if (matrix == null) {
            matrix2 = null;
        } else {
            matrix2 = new Matrix(matrix);
        }
        this.LIZJ = matrix2;
        Matrix matrix3 = new Matrix(matrix);
        matrix3.preTranslate(0.5f, 0.5f);
        if (i != 0) {
            matrix3.preRotate(i);
        }
        matrix3.preScale(1.0f, -1.0f);
        matrix3.preTranslate(-0.5f, -0.5f);
        this.LIZ = C1273010jER.LIZIZ(matrix3);
    }
}
