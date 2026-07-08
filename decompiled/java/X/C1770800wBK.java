package X;

import Y.AAListenerS74S0201000_26;
import Y.ARunnableS95S0200000_26;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import kotlin.jvm.internal.AFwS215S0000000_26;

/* JADX INFO: renamed from: X.0wBK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1770800wBK {
    public AnimatorSet LIZ;
    public final C01GW LIZIZ;
    public final C01GW LIZJ;

    public C1770800wBK() {
        EnumC452301pR enumC452301pR = EnumC452301pR.NONE;
        this.LIZIZ = C452501pT.LIZ(enumC452301pR, AFwS215S0000000_26.get$arr$(8));
        this.LIZJ = C452501pT.LIZ(enumC452301pR, AFwS215S0000000_26.get$arr$(9));
    }

    public final void LIZ(final View view, final View view2) {
        final ViewGroup.MarginLayoutParams marginLayoutParamsLJI;
        AnimatorSet animatorSet = this.LIZ;
        if ((animatorSet != null && animatorSet.isRunning()) || !(view.getParent() instanceof ViewGroup) || (marginLayoutParamsLJI = C1383370m6R.LJI(view2)) == null) {
            return;
        }
        view.measure(0, 0);
        final int measuredHeight = view.getMeasuredHeight();
        final int i = marginLayoutParamsLJI.bottomMargin;
        HandlerHook.viewPost(view, new ARunnableS95S0200000_26(view, new Runnable() { // from class: X.0wBL
            public final void LIZ() {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
                objectAnimatorOfFloat.setInterpolator((Interpolator) this.LIZIZ.getValue());
                objectAnimatorOfFloat.setDuration(300L);
                final ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(-measuredHeight, i);
                C1770800wBK c1770800wBK = this;
                final ViewGroup.MarginLayoutParams marginLayoutParams = marginLayoutParamsLJI;
                final View view3 = view2;
                valueAnimatorOfInt.setInterpolator((Interpolator) c1770800wBK.LIZJ.getValue());
                valueAnimatorOfInt.setDuration(300L);
                valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.0wBM
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        Integer num;
                        Object animatedValue = valueAnimatorOfInt.getAnimatedValue();
                        if ((animatedValue instanceof Integer) && (num = (Integer) animatedValue) != null) {
                            ViewGroup.MarginLayoutParams marginLayoutParams2 = marginLayoutParams;
                            View view4 = view3;
                            marginLayoutParams2.bottomMargin = num.intValue();
                            C786410Ut5.W5(view4, marginLayoutParams2);
                        }
                    }
                });
                C1770800wBK c1770800wBK2 = this;
                AnimatorSet animatorSet2 = new AnimatorSet();
                final ViewGroup.MarginLayoutParams marginLayoutParams2 = marginLayoutParamsLJI;
                final int i2 = measuredHeight;
                final View view4 = view2;
                final View view5 = view;
                int i3 = i;
                animatorSet2.playTogether(objectAnimatorOfFloat, valueAnimatorOfInt);
                animatorSet2.addListener(new Animator.AnimatorListener() { // from class: X.0wBN
                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationCancel(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationEnd(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationRepeat(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationStart(Animator animator) {
                        marginLayoutParams2.bottomMargin = -i2;
                        C786410Ut5.W5(view4, marginLayoutParams2);
                        C786410Ut5.LJLLLLLL(0, view5);
                        C786410Ut5.LJLLLLLL(0, view4);
                        C786410Ut5.T4(view4, 0.0f);
                    }
                });
                animatorSet2.addListener(new AAListenerS74S0201000_26(marginLayoutParams2, i3, view4, 0));
                animatorSet2.addListener(new AAListenerS74S0201000_26(marginLayoutParams2, i3, view4, 1));
                c1770800wBK2.LIZ = animatorSet2;
                AnimatorSet animatorSet3 = this.LIZ;
                if (animatorSet3 != null) {
                    animatorSet3.start();
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("EcSearchFeedVideoGuideAnimHelper@50d7.startBottomButtonInAnim$animRunnable$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("EcSearchFeedVideoGuideAnimHelper@50d7.startBottomButtonInAnim$animRunnable$1");
            }
        }, 2));
    }
}
