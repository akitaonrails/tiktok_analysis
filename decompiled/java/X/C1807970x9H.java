package X;

import android.animation.Animator;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;

/* JADX INFO: renamed from: X.0x9H, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1807970x9H implements Animator.AnimatorListener {
    public final EnumC1807980x9I LL;
    public boolean LLILLJJLI;
    public final /* synthetic */ C1807960x9G LLILLL;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.LLILLJJLI = true;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (!this.LLILLJJLI) {
            C1807960x9G c1807960x9G = this.LLILLL;
            EnumC1807980x9I enumC1807980x9I = this.LL;
            c1807960x9G.getClass();
            int i = C1807990x9J.LIZ[enumC1807980x9I.ordinal()];
            String curUserId = null;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            c1807960x9G.LLIZ = null;
                            c1807960x9G.N5();
                            return;
                        }
                        throw new C1954807lC();
                    }
                    return;
                }
                C0GYV c0gyv = c1807960x9G.LLILZIL;
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c0gyv);
                c0gyv.setAlpha(1.0f);
                if (c1807960x9G.LLIZ != null && !(!r0.isStarted())) {
                    return;
                }
                c1807960x9G.N5();
                return;
            }
            InterfaceC1795200wog interfaceC1795200wog = (InterfaceC1795200wog) PluggableExtentionKt.pluggableSpi$default(InterfaceC1795200wog.class, false, false, false, 14, null);
            if (interfaceC1795200wog != null) {
                curUserId = interfaceC1795200wog.getCurUserId();
            }
            InterfaceC1870830ymf interfaceC1870830ymfLIZ = C1323690kYB.LIZ(c1807960x9G.itemView.getContext());
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("CustomOptionBannerDidShowAnimation_");
            sbLIZ.append(curUserId);
            interfaceC1870830ymfLIZ.LJIIIIZZ(Boolean.TRUE, C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public C1807970x9H(C1807960x9G c1807960x9G, EnumC1807980x9I enumC1807980x9I) {
        this.LLILLL = c1807960x9G;
        this.LL = enumC1807980x9I;
    }
}
