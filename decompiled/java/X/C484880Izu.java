package X;

import android.animation.Animator;
import android.view.View;

/* JADX INFO: renamed from: X.0Izu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C484880Izu implements Animator.AnimatorListener {
    public final boolean LL;
    public final /* synthetic */ C484860Izs LLILLJJLI;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.LL) {
            this.LLILLJJLI.LJIIIZ(1.0f);
            C484860Izs c484860Izs = this.LLILLJJLI;
            c484860Izs.LJIJJLI = true;
            InterfaceC484910Izx interfaceC484910Izx = c484860Izs.LJIL;
            if (interfaceC484910Izx != null) {
                interfaceC484910Izx.UW0();
            }
            View view = this.LLILLJJLI.LJIJ;
            if (view != null) {
                view.setClickable(true);
                return;
            }
            return;
        }
        this.LLILLJJLI.LJIIIZ(0.0f);
        View view2 = this.LLILLJJLI.LJIJ;
        if (view2 != null) {
            C786410Ut5.LJLLLLLL(8, view2);
        }
        C484860Izs c484860Izs2 = this.LLILLJJLI;
        c484860Izs2.LJIJJLI = false;
        InterfaceC484910Izx interfaceC484910Izx2 = c484860Izs2.LJIL;
        if (interfaceC484910Izx2 != null) {
            interfaceC484910Izx2.VZ1();
        }
        View view3 = this.LLILLJJLI.LJIJ;
        if (view3 == null) {
            return;
        }
        view3.setClickable(false);
    }

    public C484880Izu(C484860Izs c484860Izs, boolean z) {
        this.LLILLJJLI = c484860Izs;
        this.LL = z;
    }
}
