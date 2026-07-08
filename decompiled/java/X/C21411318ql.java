package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.app.R$styleable;
import u4.q0;

/* JADX INFO: renamed from: X.18ql, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21411318ql {
    public final View LIZ;
    public C14MH LIZLLL;
    public C14MH LJ;
    public C14MH LJFF;
    public int LIZJ = -1;
    public final C14MG LIZIZ = C14MG.LIZ();

    public final void LJ() {
        this.LIZJ = -1;
        LJI(null);
        LIZ();
    }

    public final void LIZ() {
        Drawable background = this.LIZ.getBackground();
        if (background != null) {
            if (this.LIZLLL != null) {
                if (this.LJFF == null) {
                    this.LJFF = new C14MH();
                }
                C14MH c14mh = this.LJFF;
                c14mh.LIZ = null;
                c14mh.LIZLLL = false;
                c14mh.LIZIZ = null;
                c14mh.LIZJ = false;
                ColorStateList colorStateListLJI = C14K9.LJI(this.LIZ);
                if (colorStateListLJI != null) {
                    c14mh.LIZLLL = true;
                    c14mh.LIZ = colorStateListLJI;
                }
                PorterDuff.Mode modeLJII = C14K9.LJII(this.LIZ);
                if (modeLJII != null) {
                    c14mh.LIZJ = true;
                    c14mh.LIZIZ = modeLJII;
                }
                if (c14mh.LIZLLL || c14mh.LIZJ) {
                    C14MG.LJ(background, c14mh, this.LIZ.getDrawableState());
                    return;
                }
            }
            C14MH c14mh2 = this.LJ;
            if (c14mh2 != null) {
                C14MG.LJ(background, c14mh2, this.LIZ.getDrawableState());
                return;
            }
            C14MH c14mh3 = this.LIZLLL;
            if (c14mh3 != null) {
                C14MG.LJ(background, c14mh3, this.LIZ.getDrawableState());
            }
        }
    }

    public final ColorStateList LIZIZ() {
        C14MH c14mh = this.LJ;
        if (c14mh != null) {
            return c14mh.LIZ;
        }
        return null;
    }

    public final PorterDuff.Mode LIZJ() {
        C14MH c14mh = this.LJ;
        if (c14mh != null) {
            return c14mh.LIZIZ;
        }
        return null;
    }

    public C21411318ql(View view) {
        this.LIZ = view;
    }

    public final void LJFF(int i) {
        ColorStateList colorStateListLJIIIIZZ;
        this.LIZJ = i;
        C14MG c14mg = this.LIZIZ;
        if (c14mg != null) {
            Context context = this.LIZ.getContext();
            synchronized (c14mg) {
                colorStateListLJIIIIZZ = c14mg.LIZ.LJIIIIZZ(i, context);
            }
        } else {
            colorStateListLJIIIIZZ = null;
        }
        LJI(colorStateListLJIIIIZZ);
        LIZ();
    }

    public final void LJI(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.LIZLLL == null) {
                this.LIZLLL = new C14MH();
            }
            C14MH c14mh = this.LIZLLL;
            c14mh.LIZ = colorStateList;
            c14mh.LIZLLL = true;
        } else {
            this.LIZLLL = null;
        }
        LIZ();
    }

    public final void LJII(ColorStateList colorStateList) {
        if (this.LJ == null) {
            this.LJ = new C14MH();
        }
        C14MH c14mh = this.LJ;
        c14mh.LIZ = colorStateList;
        c14mh.LIZLLL = true;
        LIZ();
    }

    public final void LJIIIIZZ(PorterDuff.Mode mode) {
        if (this.LJ == null) {
            this.LJ = new C14MH();
        }
        C14MH c14mh = this.LJ;
        c14mh.LIZIZ = mode;
        c14mh.LIZJ = true;
        LIZ();
    }

    public final void LIZLLL(AttributeSet attributeSet, int i) {
        ColorStateList colorStateListLJIIIIZZ;
        Context context = this.LIZ.getContext();
        int[] iArr = R$styleable.ViewBackgroundHelper;
        C21411918qr c21411918qrLJIILIIL = C21411918qr.LJIILIIL(context, attributeSet, iArr, i, 0);
        View view = this.LIZ;
        q0.LJIIZILJ(view, view.getContext(), iArr, attributeSet, c21411918qrLJIILIIL.LIZIZ, i);
        try {
            if (c21411918qrLJIILIIL.LJIIJJI(R$styleable.ViewBackgroundHelper_android_background)) {
                this.LIZJ = c21411918qrLJIILIIL.LJIIIIZZ(R$styleable.ViewBackgroundHelper_android_background, -1);
                C14MG c14mg = this.LIZIZ;
                Context context2 = this.LIZ.getContext();
                int i2 = this.LIZJ;
                synchronized (c14mg) {
                    colorStateListLJIIIIZZ = c14mg.LIZ.LJIIIIZZ(i2, context2);
                }
                if (colorStateListLJIIIIZZ != null) {
                    LJI(colorStateListLJIIIIZZ);
                }
            }
            if (c21411918qrLJIILIIL.LJIIJJI(R$styleable.ViewBackgroundHelper_backgroundTint)) {
                C14K9.LJIILLIIL(this.LIZ, c21411918qrLJIILIIL.LIZIZ(R$styleable.ViewBackgroundHelper_backgroundTint));
            }
            if (c21411918qrLJIILIIL.LJIIJJI(R$styleable.ViewBackgroundHelper_backgroundTintMode)) {
                C14K9.LJIIZILJ(this.LIZ, C14SQ.LIZJ(c21411918qrLJIILIIL.LJII(R$styleable.ViewBackgroundHelper_backgroundTintMode, -1), null));
            }
            c21411918qrLJIILIIL.LJIILJJIL();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c21411918qrLJIILIIL.LJIILJJIL();
            throw th;
        }
    }
}
