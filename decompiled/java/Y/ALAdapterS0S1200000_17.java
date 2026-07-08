package Y;

import X.C1104350eqP;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.bytedance.android.livesdk.envelope.model.RedEnvelopeInfoModel4FE;
import com.bytedance.android.livesdk.envelope.widget.RedEnvelopeWidget;

/* JADX INFO: loaded from: classes18.dex */
public class ALAdapterS0S1200000_17 extends AnimatorListenerAdapter {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

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
    public final void onAnimationStart(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationStart$0(this, animator);
                break;
            case 1:
                onAnimationStart$1(this, animator);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public static final void onAnimationEnd$0(ALAdapterS0S1200000_17 aLAdapterS0S1200000_17, Animator animator) {
        C1104350eqP.LIZLLL(Boolean.valueOf(((RedEnvelopeWidget) aLAdapterS0S1200000_17.l2).C1().isAnchor()), aLAdapterS0S1200000_17.s0, ((RedEnvelopeInfoModel4FE) aLAdapterS0S1200000_17.l1).envelopList);
    }

    public static final void onAnimationEnd$1(ALAdapterS0S1200000_17 aLAdapterS0S1200000_17, Animator animator) {
        C1104350eqP.LIZLLL(Boolean.valueOf(((RedEnvelopeWidget) aLAdapterS0S1200000_17.l2).C1().isAnchor()), aLAdapterS0S1200000_17.s0, ((RedEnvelopeInfoModel4FE) aLAdapterS0S1200000_17.l1).envelopList);
    }

    public static final void onAnimationStart$0(ALAdapterS0S1200000_17 aLAdapterS0S1200000_17, Animator animator) {
        C1104350eqP.LIZJ(Boolean.valueOf(((RedEnvelopeWidget) aLAdapterS0S1200000_17.l2).C1().isAnchor()), aLAdapterS0S1200000_17.s0, ((RedEnvelopeInfoModel4FE) aLAdapterS0S1200000_17.l1).envelopList);
    }

    public static final void onAnimationStart$1(ALAdapterS0S1200000_17 aLAdapterS0S1200000_17, Animator animator) {
        C1104350eqP.LIZJ(Boolean.valueOf(((RedEnvelopeWidget) aLAdapterS0S1200000_17.l2).C1().isAnchor()), aLAdapterS0S1200000_17.s0, ((RedEnvelopeInfoModel4FE) aLAdapterS0S1200000_17.l1).envelopList);
    }

    public ALAdapterS0S1200000_17(String str, RedEnvelopeInfoModel4FE redEnvelopeInfoModel4FE, RedEnvelopeWidget redEnvelopeWidget, int i) {
        this.$t = i;
        this.s0 = str;
        this.l1 = redEnvelopeInfoModel4FE;
        this.l2 = redEnvelopeWidget;
    }
}
