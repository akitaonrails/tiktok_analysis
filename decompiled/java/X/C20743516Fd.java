package X;

import Y.ARunnableS106S0100000_6;
import Y.ARunnableS6S0202000_20;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.StateSet;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: X.16Fd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20743516Fd extends C16GB implements InterfaceC20744716Fp {
    public boolean LLILLJJLI;
    public Drawable LLILLL;
    public ColorStateList LLILZ;
    public int LLILZIL;
    public ColorFilter LLILZLL;
    public PorterDuff.Mode LLIZ;
    public int LLIZLLLIL;
    public float LLJ;
    public float LLJI;
    public float LLJIJIL;
    public RectF LLJILJIL;
    public Paint LLJILJILJ;
    public Bitmap LLJILLL;
    public final C20743616Fe LLJJ;
    public final C20744616Fo<C20743516Fd> LLJJI;
    public float LLJJIII;
    public float LLJJIJI;
    public boolean LLJJIJIIJIL;
    public Paint LLJJIJIL;
    public boolean LLJJJ;
    public Drawable.ConstantState LLJJJIL;
    public final BPEAHandler LLJJJJ;
    public volatile boolean LLJJJJJIL;
    public volatile int LLJJJJLIIL;
    public int LLJJL;
    public int LLJJLIIIJLLLLLLLZ;
    public final ARunnableS106S0100000_6 LLJL;

    @Override // X.InterfaceC20744716Fp
    public final void LIZ() {
    }

    public final void LJFF() {
        if (this.LLIZLLLIL == 0) {
            this.LLJILJIL = null;
            return;
        }
        if (this.LLJILJIL == null) {
            this.LLJILJIL = new RectF();
        }
        this.LLJILJIL.set(getBounds());
        RectF rectF = this.LLJILJIL;
        float f = rectF.left;
        float f2 = this.LLJ;
        rectF.left = f + f2;
        float f3 = rectF.top;
        float f4 = this.LLJI;
        rectF.top = f3 + f4;
        rectF.right += f2;
        rectF.bottom += f4;
    }

    @Override // X.C16GB, android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        int i = this.LLJJLIIIJLLLLLLLZ;
        if (i != -1) {
            return i;
        }
        Drawable drawable = this.LL;
        return drawable != null ? drawable.getIntrinsicHeight() : super.getIntrinsicHeight();
    }

    @Override // X.C16GB, android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        int i = this.LLJJL;
        if (i != -1) {
            return i;
        }
        Drawable drawable = this.LL;
        return drawable != null ? drawable.getIntrinsicWidth() : super.getIntrinsicWidth();
    }

    @Override // X.C16GB, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList = this.LLILZ;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        C20743816Fg c20743816Fg = this.LLJJ.LLILLJJLI;
        return (c20743816Fg.LL == 1.0f && c20743816Fg.LLILLJJLI == 1.0f) ? false : true;
    }

    public final void LJII() {
        boolean z;
        int i;
        Rect bounds = getBounds();
        int iWidth = (int) (bounds.width() * this.LLJJIII);
        int iHeight = (int) (bounds.height() * this.LLJJIJI);
        C1119850fFP c1119850fFP = C011Z.LIZ;
        if (c1119850fFP.LJJI != null) {
            c1119850fFP.LJJI.getClass();
            z = true;
            i = bounds.left;
        } else {
            z = false;
            i = 0;
        }
        int iWidth2 = i + ((bounds.width() - iWidth) / 2);
        int iHeight2 = (z ? bounds.top : 0) + ((bounds.height() - iHeight) / 2);
        Drawable drawable = this.LL;
        if (drawable != null) {
            drawable.setBounds(iWidth2, iHeight2, iWidth + iWidth2, iHeight + iHeight2);
        }
        this.LLJILLL = null;
        this.LLJJJJLIIL = 0;
        invalidateSelf();
    }

    @Override // X.C16GB, android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return this.LLILLJJLI;
    }

    public C20743516Fd(Drawable drawable) {
        super(drawable);
        this.LLIZ = PorterDuff.Mode.SRC_IN;
        this.LLJJIII = 1.0f;
        this.LLJJIJI = 1.0f;
        this.LLJJL = -1;
        this.LLJJLIIIJLLLLLLLZ = -1;
        this.LLJL = new ARunnableS106S0100000_6(this, 251);
        this.LLJJ = new C20743616Fe(this);
        this.LLJJI = new C20744616Fo<>(this);
        this.LLJJJJ = new BPEAHandler(Looper.getMainLooper());
    }

    @Override // X.C16GB
    public final void LIZIZ(Drawable drawable) {
        if (C1119850fFP.LJJIFFI && (drawable instanceof BitmapDrawable) && this.LLJJJIL == null) {
            this.LLJJJIL = drawable.getConstantState();
        } else {
            if (drawable != null) {
            }
            this.LLJILLL = null;
            this.LLJJJJLIIL = 0;
            invalidateSelf();
            LJII();
            this.LLILZIL = 0;
            this.LLILZLL = null;
            LJI(getState());
            invalidateSelf();
        }
        super.LIZIZ(drawable.mutate());
        this.LLJILLL = null;
        this.LLJJJJLIIL = 0;
        invalidateSelf();
        LJII();
        this.LLILZIL = 0;
        this.LLILZLL = null;
        LJI(getState());
        invalidateSelf();
    }

    public final void LIZJ(Canvas canvas) {
        if (this.LLILLL != null) {
            C21537819Qq c21537819Qq = this.LLJJI.LL;
            if (c21537819Qq.LLJJJ) {
                C417440GYk.LIZ(c21537819Qq.LLJJJJ.width(), c21537819Qq.LLJJJJ.height(), canvas, null);
            }
            this.LLJJI.LL.getClass();
            this.LLILLL.draw(canvas);
            this.LLJJI.LL.LJI(canvas);
            C21537819Qq c21537819Qq2 = this.LLJJI.LL;
            if (c21537819Qq2.LLJJJ) {
                canvas.drawPath(c21537819Qq2.LLIZLLLIL, c21537819Qq2.LLJI);
                canvas.restore();
            }
        }
    }

    public final void LIZLLL(Drawable drawable) {
        if (this.LLILLL != null) {
            this.LLILLL.setCallback(null);
        }
        this.LLILLL = drawable;
        if (drawable != null) {
            this.LLILLL.setCallback(this);
        }
        Drawable drawable2 = this.LLILLL;
        if (drawable2 != null) {
            drawable2.setBounds(getBounds());
        }
        invalidateSelf();
    }

    public final void LJ(float f) {
        if (this.LLJJIII != f) {
            this.LLJJIII = f;
            LJII();
            invalidateSelf();
        }
    }

    public final boolean LJI(int[] iArr) {
        ColorStateList colorStateList = this.LLILZ;
        if (colorStateList != null && this.LLIZ != null) {
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState == this.LLILZIL) {
                return false;
            }
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(colorForState, this.LLIZ);
            this.LLILZLL = porterDuffColorFilter;
            setColorFilter(porterDuffColorFilter);
            this.LLILZIL = colorForState;
            return true;
        }
        clearColorFilter();
        this.LLILZIL = 0;
        this.LLILZLL = null;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00d9  */
    @Override // X.C16GB, android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void draw(android.graphics.Canvas r14) {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20743516Fd.draw(android.graphics.Canvas):void");
    }

    @Override // X.C16GB, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        C20744616Fo<C20743516Fd> c20744616Fo = this.LLJJI;
        int i = rect.left;
        int i2 = rect.top;
        int i3 = rect.right;
        int i4 = rect.bottom;
        C21537819Qq c21537819Qq = c20744616Fo.LL;
        c21537819Qq.LLJJJJ.set(i, i2, i3, i4);
        c21537819Qq.LJII();
        C21537919Qr c21537919Qr = c21537819Qq.LLJJJJJIL;
        if (c21537919Qr != null) {
            Rect rect2 = c21537919Qr.LLILZIL;
            if (rect2.left != i || rect2.top != i2 || rect2.right != i3 || rect2.bottom != i4) {
                rect2.set(i, i2, i3, i4);
                c21537919Qr.LIZ();
                InterfaceC21538219Qu interfaceC21538219Qu = c21537919Qr.LLILZLL;
                if (interfaceC21538219Qu != null) {
                    interfaceC21538219Qu.invalidate();
                }
            }
        }
        c21537819Qq.LLJJJIL.invalidate();
        LJFF();
        Drawable drawable = this.LLILLL;
        if (drawable != null) {
            drawable.setBounds(getBounds());
        }
        LJII();
        if (this.LLIZLLLIL != 0 && this.LLJIJIL > 0.0f) {
            int iWidth = rect.width();
            int iHeight = rect.height();
            if (this.LLJJJJLIIL != 1) {
                this.LLJJJJLIIL = 1;
                ((ExecutorService) C157H.LIZ.getValue()).execute(new ARunnableS6S0202000_20(C011Z.LIZ.LIZJ(), iWidth, iHeight, this, 4));
            }
        }
    }

    @Override // X.C16GB, android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        if (this.LLILLJJLI != z) {
            this.LLILLJJLI = z;
            invalidateSelf();
        }
    }

    @Override // X.C16GB, android.graphics.drawable.Drawable
    public final boolean setState(int[] iArr) {
        boolean z;
        boolean state = super.setState(iArr);
        Drawable drawable = this.LLILLL;
        boolean z2 = true;
        if (drawable != null && drawable.setState(iArr)) {
            z = true;
        } else {
            z = false;
        }
        boolean z3 = state | z;
        C20743616Fe c20743616Fe = this.LLJJ;
        c20743616Fe.getClass();
        boolean z4 = !StateSet.stateSetMatches(C20743616Fe.LLILZIL, iArr);
        boolean zStateSetMatches = StateSet.stateSetMatches(C20743616Fe.LLILZLL, iArr);
        if (z4 == c20743616Fe.LLILLL && zStateSetMatches == c20743616Fe.LLILZ) {
            z2 = false;
        } else {
            c20743616Fe.LLILLL = z4;
            c20743616Fe.LLILZ = zStateSetMatches;
        }
        return LJI(iArr) | z3 | z2;
    }

    @Override // X.C16GB, android.graphics.drawable.Drawable
    public final void setTint(int i) {
        super.setTint(i);
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // X.C16GB, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.LLILZ = colorStateList;
        if (LJI(getState())) {
            invalidateSelf();
        }
    }

    @Override // X.C16GB, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.LLIZ = mode;
        if (LJI(getState())) {
            invalidateSelf();
        }
    }
}
