package Y;

import X.C1223240hwA;
import X.C1245600iWE;
import X.C1846060y8i;
import X.C1C7U;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import androidx.viewpager.widget.ViewPager;

/* JADX INFO: loaded from: classes20.dex */
public class ARunnableS2S0402000_19 implements Runnable {
    public final int $t;
    public int i4;
    public int i5;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat((View) this.l0, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
        objectAnimatorOfFloat.setInterpolator((Interpolator) ((C1223240hwA) this.l1).LIZIZ.getValue());
        objectAnimatorOfFloat.setDuration(300L);
        final ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(-this.i4, this.i5);
        C1223240hwA c1223240hwA = (C1223240hwA) this.l1;
        final ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.l2;
        final View view = (View) this.l0;
        valueAnimatorOfInt.setInterpolator((Interpolator) c1223240hwA.LIZJ.getValue());
        valueAnimatorOfInt.setDuration(300L);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.0hgz
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                Integer num;
                Object animatedValue = valueAnimatorOfInt.getAnimatedValue();
                if ((animatedValue instanceof Integer) && (num = (Integer) animatedValue) != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = marginLayoutParams;
                    View view2 = view;
                    marginLayoutParams2.bottomMargin = num.intValue();
                    C786410Ut5.W5(view2, marginLayoutParams2);
                }
            }
        });
        C1223240hwA c1223240hwA2 = (C1223240hwA) this.l1;
        AnimatorSet animatorSet = new AnimatorSet();
        final ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.l2;
        final int i = this.i4;
        final View view2 = (View) this.l0;
        final View view3 = (View) this.l3;
        int i2 = this.i5;
        animatorSet.playTogether(objectAnimatorOfFloat, valueAnimatorOfInt);
        animatorSet.addListener(new Animator.AnimatorListener() { // from class: X.0hh0
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
                marginLayoutParams2.bottomMargin = -i;
                C786410Ut5.W5(view2, marginLayoutParams2);
                C786410Ut5.LJLLLLLL(0, view3);
                C786410Ut5.LJLLLLLL(0, view2);
                C786410Ut5.T4(view2, 0.0f);
            }
        });
        animatorSet.addListener(new AAListenerS73S0201000_19(marginLayoutParams2, i2, view2, 1));
        animatorSet.addListener(new AAListenerS73S0201000_19(marginLayoutParams2, i2, view2, 2));
        c1223240hwA2.LIZ = animatorSet;
        AnimatorSet animatorSet2 = ((C1223240hwA) this.l1).LIZ;
        if (animatorSet2 != null) {
            animatorSet2.start();
        }
    }

    public static final void run$0(ARunnableS2S0402000_19 aRunnableS2S0402000_19) {
        boolean zLIZ;
        C1C7U.LIZ("EcVideoGuideBottomAnimHelper@9131.startBottomButtonInAnim$animRunnable$1");
        try {
            aRunnableS2S0402000_19.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("EcVideoGuideBottomAnimHelper@9131.startBottomButtonInAnim$animRunnable$1");
    }

    public static final void run$1(ARunnableS2S0402000_19 aRunnableS2S0402000_19) {
        boolean zLIZ;
        C1C7U.LIZ("LivePhotoTabBarAlertController@5e9c.scheduleLivePhotoTabBadgeUpdate$$inlined$doOnPreDraw$1");
        try {
            int i = aRunnableS2S0402000_19.i4;
            C1245600iWE c1245600iWE = (C1245600iWE) aRunnableS2S0402000_19.l1;
            if (i == c1245600iWE.LIZJ) {
                c1245600iWE.LIZIZ = false;
                ((C1245600iWE) aRunnableS2S0402000_19.l1).LIZ((C1846060y8i) aRunnableS2S0402000_19.l2, (ViewPager) aRunnableS2S0402000_19.l3, aRunnableS2S0402000_19.i5);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LivePhotoTabBarAlertController@5e9c.scheduleLivePhotoTabBadgeUpdate$$inlined$doOnPreDraw$1");
    }

    public ARunnableS2S0402000_19(Object obj, int i, int i2, Object obj2, Object obj3, Object obj4, int i3) {
        this.$t = i3;
        this.l0 = obj;
        this.i4 = i;
        this.i5 = i2;
        this.l1 = obj2;
        this.l2 = obj3;
        this.l3 = obj4;
    }
}
