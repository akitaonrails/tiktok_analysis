package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.ss.android.ugc.aweme.app.R$styleable;

/* JADX INFO: renamed from: X.16GG, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public class C16GG extends LinearLayoutCompat {
    public Drawable LLJJI;
    public final Rect LLJJIII;
    public final Rect LLJJIJI;
    public int LLJJIJIIJIL;
    public final boolean LLJJIJIL;
    public boolean LLJJJ;

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.LLJJI;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.LLJJI.setState(getDrawableState());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.LLJJI;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.LLJJI;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.LLJJIJIIJIL;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.LLJJI;
        if (drawable != null) {
            if (this.LLJJJ) {
                this.LLJJJ = false;
                Rect rect = this.LLJJIII;
                Rect rect2 = this.LLJJIJI;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.LLJJIJIL) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.LLJJIJIIJIL, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.LLJJI;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                this.LLJJI.setCallback(null);
                unscheduleDrawable(this.LLJJI);
            }
            this.LLJJI = drawable;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.LLJJIJIIJIL == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setForegroundGravity(int i) {
        if (this.LLJJIJIIJIL != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.LLJJIJIIJIL = i;
            if (i == 119 && this.LLJJI != null) {
                this.LLJJI.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.LLJJI) {
            return false;
        }
        return true;
    }

    public C16GG(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.View
    public final void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.LLJJI;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    public C16GG(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        this.LLJJIII = new Rect();
        this.LLJJIJI = new Rect();
        this.LLJJIJIIJIL = 119;
        this.LLJJIJIL = true;
        this.LLJJJ = false;
        TypedArray typedArrayLIZLLL = C19PG.LIZLLL(context, attributeSet, R$styleable.ForegroundLinearLayout, 0, 0, new int[0]);
        this.LLJJIJIIJIL = typedArrayLIZLLL.getInt(R$styleable.ForegroundLinearLayout_android_foregroundGravity, this.LLJJIJIIJIL);
        Drawable drawable = typedArrayLIZLLL.getDrawable(R$styleable.ForegroundLinearLayout_android_foreground);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.LLJJIJIL = typedArrayLIZLLL.getBoolean(R$styleable.ForegroundLinearLayout_foregroundInsidePadding, true);
        typedArrayLIZLLL.recycle();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.LLJJJ = true;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.LLJJJ = z | this.LLJJJ;
    }
}
