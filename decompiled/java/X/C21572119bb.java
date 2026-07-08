package X;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.19bb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21572119bb {
    public final Function1<Matrix, Unit> LIZ;
    public final RectF LIZJ;
    public final float[] LJ;
    public float LJFF;
    public float LJI;
    public final Matrix LIZIZ = new Matrix();
    public final RectF LIZLLL = new RectF();

    public final void LIZ() {
        Matrix matrix = this.LIZIZ;
        matrix.setValues(this.LJ);
        matrix.mapRect(this.LIZLLL, this.LIZJ);
        matrix.postTranslate(this.LJFF - this.LIZLLL.centerX(), this.LJI - this.LIZLLL.centerY());
        this.LIZ.invoke(matrix);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C21572119bb(Rect rect, float[] fArr, Function1<? super Matrix, Unit> function1) {
        this.LIZ = function1;
        this.LIZJ = new RectF(rect);
        this.LJ = (float[]) fArr.clone();
        LIZ();
    }
}
