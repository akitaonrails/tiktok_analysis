package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;

/* JADX INFO: renamed from: X.19XS, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public class C19XS extends C1091790eW9 {
    public C19XP LLILLL;

    public ColorStateList getSupportBackgroundTintList() {
        C19XV c19xv;
        C19XP c19xp = this.LLILLL;
        if (c19xp == null || (c19xv = c19xp.LLILZIL) == null) {
            return null;
        }
        return c19xv.LIZ;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C19XV c19xv;
        C19XP c19xp = this.LLILLL;
        if (c19xp == null || (c19xv = c19xp.LLILZIL) == null) {
            return null;
        }
        return c19xv.LIZIZ;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C19XP c19xp = this.LLILLL;
        if (c19xp != null) {
            c19xp.LJIIIIZZ();
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C19XP c19xp = this.LLILLL;
        if (c19xp != null) {
            c19xp.LJIIIZ(drawable);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C19XP c19xp = this.LLILLL;
        if (c19xp != null) {
            c19xp.LJIIJ(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C19XP c19xp = this.LLILLL;
        if (c19xp != null) {
            c19xp.LJIIJJI(mode);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        C19XP c19xp = this.LLILLL;
        if ((c19xp != null && c19xp.LLILZ == drawable) || super.verifyDrawable(drawable)) {
            return true;
        }
        return false;
    }

    public C19XS(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C19XP c19xp = new C19XP(this);
        this.LLILLL = c19xp;
        c19xp.LJII(attributeSet, 0, 0);
    }

    public C19XS(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C19XP c19xp = new C19XP(this);
        this.LLILLL = c19xp;
        c19xp.LJII(attributeSet, i, 0);
    }
}
