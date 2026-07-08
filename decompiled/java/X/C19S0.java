package X;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcelable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import com.google.android.material.button.MaterialButton$SavedState;
import com.ss.android.ugc.aweme.app.R$styleable;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: X.19S0, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public class C19S0 extends C21410218qa implements Checkable, C19S4 {
    public static final int[] LLJILLL = {R.attr.state_checkable};
    public static final int[] LLJJ = {R.attr.state_checked};
    public final C19S1 LL;
    public final LinkedHashSet<C19S3> LLILLJJLI;
    public C19S5 LLILLL;
    public PorterDuff.Mode LLILZ;
    public ColorStateList LLILZIL;
    public Drawable LLILZLL;
    public int LLIZ;
    public int LLIZLLLIL;
    public int LLJ;
    public int LLJI;
    public boolean LLJIJIL;
    public boolean LLJILJIL;
    public int LLJILJILJ;

    private String getA11yClassName() {
        C19S1 c19s1 = this.LL;
        return ((c19s1 == null || !c19s1.LJIILLIIL) ? Button.class : CompoundButton.class).getName();
    }

    public final boolean LIZ() {
        C19S1 c19s1 = this.LL;
        return (c19s1 == null || c19s1.LJIILJJIL) ? false : true;
    }

    public final void LIZIZ() {
        int i = this.LLJILJILJ;
        if (i == 1 || i == 2) {
            setCompoundDrawablesRelative(this.LLILZLL, null, null, null);
            return;
        }
        if (i == 3 || i == 4) {
            setCompoundDrawablesRelative(null, null, this.LLILZLL, null);
        } else if (i == 16 || i == 32) {
            setCompoundDrawablesRelative(null, this.LLILZLL, null, null);
        }
    }

    public int getInsetBottom() {
        return this.LL.LJFF;
    }

    public int getInsetTop() {
        return this.LL.LJ;
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.LLJIJIL);
    }

    private int getTextHeight() {
        TextPaint paint = getPaint();
        String string = getText().toString();
        if (getTransformationMethod() != null) {
            string = getTransformationMethod().getTransformation(string, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(string, 0, string.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextWidth() {
        TextPaint paint = getPaint();
        String string = getText().toString();
        if (getTransformationMethod() != null) {
            string = getTransformationMethod().getTransformation(string, this).toString();
        }
        return Math.min((int) paint.measureText(string), getLayout().getEllipsizedWidth());
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (LIZ()) {
            return this.LL.LJI;
        }
        return 0;
    }

    public ColorStateList getRippleColor() {
        if (LIZ()) {
            return this.LL.LJIIJJI;
        }
        return null;
    }

    public C19RX getShapeAppearanceModel() {
        if (LIZ()) {
            return this.LL.LIZIZ;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (LIZ()) {
            return this.LL.LJIIJ;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (LIZ()) {
            return this.LL.LJII;
        }
        return 0;
    }

    @Override // X.C21410218qa
    public ColorStateList getSupportBackgroundTintList() {
        return LIZ() ? this.LL.LJIIIZ : super.getSupportBackgroundTintList();
    }

    @Override // X.C21410218qa
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return LIZ() ? this.LL.LJIIIIZZ : super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (LIZ()) {
            C21539119Rd.LIZLLL(this, this.LL.LIZIZ(false));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        MaterialButton$SavedState materialButton$SavedState = new MaterialButton$SavedState(super.onSaveInstanceState());
        materialButton$SavedState.LL = this.LLJIJIL;
        return materialButton$SavedState;
    }

    @Override // android.view.View
    public final boolean performClick() {
        toggle();
        return super.performClick();
    }

    public Drawable getIcon() {
        return this.LLILZLL;
    }

    public int getIconGravity() {
        return this.LLJILJILJ;
    }

    public int getIconPadding() {
        return this.LLJI;
    }

    public int getIconSize() {
        return this.LLIZ;
    }

    public ColorStateList getIconTint() {
        return this.LLILZIL;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.LLILZ;
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.LLJIJIL;
    }

    private void LIZJ(boolean z) {
        Drawable drawable = this.LLILZLL;
        if (drawable != null) {
            Drawable drawableMutate = drawable.mutate();
            this.LLILZLL = drawableMutate;
            C16GF.LJII(drawableMutate, this.LLILZIL);
            PorterDuff.Mode mode = this.LLILZ;
            if (mode != null) {
                C16GF.LJIIIIZZ(this.LLILZLL, mode);
            }
            int intrinsicWidth = this.LLIZ;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.LLILZLL.getIntrinsicWidth();
            }
            int intrinsicHeight = this.LLIZ;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.LLILZLL.getIntrinsicHeight();
            }
            Drawable drawable2 = this.LLILZLL;
            int i = this.LLIZLLLIL;
            int i2 = this.LLJ;
            drawable2.setBounds(i, i2, intrinsicWidth + i, intrinsicHeight + i2);
        }
        if (z) {
            LIZIZ();
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[1];
        Drawable drawable5 = compoundDrawablesRelative[2];
        int i3 = this.LLJILJILJ;
        if (((i3 == 1 || i3 == 2) && drawable3 != this.LLILZLL) || (((i3 == 3 || i3 == 4) && drawable5 != this.LLILZLL) || ((i3 == 16 || i3 == 32) && drawable4 != this.LLILZLL))) {
            LIZIZ();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        C19S1 c19s1 = this.LL;
        if (c19s1 != null && c19s1.LJIILLIIL) {
            Button.mergeDrawableStates(iArrOnCreateDrawableState, LLJILLL);
        }
        if (isChecked()) {
            Button.mergeDrawableStates(iArrOnCreateDrawableState, LLJJ);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // X.C21410218qa, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // X.C21410218qa, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        C19S1 c19s1 = this.LL;
        if (c19s1 != null && c19s1.LJIILLIIL) {
            z = true;
        } else {
            z = false;
        }
        accessibilityNodeInfo.setCheckable(z);
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof MaterialButton$SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        MaterialButton$SavedState materialButton$SavedState = (MaterialButton$SavedState) parcelable;
        super.onRestoreInstanceState(materialButton$SavedState.mSuperState);
        setChecked(materialButton$SavedState.LL);
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (LIZ()) {
            C19S1 c19s1 = this.LL;
            if (c19s1.LIZIZ(false) != null) {
                c19s1.LIZIZ(false).setTint(i);
                return;
            }
            return;
        }
        super.setBackgroundColor(i);
    }

    @Override // X.C21410218qa, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (LIZ()) {
            if (drawable != getBackground()) {
                C19S1 c19s1 = this.LL;
                c19s1.LJIILJJIL = true;
                c19s1.LIZ.setSupportBackgroundTintList(c19s1.LJIIIZ);
                c19s1.LIZ.setSupportBackgroundTintMode(c19s1.LJIIIIZZ);
                super.setBackgroundDrawable(drawable);
                return;
            }
            getBackground().setState(drawable.getState());
            return;
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // X.C21410218qa, android.view.View
    public void setBackgroundResource(int i) {
        Drawable drawableLIZ;
        if (i != 0) {
            drawableLIZ = C14MI.LIZ(getContext(), i);
        } else {
            drawableLIZ = null;
        }
        setBackgroundDrawable(drawableLIZ);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z) {
        if (LIZ()) {
            this.LL.LJIILLIIL = z;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        C19S1 c19s1 = this.LL;
        if (c19s1 != null && c19s1.LJIILLIIL && isEnabled() && this.LLJIJIL != z) {
            this.LLJIJIL = z;
            refreshDrawableState();
            if (this.LLJILJIL) {
                return;
            }
            this.LLJILJIL = true;
            Iterator<C19S3> it2 = this.LLILLJJLI.iterator();
            while (it2.hasNext()) {
                it2.next().LIZ(this, this.LLJIJIL);
            }
            this.LLJILJIL = false;
        }
    }

    public void setCornerRadius(int i) {
        if (LIZ()) {
            C19S1 c19s1 = this.LL;
            if (!c19s1.LJIILL || c19s1.LJI != i) {
                c19s1.LJI = i;
                c19s1.LJIILL = true;
                c19s1.LIZJ(c19s1.LIZIZ.LJ(i));
            }
        }
    }

    public void setCornerRadiusResource(int i) {
        if (LIZ()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        if (LIZ()) {
            this.LL.LIZIZ(false).LJIIJ(f);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.LLILZLL != drawable) {
            this.LLILZLL = drawable;
            LIZJ(true);
            LIZLLL(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i) {
        if (this.LLJILJILJ != i) {
            this.LLJILJILJ = i;
            LIZLLL(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i) {
        if (this.LLJI != i) {
            this.LLJI = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        Drawable drawableLIZ;
        if (i != 0) {
            drawableLIZ = C14MI.LIZ(getContext(), i);
        } else {
            drawableLIZ = null;
        }
        setIcon(drawableLIZ);
    }

    public void setIconSize(int i) {
        if (i >= 0) {
            if (this.LLIZ != i) {
                this.LLIZ = i;
                LIZJ(true);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("iconSize cannot be less than 0");
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.LLILZIL != colorStateList) {
            this.LLILZIL = colorStateList;
            LIZJ(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.LLILZ != mode) {
            this.LLILZ = mode;
            LIZJ(false);
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(C838410Wul.LIZIZ(i, getContext()));
    }

    public void setInsetBottom(int i) {
        C19S1 c19s1 = this.LL;
        c19s1.LIZLLL(c19s1.LJ, i);
    }

    public void setInsetTop(int i) {
        C19S1 c19s1 = this.LL;
        c19s1.LIZLLL(i, c19s1.LJFF);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(C19S5 c19s5) {
        this.LLILLL = c19s5;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        C19S5 c19s5 = this.LLILLL;
        if (c19s5 != null) {
            ((C19S2) c19s5).LIZ.invalidate();
        }
        super.setPressed(z);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (LIZ()) {
            C19S1 c19s1 = this.LL;
            if (c19s1.LJIIJJI != colorStateList) {
                c19s1.LJIIJJI = colorStateList;
                if (c19s1.LIZ.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) c19s1.LIZ.getBackground()).setColor(C19Q7.LIZJ(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i) {
        if (LIZ()) {
            setRippleColor(C838410Wul.LIZIZ(i, getContext()));
        }
    }

    @Override // X.C19S4
    public void setShapeAppearanceModel(C19RX c19rx) {
        if (LIZ()) {
            this.LL.LIZJ(c19rx);
            return;
        }
        throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
    }

    public void setShouldDrawSurfaceColorStroke(boolean z) {
        if (LIZ()) {
            C19S1 c19s1 = this.LL;
            c19s1.LJIILIIL = z;
            c19s1.LJFF();
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (LIZ()) {
            C19S1 c19s1 = this.LL;
            if (c19s1.LJIIJ != colorStateList) {
                c19s1.LJIIJ = colorStateList;
                c19s1.LJFF();
            }
        }
    }

    public void setStrokeColorResource(int i) {
        if (LIZ()) {
            setStrokeColor(C838410Wul.LIZIZ(i, getContext()));
        }
    }

    public void setStrokeWidth(int i) {
        if (LIZ()) {
            C19S1 c19s1 = this.LL;
            if (c19s1.LJII != i) {
                c19s1.LJII = i;
                c19s1.LJFF();
            }
        }
    }

    public void setStrokeWidthResource(int i) {
        if (LIZ()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // X.C21410218qa
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (LIZ()) {
            C19S1 c19s1 = this.LL;
            if (c19s1.LJIIIZ != colorStateList) {
                c19s1.LJIIIZ = colorStateList;
                if (c19s1.LIZIZ(false) != null) {
                    C16GF.LJII(c19s1.LIZIZ(false), c19s1.LJIIIZ);
                    return;
                }
                return;
            }
            return;
        }
        super.setSupportBackgroundTintList(colorStateList);
    }

    @Override // X.C21410218qa
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (LIZ()) {
            C19S1 c19s1 = this.LL;
            if (c19s1.LJIIIIZZ != mode) {
                c19s1.LJIIIIZZ = mode;
                if (c19s1.LIZIZ(false) != null && c19s1.LJIIIIZZ != null) {
                    C16GF.LJIIIIZZ(c19s1.LIZIZ(false), c19s1.LJIIIIZZ);
                    return;
                }
                return;
            }
            return;
        }
        super.setSupportBackgroundTintMode(mode);
    }

    public C19S0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void LIZLLL(int i, int i2) {
        boolean z;
        boolean z2;
        if (this.LLILZLL != null && getLayout() != null) {
            int i3 = this.LLJILJILJ;
            boolean z3 = true;
            if (i3 != 1 && i3 != 2) {
                z = false;
            } else {
                z = true;
            }
            if (!z && i3 != 3 && i3 != 4) {
                if (i3 == 16 || i3 == 32) {
                    this.LLIZLLLIL = 0;
                    if (i3 == 16) {
                        this.LLJ = 0;
                        LIZJ(false);
                        return;
                    }
                    int intrinsicHeight = this.LLIZ;
                    if (intrinsicHeight == 0) {
                        intrinsicHeight = this.LLILZLL.getIntrinsicHeight();
                    }
                    int textHeight = (((((i2 - getTextHeight()) - getPaddingTop()) - intrinsicHeight) - this.LLJI) - getPaddingBottom()) / 2;
                    if (this.LLJ != textHeight) {
                        this.LLJ = textHeight;
                        LIZJ(false);
                        return;
                    }
                    return;
                }
                return;
            }
            this.LLJ = 0;
            if (i3 != 1 && i3 != 3) {
                int intrinsicWidth = this.LLIZ;
                if (intrinsicWidth == 0) {
                    intrinsicWidth = this.LLILZLL.getIntrinsicWidth();
                }
                int textWidth = (((((i - getTextWidth()) - getPaddingEnd()) - intrinsicWidth) - this.LLJI) - getPaddingStart()) / 2;
                if (getLayoutDirection() == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (this.LLJILJILJ != 4) {
                    z3 = false;
                }
                if (z2 != z3) {
                    textWidth = -textWidth;
                }
                if (this.LLIZLLLIL != textWidth) {
                    this.LLIZLLLIL = textWidth;
                    LIZJ(false);
                    return;
                }
                return;
            }
            this.LLIZLLLIL = 0;
            LIZJ(false);
        }
    }

    public C19S0(Context context, AttributeSet attributeSet, int i) {
        super(C1369550lk9.LIZ(context, attributeSet, com.zhiliaoapp.musically.R.attr.f3a, com.zhiliaoapp.musically.R.style.a47), attributeSet, com.zhiliaoapp.musically.R.attr.f3a);
        this.LLILLJJLI = new LinkedHashSet<>();
        this.LLJIJIL = false;
        this.LLJILJIL = false;
        Context context2 = getContext();
        TypedArray typedArrayLIZLLL = C19PG.LIZLLL(context2, attributeSet, R$styleable.MaterialButton, com.zhiliaoapp.musically.R.attr.f3a, com.zhiliaoapp.musically.R.style.a47, new int[0]);
        this.LLJI = typedArrayLIZLLL.getDimensionPixelSize(R$styleable.MaterialButton_iconPadding, 0);
        this.LLILZ = C21551419Vw.LIZLLL(typedArrayLIZLLL.getInt(R$styleable.MaterialButton_iconTintMode, -1), PorterDuff.Mode.SRC_IN);
        this.LLILZIL = C19RN.LIZ(getContext(), typedArrayLIZLLL, R$styleable.MaterialButton_iconTint);
        this.LLILZLL = C19RN.LIZLLL(getContext(), typedArrayLIZLLL, R$styleable.MaterialButton_icon);
        this.LLJILJILJ = typedArrayLIZLLL.getInteger(R$styleable.MaterialButton_iconGravity, 1);
        this.LLIZ = typedArrayLIZLLL.getDimensionPixelSize(R$styleable.MaterialButton_iconSize, 0);
        C19S1 c19s1 = new C19S1(this, new C19RX(C19RX.LIZIZ(context2, attributeSet, com.zhiliaoapp.musically.R.attr.f3a, com.zhiliaoapp.musically.R.style.a47)));
        this.LL = c19s1;
        c19s1.LIZJ = typedArrayLIZLLL.getDimensionPixelOffset(R$styleable.MaterialButton_android_insetLeft, 0);
        c19s1.LIZLLL = typedArrayLIZLLL.getDimensionPixelOffset(R$styleable.MaterialButton_android_insetRight, 0);
        c19s1.LJ = typedArrayLIZLLL.getDimensionPixelOffset(R$styleable.MaterialButton_android_insetTop, 0);
        c19s1.LJFF = typedArrayLIZLLL.getDimensionPixelOffset(R$styleable.MaterialButton_android_insetBottom, 0);
        if (typedArrayLIZLLL.hasValue(R$styleable.MaterialButton_cornerRadius)) {
            int dimensionPixelSize = typedArrayLIZLLL.getDimensionPixelSize(R$styleable.MaterialButton_cornerRadius, -1);
            c19s1.LJI = dimensionPixelSize;
            c19s1.LIZJ(c19s1.LIZIZ.LJ(dimensionPixelSize));
            c19s1.LJIILL = true;
        }
        c19s1.LJII = typedArrayLIZLLL.getDimensionPixelSize(R$styleable.MaterialButton_strokeWidth, 0);
        c19s1.LJIIIIZZ = C21551419Vw.LIZLLL(typedArrayLIZLLL.getInt(R$styleable.MaterialButton_backgroundTintMode, -1), PorterDuff.Mode.SRC_IN);
        c19s1.LJIIIZ = C19RN.LIZ(getContext(), typedArrayLIZLLL, R$styleable.MaterialButton_backgroundTint);
        c19s1.LJIIJ = C19RN.LIZ(getContext(), typedArrayLIZLLL, R$styleable.MaterialButton_strokeColor);
        c19s1.LJIIJJI = C19RN.LIZ(getContext(), typedArrayLIZLLL, R$styleable.MaterialButton_rippleColor);
        c19s1.LJIILLIIL = typedArrayLIZLLL.getBoolean(R$styleable.MaterialButton_android_checkable, false);
        c19s1.LJIJ = typedArrayLIZLLL.getDimensionPixelSize(R$styleable.MaterialButton_elevation, 0);
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int paddingEnd = getPaddingEnd();
        int paddingBottom = getPaddingBottom();
        if (typedArrayLIZLLL.hasValue(R$styleable.MaterialButton_android_background)) {
            c19s1.LJIILJJIL = true;
            setSupportBackgroundTintList(c19s1.LJIIIZ);
            setSupportBackgroundTintMode(c19s1.LJIIIIZZ);
        } else {
            c19s1.LJ();
        }
        setPaddingRelative(paddingStart + c19s1.LIZJ, paddingTop + c19s1.LJ, paddingEnd + c19s1.LIZLLL, paddingBottom + c19s1.LJFF);
        typedArrayLIZLLL.recycle();
        setCompoundDrawablePadding(this.LLJI);
        LIZJ(this.LLILZLL != null);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        LIZLLL(i, i2);
    }

    @Override // X.C21410218qa, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        LIZLLL(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // X.C21410218qa, android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }
}
