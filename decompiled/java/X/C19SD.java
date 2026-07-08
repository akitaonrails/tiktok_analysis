package X;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextUtils;
import android.util.AttributeSet;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* JADX INFO: renamed from: X.19SD, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C19SD extends C21538919Rb implements Drawable.Callback, C19QF {
    public static final int[] LLLLZIL = {R.attr.state_enabled};
    public static final ShapeDrawable LLLLZLL = new ShapeDrawable(new OvalShape());
    public ColorStateList LLJJJJJIL;
    public ColorStateList LLJJJJLIIL;
    public float LLJJL;
    public float LLJJLIIIJLLLLLLLZ;
    public ColorStateList LLJL;
    public float LLJLIL;
    public ColorStateList LLJLILLLLZIIL;
    public CharSequence LLJLL;
    public boolean LLJLLIL;
    public Drawable LLJLLL;
    public ColorStateList LLJZ;
    public float LLJZIJLIL;
    public boolean LLL;
    public boolean LLLF;
    public Drawable LLLFF;
    public Drawable LLLFFI;
    public ColorStateList LLLFZ;
    public float LLLI;
    public CharSequence LLLII;
    public boolean LLLIIII;
    public boolean LLLIIIIL;
    public Drawable LLLIIIL;
    public ColorStateList LLLIIL;
    public C194T LLLIILIL;
    public C194T LLLIL;
    public float LLLILZ;
    public float LLLILZJ;
    public float LLLILZLLLI;
    public float LLLIZZ;
    public float LLLJ;
    public float LLLJIL;
    public float LLLJL;
    public float LLLL;
    public final Context LLLLII;
    public final Paint LLLLIIIILLL;
    public final Paint.FontMetrics LLLLIIL;
    public final RectF LLLLIILL;
    public final PointF LLLLIILLL;
    public final Path LLLLIL;
    public final C19QD LLLLILI;
    public int LLLLJ;
    public int LLLLJI;
    public int LLLLL;
    public int LLLLLIL;
    public int LLLLLILLIL;
    public int LLLLLJIL;
    public boolean LLLLLJLJLL;
    public int LLLLLL;
    public int LLLLLLIL;
    public ColorFilter LLLLLLJ;
    public PorterDuffColorFilter LLLLLLL;
    public ColorStateList LLLLLLLLL;
    public PorterDuff.Mode LLLLLLLLLL;
    public int[] LLLLLLLZIL;
    public boolean LLLLLLZ;
    public ColorStateList LLLLLLZZ;
    public WeakReference<C19SJ> LLLLLZ;
    public TextUtils.TruncateAt LLLLLZIL;
    public boolean LLLLLZL;
    public int LLLLZ;
    public boolean LLLLZI;

    @Override // X.C21538919Rb, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public final float LJJI() {
        return this.LLLLZI ? LJII() : this.LLJJLIIIJLLLLLLLZ;
    }

    public final void LJJIII() {
        C19SJ c19sj = this.LLLLLZ.get();
        if (c19sj != null) {
            c19sj.LIZ();
        }
    }

    public final boolean LJJJJLI() {
        return this.LLLIIIIL && this.LLLIIIL != null && this.LLLLLJLJLL;
    }

    public final boolean LJJJJLL() {
        return this.LLJLLIL && this.LLJLLL != null;
    }

    public final boolean LJJJJZ() {
        return this.LLLF && this.LLLFF != null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.LLJJL;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.min(Math.round(this.LLLILZ + LJIL() + this.LLLIZZ + this.LLLLILI.LIZ(this.LLJLL.toString()) + this.LLLJ + LJJ() + this.LLLL), this.LLLLZ);
    }

    @Override // X.C21538919Rb, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        C19Q9 c19q9;
        ColorStateList colorStateList;
        return LJJIFFI(this.LLJJJJJIL) || LJJIFFI(this.LLJJJJLIIL) || LJJIFFI(this.LLJL) || (this.LLLLLLZ && LJJIFFI(this.LLLLLLZZ)) || (!((c19q9 = this.LLLLILI.LJFF) == null || (colorStateList = c19q9.LIZ) == null || !colorStateList.isStateful()) || ((this.LLLIIIIL && this.LLLIIIL != null && this.LLLIIII) || LJJII(this.LLJLLL) || LJJII(this.LLLIIIL) || LJJIFFI(this.LLLLLLLLL)));
    }

    @Override // X.C19QF
    public final void LIZ() {
        LJJIII();
        invalidateSelf();
    }

    public final float LJIL() {
        if (!LJJJJLL() && !LJJJJLI()) {
            return 0.0f;
        }
        float f = this.LLLILZJ;
        Drawable drawable = this.LLLLLJLJLL ? this.LLLIIIL : this.LLJLLL;
        float intrinsicWidth = this.LLJZIJLIL;
        if (intrinsicWidth <= 0.0f && drawable != null) {
            intrinsicWidth = drawable.getIntrinsicWidth();
        }
        return f + intrinsicWidth + this.LLLILZLLLI;
    }

    public final float LJJ() {
        if (LJJJJZ()) {
            return this.LLLJIL + this.LLLI + this.LLLJL;
        }
        return 0.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.LLLLLLIL;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.LLLLLLJ;
    }

    public static boolean LJJIFFI(ColorStateList colorStateList) {
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        return false;
    }

    public static boolean LJJII(Drawable drawable) {
        if (drawable != null && drawable.isStateful()) {
            return true;
        }
        return false;
    }

    public static void LJJJJZI(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public final void LJIJJ(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        C16G6.LIZIZ(drawable, C16G6.LIZ(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.LLLFF) {
            if (drawable.isStateful()) {
                drawable.setState(this.LLLLLLLZIL);
            }
            C16GF.LJII(drawable, this.LLLFZ);
            return;
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
        Drawable drawable2 = this.LLJLLL;
        if (drawable == drawable2 && this.LLL) {
            C16GF.LJII(drawable2, this.LLJZ);
        }
    }

    public final void LJJIIJZLJL(boolean z) {
        if (this.LLLIIII != z) {
            this.LLLIIII = z;
            float fLJIL = LJIL();
            if (!z && this.LLLLLJLJLL) {
                this.LLLLLJLJLL = false;
            }
            float fLJIL2 = LJIL();
            invalidateSelf();
            if (fLJIL != fLJIL2) {
                LJJIII();
            }
        }
    }

    public final void LJJIIZ(Drawable drawable) {
        if (this.LLLIIIL != drawable) {
            float fLJIL = LJIL();
            this.LLLIIIL = drawable;
            float fLJIL2 = LJIL();
            LJJJJZI(this.LLLIIIL);
            LJIJJ(this.LLLIIIL);
            invalidateSelf();
            if (fLJIL != fLJIL2) {
                LJJIII();
            }
        }
    }

    public final void LJJIIZI(ColorStateList colorStateList) {
        if (this.LLLIIL != colorStateList) {
            this.LLLIIL = colorStateList;
            if (this.LLLIIIIL && this.LLLIIIL != null && this.LLLIIII) {
                C16GF.LJII(this.LLLIIIL, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void LJJIJ(boolean z) {
        if (this.LLLIIIIL != z) {
            boolean zLJJJJLI = LJJJJLI();
            this.LLLIIIIL = z;
            boolean zLJJJJLI2 = LJJJJLI();
            if (zLJJJJLI != zLJJJJLI2) {
                if (zLJJJJLI2) {
                    LJIJJ(this.LLLIIIL);
                } else {
                    LJJJJZI(this.LLLIIIL);
                }
                invalidateSelf();
                LJJIII();
            }
        }
    }

    public final void LJJIJIIJI(float f) {
        if (this.LLJJLIIIJLLLLLLLZ != f) {
            this.LLJJLIIIJLLLLLLLZ = f;
            setShapeAppearanceModel(this.LL.LIZ.LJ(f));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [android.graphics.drawable.Drawable] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    public final void LJJIJIIJIL(Drawable drawable) {
        ?? LIZIZ;
        Object obj = this.LLJLLL;
        Drawable drawableMutate = null;
        if (obj != null) {
            boolean z = obj instanceof C14SS;
            LIZIZ = obj;
            if (z) {
                LIZIZ = ((C14SS) obj).LIZIZ();
            }
        } else {
            LIZIZ = 0;
        }
        if (LIZIZ != drawable) {
            float fLJIL = LJIL();
            if (drawable != null) {
                drawableMutate = drawable.mutate();
            }
            this.LLJLLL = drawableMutate;
            float fLJIL2 = LJIL();
            LJJJJZI(LIZIZ);
            if (LJJJJLL()) {
                LJIJJ(this.LLJLLL);
            }
            invalidateSelf();
            if (fLJIL != fLJIL2) {
                LJJIII();
            }
        }
    }

    public final void LJJIJIL(float f) {
        if (this.LLJZIJLIL != f) {
            float fLJIL = LJIL();
            this.LLJZIJLIL = f;
            float fLJIL2 = LJIL();
            invalidateSelf();
            if (fLJIL != fLJIL2) {
                LJJIII();
            }
        }
    }

    public final void LJJIJL(ColorStateList colorStateList) {
        this.LLL = true;
        if (this.LLJZ != colorStateList) {
            this.LLJZ = colorStateList;
            if (LJJJJLL()) {
                C16GF.LJII(this.LLJLLL, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void LJJIJLIJ(boolean z) {
        if (this.LLJLLIL != z) {
            boolean zLJJJJLL = LJJJJLL();
            this.LLJLLIL = z;
            boolean zLJJJJLL2 = LJJJJLL();
            if (zLJJJJLL != zLJJJJLL2) {
                if (zLJJJJLL2) {
                    LJIJJ(this.LLJLLL);
                } else {
                    LJJJJZI(this.LLJLLL);
                }
                invalidateSelf();
                LJJIII();
            }
        }
    }

    public final void LJJIL(ColorStateList colorStateList) {
        if (this.LLJL != colorStateList) {
            this.LLJL = colorStateList;
            if (this.LLLLZI) {
                C21539019Rc c21539019Rc = this.LL;
                if (c21539019Rc.LIZLLL != colorStateList) {
                    c21539019Rc.LIZLLL = colorStateList;
                    onStateChange(getState());
                }
            }
            onStateChange(getState());
        }
    }

    public final void LJJIZ(float f) {
        if (this.LLJLIL != f) {
            this.LLJLIL = f;
            this.LLLLIIIILLL.setStrokeWidth(f);
            if (this.LLLLZI) {
                this.LL.LJIIJ = f;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [android.graphics.drawable.Drawable] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    public final void LJJJ(Drawable drawable) {
        ?? LIZIZ;
        Object obj = this.LLLFF;
        Drawable drawableMutate = null;
        if (obj != null) {
            boolean z = obj instanceof C14SS;
            LIZIZ = obj;
            if (z) {
                LIZIZ = ((C14SS) obj).LIZIZ();
            }
        } else {
            LIZIZ = 0;
        }
        if (LIZIZ != drawable) {
            float fLJJ = LJJ();
            if (drawable != null) {
                drawableMutate = drawable.mutate();
            }
            this.LLLFF = drawableMutate;
            this.LLLFFI = new RippleDrawable(C19Q7.LIZJ(this.LLJLILLLLZIIL), this.LLLFF, LLLLZLL);
            float fLJJ2 = LJJ();
            LJJJJZI(LIZIZ);
            if (LJJJJZ()) {
                LJIJJ(this.LLLFF);
            }
            invalidateSelf();
            if (fLJJ != fLJJ2) {
                LJJIII();
            }
        }
    }

    public final void LJJJI(float f) {
        if (this.LLLJL != f) {
            this.LLLJL = f;
            invalidateSelf();
            if (LJJJJZ()) {
                LJJIII();
            }
        }
    }

    public final void LJJJIL(float f) {
        if (this.LLLI != f) {
            this.LLLI = f;
            invalidateSelf();
            if (LJJJJZ()) {
                LJJIII();
            }
        }
    }

    public final void LJJJJ(float f) {
        if (this.LLLJIL != f) {
            this.LLLJIL = f;
            invalidateSelf();
            if (LJJJJZ()) {
                LJJIII();
            }
        }
    }

    public final void LJJJJI(ColorStateList colorStateList) {
        if (this.LLLFZ != colorStateList) {
            this.LLLFZ = colorStateList;
            if (LJJJJZ()) {
                C16GF.LJII(this.LLLFF, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void LJJJJIZL(boolean z) {
        if (this.LLLF != z) {
            boolean zLJJJJZ = LJJJJZ();
            this.LLLF = z;
            boolean zLJJJJZ2 = LJJJJZ();
            if (zLJJJJZ != zLJJJJZ2) {
                if (zLJJJJZ2) {
                    LJIJJ(this.LLLFF);
                } else {
                    LJJJJZI(this.LLLFF);
                }
                invalidateSelf();
                LJJIII();
            }
        }
    }

    public final void LJJJJJ(float f) {
        if (this.LLLILZLLLI != f) {
            float fLJIL = LJIL();
            this.LLLILZLLLI = f;
            float fLJIL2 = LJIL();
            invalidateSelf();
            if (fLJIL != fLJIL2) {
                LJJIII();
            }
        }
    }

    public final void LJJJJJL(float f) {
        if (this.LLLILZJ != f) {
            float fLJIL = LJIL();
            this.LLLILZJ = f;
            float fLJIL2 = LJIL();
            invalidateSelf();
            if (fLJIL != fLJIL2) {
                LJJIII();
            }
        }
    }

    public final void LJJJJL(ColorStateList colorStateList) {
        ColorStateList colorStateListLIZJ;
        if (this.LLJLILLLLZIIL != colorStateList) {
            this.LLJLILLLLZIIL = colorStateList;
            if (this.LLLLLLZ) {
                colorStateListLIZJ = C19Q7.LIZJ(colorStateList);
            } else {
                colorStateListLIZJ = null;
            }
            this.LLLLLLZZ = colorStateListLIZJ;
            onStateChange(getState());
        }
    }

    @Override // X.C21538919Rb, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        int iSaveLayerAlpha;
        int i2;
        int i3;
        boolean z;
        int iSave;
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && (i = this.LLLLLLIL) != 0) {
            if (i < 255) {
                iSaveLayerAlpha = canvas.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, i);
            } else {
                iSaveLayerAlpha = 0;
            }
            if (!this.LLLLZI) {
                this.LLLLIIIILLL.setColor(this.LLLLJ);
                this.LLLLIIIILLL.setStyle(Paint.Style.FILL);
                this.LLLLIILL.set(bounds);
                canvas.drawRoundRect(this.LLLLIILL, LJJI(), LJJI(), this.LLLLIIIILLL);
            }
            if (!this.LLLLZI) {
                this.LLLLIIIILLL.setColor(this.LLLLJI);
                this.LLLLIIIILLL.setStyle(Paint.Style.FILL);
                Paint paint = this.LLLLIIIILLL;
                ColorFilter colorFilter = this.LLLLLLJ;
                if (colorFilter == null) {
                    colorFilter = this.LLLLLLL;
                }
                paint.setColorFilter(colorFilter);
                this.LLLLIILL.set(bounds);
                canvas.drawRoundRect(this.LLLLIILL, LJJI(), LJJI(), this.LLLLIIIILLL);
            }
            if (this.LLLLZI) {
                super.draw(canvas);
            }
            if (this.LLJLIL > 0.0f && !this.LLLLZI) {
                this.LLLLIIIILLL.setColor(this.LLLLLIL);
                this.LLLLIIIILLL.setStyle(Paint.Style.STROKE);
                if (!this.LLLLZI) {
                    Paint paint2 = this.LLLLIIIILLL;
                    ColorFilter colorFilter2 = this.LLLLLLJ;
                    if (colorFilter2 == null) {
                        colorFilter2 = this.LLLLLLL;
                    }
                    paint2.setColorFilter(colorFilter2);
                }
                RectF rectF = this.LLLLIILL;
                float f = bounds.left;
                float f2 = this.LLJLIL / 2.0f;
                rectF.set(f + f2, bounds.top + f2, bounds.right - f2, bounds.bottom - f2);
                float f3 = this.LLJJLIIIJLLLLLLLZ - (this.LLJLIL / 2.0f);
                canvas.drawRoundRect(this.LLLLIILL, f3, f3, this.LLLLIIIILLL);
            }
            this.LLLLIIIILLL.setColor(this.LLLLLILLIL);
            this.LLLLIIIILLL.setStyle(Paint.Style.FILL);
            this.LLLLIILL.set(bounds);
            if (!this.LLLLZI) {
                canvas.drawRoundRect(this.LLLLIILL, LJJI(), LJJI(), this.LLLLIIIILLL);
            } else {
                RectF rectF2 = new RectF(bounds);
                Path path = this.LLLLIL;
                C21540019Rm c21540019Rm = this.LLJJIJI;
                C21539019Rc c21539019Rc = this.LL;
                c21540019Rm.LIZ(c21539019Rc.LIZ, c21539019Rc.LJIIIZ, rectF2, this.LLJJIII, path);
                LJFF(canvas, this.LLLLIIIILLL, this.LLLLIL, this.LL.LIZ, LJI());
            }
            if (LJJJJLL()) {
                LJIJJLI(bounds, this.LLLLIILL);
                RectF rectF3 = this.LLLLIILL;
                float f4 = rectF3.left;
                float f5 = rectF3.top;
                canvas.translate(f4, f5);
                this.LLJLLL.setBounds(0, 0, (int) this.LLLLIILL.width(), (int) this.LLLLIILL.height());
                this.LLJLLL.draw(canvas);
                canvas.translate(-f4, -f5);
            }
            if (LJJJJLI()) {
                LJIJJLI(bounds, this.LLLLIILL);
                RectF rectF4 = this.LLLLIILL;
                float f6 = rectF4.left;
                float f7 = rectF4.top;
                canvas.translate(f6, f7);
                this.LLLIIIL.setBounds(0, 0, (int) this.LLLLIILL.width(), (int) this.LLLLIILL.height());
                this.LLLIIIL.draw(canvas);
                canvas.translate(-f6, -f7);
            }
            if (this.LLLLLZL && this.LLJLL != null) {
                PointF pointF = this.LLLLIILLL;
                pointF.set(0.0f, 0.0f);
                Paint.Align align = Paint.Align.LEFT;
                if (this.LLJLL != null) {
                    float fLJIL = this.LLLILZ + LJIL() + this.LLLIZZ;
                    if (C16G6.LIZ(this) == 0) {
                        pointF.x = bounds.left + fLJIL;
                        align = Paint.Align.LEFT;
                    } else {
                        pointF.x = bounds.right - fLJIL;
                        align = Paint.Align.RIGHT;
                    }
                    float fCenterY = bounds.centerY();
                    this.LLLLILI.LIZ.getFontMetrics(this.LLLLIIL);
                    Paint.FontMetrics fontMetrics = this.LLLLIIL;
                    pointF.y = fCenterY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
                }
                RectF rectF5 = this.LLLLIILL;
                rectF5.setEmpty();
                if (this.LLJLL != null) {
                    float fLJIL2 = this.LLLILZ + LJIL() + this.LLLIZZ;
                    float fLJJ = this.LLLL + LJJ() + this.LLLJ;
                    if (C16G6.LIZ(this) == 0) {
                        rectF5.left = bounds.left + fLJIL2;
                        rectF5.right = bounds.right - fLJJ;
                    } else {
                        rectF5.left = bounds.left + fLJJ;
                        rectF5.right = bounds.right - fLJIL2;
                    }
                    rectF5.top = bounds.top;
                    rectF5.bottom = bounds.bottom;
                }
                C19QD c19qd = this.LLLLILI;
                if (c19qd.LJFF != null) {
                    c19qd.LIZ.drawableState = getState();
                    C19QD c19qd2 = this.LLLLILI;
                    c19qd2.LJFF.LIZJ(this.LLLLII, c19qd2.LIZ, c19qd2.LIZIZ);
                }
                this.LLLLILI.LIZ.setTextAlign(align);
                if (Math.round(this.LLLLILI.LIZ(this.LLJLL.toString())) > Math.round(this.LLLLIILL.width())) {
                    z = true;
                    iSave = canvas.save();
                    canvas.clipRect(this.LLLLIILL);
                } else {
                    z = false;
                    iSave = 0;
                }
                CharSequence charSequenceEllipsize = this.LLJLL;
                if (z && this.LLLLLZIL != null) {
                    charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, this.LLLLILI.LIZ, this.LLLLIILL.width(), this.LLLLLZIL);
                }
                int length = charSequenceEllipsize.length();
                PointF pointF2 = this.LLLLIILLL;
                i2 = 0;
                i3 = 255;
                canvas.drawText(charSequenceEllipsize, 0, length, pointF2.x, pointF2.y, this.LLLLILI.LIZ);
                if (z) {
                    canvas.restoreToCount(iSave);
                }
            } else {
                i2 = 0;
                i3 = 255;
            }
            if (LJJJJZ()) {
                RectF rectF6 = this.LLLLIILL;
                rectF6.setEmpty();
                if (LJJJJZ()) {
                    float f8 = this.LLLL + this.LLLJL;
                    if (C16G6.LIZ(this) == 0) {
                        float f9 = bounds.right - f8;
                        rectF6.right = f9;
                        rectF6.left = f9 - this.LLLI;
                    } else {
                        float f10 = bounds.left + f8;
                        rectF6.left = f10;
                        rectF6.right = f10 + this.LLLI;
                    }
                    float fExactCenterY = bounds.exactCenterY();
                    float f11 = this.LLLI;
                    float f12 = fExactCenterY - (f11 / 2.0f);
                    rectF6.top = f12;
                    rectF6.bottom = f12 + f11;
                }
                RectF rectF7 = this.LLLLIILL;
                float f13 = rectF7.left;
                float f14 = rectF7.top;
                canvas.translate(f13, f14);
                this.LLLFF.setBounds(i2, i2, (int) this.LLLLIILL.width(), (int) this.LLLLIILL.height());
                this.LLLFFI.setBounds(this.LLLFF.getBounds());
                this.LLLFFI.jumpToCurrentState();
                this.LLLFFI.draw(canvas);
                canvas.translate(-f13, -f14);
            }
            if (this.LLLLLLIL < i3) {
                canvas.restoreToCount(iSaveLayerAlpha);
            }
        }
    }

    @Override // X.C21538919Rb, android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        if (this.LLLLZI) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            outline.setRoundRect(bounds, this.LLJJLIIIJLLLLLLLZ);
        } else {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.LLJJL, this.LLJJLIIIJLLLLLLLZ);
        }
        outline.setAlpha(this.LLLLLLIL / 255.0f);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        boolean zOnLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (LJJJJLL()) {
            zOnLayoutDirectionChanged |= C16G6.LIZIZ(this.LLJLLL, i);
        }
        if (LJJJJLI()) {
            zOnLayoutDirectionChanged |= C16G6.LIZIZ(this.LLLIIIL, i);
        }
        if (LJJJJZ()) {
            zOnLayoutDirectionChanged |= C16G6.LIZIZ(this.LLLFF, i);
        }
        if (zOnLayoutDirectionChanged) {
            invalidateSelf();
            return true;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        boolean zOnLevelChange = super.onLevelChange(i);
        if (LJJJJLL()) {
            zOnLevelChange |= this.LLJLLL.setLevel(i);
        }
        if (LJJJJLI()) {
            zOnLevelChange |= this.LLLIIIL.setLevel(i);
        }
        if (LJJJJZ()) {
            zOnLevelChange |= this.LLLFF.setLevel(i);
        }
        if (zOnLevelChange) {
            invalidateSelf();
        }
        return zOnLevelChange;
    }

    @Override // X.C21538919Rb, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        if (this.LLLLZI) {
            super.onStateChange(iArr);
        }
        return LJJIIJ(iArr, this.LLLLLLLZIL);
    }

    @Override // X.C21538919Rb, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.LLLLLLIL != i) {
            this.LLLLLLIL = i;
            invalidateSelf();
        }
    }

    @Override // X.C21538919Rb, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.LLLLLLJ != colorFilter) {
            this.LLLLLLJ = colorFilter;
            invalidateSelf();
        }
    }

    @Override // X.C21538919Rb, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.LLLLLLLLL != colorStateList) {
            this.LLLLLLLLL = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // X.C21538919Rb, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        if (this.LLLLLLLLLL != mode) {
            this.LLLLLLLLLL = mode;
            ColorStateList colorStateList = this.LLLLLLLLL;
            if (colorStateList != null && mode != null) {
                porterDuffColorFilter = new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            } else {
                porterDuffColorFilter = null;
            }
            this.LLLLLLL = porterDuffColorFilter;
            invalidateSelf();
        }
    }

    public C19SD(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.zhiliaoapp.musically.R.attr.bgr, com.zhiliaoapp.musically.R.style.a4k);
        this.LLJJLIIIJLLLLLLLZ = -1.0f;
        this.LLLLIIIILLL = new Paint(1);
        this.LLLLIIL = new Paint.FontMetrics();
        this.LLLLIILL = new RectF();
        this.LLLLIILLL = new PointF();
        this.LLLLIL = new Path();
        this.LLLLLLIL = 255;
        this.LLLLLLLLLL = PorterDuff.Mode.SRC_IN;
        this.LLLLLZ = new WeakReference<>(null);
        LJIIIIZZ(context);
        this.LLLLII = context;
        C19QD c19qd = new C19QD(this);
        this.LLLLILI = c19qd;
        this.LLJLL = "";
        c19qd.LIZ.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = LLLLZIL;
        setState(iArr);
        if (!Arrays.equals(this.LLLLLLLZIL, iArr)) {
            this.LLLLLLLZIL = iArr;
            if (LJJJJZ()) {
                LJJIIJ(getState(), iArr);
            }
        }
        this.LLLLLZL = true;
        LLLLZLL.setTint(-1);
    }

    public final void LJIJJLI(Rect rect, RectF rectF) {
        Drawable drawable;
        Drawable drawable2;
        rectF.setEmpty();
        if (LJJJJLL() || LJJJJLI()) {
            float f = this.LLLILZ + this.LLLILZJ;
            if (this.LLLLLJLJLL) {
                drawable = this.LLLIIIL;
            } else {
                drawable = this.LLJLLL;
            }
            float intrinsicWidth = this.LLJZIJLIL;
            if (intrinsicWidth <= 0.0f && drawable != null) {
                intrinsicWidth = drawable.getIntrinsicWidth();
            }
            if (C16G6.LIZ(this) == 0) {
                float f2 = rect.left + f;
                rectF.left = f2;
                rectF.right = f2 + intrinsicWidth;
            } else {
                float f3 = rect.right - f;
                rectF.right = f3;
                rectF.left = f3 - intrinsicWidth;
            }
            if (this.LLLLLJLJLL) {
                drawable2 = this.LLLIIIL;
            } else {
                drawable2 = this.LLJLLL;
            }
            float fCeil = this.LLJZIJLIL;
            if (fCeil <= 0.0f && drawable2 != null) {
                fCeil = (float) Math.ceil(C21551419Vw.LIZIZ(24, this.LLLLII));
                if (drawable2.getIntrinsicHeight() <= fCeil) {
                    fCeil = drawable2.getIntrinsicHeight();
                }
            }
            float fExactCenterY = rect.exactCenterY() - (fCeil / 2.0f);
            rectF.top = fExactCenterY;
            rectF.bottom = fExactCenterY + fCeil;
        }
    }

    public final boolean LJJIIJ(int[] iArr, int[] iArr2) {
        int colorForState;
        int colorForState2;
        boolean z;
        boolean z2;
        int colorForState3;
        int colorForState4;
        int colorForState5;
        boolean z3;
        boolean z4;
        int colorForState6;
        PorterDuffColorFilter porterDuffColorFilter;
        ColorStateList colorStateList;
        boolean zOnStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList2 = this.LLJJJJJIL;
        if (colorStateList2 != null) {
            colorForState = colorStateList2.getColorForState(iArr, this.LLLLJ);
        } else {
            colorForState = 0;
        }
        int iLIZLLL = LIZLLL(colorForState);
        boolean state = true;
        if (this.LLLLJ != iLIZLLL) {
            this.LLLLJ = iLIZLLL;
            zOnStateChange = true;
        }
        ColorStateList colorStateList3 = this.LLJJJJLIIL;
        if (colorStateList3 != null) {
            colorForState2 = colorStateList3.getColorForState(iArr, this.LLLLJI);
        } else {
            colorForState2 = 0;
        }
        int iLIZLLL2 = LIZLLL(colorForState2);
        if (this.LLLLJI != iLIZLLL2) {
            this.LLLLJI = iLIZLLL2;
            zOnStateChange = true;
        }
        int iLJIIJ = C2441009hQ.LJIIJ(iLIZLLL2, iLIZLLL);
        if (this.LLLLL != iLJIIJ) {
            z = true;
        } else {
            z = false;
        }
        if (this.LL.LIZJ == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z | z2) {
            this.LLLLL = iLJIIJ;
            LJIIJJI(ColorStateList.valueOf(iLJIIJ));
            zOnStateChange = true;
        }
        ColorStateList colorStateList4 = this.LLJL;
        if (colorStateList4 != null) {
            colorForState3 = colorStateList4.getColorForState(iArr, this.LLLLLIL);
        } else {
            colorForState3 = 0;
        }
        if (this.LLLLLIL != colorForState3) {
            this.LLLLLIL = colorForState3;
            zOnStateChange = true;
        }
        if (this.LLLLLLZZ != null && C19Q7.LIZLLL(iArr)) {
            colorForState4 = this.LLLLLLZZ.getColorForState(iArr, this.LLLLLILLIL);
        } else {
            colorForState4 = 0;
        }
        if (this.LLLLLILLIL != colorForState4) {
            this.LLLLLILLIL = colorForState4;
            if (this.LLLLLLZ) {
                zOnStateChange = true;
            }
        }
        C19Q9 c19q9 = this.LLLLILI.LJFF;
        if (c19q9 != null && (colorStateList = c19q9.LIZ) != null) {
            colorForState5 = colorStateList.getColorForState(iArr, this.LLLLLJIL);
        } else {
            colorForState5 = 0;
        }
        if (this.LLLLLJIL != colorForState5) {
            this.LLLLLJIL = colorForState5;
            zOnStateChange = true;
        }
        int[] state2 = getState();
        if (state2 != null) {
            int length = state2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (state2[i] == 16842912) {
                    if (this.LLLIIII) {
                        z3 = true;
                    }
                } else {
                    i++;
                }
            }
            z3 = false;
        } else {
            z3 = false;
        }
        if (this.LLLLLJLJLL != z3 && this.LLLIIIL != null) {
            float fLJIL = LJIL();
            this.LLLLLJLJLL = z3;
            if (fLJIL != LJIL()) {
                zOnStateChange = true;
                z4 = true;
            } else {
                z4 = false;
                zOnStateChange = true;
            }
        } else {
            z4 = false;
        }
        ColorStateList colorStateList5 = this.LLLLLLLLL;
        if (colorStateList5 != null) {
            colorForState6 = colorStateList5.getColorForState(iArr, this.LLLLLL);
        } else {
            colorForState6 = 0;
        }
        if (this.LLLLLL != colorForState6) {
            this.LLLLLL = colorForState6;
            ColorStateList colorStateList6 = this.LLLLLLLLL;
            PorterDuff.Mode mode = this.LLLLLLLLLL;
            if (colorStateList6 != null && mode != null) {
                porterDuffColorFilter = new PorterDuffColorFilter(colorStateList6.getColorForState(getState(), 0), mode);
            } else {
                porterDuffColorFilter = null;
            }
            this.LLLLLLL = porterDuffColorFilter;
        } else {
            state = zOnStateChange;
        }
        if (LJJII(this.LLJLLL)) {
            state |= this.LLJLLL.setState(iArr);
        }
        if (LJJII(this.LLLIIIL)) {
            state |= this.LLLIIIL.setState(iArr);
        }
        if (LJJII(this.LLLFF)) {
            int[] iArr3 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            state |= this.LLLFF.setState(iArr3);
        }
        if (LJJII(this.LLLFFI)) {
            state |= this.LLLFFI.setState(iArr2);
        }
        if (state) {
            invalidateSelf();
        }
        if (z4) {
            LJJIII();
        }
        return state;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (LJJJJLL()) {
            visible |= this.LLJLLL.setVisible(z, z2);
        }
        if (LJJJJLI()) {
            visible |= this.LLLIIIL.setVisible(z, z2);
        }
        if (LJJJJZ()) {
            visible |= this.LLLFF.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }
}
