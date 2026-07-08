package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: X.0kk3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1331050kk3 extends Drawable implements Drawable.Callback, InterfaceC1331140kkC, InterfaceC1331170kkF, InterfaceC722050STz {
    public static final Matrix LLILZ = new Matrix();
    public Drawable LL;
    public final C1330970kjv LLILLJJLI = new C1330970kjv();
    public InterfaceC1331140kkC LLILLL;

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        Drawable drawable = this.LL;
        return drawable == null ? super.getConstantState() : drawable.getConstantState();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.LL;
        return drawable == null ? super.getIntrinsicHeight() : drawable.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.LL;
        return drawable == null ? super.getIntrinsicWidth() : drawable.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.LL;
        if (drawable == null) {
            return 0;
        }
        return drawable.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.LL;
        if (drawable == null) {
            return false;
        }
        return drawable.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.LL;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // X.InterfaceC722050STz
    public final Drawable LIZ() {
        return this.LL;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        return this.LL;
    }

    public C1331050kk3(Drawable drawable) {
        this.LL = drawable;
        C1331180kkG.LIZJ(this.LL, this, this);
    }

    @Override // X.InterfaceC1331140kkC
    public final void LIZIZ(RectF rectF) {
        InterfaceC1331140kkC interfaceC1331140kkC = this.LLILLL;
        if (interfaceC1331140kkC != null) {
            interfaceC1331140kkC.LIZIZ(rectF);
        } else {
            rectF.set(getBounds());
        }
    }

    @Override // X.InterfaceC722050STz
    public final Drawable LIZJ(Drawable drawable) {
        return LJIILIIL(drawable);
    }

    public void LJFF(Matrix matrix) {
        LJIIL(matrix);
    }

    @Override // X.InterfaceC1331170kkF
    public final void LJIIIZ(InterfaceC1331140kkC interfaceC1331140kkC) {
        this.LLILLL = interfaceC1331140kkC;
    }

    public final void LJIIL(Matrix matrix) {
        InterfaceC1331140kkC interfaceC1331140kkC = this.LLILLL;
        if (interfaceC1331140kkC != null) {
            interfaceC1331140kkC.LJFF(matrix);
        } else {
            matrix.reset();
        }
    }

    public Drawable LJIILIIL(Drawable drawable) {
        Drawable drawable2 = this.LL;
        C1331180kkG.LIZJ(drawable2, null, null);
        C1331180kkG.LIZJ(drawable, null, null);
        C1330970kjv c1330970kjv = this.LLILLJJLI;
        if (drawable != null && c1330970kjv != null) {
            c1330970kjv.LIZ(drawable);
        }
        C1331180kkG.LIZ(drawable, this);
        C1331180kkG.LIZJ(drawable, this, this);
        this.LL = drawable;
        invalidateSelf();
        return drawable2;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.LL;
        if (drawable != null) {
            drawable.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Drawable drawable = this.LL;
        if (drawable == null) {
            return super.getPadding(rect);
        }
        return drawable.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.LL;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        Drawable drawable = this.LL;
        if (drawable == null) {
            return super.onLevelChange(i);
        }
        return drawable.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.LL;
        if (drawable == null) {
            return super.onStateChange(iArr);
        }
        return drawable.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.LLILLJJLI.LIZ = i;
        Drawable drawable = this.LL;
        if (drawable != null) {
            drawable.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        C1330970kjv c1330970kjv = this.LLILLJJLI;
        c1330970kjv.LIZJ = colorFilter;
        c1330970kjv.LIZIZ = true;
        Drawable drawable = this.LL;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z) {
        this.LLILLJJLI.LIZLLL = z ? 1 : 0;
        Drawable drawable = this.LL;
        if (drawable != null) {
            drawable.setDither(z);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setFilterBitmap(boolean z) {
        this.LLILLJJLI.LJ = z ? 1 : 0;
        Drawable drawable = this.LL;
        if (drawable != null) {
            drawable.setFilterBitmap(z);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float f, float f2) {
        Drawable drawable = this.LL;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        Drawable drawable = this.LL;
        if (drawable == null) {
            return visible;
        }
        return drawable.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }
}
