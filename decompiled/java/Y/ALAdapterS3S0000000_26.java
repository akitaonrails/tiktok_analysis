package Y;

import X.C1092580eXQ;
import X.EnumC1721270utR;
import X.KeyEventCallbackC1765760w3C;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes27.dex */
public class ALAdapterS3S0000000_26 extends AnimatorListenerAdapter {
    public final int $t;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (1 - this.$t != 0) {
            super.onAnimationEnd(animator);
        } else {
            onAnimationEnd$0(this, animator);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        if (this.$t != 0) {
            super.onAnimationStart(animator);
        } else {
            onAnimationStart$0(this, animator);
        }
    }

    public ALAdapterS3S0000000_26(int i) {
        this.$t = i;
    }

    public static final void onAnimationEnd$0(ALAdapterS3S0000000_26 aLAdapterS3S0000000_26, Animator animator) {
        KeyEventCallbackC1765760w3C.LIZJ(KeyEventCallbackC1765760w3C.LLJILJIL);
        KeyEventCallbackC1765760w3C.LLJIJIL = null;
        KeyEventCallbackC1765760w3C.LLJILJIL = null;
        KeyEventCallbackC1765760w3C.LLIZ = null;
        KeyEventCallbackC1765760w3C.LLJ = null;
        KeyEventCallbackC1765760w3C.LLJI = null;
        KeyEventCallbackC1765760w3C.LLIZLLLIL = null;
        KeyEventCallbackC1765760w3C.LLILZIL = null;
        KeyEventCallbackC1765760w3C.LLILZLL = null;
    }

    public static final void onAnimationStart$0(ALAdapterS3S0000000_26 aLAdapterS3S0000000_26, Animator animator) {
        C1092580eXQ.LIZIZ(EnumC1721270utR.START, "MSG_TYPE_LOTTIE_STATUS_UPDATE");
    }
}
