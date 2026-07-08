package X;

import android.graphics.Matrix;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0uGa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1697180uGa<T> {
    public final Function2<T, Matrix, Unit> LIZ;
    public Matrix LIZIZ;
    public boolean LJ;
    public boolean LJFF;
    public final float[] LIZJ = C1696000uEg.LIZ();
    public final float[] LIZLLL = C1696000uEg.LIZ();
    public boolean LJI = true;
    public boolean LJII = true;

    public final void LIZJ() {
        this.LJ = true;
        this.LJFF = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1697180uGa(Function2<? super T, ? super Matrix, Unit> function2) {
        this.LIZ = function2;
    }

    public final float[] LIZ(T t) {
        float[] fArr = this.LIZLLL;
        if (this.LJFF) {
            this.LJI = C1696030uEj.LIZ(LIZIZ(t), fArr);
            this.LJFF = false;
        }
        if (!this.LJI) {
            return null;
        }
        return fArr;
    }

    public final float[] LIZIZ(T t) {
        float[] fArr = this.LIZJ;
        if (!this.LJ) {
            return fArr;
        }
        Matrix matrix = this.LIZIZ;
        if (matrix == null) {
            matrix = new Matrix();
            this.LIZIZ = matrix;
        }
        this.LIZ.invoke(t, matrix);
        C1697320uGo.LIZIZ(matrix, fArr);
        this.LJ = false;
        this.LJII = C1696040uEk.LIZ(fArr);
        return fArr;
    }
}
