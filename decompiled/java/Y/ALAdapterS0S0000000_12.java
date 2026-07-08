package Y;

import X.C0UM0;
import X.C767200U7q;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;

/* JADX INFO: loaded from: classes13.dex */
public class ALAdapterS0S0000000_12 extends AnimatorListenerAdapter {
    public final int $t;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.$t) {
            case 3:
                onAnimationEnd$0(this, animator);
                break;
            case 4:
                C0UM0.LIZ = false;
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    public ALAdapterS0S0000000_12(int i) {
        this.$t = i;
    }

    public static final void onAnimationEnd$0(ALAdapterS0S0000000_12 aLAdapterS0S0000000_12, Animator animator) {
        super.onAnimationEnd(animator);
        C767200U7q.LJIIJJI = null;
        LiveEffect liveEffect = C767200U7q.LJI;
        if (liveEffect != null && (!liveEffect.LJJIJIIJI())) {
            C767200U7q.LIZIZ.LJIIJ(liveEffect, C767200U7q.LIZJ);
        }
    }
}
