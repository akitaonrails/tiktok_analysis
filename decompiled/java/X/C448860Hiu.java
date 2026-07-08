package X;

import android.graphics.Paint;
import android.graphics.Typeface;

/* JADX INFO: renamed from: X.0Hiu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C448860Hiu {
    public static final float[] LJIJJLI = {2.0f, 1.5f, 1.17f, 1.0f, 0.83f, 0.67f};
    public final int LIZ;
    public final boolean LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final int LJFF;
    public final float LJI;
    public final float LJII;
    public final int LJIIIIZZ;
    public final int LJIIIZ;
    public final boolean LJIIJ;
    public final int LJIIJJI;
    public final int LJIIL;
    public final int LJIILIIL;
    public final int LJIILJJIL;
    public final int LJIILL;
    public final int LJIILLIIL;
    public final int LJIIZILJ;
    public final int LJIJ;
    public final boolean LJIJI;
    public final boolean LJIJJ;

    public C448860Hiu(C448870Hiv c448870Hiv) {
        this.LIZ = c448870Hiv.LIZ;
        this.LIZIZ = c448870Hiv.LIZIZ;
        this.LIZJ = c448870Hiv.LIZJ;
        this.LIZLLL = c448870Hiv.LIZLLL;
        this.LJ = c448870Hiv.LJ;
        this.LJFF = c448870Hiv.LJFF;
        this.LJI = c448870Hiv.LJI;
        this.LJII = c448870Hiv.LJII;
        this.LJIIIIZZ = c448870Hiv.LJIIIIZZ;
        this.LJIIIZ = c448870Hiv.LJIIIZ;
        this.LJIIJ = c448870Hiv.LJIIJ;
        this.LJIIJJI = c448870Hiv.LJIIJJI;
        this.LJIIL = c448870Hiv.LJIIL;
        this.LJIILIIL = c448870Hiv.LJIILIIL;
        this.LJIILJJIL = c448870Hiv.LJIILJJIL;
        this.LJIILL = c448870Hiv.LJIILL;
        this.LJIILLIIL = c448870Hiv.LJIILLIIL;
        this.LJIIZILJ = c448870Hiv.LJIIZILJ;
        this.LJIJ = c448870Hiv.LJIJ;
        this.LJIJI = c448870Hiv.LJIJI;
        this.LJIJJ = c448870Hiv.LJIJJ;
    }

    public final void LIZ(Paint paint) {
        int i = this.LJIIJJI;
        if (i != 0) {
            paint.setColor(i);
        }
        paint.setTypeface(Typeface.MONOSPACE);
        int i2 = this.LJIILL;
        if (i2 > 0) {
            paint.setTextSize(i2);
        } else {
            paint.setTextSize(paint.getTextSize() * 0.87f);
        }
    }

    public final void LIZIZ(Paint paint) {
        int i = this.LJIIJJI;
        if (i != 0) {
            paint.setColor(i);
        }
        paint.setTypeface(Typeface.MONOSPACE);
        int i2 = this.LJIILL;
        if (i2 > 0) {
            paint.setTextSize(i2);
        } else {
            paint.setTextSize(paint.getTextSize() * 0.87f);
        }
    }

    public final void LIZJ(Paint paint) {
        int color = this.LJFF;
        if (color == 0) {
            color = paint.getColor();
        }
        paint.setColor(color);
        int i = this.LJIIIIZZ;
        if (i != 0) {
            paint.setStrokeWidth(i);
        }
    }

    public final void LIZLLL(Paint paint) {
        int iLIZ = this.LJIIZILJ;
        if (iLIZ == 0) {
            iLIZ = AbstractC445040Hck.LIZ(paint.getColor(), 25);
        }
        paint.setColor(iLIZ);
        paint.setStyle(Paint.Style.FILL);
        int i = this.LJIJ;
        if (i >= 0) {
            paint.setStrokeWidth(i);
        }
    }
}
