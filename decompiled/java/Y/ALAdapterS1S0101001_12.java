package Y;

import X.C16F5;
import X.C20441214yg;
import X.C2188811AlT;
import X.C497740JfY;
import X.C500260Jjc;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.bytedance.android.live.liveinteract.multihost.biz.link.fragment.MultiCoHostBeInvitedFragment;

/* JADX INFO: loaded from: classes13.dex */
public class ALAdapterS1S0101001_12 extends AnimatorListenerAdapter {
    public final int $t;
    public float f2;
    public int i1;
    public Object l0;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationCancel$0(this, animator);
                break;
            case 1:
                onAnimationCancel$1(this, animator);
                break;
            case 2:
                onAnimationCancel$2(this, animator);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationEnd$0(this, animator);
                break;
            case 1:
                onAnimationEnd$1(this, animator);
                break;
            case 2:
                onAnimationEnd$2(this, animator);
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    public static final void onAnimationCancel$0(ALAdapterS1S0101001_12 aLAdapterS1S0101001_12, Animator animator) {
        super.onAnimationCancel(animator);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("animateFrom0WithHeader");
        sbLIZ.append(", animation Cancel");
        C20441214yg.LIZIZ("MultiCoHostBeInvitedFragment", C2188811AlT.LIZIZ(sbLIZ));
        C500260Jjc.LJJZ((int) aLAdapterS1S0101001_12.f2, ((MultiCoHostBeInvitedFragment) aLAdapterS1S0101001_12.l0).cS());
        MultiCoHostBeInvitedFragment multiCoHostBeInvitedFragment = (MultiCoHostBeInvitedFragment) aLAdapterS1S0101001_12.l0;
        if (multiCoHostBeInvitedFragment.LLLI == 1) {
            C16F5 c16f5DS = multiCoHostBeInvitedFragment.dS();
            MultiCoHostBeInvitedFragment multiCoHostBeInvitedFragment2 = (MultiCoHostBeInvitedFragment) aLAdapterS1S0101001_12.l0;
            int i = aLAdapterS1S0101001_12.i1;
            c16f5DS.setText(MultiCoHostBeInvitedFragment.rS(c16f5DS.getContext().getResources().getQuantityString(2131755811, i, multiCoHostBeInvitedFragment2.LLLII, Integer.valueOf(i))));
            return;
        }
        multiCoHostBeInvitedFragment.dS().setText(C497740JfY.LJIJJ(2131851652, ((MultiCoHostBeInvitedFragment) aLAdapterS1S0101001_12.l0).LLLII));
    }

    public static final void onAnimationCancel$1(ALAdapterS1S0101001_12 aLAdapterS1S0101001_12, Animator animator) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("animatefrom0WithoutHeader");
        sbLIZ.append(", animation Cancel, finalHeight = ");
        sbLIZ.append(aLAdapterS1S0101001_12.f2);
        C20441214yg.LIZIZ("MultiCoHostBeInvitedFragment", C2188811AlT.LIZIZ(sbLIZ));
        super.onAnimationCancel(animator);
        C500260Jjc.LJJZ((int) aLAdapterS1S0101001_12.f2, ((MultiCoHostBeInvitedFragment) aLAdapterS1S0101001_12.l0).cS());
        MultiCoHostBeInvitedFragment multiCoHostBeInvitedFragment = (MultiCoHostBeInvitedFragment) aLAdapterS1S0101001_12.l0;
        if (multiCoHostBeInvitedFragment.LLLI == 1) {
            C16F5 c16f5DS = multiCoHostBeInvitedFragment.dS();
            MultiCoHostBeInvitedFragment multiCoHostBeInvitedFragment2 = (MultiCoHostBeInvitedFragment) aLAdapterS1S0101001_12.l0;
            int i = aLAdapterS1S0101001_12.i1;
            c16f5DS.setText(MultiCoHostBeInvitedFragment.rS(c16f5DS.getContext().getResources().getQuantityString(2131755811, i, multiCoHostBeInvitedFragment2.LLLII, Integer.valueOf(i))));
            return;
        }
        multiCoHostBeInvitedFragment.dS().setText(C497740JfY.LJIJJ(2131851652, ((MultiCoHostBeInvitedFragment) aLAdapterS1S0101001_12.l0).LLLII));
    }

    public static final void onAnimationCancel$2(ALAdapterS1S0101001_12 aLAdapterS1S0101001_12, Animator animator) {
        super.onAnimationCancel(animator);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("animateFrom1Member");
        sbLIZ.append(", animation Cancel, finalHeight = ");
        sbLIZ.append(aLAdapterS1S0101001_12.f2);
        C20441214yg.LIZIZ("MultiCoHostBeInvitedFragment", C2188811AlT.LIZIZ(sbLIZ));
        C500260Jjc.LJJZ((int) aLAdapterS1S0101001_12.f2, ((MultiCoHostBeInvitedFragment) aLAdapterS1S0101001_12.l0).cS());
        MultiCoHostBeInvitedFragment multiCoHostBeInvitedFragment = (MultiCoHostBeInvitedFragment) aLAdapterS1S0101001_12.l0;
        if (multiCoHostBeInvitedFragment.LLLI == 1) {
            C16F5 c16f5DS = multiCoHostBeInvitedFragment.dS();
            MultiCoHostBeInvitedFragment multiCoHostBeInvitedFragment2 = (MultiCoHostBeInvitedFragment) aLAdapterS1S0101001_12.l0;
            int i = aLAdapterS1S0101001_12.i1;
            c16f5DS.setText(MultiCoHostBeInvitedFragment.rS(c16f5DS.getContext().getResources().getQuantityString(2131755811, i, multiCoHostBeInvitedFragment2.LLLII, Integer.valueOf(i))));
        }
    }

    public static final void onAnimationEnd$0(ALAdapterS1S0101001_12 aLAdapterS1S0101001_12, Animator animator) {
        super.onAnimationEnd(animator);
        animator.getListeners().remove(aLAdapterS1S0101001_12);
        MultiCoHostBeInvitedFragment multiCoHostBeInvitedFragment = (MultiCoHostBeInvitedFragment) aLAdapterS1S0101001_12.l0;
        if (multiCoHostBeInvitedFragment.LLLI == 1) {
            C16F5 c16f5DS = multiCoHostBeInvitedFragment.dS();
            MultiCoHostBeInvitedFragment multiCoHostBeInvitedFragment2 = (MultiCoHostBeInvitedFragment) aLAdapterS1S0101001_12.l0;
            int i = aLAdapterS1S0101001_12.i1;
            c16f5DS.setText(MultiCoHostBeInvitedFragment.rS(c16f5DS.getContext().getResources().getQuantityString(2131755811, i, multiCoHostBeInvitedFragment2.LLLII, Integer.valueOf(i))));
            return;
        }
        multiCoHostBeInvitedFragment.dS().setText(C497740JfY.LJIJJ(2131851652, ((MultiCoHostBeInvitedFragment) aLAdapterS1S0101001_12.l0).LLLII));
    }

    public static final void onAnimationEnd$1(ALAdapterS1S0101001_12 aLAdapterS1S0101001_12, Animator animator) {
        super.onAnimationEnd(animator);
        animator.getListeners().remove(aLAdapterS1S0101001_12);
        MultiCoHostBeInvitedFragment multiCoHostBeInvitedFragment = (MultiCoHostBeInvitedFragment) aLAdapterS1S0101001_12.l0;
        if (multiCoHostBeInvitedFragment.LLLI == 1) {
            C16F5 c16f5DS = multiCoHostBeInvitedFragment.dS();
            MultiCoHostBeInvitedFragment multiCoHostBeInvitedFragment2 = (MultiCoHostBeInvitedFragment) aLAdapterS1S0101001_12.l0;
            int i = aLAdapterS1S0101001_12.i1;
            c16f5DS.setText(MultiCoHostBeInvitedFragment.rS(c16f5DS.getContext().getResources().getQuantityString(2131755811, i, multiCoHostBeInvitedFragment2.LLLII, Integer.valueOf(i))));
            return;
        }
        multiCoHostBeInvitedFragment.dS().setText(C497740JfY.LJIJJ(2131851652, ((MultiCoHostBeInvitedFragment) aLAdapterS1S0101001_12.l0).LLLII));
    }

    public static final void onAnimationEnd$2(ALAdapterS1S0101001_12 aLAdapterS1S0101001_12, Animator animator) {
        super.onAnimationEnd(animator);
        animator.getListeners().remove(aLAdapterS1S0101001_12);
        MultiCoHostBeInvitedFragment multiCoHostBeInvitedFragment = (MultiCoHostBeInvitedFragment) aLAdapterS1S0101001_12.l0;
        if (multiCoHostBeInvitedFragment.LLLI == 1) {
            C16F5 c16f5DS = multiCoHostBeInvitedFragment.dS();
            MultiCoHostBeInvitedFragment multiCoHostBeInvitedFragment2 = (MultiCoHostBeInvitedFragment) aLAdapterS1S0101001_12.l0;
            int i = aLAdapterS1S0101001_12.i1;
            c16f5DS.setText(MultiCoHostBeInvitedFragment.rS(c16f5DS.getContext().getResources().getQuantityString(2131755811, i, multiCoHostBeInvitedFragment2.LLLII, Integer.valueOf(i))));
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public ALAdapterS1S0101001_12(float r2, int r3, com.bytedance.android.live.liveinteract.multihost.biz.link.fragment.MultiCoHostBeInvitedFragment r4, int r5) {
        /*
            r1 = this;
            r1.$t = r5
            if (r5 == 0) goto Lf
            r0 = r1
            r0.f2 = r2
            r0.l0 = r4
            r0.i1 = r3
        Lb:
            r0.<init>()
            return
        Lf:
            r0 = r1
            r0.l0 = r4
            r0.f2 = r2
            r0.i1 = r3
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ALAdapterS1S0101001_12.<init>(float, int, com.bytedance.android.live.liveinteract.multihost.biz.link.fragment.MultiCoHostBeInvitedFragment, int):void");
    }
}
