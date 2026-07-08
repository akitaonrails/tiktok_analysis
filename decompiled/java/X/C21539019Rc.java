package X;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: X.19Rc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21539019Rc extends Drawable.ConstantState {
    public C19RX LIZ;
    public C19Q8 LIZIZ;
    public ColorStateList LIZJ;
    public ColorStateList LIZLLL;
    public final ColorStateList LJ;
    public ColorStateList LJFF;
    public PorterDuff.Mode LJI;
    public Rect LJII;
    public final float LJIIIIZZ;
    public float LJIIIZ;
    public float LJIIJ;
    public int LJIIJJI;
    public float LJIIL;
    public float LJIILIIL;
    public final float LJIILJJIL;
    public int LJIILL;
    public int LJIILLIIL;
    public int LJIIZILJ;
    public int LJIJ;
    public boolean LJIJI;
    public Paint.Style LJIJJ;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        C21538919Rb c21538919Rb = new C21538919Rb(this);
        c21538919Rb.LLILZIL = true;
        return c21538919Rb;
    }

    public C21539019Rc(C21539019Rc c21539019Rc) {
        this.LJI = PorterDuff.Mode.SRC_IN;
        this.LJIIIIZZ = 1.0f;
        this.LJIIIZ = 1.0f;
        this.LJIIJJI = 255;
        this.LJIJJ = Paint.Style.FILL_AND_STROKE;
        this.LIZ = c21539019Rc.LIZ;
        this.LIZIZ = c21539019Rc.LIZIZ;
        this.LJIIJ = c21539019Rc.LJIIJ;
        this.LIZJ = c21539019Rc.LIZJ;
        this.LIZLLL = c21539019Rc.LIZLLL;
        this.LJI = c21539019Rc.LJI;
        this.LJFF = c21539019Rc.LJFF;
        this.LJIIJJI = c21539019Rc.LJIIJJI;
        this.LJIIIIZZ = c21539019Rc.LJIIIIZZ;
        this.LJIIZILJ = c21539019Rc.LJIIZILJ;
        this.LJIILL = c21539019Rc.LJIILL;
        this.LJIJI = c21539019Rc.LJIJI;
        this.LJIIIZ = c21539019Rc.LJIIIZ;
        this.LJIIL = c21539019Rc.LJIIL;
        this.LJIILIIL = c21539019Rc.LJIILIIL;
        this.LJIILJJIL = c21539019Rc.LJIILJJIL;
        this.LJIILLIIL = c21539019Rc.LJIILLIIL;
        this.LJIJ = c21539019Rc.LJIJ;
        this.LJ = c21539019Rc.LJ;
        this.LJIJJ = c21539019Rc.LJIJJ;
        if (c21539019Rc.LJII != null) {
            this.LJII = new Rect(c21539019Rc.LJII);
        }
    }

    public C21539019Rc(C19RX c19rx) {
        this.LJI = PorterDuff.Mode.SRC_IN;
        this.LJIIIIZZ = 1.0f;
        this.LJIIIZ = 1.0f;
        this.LJIIJJI = 255;
        this.LJIJJ = Paint.Style.FILL_AND_STROKE;
        this.LIZ = c19rx;
        this.LIZIZ = null;
    }
}
