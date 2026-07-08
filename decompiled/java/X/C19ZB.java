package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;

/* JADX INFO: renamed from: X.19ZB, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public abstract class C19ZB extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {
    public boolean LL;
    public final /* synthetic */ C19Z1 LLILLJJLI;

    public abstract float LIZ();

    public C19ZB(C19Z2 c19z2) {
        this.LLILLJJLI = c19z2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.LLILLJJLI.getClass();
        this.LL = false;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (!this.LL) {
            this.LLILLJJLI.getClass();
            LIZ();
            this.LL = true;
        }
        C19Z1 c19z1 = this.LLILLJJLI;
        valueAnimator.getAnimatedFraction();
        c19z1.getClass();
    }
}
