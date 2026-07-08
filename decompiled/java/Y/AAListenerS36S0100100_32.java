package Y;

import X.AbstractC212300186g;
import X.AnonymousClass1875;
import X.C0NOH;
import X.C0NOI;
import X.C0NOL;
import X.C1720106oR;
import X.C2188811AlT;
import android.animation.Animator;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;

/* JADX INFO: loaded from: classes33.dex */
public class AAListenerS36S0100100_32 implements Animator.AnimatorListener {
    public final int $t;
    public long j1;
    public Object l0;

    public static final void onAnimationCancel$1(AAListenerS36S0100100_32 aAListenerS36S0100100_32, Animator animator) {
    }

    public static final void onAnimationEnd$1(AAListenerS36S0100100_32 aAListenerS36S0100100_32, Animator animator) {
    }

    public static final void onAnimationRepeat$0(AAListenerS36S0100100_32 aAListenerS36S0100100_32, Animator animator) {
    }

    public static final void onAnimationRepeat$1(AAListenerS36S0100100_32 aAListenerS36S0100100_32, Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationCancel$0(this, animator);
                break;
            case 1:
                onAnimationCancel$1(this, animator);
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationEnd$0(this, animator);
                break;
            case 1:
                onAnimationEnd$1(this, animator);
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationRepeat$0(this, animator);
                break;
            case 1:
                onAnimationRepeat$1(this, animator);
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationStart$0(this, animator);
                break;
            case 1:
                onAnimationStart$1(this, animator);
                break;
        }
    }

    public static final void onAnimationCancel$0(AAListenerS36S0100100_32 aAListenerS36S0100100_32, Animator animator) {
        Animator animatorV;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("cancelcallback:extendTimeAnimator: ");
        AnonymousClass1875 anonymousClass1875 = ((AbstractC212300186g) aAListenerS36S0100100_32.l0).LLJILJIL;
        if (anonymousClass1875 != null) {
            animatorV = anonymousClass1875.V();
        } else {
            animatorV = null;
        }
        sbLIZ.append(animatorV);
        sbLIZ.append(", isPopup: ");
        sbLIZ.append(((AbstractC212300186g) aAListenerS36S0100100_32.l0).LLJI);
        sbLIZ.append(' ');
        C1720106oR.LJI("UsBidCardView", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final void onAnimationEnd$0(AAListenerS36S0100100_32 aAListenerS36S0100100_32, Animator animator) {
        Animator animatorV;
        C0NOI c0noiLIZ = C0NOL.LIZ(0L, SystemClock.elapsedRealtime() + ((aAListenerS36S0100100_32.j1 + 1) * ((long) LSPassThroughRecordSizeConfig.DEFAULT)), 1L, 1L);
        if (c0noiLIZ != null) {
            AbstractC212300186g abstractC212300186g = (AbstractC212300186g) aAListenerS36S0100100_32.l0;
            C0NOH countDownManager = abstractC212300186g.getCountDownManager();
            if (countDownManager != null) {
                countDownManager.LIZLLL(c0noiLIZ);
            }
            C0NOH countDownManager2 = abstractC212300186g.getCountDownManager();
            if (countDownManager2 != null) {
                C0NOH.LJ(countDownManager2);
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("endcallback:extendTimeAnimator: ");
        AnonymousClass1875 anonymousClass1875 = ((AbstractC212300186g) aAListenerS36S0100100_32.l0).LLJILJIL;
        if (anonymousClass1875 != null) {
            animatorV = anonymousClass1875.V();
        } else {
            animatorV = null;
        }
        sbLIZ.append(animatorV);
        sbLIZ.append(", isPopup: ");
        sbLIZ.append(((AbstractC212300186g) aAListenerS36S0100100_32.l0).LLJI);
        sbLIZ.append(' ');
        C1720106oR.LJI("UsBidCardView", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final void onAnimationStart$0(AAListenerS36S0100100_32 aAListenerS36S0100100_32, Animator animator) {
        Animator animatorV;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("startcallback:extendTimeAnimator: ");
        AnonymousClass1875 anonymousClass1875 = ((AbstractC212300186g) aAListenerS36S0100100_32.l0).LLJILJIL;
        if (anonymousClass1875 != null) {
            animatorV = anonymousClass1875.V();
        } else {
            animatorV = null;
        }
        sbLIZ.append(animatorV);
        sbLIZ.append(", isPopup: ");
        sbLIZ.append(((AbstractC212300186g) aAListenerS36S0100100_32.l0).LLJI);
        sbLIZ.append(' ');
        C1720106oR.LJI("UsBidCardView", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final void onAnimationStart$1(AAListenerS36S0100100_32 aAListenerS36S0100100_32, Animator animator) {
        ((AbstractC212300186g) aAListenerS36S0100100_32.l0).setRemainingTime((aAListenerS36S0100100_32.j1 / ((long) LSPassThroughRecordSizeConfig.DEFAULT)) % ((long) 60));
    }

    public AAListenerS36S0100100_32(long j, AbstractC212300186g abstractC212300186g, int i) {
        this.$t = i;
        this.l0 = abstractC212300186g;
        this.j1 = j;
    }
}
