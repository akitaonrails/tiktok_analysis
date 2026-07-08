package Y;

import X.C1295960jpS;
import X.C1339910kyL;
import X.C1339920kyM;
import X.C1353360lK2;
import X.C1381010m2d;
import X.C1381020m2e;
import X.C1384030m7V;
import X.C1391280mJC;
import X.C430440GuI;
import X.C786410Ut5;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import com.ss.android.ugc.aweme.comment.photocomment.CommentInnerGuideAssem;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes22.dex */
public class ALAdapterS17S0100000_21 extends AnimatorListenerAdapter {
    public final int $t;
    public Object l0;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationCancel$0(this, animator);
                break;
            case 1:
            case 2:
            case 5:
            case 6:
            case 7:
            default:
                super.onAnimationCancel(animator);
                break;
            case 3:
                onAnimationCancel$1(this, animator);
                break;
            case 4:
                onAnimationCancel$2(this, animator);
                break;
            case 8:
                onAnimationCancel$3(this, animator);
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
            case 4:
            case 7:
            default:
                super.onAnimationEnd(animator);
                break;
            case 5:
                onAnimationEnd$3(this, animator);
                break;
            case 6:
                onAnimationEnd$4(this, animator);
                break;
            case 8:
                onAnimationEnd$5(this, animator);
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        if (7 - this.$t != 0) {
            super.onAnimationEnd(animator, z);
        } else {
            onAnimationEnd$0(this, animator, z);
        }
    }

    public ALAdapterS17S0100000_21(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onAnimationCancel$0(ALAdapterS17S0100000_21 aLAdapterS17S0100000_21, Animator animator) {
        super.onAnimationCancel(animator);
        ((Runnable) aLAdapterS17S0100000_21.l0).run();
    }

    public static final void onAnimationCancel$1(ALAdapterS17S0100000_21 aLAdapterS17S0100000_21, Animator animator) {
        ArrayList<Animator> childAnimations;
        AnimatorSet animatorSet = ((C1339920kyM) aLAdapterS17S0100000_21.l0).LJI;
        if (animatorSet != null && (childAnimations = animatorSet.getChildAnimations()) != null) {
            Iterator<Animator> it2 = childAnimations.iterator();
            while (it2.hasNext()) {
                it2.next().removeAllListeners();
            }
        }
        C430440GuI c430440GuI = ((C1339920kyM) aLAdapterS17S0100000_21.l0).LIZIZ;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c430440GuI);
        c430440GuI.setAlpha(1.0f);
    }

    public static final void onAnimationCancel$2(ALAdapterS17S0100000_21 aLAdapterS17S0100000_21, Animator animator) {
        super.onAnimationCancel(animator);
        Iterator<Animator> it2 = ((C1339910kyL) aLAdapterS17S0100000_21.l0).LIZLLL.getChildAnimations().iterator();
        while (it2.hasNext()) {
            it2.next().removeAllListeners();
        }
        C1353360lK2 c1353360lK2 = ((C1339910kyL) aLAdapterS17S0100000_21.l0).LIZ;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1353360lK2);
        c1353360lK2.setAlpha(1.0f);
    }

    public static final void onAnimationCancel$3(ALAdapterS17S0100000_21 aLAdapterS17S0100000_21, Animator animator) {
        super.onAnimationCancel(animator);
        ((Runnable) aLAdapterS17S0100000_21.l0).run();
    }

    public static final void onAnimationEnd$0(ALAdapterS17S0100000_21 aLAdapterS17S0100000_21, Animator animator) {
        super.onAnimationEnd(animator);
        ((Runnable) aLAdapterS17S0100000_21.l0).run();
    }

    public static final void onAnimationEnd$1(ALAdapterS17S0100000_21 aLAdapterS17S0100000_21, Animator animator) {
        C1295960jpS c1295960jpS = ((CommentInnerGuideAssem) aLAdapterS17S0100000_21.l0).LLJ;
        if (c1295960jpS != null) {
            c1295960jpS.removeAnimatorListener(aLAdapterS17S0100000_21);
        }
        C786410Ut5.LJLLLLLL(8, ((CommentInnerGuideAssem) aLAdapterS17S0100000_21.l0).LJJIJL());
    }

    public static final void onAnimationEnd$2(ALAdapterS17S0100000_21 aLAdapterS17S0100000_21, Animator animator) {
        ((C1384030m7V) aLAdapterS17S0100000_21.l0).setSelected(!r1.isSelected());
    }

    public static final void onAnimationEnd$3(ALAdapterS17S0100000_21 aLAdapterS17S0100000_21, Animator animator) {
        super.onAnimationEnd(animator);
        C1381010m2d c1381010m2d = C1381010m2d.LIZ;
        C1381020m2e c1381020m2e = (C1381020m2e) aLAdapterS17S0100000_21.l0;
        c1381010m2d.getClass();
        C1381010m2d.LIZ(c1381020m2e);
    }

    public static final void onAnimationEnd$4(ALAdapterS17S0100000_21 aLAdapterS17S0100000_21, Animator animator) {
        ((Function0) aLAdapterS17S0100000_21.l0).invoke();
    }

    public static final void onAnimationEnd$5(ALAdapterS17S0100000_21 aLAdapterS17S0100000_21, Animator animator) {
        super.onAnimationEnd(animator);
        ((Runnable) aLAdapterS17S0100000_21.l0).run();
    }

    public static final void onAnimationEnd$0(ALAdapterS17S0100000_21 aLAdapterS17S0100000_21, Animator animator, boolean z) {
        C786410Ut5.LLLLZLLLI(((C1391280mJC) aLAdapterS17S0100000_21.l0).LL, 0);
        C786410Ut5.LLLLZLLLI(((C1391280mJC) aLAdapterS17S0100000_21.l0).LLILLJJLI, 8);
    }
}
