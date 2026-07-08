package X;

import android.animation.Animator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import com.bytedance.android.livesdk.livesetting.publicscreen.LivePublicScreenAnimatorWithLayerSetting;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS561S0100000_17;

/* JADX INFO: renamed from: X.0f6D, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1114150f6D {
    public final ViewPropertyAnimator LIZ;

    public C1114150f6D(View view) {
        ViewPropertyAnimator viewPropertyAnimatorAnimate;
        if (LivePublicScreenAnimatorWithLayerSetting.INSTANCE.withLayer()) {
            viewPropertyAnimatorAnimate = view.animate().withLayer();
        } else {
            viewPropertyAnimatorAnimate = view.animate();
        }
        this.LIZ = viewPropertyAnimatorAnimate;
    }

    public final void LIZ(final Animator.AnimatorListener animatorListener) {
        Animator.AnimatorListener animatorListener2;
        ViewPropertyAnimator viewPropertyAnimator = this.LIZ;
        if (animatorListener != null) {
            final AwS561S0100000_17 awS561S0100000_17 = new AwS561S0100000_17(this, 659);
            animatorListener2 = new Animator.AnimatorListener(animatorListener, awS561S0100000_17) { // from class: X.0c0L
                public final Animator.AnimatorListener LL;
                public final Function0<Unit> LLILLJJLI;

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationCancel(Animator animator) {
                    this.LL.onAnimationCancel(animator);
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    this.LL.onAnimationEnd(animator);
                    this.LLILLJJLI.invoke();
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationRepeat(Animator animator) {
                    this.LL.onAnimationRepeat(animator);
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
                    this.LL.onAnimationStart(animator);
                }

                {
                    this.LL = animatorListener;
                    this.LLILLJJLI = awS561S0100000_17;
                }
            };
        } else {
            animatorListener2 = null;
        }
        viewPropertyAnimator.setListener(animatorListener2);
    }
}
