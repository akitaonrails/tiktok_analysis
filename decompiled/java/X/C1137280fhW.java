package X;

import android.animation.Animator;

/* JADX INFO: renamed from: X.0fhW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1137280fhW implements Animator.AnimatorListener {
    public final EnumC1137150fhJ LL;
    public InterfaceC1137410fhj LLILLJJLI;
    public final boolean LLILLL;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        InterfaceC1137410fhj interfaceC1137410fhj = this.LLILLJJLI;
        if (interfaceC1137410fhj == null) {
            return;
        }
        int i = C1137290fhX.LIZ[this.LL.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            interfaceC1137410fhj.LIZ();
                            if (!this.LLILLL) {
                                this.LLILLJJLI = null;
                                return;
                            }
                            return;
                        }
                        throw new C1954807lC();
                    }
                    interfaceC1137410fhj.LJFF();
                    return;
                }
                interfaceC1137410fhj.LJ();
                return;
            }
            interfaceC1137410fhj.LIZJ();
            return;
        }
        interfaceC1137410fhj.LIZLLL();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        InterfaceC1137410fhj interfaceC1137410fhj = this.LLILLJJLI;
        if (interfaceC1137410fhj != null && this.LL == EnumC1137150fhJ.ENTRY) {
            interfaceC1137410fhj.LIZIZ();
        }
    }

    public C1137280fhW(EnumC1137150fhJ enumC1137150fhJ, InterfaceC1137410fhj interfaceC1137410fhj, boolean z) {
        this.LL = enumC1137150fhJ;
        this.LLILLJJLI = interfaceC1137410fhj;
        this.LLILLL = z;
    }
}
