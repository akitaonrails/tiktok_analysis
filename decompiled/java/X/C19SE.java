package X;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.ss.android.ugc.aweme.app.R$styleable;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import u4.q0;

/* JADX INFO: renamed from: X.19SE, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public class C19SE extends C21412118qt implements C19SJ, C19S4 {
    public static final Rect LLJJJ = new Rect();
    public static final int[] LLJJJIL = {R.attr.state_selected};
    public static final int[] LLJJJJ = {R.attr.state_checkable};
    public C19SD LLILZIL;
    public InsetDrawable LLILZLL;
    public RippleDrawable LLIZ;
    public View.OnClickListener LLIZLLLIL;
    public CompoundButton.OnCheckedChangeListener LLJ;
    public boolean LLJI;
    public boolean LLJIJIL;
    public boolean LLJILJIL;
    public boolean LLJILJILJ;
    public boolean LLJILLL;
    public int LLJJ;
    public int LLJJI;
    public final C19SF LLJJIII;
    public final Rect LLJJIJI;
    public final RectF LLJJIJIIJIL;
    public final C19SH LLJJIJIL;

    @Override // android.view.View
    public void setBackgroundColor(int i) {
    }

    @Override // X.C21412118qt, android.view.View
    public void setBackgroundResource(int i) {
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
    }

    private C19Q9 getTextAppearance() {
        C19SD c19sd = this.LLILZIL;
        if (c19sd != null) {
            return c19sd.LLLLILI.LJFF;
        }
        return null;
    }

    @Override // X.C19SJ
    public final void LIZ() {
        LIZIZ(this.LLJJI);
        requestLayout();
        invalidateOutline();
    }

    public final boolean LIZJ() {
        Object obj;
        C19SD c19sd = this.LLILZIL;
        if (c19sd == null || (obj = c19sd.LLLFF) == null) {
            return false;
        }
        return ((obj instanceof C14SS) && ((C14SS) obj).LIZIZ() == null) ? false : true;
    }

    public final boolean LIZLLL() {
        C19SD c19sd = this.LLILZIL;
        return c19sd != null && c19sd.LLLIIII;
    }

    public final void LJFF() {
        this.LLIZ = new RippleDrawable(C19Q7.LIZJ(this.LLILZIL.LLJLILLLLZIIL), getBackgroundDrawable(), null);
        C19SD c19sd = this.LLILZIL;
        if (c19sd.LLLLLLZ) {
            c19sd.LLLLLLZ = false;
            c19sd.LLLLLLZZ = null;
            c19sd.onStateChange(c19sd.getState());
        }
        setBackground(this.LLIZ);
        LJI();
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.LLILZLL;
        return insetDrawable == null ? this.LLILZIL : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        C19SD c19sd = this.LLILZIL;
        if (c19sd != null) {
            return c19sd.LLLIIIL;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        C19SD c19sd = this.LLILZIL;
        if (c19sd != null) {
            return c19sd.LLLIIL;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        C19SD c19sd = this.LLILZIL;
        if (c19sd != null) {
            return c19sd.LLJJJJLIIL;
        }
        return null;
    }

    public float getChipCornerRadius() {
        C19SD c19sd = this.LLILZIL;
        if (c19sd != null) {
            return Math.max(0.0f, c19sd.LJJI());
        }
        return 0.0f;
    }

    public float getChipEndPadding() {
        C19SD c19sd = this.LLILZIL;
        if (c19sd != null) {
            return c19sd.LLLL;
        }
        return 0.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable getChipIcon() {
        Drawable drawable;
        C19SD c19sd = this.LLILZIL;
        if (c19sd == null || (drawable = c19sd.LLJLLL) == 0) {
            return null;
        }
        return drawable instanceof C14SS ? ((C14SS) drawable).LIZIZ() : drawable;
    }

    public float getChipIconSize() {
        C19SD c19sd = this.LLILZIL;
        if (c19sd != null) {
            return c19sd.LLJZIJLIL;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        C19SD c19sd = this.LLILZIL;
        if (c19sd != null) {
            return c19sd.LLJZ;
        }
        return null;
    }

    public float getChipMinHeight() {
        C19SD c19sd = this.LLILZIL;
        if (c19sd != null) {
            return c19sd.LLJJL;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        C19SD c19sd = this.LLILZIL;
        if (c19sd != null) {
            return c19sd.LLLILZ;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        C19SD c19sd = this.LLILZIL;
        if (c19sd != null) {
            return c19sd.LLJL;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        C19SD c19sd = this.LLILZIL;
        if (c19sd != null) {
            return c19sd.LLJLIL;
        }
        return 0.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable getCloseIcon() {
        Drawable drawable;
        C19SD c19sd = this.LLILZIL;
        if (c19sd == null || (drawable = c19sd.LLLFF) == 0) {
            return null;
        }
        return drawable instanceof C14SS ? ((C14SS) drawable).LIZIZ() : drawable;
    }

    public CharSequence getCloseIconContentDescription() {
        C19SD c19sd = this.LLILZIL;
        if (c19sd != null) {
            return c19sd.LLLII;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        C19SD c19sd = this.LLILZIL;
        if (c19sd != null) {
            return c19sd.LLLJL;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        C19SD c19sd = this.LLILZIL;
        if (c19sd != null) {
            return c19sd.LLLI;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        C19SD c19sd = this.LLILZIL;
        if (c19sd != null) {
            return c19sd.LLLJIL;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        C19SD c19sd = this.LLILZIL;
        if (c19sd != null) {
            return c19sd.LLLFZ;
        }
        return null;
    }

    public RectF getCloseIconTouchBounds() {
        this.LLJJIJIIJIL.setEmpty();
        if (LIZJ() && this.LLIZLLLIL != null) {
            C19SD c19sd = this.LLILZIL;
            RectF rectF = this.LLJJIJIIJIL;
            Rect bounds = c19sd.getBounds();
            rectF.setEmpty();
            if (c19sd.LJJJJZ()) {
                float f = c19sd.LLLL + c19sd.LLLJL + c19sd.LLLI + c19sd.LLLJIL + c19sd.LLLJ;
                if (C16G6.LIZ(c19sd) == 0) {
                    float f2 = bounds.right;
                    rectF.right = f2;
                    rectF.left = f2 - f;
                } else {
                    float f3 = bounds.left;
                    rectF.left = f3;
                    rectF.right = f3 + f;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
        }
        return this.LLJJIJIIJIL;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        C19SD c19sd = this.LLILZIL;
        if (c19sd != null) {
            return c19sd.LLLLLZIL;
        }
        return null;
    }

    public C194T getHideMotionSpec() {
        C19SD c19sd = this.LLILZIL;
        if (c19sd != null) {
            return c19sd.LLLIL;
        }
        return null;
    }

    public float getIconEndPadding() {
        C19SD c19sd = this.LLILZIL;
        if (c19sd != null) {
            return c19sd.LLLILZLLLI;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        C19SD c19sd = this.LLILZIL;
        if (c19sd != null) {
            return c19sd.LLLILZJ;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        C19SD c19sd = this.LLILZIL;
        if (c19sd != null) {
            return c19sd.LLJLILLLLZIIL;
        }
        return null;
    }

    public C19RX getShapeAppearanceModel() {
        return this.LLILZIL.LL.LIZ;
    }

    public C194T getShowMotionSpec() {
        C19SD c19sd = this.LLILZIL;
        if (c19sd != null) {
            return c19sd.LLLIILIL;
        }
        return null;
    }

    public float getTextEndPadding() {
        C19SD c19sd = this.LLILZIL;
        if (c19sd != null) {
            return c19sd.LLLJ;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        C19SD c19sd = this.LLILZIL;
        if (c19sd != null) {
            return c19sd.LLLIZZ;
        }
        return 0.0f;
    }

    public final void LJ() {
        C19SD c19sd;
        if (!LIZJ() || (c19sd = this.LLILZIL) == null || !c19sd.LLLF || this.LLIZLLLIL == null) {
            q0.LJIJ(this, null);
        } else {
            q0.LJIJ(this, this.LLJJIII);
        }
    }

    public final void LJI() {
        C19SD c19sd;
        if (TextUtils.isEmpty(getText()) || (c19sd = this.LLILZIL) == null) {
            return;
        }
        int iLJJ = (int) (c19sd.LLLL + c19sd.LLLJ + c19sd.LJJ());
        C19SD c19sd2 = this.LLILZIL;
        int iLJIL = (int) (c19sd2.LLLILZ + c19sd2.LLLIZZ + c19sd2.LJIL());
        if (this.LLILZLL != null) {
            Rect rect = new Rect();
            this.LLILZLL.getPadding(rect);
            iLJIL += rect.left;
            iLJJ += rect.right;
        }
        setPaddingRelative(iLJIL, getPaddingTop(), iLJJ, getPaddingBottom());
    }

    public final void LJII() {
        TextPaint paint = getPaint();
        C19SD c19sd = this.LLILZIL;
        if (c19sd != null) {
            paint.drawableState = c19sd.getState();
        }
        C19Q9 textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.LIZJ(getContext(), paint, this.LLJJIJIL);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [boolean, int] */
    @Override // X.C21412118qt, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        int i;
        super.drawableStateChanged();
        C19SD c19sd = this.LLILZIL;
        if (c19sd == null || !C19SD.LJJII(c19sd.LLLFF)) {
            return;
        }
        C19SD c19sd2 = this.LLILZIL;
        ?? IsEnabled = isEnabled();
        int i2 = IsEnabled;
        if (this.LLJILJILJ) {
            i2 = IsEnabled + 1;
        }
        int i3 = i2;
        if (this.LLJILJIL) {
            i3 = i2 + 1;
        }
        int i4 = i3;
        if (this.LLJIJIL) {
            i4 = i3 + 1;
        }
        int i5 = i4;
        if (isChecked()) {
            i5 = i4 + 1;
        }
        int[] iArr = new int[i5];
        if (isEnabled()) {
            iArr[0] = 16842910;
            i = 1;
        } else {
            i = 0;
        }
        if (this.LLJILJILJ) {
            iArr[i] = 16842908;
            i++;
        }
        if (this.LLJILJIL) {
            iArr[i] = 16843623;
            i++;
        }
        if (this.LLJIJIL) {
            iArr[i] = 16842919;
            i++;
        }
        if (isChecked()) {
            iArr[i] = 16842913;
        }
        if (Arrays.equals(c19sd2.LLLLLLLZIL, iArr)) {
            return;
        }
        c19sd2.LLLLLLLZIL = iArr;
        if (c19sd2.LJJJJZ() && c19sd2.LJJIIJ(c19sd2.getState(), iArr)) {
            invalidate();
        }
    }

    public CharSequence getChipText() {
        return getText();
    }

    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        this.LLJJIJI.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return this.LLJJIJI;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C21539119Rd.LIZLLL(this, this.LLILZIL);
    }

    public Drawable getChipDrawable() {
        return this.LLILZIL;
    }

    private void setCloseIconHovered(boolean z) {
        if (this.LLJILJIL != z) {
            this.LLJILJIL = z;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z) {
        if (this.LLJIJIL != z) {
            this.LLJIJIL = z;
            refreshDrawableState();
        }
    }

    public final void LIZIZ(int i) {
        int i2;
        this.LLJJI = i;
        int i3 = 0;
        if (!this.LLJILLL) {
            if (this.LLILZLL != null) {
                this.LLILZLL = null;
                setMinWidth(0);
                setMinHeight((int) getChipMinHeight());
                LJFF();
                return;
            }
            LJFF();
            return;
        }
        int iMax = Math.max(0, i - ((int) this.LLILZIL.LLJJL));
        int iMax2 = Math.max(0, i - this.LLILZIL.getIntrinsicWidth());
        if (iMax2 <= 0) {
            if (iMax <= 0) {
                if (this.LLILZLL != null) {
                    this.LLILZLL = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    LJFF();
                    return;
                }
                LJFF();
                return;
            }
            i2 = 0;
        } else {
            i2 = iMax2 / 2;
        }
        if (iMax > 0) {
            i3 = iMax / 2;
        }
        if (this.LLILZLL != null) {
            Rect rect = new Rect();
            this.LLILZLL.getPadding(rect);
            if (rect.top == i3 && rect.bottom == i3 && rect.left == i2 && rect.right == i2) {
                LJFF();
                return;
            }
        }
        if (getMinHeight() != i) {
            setMinHeight(i);
        }
        if (getMinWidth() != i) {
            setMinWidth(i);
        }
        this.LLILZLL = new InsetDrawable((Drawable) this.LLILZIL, i2, i3, i2, i3);
        LJFF();
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0096 A[RETURN] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchHoverEvent(android.view.MotionEvent r9) {
        /*
            r8 = this;
            int r0 = r9.getAction()
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = 10
            r3 = 1
            r7 = 0
            if (r0 != r5) goto L57
            java.lang.Class<X.0kYm> r1 = X.AbstractC1324060kYm.class
            java.lang.String r0 = "LJIIIZ"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r0)     // Catch: java.lang.reflect.InvocationTargetException -> L44 java.lang.IllegalAccessException -> L49 java.lang.NoSuchMethodException -> L4e java.lang.NoSuchFieldException -> L53
            r1.setAccessible(r3)     // Catch: java.lang.reflect.InvocationTargetException -> L44 java.lang.IllegalAccessException -> L49 java.lang.NoSuchMethodException -> L4e java.lang.NoSuchFieldException -> L53
            X.19SF r0 = r8.LLJJIII     // Catch: java.lang.reflect.InvocationTargetException -> L44 java.lang.IllegalAccessException -> L49 java.lang.NoSuchMethodException -> L4e java.lang.NoSuchFieldException -> L53
            java.lang.Object r0 = r1.get(r0)     // Catch: java.lang.reflect.InvocationTargetException -> L44 java.lang.IllegalAccessException -> L49 java.lang.NoSuchMethodException -> L4e java.lang.NoSuchFieldException -> L53
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.reflect.InvocationTargetException -> L44 java.lang.IllegalAccessException -> L49 java.lang.NoSuchMethodException -> L4e java.lang.NoSuchFieldException -> L53
            int r0 = r0.intValue()     // Catch: java.lang.reflect.InvocationTargetException -> L44 java.lang.IllegalAccessException -> L49 java.lang.NoSuchMethodException -> L4e java.lang.NoSuchFieldException -> L53
            if (r0 == r4) goto L57
            java.lang.Class<X.0kYm> r6 = X.AbstractC1324060kYm.class
            java.lang.String r2 = "LJIIJJI"
            java.lang.Class[] r1 = new java.lang.Class[r3]     // Catch: java.lang.reflect.InvocationTargetException -> L44 java.lang.IllegalAccessException -> L49 java.lang.NoSuchMethodException -> L4e java.lang.NoSuchFieldException -> L53
            java.lang.Class r0 = java.lang.Integer.TYPE     // Catch: java.lang.reflect.InvocationTargetException -> L44 java.lang.IllegalAccessException -> L49 java.lang.NoSuchMethodException -> L4e java.lang.NoSuchFieldException -> L53
            r1[r7] = r0     // Catch: java.lang.reflect.InvocationTargetException -> L44 java.lang.IllegalAccessException -> L49 java.lang.NoSuchMethodException -> L4e java.lang.NoSuchFieldException -> L53
            java.lang.reflect.Method r6 = r6.getDeclaredMethod(r2, r1)     // Catch: java.lang.reflect.InvocationTargetException -> L44 java.lang.IllegalAccessException -> L49 java.lang.NoSuchMethodException -> L4e java.lang.NoSuchFieldException -> L53
            r6.setAccessible(r3)     // Catch: java.lang.reflect.InvocationTargetException -> L44 java.lang.IllegalAccessException -> L49 java.lang.NoSuchMethodException -> L4e java.lang.NoSuchFieldException -> L53
            X.19SF r2 = r8.LLJJIII     // Catch: java.lang.reflect.InvocationTargetException -> L44 java.lang.IllegalAccessException -> L49 java.lang.NoSuchMethodException -> L4e java.lang.NoSuchFieldException -> L53
            java.lang.Object[] r1 = new java.lang.Object[r3]     // Catch: java.lang.reflect.InvocationTargetException -> L44 java.lang.IllegalAccessException -> L49 java.lang.NoSuchMethodException -> L4e java.lang.NoSuchFieldException -> L53
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.reflect.InvocationTargetException -> L44 java.lang.IllegalAccessException -> L49 java.lang.NoSuchMethodException -> L4e java.lang.NoSuchFieldException -> L53
            r1[r7] = r0     // Catch: java.lang.reflect.InvocationTargetException -> L44 java.lang.IllegalAccessException -> L49 java.lang.NoSuchMethodException -> L4e java.lang.NoSuchFieldException -> L53
            r6.invoke(r2, r1)     // Catch: java.lang.reflect.InvocationTargetException -> L44 java.lang.IllegalAccessException -> L49 java.lang.NoSuchMethodException -> L4e java.lang.NoSuchFieldException -> L53
            return r3
        L44:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            goto L57
        L49:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            goto L57
        L4e:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            goto L57
        L53:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L57:
            X.19SF r2 = r8.LLJJIII
            android.view.accessibility.AccessibilityManager r0 = r2.LJ
            boolean r0 = r0.isEnabled()
            if (r0 == 0) goto L90
            android.view.accessibility.AccessibilityManager r0 = r2.LJ
            boolean r0 = r0.isTouchExplorationEnabled()
            if (r0 == 0) goto L90
            int r1 = r9.getAction()
            r0 = 7
            if (r1 == r0) goto L7e
            r0 = 9
            if (r1 == r0) goto L7e
            if (r1 != r5) goto L90
            int r0 = r2.LJIIIZ
            if (r0 == r4) goto L90
            r2.LJIIJJI(r4)
        L7d:
            return r3
        L7e:
            float r1 = r9.getX()
            float r0 = r9.getY()
            int r0 = r2.LJIIL(r1, r0)
            r2.LJIIJJI(r0)
            if (r0 == r4) goto L90
            return r3
        L90:
            boolean r0 = super.dispatchHoverEvent(r9)
            if (r0 != 0) goto L7d
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19SE.dispatchHoverEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007a A[RETURN] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchKeyEvent(android.view.KeyEvent r10) {
        /*
            r9 = this;
            X.19SF r5 = r9.LLJJIII
            r5.getClass()
            int r0 = r10.getAction()
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1
            r8 = 0
            if (r0 == r3) goto L1f
            int r1 = r10.getKeyCode()
            r0 = 61
            r6 = 0
            if (r1 == r0) goto L67
            r7 = 66
            if (r1 == r7) goto L51
            switch(r1) {
                case 19: goto L24;
                case 20: goto L24;
                case 21: goto L24;
                case 22: goto L24;
                case 23: goto L51;
                default: goto L1f;
            }
        L1f:
            boolean r0 = super.dispatchKeyEvent(r10)
            return r0
        L24:
            boolean r0 = r10.hasNoModifiers()
            if (r0 == 0) goto L1f
            r0 = 19
            if (r1 == r0) goto L4e
            r0 = 21
            if (r1 == r0) goto L4b
            r0 = 22
            if (r1 == r0) goto L38
            r7 = 130(0x82, float:1.82E-43)
        L38:
            int r0 = r10.getRepeatCount()
            int r2 = r0 + 1
            r1 = 0
        L3f:
            if (r8 >= r2) goto L72
            boolean r0 = r5.LIZLLL(r7, r6)
            if (r0 == 0) goto L72
            int r8 = r8 + 1
            r1 = 1
            goto L3f
        L4b:
            r7 = 17
            goto L38
        L4e:
            r7 = 33
            goto L38
        L51:
            boolean r0 = r10.hasNoModifiers()
            if (r0 == 0) goto L1f
            int r0 = r10.getRepeatCount()
            if (r0 != 0) goto L1f
            int r1 = r5.LJIIIIZZ
            if (r1 == r4) goto L74
            r0 = 16
            r5.LJFF(r1, r0)
            goto L74
        L67:
            boolean r0 = r10.hasNoModifiers()
            if (r0 == 0) goto L7b
            r0 = 2
            boolean r1 = r5.LIZLLL(r0, r6)
        L72:
            if (r1 == 0) goto L1f
        L74:
            X.19SF r0 = r9.LLJJIII
            int r0 = r0.LJIIIIZZ
            if (r0 == r4) goto L1f
            return r3
        L7b:
            boolean r0 = r10.hasModifiers(r3)
            if (r0 == 0) goto L1f
            boolean r1 = r5.LIZLLL(r3, r6)
            goto L72
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19SE.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        C19SF c19sf = this.LLJJIII;
        if (c19sf.LJIIIIZZ != 1 && c19sf.LJII != 1) {
            super.getFocusedRect(rect);
        } else {
            rect.set(getCloseIconTouchBoundsInt());
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            CheckBox.mergeDrawableStates(iArrOnCreateDrawableState, LLJJJIL);
        }
        if (LIZLLL()) {
            CheckBox.mergeDrawableStates(iArrOnCreateDrawableState, LLJJJJ);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 7) {
            if (actionMasked == 10) {
                setCloseIconHovered(false);
            }
        } else {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        String str;
        int i;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (!LIZLLL() && !isClickable()) {
            accessibilityNodeInfo.setClassName("android.view.View");
        } else {
            if (LIZLLL()) {
                str = "android.widget.CompoundButton";
            } else {
                str = "android.widget.Button";
            }
            accessibilityNodeInfo.setClassName(str);
        }
        accessibilityNodeInfo.setCheckable(LIZLLL());
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof C21541519Sb) {
            C426000Gn8 c426000Gn8 = (C426000Gn8) getParent();
            AccessibilityNodeInfoCompat accessibilityNodeInfoCompatWrap = AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo);
            int iIntValue = -1;
            if (c426000Gn8.LLILLL) {
                i = 0;
                for (int i2 = 0; i2 < c426000Gn8.getChildCount(); i2++) {
                    if (c426000Gn8.getChildAt(i2) instanceof C19SE) {
                        if (c426000Gn8.getChildAt(i2) == this) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                i = -1;
            } else {
                i = -1;
            }
            Object tag = getTag(com.zhiliaoapp.musically.R.id.tt6);
            if (tag instanceof Integer) {
                iIntValue = ((Integer) tag).intValue();
            }
            accessibilityNodeInfoCompatWrap.setCollectionItemInfo(C20092913jb.LIZ(iIntValue, 1, i, 1, isChecked()));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.LLJJ != i) {
            this.LLJJ = i;
            LJI();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if (r4 != 3) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r4 = r6.getActionMasked()
            android.graphics.RectF r2 = r5.getCloseIconTouchBounds()
            float r1 = r6.getX()
            float r0 = r6.getY()
            boolean r3 = r2.contains(r1, r0)
            r2 = 1
            r1 = 0
            if (r4 == 0) goto L4e
            if (r4 == r2) goto L32
            r0 = 2
            if (r4 == r0) goto L28
            r0 = 3
            if (r4 == r0) goto L4c
        L20:
            boolean r0 = super.onTouchEvent(r6)
            if (r0 != 0) goto L27
            r2 = 0
        L27:
            return r2
        L28:
            boolean r0 = r5.LLJIJIL
            if (r0 == 0) goto L20
            if (r3 != 0) goto L27
            r5.setCloseIconPressed(r1)
            return r2
        L32:
            boolean r0 = r5.LLJIJIL
            if (r0 == 0) goto L4c
            r5.playSoundEffect(r1)
            android.view.View$OnClickListener r0 = r5.LLIZLLLIL
            if (r0 == 0) goto L40
            r0.onClick(r5)
        L40:
            X.19SF r0 = r5.LLJJIII
            r0.LJIIJ(r2, r2)
            r0 = 1
        L46:
            r5.setCloseIconPressed(r1)
            if (r0 != 0) goto L27
            goto L20
        L4c:
            r0 = 0
            goto L46
        L4e:
            if (r3 == 0) goto L20
            r5.setCloseIconPressed(r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19SE.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable != getBackgroundDrawable() && drawable != this.LLIZ) {
            return;
        }
        super.setBackground(drawable);
    }

    @Override // X.C21412118qt, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != getBackgroundDrawable() && drawable != this.LLIZ) {
            return;
        }
        super.setBackgroundDrawable(drawable);
    }

    public void setCheckable(boolean z) {
        C19SD c19sd = this.LLILZIL;
        if (c19sd != null) {
            c19sd.LJJIIJZLJL(z);
        }
    }

    public void setCheckableResource(int i) {
        C19SD c19sd = this.LLILZIL;
        if (c19sd != null) {
            c19sd.LJJIIJZLJL(c19sd.LLLLII.getResources().getBoolean(i));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        C19SD c19sd = this.LLILZIL;
        if (c19sd == null) {
            this.LLJI = z;
            return;
        }
        if (!c19sd.LLLIIII) {
            return;
        }
        boolean zIsChecked = isChecked();
        super.setChecked(z);
        if (zIsChecked == z || (onCheckedChangeListener = this.LLJ) == null) {
            return;
        }
        onCheckedChangeListener.onCheckedChanged(this, z);
    }

    public void setCheckedIcon(Drawable drawable) {
        C19SD c19sd = this.LLILZIL;
        if (c19sd != null) {
            c19sd.LJJIIZ(drawable);
        }
    }

    public void setCheckedIconEnabled(boolean z) {
        setCheckedIconVisible(z);
    }

    public void setCheckedIconEnabledResource(int i) {
        setCheckedIconVisible(i);
    }

    public void setCheckedIconResource(int i) {
        C19SD c19sd = this.LLILZIL;
        if (c19sd != null) {
            c19sd.LJJIIZ(C14MI.LIZ(c19sd.LLLLII, i));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        C19SD c19sd = this.LLILZIL;
        if (c19sd != null) {
            c19sd.LJJIIZI(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i) {
        C19SD c19sd = this.LLILZIL;
        if (c19sd != null) {
            c19sd.LJJIIZI(C838410Wul.LIZIZ(i, c19sd.LLLLII));
        }
    }

    public void setCheckedIconVisible(int i) {
        C19SD c19sd = this.LLILZIL;
        if (c19sd != null) {
            c19sd.LJJIJ(c19sd.LLLLII.getResources().getBoolean(i));
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        C19SD c19sd = this.LLILZIL;
        if (c19sd != null && c19sd.LLJJJJLIIL != colorStateList) {
            c19sd.LLJJJJLIIL = colorStateList;
            c19sd.onStateChange(c19sd.getState());
        }
    }

    public void setChipBackgroundColorResource(int i) {
        ColorStateList colorStateListLIZIZ;
        C19SD c19sd = this.LLILZIL;
        if (c19sd != null && c19sd.LLJJJJLIIL != (colorStateListLIZIZ = C838410Wul.LIZIZ(i, c19sd.LLLLII))) {
            c19sd.LLJJJJLIIL = colorStateListLIZIZ;
            c19sd.onStateChange(c19sd.getState());
        }
    }

    public void setChipCornerRadius(float f) {
        C19SD c19sd = this.LLILZIL;
        if (c19sd != null) {
            c19sd.LJJIJIIJI(f);
        }
    }

    public void setChipCornerRadiusResource(int i) {
        C19SD c19sd = this.LLILZIL;
        if (c19sd != null) {
            c19sd.LJJIJIIJI(c19sd.LLLLII.getResources().getDimension(i));
        }
    }

    public void setChipDrawable(C19SD c19sd) {
        C19SD c19sd2 = this.LLILZIL;
        if (c19sd2 != c19sd) {
            if (c19sd2 != null) {
                c19sd2.LLLLLZ = new WeakReference<>(null);
            }
            this.LLILZIL = c19sd;
            c19sd.LLLLLZL = false;
            c19sd.getClass();
            c19sd.LLLLLZ = new WeakReference<>(this);
            LIZIZ(this.LLJJI);
        }
    }

    public void setChipEndPadding(float f) {
        C19SD c19sd = this.LLILZIL;
        if (c19sd != null && c19sd.LLLL != f) {
            c19sd.LLLL = f;
            c19sd.invalidateSelf();
            c19sd.LJJIII();
        }
    }

    public void setChipEndPaddingResource(int i) {
        C19SD c19sd = this.LLILZIL;
        if (c19sd != null) {
            float dimension = c19sd.LLLLII.getResources().getDimension(i);
            if (c19sd.LLLL != dimension) {
                c19sd.LLLL = dimension;
                c19sd.invalidateSelf();
                c19sd.LJJIII();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        C19SD c19sd = this.LLILZIL;
        if (c19sd != null) {
            c19sd.LJJIJIIJIL(drawable);
        }
    }

    public void setChipIconEnabled(boolean z) {
        setChipIconVisible(z);
    }

    public void setChipIconEnabledResource(int i) {
        setChipIconVisible(i);
    }

    public void setChipIconResource(int i) {
        C19SD c19sd = this.LLILZIL;
        if (c19sd != null) {
            c19sd.LJJIJIIJIL(C14MI.LIZ(c19sd.LLLLII, i));
        }
    }

    public void setChipIconSize(float f) {
        C19SD c19sd = this.LLILZIL;
        if (c19sd != null) {
            c19sd.LJJIJIL(f);
        }
    }

    public void setChipIconSizeResource(int i) {
        C19SD c19sd = this.LLILZIL;
        if (c19sd != null) {
            c19sd.LJJIJIL(c19sd.LLLLII.getResources().getDimension(i));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        C19SD c19sd = this.LLILZIL;
        if (c19sd != null) {
            c19sd.LJJIJL(colorStateList);
        }
    }

    public void setChipIconTintResource(int i) {
        C19SD c19sd = this.LLILZIL;
        if (c19sd != null) {
            c19sd.LJJIJL(C838410Wul.LIZIZ(i, c19sd.LLLLII));
        }
    }

    public void setChipIconVisible(int i) {
        C19SD c19sd = this.LLILZIL;
        if (c19sd != null) {
            c19sd.LJJIJLIJ(c19sd.LLLLII.getResources().getBoolean(i));
        }
    }

    public void setChipMinHeight(float f) {
        C19SD c19sd = this.LLILZIL;
        if (c19sd != null && c19sd.LLJJL != f) {
            c19sd.LLJJL = f;
            c19sd.invalidateSelf();
            c19sd.LJJIII();
        }
    }

    public void setChipMinHeightResource(int i) {
        C19SD c19sd = this.LLILZIL;
        if (c19sd != null) {
            float dimension = c19sd.LLLLII.getResources().getDimension(i);
            if (c19sd.LLJJL != dimension) {
                c19sd.LLJJL = dimension;
                c19sd.invalidateSelf();
                c19sd.LJJIII();
            }
        }
    }

    public void setChipStartPadding(float f) {
        C19SD c19sd = this.LLILZIL;
        if (c19sd != null && c19sd.LLLILZ != f) {
            c19sd.LLLILZ = f;
            c19sd.invalidateSelf();
            c19sd.LJJIII();
        }
    }

    public void setChipStartPaddingResource(int i) {
        C19SD c19sd = this.LLILZIL;
        if (c19sd != null) {
            float dimension = c19sd.LLLLII.getResources().getDimension(i);
            if (c19sd.LLLILZ != dimension) {
                c19sd.LLLILZ = dimension;
                c19sd.invalidateSelf();
                c19sd.LJJIII();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        C19SD c19sd = this.LLILZIL;
        if (c19sd != null) {
            c19sd.LJJIL(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i) {
        C19SD c19sd = this.LLILZIL;
        if (c19sd != null) {
            c19sd.LJJIL(C838410Wul.LIZIZ(i, c19sd.LLLLII));
        }
    }

    public void setChipStrokeWidth(float f) {
        C19SD c19sd = this.LLILZIL;
        if (c19sd != null) {
            c19sd.LJJIZ(f);
        }
    }

    public void setChipStrokeWidthResource(int i) {
        C19SD c19sd = this.LLILZIL;
        if (c19sd != null) {
            c19sd.LJJIZ(c19sd.LLLLII.getResources().getDimension(i));
        }
    }

    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    public void setChipTextResource(int i) {
        setText(getResources().getString(i));
    }

    public void setCloseIcon(Drawable drawable) {
        C19SD c19sd = this.LLILZIL;
        if (c19sd != null) {
            c19sd.LJJJ(drawable);
        }
        LJ();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        C19SD c19sd = this.LLILZIL;
        if (c19sd != null && c19sd.LLLII != charSequence) {
            C21627319kV c21627319kVLIZJ = C21627319kV.LIZJ();
            c19sd.LLLII = c21627319kVLIZJ.LJ(charSequence, c21627319kVLIZJ.LIZJ);
            c19sd.invalidateSelf();
        }
    }

    public void setCloseIconEnabled(boolean z) {
        setCloseIconVisible(z);
    }

    public void setCloseIconEnabledResource(int i) {
        setCloseIconVisible(i);
    }

    public void setCloseIconEndPadding(float f) {
        C19SD c19sd = this.LLILZIL;
        if (c19sd != null) {
            c19sd.LJJJI(f);
        }
    }

    public void setCloseIconEndPaddingResource(int i) {
        C19SD c19sd = this.LLILZIL;
        if (c19sd != null) {
            c19sd.LJJJI(c19sd.LLLLII.getResources().getDimension(i));
        }
    }

    public void setCloseIconResource(int i) {
        C19SD c19sd = this.LLILZIL;
        if (c19sd != null) {
            c19sd.LJJJ(C14MI.LIZ(c19sd.LLLLII, i));
        }
        LJ();
    }

    public void setCloseIconSize(float f) {
        C19SD c19sd = this.LLILZIL;
        if (c19sd != null) {
            c19sd.LJJJIL(f);
        }
    }

    public void setCloseIconSizeResource(int i) {
        C19SD c19sd = this.LLILZIL;
        if (c19sd != null) {
            c19sd.LJJJIL(c19sd.LLLLII.getResources().getDimension(i));
        }
    }

    public void setCloseIconStartPadding(float f) {
        C19SD c19sd = this.LLILZIL;
        if (c19sd != null) {
            c19sd.LJJJJ(f);
        }
    }

    public void setCloseIconStartPaddingResource(int i) {
        C19SD c19sd = this.LLILZIL;
        if (c19sd != null) {
            c19sd.LJJJJ(c19sd.LLLLII.getResources().getDimension(i));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        C19SD c19sd = this.LLILZIL;
        if (c19sd != null) {
            c19sd.LJJJJI(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i) {
        C19SD c19sd = this.LLILZIL;
        if (c19sd != null) {
            c19sd.LJJJJI(C838410Wul.LIZIZ(i, c19sd.LLLLII));
        }
    }

    public void setCloseIconVisible(int i) {
        setCloseIconVisible(getResources().getBoolean(i));
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        C19SD c19sd = this.LLILZIL;
        if (c19sd != null) {
            c19sd.LJIIJ(f);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.LLILZIL == null) {
            return;
        }
        if (truncateAt != TextUtils.TruncateAt.MARQUEE) {
            super.setEllipsize(truncateAt);
            C19SD c19sd = this.LLILZIL;
            if (c19sd != null) {
                c19sd.LLLLLZIL = truncateAt;
                return;
            }
            return;
        }
        throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        this.LLJILLL = z;
        LIZIZ(this.LLJJI);
    }

    @Override // android.widget.TextView
    public void setGravity(int i) {
        if (i == 8388627) {
            super.setGravity(i);
        }
    }

    public void setHideMotionSpec(C194T c194t) {
        C19SD c19sd = this.LLILZIL;
        if (c19sd != null) {
            c19sd.LLLIL = c194t;
        }
    }

    public void setHideMotionSpecResource(int i) {
        C19SD c19sd = this.LLILZIL;
        if (c19sd != null) {
            c19sd.LLLIL = C194T.LIZ(i, c19sd.LLLLII);
        }
    }

    public void setIconEndPadding(float f) {
        C19SD c19sd = this.LLILZIL;
        if (c19sd != null) {
            c19sd.LJJJJJ(f);
        }
    }

    public void setIconEndPaddingResource(int i) {
        C19SD c19sd = this.LLILZIL;
        if (c19sd != null) {
            c19sd.LJJJJJ(c19sd.LLLLII.getResources().getDimension(i));
        }
    }

    public void setIconStartPadding(float f) {
        C19SD c19sd = this.LLILZIL;
        if (c19sd != null) {
            c19sd.LJJJJJL(f);
        }
    }

    public void setIconStartPaddingResource(int i) {
        C19SD c19sd = this.LLILZIL;
        if (c19sd != null) {
            c19sd.LJJJJJL(c19sd.LLLLII.getResources().getDimension(i));
        }
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        if (this.LLILZIL == null) {
            return;
        }
        super.setLayoutDirection(i);
    }

    @Override // android.widget.TextView
    public void setLines(int i) {
        if (i <= 1) {
            super.setLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i) {
        if (i <= 1) {
            super.setMaxLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i) {
        super.setMaxWidth(i);
        C19SD c19sd = this.LLILZIL;
        if (c19sd != null) {
            c19sd.LLLLZ = i;
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i) {
        if (i <= 1) {
            super.setMinLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setOnCheckedChangeListenerInternal(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.LLJ = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.LLIZLLLIL = onClickListener;
        LJ();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        C19SD c19sd = this.LLILZIL;
        if (c19sd != null) {
            c19sd.LJJJJL(colorStateList);
        }
        if (!this.LLILZIL.LLLLLLZ) {
            LJFF();
        }
    }

    public void setRippleColorResource(int i) {
        C19SD c19sd = this.LLILZIL;
        if (c19sd != null) {
            c19sd.LJJJJL(C838410Wul.LIZIZ(i, c19sd.LLLLII));
            if (!this.LLILZIL.LLLLLLZ) {
                LJFF();
            }
        }
    }

    @Override // X.C19S4
    public void setShapeAppearanceModel(C19RX c19rx) {
        this.LLILZIL.setShapeAppearanceModel(c19rx);
    }

    public void setShowMotionSpec(C194T c194t) {
        C19SD c19sd = this.LLILZIL;
        if (c19sd != null) {
            c19sd.LLLIILIL = c194t;
        }
    }

    public void setShowMotionSpecResource(int i) {
        C19SD c19sd = this.LLILZIL;
        if (c19sd != null) {
            c19sd.LLLIILIL = C194T.LIZ(i, c19sd.LLLLII);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z) {
        if (z) {
            super.setSingleLine(z);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        C19SD c19sd = this.LLILZIL;
        if (c19sd != null) {
            c19sd.LLLLILI.LIZIZ(new C19Q9(c19sd.LLLLII, i), c19sd.LLLLII);
        }
        LJII();
    }

    public void setTextAppearanceResource(int i) {
        setTextAppearance(getContext(), i);
    }

    public void setTextEndPadding(float f) {
        C19SD c19sd = this.LLILZIL;
        if (c19sd != null && c19sd.LLLJ != f) {
            c19sd.LLLJ = f;
            c19sd.invalidateSelf();
            c19sd.LJJIII();
        }
    }

    public void setTextEndPaddingResource(int i) {
        C19SD c19sd = this.LLILZIL;
        if (c19sd != null) {
            float dimension = c19sd.LLLLII.getResources().getDimension(i);
            if (c19sd.LLLJ != dimension) {
                c19sd.LLLJ = dimension;
                c19sd.invalidateSelf();
                c19sd.LJJIII();
            }
        }
    }

    public void setTextStartPadding(float f) {
        C19SD c19sd = this.LLILZIL;
        if (c19sd != null && c19sd.LLLIZZ != f) {
            c19sd.LLLIZZ = f;
            c19sd.invalidateSelf();
            c19sd.LJJIII();
        }
    }

    public void setTextStartPaddingResource(int i) {
        C19SD c19sd = this.LLILZIL;
        if (c19sd != null) {
            float dimension = c19sd.LLLLII.getResources().getDimension(i);
            if (c19sd.LLLIZZ != dimension) {
                c19sd.LLLIZZ = dimension;
                c19sd.invalidateSelf();
                c19sd.LJJIII();
            }
        }
    }

    public void setCheckedIconVisible(boolean z) {
        C19SD c19sd = this.LLILZIL;
        if (c19sd != null) {
            c19sd.LJJIJ(z);
        }
    }

    public void setChipIconVisible(boolean z) {
        C19SD c19sd = this.LLILZIL;
        if (c19sd != null) {
            c19sd.LJJIJLIJ(z);
        }
    }

    public void setCloseIconVisible(boolean z) {
        C19SD c19sd = this.LLILZIL;
        if (c19sd != null) {
            c19sd.LJJJJIZL(z);
        }
        LJ();
    }

    public void setTextAppearance(C19Q9 c19q9) {
        C19SD c19sd = this.LLILZIL;
        if (c19sd != null) {
            c19sd.LLLLILI.LIZIZ(c19q9, c19sd.LLLLII);
        }
        LJII();
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.19SH] */
    public C19SE(Context context, AttributeSet attributeSet) {
        C19Q9 c19q9;
        C194T c194tLIZ;
        int resourceId;
        int resourceId2;
        int resourceId3;
        super(C1369550lk9.LIZ(context, attributeSet, com.zhiliaoapp.musically.R.attr.bgr, com.zhiliaoapp.musically.R.style.a4k), attributeSet, com.zhiliaoapp.musically.R.attr.bgr);
        this.LLJJIJI = new Rect();
        this.LLJJIJIIJIL = new RectF();
        this.LLJJIJIL = new C19QC() { // from class: X.19SH
            @Override // X.C19QC
            public final void LIZ(int i) {
            }

            @Override // X.C19QC
            public final void LIZIZ(Typeface typeface, boolean z) {
                CharSequence text;
                C19SE c19se = this.LIZ;
                C19SD c19sd = c19se.LLILZIL;
                if (c19sd.LLLLLZL) {
                    text = c19sd.LLJLL;
                } else {
                    text = c19se.getText();
                }
                c19se.setText(text);
                this.LIZ.requestLayout();
                this.LIZ.invalidate();
            }
        };
        Context context2 = getContext();
        if (attributeSet != null) {
            attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background");
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") == null) {
                if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") == null) {
                    if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") == null) {
                        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") == null) {
                            if (attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) == 1 && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) == 1 && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) == 1) {
                                attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627);
                            } else {
                                throw new UnsupportedOperationException("Chip does not support multi-line text");
                            }
                        } else {
                            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
                        }
                    } else {
                        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
                    }
                } else {
                    throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
                }
            } else {
                throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
            }
        }
        C19SD c19sd = new C19SD(context2, attributeSet);
        Context context3 = c19sd.LLLLII;
        int[] iArr = R$styleable.Chip;
        TypedArray typedArrayLIZLLL = C19PG.LIZLLL(context3, attributeSet, iArr, com.zhiliaoapp.musically.R.attr.bgr, com.zhiliaoapp.musically.R.style.a4k, new int[0]);
        c19sd.LLLLZI = typedArrayLIZLLL.hasValue(R$styleable.Chip_shapeAppearance);
        ColorStateList colorStateListLIZ = C19RN.LIZ(c19sd.LLLLII, typedArrayLIZLLL, R$styleable.Chip_chipSurfaceColor);
        if (c19sd.LLJJJJJIL != colorStateListLIZ) {
            c19sd.LLJJJJJIL = colorStateListLIZ;
            c19sd.onStateChange(c19sd.getState());
        }
        ColorStateList colorStateListLIZ2 = C19RN.LIZ(c19sd.LLLLII, typedArrayLIZLLL, R$styleable.Chip_chipBackgroundColor);
        if (c19sd.LLJJJJLIIL != colorStateListLIZ2) {
            c19sd.LLJJJJLIIL = colorStateListLIZ2;
            c19sd.onStateChange(c19sd.getState());
        }
        float dimension = typedArrayLIZLLL.getDimension(R$styleable.Chip_chipMinHeight, 0.0f);
        if (c19sd.LLJJL != dimension) {
            c19sd.LLJJL = dimension;
            c19sd.invalidateSelf();
            c19sd.LJJIII();
        }
        if (typedArrayLIZLLL.hasValue(R$styleable.Chip_chipCornerRadius)) {
            c19sd.LJJIJIIJI(typedArrayLIZLLL.getDimension(R$styleable.Chip_chipCornerRadius, 0.0f));
        }
        c19sd.LJJIL(C19RN.LIZ(c19sd.LLLLII, typedArrayLIZLLL, R$styleable.Chip_chipStrokeColor));
        c19sd.LJJIZ(typedArrayLIZLLL.getDimension(R$styleable.Chip_chipStrokeWidth, 0.0f));
        c19sd.LJJJJL(C19RN.LIZ(c19sd.LLLLII, typedArrayLIZLLL, R$styleable.Chip_rippleColor));
        String strYd = C786410Ut5.Yd(typedArrayLIZLLL, R$styleable.Chip_android_text);
        strYd = strYd == null ? "" : strYd;
        if (!TextUtils.equals(c19sd.LLJLL, strYd)) {
            c19sd.LLJLL = strYd;
            c19sd.LLLLILI.LIZLLL = true;
            c19sd.invalidateSelf();
            c19sd.LJJIII();
        }
        Context context4 = c19sd.LLLLII;
        int i = R$styleable.Chip_android_textAppearance;
        C194T c194tLIZ2 = null;
        if (typedArrayLIZLLL.hasValue(i) && (resourceId3 = typedArrayLIZLLL.getResourceId(i, 0)) != 0) {
            c19q9 = new C19Q9(context4, resourceId3);
        } else {
            c19q9 = null;
        }
        c19q9.LJIIJ = typedArrayLIZLLL.getDimension(R$styleable.Chip_android_textSize, c19q9.LJIIJ);
        c19sd.LLLLILI.LIZIZ(c19q9, c19sd.LLLLII);
        int i2 = typedArrayLIZLLL.getInt(R$styleable.Chip_android_ellipsize, 0);
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    c19sd.LLLLLZIL = TextUtils.TruncateAt.END;
                }
            } else {
                c19sd.LLLLLZIL = TextUtils.TruncateAt.MIDDLE;
            }
        } else {
            c19sd.LLLLLZIL = TextUtils.TruncateAt.START;
        }
        c19sd.LJJIJLIJ(typedArrayLIZLLL.getBoolean(R$styleable.Chip_chipIconVisible, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            c19sd.LJJIJLIJ(typedArrayLIZLLL.getBoolean(R$styleable.Chip_chipIconEnabled, false));
        }
        c19sd.LJJIJIIJIL(C19RN.LIZLLL(c19sd.LLLLII, typedArrayLIZLLL, R$styleable.Chip_chipIcon));
        if (typedArrayLIZLLL.hasValue(R$styleable.Chip_chipIconTint)) {
            c19sd.LJJIJL(C19RN.LIZ(c19sd.LLLLII, typedArrayLIZLLL, R$styleable.Chip_chipIconTint));
        }
        c19sd.LJJIJIL(typedArrayLIZLLL.getDimension(R$styleable.Chip_chipIconSize, -1.0f));
        c19sd.LJJJJIZL(typedArrayLIZLLL.getBoolean(R$styleable.Chip_closeIconVisible, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            c19sd.LJJJJIZL(typedArrayLIZLLL.getBoolean(R$styleable.Chip_closeIconEnabled, false));
        }
        c19sd.LJJJ(C19RN.LIZLLL(c19sd.LLLLII, typedArrayLIZLLL, R$styleable.Chip_closeIcon));
        c19sd.LJJJJI(C19RN.LIZ(c19sd.LLLLII, typedArrayLIZLLL, R$styleable.Chip_closeIconTint));
        c19sd.LJJJIL(typedArrayLIZLLL.getDimension(R$styleable.Chip_closeIconSize, 0.0f));
        c19sd.LJJIIJZLJL(typedArrayLIZLLL.getBoolean(R$styleable.Chip_android_checkable, false));
        c19sd.LJJIJ(typedArrayLIZLLL.getBoolean(R$styleable.Chip_checkedIconVisible, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            c19sd.LJJIJ(typedArrayLIZLLL.getBoolean(R$styleable.Chip_checkedIconEnabled, false));
        }
        c19sd.LJJIIZ(C19RN.LIZLLL(c19sd.LLLLII, typedArrayLIZLLL, R$styleable.Chip_checkedIcon));
        if (typedArrayLIZLLL.hasValue(R$styleable.Chip_checkedIconTint)) {
            c19sd.LJJIIZI(C19RN.LIZ(c19sd.LLLLII, typedArrayLIZLLL, R$styleable.Chip_checkedIconTint));
        }
        Context context5 = c19sd.LLLLII;
        int i3 = R$styleable.Chip_showMotionSpec;
        if (typedArrayLIZLLL.hasValue(i3) && (resourceId2 = typedArrayLIZLLL.getResourceId(i3, 0)) != 0) {
            c194tLIZ = C194T.LIZ(resourceId2, context5);
        } else {
            c194tLIZ = null;
        }
        c19sd.LLLIILIL = c194tLIZ;
        Context context6 = c19sd.LLLLII;
        int i4 = R$styleable.Chip_hideMotionSpec;
        if (typedArrayLIZLLL.hasValue(i4) && (resourceId = typedArrayLIZLLL.getResourceId(i4, 0)) != 0) {
            c194tLIZ2 = C194T.LIZ(resourceId, context6);
        }
        c19sd.LLLIL = c194tLIZ2;
        float dimension2 = typedArrayLIZLLL.getDimension(R$styleable.Chip_chipStartPadding, 0.0f);
        if (c19sd.LLLILZ != dimension2) {
            c19sd.LLLILZ = dimension2;
            c19sd.invalidateSelf();
            c19sd.LJJIII();
        }
        c19sd.LJJJJJL(typedArrayLIZLLL.getDimension(R$styleable.Chip_iconStartPadding, 0.0f));
        c19sd.LJJJJJ(typedArrayLIZLLL.getDimension(R$styleable.Chip_iconEndPadding, 0.0f));
        float dimension3 = typedArrayLIZLLL.getDimension(R$styleable.Chip_textStartPadding, 0.0f);
        if (c19sd.LLLIZZ != dimension3) {
            c19sd.LLLIZZ = dimension3;
            c19sd.invalidateSelf();
            c19sd.LJJIII();
        }
        float dimension4 = typedArrayLIZLLL.getDimension(R$styleable.Chip_textEndPadding, 0.0f);
        if (c19sd.LLLJ != dimension4) {
            c19sd.LLLJ = dimension4;
            c19sd.invalidateSelf();
            c19sd.LJJIII();
        }
        c19sd.LJJJJ(typedArrayLIZLLL.getDimension(R$styleable.Chip_closeIconStartPadding, 0.0f));
        c19sd.LJJJI(typedArrayLIZLLL.getDimension(R$styleable.Chip_closeIconEndPadding, 0.0f));
        float dimension5 = typedArrayLIZLLL.getDimension(R$styleable.Chip_chipEndPadding, 0.0f);
        if (c19sd.LLLL != dimension5) {
            c19sd.LLLL = dimension5;
            c19sd.invalidateSelf();
            c19sd.LJJIII();
        }
        c19sd.LLLLZ = typedArrayLIZLLL.getDimensionPixelSize(R$styleable.Chip_android_maxWidth, Integer.MAX_VALUE);
        typedArrayLIZLLL.recycle();
        TypedArray typedArrayLIZLLL2 = C19PG.LIZLLL(context2, attributeSet, iArr, com.zhiliaoapp.musically.R.attr.bgr, com.zhiliaoapp.musically.R.style.a4k, new int[0]);
        this.LLJILLL = typedArrayLIZLLL2.getBoolean(R$styleable.Chip_ensureMinTouchTargetSize, false);
        this.LLJJI = (int) Math.ceil(typedArrayLIZLLL2.getDimension(R$styleable.Chip_chipMinTouchTargetSize, (float) Math.ceil(C21551419Vw.LIZIZ(48, getContext()))));
        typedArrayLIZLLL2.recycle();
        setChipDrawable(c19sd);
        c19sd.LJIIJ(C14K9.LJIIIIZZ(this));
        TypedArray typedArrayLIZLLL3 = C19PG.LIZLLL(context2, attributeSet, iArr, com.zhiliaoapp.musically.R.attr.bgr, com.zhiliaoapp.musically.R.style.a4k, new int[0]);
        boolean zHasValue = typedArrayLIZLLL3.hasValue(R$styleable.Chip_shapeAppearance);
        typedArrayLIZLLL3.recycle();
        this.LLJJIII = new C19SF(this, this);
        LJ();
        if (!zHasValue) {
            setOutlineProvider(new ViewOutlineProvider() { // from class: X.19SI
                @Override // android.view.ViewOutlineProvider
                public final void getOutline(View view, Outline outline) {
                    C19SD c19sd2 = this.LIZ.LLILZIL;
                    if (c19sd2 != null) {
                        c19sd2.getOutline(outline);
                    } else {
                        outline.setAlpha(0.0f);
                    }
                }
            });
        }
        setChecked(this.LLJI);
        setText(c19sd.LLJLL);
        setEllipsize(c19sd.LLLLLZIL);
        LJII();
        if (!this.LLILZIL.LLLLLZL) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        LJI();
        if (this.LLJILLL) {
            setMinHeight(this.LLJJI);
        }
        this.LLJJ = getLayoutDirection();
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        if (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) {
            return PointerIcon.getSystemIcon(getContext(), 1002);
        }
        return null;
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        CharSequence charSequence2;
        C19SD c19sd = this.LLILZIL;
        if (c19sd == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        if (c19sd.LLLLLZL) {
            charSequence2 = null;
        } else {
            charSequence2 = charSequence;
        }
        super.setText(charSequence2, bufferType);
        C19SD c19sd2 = this.LLILZIL;
        if (c19sd2 != null && !TextUtils.equals(c19sd2.LLJLL, charSequence)) {
            c19sd2.LLJLL = charSequence;
            c19sd2.LLLLILI.LIZLLL = true;
            c19sd2.invalidateSelf();
            c19sd2.LJJIII();
        }
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C19SD c19sd = this.LLILZIL;
        if (c19sd != null) {
            c19sd.LLLLILI.LIZIZ(new C19Q9(c19sd.LLLLII, i), c19sd.LLLLII);
        }
        LJII();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        C19SF c19sf = this.LLJJIII;
        int i2 = c19sf.LJIIIIZZ;
        if (i2 != Integer.MIN_VALUE) {
            c19sf.LIZ(i2);
        }
        if (z) {
            c19sf.LIZLLL(i, rect);
        }
    }

    @Override // X.C21412118qt, android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable == null) {
            if (drawable3 == null) {
                super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
                return;
            }
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
    }

    @Override // X.C21412118qt, android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable == null) {
            if (drawable3 == null) {
                super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
                return;
            }
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i == 0) {
            if (i3 == 0) {
                super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
                return;
            }
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i == 0) {
            if (i3 == 0) {
                super.setCompoundDrawablesWithIntrinsicBounds(i, i2, i3, i4);
                return;
            }
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable == null) {
            if (drawable3 == null) {
                super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
                return;
            }
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable == null) {
            if (drawable3 == null) {
                super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
                return;
            }
            throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
        }
        throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
    }
}
