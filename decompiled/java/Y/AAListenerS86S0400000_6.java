package Y;

import X.C0C64;
import X.C0HIT;
import X.C1619980sG4;
import X.C419700Gcy;
import X.C426630Go9;
import X.C786410Ut5;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.ViewGroup;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.core.ab.OptConfigV2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS412S0200000_11;

/* JADX INFO: loaded from: classes7.dex */
public class AAListenerS86S0400000_6 implements Animator.AnimatorListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    public static final void onAnimationCancel$0(AAListenerS86S0400000_6 aAListenerS86S0400000_6, Animator animator) {
    }

    public static final void onAnimationCancel$1(AAListenerS86S0400000_6 aAListenerS86S0400000_6, Animator animator) {
    }

    public static final void onAnimationRepeat$0(AAListenerS86S0400000_6 aAListenerS86S0400000_6, Animator animator) {
    }

    public static final void onAnimationRepeat$1(AAListenerS86S0400000_6 aAListenerS86S0400000_6, Animator animator) {
    }

    public static final void onAnimationStart$0(AAListenerS86S0400000_6 aAListenerS86S0400000_6, Animator animator) {
    }

    public static final void onAnimationStart$1(AAListenerS86S0400000_6 aAListenerS86S0400000_6, Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationCancel$0(this, animator);
                break;
            case 1:
                onAnimationCancel$1(this, animator);
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationEnd$0(this, animator);
                break;
            case 1:
                onAnimationEnd$1(this, animator);
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationRepeat$0(this, animator);
                break;
            case 1:
                onAnimationRepeat$1(this, animator);
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationStart$0(this, animator);
                break;
            case 1:
                onAnimationStart$1(this, animator);
                break;
        }
    }

    public static final void onAnimationEnd$0(AAListenerS86S0400000_6 aAListenerS86S0400000_6, Animator animator) {
        C786410Ut5.LJJJLZIJ((SmartImageView) aAListenerS86S0400000_6.l1, (ViewGroup) aAListenerS86S0400000_6.l0);
        ((ValueAnimator) aAListenerS86S0400000_6.l2).removeAllListeners();
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        OptConfigV2 optConfigV2 = C426630Go9.LIZ;
        OptConfigV2 optConfigV22 = (OptConfigV2) c0c64LJIILLIIL.LJJII(OptConfigV2.class, optConfigV2, "pdp_add_cart_optimize_v2", true);
        if (optConfigV22 != null) {
            optConfigV2 = optConfigV22;
        }
        if (optConfigV2.addCartAnimatorTimingOpt) {
            HandlerHook.viewPost((ViewGroup) aAListenerS86S0400000_6.l0, new ARunnableS106S0100000_6((Function1) aAListenerS86S0400000_6.l3, 207));
        }
    }

    public static final void onAnimationEnd$1(AAListenerS86S0400000_6 aAListenerS86S0400000_6, Animator animator) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat((TuxTextView) aAListenerS86S0400000_6.l0, "scaleX", 0.9f, 0.0f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat((TuxTextView) aAListenerS86S0400000_6.l0, "scaleY", 0.9f, 0.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(C1619980sG4.LIZJ());
        animatorSet.setDuration(350L);
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        C0HIT c0hit = (C0HIT) aAListenerS86S0400000_6.l1;
        TuxTextView tuxTextView = (TuxTextView) aAListenerS86S0400000_6.l0;
        Rect rect = (Rect) aAListenerS86S0400000_6.l2;
        c0hit.getClass();
        PointF pointFLIZ = C0HIT.LIZ(rect, tuxTextView);
        float f = pointFLIZ.x;
        float f2 = pointFLIZ.y;
        ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new C419700Gcy(new PointF(((TuxTextView) aAListenerS86S0400000_6.l0).getX() + f, ((TuxTextView) aAListenerS86S0400000_6.l0).getY() + (f2 / 2)), new PointF(((TuxTextView) aAListenerS86S0400000_6.l0).getX() + f, ((TuxTextView) aAListenerS86S0400000_6.l0).getY() + ((9 * f2) / 10))), new PointF(((TuxTextView) aAListenerS86S0400000_6.l0).getX(), ((TuxTextView) aAListenerS86S0400000_6.l0).getY()), new PointF(((TuxTextView) aAListenerS86S0400000_6.l0).getX() + f, ((TuxTextView) aAListenerS86S0400000_6.l0).getY() + f2));
        valueAnimatorOfObject.setInterpolator(C1619980sG4.LIZJ());
        valueAnimatorOfObject.setDuration(350L);
        valueAnimatorOfObject.setTarget((TuxTextView) aAListenerS86S0400000_6.l0);
        valueAnimatorOfObject.addUpdateListener(new AUListenerS256S0100000_6((TuxTextView) aAListenerS86S0400000_6.l0, 111));
        valueAnimatorOfObject.addListener(new AAListenerS261S0200000_6((C0HIT) aAListenerS86S0400000_6.l1, (Function0) aAListenerS86S0400000_6.l3, 21));
        valueAnimatorOfObject.addListener(new AAListenerS317S0100000_6((C0HIT) aAListenerS86S0400000_6.l1, 54));
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(animatorSet, valueAnimatorOfObject);
        animatorSet2.start();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AAListenerS86S0400000_6(ViewGroup viewGroup, ViewGroup viewGroup2, SmartImageView smartImageView, ValueAnimator valueAnimator, Function1<? super Boolean, Unit> function1) {
        this.$t = function1;
        this.l0 = viewGroup;
        this.l1 = viewGroup2;
        this.l2 = smartImageView;
        this.l3 = valueAnimator;
    }

    public AAListenerS86S0400000_6(TuxTextView tuxTextView, C0HIT c0hit, Rect rect, int i, AwS412S0200000_11 awS412S0200000_11, int i2) {
        this.$t = i2;
        this.l0 = tuxTextView;
        this.l1 = c0hit;
        this.l2 = rect;
        this.l3 = awS412S0200000_11;
    }
}
