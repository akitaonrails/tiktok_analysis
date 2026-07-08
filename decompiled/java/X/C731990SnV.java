package X;

import android.animation.Animator;

/* JADX INFO: renamed from: X.0SnV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C731990SnV implements Animator.AnimatorListener {
    public final /* synthetic */ C731980SnU LL;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    public C731990SnV(C731980SnU c731980SnU) {
        this.LL = c731980SnU;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.LL.LJ();
        this.LL.removeAnimatorListener(this);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.LL.LJ();
        this.LL.removeAnimatorListener(this);
    }
}
