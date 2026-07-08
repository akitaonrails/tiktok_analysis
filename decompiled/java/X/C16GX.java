package X;

import android.animation.AnimatorInflater;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.LinearLayout;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.material.appbar.AppBarLayout$Behavior;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: X.16GX, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public class C16GX extends LinearLayout implements C16G4 {
    public int LL;
    public int LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public boolean LLILZIL;
    public int LLILZLL;
    public C20246014Ju LLIZ;
    public List<InterfaceC1324380kZI> LLIZLLLIL;
    public boolean LLJ;
    public boolean LLJI;
    public boolean LLJIJIL;
    public int LLJILJIL;
    public WeakReference<View> LLJILJILJ;
    public ValueAnimator LLJILLL;
    public int[] LLJJ;
    public Drawable LLJJI;

    public C16GX() {
        throw null;
    }

    public float getTargetElevation() {
        return 0.0f;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C16GZ(-2);
    }

    public C16BC<C16GX> getBehavior() {
        return new AppBarLayout$Behavior();
    }

    public int getDownNestedPreScrollRange() {
        int iMin;
        int minimumHeight;
        int i = this.LLILLL;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            C16GZ c16gz = (C16GZ) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i3 = c16gz.LIZ;
            if ((i3 & 5) != 5) {
                if (i2 > 0) {
                    break;
                }
            } else {
                int i4 = ((LinearLayout.LayoutParams) c16gz).topMargin + ((LinearLayout.LayoutParams) c16gz).bottomMargin;
                if ((i3 & 8) != 0) {
                    minimumHeight = childAt.getMinimumHeight();
                } else if ((i3 & 2) != 0) {
                    minimumHeight = measuredHeight - childAt.getMinimumHeight();
                } else {
                    iMin = i4 + measuredHeight;
                    if (childCount == 0 && childAt.getFitsSystemWindows()) {
                        iMin = Math.min(iMin, measuredHeight - getTopInset());
                    }
                    i2 += iMin;
                }
                iMin = i4 + minimumHeight;
                if (childCount == 0) {
                    iMin = Math.min(iMin, measuredHeight - getTopInset());
                }
                i2 += iMin;
            }
        }
        int iMax = Math.max(0, i2);
        this.LLILLL = iMax;
        return iMax;
    }

    public int getDownNestedScrollRange() {
        int i = this.LLILZ;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int minimumHeight = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            C16GZ c16gz = (C16GZ) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + ((LinearLayout.LayoutParams) c16gz).topMargin + ((LinearLayout.LayoutParams) c16gz).bottomMargin;
            int i3 = c16gz.LIZ;
            if ((i3 & 1) == 0) {
                break;
            }
            minimumHeight += measuredHeight;
            if ((i3 & 2) != 0) {
                minimumHeight -= childAt.getMinimumHeight();
                break;
            }
            i2++;
        }
        int iMax = Math.max(0, minimumHeight);
        this.LLILZ = iMax;
        return iMax;
    }

    public final int getTopInset() {
        C20246014Ju c20246014Ju = this.LLIZ;
        if (c20246014Ju != null) {
            return c20246014Ju.LJFF();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i = this.LLILLJJLI;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int minimumHeight = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            C16GZ c16gz = (C16GZ) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i3 = c16gz.LIZ;
            if ((i3 & 1) == 0) {
                break;
            }
            minimumHeight += measuredHeight + ((LinearLayout.LayoutParams) c16gz).topMargin + ((LinearLayout.LayoutParams) c16gz).bottomMargin;
            if (i2 == 0 && childAt.getFitsSystemWindows()) {
                minimumHeight -= getTopInset();
            }
            if ((i3 & 2) != 0) {
                minimumHeight -= childAt.getMinimumHeight();
                break;
            }
            i2++;
        }
        int iMax = Math.max(0, minimumHeight);
        this.LLILLJJLI = iMax;
        return iMax;
    }

    public final boolean LJII() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        return (childAt.getVisibility() == 8 || childAt.getFitsSystemWindows()) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.LLJJI;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int childCount;
        int topInset = getTopInset();
        int minimumHeight = getMinimumHeight();
        return (minimumHeight != 0 || ((childCount = getChildCount()) >= 1 && (minimumHeight = getChildAt(childCount - 1).getMinimumHeight()) != 0)) ? (minimumHeight * 2) + topInset : getHeight() / 3;
    }

    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C21539119Rd.LIZJ(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        WeakReference<View> weakReference = this.LLJILJILJ;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.LLJILJILJ = null;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.LLJILJIL;
    }

    public int getPendingAction() {
        return this.LLILZLL;
    }

    public Drawable getStatusBarForeground() {
        return this.LLJJI;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final LinearLayout.LayoutParams generateDefaultLayoutParams() {
        return new C16GZ(-2);
    }

    public static C16GZ LIZIZ(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            return new C16GZ((LinearLayout.LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C16GZ((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C16GZ(layoutParams);
    }

    public final void LIZ(InterfaceC1324370kZH interfaceC1324370kZH) {
        if (this.LLIZLLLIL == null) {
            this.LLIZLLLIL = new ArrayList();
        }
        if (interfaceC1324370kZH != null && !((ArrayList) this.LLIZLLLIL).contains(interfaceC1324370kZH)) {
            ((ArrayList) this.LLIZLLLIL).add(interfaceC1324370kZH);
        }
    }

    public final void LIZJ(int i) {
        this.LL = i;
        if (!willNotDraw()) {
            postInvalidateOnAnimation();
        }
        List<InterfaceC1324380kZI> list = this.LLIZLLLIL;
        if (list != null) {
            int size = ((ArrayList) list).size();
            for (int i2 = 0; i2 < size; i2++) {
                InterfaceC1324380kZI interfaceC1324380kZI = (InterfaceC1324380kZI) ListProtector.get(this.LLIZLLLIL, i2);
                if (interfaceC1324380kZI != null) {
                    interfaceC1324380kZI.LLZZJLIL(this, i);
                }
            }
        }
    }

    public final void LIZLLL(InterfaceC1324370kZH interfaceC1324370kZH) {
        List<InterfaceC1324380kZI> list = this.LLIZLLLIL;
        if (list != null && interfaceC1324370kZH != null) {
            ((ArrayList) list).remove(interfaceC1324370kZH);
        }
    }

    public final boolean LJFF(boolean z) {
        float f;
        if (this.LLJI == z) {
            return false;
        }
        this.LLJI = z;
        refreshDrawableState();
        if (this.LLJIJIL && (getBackground() instanceof C21538919Rb)) {
            final C21538919Rb c21538919Rb = (C21538919Rb) getBackground();
            float dimension = getResources().getDimension(R.dimen.q6);
            if (z) {
                f = 0.0f;
            } else {
                f = dimension;
                dimension = 0.0f;
            }
            ValueAnimator valueAnimator = this.LLJILLL;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, dimension);
            this.LLJILLL = valueAnimatorOfFloat;
            valueAnimatorOfFloat.setDuration(getResources().getInteger(R.integer.ag));
            this.LLJILLL.setInterpolator(C194V.LIZ);
            this.LLJILLL.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.12Md
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    c21538919Rb.LJIIJ(((Float) valueAnimator2.getAnimatedValue()).floatValue());
                }
            });
            this.LLJILLL.start();
        }
        return true;
    }

    public final boolean LJI(View view) {
        View view2;
        int i;
        View viewFindViewById;
        if (this.LLJILJILJ == null && (i = this.LLJILJIL) != -1 && ((view != null && (viewFindViewById = view.findViewById(i)) != null) || ((getParent() instanceof ViewGroup) && (viewFindViewById = ((View) getParent()).findViewById(this.LLJILJIL)) != null))) {
            this.LLJILJILJ = new WeakReference<>(viewFindViewById);
        }
        WeakReference<View> weakReference = this.LLJILJILJ;
        if (weakReference != null && (view2 = weakReference.get()) != null) {
            view = view2;
        } else if (view == null) {
            return false;
        }
        if (view.canScrollVertically(-1) || view.getScrollY() > 0) {
            return true;
        }
        return false;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C16GZ;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.LLJJI != null && getTopInset() > 0) {
            int iSave = canvas.save();
            canvas.translate(0.0f, -this.LL);
            this.LLJJI.draw(canvas);
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C16GZ(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        if (this.LLJJ == null) {
            this.LLJJ = new int[4];
        }
        int[] iArr = this.LLJJ;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + iArr.length);
        boolean z = this.LLJ;
        if (z) {
            i2 = R.attr.fod;
        } else {
            i2 = -2131108349;
        }
        iArr[0] = i2;
        if (z && this.LLJI) {
            i3 = R.attr.foe;
        } else {
            i3 = -2131108350;
        }
        iArr[1] = i3;
        if (z) {
            i4 = R.attr.foa;
        } else {
            i4 = -2131108346;
        }
        iArr[2] = i4;
        if (z && this.LLJI) {
            i5 = R.attr.fo_;
        } else {
            i5 = -2131108345;
        }
        iArr[3] = i5;
        return LinearLayout.mergeDrawableStates(iArrOnCreateDrawableState, iArr);
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        C21539119Rd.LIZIZ(this, f);
    }

    public void setExpanded(boolean z) {
        LJ(z, isLaidOut(), true);
    }

    public void setLiftOnScroll(boolean z) {
        this.LLJIJIL = z;
    }

    public void setLiftOnScrollTargetViewId(int i) {
        this.LLJILJIL = i;
        WeakReference<View> weakReference = this.LLJILJILJ;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.LLJILJILJ = null;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i) {
        if (i == 1) {
            super.setOrientation(i);
            return;
        }
        throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
    }

    public void setStatusBarForeground(Drawable drawable) {
        boolean z;
        Drawable drawable2 = this.LLJJI;
        if (drawable2 != drawable) {
            Drawable drawableMutate = null;
            if (drawable2 != null) {
                this.LLJJI.setCallback(null);
            }
            if (drawable != null) {
                drawableMutate = drawable.mutate();
            }
            this.LLJJI = drawableMutate;
            boolean z2 = false;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.LLJJI.setState(getDrawableState());
                }
                C16G6.LIZIZ(this.LLJJI, getLayoutDirection());
                Drawable drawable3 = this.LLJJI;
                if (getVisibility() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                drawable3.setVisible(z, false);
                this.LLJJI.setCallback(this);
            }
            if (this.LLJJI != null && getTopInset() > 0) {
                z2 = true;
            }
            setWillNotDraw(!z2);
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarForegroundColor(int i) {
        setStatusBarForeground(new ColorDrawable(i));
    }

    public void setStatusBarForegroundResource(int i) {
        setStatusBarForeground(C14MI.LIZ(getContext(), i));
    }

    public void setTargetElevation(float f) {
        C423370Git.LIZ(this, f);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        boolean z;
        super.setVisibility(i);
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        Drawable drawable = this.LLJJI;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.LLJJI) {
            return false;
        }
        return true;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final LinearLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C16GZ(getContext(), attributeSet);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return LIZIZ(layoutParams);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ LinearLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return LIZIZ(layoutParams);
    }

    public C16GX(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.b__);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != 1073741824 && getFitsSystemWindows() && LJII()) {
            int measuredHeight = getMeasuredHeight();
            if (mode != Integer.MIN_VALUE) {
                if (mode == 0) {
                    measuredHeight += getTopInset();
                }
            } else {
                measuredHeight = C419990GdR.LIZIZ(getMeasuredHeight() + getTopInset(), 0, View.MeasureSpec.getSize(i2));
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
        this.LLILLJJLI = -1;
        this.LLILLL = -1;
        this.LLILZ = -1;
    }

    public C16GX(Context context, AttributeSet attributeSet, int i) {
        super(C1369550lk9.LIZ(context, attributeSet, i, R.style.a2c), attributeSet, i);
        this.LLILLJJLI = -1;
        this.LLILLL = -1;
        this.LLILZ = -1;
        this.LLILZLL = 0;
        Context context2 = getContext();
        setOrientation(1);
        setOutlineProvider(ViewOutlineProvider.BOUNDS);
        try {
            Context context3 = getContext();
            TypedArray typedArrayLIZLLL = C19PG.LIZLLL(context3, attributeSet, C423370Git.LIZ, i, R.style.a2c, new int[0]);
            try {
                if (typedArrayLIZLLL.hasValue(0)) {
                    setStateListAnimator(AnimatorInflater.loadStateListAnimator(context3, typedArrayLIZLLL.getResourceId(0, 0)));
                }
                typedArrayLIZLLL.recycle();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                typedArrayLIZLLL.recycle();
                throw th;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        TypedArray typedArrayLIZLLL2 = C19PG.LIZLLL(context2, attributeSet, R$styleable.AppBarLayout, i, R.style.a2c, new int[0]);
        setBackground(typedArrayLIZLLL2.getDrawable(R$styleable.AppBarLayout_android_background));
        if (getBackground() instanceof ColorDrawable) {
            ColorDrawable colorDrawable = (ColorDrawable) getBackground();
            C21538919Rb c21538919Rb = new C21538919Rb();
            c21538919Rb.LJIIJJI(ColorStateList.valueOf(colorDrawable.getColor()));
            c21538919Rb.LJIIIIZZ(context2);
            setBackground(c21538919Rb);
        }
        if (typedArrayLIZLLL2.hasValue(R$styleable.AppBarLayout_expanded)) {
            LJ(typedArrayLIZLLL2.getBoolean(R$styleable.AppBarLayout_expanded, false), false, false);
        }
        if (typedArrayLIZLLL2.hasValue(R$styleable.AppBarLayout_elevation)) {
            C423370Git.LIZ(this, typedArrayLIZLLL2.getDimensionPixelSize(R$styleable.AppBarLayout_elevation, 0));
        }
        if (Build.VERSION.SDK_INT >= 26) {
            if (typedArrayLIZLLL2.hasValue(R$styleable.AppBarLayout_android_keyboardNavigationCluster)) {
                setKeyboardNavigationCluster(typedArrayLIZLLL2.getBoolean(R$styleable.AppBarLayout_android_keyboardNavigationCluster, false));
            }
            if (typedArrayLIZLLL2.hasValue(R$styleable.AppBarLayout_android_touchscreenBlocksFocus)) {
                setTouchscreenBlocksFocus(typedArrayLIZLLL2.getBoolean(R$styleable.AppBarLayout_android_touchscreenBlocksFocus, false));
            }
        }
        this.LLJIJIL = typedArrayLIZLLL2.getBoolean(R$styleable.AppBarLayout_liftOnScroll, false);
        this.LLJILJIL = typedArrayLIZLLL2.getResourceId(R$styleable.AppBarLayout_liftOnScrollTargetViewId, -1);
        setStatusBarForeground(typedArrayLIZLLL2.getDrawable(R$styleable.AppBarLayout_statusBarForeground));
        typedArrayLIZLLL2.recycle();
        C14K9.LJIJJ(this, new C0TVI() { // from class: X.16Ga
            @Override // X.C0TVI
            public final C20246014Ju onApplyWindowInsets(View view, C20246014Ju c20246014Ju) {
                C20246014Ju c20246014Ju2;
                boolean z;
                C16GX c16gx = this.LL;
                c16gx.getClass();
                if (c16gx.getFitsSystemWindows()) {
                    c20246014Ju2 = c20246014Ju;
                } else {
                    c20246014Ju2 = null;
                }
                if (!Objects.equals(c16gx.LLIZ, c20246014Ju2)) {
                    c16gx.LLIZ = c20246014Ju2;
                    if (c16gx.LLJJI != null && c16gx.getTopInset() > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    c16gx.setWillNotDraw(!z);
                    c16gx.requestLayout();
                }
                return c20246014Ju;
            }
        });
    }

    public final void LJ(boolean z, boolean z2, boolean z3) {
        int i;
        int i2;
        if (z) {
            i = 1;
        } else {
            i = 2;
        }
        int i3 = 0;
        if (z2) {
            i2 = 4;
        } else {
            i2 = 0;
        }
        int i4 = i | i2;
        if (z3) {
            i3 = 8;
        }
        this.LLILZLL = i4 | i3;
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        boolean z2 = true;
        if (getFitsSystemWindows() && LJII()) {
            int topInset = getTopInset();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                getChildAt(childCount).offsetTopAndBottom(topInset);
            }
        }
        this.LLILLJJLI = -1;
        this.LLILLL = -1;
        this.LLILZ = -1;
        this.LLILZIL = false;
        int childCount2 = getChildCount();
        int i5 = 0;
        while (true) {
            if (i5 >= childCount2) {
                break;
            }
            if (((C16GZ) getChildAt(i5).getLayoutParams()).LIZIZ != null) {
                this.LLILZIL = true;
                break;
            }
            i5++;
        }
        Drawable drawable = this.LLJJI;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (!this.LLJIJIL) {
            int childCount3 = getChildCount();
            int i6 = 0;
            while (true) {
                if (i6 < childCount3) {
                    int i7 = ((C16GZ) getChildAt(i6).getLayoutParams()).LIZ;
                    if ((i7 & 1) == 1 && (i7 & 10) != 0) {
                        break;
                    } else {
                        i6++;
                    }
                } else {
                    z2 = false;
                    break;
                }
            }
        }
        if (this.LLJ != z2) {
            this.LLJ = z2;
            refreshDrawableState();
        }
    }
}
