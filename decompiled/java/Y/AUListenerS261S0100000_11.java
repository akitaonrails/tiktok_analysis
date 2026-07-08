package Y;

import X.C0SOM;
import X.C0SQR;
import X.C0STE;
import X.C1744700vVE;
import X.C21392818nm;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C707280Rok;
import X.C719840SLm;
import X.C722780SWu;
import X.C786410Ut5;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import android.animation.ValueAnimator;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.ss.android.ugc.aweme.ability.ISlideIndicatorAbility;
import com.ss.android.ugc.aweme.api.component.videoshrink.CommerceVideoShrinkAbilityComponent;
import com.ss.android.ugc.aweme.feed.assem.desc.LandscapeDescAssem;
import com.ss.android.ugc.aweme.feed.assem.ffpbutton.FollowButtonFFPAssem;
import com.ss.android.ugc.aweme.feed.assem.incentive.IncentiveBottomButtonAssem;
import com.ss.android.ugc.aweme.feed.assem.live.LiveNoticeCTAButtonAssem;
import com.ss.android.ugc.aweme.feed.assem.music.VideoMusicCoverAssem;
import com.ss.android.ugc.aweme.feed.assem.sharer.VideoExposeSharerInformationAssem;
import com.ss.android.ugc.aweme.feed.collection.friends.component.FriendsDetailBottomAreaAssem;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.ui.view.PostModeNestHeaderComponent;
import com.ss.android.ugc.feed.platform.cell.gradual.CellGradualComponent;
import com.tts.oecverify.BdTuring;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes12.dex */
public class AUListenerS261S0100000_11 implements ValueAnimator.AnimatorUpdateListener {
    public final int $t;
    public Object l0;

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$t) {
            case 0:
                onAnimationUpdate$0(this, valueAnimator);
                break;
            case 1:
                onAnimationUpdate$1(this, valueAnimator);
                break;
            case 2:
                onAnimationUpdate$2(this, valueAnimator);
                break;
            case 3:
                onAnimationUpdate$3(this, valueAnimator);
                break;
            case 4:
                onAnimationUpdate$4(this, valueAnimator);
                break;
            case 5:
                onAnimationUpdate$5(this, valueAnimator);
                break;
            case 6:
                onAnimationUpdate$6(this, valueAnimator);
                break;
            case 7:
                onAnimationUpdate$7(this, valueAnimator);
                break;
            case 8:
                onAnimationUpdate$8(this, valueAnimator);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onAnimationUpdate$9(this, valueAnimator);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onAnimationUpdate$10(this, valueAnimator);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                onAnimationUpdate$11(this, valueAnimator);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                onAnimationUpdate$12(this, valueAnimator);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                onAnimationUpdate$13(this, valueAnimator);
                break;
            case 14:
                onAnimationUpdate$14(this, valueAnimator);
                break;
            case 15:
                onAnimationUpdate$15(this, valueAnimator);
                break;
            case 16:
                onAnimationUpdate$16(this, valueAnimator);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                onAnimationUpdate$17(this, valueAnimator);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                onAnimationUpdate$18(this, valueAnimator);
                break;
            case 19:
                onAnimationUpdate$19(this, valueAnimator);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                onAnimationUpdate$20(this, valueAnimator);
                break;
            case 21:
                onAnimationUpdate$21(this, valueAnimator);
                break;
            case 22:
                onAnimationUpdate$22(this, valueAnimator);
                break;
            case 23:
                onAnimationUpdate$23(this, valueAnimator);
                break;
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                onAnimationUpdate$24(this, valueAnimator);
                break;
            case 25:
                onAnimationUpdate$25(this, valueAnimator);
                break;
            case 26:
                onAnimationUpdate$26(this, valueAnimator);
                break;
            case 27:
                onAnimationUpdate$27(this, valueAnimator);
                break;
            case 28:
                onAnimationUpdate$28(this, valueAnimator);
                break;
            case 29:
                onAnimationUpdate$29(this, valueAnimator);
                break;
        }
    }

    public AUListenerS261S0100000_11(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onAnimationUpdate$0(AUListenerS261S0100000_11 aUListenerS261S0100000_11, ValueAnimator valueAnimator) {
        FrameLayout frameLayout = ((VideoMusicCoverAssem) aUListenerS261S0100000_11.l0).LLLLLJLJLL;
        if (frameLayout != null) {
            frameLayout.setPaddingRelative(frameLayout.getPaddingStart(), frameLayout.getPaddingTop(), ((Integer) valueAnimator.getAnimatedValue()).intValue(), frameLayout.getPaddingBottom());
        }
    }

    public static final void onAnimationUpdate$1(AUListenerS261S0100000_11 aUListenerS261S0100000_11, ValueAnimator valueAnimator) {
        ImageView imageView = ((VideoMusicCoverAssem) aUListenerS261S0100000_11.l0).LLLLLLIL;
        ImageView imageView2 = null;
        if (imageView == null) {
            imageView = null;
        }
        C1744700vVE.LJIIL(imageView, ((Integer) valueAnimator.getAnimatedValue()).intValue());
        ImageView imageView3 = ((VideoMusicCoverAssem) aUListenerS261S0100000_11.l0).LLLLLLIL;
        if (imageView3 != null) {
            imageView2 = imageView3;
        }
        C1744700vVE.LJIIIIZZ(((Integer) valueAnimator.getAnimatedValue()).intValue(), imageView2);
    }

    public static final void onAnimationUpdate$10(AUListenerS261S0100000_11 aUListenerS261S0100000_11, ValueAnimator valueAnimator) {
        C786410Ut5.LLLLZLL(((LandscapeDescAssem) aUListenerS261S0100000_11.l0).tp(), 0);
        ((LandscapeDescAssem) aUListenerS261S0100000_11.l0).tp().setHeight(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    public static final void onAnimationUpdate$11(AUListenerS261S0100000_11 aUListenerS261S0100000_11, ValueAnimator valueAnimator) {
        Float f;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            CommerceVideoShrinkAbilityComponent commerceVideoShrinkAbilityComponent = (CommerceVideoShrinkAbilityComponent) aUListenerS261S0100000_11.l0;
            float fFloatValue = f.floatValue();
            View view = commerceVideoShrinkAbilityComponent.LLJLLIL;
            if (view != null) {
                C786410Ut5.T4(view, fFloatValue);
            }
        }
    }

    public static final void onAnimationUpdate$12(AUListenerS261S0100000_11 aUListenerS261S0100000_11, ValueAnimator valueAnimator) {
        ISlideIndicatorAbility iSlideIndicatorAbility = (ISlideIndicatorAbility) ((FriendsDetailBottomAreaAssem) aUListenerS261S0100000_11.l0).LLJJJJLIIL.getValue();
        if (iSlideIndicatorAbility != null) {
            iSlideIndicatorAbility.setAlpha(((FriendsDetailBottomAreaAssem) aUListenerS261S0100000_11.l0).LJJIJL().getAlpha());
        }
    }

    public static final void onAnimationUpdate$13(AUListenerS261S0100000_11 aUListenerS261S0100000_11, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        Function1<? super Float, Unit> function1 = ((C722780SWu) aUListenerS261S0100000_11.l0).LLILLL;
        if (function1 != null) {
            function1.invoke(Float.valueOf(fFloatValue));
        }
    }

    public static final void onAnimationUpdate$14(AUListenerS261S0100000_11 aUListenerS261S0100000_11, ValueAnimator valueAnimator) {
        View viewLJIIJ = ((C0SQR) aUListenerS261S0100000_11.l0).LJIIJ();
        if (viewLJIIJ != null) {
            viewLJIIJ.setBackgroundColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    public static final void onAnimationUpdate$15(AUListenerS261S0100000_11 aUListenerS261S0100000_11, ValueAnimator valueAnimator) {
        ((PostModeNestHeaderComponent) aUListenerS261S0100000_11.l0).LJIIJ(((Integer) valueAnimator.getAnimatedValue()).intValue(), true);
    }

    public static final void onAnimationUpdate$16(AUListenerS261S0100000_11 aUListenerS261S0100000_11, ValueAnimator valueAnimator) {
        float fFloatValue;
        Float f;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            fFloatValue = f.floatValue();
        } else {
            fFloatValue = 0.0f;
        }
        C786410Ut5.Jc((View) aUListenerS261S0100000_11.l0, fFloatValue);
    }

    public static final void onAnimationUpdate$17(AUListenerS261S0100000_11 aUListenerS261S0100000_11, ValueAnimator valueAnimator) {
        float fFloatValue;
        Float f;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            fFloatValue = f.floatValue();
        } else {
            fFloatValue = 0.0f;
        }
        C786410Ut5.ed((View) aUListenerS261S0100000_11.l0, fFloatValue);
    }

    public static final void onAnimationUpdate$18(AUListenerS261S0100000_11 aUListenerS261S0100000_11, ValueAnimator valueAnimator) {
        Integer num;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Integer) && (num = (Integer) animatedValue) != null) {
            ((TransitionValues) aUListenerS261S0100000_11.l0).view.setBackgroundColor(num.intValue());
        }
    }

    public static final void onAnimationUpdate$19(AUListenerS261S0100000_11 aUListenerS261S0100000_11, ValueAnimator valueAnimator) {
        Integer num;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Integer) && (num = (Integer) animatedValue) != null) {
            ((View) aUListenerS261S0100000_11.l0).setBackgroundColor(num.intValue());
        }
    }

    public static final void onAnimationUpdate$2(AUListenerS261S0100000_11 aUListenerS261S0100000_11, ValueAnimator valueAnimator) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        ViewGroup.LayoutParams layoutParams = ((C719840SLm) aUListenerS261S0100000_11.l0).LIZ.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            marginLayoutParams.topMargin = iIntValue;
            C786410Ut5.X5(marginLayoutParams, ((C719840SLm) aUListenerS261S0100000_11.l0).LIZ);
        }
    }

    public static final void onAnimationUpdate$20(AUListenerS261S0100000_11 aUListenerS261S0100000_11, ValueAnimator valueAnimator) {
        C786410Ut5.Jc(((C0STE) aUListenerS261S0100000_11.l0).LL, ((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static final void onAnimationUpdate$21(AUListenerS261S0100000_11 aUListenerS261S0100000_11, ValueAnimator valueAnimator) {
        C786410Ut5.ed(((C0STE) aUListenerS261S0100000_11.l0).LL, ((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static final void onAnimationUpdate$22(AUListenerS261S0100000_11 aUListenerS261S0100000_11, ValueAnimator valueAnimator) {
        C786410Ut5.T4(((C0STE) aUListenerS261S0100000_11.l0).LJIIJJI(), ((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static final void onAnimationUpdate$23(AUListenerS261S0100000_11 aUListenerS261S0100000_11, ValueAnimator valueAnimator) {
        C786410Ut5.T4(((C0STE) aUListenerS261S0100000_11.l0).LJIIJJI(), ((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static final void onAnimationUpdate$24(AUListenerS261S0100000_11 aUListenerS261S0100000_11, ValueAnimator valueAnimator) {
        Integer num;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Integer) && (num = (Integer) animatedValue) != null) {
            VideoExposeSharerInformationAssem videoExposeSharerInformationAssem = (VideoExposeSharerInformationAssem) aUListenerS261S0100000_11.l0;
            int iIntValue = num.intValue();
            View contentView = videoExposeSharerInformationAssem.getContentView();
            ViewGroup.LayoutParams layoutParams = videoExposeSharerInformationAssem.getContentView().getLayoutParams();
            layoutParams.height = iIntValue;
            C786410Ut5.W5(contentView, layoutParams);
        }
    }

    public static final void onAnimationUpdate$25(AUListenerS261S0100000_11 aUListenerS261S0100000_11, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        RelationButton relationButton = ((FollowButtonFFPAssem) aUListenerS261S0100000_11.l0).LLJLLIL;
        if (relationButton == null) {
            relationButton = null;
        }
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(relationButton);
        relationButton.setAlpha(fFloatValue);
    }

    public static final void onAnimationUpdate$26(AUListenerS261S0100000_11 aUListenerS261S0100000_11, ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        RelationButton relationButton = ((FollowButtonFFPAssem) aUListenerS261S0100000_11.l0).LLJLLIL;
        if (relationButton == null) {
            relationButton = null;
        }
        ViewGroup.LayoutParams layoutParams = relationButton.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = iIntValue;
            C786410Ut5.W5(relationButton, layoutParams);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    public static final void onAnimationUpdate$27(AUListenerS261S0100000_11 aUListenerS261S0100000_11, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        RelationButton relationButton = ((IncentiveBottomButtonAssem) aUListenerS261S0100000_11.l0).LLJLLIL;
        if (relationButton != null) {
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(relationButton);
            relationButton.setAlpha(fFloatValue);
        }
    }

    public static final void onAnimationUpdate$28(AUListenerS261S0100000_11 aUListenerS261S0100000_11, ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        RelationButton relationButton = ((IncentiveBottomButtonAssem) aUListenerS261S0100000_11.l0).LLJLLIL;
        if (relationButton != null) {
            ViewGroup.LayoutParams layoutParams = relationButton.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = iIntValue;
                C786410Ut5.W5(relationButton, layoutParams);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
    }

    public static final void onAnimationUpdate$29(AUListenerS261S0100000_11 aUListenerS261S0100000_11, ValueAnimator valueAnimator) {
        C1744700vVE.LJIIIIZZ(((Integer) valueAnimator.getAnimatedValue()).intValue(), ((LiveNoticeCTAButtonAssem) aUListenerS261S0100000_11.l0).LJJIJL());
    }

    public static final void onAnimationUpdate$3(AUListenerS261S0100000_11 aUListenerS261S0100000_11, ValueAnimator valueAnimator) {
        C1744700vVE.LJIIIIZZ(((Integer) valueAnimator.getAnimatedValue()).intValue(), ((LiveNoticeCTAButtonAssem) aUListenerS261S0100000_11.l0).LJJIJL());
    }

    public static final void onAnimationUpdate$4(AUListenerS261S0100000_11 aUListenerS261S0100000_11, ValueAnimator valueAnimator) {
        C0SOM c0som = (C0SOM) aUListenerS261S0100000_11.l0;
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c0som);
        c0som.setTranslationX(fFloatValue);
    }

    public static final void onAnimationUpdate$5(AUListenerS261S0100000_11 aUListenerS261S0100000_11, ValueAnimator valueAnimator) {
        ((CellGradualComponent) aUListenerS261S0100000_11.l0).ep().setAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    public static final void onAnimationUpdate$6(AUListenerS261S0100000_11 aUListenerS261S0100000_11, ValueAnimator valueAnimator) {
        C21392818nm c21392818nm = (C21392818nm) aUListenerS261S0100000_11.l0;
        ViewGroup.LayoutParams layoutParams = c21392818nm.getLayoutParams();
        layoutParams.width = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c21392818nm);
        c21392818nm.setLayoutParams(layoutParams);
    }

    public static final void onAnimationUpdate$7(AUListenerS261S0100000_11 aUListenerS261S0100000_11, ValueAnimator valueAnimator) {
        Float f;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            float fFloatValue = f.floatValue();
            C707280Rok c707280Rok = (C707280Rok) aUListenerS261S0100000_11.l0;
            c707280Rok.LLIZ = fFloatValue;
            c707280Rok.invalidate();
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("progressUpdateAnimator, translateOffset=");
            sbLIZ.append(((C707280Rok) aUListenerS261S0100000_11.l0).LLJJJIL);
            C2188811AlT.LIZIZ(sbLIZ);
        }
    }

    public static final void onAnimationUpdate$8(AUListenerS261S0100000_11 aUListenerS261S0100000_11, ValueAnimator valueAnimator) {
        Float f;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            float fFloatValue = f.floatValue();
            C707280Rok c707280Rok = (C707280Rok) aUListenerS261S0100000_11.l0;
            c707280Rok.LLJJJIL = fFloatValue;
            c707280Rok.invalidate();
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("translationOffset=");
            sbLIZ.append(((C707280Rok) aUListenerS261S0100000_11.l0).LLJJJIL);
            C2188811AlT.LIZIZ(sbLIZ);
        }
    }

    public static final void onAnimationUpdate$9(AUListenerS261S0100000_11 aUListenerS261S0100000_11, ValueAnimator valueAnimator) {
        Float f;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            float fFloatValue = f.floatValue();
            C707280Rok c707280Rok = (C707280Rok) aUListenerS261S0100000_11.l0;
            c707280Rok.LLJJJIL = fFloatValue;
            c707280Rok.invalidate();
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("translationOffset=");
            sbLIZ.append(((C707280Rok) aUListenerS261S0100000_11.l0).LLJJJIL);
            C2188811AlT.LIZIZ(sbLIZ);
        }
    }
}
