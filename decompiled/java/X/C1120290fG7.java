package X;

import android.graphics.PointF;
import android.graphics.RectF;

/* JADX INFO: renamed from: X.0fG7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1120290fG7 {
    public final PointF LIZ;
    public final PointF LIZIZ;
    public final PointF LIZJ;
    public final int LIZLLL;
    public final float[] LJ;
    public final float[] LJFF;
    public final float[] LJI;
    public final float[] LJII;
    public final float[] LJIIIIZZ;
    public final float[] LJIIIZ;
    public final float[] LJIIJ;
    public final float[] LJIIJJI;
    public int LJIIL = -1;

    public C1120290fG7(PointF pointF, PointF pointF2, PointF pointF3, int i) {
        this.LIZ = pointF;
        this.LIZIZ = pointF2;
        this.LIZJ = pointF3;
        this.LIZLLL = i;
        this.LJ = new float[i];
        this.LJFF = new float[i];
        this.LJI = new float[i];
        this.LJII = new float[i];
        this.LJIIIIZZ = new float[i];
        this.LJIIIZ = new float[i];
        this.LJIIJ = new float[i];
        this.LJIIJJI = new float[i];
    }

    public final void LIZ(int i, float f, float f2, RectF rectF, RectF rectF2) {
        if (i >= this.LIZLLL) {
            return;
        }
        int i2 = this.LJIIL;
        if (i2 < i) {
            float f3 = 2;
            float f4 = (C1120240fG2.LLJJIJIIJIL * f) / f3;
            float f5 = (C1120240fG2.LLJJIJI * f2) / f3;
            int i3 = 1;
            int i4 = i2 + 1;
            if (i4 <= i) {
                while (true) {
                    float f6 = i4 / this.LIZLLL;
                    float f7 = i3 - f6;
                    double d = f7;
                    float f8 = f3 * f6 * f7;
                    float f9 = f6 * f6;
                    float fPow = (float) (((double) (this.LIZIZ.x * f9)) + (Math.pow(d, 2.0d) * ((double) this.LIZ.x)) + ((double) (this.LIZJ.x * f8)));
                    float fPow2 = (float) ((Math.pow(d, 2.0d) * ((double) this.LIZ.y)) + ((double) (f8 * this.LIZJ.y)) + ((double) (f9 * this.LIZIZ.y)));
                    this.LJ[i4] = fPow - f4;
                    this.LJFF[i4] = fPow2 - f4;
                    this.LJI[i4] = fPow + f4;
                    this.LJII[i4] = fPow2 + f4;
                    this.LJIIIIZZ[i4] = fPow - f5;
                    this.LJIIIZ[i4] = fPow2 - f5;
                    this.LJIIJ[i4] = fPow + f5;
                    this.LJIIJJI[i4] = fPow2 + f5;
                    if (i4 == i) {
                        break;
                    }
                    i4++;
                    i3 = 1;
                }
            }
            this.LJIIL = i;
        }
        rectF.left = this.LJ[i];
        rectF.top = this.LJFF[i];
        rectF.right = this.LJI[i];
        rectF.bottom = this.LJII[i];
        rectF2.left = this.LJIIIIZZ[i];
        rectF2.top = this.LJIIIZ[i];
        rectF2.right = this.LJIIJ[i];
        rectF2.bottom = this.LJIIJJI[i];
    }
}
