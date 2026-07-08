package Y;

import X.C09JN;
import X.C1237320iIs;
import X.C1602160rnK;
import X.C1610420s0e;
import X.C1610740s1A;
import X.C1610750s1B;
import X.C1610760s1C;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.series.payment.fragment.SeriesPurchaseSummaryFragment;

/* JADX INFO: loaded from: classes25.dex */
public class ALAdapterS3S0101000_24 extends AnimatorListenerAdapter {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (2 - this.$t != 0) {
            super.onAnimationEnd(animator);
        } else {
            onAnimationEnd$0(this, animator);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationRepeat$0(this, animator);
                break;
            case 1:
                onAnimationRepeat$1(this, animator);
                break;
            default:
                super.onAnimationRepeat(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        if (2 - this.$t != 0) {
            super.onAnimationStart(animator);
        } else {
            onAnimationStart$0(this, animator);
        }
    }

    public ALAdapterS3S0101000_24(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onAnimationEnd$0(ALAdapterS3S0101000_24 aLAdapterS3S0101000_24, Animator animator) {
        ViewGroup.LayoutParams layoutParams;
        C1237320iIs c1237320iIs = ((SeriesPurchaseSummaryFragment) aLAdapterS3S0101000_24.l0).LLJJJJ;
        if (c1237320iIs != null && (layoutParams = c1237320iIs.getLayoutParams()) != null) {
            layoutParams.height = aLAdapterS3S0101000_24.i1;
        }
        C1237320iIs c1237320iIs2 = ((SeriesPurchaseSummaryFragment) aLAdapterS3S0101000_24.l0).LLJJJJ;
        if (c1237320iIs2 != null) {
            c1237320iIs2.requestLayout();
        }
        ((SeriesPurchaseSummaryFragment) aLAdapterS3S0101000_24.l0).WR();
        C1237320iIs c1237320iIs3 = ((SeriesPurchaseSummaryFragment) aLAdapterS3S0101000_24.l0).LLJJJJ;
        if (c1237320iIs3 != null) {
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1237320iIs3);
            c1237320iIs3.setAlpha(1.0f);
        }
        C1237320iIs c1237320iIs4 = ((SeriesPurchaseSummaryFragment) aLAdapterS3S0101000_24.l0).LLJJJJ;
        if (c1237320iIs4 != null) {
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1237320iIs4);
            c1237320iIs4.setTranslationY(0.0f);
        }
        C1237320iIs c1237320iIs5 = ((SeriesPurchaseSummaryFragment) aLAdapterS3S0101000_24.l0).LLJJJJ;
        if (c1237320iIs5 != null) {
            int visibility = c1237320iIs5.getVisibility();
            c1237320iIs5.setVisibility(0);
            C1602160rnK.LIZIZ(visibility, 0, c1237320iIs5);
        }
    }

    public static final void onAnimationRepeat$0(ALAdapterS3S0101000_24 aLAdapterS3S0101000_24, Animator animator) {
        int i = aLAdapterS3S0101000_24.i1 + 1;
        aLAdapterS3S0101000_24.i1 = i;
        if (i >= 10) {
            aLAdapterS3S0101000_24.i1 = 0;
            C1610760s1C c1610760s1C = (C1610760s1C) aLAdapterS3S0101000_24.l0;
            for (C1610750s1B c1610750s1B : c1610760s1C.LIZ) {
                String str = c1610760s1C.LJI;
                C09JN<C1610420s0e> c09jn = c1610750s1B.LJIIIZ;
                if (c09jn != null) {
                    c1610750s1B.LJIIJJI(c1610750s1B.LJIIIIZZ, c09jn, str);
                }
            }
        }
    }

    public static final void onAnimationRepeat$1(ALAdapterS3S0101000_24 aLAdapterS3S0101000_24, Animator animator) {
        int i = aLAdapterS3S0101000_24.i1 + 1;
        aLAdapterS3S0101000_24.i1 = i;
        if (i >= 10) {
            aLAdapterS3S0101000_24.i1 = 0;
            C1610740s1A c1610740s1A = (C1610740s1A) aLAdapterS3S0101000_24.l0;
            C09JN<C1610420s0e> c09jn = c1610740s1A.LJIILIIL;
            if (c09jn != null) {
                c1610740s1A.LJIIL(c1610740s1A.LJIIL, c09jn, "tiktok_video_head");
            }
        }
    }

    public static final void onAnimationStart$0(ALAdapterS3S0101000_24 aLAdapterS3S0101000_24, Animator animator) {
        C1237320iIs c1237320iIs = ((SeriesPurchaseSummaryFragment) aLAdapterS3S0101000_24.l0).LLJJJJ;
        if (c1237320iIs != null) {
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1237320iIs);
            c1237320iIs.setAlpha(0.0f);
        }
        C1237320iIs c1237320iIs2 = ((SeriesPurchaseSummaryFragment) aLAdapterS3S0101000_24.l0).LLJJJJ;
        if (c1237320iIs2 != null) {
            int visibility = c1237320iIs2.getVisibility();
            c1237320iIs2.setVisibility(0);
            C1602160rnK.LIZIZ(visibility, 0, c1237320iIs2);
        }
    }

    public ALAdapterS3S0101000_24(SeriesPurchaseSummaryFragment seriesPurchaseSummaryFragment, int i, int i2) {
        this.$t = i2;
        this.l0 = seriesPurchaseSummaryFragment;
        this.i1 = i;
    }
}
