package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: X.18yb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public class C21459918yb extends AnimatorListenerAdapter implements InterfaceC21462418z0 {
    public final View LL;
    public final int LLILLJJLI;
    public final ViewGroup LLILLL;
    public final boolean LLILZ = true;
    public boolean LLILZIL;
    public boolean LLILZLL;

    @Override // X.InterfaceC21462418z0
    public final void LIZ() {
    }

    @Override // X.InterfaceC21462418z0
    public final void LIZIZ() {
        LJII(false);
    }

    @Override // X.InterfaceC21462418z0
    public final void LIZJ() {
        LJII(true);
    }

    @Override // X.InterfaceC21462418z0
    public final void LJFF(AbstractC21460218ye abstractC21460218ye) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    @Override // X.InterfaceC21462418z0
    public final void LIZLLL(AbstractC21463118z7 abstractC21463118z7) {
        if (!this.LLILZLL) {
            View view = this.LL;
            C21461118yn.LIZ.LIZ(this.LLILLJJLI, view);
            ViewGroup viewGroup = this.LLILLL;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        LJII(false);
        abstractC21463118z7.LJJII(this);
    }

    public final void LJII(boolean z) {
        ViewGroup viewGroup;
        if (this.LLILZ && this.LLILZIL != z && (viewGroup = this.LLILLL) != null) {
            this.LLILZIL = z;
            C21459718yZ.LIZ(viewGroup, z);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.LLILZLL = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (!this.LLILZLL) {
            View view = this.LL;
            C21461118yn.LIZ.LIZ(this.LLILLJJLI, view);
            ViewGroup viewGroup = this.LLILLL;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        LJII(false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        if (!this.LLILZLL) {
            View view = this.LL;
            C21461118yn.LIZ.LIZ(this.LLILLJJLI, view);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        if (!this.LLILZLL) {
            C21461118yn.LIZ.LIZ(0, this.LL);
        }
    }

    public C21459918yb(int i, View view) {
        this.LL = view;
        this.LLILLJJLI = i;
        this.LLILLL = (ViewGroup) view.getParent();
        LJII(true);
    }
}
