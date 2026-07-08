package X;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: renamed from: X.19Rr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C21540519Rr extends AbstractC21540819Ru {
    public static final RectF LJII = new RectF();
    public final float LIZIZ;
    public final float LIZJ;
    public final float LIZLLL;
    public final float LJ;
    public float LJFF;
    public float LJI;

    @Override // X.AbstractC21540819Ru
    public final void LIZ(Matrix matrix, Path path) {
        Matrix matrix2 = this.LIZ;
        matrix.invert(matrix2);
        path.transform(matrix2);
        RectF rectF = LJII;
        rectF.set(this.LIZIZ, this.LIZJ, this.LIZLLL, this.LJ);
        path.arcTo(rectF, this.LJFF, this.LJI, false);
        path.transform(matrix);
    }

    public C21540519Rr(float f, float f2, float f3, float f4) {
        this.LIZIZ = f;
        this.LIZJ = f2;
        this.LIZLLL = f3;
        this.LJ = f4;
    }
}
