package Y;

import X.C1339870kyH;
import X.C1340200kyo;
import X.C1345550l7R;
import X.C1365870leD;
import X.C1381010m2d;
import X.C1381020m2e;
import X.C786410Ut5;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: loaded from: classes22.dex */
public class ALAdapterS10S0300000_21 extends AnimatorListenerAdapter {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        if (2 - this.$t != 0) {
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
            case 2:
                onAnimationEnd$2(this, animator);
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    public static final void onAnimationCancel$0(ALAdapterS10S0300000_21 aLAdapterS10S0300000_21, Animator animator) {
        super.onAnimationCancel(animator);
        TuxTextView tuxTextView = (TuxTextView) aLAdapterS10S0300000_21.l2;
        if (tuxTextView != null) {
            C786410Ut5.B5(tuxTextView, 1.0f);
        }
    }

    public static final void onAnimationEnd$0(ALAdapterS10S0300000_21 aLAdapterS10S0300000_21, Animator animator) {
        ViewGroup.LayoutParams layoutParams = ((View) aLAdapterS10S0300000_21.l0).getLayoutParams();
        layoutParams.height = -2;
        C786410Ut5.W5((View) aLAdapterS10S0300000_21.l0, layoutParams);
        LinearLayout linearLayout = (LinearLayout) aLAdapterS10S0300000_21.l1;
        if (linearLayout != null) {
            C786410Ut5.LJZL(8, linearLayout);
        }
        LinearLayout linearLayout2 = (LinearLayout) aLAdapterS10S0300000_21.l1;
        if (linearLayout2 != null) {
            C786410Ut5.W4(linearLayout2, 1.0f);
        }
        ((C1340200kyo) aLAdapterS10S0300000_21.l2).LLJJJJ = null;
    }

    public static final void onAnimationEnd$1(ALAdapterS10S0300000_21 aLAdapterS10S0300000_21, Animator animator) {
        super.onAnimationEnd(animator);
        C1381010m2d c1381010m2d = C1381010m2d.LIZ;
        C1365870leD c1365870leD = (C1365870leD) aLAdapterS10S0300000_21.l0;
        Aweme aweme = (Aweme) aLAdapterS10S0300000_21.l1;
        C1381020m2e c1381020m2e = (C1381020m2e) aLAdapterS10S0300000_21.l2;
        c1381010m2d.getClass();
        if (c1381020m2e != null) {
            View view = c1381020m2e.LIZIZ;
            if (view != null) {
                C786410Ut5.I7(new ACListenerS86S0300000_21(c1365870leD, c1381020m2e, aweme, 10), view);
            }
            C1381010m2d.LIZLLL(c1365870leD, c1381020m2e);
        }
    }

    public static final void onAnimationEnd$2(ALAdapterS10S0300000_21 aLAdapterS10S0300000_21, Animator animator) {
        C1345550l7R c1345550l7R = (C1345550l7R) aLAdapterS10S0300000_21.l0;
        if (c1345550l7R != null) {
            c1345550l7R.setIsHateAnimating(false);
        }
        ((C1339870kyH) aLAdapterS10S0300000_21.l1).LIZIZ = null;
    }

    public ALAdapterS10S0300000_21(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
