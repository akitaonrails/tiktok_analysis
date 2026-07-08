package Y;

import X.C0DIT;
import X.C0DUR;
import X.C19ME;
import X.C786410Ut5;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes5.dex */
public class ALAdapterS1S0100000_4 extends AnimatorListenerAdapter {
    public final int $t;
    public Object l0;

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
            default:
                super.onAnimationEnd(animator);
                break;
            case 2:
                onAnimationEnd$1(this, animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.$t) {
            case 1:
                onAnimationStart$0(this, animator);
                break;
            case 2:
            default:
                super.onAnimationStart(animator);
                break;
            case 3:
                onAnimationStart$1(this, animator);
                break;
        }
    }

    public ALAdapterS1S0100000_4(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onAnimationCancel$0(ALAdapterS1S0100000_4 aLAdapterS1S0100000_4, Animator animator) {
        ((C0DIT) aLAdapterS1S0100000_4.l0).R5();
    }

    public static final void onAnimationEnd$0(ALAdapterS1S0100000_4 aLAdapterS1S0100000_4, Animator animator) {
        ((C0DIT) aLAdapterS1S0100000_4.l0).R5();
    }

    public static final void onAnimationEnd$1(ALAdapterS1S0100000_4 aLAdapterS1S0100000_4, Animator animator) {
        C786410Ut5.LJZ(8, ((C0DUR) aLAdapterS1S0100000_4.l0).LLILLJJLI);
    }

    public static final void onAnimationStart$0(ALAdapterS1S0100000_4 aLAdapterS1S0100000_4, Animator animator) {
        ViewGroup.LayoutParams layoutParams = ((View) aLAdapterS1S0100000_4.l0).getLayoutParams();
        if (layoutParams instanceof C19ME) {
            C19ME c19me = (C19ME) layoutParams;
            c19me.startToEnd = -1;
            c19me.endToEnd = 0;
        }
        C786410Ut5.W5((View) aLAdapterS1S0100000_4.l0, layoutParams);
    }

    public static final void onAnimationStart$1(ALAdapterS1S0100000_4 aLAdapterS1S0100000_4, Animator animator) {
        C786410Ut5.LJZ(0, ((C0DUR) aLAdapterS1S0100000_4.l0).LLILLJJLI);
    }
}
