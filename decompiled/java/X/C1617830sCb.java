package X;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;

/* JADX INFO: renamed from: X.0sCb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public class C1617830sCb {
    public final boolean LIZ;
    public final float LIZIZ = C1596000rdO.LIZIZ();
    public final float LIZJ;
    public final Paint LIZLLL;
    public final Paint LJ;
    public BitmapShader LJFF;
    public BitmapShader LJI;
    public final Matrix LJII;
    public final Paint LJIIIIZZ;
    public Bitmap LJIIIZ;
    public Bitmap LJIIJ;
    public final float LJIIJJI;
    public final Paint LJIIL;
    public final float LJIILIIL;
    public int LJIILJJIL;

    public void LIZ(C1600650rkt c1600650rkt, Canvas canvas) {
    }

    public void LIZJ() {
    }

    public C1617830sCb(boolean z) {
        this.LIZ = z;
        float fLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(1.5d)));
        this.LIZJ = fLIZIZ;
        this.LIZLLL = new Paint(1);
        this.LJ = new Paint(1);
        this.LJII = new Matrix();
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-65536);
        paint.setStrokeWidth(fLIZIZ);
        this.LJIIIIZZ = paint;
        this.LJIIJJI = C1596000rdO.LIZJ() + (C1596000rdO.LIZIZ() * 2);
        Paint paint2 = new Paint(1);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.LJIIL = paint2;
        this.LJIILIIL = C1596000rdO.LIZJ() * 0.76f;
    }

    public void LIZLLL(C1600650rkt c1600650rkt, Bitmap bitmap, long j) {
        LIZJ();
    }

    public final void LIZIZ(BitmapShader bitmapShader, int i, float f, float f2) {
        float f3 = i;
        float f4 = this.LJIIJJI / f3;
        float f5 = (f3 * f4) / 2.0f;
        this.LJII.setScale(f4, f4);
        this.LJII.postTranslate(f - f5, f2 - f5);
        if (bitmapShader != null) {
            bitmapShader.setLocalMatrix(this.LJII);
        }
    }
}
