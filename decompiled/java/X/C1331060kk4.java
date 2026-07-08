package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: X.0kk4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1331060kk4 extends Drawable implements Drawable.Callback, InterfaceC1331140kkC, InterfaceC1331170kkF {
    public InterfaceC1331140kkC LL;
    public final Drawable[] LLILLL;
    public final InterfaceC722050STz[] LLILZ;
    public final C1330970kjv LLILLJJLI = new C1330970kjv();
    public final Rect LLILZIL = new Rect();
    public boolean LLILZLL = false;
    public boolean LLIZ = false;
    public boolean LLIZLLLIL = false;

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        int i = 0;
        int iMax = -1;
        while (true) {
            Drawable[] drawableArr = this.LLILLL;
            if (i >= drawableArr.length) {
                break;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null) {
                iMax = Math.max(iMax, drawable.getIntrinsicHeight());
            }
            i++;
        }
        if (iMax > 0) {
            return iMax;
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        int i = 0;
        int iMax = -1;
        while (true) {
            Drawable[] drawableArr = this.LLILLL;
            if (i >= drawableArr.length) {
                break;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null) {
                iMax = Math.max(iMax, drawable.getIntrinsicWidth());
            }
            i++;
        }
        if (iMax > 0) {
            return iMax;
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.LLILLL;
            if (i >= drawableArr.length) {
                this.LLIZLLLIL = true;
                return this;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null) {
                drawable.mutate();
            }
            i++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        if (this.LLILLL.length == 0) {
            return -2;
        }
        int i = 1;
        int iResolveOpacity = -1;
        while (true) {
            Drawable[] drawableArr = this.LLILLL;
            if (i >= drawableArr.length) {
                return iResolveOpacity;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null) {
                iResolveOpacity = Drawable.resolveOpacity(iResolveOpacity, drawable.getOpacity());
            }
            i++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        if (!this.LLIZ) {
            this.LLILZLL = false;
            int i = 0;
            while (true) {
                Drawable[] drawableArr = this.LLILLL;
                boolean z = true;
                if (i >= drawableArr.length) {
                    break;
                }
                Drawable drawable = drawableArr[i];
                boolean z2 = this.LLILZLL;
                if (drawable == null || !drawable.isStateful()) {
                    z = false;
                }
                this.LLILZLL = z2 | z;
                i++;
            }
            this.LLIZ = true;
        }
        return this.LLILZLL;
    }

    public C1331060kk4(Drawable[] drawableArr) {
        int i = 0;
        this.LLILLL = drawableArr;
        while (true) {
            Drawable[] drawableArr2 = this.LLILLL;
            if (i < drawableArr2.length) {
                C1331180kkG.LIZJ(drawableArr2[i], this, this);
                i++;
            } else {
                this.LLILZ = new InterfaceC722050STz[drawableArr2.length];
                return;
            }
        }
    }

    public final Drawable LIZ(int i) {
        boolean z;
        boolean z2 = true;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        C1322350kW1.LIZIZ(z);
        if (i >= this.LLILLL.length) {
            z2 = false;
        }
        C1322350kW1.LIZIZ(z2);
        return this.LLILLL[i];
    }

    @Override // X.InterfaceC1331140kkC
    public final void LIZIZ(RectF rectF) {
        InterfaceC1331140kkC interfaceC1331140kkC = this.LL;
        if (interfaceC1331140kkC != null) {
            interfaceC1331140kkC.LIZIZ(rectF);
        } else {
            rectF.set(getBounds());
        }
    }

    @Override // X.InterfaceC1331140kkC
    public final void LJFF(Matrix matrix) {
        InterfaceC1331140kkC interfaceC1331140kkC = this.LL;
        if (interfaceC1331140kkC != null) {
            interfaceC1331140kkC.LJFF(matrix);
        } else {
            matrix.reset();
        }
    }

    @Override // X.InterfaceC1331170kkF
    public final void LJIIIZ(InterfaceC1331140kkC interfaceC1331140kkC) {
        this.LL = interfaceC1331140kkC;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.LLILLL;
            if (i < drawableArr.length) {
                Drawable drawable = drawableArr[i];
                if (drawable != null) {
                    drawable.draw(canvas);
                }
                i++;
            } else {
                return;
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        int i = 0;
        rect.left = 0;
        rect.top = 0;
        rect.right = 0;
        rect.bottom = 0;
        Rect rect2 = this.LLILZIL;
        while (true) {
            Drawable[] drawableArr = this.LLILLL;
            if (i < drawableArr.length) {
                Drawable drawable = drawableArr[i];
                if (drawable != null) {
                    drawable.getPadding(rect2);
                    rect.left = Math.max(rect.left, rect2.left);
                    rect.top = Math.max(rect.top, rect2.top);
                    rect.right = Math.max(rect.right, rect2.right);
                    rect.bottom = Math.max(rect.bottom, rect2.bottom);
                }
                i++;
            } else {
                return true;
            }
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.LLILLL;
            if (i < drawableArr.length) {
                Drawable drawable = drawableArr[i];
                if (drawable != null) {
                    drawable.setBounds(rect);
                }
                i++;
            } else {
                return;
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        int i2 = 0;
        boolean z = false;
        while (true) {
            Drawable[] drawableArr = this.LLILLL;
            if (i2 < drawableArr.length) {
                Drawable drawable = drawableArr[i2];
                if (drawable != null && drawable.setLevel(i)) {
                    z = true;
                }
                i2++;
            } else {
                return z;
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        int i = 0;
        boolean z = false;
        while (true) {
            Drawable[] drawableArr = this.LLILLL;
            if (i < drawableArr.length) {
                Drawable drawable = drawableArr[i];
                if (drawable != null && drawable.setState(iArr)) {
                    z = true;
                }
                i++;
            } else {
                return z;
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.LLILLJJLI.LIZ = i;
        int i2 = 0;
        while (true) {
            Drawable[] drawableArr = this.LLILLL;
            if (i2 < drawableArr.length) {
                Drawable drawable = drawableArr[i2];
                if (drawable != null) {
                    drawable.setAlpha(i);
                }
                i2++;
            } else {
                return;
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        C1330970kjv c1330970kjv = this.LLILLJJLI;
        c1330970kjv.LIZJ = colorFilter;
        c1330970kjv.LIZIZ = true;
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.LLILLL;
            if (i < drawableArr.length) {
                Drawable drawable = drawableArr[i];
                if (drawable != null) {
                    drawable.setColorFilter(colorFilter);
                }
                i++;
            } else {
                return;
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z) {
        this.LLILLJJLI.LIZLLL = z ? 1 : 0;
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.LLILLL;
            if (i < drawableArr.length) {
                Drawable drawable = drawableArr[i];
                if (drawable != null) {
                    drawable.setDither(z);
                }
                i++;
            } else {
                return;
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setFilterBitmap(boolean z) {
        this.LLILLJJLI.LJ = z ? 1 : 0;
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.LLILLL;
            if (i < drawableArr.length) {
                Drawable drawable = drawableArr[i];
                if (drawable != null) {
                    drawable.setFilterBitmap(z);
                }
                i++;
            } else {
                return;
            }
        }
    }

    public final Drawable LIZJ(Drawable drawable, int i) {
        boolean z;
        boolean z2 = true;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        C1322350kW1.LIZIZ(z);
        if (i >= this.LLILLL.length) {
            z2 = false;
        }
        C1322350kW1.LIZIZ(z2);
        Drawable drawable2 = this.LLILLL[i];
        if (drawable != drawable2) {
            if (drawable != null && this.LLIZLLLIL) {
                drawable.mutate();
            }
            C1331180kkG.LIZJ(this.LLILLL[i], null, null);
            C1331180kkG.LIZJ(drawable, null, null);
            C1330970kjv c1330970kjv = this.LLILLJJLI;
            if (drawable != null && c1330970kjv != null) {
                c1330970kjv.LIZ(drawable);
            }
            C1331180kkG.LIZ(drawable, this);
            C1331180kkG.LIZJ(drawable, this, this);
            this.LLIZ = false;
            this.LLILLL[i] = drawable;
            invalidateSelf();
        }
        return drawable2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float f, float f2) {
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.LLILLL;
            if (i < drawableArr.length) {
                Drawable drawable = drawableArr[i];
                if (drawable != null) {
                    drawable.setHotspot(f, f2);
                }
                i++;
            } else {
                return;
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.LLILLL;
            if (i < drawableArr.length) {
                Drawable drawable = drawableArr[i];
                if (drawable != null) {
                    drawable.setVisible(z, z2);
                }
                i++;
            } else {
                return visible;
            }
        }
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
