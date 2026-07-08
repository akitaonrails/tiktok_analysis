package X;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.ss.android.ugc.aweme.app.R$styleable;

/* JADX INFO: renamed from: X.19XP, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C19XP extends AbstractC20736416Ck<View> {
    public final View LLILLJJLI;
    public Drawable LLILLL;
    public Drawable LLILZ;
    public C19XV LLILZIL;

    public final void LJIIIIZZ() {
        Drawable drawable;
        if (this.LLILZIL == null || (drawable = this.LLILZ) == null) {
            return;
        }
        drawable.mutate();
        C19XV c19xv = this.LLILZIL;
        if (c19xv.LIZLLL) {
            C16GF.LJII(this.LLILZ, c19xv.LIZ);
        }
        C19XV c19xv2 = this.LLILZIL;
        if (c19xv2.LIZJ) {
            Drawable drawable2 = this.LLILZ;
            PorterDuff.Mode mode = c19xv2.LIZIZ;
            if (mode == null) {
                mode = PorterDuff.Mode.SRC_IN;
            }
            C16GF.LJIIIIZZ(drawable2, mode);
        }
    }

    @Override // X.AbstractC20736516Cl
    public final int[] LIZLLL() {
        return R$styleable.TintableBackgroundHelper;
    }

    public C19XP(View view) {
        super(view);
        this.LLILLJJLI = view;
    }

    @Override // X.AbstractC20736416Ck
    public final void LJFF(TypedArray typedArray) {
        ColorStateList colorStateList;
        if (typedArray.hasValue(R$styleable.TintableBackgroundHelper_backgroundTint)) {
            int resourceId = typedArray.getResourceId(R$styleable.TintableBackgroundHelper_backgroundTint, 0);
            if (resourceId == 0 || (colorStateList = C838410Wul.LIZIZ(resourceId, this.LLILLJJLI.getContext())) == null) {
                colorStateList = typedArray.getColorStateList(R$styleable.TintableBackgroundHelper_backgroundTint);
            }
            C14K9.LJIILLIIL(this.LLILLJJLI, colorStateList);
        } else {
            C14K9.LJIILLIIL(this.LLILLJJLI, null);
        }
        if (typedArray.hasValue(R$styleable.TintableBackgroundHelper_backgroundTintMode)) {
            C14K9.LJIIZILJ(this.LLILLJJLI, C418940Gbk.LIZ(typedArray.getInt(R$styleable.TintableBackgroundHelper_backgroundTintMode, -1), PorterDuff.Mode.SRC_IN));
        } else {
            C14K9.LJIIZILJ(this.LLILLJJLI, PorterDuff.Mode.SRC_IN);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIZ(android.graphics.drawable.Drawable r3) {
        /*
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.LLILLL
            if (r0 != r3) goto L5
            return
        L5:
            r2.LLILLL = r3
            android.graphics.drawable.Drawable r0 = r2.LLILZ
            r1 = 0
            if (r0 == 0) goto L13
            if (r0 == r3) goto L18
            android.graphics.drawable.Drawable r0 = r2.LLILZ
            r0.setCallback(r1)
        L13:
            if (r3 != 0) goto L18
            r2.LLILZ = r1
            return
        L18:
            r2.LLILZ = r3
            r2.LJIIIIZZ()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19XP.LJIIIZ(android.graphics.drawable.Drawable):void");
    }

    public final void LJIIJ(ColorStateList colorStateList) {
        if (this.LLILZIL == null) {
            this.LLILZIL = new C19XV();
        }
        C19XV c19xv = this.LLILZIL;
        c19xv.LIZ = colorStateList;
        c19xv.LIZLLL = true;
        LJIIIIZZ();
    }

    public final void LJIIJJI(PorterDuff.Mode mode) {
        if (this.LLILZIL == null) {
            this.LLILZIL = new C19XV();
        }
        C19XV c19xv = this.LLILZIL;
        c19xv.LIZIZ = mode;
        c19xv.LIZJ = true;
        LJIIIIZZ();
    }

    @Override // X.AbstractC20736416Ck
    public final void LJII(AttributeSet attributeSet, int i, int i2) {
        LJIIIZ(this.LLILLJJLI.getBackground());
        super.LJII(attributeSet, i, i2);
    }
}
