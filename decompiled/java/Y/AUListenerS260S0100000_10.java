package Y;

import X.C0QNW;
import X.C0QNX;
import X.C0QR0;
import X.C0QR2;
import X.C418440Gaw;
import X.C424620Gku;
import X.C660840Pw2;
import X.C661360Pws;
import X.C679560Ql8;
import X.C680440QmY;
import X.C786410Ut5;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.tux.widget.RadiusLayout;
import com.ss.android.ugc.aweme.ecommerce.search.general.clicksearch.ui.EcSearchCSCardAssem;
import com.ss.android.ugc.aweme.ecommerce.search.page.mix.MixFloatingLayerAssem;
import com.ss.android.ugc.aweme.search.pages.result.common.survey.core.viewmodel.SurveyViewController;
import com.ss.android.ugc.aweme.search.pages.sevensplitscreen.assem.SearchSevenSplitScreenBehaviorAssem;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes11.dex */
public class AUListenerS260S0100000_10 implements ValueAnimator.AnimatorUpdateListener {
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
        }
    }

    public AUListenerS260S0100000_10(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onAnimationUpdate$0(AUListenerS260S0100000_10 aUListenerS260S0100000_10, ValueAnimator valueAnimator) {
        Integer num;
        ViewGroup.LayoutParams layoutParams;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Integer) && (num = (Integer) animatedValue) != null) {
            View view = ((EcSearchCSCardAssem) aUListenerS260S0100000_10.l0).LLJL;
            if (view != null && (layoutParams = view.getLayoutParams()) != null) {
                layoutParams.height = num.intValue();
            }
            View view2 = ((EcSearchCSCardAssem) aUListenerS260S0100000_10.l0).LLJL;
            if (view2 != null) {
                view2.requestLayout();
            }
        }
    }

    public static final void onAnimationUpdate$1(AUListenerS260S0100000_10 aUListenerS260S0100000_10, ValueAnimator valueAnimator) {
        Function0<Unit> function0 = ((C660840Pw2) aUListenerS260S0100000_10.l0).LLJI;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void onAnimationUpdate$10(AUListenerS260S0100000_10 aUListenerS260S0100000_10, ValueAnimator valueAnimator) {
        C0QNX c0qnx = (C0QNX) ((C0QNW) aUListenerS260S0100000_10.l0);
        C786410Ut5.ed(c0qnx.LJ, c0qnx.LJFF * (1 - valueAnimator.getAnimatedFraction()));
        C786410Ut5.T4(c0qnx.LJ, valueAnimator.getAnimatedFraction());
    }

    public static final void onAnimationUpdate$11(AUListenerS260S0100000_10 aUListenerS260S0100000_10, ValueAnimator valueAnimator) {
        C0QNX c0qnx = (C0QNX) ((C0QNW) aUListenerS260S0100000_10.l0);
        C786410Ut5.ed(c0qnx.LJ, c0qnx.LJFF * valueAnimator.getAnimatedFraction());
        C786410Ut5.T4(c0qnx.LJ, 1 - valueAnimator.getAnimatedFraction());
    }

    public static final void onAnimationUpdate$12(AUListenerS260S0100000_10 aUListenerS260S0100000_10, ValueAnimator valueAnimator) {
        ((C680440QmY) aUListenerS260S0100000_10.l0).setCurrentRect((RectF) valueAnimator.getAnimatedValue());
    }

    public static final void onAnimationUpdate$13(AUListenerS260S0100000_10 aUListenerS260S0100000_10, ValueAnimator valueAnimator) {
        ((C680440QmY) aUListenerS260S0100000_10.l0).setCurrentRect((RectF) valueAnimator.getAnimatedValue());
        ((C680440QmY) aUListenerS260S0100000_10.l0).LLIZ.setColor(C679560Ql8.LIZ);
        ((C680440QmY) aUListenerS260S0100000_10.l0).invalidate();
    }

    public static final void onAnimationUpdate$14(AUListenerS260S0100000_10 aUListenerS260S0100000_10, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        C786410Ut5.k((C424620Gku) aUListenerS260S0100000_10.l0, 0);
        C424620Gku c424620Gku = (C424620Gku) aUListenerS260S0100000_10.l0;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c424620Gku);
        c424620Gku.setTranslationY(50 * fFloatValue);
        C424620Gku c424620Gku2 = (C424620Gku) aUListenerS260S0100000_10.l0;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c424620Gku2);
        c424620Gku2.setAlpha(1.0f - fFloatValue);
    }

    public static final void onAnimationUpdate$15(AUListenerS260S0100000_10 aUListenerS260S0100000_10, ValueAnimator valueAnimator) {
        RadiusLayout radiusLayoutHo = ((SearchSevenSplitScreenBehaviorAssem) aUListenerS260S0100000_10.l0).Ho();
        if (radiusLayoutHo != null) {
            C786410Ut5.G5(radiusLayoutHo, ((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public static final void onAnimationUpdate$16(AUListenerS260S0100000_10 aUListenerS260S0100000_10, ValueAnimator valueAnimator) {
        RadiusLayout radiusLayoutHo = ((SearchSevenSplitScreenBehaviorAssem) aUListenerS260S0100000_10.l0).Ho();
        if (radiusLayoutHo != null) {
            C786410Ut5.G5(radiusLayoutHo, ((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public static final void onAnimationUpdate$17(AUListenerS260S0100000_10 aUListenerS260S0100000_10, ValueAnimator valueAnimator) {
        C0QR2 c0qr2 = (C0QR2) ((C0QR0) aUListenerS260S0100000_10.l0);
        C786410Ut5.ed(c0qr2.LJ, c0qr2.LJFF * valueAnimator.getAnimatedFraction());
        C786410Ut5.T4(c0qr2.LJ, 1.0f - valueAnimator.getAnimatedFraction());
    }

    public static final void onAnimationUpdate$18(AUListenerS260S0100000_10 aUListenerS260S0100000_10, ValueAnimator valueAnimator) {
        C0QR2 c0qr2 = (C0QR2) ((C0QR0) aUListenerS260S0100000_10.l0);
        C786410Ut5.ed(c0qr2.LJ, c0qr2.LJFF * (1.0f - valueAnimator.getAnimatedFraction()));
        C786410Ut5.T4(c0qr2.LJ, valueAnimator.getAnimatedFraction());
    }

    public static final void onAnimationUpdate$2(AUListenerS260S0100000_10 aUListenerS260S0100000_10, ValueAnimator valueAnimator) {
        ((C680440QmY) aUListenerS260S0100000_10.l0).setCurrentRect((RectF) valueAnimator.getAnimatedValue());
        if (valueAnimator.getAnimatedFraction() >= 0.8f) {
            ((C680440QmY) aUListenerS260S0100000_10.l0).LLIZ.setColor(C679560Ql8.LIZ);
        }
        ((C680440QmY) aUListenerS260S0100000_10.l0).invalidate();
    }

    public static final void onAnimationUpdate$3(AUListenerS260S0100000_10 aUListenerS260S0100000_10, ValueAnimator valueAnimator) {
        ((C680440QmY) aUListenerS260S0100000_10.l0).setCurrentRect((RectF) valueAnimator.getAnimatedValue());
    }

    public static final void onAnimationUpdate$4(AUListenerS260S0100000_10 aUListenerS260S0100000_10, ValueAnimator valueAnimator) {
        ((C680440QmY) aUListenerS260S0100000_10.l0).setCurrentRect((RectF) valueAnimator.getAnimatedValue());
        ((C680440QmY) aUListenerS260S0100000_10.l0).invalidate();
    }

    public static final void onAnimationUpdate$5(AUListenerS260S0100000_10 aUListenerS260S0100000_10, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        TextView textView = ((SurveyViewController) aUListenerS260S0100000_10.l0).LLILZLL;
        View view = null;
        if (textView == null) {
            textView = null;
        }
        C786410Ut5.S4(fFloatValue, textView);
        View view2 = ((SurveyViewController) aUListenerS260S0100000_10.l0).LLJI;
        if (view2 != null) {
            view = view2;
        }
        C786410Ut5.T4(view, fFloatValue);
    }

    public static final void onAnimationUpdate$6(AUListenerS260S0100000_10 aUListenerS260S0100000_10, ValueAnimator valueAnimator) {
        C786410Ut5.fd(((MixFloatingLayerAssem) aUListenerS260S0100000_10.l0).ap(), ((Float) valueAnimator.getAnimatedValue()).floatValue() - C418440Gaw.LIZIZ(120));
    }

    public static final void onAnimationUpdate$7(AUListenerS260S0100000_10 aUListenerS260S0100000_10, ValueAnimator valueAnimator) {
        ((Function1) aUListenerS260S0100000_10.l0).invoke(valueAnimator.getAnimatedValue());
    }

    public static final void onAnimationUpdate$8(AUListenerS260S0100000_10 aUListenerS260S0100000_10, ValueAnimator valueAnimator) {
        ViewGroup viewGroup = (ViewGroup) aUListenerS260S0100000_10.l0;
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            C786410Ut5.W5(viewGroup, marginLayoutParams);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    public static final void onAnimationUpdate$9(AUListenerS260S0100000_10 aUListenerS260S0100000_10, ValueAnimator valueAnimator) {
        Float f;
        C661360Pws c661360Pws = (C661360Pws) aUListenerS260S0100000_10.l0;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            c661360Pws.LLIZ = f.floatValue();
            ((C661360Pws) aUListenerS260S0100000_10.l0).invalidateSelf();
        }
    }
}
