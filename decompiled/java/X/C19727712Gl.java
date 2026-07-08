package X;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;

/* JADX INFO: renamed from: X.12Gl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19727712Gl implements TypeEvaluator<Matrix> {
    public final float[] LIZ = new float[9];
    public final float[] LIZIZ = new float[9];
    public final Matrix LIZJ = new Matrix();

    @Override // android.animation.TypeEvaluator
    public final Matrix evaluate(float f, Matrix matrix, Matrix matrix2) {
        matrix.getValues(this.LIZ);
        matrix2.getValues(this.LIZIZ);
        int i = 0;
        do {
            float[] fArr = this.LIZIZ;
            float f2 = fArr[i];
            float f3 = this.LIZ[i];
            fArr[i] = f3 + ((f2 - f3) * f);
            i++;
        } while (i < 9);
        this.LIZJ.setValues(this.LIZIZ);
        return this.LIZJ;
    }
}
