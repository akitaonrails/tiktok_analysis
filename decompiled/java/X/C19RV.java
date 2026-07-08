package X;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableWrapper;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.FrameLayout;
import androidx.cardview.widget.CardView;
import com.ss.android.ugc.aweme.app.R$styleable;

/* JADX INFO: renamed from: X.19RV, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public class C19RV extends CardView implements Checkable, C19S4 {
    public static final int[] LLJILJIL = {R.attr.state_checkable};
    public static final int[] LLJILJILJ = {R.attr.state_checked};
    public static final int[] LLJILLL = {com.zhiliaoapp.musically.R.attr.foc};
    public final C19RW LLIZLLLIL;
    public final boolean LLJ;
    public boolean LLJI;
    public boolean LLJIJIL;

    public void setOnCheckedChangeListener(InterfaceC1014000cUg interfaceC1014000cUg) {
    }

    private RectF getBoundsAsRectF() {
        RectF rectF = new RectF();
        rectF.set(this.LLIZLLLIL.LIZJ.getBounds());
        return rectF;
    }

    public final void LJIIIIZZ() {
        C19RW c19rw;
        Drawable drawable;
        if (Build.VERSION.SDK_INT <= 26 || (drawable = (c19rw = this.LLIZLLLIL).LJIILIIL) == null) {
            return;
        }
        Rect bounds = drawable.getBounds();
        int i = bounds.bottom;
        c19rw.LJIILIIL.setBounds(bounds.left, bounds.top, bounds.right, i - 1);
        c19rw.LJIILIIL.setBounds(bounds.left, bounds.top, bounds.right, i);
    }

    @Override // androidx.cardview.widget.CardView
    public ColorStateList getCardBackgroundColor() {
        return this.LLIZLLLIL.LIZJ.LL.LIZJ;
    }

    public ColorStateList getCardForegroundColor() {
        return this.LLIZLLLIL.LIZLLL.LL.LIZJ;
    }

    public Drawable getCheckedIcon() {
        return this.LLIZLLLIL.LJIIIIZZ;
    }

    public int getCheckedIconMargin() {
        return this.LLIZLLLIL.LJ;
    }

    public int getCheckedIconSize() {
        return this.LLIZLLLIL.LJFF;
    }

    public ColorStateList getCheckedIconTint() {
        return this.LLIZLLLIL.LJIIJ;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingBottom() {
        return this.LLIZLLLIL.LIZIZ.bottom;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingLeft() {
        return this.LLIZLLLIL.LIZIZ.left;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingRight() {
        return this.LLIZLLLIL.LIZIZ.right;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingTop() {
        return this.LLIZLLLIL.LIZIZ.top;
    }

    public float getProgress() {
        return this.LLIZLLLIL.LIZJ.LL.LJIIIZ;
    }

    @Override // androidx.cardview.widget.CardView
    public float getRadius() {
        return this.LLIZLLLIL.LIZJ.LJII();
    }

    public ColorStateList getRippleColor() {
        return this.LLIZLLLIL.LJIIIZ;
    }

    public C19RX getShapeAppearanceModel() {
        return this.LLIZLLLIL.LJIIJJI;
    }

    public int getStrokeColor() {
        ColorStateList colorStateList = this.LLIZLLLIL.LJIIL;
        if (colorStateList == null) {
            return -1;
        }
        return colorStateList.getDefaultColor();
    }

    public ColorStateList getStrokeColorStateList() {
        return this.LLIZLLLIL.LJIIL;
    }

    public int getStrokeWidth() {
        return this.LLIZLLLIL.LJI;
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        C19RW c19rw = this.LLIZLLLIL;
        if (c19rw != null && c19rw.LJIIZILJ && isEnabled()) {
            this.LLJI = !this.LLJI;
            refreshDrawableState();
            LJIIIIZZ();
        }
    }

    public float getCardViewRadius() {
        return super.getRadius();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C21539119Rd.LIZLLL(this, this.LLIZLLLIL.LIZJ);
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.LLJI;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 3);
        C19RW c19rw = this.LLIZLLLIL;
        if (c19rw != null && c19rw.LJIIZILJ) {
            FrameLayout.mergeDrawableStates(iArrOnCreateDrawableState, LLJILJIL);
        }
        if (isChecked()) {
            FrameLayout.mergeDrawableStates(iArrOnCreateDrawableState, LLJILJILJ);
        }
        if (this.LLJIJIL) {
            FrameLayout.mergeDrawableStates(iArrOnCreateDrawableState, LLJILLL);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        C19RW c19rw = this.LLIZLLLIL;
        if (c19rw != null && c19rw.LJIIZILJ) {
            z = true;
        } else {
            z = false;
        }
        accessibilityNodeInfo.setCheckable(z);
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(isChecked());
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.LLJ) {
            C19RW c19rw = this.LLIZLLLIL;
            if (!c19rw.LJIILLIIL) {
                c19rw.LJIILLIIL = true;
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    public void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(int i) {
        C19RW c19rw = this.LLIZLLLIL;
        c19rw.LIZJ.LJIIJJI(ColorStateList.valueOf(i));
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardElevation(float f) {
        super.setCardElevation(f);
        C19RW c19rw = this.LLIZLLLIL;
        c19rw.LIZJ.LJIIJ(c19rw.LIZ.getCardElevation());
    }

    public void setCardForegroundColor(ColorStateList colorStateList) {
        C21538919Rb c21538919Rb = this.LLIZLLLIL.LIZLLL;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        c21538919Rb.LJIIJJI(colorStateList);
    }

    public void setCheckable(boolean z) {
        this.LLIZLLLIL.LJIIZILJ = z;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (this.LLJI != z) {
            toggle();
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        this.LLIZLLLIL.LJ(drawable);
    }

    public void setCheckedIconMargin(int i) {
        this.LLIZLLLIL.LJ = i;
    }

    public void setCheckedIconMarginResource(int i) {
        if (i != -1) {
            this.LLIZLLLIL.LJ = getResources().getDimensionPixelSize(i);
        }
    }

    public void setCheckedIconResource(int i) {
        this.LLIZLLLIL.LJ(C14MI.LIZ(getContext(), i));
    }

    public void setCheckedIconSize(int i) {
        this.LLIZLLLIL.LJFF = i;
    }

    public void setCheckedIconSizeResource(int i) {
        if (i != 0) {
            this.LLIZLLLIL.LJFF = getResources().getDimensionPixelSize(i);
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        C19RW c19rw = this.LLIZLLLIL;
        c19rw.LJIIJ = colorStateList;
        Drawable drawable = c19rw.LJIIIIZZ;
        if (drawable != null) {
            C16GF.LJII(drawable, colorStateList);
        }
    }

    @Override // android.view.View
    public void setClickable(boolean z) {
        Drawable drawableLIZJ;
        super.setClickable(z);
        C19RW c19rw = this.LLIZLLLIL;
        if (c19rw != null) {
            Drawable drawable = c19rw.LJII;
            if (c19rw.LIZ.isClickable()) {
                drawableLIZJ = c19rw.LIZJ();
            } else {
                drawableLIZJ = c19rw.LIZLLL;
            }
            c19rw.LJII = drawableLIZJ;
            if (drawable != drawableLIZJ) {
                if (c19rw.LIZ.getForeground() instanceof InsetDrawable) {
                    ((DrawableWrapper) c19rw.LIZ.getForeground()).setDrawable(drawableLIZJ);
                } else {
                    c19rw.LIZ.setForeground(c19rw.LIZLLL(drawableLIZJ));
                }
            }
        }
    }

    public void setDragged(boolean z) {
        if (this.LLJIJIL != z) {
            this.LLJIJIL = z;
            refreshDrawableState();
            LJIIIIZZ();
            invalidate();
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setMaxCardElevation(float f) {
        super.setMaxCardElevation(f);
        this.LLIZLLLIL.LJIIIIZZ();
    }

    @Override // androidx.cardview.widget.CardView
    public void setPreventCornerOverlap(boolean z) {
        super.setPreventCornerOverlap(z);
        this.LLIZLLLIL.LJIIIIZZ();
        this.LLIZLLLIL.LJII();
    }

    public void setProgress(float f) {
        C19RW c19rw = this.LLIZLLLIL;
        c19rw.LIZJ.LJIIL(f);
        C21538919Rb c21538919Rb = c19rw.LIZLLL;
        if (c21538919Rb != null) {
            c21538919Rb.LJIIL(f);
        }
        C21538919Rb c21538919Rb2 = c19rw.LJIILL;
        if (c21538919Rb2 != null) {
            c21538919Rb2.LJIIL(f);
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setRadius(float f) {
        super.setRadius(f);
        C19RW c19rw = this.LLIZLLLIL;
        c19rw.LJFF(c19rw.LJIIJJI.LJ(f));
        c19rw.LJII.invalidateSelf();
        if (c19rw.LJI() || (c19rw.LIZ.getPreventCornerOverlap() && !c19rw.LIZJ.LJIIIZ())) {
            c19rw.LJII();
        }
        if (c19rw.LJI()) {
            c19rw.LJIIIIZZ();
        }
    }

    public void setRippleColor(ColorStateList colorStateList) {
        C19RW c19rw = this.LLIZLLLIL;
        c19rw.LJIIIZ = colorStateList;
        Drawable drawable = c19rw.LJIILIIL;
        if (drawable != null) {
            ((RippleDrawable) drawable).setColor(colorStateList);
        }
    }

    public void setRippleColorResource(int i) {
        C19RW c19rw = this.LLIZLLLIL;
        ColorStateList colorStateListLIZIZ = C838410Wul.LIZIZ(i, getContext());
        c19rw.LJIIIZ = colorStateListLIZIZ;
        Drawable drawable = c19rw.LJIILIIL;
        if (drawable != null) {
            ((RippleDrawable) drawable).setColor(colorStateListLIZIZ);
        }
    }

    @Override // X.C19S4
    public void setShapeAppearanceModel(C19RX c19rx) {
        setClipToOutline(c19rx.LIZLLL(getBoundsAsRectF()));
        this.LLIZLLLIL.LJFF(c19rx);
    }

    public void setStrokeColor(int i) {
        C19RW c19rw = this.LLIZLLLIL;
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(i);
        if (c19rw.LJIIL != colorStateListValueOf) {
            c19rw.LJIIL = colorStateListValueOf;
            C21538919Rb c21538919Rb = c19rw.LIZLLL;
            c21538919Rb.LL.LJIIJ = c19rw.LJI;
            c21538919Rb.invalidateSelf();
            C21539019Rc c21539019Rc = c21538919Rb.LL;
            if (c21539019Rc.LIZLLL != colorStateListValueOf) {
                c21539019Rc.LIZLLL = colorStateListValueOf;
                c21538919Rb.onStateChange(c21538919Rb.getState());
            }
        }
    }

    public void setStrokeWidth(int i) {
        C19RW c19rw = this.LLIZLLLIL;
        if (i != c19rw.LJI) {
            c19rw.LJI = i;
            C21538919Rb c21538919Rb = c19rw.LIZLLL;
            ColorStateList colorStateList = c19rw.LJIIL;
            c21538919Rb.LL.LJIIJ = i;
            c21538919Rb.invalidateSelf();
            C21539019Rc c21539019Rc = c21538919Rb.LL;
            if (c21539019Rc.LIZLLL != colorStateList) {
                c21539019Rc.LIZLLL = colorStateList;
                c21538919Rb.onStateChange(c21538919Rb.getState());
            }
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setUseCompatPadding(boolean z) {
        super.setUseCompatPadding(z);
        this.LLIZLLLIL.LJIIIIZZ();
        this.LLIZLLLIL.LJII();
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(ColorStateList colorStateList) {
        this.LLIZLLLIL.LIZJ.LJIIJJI(colorStateList);
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        C19RW c19rw = this.LLIZLLLIL;
        if (c19rw.LJIIL != colorStateList) {
            c19rw.LJIIL = colorStateList;
            C21538919Rb c21538919Rb = c19rw.LIZLLL;
            c21538919Rb.LL.LJIIJ = c19rw.LJI;
            c21538919Rb.invalidateSelf();
            C21539019Rc c21539019Rc = c21538919Rb.LL;
            if (c21539019Rc.LIZLLL != colorStateList) {
                c21539019Rc.LIZLLL = colorStateList;
                c21538919Rb.onStateChange(c21538919Rb.getState());
            }
        }
    }

    public C19RV(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.zhiliaoapp.musically.R.attr.f3q);
    }

    @Override // androidx.cardview.widget.CardView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        float fLIZ;
        super.onMeasure(i, i2);
        C19RW c19rw = this.LLIZLLLIL;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (c19rw.LJIILJJIL != null) {
            int i4 = c19rw.LJ;
            int i5 = c19rw.LJFF;
            int iCeil = (measuredWidth - i4) - i5;
            int iCeil2 = (measuredHeight - i4) - i5;
            if (c19rw.LIZ.getUseCompatPadding()) {
                float maxCardElevation = c19rw.LIZ.getMaxCardElevation() * 1.5f;
                float fLIZ2 = 0.0f;
                if (c19rw.LJI()) {
                    fLIZ = c19rw.LIZ();
                } else {
                    fLIZ = 0.0f;
                }
                iCeil2 -= (int) Math.ceil((maxCardElevation + fLIZ) * 2.0f);
                float maxCardElevation2 = c19rw.LIZ.getMaxCardElevation();
                if (c19rw.LJI()) {
                    fLIZ2 = c19rw.LIZ();
                }
                iCeil -= (int) Math.ceil((maxCardElevation2 + fLIZ2) * 2.0f);
            }
            int i6 = c19rw.LJ;
            if (c19rw.LIZ.getLayoutDirection() == 1) {
                i3 = i6;
            } else {
                i3 = iCeil;
                iCeil = i6;
            }
            c19rw.LJIILJJIL.setLayerInset(2, i3, c19rw.LJ, iCeil, iCeil2);
        }
    }

    public C19RV(Context context, AttributeSet attributeSet, int i) {
        Drawable drawableLIZJ;
        super(C1369550lk9.LIZ(context, attributeSet, i, com.zhiliaoapp.musically.R.style.a4i), attributeSet, i);
        this.LLJI = false;
        this.LLJIJIL = false;
        this.LLJ = true;
        TypedArray typedArrayLIZLLL = C19PG.LIZLLL(getContext(), attributeSet, R$styleable.MaterialCardView, i, com.zhiliaoapp.musically.R.style.a4i, new int[0]);
        C19RW c19rw = new C19RW(this, attributeSet, i);
        this.LLIZLLLIL = c19rw;
        c19rw.LIZJ.LJIIJJI(super.getCardBackgroundColor());
        c19rw.LIZIZ.set(super.getContentPaddingLeft(), super.getContentPaddingTop(), super.getContentPaddingRight(), super.getContentPaddingBottom());
        c19rw.LJII();
        ColorStateList colorStateListLIZ = C19RN.LIZ(c19rw.LIZ.getContext(), typedArrayLIZLLL, R$styleable.MaterialCardView_strokeColor);
        c19rw.LJIIL = colorStateListLIZ;
        if (colorStateListLIZ == null) {
            c19rw.LJIIL = ColorStateList.valueOf(-1);
        }
        c19rw.LJI = typedArrayLIZLLL.getDimensionPixelSize(R$styleable.MaterialCardView_strokeWidth, 0);
        boolean z = typedArrayLIZLLL.getBoolean(R$styleable.MaterialCardView_android_checkable, false);
        c19rw.LJIIZILJ = z;
        c19rw.LIZ.setLongClickable(z);
        c19rw.LJIIJ = C19RN.LIZ(c19rw.LIZ.getContext(), typedArrayLIZLLL, R$styleable.MaterialCardView_checkedIconTint);
        c19rw.LJ(C19RN.LIZLLL(c19rw.LIZ.getContext(), typedArrayLIZLLL, R$styleable.MaterialCardView_checkedIcon));
        c19rw.LJFF = typedArrayLIZLLL.getDimensionPixelSize(R$styleable.MaterialCardView_checkedIconSize, 0);
        c19rw.LJ = typedArrayLIZLLL.getDimensionPixelSize(R$styleable.MaterialCardView_checkedIconMargin, 0);
        ColorStateList colorStateListLIZ2 = C19RN.LIZ(c19rw.LIZ.getContext(), typedArrayLIZLLL, R$styleable.MaterialCardView_rippleColor);
        c19rw.LJIIIZ = colorStateListLIZ2;
        if (colorStateListLIZ2 == null) {
            c19rw.LJIIIZ = ColorStateList.valueOf(C19PM.LIZIZ(com.zhiliaoapp.musically.R.attr.big, c19rw.LIZ));
        }
        ColorStateList colorStateListLIZ3 = C19RN.LIZ(c19rw.LIZ.getContext(), typedArrayLIZLLL, R$styleable.MaterialCardView_cardForegroundColor);
        c19rw.LIZLLL.LJIIJJI(colorStateListLIZ3 == null ? ColorStateList.valueOf(0) : colorStateListLIZ3);
        Drawable drawable = c19rw.LJIILIIL;
        if (drawable != null) {
            ((RippleDrawable) drawable).setColor(c19rw.LJIIIZ);
        }
        c19rw.LIZJ.LJIIJ(c19rw.LIZ.getCardElevation());
        C21538919Rb c21538919Rb = c19rw.LIZLLL;
        float f = c19rw.LJI;
        ColorStateList colorStateList = c19rw.LJIIL;
        c21538919Rb.LL.LJIIJ = f;
        c21538919Rb.invalidateSelf();
        C21539019Rc c21539019Rc = c21538919Rb.LL;
        if (c21539019Rc.LIZLLL != colorStateList) {
            c21539019Rc.LIZLLL = colorStateList;
            c21538919Rb.onStateChange(c21538919Rb.getState());
        }
        c19rw.LIZ.setBackgroundInternal(c19rw.LIZLLL(c19rw.LIZJ));
        if (c19rw.LIZ.isClickable()) {
            drawableLIZJ = c19rw.LIZJ();
        } else {
            drawableLIZJ = c19rw.LIZLLL;
        }
        c19rw.LJII = drawableLIZJ;
        c19rw.LIZ.setForeground(c19rw.LIZLLL(drawableLIZJ));
        typedArrayLIZLLL.recycle();
    }

    @Override // androidx.cardview.widget.CardView
    public final void LJII(int i, int i2, int i3, int i4) {
        C19RW c19rw = this.LLIZLLLIL;
        c19rw.LIZIZ.set(i, i2, i3, i4);
        c19rw.LJII();
    }

    public final void LJIIIZ(int i, int i2, int i3, int i4) {
        super.LJII(i, i2, i3, i4);
    }
}
