package Y;

import X.C21646519nb;
import X.C337180DJs;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.ss.android.ugc.aweme.im.sdk.unreadindicator.UnreadIndicatorAssemV2;
import java.util.Iterator;

/* JADX INFO: loaded from: classes15.dex */
public class ALAdapterS10S0100000_14 extends AnimatorListenerAdapter {
    public final int $t;
    public Object l0;

    public static final void onAnimationEnd$3(ALAdapterS10S0100000_14 aLAdapterS10S0100000_14, Animator animator) {
    }

    public static final void onAnimationStart$0(ALAdapterS10S0100000_14 aLAdapterS10S0100000_14, Animator animator) {
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
        switch (this.$t) {
            case 2:
                onAnimationStart$0(this, animator);
                break;
            case 3:
                onAnimationStart$1(this, animator);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public ALAdapterS10S0100000_14(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onAnimationEnd$0(ALAdapterS10S0100000_14 aLAdapterS10S0100000_14, Animator animator) {
        C337180DJs.LIZ(((UnreadIndicatorAssemV2) aLAdapterS10S0100000_14.l0).Lo());
        Iterator<View> it2 = ((UnreadIndicatorAssemV2) aLAdapterS10S0100000_14.l0).LLJ.iterator();
        while (it2.hasNext()) {
            C337180DJs.LIZ(it2.next());
        }
        UnreadIndicatorAssemV2 unreadIndicatorAssemV2 = (UnreadIndicatorAssemV2) aLAdapterS10S0100000_14.l0;
        unreadIndicatorAssemV2.LLJIJIL = null;
        unreadIndicatorAssemV2.LLJILLL = false;
    }

    public static final void onAnimationEnd$1(ALAdapterS10S0100000_14 aLAdapterS10S0100000_14, Animator animator) {
        C21646519nb c21646519nb = (C21646519nb) aLAdapterS10S0100000_14.l0;
        if (c21646519nb.LJJIII == animator) {
            c21646519nb.LJJIII = null;
        }
    }

    public static final void onAnimationEnd$2(ALAdapterS10S0100000_14 aLAdapterS10S0100000_14, Animator animator) {
        C337180DJs.LIZ((View) aLAdapterS10S0100000_14.l0);
    }

    public static final void onAnimationStart$1(ALAdapterS10S0100000_14 aLAdapterS10S0100000_14, Animator animator) {
        C337180DJs.LIZJ(((UnreadIndicatorAssemV2) aLAdapterS10S0100000_14.l0).Lo());
    }
}
