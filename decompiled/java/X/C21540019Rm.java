package X;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;

/* JADX INFO: renamed from: X.19Rm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21540019Rm {
    public final C21540119Rn[] LIZ = new C21540119Rn[4];
    public final Matrix[] LIZIZ = new Matrix[4];
    public final Matrix[] LIZJ = new Matrix[4];
    public final PointF LIZLLL = new PointF();
    public final Path LJ = new Path();
    public final Path LJFF = new Path();
    public final C21540119Rn LJI = new C21540119Rn();
    public final float[] LJII = new float[2];
    public final float[] LJIIIIZZ = new float[2];
    public final Path LJIIIZ = new Path();
    public final Path LJIIJ = new Path();
    public final boolean LJIIJJI = true;

    public C21540019Rm() {
        int i = 0;
        do {
            this.LIZ[i] = new C21540119Rn();
            this.LIZIZ[i] = new Matrix();
            this.LIZJ[i] = new Matrix();
            i++;
        } while (i < 4);
    }

    public final boolean LIZIZ(Path path, int i) {
        this.LJIIJ.reset();
        this.LIZ[i].LIZJ(this.LIZIZ[i], this.LJIIJ);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        this.LJIIJ.computeBounds(rectF, true);
        path.op(this.LJIIJ, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (!rectF.isEmpty() || (rectF.width() > 1.0f && rectF.height() > 1.0f)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(X.C19RX r18, float r19, android.graphics.RectF r20, X.C21539919Rl r21, android.graphics.Path r22) {
        /*
            Method dump skipped, instruction units count: 664
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21540019Rm.LIZ(X.19RX, float, android.graphics.RectF, X.19Rl, android.graphics.Path):void");
    }
}
