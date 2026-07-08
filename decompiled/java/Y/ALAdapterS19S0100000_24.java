package Y;

import X.C1237320iIs;
import X.C1440005kM;
import X.C1588580rRQ;
import X.C1592940rYS;
import X.C1593700rZg;
import X.C1599810rjX;
import X.C1602160rnK;
import X.C1610740s1A;
import X.C1610760s1C;
import X.C1619010sEV;
import X.C1619070sEb;
import X.C1905750zgz;
import X.C21388418n4;
import X.C786410Ut5;
import X.EnumC1584360rKc;
import X.EnumC1905830zh7;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.series.payment.fragment.SeriesPurchaseSummaryFragment;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.feed.platform.panel.clean.FeedCleanComponent;
import com.tts.oecverify.BdTuring;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes25.dex */
public class ALAdapterS19S0100000_24 extends AnimatorListenerAdapter {
    public final int $t;
    public Object l0;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.$t) {
            case 4:
                onAnimationCancel$0(this, animator);
                break;
            case 5:
                onAnimationCancel$1(this, animator);
                break;
            default:
                super.onAnimationCancel(animator);
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
                onAnimationEnd$3(this, animator);
                break;
            case 4:
            case 5:
            case 8:
            case BdTuring.TYPE_ECAF /* 9 */:
            default:
                super.onAnimationEnd(animator);
                break;
            case 6:
                onAnimationEnd$4(this, animator);
                break;
            case 7:
                onAnimationEnd$5(this, animator);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onAnimationEnd$6(this, animator);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                onAnimationEnd$7(this, animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.$t) {
            case 8:
                onAnimationStart$0(this, animator);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onAnimationStart$1(this, animator);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public ALAdapterS19S0100000_24(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onAnimationCancel$0(ALAdapterS19S0100000_24 aLAdapterS19S0100000_24, Animator animator) {
        ValueAnimator valueAnimator = ((C1610760s1C) aLAdapterS19S0100000_24.l0).LJIIIZ;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = ((C1610760s1C) aLAdapterS19S0100000_24.l0).LJIIJ;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        C1610760s1C c1610760s1C = (C1610760s1C) aLAdapterS19S0100000_24.l0;
        c1610760s1C.LJII = false;
        c1610760s1C.LIZLLL = false;
    }

    public static final void onAnimationCancel$1(ALAdapterS19S0100000_24 aLAdapterS19S0100000_24, Animator animator) {
        ValueAnimator valueAnimator = ((C1610740s1A) aLAdapterS19S0100000_24.l0).LJIILL;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = ((C1610740s1A) aLAdapterS19S0100000_24.l0).LJIILLIIL;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        ValueAnimator valueAnimator3 = ((C1610740s1A) aLAdapterS19S0100000_24.l0).LJIIZILJ;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
        }
        C1610740s1A c1610740s1A = (C1610740s1A) aLAdapterS19S0100000_24.l0;
        c1610740s1A.LJI = false;
        c1610740s1A.LJII = false;
    }

    public static final void onAnimationEnd$0(ALAdapterS19S0100000_24 aLAdapterS19S0100000_24, Animator animator) {
        ((C1599810rjX) aLAdapterS19S0100000_24.l0).LIZIZ();
    }

    public static final void onAnimationEnd$1(ALAdapterS19S0100000_24 aLAdapterS19S0100000_24, Animator animator) {
        ((C1592940rYS) aLAdapterS19S0100000_24.l0).LIZ(1.0f);
    }

    public static final void onAnimationEnd$2(ALAdapterS19S0100000_24 aLAdapterS19S0100000_24, Animator animator) {
        super.onAnimationEnd(animator);
        View view = ((C1593700rZg) aLAdapterS19S0100000_24.l0).LJIIIZ;
        if (view != null) {
            C786410Ut5.Ob(view, 0.0f);
        }
        View view2 = ((C1593700rZg) aLAdapterS19S0100000_24.l0).LJIIIZ;
        if (view2 != null) {
            C786410Ut5.pc(view2, 0.0f);
        }
        View view3 = ((C1593700rZg) aLAdapterS19S0100000_24.l0).LJIIIIZZ;
        if (view3 != null) {
            C786410Ut5.LJLLLLLL(4, view3);
        }
        RemoteImageView remoteImageView = ((C1593700rZg) aLAdapterS19S0100000_24.l0).LIZLLL;
        if (remoteImageView != null) {
            C786410Ut5.l(remoteImageView, 0);
        }
        RemoteImageView remoteImageView2 = ((C1593700rZg) aLAdapterS19S0100000_24.l0).LIZLLL;
        if (remoteImageView2 != null) {
            C786410Ut5.kc(remoteImageView2, 1.2f);
        }
        RemoteImageView remoteImageView3 = ((C1593700rZg) aLAdapterS19S0100000_24.l0).LIZLLL;
        if (remoteImageView3 != null) {
            C786410Ut5.Fc(remoteImageView3, 1.2f);
        }
        C1593700rZg c1593700rZg = (C1593700rZg) aLAdapterS19S0100000_24.l0;
        RemoteImageView remoteImageView4 = c1593700rZg.LIZLLL;
        if (remoteImageView4 == null) {
            c1593700rZg.getClass();
            return;
        }
        c1593700rZg.LJI();
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(remoteImageView4, PropertyValuesHolder.ofFloat("scaleX", 1.2f, 1.0f), PropertyValuesHolder.ofFloat("scaleY", 1.2f, 1.0f));
        c1593700rZg.LJI = objectAnimatorOfPropertyValuesHolder;
        if (objectAnimatorOfPropertyValuesHolder != null) {
            objectAnimatorOfPropertyValuesHolder.setInterpolator(new C21388418n4());
        }
        ObjectAnimator objectAnimator = c1593700rZg.LJI;
        if (objectAnimator != null) {
            objectAnimator.setDuration(150L);
        }
        ObjectAnimator objectAnimator2 = c1593700rZg.LJI;
        if (objectAnimator2 == null) {
            return;
        }
        C786410Ut5.Pd(objectAnimator2);
    }

    public static final void onAnimationEnd$3(ALAdapterS19S0100000_24 aLAdapterS19S0100000_24, Animator animator) {
        FeedCleanComponent feedCleanComponent = (FeedCleanComponent) aLAdapterS19S0100000_24.l0;
        feedCleanComponent.LLJILJILJ = null;
        feedCleanComponent.LLJILLL = false;
    }

    public static final void onAnimationEnd$4(ALAdapterS19S0100000_24 aLAdapterS19S0100000_24, Animator animator) {
        super.onAnimationEnd(animator);
        ((Function0) aLAdapterS19S0100000_24.l0).invoke();
        C1588580rRQ.LIZ = null;
    }

    public static final void onAnimationEnd$5(ALAdapterS19S0100000_24 aLAdapterS19S0100000_24, Animator animator) {
        ViewGroup.LayoutParams layoutParams;
        C1237320iIs c1237320iIs = ((SeriesPurchaseSummaryFragment) aLAdapterS19S0100000_24.l0).LLJJJJ;
        if (c1237320iIs != null && (layoutParams = c1237320iIs.getLayoutParams()) != null) {
            layoutParams.height = 0;
        }
        C1237320iIs c1237320iIs2 = ((SeriesPurchaseSummaryFragment) aLAdapterS19S0100000_24.l0).LLJJJJ;
        if (c1237320iIs2 != null) {
            c1237320iIs2.requestLayout();
        }
        ((SeriesPurchaseSummaryFragment) aLAdapterS19S0100000_24.l0).WR();
        C1237320iIs c1237320iIs3 = ((SeriesPurchaseSummaryFragment) aLAdapterS19S0100000_24.l0).LLJJJJ;
        if (c1237320iIs3 != null) {
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1237320iIs3);
            c1237320iIs3.setAlpha(1.0f);
        }
        C1237320iIs c1237320iIs4 = ((SeriesPurchaseSummaryFragment) aLAdapterS19S0100000_24.l0).LLJJJJ;
        if (c1237320iIs4 != null) {
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1237320iIs4);
            c1237320iIs4.setTranslationY(0.0f);
        }
        C1237320iIs c1237320iIs5 = ((SeriesPurchaseSummaryFragment) aLAdapterS19S0100000_24.l0).LLJJJJ;
        if (c1237320iIs5 != null) {
            int visibility = c1237320iIs5.getVisibility();
            c1237320iIs5.setVisibility(8);
            C1602160rnK.LIZIZ(visibility, 8, c1237320iIs5);
        }
    }

    public static final void onAnimationEnd$6(ALAdapterS19S0100000_24 aLAdapterS19S0100000_24, Animator animator) {
        C1905750zgz.LIZIZ.LJII(EnumC1584360rKc.INBOX, EnumC1905830zh7.BEYOND_TIME_LIMIT);
        ((C1619010sEV) aLAdapterS19S0100000_24.l0).LJJIIJ();
        C1440005kM.LIZ(new C1619070sEb(1));
    }

    public static final void onAnimationEnd$7(ALAdapterS19S0100000_24 aLAdapterS19S0100000_24, Animator animator) {
        C1905750zgz.LIZIZ.LJII(EnumC1584360rKc.INBOX, EnumC1905830zh7.BEYOND_TIME_LIMIT);
        ((C1619010sEV) aLAdapterS19S0100000_24.l0).LJJIIJ();
        C1440005kM.LIZ(new C1619070sEb(1));
    }

    public static final void onAnimationStart$0(ALAdapterS19S0100000_24 aLAdapterS19S0100000_24, Animator animator) {
        ViewGroup viewGroup = ((C1619010sEV) aLAdapterS19S0100000_24.l0).LLJ;
        if (viewGroup == null) {
            viewGroup = null;
        }
        C786410Ut5.LJLZ(0, viewGroup);
        C1440005kM.LIZ(new C1619070sEb(0));
    }

    public static final void onAnimationStart$1(ALAdapterS19S0100000_24 aLAdapterS19S0100000_24, Animator animator) {
        ViewGroup viewGroup = ((C1619010sEV) aLAdapterS19S0100000_24.l0).LLJ;
        if (viewGroup == null) {
            viewGroup = null;
        }
        C786410Ut5.LJLZ(0, viewGroup);
        C1440005kM.LIZ(new C1619070sEb(0));
    }
}
