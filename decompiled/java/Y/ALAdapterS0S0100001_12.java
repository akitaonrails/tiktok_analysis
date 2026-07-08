package Y;

import X.C0CAU;
import X.C0TKN;
import X.C16F5;
import X.C20441214yg;
import X.C2188811AlT;
import X.C497740JfY;
import X.C500260Jjc;
import X.C786410Ut5;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.bytedance.android.live.liveinteract.multihost.biz.link.fragment.MultiCoHostBeInvitedFragment;
import com.ss.android.ugc.aweme.feed.adapter.widget.follow.LivePreviewFollowGuideCardWidget;

/* JADX INFO: loaded from: classes13.dex */
public class ALAdapterS0S0100001_12 extends AnimatorListenerAdapter {
    public final int $t;
    public float f1;
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
            case 3:
                onAnimationEnd$3(this, animator);
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        if (3 - this.$t != 0) {
            super.onAnimationStart(animator);
        } else {
            onAnimationStart$0(this, animator);
        }
    }

    public static final void onAnimationCancel$0(ALAdapterS0S0100001_12 aLAdapterS0S0100001_12, Animator animator) {
        super.onAnimationCancel(animator);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("animate0To1MemberWithHeader");
        sbLIZ.append(", animation Cancel");
        C20441214yg.LIZIZ("MultiCoHostBeInvitedFragment", C2188811AlT.LIZIZ(sbLIZ));
        C500260Jjc.LJJZ((int) aLAdapterS0S0100001_12.f1, ((MultiCoHostBeInvitedFragment) aLAdapterS0S0100001_12.l0).cS());
        MultiCoHostBeInvitedFragment multiCoHostBeInvitedFragment = (MultiCoHostBeInvitedFragment) aLAdapterS0S0100001_12.l0;
        if (multiCoHostBeInvitedFragment.LLLI == 1) {
            C16F5 c16f5DS = multiCoHostBeInvitedFragment.dS();
            c16f5DS.setText(MultiCoHostBeInvitedFragment.rS(c16f5DS.getContext().getResources().getQuantityString(2131755811, 1, ((MultiCoHostBeInvitedFragment) aLAdapterS0S0100001_12.l0).LLLII, 1)));
            return;
        }
        multiCoHostBeInvitedFragment.dS().setText(C497740JfY.LJIJJ(2131851652, ((MultiCoHostBeInvitedFragment) aLAdapterS0S0100001_12.l0).LLLII));
    }

    public static final void onAnimationCancel$1(ALAdapterS0S0100001_12 aLAdapterS0S0100001_12, Animator animator) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("animate0To1MemberWithoutHeader");
        sbLIZ.append(", animation Cancel, finalHeight = ");
        sbLIZ.append(aLAdapterS0S0100001_12.f1);
        C20441214yg.LIZIZ("MultiCoHostBeInvitedFragment", C2188811AlT.LIZIZ(sbLIZ));
        super.onAnimationCancel(animator);
        C500260Jjc.LJJZ((int) aLAdapterS0S0100001_12.f1, ((MultiCoHostBeInvitedFragment) aLAdapterS0S0100001_12.l0).cS());
        MultiCoHostBeInvitedFragment multiCoHostBeInvitedFragment = (MultiCoHostBeInvitedFragment) aLAdapterS0S0100001_12.l0;
        if (multiCoHostBeInvitedFragment.LLLI == 1) {
            C16F5 c16f5DS = multiCoHostBeInvitedFragment.dS();
            c16f5DS.setText(MultiCoHostBeInvitedFragment.rS(c16f5DS.getContext().getResources().getQuantityString(2131755811, 1, ((MultiCoHostBeInvitedFragment) aLAdapterS0S0100001_12.l0).LLLII, 1)));
            return;
        }
        multiCoHostBeInvitedFragment.dS().setText(C497740JfY.LJIJJ(2131851652, ((MultiCoHostBeInvitedFragment) aLAdapterS0S0100001_12.l0).LLLII));
    }

    public static final void onAnimationCancel$2(ALAdapterS0S0100001_12 aLAdapterS0S0100001_12, Animator animator) {
        super.onAnimationCancel(animator);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("animate2To1Member");
        sbLIZ.append(", animation Cancel");
        C20441214yg.LIZIZ("MultiCoHostBeInvitedFragment", C2188811AlT.LIZIZ(sbLIZ));
        C500260Jjc.LJJZ((int) aLAdapterS0S0100001_12.f1, ((MultiCoHostBeInvitedFragment) aLAdapterS0S0100001_12.l0).cS());
        MultiCoHostBeInvitedFragment multiCoHostBeInvitedFragment = (MultiCoHostBeInvitedFragment) aLAdapterS0S0100001_12.l0;
        if (multiCoHostBeInvitedFragment.LLLI == 1) {
            C16F5 c16f5DS = multiCoHostBeInvitedFragment.dS();
            c16f5DS.setText(MultiCoHostBeInvitedFragment.rS(c16f5DS.getContext().getResources().getQuantityString(2131755811, 1, ((MultiCoHostBeInvitedFragment) aLAdapterS0S0100001_12.l0).LLLII, 1)));
        }
    }

    public static final void onAnimationEnd$0(ALAdapterS0S0100001_12 aLAdapterS0S0100001_12, Animator animator) {
        super.onAnimationEnd(animator);
        animator.getListeners().remove(aLAdapterS0S0100001_12);
        MultiCoHostBeInvitedFragment multiCoHostBeInvitedFragment = (MultiCoHostBeInvitedFragment) aLAdapterS0S0100001_12.l0;
        if (multiCoHostBeInvitedFragment.LLLI == 1) {
            C16F5 c16f5DS = multiCoHostBeInvitedFragment.dS();
            c16f5DS.setText(MultiCoHostBeInvitedFragment.rS(c16f5DS.getContext().getResources().getQuantityString(2131755811, 1, ((MultiCoHostBeInvitedFragment) aLAdapterS0S0100001_12.l0).LLLII, 1)));
            return;
        }
        multiCoHostBeInvitedFragment.dS().setText(C497740JfY.LJIJJ(2131851652, ((MultiCoHostBeInvitedFragment) aLAdapterS0S0100001_12.l0).LLLII));
    }

    public static final void onAnimationEnd$1(ALAdapterS0S0100001_12 aLAdapterS0S0100001_12, Animator animator) {
        super.onAnimationEnd(animator);
        animator.getListeners().remove(aLAdapterS0S0100001_12);
        MultiCoHostBeInvitedFragment multiCoHostBeInvitedFragment = (MultiCoHostBeInvitedFragment) aLAdapterS0S0100001_12.l0;
        if (multiCoHostBeInvitedFragment.LLLI == 1) {
            C16F5 c16f5DS = multiCoHostBeInvitedFragment.dS();
            c16f5DS.setText(MultiCoHostBeInvitedFragment.rS(c16f5DS.getContext().getResources().getQuantityString(2131755811, 1, ((MultiCoHostBeInvitedFragment) aLAdapterS0S0100001_12.l0).LLLII, 1)));
            return;
        }
        multiCoHostBeInvitedFragment.dS().setText(C497740JfY.LJIJJ(2131851652, ((MultiCoHostBeInvitedFragment) aLAdapterS0S0100001_12.l0).LLLII));
    }

    public static final void onAnimationEnd$2(ALAdapterS0S0100001_12 aLAdapterS0S0100001_12, Animator animator) {
        super.onAnimationEnd(animator);
        animator.getListeners().remove(aLAdapterS0S0100001_12);
        MultiCoHostBeInvitedFragment multiCoHostBeInvitedFragment = (MultiCoHostBeInvitedFragment) aLAdapterS0S0100001_12.l0;
        if (multiCoHostBeInvitedFragment.LLLI == 1) {
            C16F5 c16f5DS = multiCoHostBeInvitedFragment.dS();
            c16f5DS.setText(MultiCoHostBeInvitedFragment.rS(c16f5DS.getContext().getResources().getQuantityString(2131755811, 1, ((MultiCoHostBeInvitedFragment) aLAdapterS0S0100001_12.l0).LLLII, 1)));
        }
    }

    public static final void onAnimationEnd$3(ALAdapterS0S0100001_12 aLAdapterS0S0100001_12, Animator animator) {
        LivePreviewFollowGuideCardWidget livePreviewFollowGuideCardWidget = (LivePreviewFollowGuideCardWidget) aLAdapterS0S0100001_12.l0;
        if (livePreviewFollowGuideCardWidget.LLJJJJ == null) {
            long j = C0TKN.LIZ().showDuration;
            ARunnableS112S0100000_12 aRunnableS112S0100000_12 = livePreviewFollowGuideCardWidget.LLJJJJ;
            if (aRunnableS112S0100000_12 != null) {
                C0CAU.LIZ.removeCallbacks(aRunnableS112S0100000_12);
            }
            ARunnableS112S0100000_12 aRunnableS112S0100000_122 = new ARunnableS112S0100000_12(livePreviewFollowGuideCardWidget, 358);
            livePreviewFollowGuideCardWidget.LLJJJJ = aRunnableS112S0100000_122;
            C786410Ut5.LJLIIL(j, C0CAU.LIZ, aRunnableS112S0100000_122);
        }
    }

    public static final void onAnimationStart$0(ALAdapterS0S0100001_12 aLAdapterS0S0100001_12, Animator animator) {
        View view = ((LivePreviewFollowGuideCardWidget) aLAdapterS0S0100001_12.l0).getView();
        if (view != null) {
            C786410Ut5.ed(view, aLAdapterS0S0100001_12.f1);
        }
        View view2 = ((LivePreviewFollowGuideCardWidget) aLAdapterS0S0100001_12.l0).getView();
        if (view2 != null) {
            C786410Ut5.T4(view2, 1.0f);
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public ALAdapterS0S0100001_12(float r2, com.bytedance.android.live.liveinteract.multihost.biz.link.fragment.MultiCoHostBeInvitedFragment r3, int r4) {
        /*
            r1 = this;
            r1.$t = r4
            switch(r4) {
                case 0: goto Le;
                case 1: goto L5;
                case 2: goto Le;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.f1 = r2
            r0.l0 = r3
        La:
            r0.<init>()
            return
        Le:
            r0 = r1
            r0.l0 = r3
            r0.f1 = r2
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ALAdapterS0S0100001_12.<init>(float, com.bytedance.android.live.liveinteract.multihost.biz.link.fragment.MultiCoHostBeInvitedFragment, int):void");
    }

    public ALAdapterS0S0100001_12(LivePreviewFollowGuideCardWidget livePreviewFollowGuideCardWidget, float f, int i) {
        this.$t = i;
        this.l0 = livePreviewFollowGuideCardWidget;
        this.f1 = f;
    }
}
