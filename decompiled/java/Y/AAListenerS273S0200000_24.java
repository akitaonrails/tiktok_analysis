package Y;

import X.C0GRT;
import X.C0GRU;
import X.C1591450rW3;
import X.C1591980rWu;
import X.C1592950rYT;
import X.C1593860rZw;
import X.C1602160rnK;
import X.C1606250rtv;
import X.C1608920ryE;
import X.C1609220ryi;
import X.C1617850sCd;
import X.C1619880sFu;
import X.C786410Ut5;
import android.animation.Animator;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import com.bytedance.tiktok.homepage.mainfragment.ability.IMFToolBarAbility;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.TabAnimationTransformerV2;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.top.ITabStrip;

/* JADX INFO: loaded from: classes25.dex */
public class AAListenerS273S0200000_24 implements Animator.AnimatorListener {
    public final int $t;
    public Object l0;
    public Object l1;

    public static final void onAnimationCancel$1(AAListenerS273S0200000_24 aAListenerS273S0200000_24, Animator animator) {
    }

    public static final void onAnimationCancel$2(AAListenerS273S0200000_24 aAListenerS273S0200000_24, Animator animator) {
    }

    public static final void onAnimationCancel$3(AAListenerS273S0200000_24 aAListenerS273S0200000_24, Animator animator) {
    }

    public static final void onAnimationCancel$6(AAListenerS273S0200000_24 aAListenerS273S0200000_24, Animator animator) {
    }

    public static final void onAnimationRepeat$0(AAListenerS273S0200000_24 aAListenerS273S0200000_24, Animator animator) {
    }

    public static final void onAnimationRepeat$1(AAListenerS273S0200000_24 aAListenerS273S0200000_24, Animator animator) {
    }

    public static final void onAnimationRepeat$2(AAListenerS273S0200000_24 aAListenerS273S0200000_24, Animator animator) {
    }

    public static final void onAnimationRepeat$3(AAListenerS273S0200000_24 aAListenerS273S0200000_24, Animator animator) {
    }

    public static final void onAnimationRepeat$6(AAListenerS273S0200000_24 aAListenerS273S0200000_24, Animator animator) {
    }

    public static final void onAnimationStart$1(AAListenerS273S0200000_24 aAListenerS273S0200000_24, Animator animator) {
    }

    public static final void onAnimationStart$2(AAListenerS273S0200000_24 aAListenerS273S0200000_24, Animator animator) {
    }

    public static final void onAnimationStart$3(AAListenerS273S0200000_24 aAListenerS273S0200000_24, Animator animator) {
    }

    public static final void onAnimationStart$6(AAListenerS273S0200000_24 aAListenerS273S0200000_24, Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationCancel$0(this, animator);
                break;
            case 1:
                onAnimationCancel$1(this, animator);
                break;
            case 2:
                onAnimationCancel$2(this, animator);
                break;
            case 3:
                onAnimationCancel$3(this, animator);
                break;
            case 4:
                onAnimationCancel$4(this, animator);
                break;
            case 5:
                onAnimationCancel$5(this, animator);
                break;
            case 6:
                onAnimationCancel$6(this, animator);
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
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
            case 4:
                onAnimationEnd$4(this, animator);
                break;
            case 5:
                onAnimationEnd$5(this, animator);
                break;
            case 6:
                onAnimationEnd$6(this, animator);
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationRepeat$0(this, animator);
                break;
            case 1:
                onAnimationRepeat$1(this, animator);
                break;
            case 2:
                onAnimationRepeat$2(this, animator);
                break;
            case 3:
                onAnimationRepeat$3(this, animator);
                break;
            case 4:
                onAnimationRepeat$4(this, animator);
                break;
            case 5:
                onAnimationRepeat$5(this, animator);
                break;
            case 6:
                onAnimationRepeat$6(this, animator);
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationStart$0(this, animator);
                break;
            case 1:
                onAnimationStart$1(this, animator);
                break;
            case 2:
                onAnimationStart$2(this, animator);
                break;
            case 3:
                onAnimationStart$3(this, animator);
                break;
            case 4:
                onAnimationStart$4(this, animator);
                break;
            case 5:
                onAnimationStart$5(this, animator);
                break;
            case 6:
                onAnimationStart$6(this, animator);
                break;
        }
    }

    public static final void onAnimationCancel$0(AAListenerS273S0200000_24 aAListenerS273S0200000_24, Animator animator) {
        C1592950rYT c1592950rYT = (C1592950rYT) aAListenerS273S0200000_24.l1;
        c1592950rYT.LLJJJJJIL = false;
        c1592950rYT.LJI();
    }

    public static final void onAnimationCancel$4(AAListenerS273S0200000_24 aAListenerS273S0200000_24, Animator animator) {
        Animator.AnimatorListener animatorListener = (Animator.AnimatorListener) aAListenerS273S0200000_24.l0;
        if (animatorListener != null) {
            animatorListener.onAnimationCancel(animator);
        }
    }

    public static final void onAnimationCancel$5(AAListenerS273S0200000_24 aAListenerS273S0200000_24, Animator animator) {
        Animator.AnimatorListener animatorListener = (Animator.AnimatorListener) aAListenerS273S0200000_24.l0;
        if (animatorListener != null) {
            animatorListener.onAnimationCancel(animator);
        }
    }

    public static final void onAnimationEnd$0(AAListenerS273S0200000_24 aAListenerS273S0200000_24, Animator animator) {
        ImageView tabIcon = ((C1592950rYT) aAListenerS273S0200000_24.l1).getTabIcon();
        if (tabIcon != null) {
            C786410Ut5.LJZI(8, tabIcon);
            C1592950rYT c1592950rYT = (C1592950rYT) aAListenerS273S0200000_24.l1;
            c1592950rYT.LLJJJJJIL = false;
            c1592950rYT.LJI();
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public static final void onAnimationEnd$1(AAListenerS273S0200000_24 aAListenerS273S0200000_24, Animator animator) {
        ViewPropertyAnimator viewPropertyAnimatorAnimate;
        ViewPropertyAnimator viewPropertyAnimatorAnimate2;
        C786410Ut5.LJLLLLLL(8, (View) aAListenerS273S0200000_24.l0);
        C0GRT c0grt = ((C1619880sFu) aAListenerS273S0200000_24.l1).LJFF;
        if (c0grt != null && (viewPropertyAnimatorAnimate2 = c0grt.animate()) != null) {
            viewPropertyAnimatorAnimate2.cancel();
        }
        C0GRU c0gru = ((C1619880sFu) aAListenerS273S0200000_24.l1).LJ;
        if (c0gru != null && (viewPropertyAnimatorAnimate = c0gru.animate()) != null) {
            viewPropertyAnimatorAnimate.cancel();
        }
        C0GRT c0grt2 = ((C1619880sFu) aAListenerS273S0200000_24.l1).LJFF;
        if (c0grt2 != null) {
            int visibility = c0grt2.getVisibility();
            c0grt2.setVisibility(8);
            C1602160rnK.LIZIZ(visibility, 8, c0grt2);
        }
        C0GRU c0gru2 = ((C1619880sFu) aAListenerS273S0200000_24.l1).LJ;
        if (c0gru2 != null) {
            int visibility2 = c0gru2.getVisibility();
            c0gru2.setVisibility(8);
            C1602160rnK.LIZIZ(visibility2, 8, c0gru2);
        }
        ((C1619880sFu) aAListenerS273S0200000_24.l1).LJFF();
    }

    public static final void onAnimationEnd$2(AAListenerS273S0200000_24 aAListenerS273S0200000_24, Animator animator) {
        C1591450rW3 c1591450rW3PO0;
        TuxIconView tuxIconView;
        TabAnimationTransformerV2 tabAnimationTransformerV2 = (TabAnimationTransformerV2) aAListenerS273S0200000_24.l0;
        tabAnimationTransformerV2.LLJJI = null;
        IMFToolBarAbility iMFToolBarAbilityLJII = tabAnimationTransformerV2.LJII();
        if (iMFToolBarAbilityLJII != null) {
            iMFToolBarAbilityLJII.B5(null);
        }
        ITabStrip iTabStrip = (ITabStrip) ((TabAnimationTransformerV2) aAListenerS273S0200000_24.l0).LLJILLL.getValue();
        if (iTabStrip != null && (c1591450rW3PO0 = iTabStrip.PO0()) != null && (tuxIconView = c1591450rW3PO0.LJIIIIZZ) != null) {
            C1593860rZw.LIZ(tuxIconView, null, false);
        }
        ((TabAnimationTransformerV2) aAListenerS273S0200000_24.l0).LJIIZILJ((C1591980rWu) aAListenerS273S0200000_24.l1, false);
    }

    public static final void onAnimationEnd$3(AAListenerS273S0200000_24 aAListenerS273S0200000_24, Animator animator) {
        C1591450rW3 c1591450rW3PO0;
        TuxIconView tuxIconView;
        TabAnimationTransformerV2 tabAnimationTransformerV2 = (TabAnimationTransformerV2) aAListenerS273S0200000_24.l0;
        tabAnimationTransformerV2.LLJJI = null;
        IMFToolBarAbility iMFToolBarAbilityLJII = tabAnimationTransformerV2.LJII();
        if (iMFToolBarAbilityLJII != null) {
            iMFToolBarAbilityLJII.B5(null);
        }
        ITabStrip iTabStrip = (ITabStrip) ((TabAnimationTransformerV2) aAListenerS273S0200000_24.l0).LLJILLL.getValue();
        if (iTabStrip != null && (c1591450rW3PO0 = iTabStrip.PO0()) != null && (tuxIconView = c1591450rW3PO0.LJIIIIZZ) != null) {
            C1593860rZw.LIZ(tuxIconView, null, false);
        }
        ((TabAnimationTransformerV2) aAListenerS273S0200000_24.l0).LJIIZILJ((C1591980rWu) aAListenerS273S0200000_24.l1, false);
    }

    public static final void onAnimationEnd$4(AAListenerS273S0200000_24 aAListenerS273S0200000_24, Animator animator) {
        Animator.AnimatorListener animatorListener = (Animator.AnimatorListener) aAListenerS273S0200000_24.l0;
        if (animatorListener != null) {
            animatorListener.onAnimationEnd(animator);
        }
        C1609220ryi c1609220ryiLJIIIIZZ = ((C1608920ryE) aAListenerS273S0200000_24.l1).LJIIIIZZ();
        if (c1609220ryiLJIIIIZZ != null) {
            c1609220ryiLJIIIIZZ.setImageDrawable(null);
        }
        if (!((C1608920ryE) aAListenerS273S0200000_24.l1).LJIIJ()) {
            C1608920ryE c1608920ryE = (C1608920ryE) aAListenerS273S0200000_24.l1;
            if (c1608920ryE.LJIIIZ) {
                c1608920ryE.LJIIIZ = false;
                C1606250rtv.LIZ(c1608920ryE.LIZJ);
            }
        }
        ((C1608920ryE) aAListenerS273S0200000_24.l1).LJIIIZ(true);
    }

    public static final void onAnimationEnd$5(AAListenerS273S0200000_24 aAListenerS273S0200000_24, Animator animator) {
        Animator.AnimatorListener animatorListener = (Animator.AnimatorListener) aAListenerS273S0200000_24.l0;
        if (animatorListener != null) {
            animatorListener.onAnimationEnd(animator);
        }
        C1609220ryi c1609220ryiLJIIIIZZ = ((C1608920ryE) aAListenerS273S0200000_24.l1).LJIIIIZZ();
        if (c1609220ryiLJIIIIZZ != null) {
            c1609220ryiLJIIIIZZ.setImageDrawable(null);
        }
        C1608920ryE c1608920ryE = (C1608920ryE) aAListenerS273S0200000_24.l1;
        if (c1608920ryE.LJIIIZ) {
            c1608920ryE.LJIIIZ = false;
            C1606250rtv.LIZ(c1608920ryE.LIZJ);
        }
        ((C1608920ryE) aAListenerS273S0200000_24.l1).LJIIIZ(true);
        ((C1608920ryE) aAListenerS273S0200000_24.l1).LJIIJ = null;
    }

    public static final void onAnimationEnd$6(AAListenerS273S0200000_24 aAListenerS273S0200000_24, Animator animator) {
        Bitmap bitmap = (Bitmap) aAListenerS273S0200000_24.l0;
        if (bitmap != null) {
            ((C1617850sCd) aAListenerS273S0200000_24.l1).LJIIJ = bitmap;
        }
    }

    public static final void onAnimationRepeat$4(AAListenerS273S0200000_24 aAListenerS273S0200000_24, Animator animator) {
        Animator.AnimatorListener animatorListener = (Animator.AnimatorListener) aAListenerS273S0200000_24.l0;
        if (animatorListener != null) {
            animatorListener.onAnimationRepeat(animator);
        }
    }

    public static final void onAnimationRepeat$5(AAListenerS273S0200000_24 aAListenerS273S0200000_24, Animator animator) {
        Animator.AnimatorListener animatorListener = (Animator.AnimatorListener) aAListenerS273S0200000_24.l0;
        if (animatorListener != null) {
            animatorListener.onAnimationRepeat(animator);
        }
    }

    public static final void onAnimationStart$0(AAListenerS273S0200000_24 aAListenerS273S0200000_24, Animator animator) {
        C786410Ut5.LJLLLLLL(0, (View) aAListenerS273S0200000_24.l0);
    }

    public static final void onAnimationStart$4(AAListenerS273S0200000_24 aAListenerS273S0200000_24, Animator animator) {
        Animator.AnimatorListener animatorListener = (Animator.AnimatorListener) aAListenerS273S0200000_24.l0;
        if (animatorListener != null) {
            animatorListener.onAnimationStart(animator);
        }
        if (!((C1608920ryE) aAListenerS273S0200000_24.l1).LJIIJ()) {
            C1608920ryE c1608920ryE = (C1608920ryE) aAListenerS273S0200000_24.l1;
            c1608920ryE.LJIIIZ = true;
            C1606250rtv.LIZIZ(c1608920ryE.LIZJ);
        }
        ((C1608920ryE) aAListenerS273S0200000_24.l1).LJIIIZ(false);
    }

    public static final void onAnimationStart$5(AAListenerS273S0200000_24 aAListenerS273S0200000_24, Animator animator) {
        Animator.AnimatorListener animatorListener = (Animator.AnimatorListener) aAListenerS273S0200000_24.l0;
        if (animatorListener != null) {
            animatorListener.onAnimationStart(animator);
        }
        C1608920ryE c1608920ryE = (C1608920ryE) aAListenerS273S0200000_24.l1;
        c1608920ryE.LJIIIZ = true;
        C1606250rtv.LIZIZ(c1608920ryE.LIZJ);
        ((C1608920ryE) aAListenerS273S0200000_24.l1).LJIIIZ(false);
    }

    public AAListenerS273S0200000_24(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
