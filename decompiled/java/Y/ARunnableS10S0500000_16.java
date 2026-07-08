package Y;

import X.C1030130cuh;
import X.C1320700kTM;
import X.C1322110kVd;
import X.C1630020sWG;
import X.C1C7U;
import X.C426160GnO;
import X.InterfaceC1291910jiv;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.net.Uri;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.SecondLine;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes17.dex */
public class ARunnableS10S0500000_16 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;

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
        ((TuxTextView) this.l1).measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        final int measuredHeight = ((TuxTextView) this.l1).getMeasuredHeight();
        ((C1030130cuh) this.l2).setSecondLineHeight(0);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
        final C1030130cuh c1030130cuh = (C1030130cuh) this.l2;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.0cuf
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                Object animatedValue = valueAnimator.getAnimatedValue();
                if (animatedValue instanceof Float) {
                    c1030130cuh.setSecondLineHeight(C814420VxA.LIZIZ(((Number) animatedValue).floatValue() * measuredHeight));
                }
            }
        });
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat((TuxTextView) this.l1, "alpha", 0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        final TuxTextView tuxTextView = (TuxTextView) this.l1;
        final C426160GnO c426160GnO = (C426160GnO) this.l4;
        final C1030130cuh c1030130cuh2 = (C1030130cuh) this.l2;
        animatorSet.addListener(new Animator.AnimatorListener() { // from class: X.0cug
            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                c1030130cuh2.setSecondLineHeight(-2);
                C1030130cuh c1030130cuh3 = c1030130cuh2;
                c1030130cuh3.LLIZLLLIL = true;
                Function0<Unit> function0 = c1030130cuh3.LLJI;
                if (function0 != null) {
                    function0.invoke();
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                C337180DJs.LIZJ(tuxTextView);
                C337180DJs.LIZJ(c426160GnO);
            }
        });
        animatorSet.playTogether(valueAnimatorOfFloat, objectAnimatorOfFloat);
        Long l = ((SecondLine) this.l3).showTime;
        if (l != null) {
            animatorSet.setStartDelay(l.longValue());
        }
        animatorSet.setDuration(300L);
        animatorSet.start();
    }

    public static final void run$0(ARunnableS10S0500000_16 aRunnableS10S0500000_16) {
        boolean zLIZ;
        C1C7U.LIZ("PhotoCarouselAnchorImplementationView@1119.setSecondLineText$$inlined$doOnPreDraw$1");
        try {
            aRunnableS10S0500000_16.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PhotoCarouselAnchorImplementationView@1119.setSecondLineText$$inlined$doOnPreDraw$1");
    }

    public static final void run$1(ARunnableS10S0500000_16 aRunnableS10S0500000_16) {
        boolean zLIZ;
        C1C7U.LIZ("CameraEffectCarouselScene@a3.bindImageOpt$1$1");
        try {
            ((C1630020sWG) aRunnableS10S0500000_16.l0).LLLLLJLJLL((C1322110kVd) aRunnableS10S0500000_16.l1, (Uri) aRunnableS10S0500000_16.l2, (InterfaceC1291910jiv) aRunnableS10S0500000_16.l3, (C1320700kTM) aRunnableS10S0500000_16.l4);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CameraEffectCarouselScene@a3.bindImageOpt$1$1");
    }

    public ARunnableS10S0500000_16(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.$t = i;
        this.l0 = obj5;
        this.l1 = obj3;
        this.l2 = obj;
        this.l3 = obj4;
        this.l4 = obj2;
    }
}
