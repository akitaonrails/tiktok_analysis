package Y;

import X.AnonymousClass1965;
import X.C1295960jpS;
import X.C20441214yg;
import X.C214833195r;
import X.C2188811AlT;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveCohostMockQuickCohostAvatarNudgeSetting;

/* JADX INFO: loaded from: classes21.dex */
public class ALAdapterS15S0200000_20 extends AnimatorListenerAdapter {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        if (1 - this.$t != 0) {
            super.onAnimationCancel(animator);
        } else {
            onAnimationCancel$0(this, animator);
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
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        if (1 - this.$t != 0) {
            super.onAnimationRepeat(animator);
        } else {
            onAnimationRepeat$0(this, animator);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        if (1 - this.$t != 0) {
            super.onAnimationStart(animator);
        } else {
            onAnimationStart$0(this, animator);
        }
    }

    public static final void onAnimationCancel$0(ALAdapterS15S0200000_20 aLAdapterS15S0200000_20, Animator animator) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Lottie B onAnimationCancel — playback CANCELLED (viewHash=");
        sbLIZ.append(((C1295960jpS) aLAdapterS15S0200000_20.l0).hashCode());
        sbLIZ.append(" progress=");
        sbLIZ.append(((C1295960jpS) aLAdapterS15S0200000_20.l0).getProgress());
        sbLIZ.append(") T067z: callbackCountAtCancel=");
        sbLIZ.append(((C214833195r) aLAdapterS15S0200000_20.l1).LJJIJ);
        sbLIZ.append(". Unexpected unless OnSearchCancelled fired mid-success-anim.");
        C20441214yg.LJIIIZ("QuickPairWaitingAnimComponent", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final void onAnimationEnd$0(ALAdapterS15S0200000_20 aLAdapterS15S0200000_20, Animator animator) {
        C1295960jpS c1295960jpS = (C1295960jpS) aLAdapterS15S0200000_20.l0;
        c1295960jpS.setFrame((int) c1295960jpS.getMaxFrame());
        ((AnonymousClass1965) aLAdapterS15S0200000_20.l1).LJJJJLL(true);
    }

    public static final void onAnimationEnd$1(ALAdapterS15S0200000_20 aLAdapterS15S0200000_20, Animator animator) {
        boolean z;
        float progress = ((C1295960jpS) aLAdapterS15S0200000_20.l0).getProgress();
        if (progress >= 0.99f) {
            z = true;
        } else {
            z = false;
        }
        LiveCohostMockQuickCohostAvatarNudgeSetting.Configs value = LiveCohostMockQuickCohostAvatarNudgeSetting.INSTANCE.getValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Lottie B onAnimationEnd — playback ENDED (viewHash=");
        sbLIZ.append(((C1295960jpS) aLAdapterS15S0200000_20.l0).hashCode());
        sbLIZ.append(" progress=");
        sbLIZ.append(progress);
        sbLIZ.append(" natural=");
        sbLIZ.append(z);
        sbLIZ.append(") T067z: callbackCountTotal=");
        sbLIZ.append(((C214833195r) aLAdapterS15S0200000_20.l1).LJJIJ);
        sbLIZ.append(" finalSettingPayload=(dx=");
        sbLIZ.append(value.dx);
        sbLIZ.append(", dy=");
        sbLIZ.append(value.dy);
        sbLIZ.append(").");
        C20441214yg.LJIIIZ("QuickPairWaitingAnimComponent", C2188811AlT.LIZIZ(sbLIZ));
        if (z) {
            C214833195r c214833195r = (C214833195r) aLAdapterS15S0200000_20.l1;
            c214833195r.LJJIII = true;
            c214833195r.LJJIIJ("lottieB.onAnimationEnd");
        }
    }

    public static final void onAnimationRepeat$0(ALAdapterS15S0200000_20 aLAdapterS15S0200000_20, Animator animator) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Lottie B onAnimationRepeat — loop iteration (viewHash=");
        sbLIZ.append(((C1295960jpS) aLAdapterS15S0200000_20.l0).hashCode());
        sbLIZ.append("). Unexpected — Lottie B is a one-shot (repeatCount=0).");
        C20441214yg.LIZIZ("QuickPairWaitingAnimComponent", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final void onAnimationStart$0(ALAdapterS15S0200000_20 aLAdapterS15S0200000_20, Animator animator) {
        boolean z;
        LiveCohostMockQuickCohostAvatarNudgeSetting.Configs value = LiveCohostMockQuickCohostAvatarNudgeSetting.INSTANCE.getValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Lottie B onAnimationStart — playback STARTED (viewHash=");
        sbLIZ.append(((C1295960jpS) aLAdapterS15S0200000_20.l0).hashCode());
        sbLIZ.append(" duration=");
        sbLIZ.append(((C1295960jpS) aLAdapterS15S0200000_20.l0).getDuration());
        sbLIZ.append("ms repeatCount=");
        sbLIZ.append(((C1295960jpS) aLAdapterS15S0200000_20.l0).getRepeatCount());
        sbLIZ.append(" progress=");
        sbLIZ.append(((C1295960jpS) aLAdapterS15S0200000_20.l0).getProgress());
        sbLIZ.append(" partnerAvatarBitmapNonNull=");
        if (((C214833195r) aLAdapterS15S0200000_20.l1).LJIIZILJ != null) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        sbLIZ.append(") T067z: callbackCountSoFar=");
        sbLIZ.append(((C214833195r) aLAdapterS15S0200000_20.l1).LJJIJ);
        sbLIZ.append(" currentSettingPayload=(dx=");
        sbLIZ.append(value.dx);
        sbLIZ.append(", dy=");
        sbLIZ.append(value.dy);
        sbLIZ.append(").");
        C20441214yg.LJIIIZ("QuickPairWaitingAnimComponent", C2188811AlT.LIZIZ(sbLIZ));
    }

    public ALAdapterS15S0200000_20(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
