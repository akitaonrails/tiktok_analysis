package X;

import android.graphics.Paint;

/* JADX INFO: renamed from: X.15LT, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15LT {
    public int LIZ;
    public int LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public int LJ;
    public int LJFF;
    public int LJI;
    public int LJII;
    public Paint LJIIIIZZ;
    public Paint LJIIIZ;
    public float[] LJIIJ = new float[0];
    public float[] LJIIJJI = new float[0];
    public int LJIIL = -1;
    public final Paint LJIILIIL = new Paint();
    public boolean LJIILJJIL;

    public final void LIZ(int i) {
        this.LJIIL = i;
        Paint paint = this.LJIIIIZZ;
        Paint paint2 = null;
        if (paint == null) {
            paint = null;
        }
        paint.setColor(i);
        Paint paint3 = this.LJIIIZ;
        if (paint3 == null) {
            paint3 = null;
        }
        paint3.setColor(i);
        Paint paint4 = this.LJIIIZ;
        if (paint4 != null) {
            paint2 = paint4;
        }
        paint2.setAlpha(76);
    }
}
