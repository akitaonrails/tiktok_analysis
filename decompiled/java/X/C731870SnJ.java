package X;

import android.animation.Animator;

/* JADX INFO: renamed from: X.0SnJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C731870SnJ implements Animator.AnimatorListener {
    public final /* synthetic */ C731860SnI LL;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    public C731870SnJ(C731860SnI c731860SnI) {
        this.LL = c731860SnI;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.LL.LJ(false);
        C731860SnI c731860SnI = this.LL;
        if (C0SXF.LJIL(c731860SnI.getContext())) {
            c731860SnI.setImageDrawable(c731860SnI.getFavoriteViewScaleHelper().LJ());
        }
        this.LL.removeAnimatorListener(this);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.LL.LJ(false);
        C731860SnI c731860SnI = this.LL;
        if (C0SXF.LJIL(c731860SnI.getContext())) {
            c731860SnI.setImageDrawable(c731860SnI.getFavoriteViewScaleHelper().LJ());
        }
        this.LL.removeAnimatorListener(this);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.LL.LJ(true);
    }
}
