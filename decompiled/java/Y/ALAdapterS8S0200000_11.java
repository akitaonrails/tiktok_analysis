package Y;

import X.C719840SLm;
import X.C786410Ut5;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewPropertyAnimator;
import android.widget.RelativeLayout;
import com.ss.android.ugc.aweme.feed.adapter.AdMultiContentViewHolder;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes12.dex */
public class ALAdapterS8S0200000_11 extends AnimatorListenerAdapter {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        if (this.$t != 0) {
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

    public static final void onAnimationCancel$0(ALAdapterS8S0200000_11 aLAdapterS8S0200000_11, Animator animator) {
        C719840SLm c719840SLm = (C719840SLm) aLAdapterS8S0200000_11.l0;
        if (c719840SLm.LJIJJLI == animator) {
            c719840SLm.LJIJJLI = null;
        }
    }

    public static final void onAnimationEnd$0(ALAdapterS8S0200000_11 aLAdapterS8S0200000_11, Animator animator) {
        C719840SLm c719840SLm = (C719840SLm) aLAdapterS8S0200000_11.l0;
        if (c719840SLm.LJIJJLI == animator) {
            c719840SLm.LJIJJLI = null;
        }
        Function0 function0 = (Function0) aLAdapterS8S0200000_11.l1;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void onAnimationEnd$1(ALAdapterS8S0200000_11 aLAdapterS8S0200000_11, Animator animator) {
        super.onAnimationEnd(animator);
        RelativeLayout relativeLayout = ((AdMultiContentViewHolder) aLAdapterS8S0200000_11.l0).LLJLLIL;
        if (relativeLayout != null) {
            C786410Ut5.LLIIL(relativeLayout, 8);
        }
        ((ViewPropertyAnimator) aLAdapterS8S0200000_11.l1).setListener(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ALAdapterS8S0200000_11(Object obj, C719840SLm c719840SLm, Function0<Unit> function0) {
        this.$t = function0;
        this.l0 = obj;
        this.l1 = c719840SLm;
    }
}
