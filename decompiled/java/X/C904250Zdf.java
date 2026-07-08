package X;

import Y.AAListenerS325S0100000_14;
import Y.AUListenerS263S0100000_14;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.animation.Interpolator;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.MessageReactionsState;
import kotlin.jvm.internal.AwS558S0100000_14;

/* JADX INFO: renamed from: X.0Zdf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C904250Zdf extends AbstractC904080ZdO {
    public static final /* synthetic */ int LLILLJJLI = 0;
    public final C904050ZdL LL;

    @Override // X.AbstractC904080ZdO
    public final void S5(MessageReactionsState.ReactionList.Count count) {
    }

    @Override // X.AbstractC904080ZdO
    public final void I5() {
        C904050ZdL c904050ZdL = this.LL;
        c904050ZdL.getClass();
        Animator animatorLIZ = C419550Gcj.LIZ(c904050ZdL.LLILLJJLI);
        animatorLIZ.start();
        c904050ZdL.LL = animatorLIZ;
    }

    @Override // X.AbstractC904080ZdO
    public final void L5() {
        C904050ZdL c904050ZdL = this.LL;
        Animator animator = c904050ZdL.LLILZLL;
        if (animator != null) {
            animator.cancel();
        }
        C786410Ut5.LLFF(4, c904050ZdL.LLILLJJLI);
        if (c904050ZdL.LLILZIL) {
            C786410Ut5.LLLLZLL(c904050ZdL.LLILLL, 4);
        }
    }

    @Override // X.AbstractC904080ZdO
    public final void N5() {
        C904050ZdL c904050ZdL = this.LL;
        Animator animator = c904050ZdL.LLILZLL;
        if (animator != null) {
            animator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.addListener(new AAListenerS325S0100000_14(c904050ZdL, 20));
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS263S0100000_14(c904050ZdL, 9));
        AwS558S0100000_14 awS558S0100000_14 = new AwS558S0100000_14(c904050ZdL, 1493);
        valueAnimatorOfFloat.addListener(new AAListenerS325S0100000_14(awS558S0100000_14, 18));
        valueAnimatorOfFloat.addListener(new AAListenerS325S0100000_14(awS558S0100000_14, 19));
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.start();
        c904050ZdL.LLILZLL = valueAnimatorOfFloat;
    }

    @Override // X.AbstractC904080ZdO
    public final void P5() {
        C904050ZdL c904050ZdL = this.LL;
        Animator animator = c904050ZdL.LLILZLL;
        if (animator != null) {
            animator.cancel();
        }
        C786410Ut5.LLFF(0, c904050ZdL.LLILLJJLI);
        C904120ZdS.LIZ(c904050ZdL.LLILLJJLI, 1.0f);
        C786410Ut5.u5(c904050ZdL.LLILLJJLI, 1.0f);
        if (c904050ZdL.LLILZIL) {
            C786410Ut5.LLLLZLL(c904050ZdL.LLILLL, 0);
        }
    }

    @Override // X.AbstractC904080ZdO
    public final void R5() {
        C904050ZdL c904050ZdL = this.LL;
        Animator animator = c904050ZdL.LLILZLL;
        if (animator != null) {
            animator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addListener(new AAListenerS325S0100000_14(c904050ZdL, 25));
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS263S0100000_14(c904050ZdL, 10));
        AwS558S0100000_14 awS558S0100000_14 = new AwS558S0100000_14(c904050ZdL, 1494);
        valueAnimatorOfFloat.addListener(new AAListenerS325S0100000_14(awS558S0100000_14, 23));
        valueAnimatorOfFloat.addListener(new AAListenerS325S0100000_14(awS558S0100000_14, 24));
        valueAnimatorOfFloat.setInterpolator(C426210GnT.LIZ);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(c904050ZdL.LLILLJJLI, "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat.addListener(new AAListenerS325S0100000_14(c904050ZdL, 21));
        Interpolator interpolator = C426210GnT.LIZIZ;
        objectAnimatorOfFloat.setInterpolator(interpolator);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(c904050ZdL.LLILLL, "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat2.addListener(new AAListenerS325S0100000_14(c904050ZdL, 22));
        objectAnimatorOfFloat2.setInterpolator(interpolator);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(valueAnimatorOfFloat, objectAnimatorOfFloat, objectAnimatorOfFloat2);
        animatorSet.setDuration(300L);
        animatorSet.start();
        c904050ZdL.LLILZLL = animatorSet;
    }

    @Override // X.AbstractC904080ZdO
    public final void onViewDetachedFromWindow() {
        C904050ZdL c904050ZdL = this.LL;
        Animator animator = c904050ZdL.LL;
        if (animator != null) {
            animator.cancel();
        }
        c904050ZdL.LL = null;
        C786410Ut5.LJJJZ(null, c904050ZdL.LLILZ);
    }

    public C904250Zdf(C904050ZdL c904050ZdL) {
        super(c904050ZdL);
        this.LL = c904050ZdL;
    }
}
