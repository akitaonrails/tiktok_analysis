package X;

import android.animation.Animator;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: X.11AR, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11AR implements Animator.AnimatorListener {
    public final InterfaceC19456411Ac LL;
    public final InterfaceC19456711Af LLILLJJLI;
    public final FrameLayout LLILLL;
    public C1295960jpS LLILZ;
    public int LLILZIL;
    public boolean LLILZLL;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.LLILZLL = false;
        C201955140j.LIZJ(C201967140v.LIZIZ, "record cound down onAnimationCancel() called");
        this.LL.LIZIZ();
        this.LLILLJJLI.release();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C201955140j.LIZJ(C201967140v.LIZIZ, "record cound down onAnimationEnd() called");
        this.LLILZLL = false;
        C1295960jpS c1295960jpS = this.LLILZ;
        if (c1295960jpS != null && this.LLILLL != null && c1295960jpS.isAnimating()) {
            C786410Ut5.LLD(8, this.LLILZ);
        }
        this.LL.LIZ();
        this.LLILLJJLI.release();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.LLILLJJLI.LIZ(this.LLILZIL);
    }

    public C11AR(FrameLayout frameLayout, C11AJ c11aj, C194303110b c194303110b) {
        this.LLILLL = frameLayout;
        this.LL = c11aj;
        this.LLILLJJLI = c194303110b;
    }
}
