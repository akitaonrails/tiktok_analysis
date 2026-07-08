package X;

import android.graphics.Matrix;
import android.graphics.RectF;

/* JADX INFO: renamed from: X.19bN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C21570719bN {
    public final C21570319bJ LIZIZ;
    public final RectF LIZJ;
    public final float[] LJ;
    public float LJFF;
    public float LJI;
    public final Matrix LIZ = new Matrix();
    public final RectF LIZLLL = new RectF();

    public final void LIZ() {
        this.LIZ.setValues(this.LJ);
        this.LIZ.mapRect(this.LIZLLL, this.LIZJ);
        this.LIZ.postTranslate(this.LJFF - this.LIZLLL.centerX(), this.LJI - this.LIZLLL.centerY());
        this.LIZIZ.setImageMatrix(new Matrix(this.LIZ));
    }

    public C21570719bN(C21570319bJ c21570319bJ, float[] fArr) {
        this.LIZIZ = c21570319bJ;
        this.LIZJ = new RectF(c21570319bJ.getBaseOriginDisplayRect());
        this.LJ = (float[]) fArr.clone();
        LIZ();
    }
}
