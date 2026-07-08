package Y;

import X.AbstractC453920Hr4;
import X.C1440005kM;
import X.C453930Hr5;
import X.C453940Hr6;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes30.dex */
public class ALAdapterS4S0000000_29 extends AnimatorListenerAdapter {
    public final int $t;

    public static final void onAnimationEnd$0(ALAdapterS4S0000000_29 aLAdapterS4S0000000_29, Animator animator, boolean z) {
    }

    public static final void onAnimationEnd$1(ALAdapterS4S0000000_29 aLAdapterS4S0000000_29, Animator animator, boolean z) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (2 - this.$t != 0) {
            super.onAnimationEnd(animator);
        } else {
            onAnimationEnd$0(this, animator);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        switch (this.$t) {
            case 0:
                onAnimationEnd$0(this, animator, z);
                break;
            case 1:
                onAnimationEnd$1(this, animator, z);
                break;
            default:
                super.onAnimationEnd(animator, z);
                break;
        }
    }

    public ALAdapterS4S0000000_29(int i) {
        this.$t = i;
    }

    public static final void onAnimationEnd$0(ALAdapterS4S0000000_29 aLAdapterS4S0000000_29, Animator animator) {
        super.onAnimationEnd(animator);
        C1440005kM.LIZ(new C453940Hr6(false, false, (AbstractC453920Hr4) C453930Hr5.LIZ));
    }
}
