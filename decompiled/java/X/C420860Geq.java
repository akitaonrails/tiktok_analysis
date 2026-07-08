package X;

import Y.AAListenerS133S0300000_6;
import Y.AAListenerS261S0200000_6;
import Y.AAListenerS317S0100000_6;
import Y.AUListenerS253S0100000_2;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.AFwS192S0000000_6;

/* JADX INFO: renamed from: X.0Geq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C420860Geq {
    public AnimatorSet LIZ;
    public AnimatorSet LIZIZ;
    public final C01GW LIZJ;
    public final C01GW LIZLLL;

    public C420860Geq() {
        EnumC452301pR enumC452301pR = EnumC452301pR.NONE;
        this.LIZJ = C452501pT.LIZ(enumC452301pR, AFwS192S0000000_6.get$arr$(6));
        this.LIZLLL = C452501pT.LIZ(enumC452301pR, AFwS192S0000000_6.get$arr$(7));
    }

    public static void LIZ(C420860Geq c420860Geq, View view, Integer num, View view2, ObjectAnimator objectAnimator, Integer num2) {
        ValueAnimator valueAnimatorOfInt;
        int i;
        int i2;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        AnimatorSet animatorSet = c420860Geq.LIZ;
        if (animatorSet != null && animatorSet.isRunning()) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = c420860Geq.LIZIZ;
        if (animatorSet2 != null && animatorSet2.isRunning()) {
            return;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 1.0f, 0.0f);
        objectAnimatorOfFloat.setInterpolator((InterpolatorC21388318n3) c420860Geq.LIZJ.getValue());
        objectAnimatorOfFloat.setDuration(150L);
        if (num2 != null && num != null) {
            int[] iArr = new int[2];
            iArr[0] = num.intValue();
            int iIntValue = num2.intValue();
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                i = marginLayoutParams2.topMargin;
            } else {
                i = 0;
            }
            int i3 = iIntValue - i;
            ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
            if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                i2 = marginLayoutParams.bottomMargin;
            } else {
                i2 = 0;
            }
            iArr[1] = i3 - i2;
            valueAnimatorOfInt = ValueAnimator.ofInt(iArr);
            valueAnimatorOfInt.setInterpolator((InterpolatorC420870Ger) c420860Geq.LIZLLL.getValue());
            valueAnimatorOfInt.setDuration(150L);
            valueAnimatorOfInt.addUpdateListener(new AUListenerS253S0100000_2(view, 0));
        } else {
            valueAnimatorOfInt = null;
        }
        AnimatorSet animatorSet3 = new AnimatorSet();
        if (objectAnimator != null) {
            objectAnimator.addListener(new AAListenerS317S0100000_6(view2, 3));
            animatorSet3.play(objectAnimatorOfFloat).with(valueAnimatorOfInt);
            animatorSet3.play(objectAnimator).after(objectAnimatorOfFloat);
        } else {
            animatorSet3.playTogether(objectAnimatorOfFloat);
        }
        animatorSet3.addListener(new AAListenerS133S0300000_6(view, view2, null, 0));
        animatorSet3.addListener(new AAListenerS133S0300000_6(view2, view, null, 1));
        c420860Geq.LIZIZ = animatorSet3;
        animatorSet3.start();
    }

    public static void LIZIZ(C420860Geq c420860Geq, View view, Integer num, View view2, ObjectAnimator objectAnimator, Integer num2) {
        ValueAnimator valueAnimatorOfInt;
        int i;
        int i2;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        AnimatorSet animatorSet = c420860Geq.LIZIZ;
        if (animatorSet != null && animatorSet.isRunning()) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = c420860Geq.LIZ;
        if (animatorSet2 != null && animatorSet2.isRunning()) {
            return;
        }
        C786410Ut5.T4(view, 0.0f);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 1.0f);
        objectAnimatorOfFloat.setInterpolator((InterpolatorC21388318n3) c420860Geq.LIZJ.getValue());
        objectAnimatorOfFloat.setDuration(300L);
        if (num2 != null && num != null) {
            int[] iArr = new int[2];
            int iIntValue = num2.intValue();
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                i = marginLayoutParams2.topMargin;
            } else {
                i = 0;
            }
            int i3 = iIntValue - i;
            ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
            if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                i2 = marginLayoutParams.bottomMargin;
            } else {
                i2 = 0;
            }
            iArr[0] = i3 - i2;
            iArr[1] = num.intValue();
            valueAnimatorOfInt = ValueAnimator.ofInt(iArr);
            valueAnimatorOfInt.setInterpolator((InterpolatorC420870Ger) c420860Geq.LIZLLL.getValue());
            valueAnimatorOfInt.setDuration(300L);
            valueAnimatorOfInt.addUpdateListener(new AUListenerS253S0100000_2(view, 1));
        } else {
            valueAnimatorOfInt = null;
        }
        objectAnimatorOfFloat.addListener(new AAListenerS317S0100000_6(view2, 4));
        AnimatorSet animatorSet3 = new AnimatorSet();
        if (objectAnimator != null) {
            animatorSet3.play(objectAnimatorOfFloat).with(valueAnimatorOfInt);
            animatorSet3.play(objectAnimator).before(objectAnimatorOfFloat);
        } else {
            animatorSet3.playTogether(objectAnimatorOfFloat);
        }
        animatorSet3.addListener(new AAListenerS317S0100000_6(view, 5));
        animatorSet3.addListener(new AAListenerS261S0200000_6(view, null, 1));
        c420860Geq.LIZ = animatorSet3;
        animatorSet3.start();
    }
}
