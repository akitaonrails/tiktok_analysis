package Y;

import X.AbstractC1014240cV4;
import X.AbstractC997340c3o;
import X.C1014260cV6;
import X.C1014370cVH;
import X.C1014730cVr;
import X.C1066550drR;
import X.C1602160rnK;
import X.C19322810ig;
import X.C1A9W;
import X.C1AV2;
import X.C2180521AVm;
import X.C418440Gaw;
import X.C426750GoL;
import X.C786410Ut5;
import X.C814420VxA;
import X.C990390bsb;
import X.C990470bsj;
import X.C997370c3r;
import X.C998110c53;
import X.InterfaceC1014340cVE;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentLayoutModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel;
import com.ss.android.ugc.aweme.feed.assem.music.VideoMusicCoverAssem;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes17.dex */
public class ALAdapterS11S0200000_16 extends AnimatorListenerAdapter {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.$t) {
            case 7:
                onAnimationCancel$0(this, animator);
                break;
            case 8:
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
            case 4:
            case 5:
            case BdTuring.TYPE_ECAF /* 9 */:
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
            default:
                super.onAnimationEnd(animator);
                break;
            case 6:
                onAnimationEnd$3(this, animator);
                break;
            case 7:
                onAnimationEnd$4(this, animator);
                break;
            case 8:
                onAnimationEnd$5(this, animator);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                onAnimationEnd$6(this, animator);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                onAnimationEnd$7(this, animator);
                break;
            case 14:
                onAnimationEnd$8(this, animator);
                break;
            case 15:
                onAnimationEnd$9(this, animator);
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        if (5 - this.$t != 0) {
            super.onAnimationEnd(animator, z);
        } else {
            onAnimationEnd$0(this, animator, z);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.$t) {
            case 2:
                super.onAnimationStart(animator);
                break;
            case 3:
                onAnimationStart$1(this, animator);
                break;
            case 4:
                onAnimationStart$2(this, animator);
                break;
            case 5:
                onAnimationStart$3(this, animator);
                break;
            case 6:
            case 7:
            case 8:
            case BdTuring.TYPE_EMAIL /* 11 */:
            default:
                super.onAnimationStart(animator);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onAnimationStart$4(this, animator);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onAnimationStart$5(this, animator);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                onAnimationStart$6(this, animator);
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z) {
        switch (this.$t) {
            case 7:
                onAnimationStart$0(this, animator, z);
                break;
            case 8:
                onAnimationStart$1(this, animator, z);
                break;
            default:
                super.onAnimationStart(animator, z);
                break;
        }
    }

    public static final void onAnimationCancel$0(ALAdapterS11S0200000_16 aLAdapterS11S0200000_16, Animator animator) {
        ((C1066550drR) aLAdapterS11S0200000_16.l0).LLJI = null;
    }

    public static final void onAnimationCancel$1(ALAdapterS11S0200000_16 aLAdapterS11S0200000_16, Animator animator) {
        ((C1066550drR) aLAdapterS11S0200000_16.l0).LLJI = null;
    }

    public static final void onAnimationEnd$0(ALAdapterS11S0200000_16 aLAdapterS11S0200000_16, Animator animator) {
        C2180521AVm.LIZLLL((View) aLAdapterS11S0200000_16.l0, 8, (C1AV2) aLAdapterS11S0200000_16.l1);
    }

    public static final void onAnimationEnd$1(ALAdapterS11S0200000_16 aLAdapterS11S0200000_16, Animator animator) {
        C19322810ig c19322810ig = (C19322810ig) aLAdapterS11S0200000_16.l0;
        int visibility = c19322810ig.getVisibility();
        c19322810ig.setVisibility(8);
        C1602160rnK.LIZIZ(visibility, 8, c19322810ig);
        Function0 function0 = (Function0) aLAdapterS11S0200000_16.l1;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void onAnimationEnd$2(ALAdapterS11S0200000_16 aLAdapterS11S0200000_16, Animator animator) {
        super.onAnimationEnd(animator);
        FrameLayout frameLayout = ((VideoMusicCoverAssem) aLAdapterS11S0200000_16.l0).LLLIIIL;
        if (frameLayout != null) {
            C1A9W c1a9w = (C1A9W) aLAdapterS11S0200000_16.l1;
            C426750GoL.LJIIL(frameLayout, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c1a9w.LIZIZ)))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c1a9w.LIZ)))), null, 26);
            if (c1a9w.LJFF == 0) {
                C426750GoL.LJIIIZ(frameLayout, null, null, 0, null, false, 27);
            }
        }
    }

    public static final void onAnimationEnd$3(ALAdapterS11S0200000_16 aLAdapterS11S0200000_16, Animator animator) {
        C1014730cVr c1014730cVr;
        AnoleComponentModel anoleComponentModel;
        AnoleComponentLayoutModel anoleComponentLayoutModel;
        if (((View) aLAdapterS11S0200000_16.l0).getHeight() > 0 && (anoleComponentLayoutModel = (anoleComponentModel = (c1014730cVr = (C1014730cVr) aLAdapterS11S0200000_16.l1).LL).layout) != null) {
            View view = (View) aLAdapterS11S0200000_16.l0;
            InterfaceC1014340cVE interfaceC1014340cVE = c1014730cVr.LLJJJJ;
            if (interfaceC1014340cVE != null) {
                interfaceC1014340cVE.LJ(anoleComponentModel.type, view, anoleComponentLayoutModel);
            }
        }
    }

    public static final void onAnimationEnd$4(ALAdapterS11S0200000_16 aLAdapterS11S0200000_16, Animator animator) {
        ((C1066550drR) aLAdapterS11S0200000_16.l0).LLJI = null;
    }

    public static final void onAnimationEnd$5(ALAdapterS11S0200000_16 aLAdapterS11S0200000_16, Animator animator) {
        ((C1066550drR) aLAdapterS11S0200000_16.l0).LLJI = null;
    }

    public static final void onAnimationEnd$6(ALAdapterS11S0200000_16 aLAdapterS11S0200000_16, Animator animator) {
        AbstractC997340c3o abstractC997340c3o = (AbstractC997340c3o) aLAdapterS11S0200000_16.l0;
        abstractC997340c3o.getClass();
        C997370c3r.LIZJ(abstractC997340c3o, 8);
        abstractC997340c3o.LJFF("change_stage_event", new Pair<>("stageName", "reset"));
        AbstractC997340c3o abstractC997340c3o2 = (AbstractC997340c3o) aLAdapterS11S0200000_16.l1;
        abstractC997340c3o2.getClass();
        C997370c3r.LIZJ(abstractC997340c3o2, 8);
        abstractC997340c3o2.LJFF("change_stage_event", new Pair<>("stageName", "reset"));
    }

    public static final void onAnimationEnd$7(ALAdapterS11S0200000_16 aLAdapterS11S0200000_16, Animator animator) {
        AbstractC997340c3o abstractC997340c3o = (AbstractC997340c3o) aLAdapterS11S0200000_16.l0;
        abstractC997340c3o.getClass();
        C997370c3r.LIZJ(abstractC997340c3o, 8);
        AbstractC997340c3o abstractC997340c3o2 = (AbstractC997340c3o) aLAdapterS11S0200000_16.l0;
        int i = ((C998110c53) aLAdapterS11S0200000_16.l1).LJII;
        abstractC997340c3o2.getClass();
        C997370c3r.LIZIZ(abstractC997340c3o2, i);
    }

    public static final void onAnimationEnd$8(ALAdapterS11S0200000_16 aLAdapterS11S0200000_16, Animator animator) {
        AbstractC997340c3o abstractC997340c3o = (AbstractC997340c3o) aLAdapterS11S0200000_16.l0;
        abstractC997340c3o.getClass();
        C997370c3r.LIZJ(abstractC997340c3o, 8);
        AbstractC997340c3o abstractC997340c3o2 = (AbstractC997340c3o) aLAdapterS11S0200000_16.l1;
        abstractC997340c3o2.getClass();
        C997370c3r.LIZJ(abstractC997340c3o2, 8);
        ((AbstractC997340c3o) aLAdapterS11S0200000_16.l0).LJFF("change_stage_event", new Pair<>("stageName", "reset"));
        ((AbstractC997340c3o) aLAdapterS11S0200000_16.l1).LJFF("change_stage_event", new Pair<>("stageName", "reset"));
    }

    public static final void onAnimationEnd$9(ALAdapterS11S0200000_16 aLAdapterS11S0200000_16, Animator animator) {
        AbstractC1014240cV4 abstractC1014240cV4;
        AnoleComponentModel anoleComponentModel;
        AnoleComponentLayoutModel anoleComponentLayoutModel;
        if (((View) aLAdapterS11S0200000_16.l0).getHeight() > 0 && (anoleComponentLayoutModel = (anoleComponentModel = (abstractC1014240cV4 = (AbstractC1014240cV4) aLAdapterS11S0200000_16.l1).LL).layout) != null) {
            View view = (View) aLAdapterS11S0200000_16.l0;
            InterfaceC1014340cVE interfaceC1014340cVE = abstractC1014240cV4.LLJJJJ;
            if (interfaceC1014340cVE != null) {
                interfaceC1014340cVE.LJ(anoleComponentModel.type, view, anoleComponentLayoutModel);
            }
        }
        AbstractC1014240cV4 abstractC1014240cV42 = (AbstractC1014240cV4) aLAdapterS11S0200000_16.l1;
        abstractC1014240cV42.LLJJJIL = null;
        C1014370cVH c1014370cVH = abstractC1014240cV42.LLJJJJJIL;
        if (c1014370cVH != null) {
            C1014260cV6.LJFF((AbstractC1014240cV4) aLAdapterS11S0200000_16.l1, c1014370cVH.LIZ, c1014370cVH.LIZIZ, c1014370cVH.LIZJ, c1014370cVH.LIZLLL, true);
        }
        ((AbstractC1014240cV4) aLAdapterS11S0200000_16.l1).LJIJ((View) aLAdapterS11S0200000_16.l0);
    }

    public static final void onAnimationStart$1(ALAdapterS11S0200000_16 aLAdapterS11S0200000_16, Animator animator) {
        View underView = ((C990390bsb) aLAdapterS11S0200000_16.l0).getUnderView();
        if (underView != null) {
            C990390bsb c990390bsb = (C990390bsb) aLAdapterS11S0200000_16.l0;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) aLAdapterS11S0200000_16.l1;
            ViewGroup.LayoutParams layoutParams = underView.getLayoutParams();
            layoutParams.height = underView.getMeasuredHeight() + c990390bsb.getHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
            C786410Ut5.W5(underView, layoutParams);
        }
    }

    public static final void onAnimationStart$2(ALAdapterS11S0200000_16 aLAdapterS11S0200000_16, Animator animator) {
        View underView = ((C990470bsj) aLAdapterS11S0200000_16.l0).getUnderView();
        if (underView != null) {
            C990470bsj c990470bsj = (C990470bsj) aLAdapterS11S0200000_16.l0;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) aLAdapterS11S0200000_16.l1;
            ViewGroup.LayoutParams layoutParams = underView.getLayoutParams();
            layoutParams.height = underView.getMeasuredHeight() + c990470bsj.getHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
            C786410Ut5.W5(underView, layoutParams);
        }
    }

    public static final void onAnimationStart$3(ALAdapterS11S0200000_16 aLAdapterS11S0200000_16, Animator animator) {
        super.onAnimationStart(animator);
        C786410Ut5.LJLLLLLL(0, (View) aLAdapterS11S0200000_16.l0);
    }

    public static final void onAnimationStart$4(ALAdapterS11S0200000_16 aLAdapterS11S0200000_16, Animator animator) {
        AbstractC997340c3o abstractC997340c3o = (AbstractC997340c3o) aLAdapterS11S0200000_16.l0;
        int i = ((C998110c53) aLAdapterS11S0200000_16.l1).LJII;
        abstractC997340c3o.getClass();
        C997370c3r.LIZIZ(abstractC997340c3o, i);
        AbstractC997340c3o abstractC997340c3o2 = (AbstractC997340c3o) aLAdapterS11S0200000_16.l0;
        int i2 = -((C998110c53) aLAdapterS11S0200000_16.l1).LJII;
        abstractC997340c3o2.getClass();
        C997370c3r.LIZ(abstractC997340c3o2, i2);
        AbstractC997340c3o abstractC997340c3o3 = (AbstractC997340c3o) aLAdapterS11S0200000_16.l0;
        abstractC997340c3o3.getClass();
        C997370c3r.LIZJ(abstractC997340c3o3, 0);
    }

    public static final void onAnimationStart$5(ALAdapterS11S0200000_16 aLAdapterS11S0200000_16, Animator animator) {
        AbstractC997340c3o abstractC997340c3o = (AbstractC997340c3o) aLAdapterS11S0200000_16.l0;
        int i = -((C998110c53) aLAdapterS11S0200000_16.l1).LJIIIIZZ;
        abstractC997340c3o.getClass();
        C997370c3r.LIZ(abstractC997340c3o, i);
        AbstractC997340c3o abstractC997340c3o2 = (AbstractC997340c3o) aLAdapterS11S0200000_16.l0;
        abstractC997340c3o2.getClass();
        C997370c3r.LIZJ(abstractC997340c3o2, 0);
    }

    public static final void onAnimationStart$6(ALAdapterS11S0200000_16 aLAdapterS11S0200000_16, Animator animator) {
        AbstractC997340c3o abstractC997340c3o = (AbstractC997340c3o) aLAdapterS11S0200000_16.l0;
        int i = ((C998110c53) aLAdapterS11S0200000_16.l1).LJII;
        abstractC997340c3o.getClass();
        C997370c3r.LIZIZ(abstractC997340c3o, i);
        AbstractC997340c3o abstractC997340c3o2 = ((C998110c53) aLAdapterS11S0200000_16.l1).LIZJ;
        if (abstractC997340c3o2 != null) {
            abstractC997340c3o2.LJFF("change_stage_event", new Pair<>("stageName", "showAppInfo"));
        }
        ((AbstractC997340c3o) aLAdapterS11S0200000_16.l0).LJFF("change_stage_event", new Pair<>("stageName", "showAppInfo"));
    }

    public ALAdapterS11S0200000_16(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public static final void onAnimationEnd$0(ALAdapterS11S0200000_16 aLAdapterS11S0200000_16, Animator animator, boolean z) {
        Function0 function0 = (Function0) aLAdapterS11S0200000_16.l1;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void onAnimationStart$0(ALAdapterS11S0200000_16 aLAdapterS11S0200000_16, Animator animator, boolean z) {
        Animator animator2 = ((C1066550drR) aLAdapterS11S0200000_16.l0).LLJI;
        if (animator2 != null) {
            animator2.cancel();
        }
        ((C1066550drR) aLAdapterS11S0200000_16.l0).LLJI = (ObjectAnimator) aLAdapterS11S0200000_16.l1;
    }

    public static final void onAnimationStart$1(ALAdapterS11S0200000_16 aLAdapterS11S0200000_16, Animator animator, boolean z) {
        Animator animator2 = ((C1066550drR) aLAdapterS11S0200000_16.l0).LLJI;
        if (animator2 != null) {
            animator2.cancel();
        }
        ((C1066550drR) aLAdapterS11S0200000_16.l0).LLJI = (ObjectAnimator) aLAdapterS11S0200000_16.l1;
    }
}
