package X;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableWrapper;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.19S1, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C19S1 {
    public final C19S0 LIZ;
    public C19RX LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public int LJ;
    public int LJFF;
    public int LJI;
    public int LJII;
    public PorterDuff.Mode LJIIIIZZ;
    public ColorStateList LJIIIZ;
    public ColorStateList LJIIJ;
    public ColorStateList LJIIJJI;
    public C21538919Rb LJIIL;
    public boolean LJIILIIL;
    public boolean LJIILJJIL;
    public boolean LJIILL;
    public boolean LJIILLIIL;
    public LayerDrawable LJIIZILJ;
    public int LJIJ;

    public final void LJFF() {
        C21538919Rb c21538919RbLIZIZ = LIZIZ(false);
        C21538919Rb c21538919RbLIZIZ2 = LIZIZ(true);
        if (c21538919RbLIZIZ != null) {
            float f = this.LJII;
            ColorStateList colorStateList = this.LJIIJ;
            c21538919RbLIZIZ.LL.LJIIJ = f;
            c21538919RbLIZIZ.invalidateSelf();
            C21539019Rc c21539019Rc = c21538919RbLIZIZ.LL;
            if (c21539019Rc.LIZLLL != colorStateList) {
                c21539019Rc.LIZLLL = colorStateList;
                c21538919RbLIZIZ.onStateChange(c21538919RbLIZIZ.getState());
            }
            if (c21538919RbLIZIZ2 != null) {
                float f2 = this.LJII;
                int iLIZIZ = this.LJIILIIL ? C19PM.LIZIZ(R.attr.bix, this.LIZ) : 0;
                c21538919RbLIZIZ2.LL.LJIIJ = f2;
                c21538919RbLIZIZ2.invalidateSelf();
                ColorStateList colorStateListValueOf = ColorStateList.valueOf(iLIZIZ);
                C21539019Rc c21539019Rc2 = c21538919RbLIZIZ2.LL;
                if (c21539019Rc2.LIZLLL != colorStateListValueOf) {
                    c21539019Rc2.LIZLLL = colorStateListValueOf;
                    c21538919RbLIZIZ2.onStateChange(c21538919RbLIZIZ2.getState());
                }
            }
        }
    }

    public final C19S4 LIZ() {
        LayerDrawable layerDrawable = this.LJIIZILJ;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return this.LJIIZILJ.getNumberOfLayers() > 2 ? (C19S4) this.LJIIZILJ.getDrawable(2) : (C19S4) this.LJIIZILJ.getDrawable(1);
    }

    public final void LJ() {
        C19S0 c19s0 = this.LIZ;
        C21538919Rb c21538919Rb = new C21538919Rb(this.LIZIZ);
        c21538919Rb.LJIIIIZZ(this.LIZ.getContext());
        C16GF.LJII(c21538919Rb, this.LJIIIZ);
        PorterDuff.Mode mode = this.LJIIIIZZ;
        if (mode != null) {
            C16GF.LJIIIIZZ(c21538919Rb, mode);
        }
        float f = this.LJII;
        ColorStateList colorStateList = this.LJIIJ;
        c21538919Rb.LL.LJIIJ = f;
        c21538919Rb.invalidateSelf();
        C21539019Rc c21539019Rc = c21538919Rb.LL;
        if (c21539019Rc.LIZLLL != colorStateList) {
            c21539019Rc.LIZLLL = colorStateList;
            c21538919Rb.onStateChange(c21538919Rb.getState());
        }
        C21538919Rb c21538919Rb2 = new C21538919Rb(this.LIZIZ);
        c21538919Rb2.setTint(0);
        float f2 = this.LJII;
        int iLIZIZ = this.LJIILIIL ? C19PM.LIZIZ(R.attr.bix, this.LIZ) : 0;
        c21538919Rb2.LL.LJIIJ = f2;
        c21538919Rb2.invalidateSelf();
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(iLIZIZ);
        C21539019Rc c21539019Rc2 = c21538919Rb2.LL;
        if (c21539019Rc2.LIZLLL != colorStateListValueOf) {
            c21539019Rc2.LIZLLL = colorStateListValueOf;
            c21538919Rb2.onStateChange(c21538919Rb2.getState());
        }
        C21538919Rb c21538919Rb3 = new C21538919Rb(this.LIZIZ);
        this.LJIIL = c21538919Rb3;
        C16GF.LJI(c21538919Rb3, -1);
        RippleDrawable rippleDrawable = new RippleDrawable(C19Q7.LIZJ(this.LJIIJJI), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{c21538919Rb2, c21538919Rb}), this.LIZJ, this.LJ, this.LIZLLL, this.LJFF), this.LJIIL);
        this.LJIIZILJ = rippleDrawable;
        c19s0.setInternalBackground(rippleDrawable);
        C21538919Rb c21538919RbLIZIZ = LIZIZ(false);
        if (c21538919RbLIZIZ != null) {
            c21538919RbLIZIZ.LJIIJ(this.LJIJ);
        }
    }

    public final C21538919Rb LIZIZ(boolean z) {
        LayerDrawable layerDrawable = this.LJIIZILJ;
        if (layerDrawable != null && layerDrawable.getNumberOfLayers() > 0) {
            return (C21538919Rb) ((LayerDrawable) ((DrawableWrapper) this.LJIIZILJ.getDrawable(0)).getDrawable()).getDrawable(!z ? 1 : 0);
        }
        return null;
    }

    public final void LIZJ(C19RX c19rx) {
        this.LIZIZ = c19rx;
        if (LIZIZ(false) != null) {
            LIZIZ(false).setShapeAppearanceModel(c19rx);
        }
        if (LIZIZ(true) != null) {
            LIZIZ(true).setShapeAppearanceModel(c19rx);
        }
        if (LIZ() != null) {
            LIZ().setShapeAppearanceModel(c19rx);
        }
    }

    public C19S1(C19S0 c19s0, C19RX c19rx) {
        this.LIZ = c19s0;
        this.LIZIZ = c19rx;
    }

    public final void LIZLLL(int i, int i2) {
        int paddingStart = this.LIZ.getPaddingStart();
        int paddingTop = this.LIZ.getPaddingTop();
        int paddingEnd = this.LIZ.getPaddingEnd();
        int paddingBottom = this.LIZ.getPaddingBottom();
        int i3 = this.LJ;
        int i4 = this.LJFF;
        this.LJFF = i2;
        this.LJ = i;
        if (!this.LJIILJJIL) {
            LJ();
        }
        this.LIZ.setPaddingRelative(paddingStart, (paddingTop + i) - i3, paddingEnd, (paddingBottom + i2) - i4);
    }
}
