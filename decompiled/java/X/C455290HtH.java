package X;

import Y.AAListenerS317S0100000_6;
import Y.AUListenerS256S0100000_6;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.FloatEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.PointF;
import android.view.View;
import android.view.animation.LinearInterpolator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS192S0000000_6;

/* JADX INFO: renamed from: X.0HtH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C455290HtH {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(489));

    public static ObjectAnimator LIZ(View view) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f);
        objectAnimatorOfFloat.setDuration(100L);
        objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        return objectAnimatorOfFloat;
    }

    public static ValueAnimator LIZIZ(View view) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.7f);
        valueAnimatorOfFloat.setDuration(150L);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS256S0100000_6(view, 103));
        return valueAnimatorOfFloat;
    }

    public static void LIZJ(final View view, final PointF pointF, final PointF pointF2, final Function0 function0) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.7f, 2.0f);
        if (valueAnimatorOfFloat != null) {
            view.getLocationOnScreen(new int[2]);
            final float width = r3[0] + (view.getWidth() / 2.0f);
            final float height = r3[1] + (view.getHeight() / 2.0f);
            final FloatEvaluator floatEvaluator = new FloatEvaluator();
            valueAnimatorOfFloat.setDuration(300L);
            valueAnimatorOfFloat.setInterpolator(C1619980sG4.LJFF());
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.0HtI
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    C786410Ut5.Ob(view, fFloatValue);
                    C786410Ut5.pc(view, fFloatValue);
                    C786410Ut5.Jc(view, floatEvaluator.evaluate(valueAnimator.getAnimatedFraction(), (Number) Float.valueOf(width), (Number) Float.valueOf(pointF.x)).floatValue() - width);
                    C786410Ut5.ed(view, floatEvaluator.evaluate(valueAnimator.getAnimatedFraction(), (Number) Float.valueOf(height), (Number) Float.valueOf(pointF.y)).floatValue() - height);
                }
            });
            valueAnimatorOfFloat.addListener(new Animator.AnimatorListener() { // from class: X.0Gcw
                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationCancel(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationRepeat(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(2.0f, 0.0f);
                    valueAnimatorOfFloat2.setInterpolator(C1619980sG4.LJFF());
                    valueAnimatorOfFloat2.addUpdateListener(new AUListenerS256S0100000_6(view, 104));
                    float f = pointF.x;
                    PointF pointF3 = pointF2;
                    PointF pointF4 = new PointF(f + ((pointF3.x - f) * 0.5f), pointF3.y);
                    float f2 = pointF.x;
                    PointF pointF5 = pointF2;
                    ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new C419700Gcy(pointF4, new PointF(f2 + ((pointF5.x - f2) * 0.89f), pointF5.y)), pointF, pointF2);
                    final View view2 = view;
                    final float f3 = width;
                    final float f4 = height;
                    valueAnimatorOfObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.0Gcx
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            PointF pointF6;
                            Object animatedValue = valueAnimator.getAnimatedValue();
                            if ((animatedValue instanceof PointF) && (pointF6 = (PointF) animatedValue) != null) {
                                View view3 = view2;
                                float f5 = f3;
                                float f6 = f4;
                                C786410Ut5.Jc(view3, pointF6.x - f5);
                                C786410Ut5.ed(view3, pointF6.y - f6);
                            }
                        }
                    });
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.setDuration(400L);
                    animatorSet.addListener(new AAListenerS317S0100000_6(function0, 50));
                    animatorSet.playTogether(valueAnimatorOfFloat2, valueAnimatorOfObject);
                    animatorSet.start();
                }
            });
            valueAnimatorOfFloat.start();
        }
    }
}
