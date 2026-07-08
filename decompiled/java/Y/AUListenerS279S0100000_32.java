package Y;

import X.AbstractC21154817qU;
import X.AnonymousClass1965;
import X.C1260280itu;
import X.C1771920wD8;
import X.C1771930wD9;
import X.C18RL;
import X.C191E;
import X.C19I8;
import X.C19IB;
import X.C19IQ;
import X.C19YK;
import X.C20441214yg;
import X.C21155817qe;
import X.C21367118jd;
import X.C21368618js;
import X.C21390118nL;
import X.C21408118qF;
import X.C21415918rV;
import X.C214795194f;
import X.C21570319bJ;
import X.C786410Ut5;
import X.C978750bZp;
import X.EnumC1490800oti;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import X.ViewTreeObserverOnGlobalLayoutListenerC21155717qd;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.ss.android.ugc.aweme.feed.assem.music.VideoMusicCoverAssem;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.tools.chat.message.cell.genereatingcell.AIGeneratingAssem;
import com.tts.oecverify.BdTuring;

/* JADX INFO: loaded from: classes33.dex */
public class AUListenerS279S0100000_32 implements ValueAnimator.AnimatorUpdateListener {
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
            case 30:
                onAnimationUpdate$30(this, valueAnimator);
                break;
            case 31:
                onAnimationUpdate$31(this, valueAnimator);
                break;
            case 32:
                onAnimationUpdate$32(this, valueAnimator);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                onAnimationUpdate$33(this, valueAnimator);
                break;
        }
    }

    public AUListenerS279S0100000_32(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onAnimationUpdate$0(AUListenerS279S0100000_32 aUListenerS279S0100000_32, ValueAnimator valueAnimator) {
        float centerProgress;
        Float f;
        C19I8 c19i8 = (C19I8) aUListenerS279S0100000_32.l0;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            centerProgress = f.floatValue();
        } else {
            centerProgress = ((C19I8) aUListenerS279S0100000_32.l0).getCenterProgress();
        }
        c19i8.setProgress(centerProgress);
    }

    public static final void onAnimationUpdate$1(AUListenerS279S0100000_32 aUListenerS279S0100000_32, ValueAnimator valueAnimator) {
        float fFloatValue;
        Float f;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            fFloatValue = f.floatValue();
        } else {
            fFloatValue = 1.0f;
        }
        ViewTreeObserverOnGlobalLayoutListenerC21155717qd viewTreeObserverOnGlobalLayoutListenerC21155717qd = (ViewTreeObserverOnGlobalLayoutListenerC21155717qd) aUListenerS279S0100000_32.l0;
        C21155817qe c21155817qe = viewTreeObserverOnGlobalLayoutListenerC21155717qd.LLILLL.LJI;
        if (c21155817qe != null && c21155817qe.LJFF == EnumC1490800oti.BOTTOM_POPUP) {
            C1771920wD8 c1771920wD8 = viewTreeObserverOnGlobalLayoutListenerC21155717qd.LLIZLLLIL;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1771920wD8);
            c1771920wD8.setTranslationY(c1771920wD8.getMeasuredHeight() * (1 - fFloatValue));
            return;
        }
        C1771920wD8 c1771920wD82 = viewTreeObserverOnGlobalLayoutListenerC21155717qd.LLIZLLLIL;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1771920wD82);
        c1771920wD82.setAlpha(fFloatValue);
    }

    public static final void onAnimationUpdate$10(AUListenerS279S0100000_32 aUListenerS279S0100000_32, ValueAnimator valueAnimator) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        VideoMusicCoverAssem videoMusicCoverAssem = (VideoMusicCoverAssem) aUListenerS279S0100000_32.l0;
        if (jCurrentTimeMillis - videoMusicCoverAssem.LLLLIIIILLL > videoMusicCoverAssem.LLLLIILLL) {
            videoMusicCoverAssem.LLLLIIIILLL = System.currentTimeMillis();
            FrameLayout frameLayout = ((VideoMusicCoverAssem) aUListenerS279S0100000_32.l0).LLLIL;
            if (frameLayout != null) {
                C786410Ut5.Bb(frameLayout, ((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        }
    }

    public static final void onAnimationUpdate$11(AUListenerS279S0100000_32 aUListenerS279S0100000_32, ValueAnimator valueAnimator) {
        C21570319bJ c21570319bJ = (C21570319bJ) aUListenerS279S0100000_32.l0;
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c21570319bJ);
        c21570319bJ.setScaleX(fFloatValue);
        C21570319bJ c21570319bJ2 = (C21570319bJ) aUListenerS279S0100000_32.l0;
        float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c21570319bJ2);
        c21570319bJ2.setScaleY(fFloatValue2);
    }

    public static final void onAnimationUpdate$12(AUListenerS279S0100000_32 aUListenerS279S0100000_32, ValueAnimator valueAnimator) {
        View view = ((AnonymousClass1965) aUListenerS279S0100000_32.l0).LLILZIL;
        if (view != null) {
            C786410Ut5.T4(view, ((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public static final void onAnimationUpdate$13(AUListenerS279S0100000_32 aUListenerS279S0100000_32, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        C978750bZp c978750bZp = (C978750bZp) aUListenerS279S0100000_32.l0;
        if (c978750bZp.LJIIIIZZ == null) {
            C20441214yg.LJIIIZ("GiftOnlySelectUtils", "animatorEndFirAlp, newGiftSelectLl is null");
            return;
        }
        LinearLayout linearLayout = c978750bZp.LJIIIIZZ;
        if (linearLayout != null) {
            C786410Ut5.W4(linearLayout, fFloatValue);
        }
    }

    public static final void onAnimationUpdate$14(AUListenerS279S0100000_32 aUListenerS279S0100000_32, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        C978750bZp c978750bZp = (C978750bZp) aUListenerS279S0100000_32.l0;
        if (c978750bZp.LJII == null) {
            C20441214yg.LJIIIZ("GiftOnlySelectUtils", "animatorEndSecAlp, giftSelectLl is null");
            return;
        }
        LinearLayout linearLayout = c978750bZp.LJII;
        if (linearLayout != null) {
            C786410Ut5.W4(linearLayout, fFloatValue);
        }
    }

    public static final void onAnimationUpdate$15(AUListenerS279S0100000_32 aUListenerS279S0100000_32, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        C978750bZp c978750bZp = (C978750bZp) aUListenerS279S0100000_32.l0;
        if (c978750bZp.LJII == null) {
            C20441214yg.LJIIIZ("GiftOnlySelectUtils", "animatorStartFirAlp, giftSelectLl is null");
            return;
        }
        LinearLayout linearLayout = c978750bZp.LJII;
        if (linearLayout != null) {
            C786410Ut5.W4(linearLayout, fFloatValue);
        }
    }

    public static final void onAnimationUpdate$16(AUListenerS279S0100000_32 aUListenerS279S0100000_32, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        C978750bZp c978750bZp = (C978750bZp) aUListenerS279S0100000_32.l0;
        if (c978750bZp.LJIIIIZZ == null) {
            C20441214yg.LJIIIZ("GiftOnlySelectUtils", "animatorStartSecAlp, newGiftSelectLl is null");
            return;
        }
        LinearLayout linearLayout = c978750bZp.LJIIIIZZ;
        if (linearLayout != null) {
            C786410Ut5.W4(linearLayout, fFloatValue);
        }
    }

    public static final void onAnimationUpdate$17(AUListenerS279S0100000_32 aUListenerS279S0100000_32, ValueAnimator valueAnimator) {
        ((C191E) aUListenerS279S0100000_32.l0).LIZ(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static final void onAnimationUpdate$18(AUListenerS279S0100000_32 aUListenerS279S0100000_32, ValueAnimator valueAnimator) {
        float fFloatValue;
        Float f;
        C19IB c19ib = (C19IB) aUListenerS279S0100000_32.l0;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            fFloatValue = f.floatValue();
        } else {
            ((C19IB) aUListenerS279S0100000_32.l0).getClass();
            fFloatValue = 0.0f;
        }
        c19ib.setProgress(fFloatValue);
    }

    public static final void onAnimationUpdate$19(AUListenerS279S0100000_32 aUListenerS279S0100000_32, ValueAnimator valueAnimator) {
        ((C21415918rV) aUListenerS279S0100000_32.l0).scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
    }

    public static final void onAnimationUpdate$2(AUListenerS279S0100000_32 aUListenerS279S0100000_32, ValueAnimator valueAnimator) {
        C21408118qF c21408118qF = (C21408118qF) aUListenerS279S0100000_32.l0;
        int i = C21408118qF.LLL;
        c21408118qF.getClass();
        c21408118qF.LLJJJJJIL = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        c21408118qF.invalidate();
    }

    public static final void onAnimationUpdate$20(AUListenerS279S0100000_32 aUListenerS279S0100000_32, ValueAnimator valueAnimator) {
        ((C21415918rV) aUListenerS279S0100000_32.l0).scrollTo(-((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
    }

    public static final void onAnimationUpdate$21(AUListenerS279S0100000_32 aUListenerS279S0100000_32, ValueAnimator valueAnimator) {
        ((C18RL) aUListenerS279S0100000_32.l0).LIZ.getWindow().getDecorView().getBackground().setAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    public static final void onAnimationUpdate$22(AUListenerS279S0100000_32 aUListenerS279S0100000_32, ValueAnimator valueAnimator) {
        RelativeLayout.LayoutParams layoutParams;
        RelativeLayout.LayoutParams layoutParams2;
        ViewGroup viewGroup = ((C21367118jd) aUListenerS279S0100000_32.l0).LLJIJIL;
        if (viewGroup != null) {
            ViewGroup.LayoutParams layoutParams3 = viewGroup.getLayoutParams();
            if ((layoutParams3 instanceof RelativeLayout.LayoutParams) && (layoutParams2 = (RelativeLayout.LayoutParams) layoutParams3) != null) {
                layoutParams2.width = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            }
        }
        C21367118jd c21367118jd = (C21367118jd) aUListenerS279S0100000_32.l0;
        ViewGroup viewGroup2 = c21367118jd.LLJILJIL;
        if (viewGroup2 != null) {
            int iIntValue = (c21367118jd.LLJJ - ((Integer) valueAnimator.getAnimatedValue()).intValue()) + c21367118jd.LLJILLL;
            ViewGroup.LayoutParams layoutParams4 = viewGroup2.getLayoutParams();
            if ((layoutParams4 instanceof RelativeLayout.LayoutParams) && (layoutParams = (RelativeLayout.LayoutParams) layoutParams4) != null) {
                layoutParams.width = iIntValue;
            }
        }
        ((C21367118jd) aUListenerS279S0100000_32.l0).requestLayout();
    }

    public static final void onAnimationUpdate$23(AUListenerS279S0100000_32 aUListenerS279S0100000_32, ValueAnimator valueAnimator) {
        ((C21390118nL) aUListenerS279S0100000_32.l0).invalidate();
    }

    public static final void onAnimationUpdate$24(AUListenerS279S0100000_32 aUListenerS279S0100000_32, ValueAnimator valueAnimator) {
        ((C21390118nL) aUListenerS279S0100000_32.l0).invalidate();
    }

    public static final void onAnimationUpdate$25(AUListenerS279S0100000_32 aUListenerS279S0100000_32, ValueAnimator valueAnimator) {
        ((C21390118nL) aUListenerS279S0100000_32.l0).invalidate();
    }

    public static final void onAnimationUpdate$26(AUListenerS279S0100000_32 aUListenerS279S0100000_32, ValueAnimator valueAnimator) {
        float fFloatValue;
        Float f;
        C1771930wD9 c1771930wD9LJIIL = ((AbstractC21154817qU) aUListenerS279S0100000_32.l0).Y4();
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            fFloatValue = f.floatValue();
        } else {
            fFloatValue = 1.0f;
        }
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1771930wD9LJIIL);
        c1771930wD9LJIIL.setAlpha(fFloatValue);
    }

    public static final void onAnimationUpdate$27(AUListenerS279S0100000_32 aUListenerS279S0100000_32, ValueAnimator valueAnimator) {
        LinearLayout linearLayout = ((C19IQ) aUListenerS279S0100000_32.l0).LLIZ;
        if (linearLayout != null) {
            linearLayout.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
        }
    }

    public static final void onAnimationUpdate$28(AUListenerS279S0100000_32 aUListenerS279S0100000_32, ValueAnimator valueAnimator) {
        ((C21368618js) aUListenerS279S0100000_32.l0).LIZLLL(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static final void onAnimationUpdate$29(AUListenerS279S0100000_32 aUListenerS279S0100000_32, ValueAnimator valueAnimator) {
        ((AIGeneratingAssem) aUListenerS279S0100000_32.l0).j3(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    public static final void onAnimationUpdate$3(AUListenerS279S0100000_32 aUListenerS279S0100000_32, ValueAnimator valueAnimator) {
        C21408118qF c21408118qF = (C21408118qF) aUListenerS279S0100000_32.l0;
        int i = C21408118qF.LLL;
        c21408118qF.getClass();
        c21408118qF.LLJJJJLIIL = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        c21408118qF.invalidate();
    }

    public static final void onAnimationUpdate$30(AUListenerS279S0100000_32 aUListenerS279S0100000_32, ValueAnimator valueAnimator) {
        C786410Ut5.Jc(((C214795194f) aUListenerS279S0100000_32.l0).LIZIZ, ((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    public static final void onAnimationUpdate$31(AUListenerS279S0100000_32 aUListenerS279S0100000_32, ValueAnimator valueAnimator) {
        C786410Ut5.Jc(((C214795194f) aUListenerS279S0100000_32.l0).LIZIZ, ((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    public static final void onAnimationUpdate$32(AUListenerS279S0100000_32 aUListenerS279S0100000_32, ValueAnimator valueAnimator) {
        C786410Ut5.Jc((View) aUListenerS279S0100000_32.l0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    public static final void onAnimationUpdate$33(AUListenerS279S0100000_32 aUListenerS279S0100000_32, ValueAnimator valueAnimator) {
        C786410Ut5.Jc((View) aUListenerS279S0100000_32.l0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    public static final void onAnimationUpdate$4(AUListenerS279S0100000_32 aUListenerS279S0100000_32, ValueAnimator valueAnimator) {
        ((C191E) aUListenerS279S0100000_32.l0).LIZ(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static final void onAnimationUpdate$5(AUListenerS279S0100000_32 aUListenerS279S0100000_32, ValueAnimator valueAnimator) {
        ((C19YK) aUListenerS279S0100000_32.l0).scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
    }

    public static final void onAnimationUpdate$6(AUListenerS279S0100000_32 aUListenerS279S0100000_32, ValueAnimator valueAnimator) {
        ((C21415918rV) aUListenerS279S0100000_32.l0).scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
    }

    public static final void onAnimationUpdate$7(AUListenerS279S0100000_32 aUListenerS279S0100000_32, ValueAnimator valueAnimator) {
        ((C21415918rV) aUListenerS279S0100000_32.l0).scrollTo(-((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
    }

    public static final void onAnimationUpdate$8(AUListenerS279S0100000_32 aUListenerS279S0100000_32, ValueAnimator valueAnimator) {
        ((C1260280itu) aUListenerS279S0100000_32.l0).scrollTo(0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    public static final void onAnimationUpdate$9(AUListenerS279S0100000_32 aUListenerS279S0100000_32, ValueAnimator valueAnimator) {
        ((C1260280itu) aUListenerS279S0100000_32.l0).scrollTo(0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
