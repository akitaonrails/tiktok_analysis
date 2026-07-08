package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS145S0101000_5;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0Ecr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC368670Ecr extends FrameLayout {
    public final C01GW LL;
    public boolean LLILLJJLI;
    public Function2<? super Integer, ? super Integer, Unit> LLILLL;
    public Function1<? super Integer, Unit> LLILZ;
    public long LLILZIL;
    public int LLILZLL;
    public int LLIZ;
    public float LLIZLLLIL;

    public abstract void LIZ();

    public int getMaxScrollY() {
        return 0;
    }

    public void setOnBlankClickListener$editor_trackpanel_release(View.OnClickListener onClickListener) {
    }

    public final int getMaxScrollX() {
        return Math.max(this.LLILZLL, this.LLIZ);
    }

    public final int getScreenWidth() {
        return C0FU0.LIZJ(getContext());
    }

    public final int getDesireMaxScrollX() {
        return this.LLILZLL;
    }

    public final Function2<Integer, Integer, Unit> getScrollChangeListener() {
        return this.LLILLL;
    }

    public final float getTimelineScale() {
        return this.LLIZLLLIL;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        LIZ();
        super.addView(view);
    }

    public final void setMustUpdateScrollXListener(Function1<? super Integer, Unit> function1) {
        this.LLILZ = function1;
    }

    public final void setScrollChangeListener(Function2<? super Integer, ? super Integer, Unit> function2) {
        this.LLILLL = function2;
    }

    public void setTimelineScale(float f) {
        this.LLIZLLLIL = f;
        this.LLILZLL = (int) (this.LLILZIL * f);
        this.LLIZ = 0;
    }

    public AbstractC368670Ecr(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        LIZ();
        super.addView(view, i);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        AwS145S0101000_5 awS145S0101000_5 = new AwS145S0101000_5(i, this, 6);
        if (getChildCount() == 0) {
            if (View.MeasureSpec.getMode(i2) == 1073741824) {
                setMeasuredDimension(((Number) awS145S0101000_5.invoke()).intValue(), View.MeasureSpec.getSize(i2));
                return;
            } else {
                setMeasuredDimension(0, 0);
                return;
            }
        }
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                if (((Boolean) this.LL.getValue()).booleanValue()) {
                    measureChild(childAt, View.MeasureSpec.makeMeasureSpec(1073741823, Integer.MIN_VALUE), i2);
                } else {
                    measureChild(childAt, View.MeasureSpec.makeMeasureSpec(0, 0), i2);
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
                paddingTop += marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + childAt.getMeasuredHeight();
            }
        }
        setMeasuredDimension(((Number) awS145S0101000_5.invoke()).intValue(), paddingTop);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        LIZ();
        super.addView(view, layoutParams);
    }

    public AbstractC368670Ecr(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LL = C452501pT.LIZIZ(new AwS549S0100000_5(context, 1208));
        this.LLILLJJLI = true;
        this.LLIZLLLIL = C360610EBv.LIZJ();
    }

    public final int LIZIZ(int i, boolean z, boolean z2) {
        int maxScrollX;
        int paddingTop;
        if (z) {
            maxScrollX = getMaxScrollY();
        } else {
            maxScrollX = getMaxScrollX();
        }
        if (z2 && ((Boolean) this.LL.getValue()).booleanValue()) {
            if (i > 0) {
                return 0;
            }
            int i2 = -maxScrollX;
            if (i >= i2) {
                return i;
            }
            return i2;
        }
        if (z) {
            paddingTop = getPaddingTop();
        } else {
            paddingTop = 0;
        }
        if (i <= paddingTop) {
            return 0;
        }
        if (i <= maxScrollX) {
            return i;
        }
        return maxScrollX;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        LIZ();
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        Function2<? super Integer, ? super Integer, Unit> function2;
        super.onScrollChanged(i, i2, i3, i4);
        if (this.LLILLJJLI && (function2 = this.LLILLL) != null) {
            function2.invoke(Integer.valueOf(getScrollX()), Integer.valueOf(i - i3));
        }
        Function1<? super Integer, Unit> function1 = this.LLILZ;
        if (function1 != null) {
            function1.invoke(Integer.valueOf(getScrollX()));
        }
    }

    public static void LIZJ(final AbstractC368670Ecr abstractC368670Ecr, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, int i3) {
        if ((i3 & 8) != 0) {
            z2 = false;
        }
        if ((i3 & 16) != 0) {
            z3 = false;
        }
        if ((i3 & 32) != 0) {
            z4 = false;
        }
        abstractC368670Ecr.LLILLJJLI = z;
        if (!z2) {
            i = abstractC368670Ecr.LIZIZ(i, false, true);
        }
        if (!z3) {
            i2 = abstractC368670Ecr.LIZIZ(i2, true, false);
        }
        if (z4) {
            Pair pair = new Pair(Integer.valueOf(abstractC368670Ecr.getScrollX()), Integer.valueOf(abstractC368670Ecr.getScrollY()));
            final int iIntValue = ((Number) pair.getFirst()).intValue();
            ((Number) pair.getSecond()).intValue();
            Pair pair2 = new Pair(Integer.valueOf(i - abstractC368670Ecr.getScrollX()), Integer.valueOf(i2 - abstractC368670Ecr.getScrollY()));
            final int iIntValue2 = ((Number) pair2.getFirst()).intValue();
            ((Number) pair2.getSecond()).intValue();
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.setDuration(300L);
            valueAnimatorOfFloat.setInterpolator(C1619980sG4.LJ());
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.0EVY
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    Pair pair3 = new Pair(Float.valueOf(iIntValue + (((Float) valueAnimator.getAnimatedValue()).floatValue() * iIntValue2)), Integer.valueOf(abstractC368670Ecr.getScrollY()));
                    abstractC368670Ecr.scrollTo(C814420VxA.LIZIZ(((Number) pair3.getFirst()).floatValue()), ((Number) pair3.getSecond()).intValue());
                }
            });
            valueAnimatorOfFloat.start();
            return;
        }
        abstractC368670Ecr.scrollTo(i, i2);
    }
}
