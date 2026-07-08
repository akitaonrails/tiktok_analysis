package X;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: renamed from: X.19dF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C21582319dF {
    public final RectF LIZ = new RectF();
    public final Paint LIZIZ;
    public final Paint LIZJ;
    public final Paint LIZLLL;
    public float LJ;
    public float LJFF;
    public float LJI;
    public float LJII;
    public int[] LJIIIIZZ;
    public int LJIIIZ;
    public float LJIIJ;
    public float LJIIJJI;
    public float LJIIL;
    public boolean LJIILIIL;
    public Path LJIILJJIL;
    public float LJIILL;
    public float LJIILLIIL;
    public int LJIIZILJ;
    public int LJIJ;
    public int LJIJI;
    public int LJIJJ;

    public C21582319dF() {
        Paint paint = new Paint();
        this.LIZIZ = paint;
        Paint paint2 = new Paint();
        this.LIZJ = paint2;
        Paint paint3 = new Paint();
        this.LIZLLL = paint3;
        this.LJ = 0.0f;
        this.LJFF = 0.0f;
        this.LJI = 0.0f;
        this.LJII = 5.0f;
        this.LJIILL = 1.0f;
        this.LJIJI = 255;
        paint.setStrokeCap(Paint.Cap.SQUARE);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setAntiAlias(true);
        paint3.setColor(0);
    }

    public final void LIZ(int i) {
        this.LJIIIZ = i;
        this.LJIJJ = this.LJIIIIZZ[i];
    }
}
