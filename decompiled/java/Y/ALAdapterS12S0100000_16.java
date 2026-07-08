package Y;

import X.AbstractC1014240cV4;
import X.AbstractC997340c3o;
import X.C1002270cBl;
import X.C1037280d6E;
import X.C1058500deS;
import X.C1143680frq;
import X.C11S5;
import X.C1295960jpS;
import X.C1308910kAL;
import X.C1602160rnK;
import X.C214775193l;
import X.C21629019km;
import X.C418440Gaw;
import X.C786410Ut5;
import X.C814420VxA;
import X.C991760buo;
import X.C994580bzM;
import X.C994700bzY;
import X.C997370c3r;
import X.C998060c4y;
import X.C998110c53;
import X.C998340c5Q;
import X.EnumC994530bzH;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.livesdk.like.widget.LikeUserInfoAnimOptimizedWidget;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.ugc.aweme.captionsheet.BaseCaptionSheetFragment;
import com.ss.android.ugc.aweme.feed.adapter.viewholdervm.FeedLiveViewHolderVM;
import com.ss.android.ugc.aweme.feed.adapter.widget.InteractionAnimationWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.ad.AdCardWidget;
import com.ss.android.ugc.aweme.relation.ffp.ui.AnimationAuthFragment;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS607S0100000_28;

/* JADX INFO: loaded from: classes17.dex */
public class ALAdapterS12S0100000_16 extends AnimatorListenerAdapter {
    public final int $t;
    public Object l0;

    public static final void onAnimationStart$4(ALAdapterS12S0100000_16 aLAdapterS12S0100000_16, Animator animator) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        if (20 - this.$t != 0) {
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
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
            default:
                super.onAnimationEnd(animator);
                break;
            case 3:
                onAnimationEnd$2(this, animator);
                break;
            case 4:
                onAnimationEnd$3(this, animator);
                break;
            case 5:
                onAnimationEnd$4(this, animator);
                break;
            case 6:
                onAnimationEnd$5(this, animator);
                break;
            case 7:
                onAnimationEnd$6(this, animator);
                break;
            case 8:
                onAnimationEnd$7(this, animator);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onAnimationEnd$8(this, animator);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                onAnimationEnd$9(this, animator);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                onAnimationEnd$10(this, animator);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                onAnimationEnd$11(this, animator);
                break;
            case 14:
                onAnimationEnd$12(this, animator);
                break;
            case 15:
                onAnimationEnd$13(this, animator);
                break;
            case 16:
                onAnimationEnd$14(this, animator);
                break;
            case 19:
                onAnimationEnd$15(this, animator);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                onAnimationEnd$16(this, animator);
                break;
            case 21:
                onAnimationEnd$17(this, animator);
                break;
            case 22:
                onAnimationEnd$18(this, animator);
                break;
            case 23:
                onAnimationEnd$19(this, animator);
                break;
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                onAnimationEnd$20(this, animator);
                break;
            case 25:
                onAnimationEnd$21(this, animator);
                break;
            case 26:
                onAnimationEnd$22(this, animator);
                break;
            case 27:
                onAnimationEnd$23(this, animator);
                break;
            case 28:
                onAnimationEnd$24(this, animator);
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        if (18 - this.$t != 0) {
            super.onAnimationEnd(animator, z);
        } else {
            onAnimationEnd$0(this, animator, z);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        if (20 - this.$t != 0) {
            super.onAnimationRepeat(animator);
        } else {
            super.onAnimationRepeat(animator);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.$t) {
            case 2:
                onAnimationStart$0(this, animator);
                break;
            case 8:
                onAnimationStart$1(this, animator);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onAnimationStart$2(this, animator);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                onAnimationStart$3(this, animator);
                break;
            case 14:
                onAnimationStart$4(this, animator);
                break;
            case 16:
                onAnimationStart$5(this, animator);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                onAnimationStart$6(this, animator);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                onAnimationStart$7(this, animator);
                break;
            case 21:
                onAnimationStart$8(this, animator);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public ALAdapterS12S0100000_16(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onAnimationCancel$0(ALAdapterS12S0100000_16 aLAdapterS12S0100000_16, Animator animator) {
        super.onAnimationCancel(animator);
        ((C1037280d6E) aLAdapterS12S0100000_16.l0).LJIIL = false;
    }

    public static final void onAnimationEnd$0(ALAdapterS12S0100000_16 aLAdapterS12S0100000_16, Animator animator) {
        FrameLayout frameLayout = ((C994580bzM) aLAdapterS12S0100000_16.l0).LLILLL;
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = -2;
        } else {
            layoutParams = null;
        }
        C786410Ut5.a6(frameLayout, layoutParams);
        ((C994580bzM) aLAdapterS12S0100000_16.l0).LLILLL.requestLayout();
    }

    public static final void onAnimationEnd$1(ALAdapterS12S0100000_16 aLAdapterS12S0100000_16, Animator animator) {
        C994580bzM c994580bzM = (C994580bzM) aLAdapterS12S0100000_16.l0;
        c994580bzM.LLILZLL = EnumC994530bzH.LL;
        C786410Ut5.LLJJJJ(c994580bzM.LLILLJJLI, 8);
        FrameLayout frameLayout = ((C994580bzM) aLAdapterS12S0100000_16.l0).LLILLL;
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = -2;
        } else {
            layoutParams = null;
        }
        C786410Ut5.a6(frameLayout, layoutParams);
    }

    public static final void onAnimationEnd$10(ALAdapterS12S0100000_16 aLAdapterS12S0100000_16, Animator animator) {
        ((Function0) aLAdapterS12S0100000_16.l0).invoke();
    }

    public static final void onAnimationEnd$11(ALAdapterS12S0100000_16 aLAdapterS12S0100000_16, Animator animator) {
        ((C1058500deS) aLAdapterS12S0100000_16.l0).G2(0);
        ((C1058500deS) aLAdapterS12S0100000_16.l0).LLILLJJLI = false;
    }

    public static final void onAnimationEnd$12(ALAdapterS12S0100000_16 aLAdapterS12S0100000_16, Animator animator) {
        ((C1058500deS) aLAdapterS12S0100000_16.l0).G2(1);
    }

    public static final void onAnimationEnd$13(ALAdapterS12S0100000_16 aLAdapterS12S0100000_16, Animator animator) {
        super.onAnimationEnd(animator);
        ((Function0) aLAdapterS12S0100000_16.l0).invoke();
    }

    public static final void onAnimationEnd$14(ALAdapterS12S0100000_16 aLAdapterS12S0100000_16, Animator animator) {
        ((C998110c53) aLAdapterS12S0100000_16.l0).LJFF.Mh().LJIJI().setEnabled(true);
    }

    public static final void onAnimationEnd$15(ALAdapterS12S0100000_16 aLAdapterS12S0100000_16, Animator animator) {
        ((AbstractC1014240cV4) aLAdapterS12S0100000_16.l0).LJIIZILJ();
        ((AbstractC1014240cV4) aLAdapterS12S0100000_16.l0).LLJJJIL = null;
    }

    public static final void onAnimationEnd$16(ALAdapterS12S0100000_16 aLAdapterS12S0100000_16, Animator animator) {
        super.onAnimationEnd(animator);
        ((C1037280d6E) aLAdapterS12S0100000_16.l0).LJIIL = false;
    }

    public static final void onAnimationEnd$17(ALAdapterS12S0100000_16 aLAdapterS12S0100000_16, Animator animator) {
        super.onAnimationEnd(animator);
        C786410Ut5.LJLLLLLL(8, ((LikeUserInfoAnimOptimizedWidget) aLAdapterS12S0100000_16.l0).LLJILLL);
    }

    public static final void onAnimationEnd$18(ALAdapterS12S0100000_16 aLAdapterS12S0100000_16, Animator animator) {
        C786410Ut5.LJLLLLLL(8, (View) aLAdapterS12S0100000_16.l0);
    }

    public static final void onAnimationEnd$19(ALAdapterS12S0100000_16 aLAdapterS12S0100000_16, Animator animator) {
        super.onAnimationEnd(animator);
        C1295960jpS c1295960jpS = ((C994700bzY) aLAdapterS12S0100000_16.l0).LL;
        if (c1295960jpS != null) {
            C786410Ut5.LLD(8, c1295960jpS);
        }
    }

    public static final void onAnimationEnd$2(ALAdapterS12S0100000_16 aLAdapterS12S0100000_16, Animator animator) {
        ViewGroup.LayoutParams layoutParams;
        View view = ((BaseCaptionSheetFragment) aLAdapterS12S0100000_16.l0).getView();
        if (view != null && (layoutParams = view.getLayoutParams()) != null) {
            layoutParams.height = -2;
        }
    }

    public static final void onAnimationEnd$20(ALAdapterS12S0100000_16 aLAdapterS12S0100000_16, Animator animator) {
        super.onAnimationEnd(animator);
        C1295960jpS c1295960jpS = ((C994700bzY) aLAdapterS12S0100000_16.l0).LL;
        if (c1295960jpS != null) {
            C786410Ut5.LLD(0, c1295960jpS);
        }
        C1295960jpS c1295960jpS2 = ((C994700bzY) aLAdapterS12S0100000_16.l0).LL;
        if (c1295960jpS2 != null) {
            C1143680frq.LJIILL(c1295960jpS2, "tiktok_live_match_redesign_resource", "ttlive_match_star_lottie.zip", true, null);
        }
        C994700bzY c994700bzY = (C994700bzY) aLAdapterS12S0100000_16.l0;
        C1295960jpS c1295960jpS3 = c994700bzY.LL;
        if (c1295960jpS3 != null) {
            c1295960jpS3.addAnimatorListener(new ALAdapterS12S0100000_16(c994700bzY, 23));
        }
    }

    public static final void onAnimationEnd$21(ALAdapterS12S0100000_16 aLAdapterS12S0100000_16, Animator animator) {
        super.onAnimationEnd(animator);
        C1295960jpS c1295960jpS = ((C994700bzY) aLAdapterS12S0100000_16.l0).LLILLJJLI;
        if (c1295960jpS != null) {
            C786410Ut5.LLD(8, c1295960jpS);
        }
    }

    public static final void onAnimationEnd$22(ALAdapterS12S0100000_16 aLAdapterS12S0100000_16, Animator animator) {
        super.onAnimationEnd(animator);
        C1295960jpS c1295960jpS = ((C994700bzY) aLAdapterS12S0100000_16.l0).LLILLJJLI;
        if (c1295960jpS != null) {
            C786410Ut5.LLD(0, c1295960jpS);
        }
        C1295960jpS c1295960jpS2 = ((C994700bzY) aLAdapterS12S0100000_16.l0).LLILLJJLI;
        if (c1295960jpS2 != null) {
            C1143680frq.LJIILL(c1295960jpS2, "tiktok_live_match_redesign_resource", "ttlive_match_star_lottie.zip", true, null);
        }
        C994700bzY c994700bzY = (C994700bzY) aLAdapterS12S0100000_16.l0;
        C1295960jpS c1295960jpS3 = c994700bzY.LLILLJJLI;
        if (c1295960jpS3 != null) {
            c1295960jpS3.addAnimatorListener(new ALAdapterS12S0100000_16(c994700bzY, 25));
        }
    }

    public static final void onAnimationEnd$23(ALAdapterS12S0100000_16 aLAdapterS12S0100000_16, Animator animator) {
        super.onAnimationEnd(animator);
        C1295960jpS c1295960jpS = ((C994700bzY) aLAdapterS12S0100000_16.l0).LLILLL;
        if (c1295960jpS != null) {
            C786410Ut5.LLD(8, c1295960jpS);
        }
        C994700bzY c994700bzY = (C994700bzY) aLAdapterS12S0100000_16.l0;
        int visibility = c994700bzY.getVisibility();
        c994700bzY.setVisibility(8);
        C1602160rnK.LIZIZ(visibility, 8, c994700bzY);
    }

    public static final void onAnimationEnd$24(ALAdapterS12S0100000_16 aLAdapterS12S0100000_16, Animator animator) {
        super.onAnimationEnd(animator);
        C1295960jpS c1295960jpS = ((C994700bzY) aLAdapterS12S0100000_16.l0).LLILLL;
        if (c1295960jpS != null) {
            C786410Ut5.LLD(0, c1295960jpS);
        }
        C1295960jpS c1295960jpS2 = ((C994700bzY) aLAdapterS12S0100000_16.l0).LLILLL;
        if (c1295960jpS2 != null) {
            C1143680frq.LJIILL(c1295960jpS2, "tiktok_live_match_redesign_resource", "ttlive_match_star_lottie.zip", true, null);
        }
        C994700bzY c994700bzY = (C994700bzY) aLAdapterS12S0100000_16.l0;
        C1295960jpS c1295960jpS3 = c994700bzY.LLILLL;
        if (c1295960jpS3 != null) {
            c1295960jpS3.addAnimatorListener(new ALAdapterS12S0100000_16(c994700bzY, 27));
        }
    }

    public static final void onAnimationEnd$3(ALAdapterS12S0100000_16 aLAdapterS12S0100000_16, Animator animator) {
        MutableLiveData<Boolean> mutableLiveData;
        FeedLiveViewHolderVM feedLiveViewHolderVM = (FeedLiveViewHolderVM) ((AdCardWidget) aLAdapterS12S0100000_16.l0).LLJIJIL.getValue();
        if (feedLiveViewHolderVM != null && (mutableLiveData = feedLiveViewHolderVM.LLJZ) != null) {
            mutableLiveData.setValue(Boolean.FALSE);
        }
    }

    public static final void onAnimationEnd$4(ALAdapterS12S0100000_16 aLAdapterS12S0100000_16, Animator animator) {
        ((C21629019km) ((InteractionAnimationWidget) aLAdapterS12S0100000_16.l0).LLJIJIL.getValue()).LIZIZ();
    }

    public static final void onAnimationEnd$5(ALAdapterS12S0100000_16 aLAdapterS12S0100000_16, Animator animator) {
        super.onAnimationEnd(animator);
        ((Function0) aLAdapterS12S0100000_16.l0).invoke();
    }

    public static final void onAnimationEnd$6(ALAdapterS12S0100000_16 aLAdapterS12S0100000_16, Animator animator) {
        AnimationAuthFragment animationAuthFragment = (AnimationAuthFragment) aLAdapterS12S0100000_16.l0;
        C1295960jpS c1295960jpS = animationAuthFragment.LLJ;
        if (c1295960jpS == null) {
            c1295960jpS = null;
        }
        HandlerHook.viewPostDelay(c1295960jpS, new ARunnableS116S0100000_16(animationAuthFragment, 246), 700L);
    }

    public static final void onAnimationEnd$7(ALAdapterS12S0100000_16 aLAdapterS12S0100000_16, Animator animator) {
        super.onAnimationEnd(animator);
        ((C214775193l) aLAdapterS12S0100000_16.l0).i3(new AwS607S0100000_28((Integer) null, 138));
    }

    public static final void onAnimationEnd$8(ALAdapterS12S0100000_16 aLAdapterS12S0100000_16, Animator animator) {
        Function0<Unit> function0 = ((C991760buo) aLAdapterS12S0100000_16.l0).LLJILJIL;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void onAnimationEnd$9(ALAdapterS12S0100000_16 aLAdapterS12S0100000_16, Animator animator) {
        ((C998340c5Q) aLAdapterS12S0100000_16.l0).LIZLLL().LJFF(4);
    }

    public static final void onAnimationStart$0(ALAdapterS12S0100000_16 aLAdapterS12S0100000_16, Animator animator) {
        C786410Ut5.LJLLLLLL(0, (View) aLAdapterS12S0100000_16.l0);
    }

    public static final void onAnimationStart$1(ALAdapterS12S0100000_16 aLAdapterS12S0100000_16, Animator animator) {
        C1002270cBl c1002270cBlZ4 = ((C214775193l) aLAdapterS12S0100000_16.l0).Z4();
        c1002270cBlZ4.getClass();
        C11S5.LIZ().LIZIZ(new ARunnableS116S0100000_16(c1002270cBlZ4, 212));
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a0c, ((C214775193l) aLAdapterS12S0100000_16.l0).T4());
        if (numLIZJ != null) {
            ((C214775193l) aLAdapterS12S0100000_16.l0).i3(new AwS607S0100000_28(Integer.valueOf(numLIZJ.intValue()), 138));
        }
    }

    public static final void onAnimationStart$2(ALAdapterS12S0100000_16 aLAdapterS12S0100000_16, Animator animator) {
        C998060c4y c998060c4y = ((C998340c5Q) aLAdapterS12S0100000_16.l0).LLILZLL;
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(-40));
        c998060c4y.getClass();
        C997370c3r.LIZ(c998060c4y, iLIZIZ);
        C998060c4y c998060c4y2 = ((C998340c5Q) aLAdapterS12S0100000_16.l0).LLILZLL;
        c998060c4y2.getClass();
        C997370c3r.LIZJ(c998060c4y2, 0);
    }

    public static final void onAnimationStart$3(ALAdapterS12S0100000_16 aLAdapterS12S0100000_16, Animator animator) {
        ((C1058500deS) aLAdapterS12S0100000_16.l0).G2(3);
    }

    public static final void onAnimationStart$5(ALAdapterS12S0100000_16 aLAdapterS12S0100000_16, Animator animator) {
        ((C998110c53) aLAdapterS12S0100000_16.l0).LJFF.Mh().LJIJI().setEnabled(false);
    }

    public static final void onAnimationStart$6(ALAdapterS12S0100000_16 aLAdapterS12S0100000_16, Animator animator) {
        C998110c53 c998110c53 = (C998110c53) aLAdapterS12S0100000_16.l0;
        c998110c53.LJ.LLLIIL(-c998110c53.LJIIJ);
        ((C998110c53) aLAdapterS12S0100000_16.l0).LJ.setVisibility(0);
    }

    public static final void onAnimationStart$7(ALAdapterS12S0100000_16 aLAdapterS12S0100000_16, Animator animator) {
        super.onAnimationStart(animator);
        ((C1037280d6E) aLAdapterS12S0100000_16.l0).LJIIL = true;
    }

    public static final void onAnimationStart$8(ALAdapterS12S0100000_16 aLAdapterS12S0100000_16, Animator animator) {
        boolean zLJI = MethodIDManager.LJI(72090);
        super.onAnimationStart(animator);
        C786410Ut5.LJLLLLLL(0, ((LikeUserInfoAnimOptimizedWidget) aLAdapterS12S0100000_16.l0).LLJILLL);
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public static final void onAnimationEnd$0(ALAdapterS12S0100000_16 aLAdapterS12S0100000_16, Animator animator, boolean z) {
        AbstractC997340c3o abstractC997340c3o = (AbstractC997340c3o) aLAdapterS12S0100000_16.l0;
        abstractC997340c3o.getClass();
        C997370c3r.LIZJ(abstractC997340c3o, 8);
    }
}
