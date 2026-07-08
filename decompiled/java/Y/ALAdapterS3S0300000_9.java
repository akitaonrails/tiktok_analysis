package Y;

import X.C786410Ut5;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import com.ss.android.ugc.aweme.inbox.bulletin.animation.BulletinInputAnimationManagerAssem;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public class ALAdapterS3S0300000_9 extends AnimatorListenerAdapter {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

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

    public static final void onAnimationEnd$0(ALAdapterS3S0300000_9 aLAdapterS3S0300000_9, Animator animator) {
        C786410Ut5.Jc((View) aLAdapterS3S0300000_9.l0, 0.0f);
        C786410Ut5.ed((View) aLAdapterS3S0300000_9.l0, 0.0f);
        C786410Ut5.T4((View) aLAdapterS3S0300000_9.l0, 1.0f);
        ((ArrayList) ((BulletinInputAnimationManagerAssem) aLAdapterS3S0300000_9.l1).LLJ).remove((AnimatorSet) aLAdapterS3S0300000_9.l2);
    }

    public static final void onAnimationEnd$1(ALAdapterS3S0300000_9 aLAdapterS3S0300000_9, Animator animator) {
        C786410Ut5.LJLLLLLL(8, (View) aLAdapterS3S0300000_9.l0);
        C786410Ut5.Jc((View) aLAdapterS3S0300000_9.l0, 0.0f);
        C786410Ut5.ed((View) aLAdapterS3S0300000_9.l0, 0.0f);
        C786410Ut5.T4((View) aLAdapterS3S0300000_9.l0, 1.0f);
        ((ArrayList) ((BulletinInputAnimationManagerAssem) aLAdapterS3S0300000_9.l1).LLJ).remove((AnimatorSet) aLAdapterS3S0300000_9.l2);
    }

    public static final void onAnimationEnd$2(ALAdapterS3S0300000_9 aLAdapterS3S0300000_9, Animator animator) {
        C786410Ut5.T4((View) aLAdapterS3S0300000_9.l0, 1.0f);
        ((ArrayList) ((BulletinInputAnimationManagerAssem) aLAdapterS3S0300000_9.l1).LLJ).remove((ObjectAnimator) aLAdapterS3S0300000_9.l2);
    }

    public ALAdapterS3S0300000_9(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
