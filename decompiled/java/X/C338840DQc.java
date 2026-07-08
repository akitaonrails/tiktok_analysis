package X;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: X.0DQc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C338840DQc {
    public static void LIZ(final View view, Integer num) {
        int marginStart;
        final int i;
        final int marginEnd;
        final int i2;
        int marginStart2;
        final int iIntValue;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        final int marginEnd2;
        final int i3;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        ViewGroup.MarginLayoutParams marginLayoutParams3;
        ViewGroup.MarginLayoutParams marginLayoutParams4;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginStart = ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart();
        } else {
            marginStart = 0;
        }
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
            i = marginLayoutParams4.topMargin;
        } else {
            i = 0;
        }
        ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
        if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
            marginEnd = ((ViewGroup.MarginLayoutParams) layoutParams3).getMarginEnd();
        } else {
            marginEnd = 0;
        }
        ViewGroup.LayoutParams layoutParams4 = view.getLayoutParams();
        if ((layoutParams4 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams4) != null) {
            i2 = marginLayoutParams3.bottomMargin;
        } else {
            i2 = 0;
        }
        ViewGroup.LayoutParams layoutParams5 = view.getLayoutParams();
        if (layoutParams5 instanceof ViewGroup.MarginLayoutParams) {
            marginStart2 = ((ViewGroup.MarginLayoutParams) layoutParams5).getMarginStart();
        } else {
            marginStart2 = 0;
        }
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            ViewGroup.LayoutParams layoutParams6 = view.getLayoutParams();
            if ((layoutParams6 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams6) != null) {
                iIntValue = marginLayoutParams.topMargin;
            } else {
                iIntValue = 0;
            }
        }
        ViewGroup.LayoutParams layoutParams7 = view.getLayoutParams();
        if (layoutParams7 instanceof ViewGroup.MarginLayoutParams) {
            marginEnd2 = ((ViewGroup.MarginLayoutParams) layoutParams7).getMarginEnd();
        } else {
            marginEnd2 = 0;
        }
        ViewGroup.LayoutParams layoutParams8 = view.getLayoutParams();
        if ((layoutParams8 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams8) != null) {
            i3 = marginLayoutParams2.bottomMargin;
        } else {
            i3 = 0;
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(marginStart, marginStart2);
        valueAnimatorOfInt.setDuration(200L);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.0DQb
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C426750GoL.LJIIIZ(view, (Integer) valueAnimator.getAnimatedValue(), Integer.valueOf(i + ((int) ((iIntValue - r2) * valueAnimator.getAnimatedFraction()))), Integer.valueOf(marginEnd + ((int) ((marginEnd2 - r2) * valueAnimator.getAnimatedFraction()))), Integer.valueOf(i2 + ((int) ((i3 - r2) * valueAnimator.getAnimatedFraction()))), false, 16);
            }
        });
        valueAnimatorOfInt.start();
    }

    public static void LIZIZ(final C1322110kVd c1322110kVd, final int i, int i2) {
        final int width = c1322110kVd.getWidth();
        int height = c1322110kVd.getHeight();
        final ViewGroup.LayoutParams layoutParams = c1322110kVd.getLayoutParams();
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(height, i2);
        valueAnimatorOfInt.setDuration(200L);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.06a7
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                layoutParams.height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                if (i > 0) {
                    layoutParams.width = width + ((int) ((r0 - r2) * valueAnimator.getAnimatedFraction()));
                }
                C786410Ut5.W5(c1322110kVd, layoutParams);
                c1322110kVd.requestLayout();
            }
        });
        valueAnimatorOfInt.start();
    }
}
