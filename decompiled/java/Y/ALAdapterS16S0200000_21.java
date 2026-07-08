package Y;

import X.C1340200kyo;
import X.C1365860leC;
import X.C1376950lw5;
import X.C1381010m2d;
import X.C1381020m2e;
import X.C786410Ut5;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: classes22.dex */
public class ALAdapterS16S0200000_21 extends AnimatorListenerAdapter {
    public final int $t;
    public Object l0;
    public Object l1;

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

    public static final void onAnimationEnd$0(ALAdapterS16S0200000_21 aLAdapterS16S0200000_21, Animator animator) {
        C786410Ut5.LJLLLLLL(8, (View) aLAdapterS16S0200000_21.l0);
        ViewGroup.LayoutParams layoutParams = ((View) aLAdapterS16S0200000_21.l0).getLayoutParams();
        layoutParams.height = -2;
        C786410Ut5.W5((View) aLAdapterS16S0200000_21.l0, layoutParams);
        ((C1340200kyo) aLAdapterS16S0200000_21.l1).LLJJJJ = null;
    }

    public static final void onAnimationEnd$1(ALAdapterS16S0200000_21 aLAdapterS16S0200000_21, Animator animator) {
        LinearLayout linearLayout = (LinearLayout) aLAdapterS16S0200000_21.l0;
        if (linearLayout != null) {
            C786410Ut5.LJZL(8, linearLayout);
        }
        LinearLayout linearLayout2 = (LinearLayout) aLAdapterS16S0200000_21.l0;
        if (linearLayout2 != null) {
            C786410Ut5.W4(linearLayout2, 1.0f);
        }
        ((C1340200kyo) aLAdapterS16S0200000_21.l1).LLJJJJ = null;
    }

    public static final void onAnimationEnd$2(ALAdapterS16S0200000_21 aLAdapterS16S0200000_21, Animator animator) {
        super.onAnimationEnd(animator);
        C1381010m2d c1381010m2d = C1381010m2d.LIZ;
        C1365860leC c1365860leC = (C1365860leC) aLAdapterS16S0200000_21.l0;
        C1381020m2e c1381020m2e = (C1381020m2e) aLAdapterS16S0200000_21.l1;
        c1381010m2d.getClass();
        C1381010m2d.LIZLLL(c1365860leC, c1381020m2e);
    }

    public static final void onAnimationEnd$3(ALAdapterS16S0200000_21 aLAdapterS16S0200000_21, Animator animator) {
        ((C1376950lw5) aLAdapterS16S0200000_21.l0).LIZ.getOverlay().remove((Drawable) aLAdapterS16S0200000_21.l1);
        ((C1376950lw5) aLAdapterS16S0200000_21.l0).LIZ.setClipToOutline(false);
    }

    public ALAdapterS16S0200000_21(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
