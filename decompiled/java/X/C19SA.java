package X;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;

/* JADX INFO: renamed from: X.19SA, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C19SA {
    public static final float LJIIIZ = (int) C497740JfY.LIZIZ(240.0f);
    public float LIZ;
    public Paint.Align LIZIZ = Paint.Align.CENTER;
    public final int LIZJ = 3;
    public C19QP LIZLLL = C19QO.LIZ(Paint.Align.CENTER);
    public final Paint LJ = new Paint();
    public final Paint LJFF;
    public final Paint LJI;
    public final Paint LJII;
    public int LJIIIIZZ;

    public C19SA() {
        new Paint().setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.LJFF = new Paint();
        this.LJI = new Paint();
        this.LJII = new Paint();
        this.LJIIIIZZ = 2;
    }

    public final void LIZ(Paint.Align align, int i) {
        this.LIZIZ = align;
        this.LIZLLL = C19QO.LIZ(align);
        this.LJFF.setTextAlign(this.LIZIZ);
        this.LJI.setTextAlign(this.LIZIZ);
        this.LJII.setTextAlign(this.LIZIZ);
        this.LJ.setTextAlign(this.LIZIZ);
    }
}
