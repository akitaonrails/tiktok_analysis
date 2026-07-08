package X;

import Y.AAListenerS325S0100000_14;
import Y.AUListenerS263S0100000_14;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.animation.Interpolator;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.MessageReactionsState;
import kotlin.jvm.internal.AwS558S0100000_14;

/* JADX INFO: renamed from: X.0Zde, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C904240Zde extends AbstractC904080ZdO {
    public static final /* synthetic */ int LLILLJJLI = 0;
    public final C904040ZdK LL;

    @Override // X.AbstractC904080ZdO
    public final void I5() {
        C904040ZdK c904040ZdK = this.LL;
        Animator animator = c904040ZdK.LL;
        if (animator != null) {
            animator.cancel();
        }
        Animator animatorLIZ = C419550Gcj.LIZ(c904040ZdK.LLILLL);
        animatorLIZ.start();
        c904040ZdK.LL = animatorLIZ;
    }

    @Override // X.AbstractC904080ZdO
    public final void L5() {
        C904040ZdK c904040ZdK = this.LL;
        Animator animator = c904040ZdK.LLILZLL;
        if (animator != null) {
            animator.cancel();
        }
        C786410Ut5.LLLLZLL(c904040ZdK.LLILLL, 4);
        if (c904040ZdK.LLILZIL) {
            C786410Ut5.LLLLZLL(c904040ZdK.LLILZ, 4);
        }
    }

    @Override // X.AbstractC904080ZdO
    public final void N5() {
        C904040ZdK c904040ZdK = this.LL;
        Animator animator = c904040ZdK.LLILZLL;
        if (animator != null) {
            animator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.addListener(new AAListenerS325S0100000_14(c904040ZdK, 26));
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS263S0100000_14(c904040ZdK, 11));
        valueAnimatorOfFloat.setInterpolator(C426210GnT.LIZIZ);
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.start();
        c904040ZdK.LLILZLL = valueAnimatorOfFloat;
    }

    @Override // X.AbstractC904080ZdO
    public final void P5() {
        C904040ZdK c904040ZdK = this.LL;
        Animator animator = c904040ZdK.LLILZLL;
        if (animator != null) {
            animator.cancel();
        }
        C786410Ut5.B5(c904040ZdK.LLILLL, 1.0f);
        C786410Ut5.LLLLZLL(c904040ZdK.LLILLL, 0);
        if (c904040ZdK.LLILZIL) {
            C786410Ut5.B5(c904040ZdK.LLILZ, 1.0f);
            C786410Ut5.LLLLZLL(c904040ZdK.LLILZ, 0);
        }
    }

    @Override // X.AbstractC904080ZdO
    public final void R5() {
        C904040ZdK c904040ZdK = this.LL;
        Animator animator = c904040ZdK.LLILZLL;
        if (animator != null) {
            animator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addListener(new AAListenerS325S0100000_14(c904040ZdK, 30));
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS263S0100000_14(c904040ZdK, 12));
        AwS558S0100000_14 awS558S0100000_14 = new AwS558S0100000_14(c904040ZdK, 1495);
        valueAnimatorOfFloat.addListener(new AAListenerS325S0100000_14(awS558S0100000_14, 29));
        valueAnimatorOfFloat.addListener(new AAListenerS325S0100000_14(awS558S0100000_14, 28));
        valueAnimatorOfFloat.setInterpolator(C426210GnT.LIZ);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(c904040ZdK.LLILLL, "alpha", 0.0f, 1.2f, 1.0f);
        objectAnimatorOfFloat.addListener(new AAListenerS325S0100000_14(c904040ZdK, 31));
        Interpolator interpolator = C426210GnT.LIZIZ;
        objectAnimatorOfFloat.setInterpolator(interpolator);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(c904040ZdK.LLILZ, "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat2.addListener(new AAListenerS325S0100000_14(c904040ZdK, 27));
        objectAnimatorOfFloat2.setInterpolator(interpolator);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(valueAnimatorOfFloat, objectAnimatorOfFloat, objectAnimatorOfFloat2);
        animatorSet.setDuration(300L);
        animatorSet.start();
        c904040ZdK.LLILZLL = animatorSet;
    }

    @Override // X.AbstractC904080ZdO
    public final void onViewDetachedFromWindow() {
        C904040ZdK c904040ZdK = this.LL;
        Animator animator = c904040ZdK.LL;
        if (animator != null) {
            animator.cancel();
        }
        c904040ZdK.LL = null;
        RemoveViewCausedNPEChecker.recordViewRemovedPoint(c904040ZdK, null);
        c904040ZdK.removeView(null);
    }

    public C904240Zde(C904040ZdK c904040ZdK) {
        super(c904040ZdK);
        this.LL = c904040ZdK;
    }

    @Override // X.AbstractC904080ZdO
    public final void S5(MessageReactionsState.ReactionList.Count count) {
        this.LL.LIZ(count);
    }
}
