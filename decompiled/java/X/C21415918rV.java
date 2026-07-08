package X;

import Y.ALAdapterS13S0110000_32;
import Y.AUListenerS279S0100000_32;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.LinearLayout;
import android.widget.OverScroller;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.18rV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public class C21415918rV extends LinearLayout implements InterfaceC1318370kPb {
    public boolean LL;
    public int LLILLJJLI;
    public Function0<Unit> LLILLL;
    public Function0<Unit> LLILZ;
    public Function1<? super ViewGroup, Unit> LLILZIL;
    public boolean LLILZLL;
    public final C1317550kOH LLIZ;
    public int LLIZLLLIL;
    public int LLJ;
    public int LLJI;
    public OverScroller LLJIJIL;

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        return false;
    }

    @Override // X.InterfaceC1318370kPb
    public final boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        return i == 1;
    }

    public final void LIZ() {
        if (this.LLILZLL) {
            if (getLayoutDirection() == 1) {
                if (getScrollX() > (-this.LLILLJJLI)) {
                    return;
                }
            } else if (getScrollX() < this.LLILLJJLI) {
                return;
            }
            this.LLILZLL = false;
            Function0<Unit> function0 = this.LLILZ;
            if (function0 != null) {
                function0.invoke();
            }
        }
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        if (!this.LL) {
            return super.computeHorizontalScrollRange();
        }
        int childCount = getChildCount();
        int width = 0;
        for (int i = 0; i < childCount; i++) {
            width += getChildAt(i).getWidth();
        }
        return width;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C1317550kOH c1317550kOH = this.LLIZ;
        return c1317550kOH.LIZIZ | c1317550kOH.LIZ;
    }

    public final double LIZIZ() {
        return !(getLayoutDirection() == 1) ? Math.max(0.05d, ((double) 1) - Math.pow(((double) getScrollX()) / ((double) this.LLIZLLLIL), 0.9d)) : Math.max(0.05d, ((double) 1) - Math.pow(((double) (-getScrollX())) / ((double) this.LLIZLLLIL), 0.9d));
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        if (getChildCount() != 2) {
            throw new IllegalArgumentException("ScrollToOpenLayout must have two child");
        }
        if (!(getChildAt(0) instanceof InterfaceC20097013kG)) {
            throw new IllegalArgumentException("first child must be an instance of NestedScrollingChild2");
        }
        View childAt = getChildAt(0);
        ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
        layoutParams.width = -1;
        C786410Ut5.W5(childAt, layoutParams);
    }

    public final OverScroller getCurrentScroller() {
        return this.LLJIJIL;
    }

    public final boolean getEnable() {
        return this.LL;
    }

    public final int getMinScrollThreshold() {
        return this.LLILLJJLI;
    }

    public final Function1<ViewGroup, Unit> getOnNestedScrollAcceptedListener() {
        return this.LLILZIL;
    }

    public final Function0<Unit> getOnScrollThresholdHitListener() {
        return this.LLILZ;
    }

    public final Function0<Unit> getOnScrollToEndListener() {
        return this.LLILLL;
    }

    public final void LIZJ(float f) {
        boolean z;
        if (f < 0.0f) {
            return;
        }
        if (getLayoutDirection() == 1) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, (int) (((double) this.LLIZLLLIL) * 0.66d * ((double) f)), 0);
            valueAnimatorOfInt.setDuration((long) (600 * f));
            valueAnimatorOfInt.setInterpolator(new LinearInterpolator());
            valueAnimatorOfInt.addUpdateListener(new AUListenerS279S0100000_32(this, 6));
            valueAnimatorOfInt.start();
            return;
        }
        ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(0, (int) (((double) this.LLIZLLLIL) * 0.66d * ((double) f)), 0);
        valueAnimatorOfInt2.setDuration((long) (600 * f));
        valueAnimatorOfInt2.setInterpolator(new LinearInterpolator());
        valueAnimatorOfInt2.addUpdateListener(new AUListenerS279S0100000_32(this, 7));
        valueAnimatorOfInt2.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null && motionEvent.getAction() == 1) {
            this.LLILZLL = true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void setCurrentScroller(OverScroller overScroller) {
        this.LLJIJIL = overScroller;
    }

    public final void setEnable(boolean z) {
        this.LL = z;
    }

    public final void setMinScrollThreshold(int i) {
        this.LLILLJJLI = i;
    }

    public final void setOnNestedScrollAcceptedListener(Function1<? super ViewGroup, Unit> function1) {
        this.LLILZIL = function1;
    }

    public final void setOnScrollThresholdHitListener(Function0<Unit> function0) {
        this.LLILZ = function0;
    }

    public final void setOnScrollToEndListener(Function0<Unit> function0) {
        this.LLILLL = function0;
    }

    public C21415918rV(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.LLIZLLLIL = getChildAt(1).getMeasuredWidth();
    }

    @Override // X.InterfaceC1318370kPb
    public final void onStopNestedScroll(View view, int i) {
        boolean z;
        boolean z2;
        boolean z3;
        this.LLIZ.LIZIZ(i);
        if (i == 0) {
            if (getLayoutDirection() == 1) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                if (getScrollX() > 0) {
                    if (getScrollX() >= this.LLILLJJLI) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(getScrollX(), 0);
                    valueAnimatorOfInt.setDuration((long) ((((double) getScrollX()) / ((double) this.LLIZLLLIL)) * ((double) 200)));
                    valueAnimatorOfInt.addUpdateListener(new AUListenerS279S0100000_32(this, 19));
                    valueAnimatorOfInt.addListener(new ALAdapterS13S0110000_32(z3, this, 0));
                    valueAnimatorOfInt.start();
                    return;
                }
                return;
            }
            if (getScrollX() >= 0) {
                return;
            }
            if (getScrollX() <= (-this.LLILLJJLI)) {
                z2 = true;
            } else {
                z2 = false;
            }
            ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(-getScrollX(), 0);
            valueAnimatorOfInt2.setDuration((long) ((((double) (-getScrollX())) / ((double) this.LLIZLLLIL)) * ((double) 200)));
            valueAnimatorOfInt2.addUpdateListener(new AUListenerS279S0100000_32(this, 20));
            valueAnimatorOfInt2.addListener(new ALAdapterS13S0110000_32(z2, this, 1));
            valueAnimatorOfInt2.start();
        }
    }

    public C21415918rV(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LL = true;
        this.LLILLJJLI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(80));
        this.LLILZLL = true;
        this.LLIZ = new C1317550kOH();
        setOrientation(0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        if (!this.LL) {
            return false;
        }
        OverScroller overScroller = new OverScroller(view.getContext());
        this.LLJIJIL = overScroller;
        overScroller.fling(0, 0, (int) f, (int) f2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        this.LLJ = overScroller.getFinalX();
        this.LLJI = 0;
        return false;
    }

    @Override // X.InterfaceC1318370kPb
    public final void onNestedScrollAccepted(View view, View view2, int i, int i2) {
        Function1<? super ViewGroup, Unit> function1;
        if (this.LL && getLayoutDirection() == 1 && (function1 = this.LLILZIL) != null) {
            function1.invoke(this);
        }
        this.LLIZ.LIZ(i, i2);
    }

    @Override // X.InterfaceC1318370kPb
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        if (this.LL && i3 == 0) {
            if (getLayoutDirection() == 1) {
                if (i > 0 && getScrollX() < 0) {
                    scrollBy(Math.min((int) (((double) i) * LIZIZ()), -getScrollX()), 0);
                    iArr[0] = i;
                    return;
                }
                return;
            }
            if (i >= 0 || getScrollX() <= 0) {
                return;
            }
            scrollBy(Math.max((int) (((double) i) * LIZIZ()), -getScrollX()), 0);
            iArr[0] = i;
        }
    }

    @Override // X.InterfaceC1318370kPb
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
        boolean z;
        if (!this.LL) {
            return;
        }
        if (getLayoutDirection() == 1) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            if (i5 == 0) {
                LIZ();
                if (i3 > 0) {
                    requestDisallowInterceptTouchEvent(true);
                    scrollBy(Math.min((int) (((double) i3) * LIZIZ()), this.LLIZLLLIL - getScrollX()), 0);
                    return;
                }
                return;
            }
            if (i <= 0) {
                return;
            }
            LIZ();
            int i6 = this.LLJI + i;
            this.LLJI = i6;
            if (i3 <= 0) {
                return;
            }
            int i7 = this.LLJ - i6;
            float fApplyDimension = TypedValue.applyDimension(1, 800.0f, getContext().getResources().getDisplayMetrics());
            LIZJ(Math.min(i7, fApplyDimension) / fApplyDimension);
            return;
        }
        if (i5 == 0) {
            LIZ();
            if (i3 >= 0) {
                return;
            }
            requestDisallowInterceptTouchEvent(true);
            scrollBy(Math.max((int) (((double) i3) * LIZIZ()), (-this.LLIZLLLIL) - getScrollX()), 0);
            return;
        }
        if (i >= 0) {
            return;
        }
        LIZ();
        int i8 = this.LLJI - i;
        this.LLJI = i8;
        if (i3 >= 0) {
            return;
        }
        int i9 = i8 - this.LLJ;
        float fApplyDimension2 = TypedValue.applyDimension(1, 800.0f, getContext().getResources().getDisplayMetrics());
        LIZJ(Math.min(i9, fApplyDimension2) / fApplyDimension2);
    }
}
