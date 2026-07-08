package Y;

import X.C1638190sjR;
import X.C1644370stP;
import X.C1644380stQ;
import X.C1645330sux;
import X.C1649320t1O;
import X.C1651820t5Q;
import X.C214795194f;
import X.C426750GoL;
import X.C786410Ut5;
import X.EnumC430170Gtr;
import X.InterfaceC1645340suy;
import X.ViewOnTouchListenerC1648890t0h;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.shortvideo.component.b;
import com.ss.android.ugc.aweme.shortvideo.widget.TabHost;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.OppoPermissionPopupMaskDelayExp;
import com.tts.oecverify.BdTuring;

/* JADX INFO: loaded from: classes26.dex */
public class AUListenerS273S0100000_25 implements ValueAnimator.AnimatorUpdateListener {
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
        }
    }

    public AUListenerS273S0100000_25(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onAnimationUpdate$0(AUListenerS273S0100000_25 aUListenerS273S0100000_25, ValueAnimator valueAnimator) {
        ((TabHost) aUListenerS273S0100000_25.l0).LLIZ.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
    }

    public static final void onAnimationUpdate$1(AUListenerS273S0100000_25 aUListenerS273S0100000_25, ValueAnimator valueAnimator) {
        EnumC430170Gtr enumC430170Gtr;
        InterfaceC1645340suy interfaceC1645340suy = ((C1645330sux) aUListenerS273S0100000_25.l0).LIZIZ;
        if (interfaceC1645340suy != null) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            C1645330sux c1645330sux = (C1645330sux) aUListenerS273S0100000_25.l0;
            float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            c1645330sux.getClass();
            if (fFloatValue2 < 1.0E-5f) {
                enumC430170Gtr = EnumC430170Gtr.LEFT;
            } else {
                enumC430170Gtr = EnumC430170Gtr.RIGHT;
            }
            interfaceC1645340suy.LIZ(fFloatValue, enumC430170Gtr);
        }
    }

    public static final void onAnimationUpdate$10(AUListenerS273S0100000_25 aUListenerS273S0100000_25, ValueAnimator valueAnimator) {
        C786410Ut5.T4((View) aUListenerS273S0100000_25.l0, ((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static final void onAnimationUpdate$11(AUListenerS273S0100000_25 aUListenerS273S0100000_25, ValueAnimator valueAnimator) {
        C786410Ut5.T4(((C214795194f) aUListenerS273S0100000_25.l0).LIZIZ, ((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static final void onAnimationUpdate$12(AUListenerS273S0100000_25 aUListenerS273S0100000_25, ValueAnimator valueAnimator) {
        ViewGroup.LayoutParams layoutParams = ((C1638190sjR) aUListenerS273S0100000_25.l0).LIZJ.getLayoutParams();
        layoutParams.height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        C786410Ut5.W5(((C1638190sjR) aUListenerS273S0100000_25.l0).LIZJ, layoutParams);
    }

    public static final void onAnimationUpdate$13(AUListenerS273S0100000_25 aUListenerS273S0100000_25, ValueAnimator valueAnimator) {
        ViewGroup.LayoutParams layoutParams = ((C1638190sjR) aUListenerS273S0100000_25.l0).LIZJ.getLayoutParams();
        layoutParams.height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        C786410Ut5.W5(((C1638190sjR) aUListenerS273S0100000_25.l0).LIZJ, layoutParams);
    }

    public static final void onAnimationUpdate$14(AUListenerS273S0100000_25 aUListenerS273S0100000_25, ValueAnimator valueAnimator) {
        ViewGroup.LayoutParams layoutParams = ((C1638190sjR) aUListenerS273S0100000_25.l0).LIZJ.getLayoutParams();
        layoutParams.height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        C786410Ut5.W5(((C1638190sjR) aUListenerS273S0100000_25.l0).LIZJ, layoutParams);
    }

    public static final void onAnimationUpdate$15(AUListenerS273S0100000_25 aUListenerS273S0100000_25, ValueAnimator valueAnimator) {
        ViewGroup.LayoutParams layoutParams = ((C1638190sjR) aUListenerS273S0100000_25.l0).LIZJ.getLayoutParams();
        layoutParams.height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        C786410Ut5.W5(((C1638190sjR) aUListenerS273S0100000_25.l0).LIZJ, layoutParams);
    }

    public static final void onAnimationUpdate$2(AUListenerS273S0100000_25 aUListenerS273S0100000_25, ValueAnimator valueAnimator) {
        C786410Ut5.ed(((C214795194f) aUListenerS273S0100000_25.l0).LIZIZ, ((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static final void onAnimationUpdate$3(AUListenerS273S0100000_25 aUListenerS273S0100000_25, ValueAnimator valueAnimator) {
        float f;
        float f2 = (CastIntegerProtector.parseInt(valueAnimator.getAnimatedValue().toString()) % LSPassThroughRecordSizeConfig.DEFAULT) * 1.0f;
        if (f2 < 300.0f) {
            f = ((f2 / DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL) * 0.7f) + 0.3f;
        } else {
            f = 1.0f - (((f2 - DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL) / OppoPermissionPopupMaskDelayExp.DEFAULT) * 0.7f);
        }
        C786410Ut5.R4(f, ((C1651820t5Q) aUListenerS273S0100000_25.l0).LIZ);
    }

    public static final void onAnimationUpdate$4(AUListenerS273S0100000_25 aUListenerS273S0100000_25, ValueAnimator valueAnimator) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        Rect rect = (Rect) valueAnimator.getAnimatedValue();
        ImageView imageView = ((C1649320t1O) aUListenerS273S0100000_25.l0).LLJJJIL;
        ImageView imageView2 = null;
        if (imageView == null) {
            imageView = null;
        }
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            C1649320t1O c1649320t1O = (C1649320t1O) aUListenerS273S0100000_25.l0;
            marginLayoutParams.width = rect.width();
            marginLayoutParams.height = rect.height();
            marginLayoutParams.topMargin = rect.top;
            ImageView imageView3 = c1649320t1O.LLJJJIL;
            if (imageView3 == null) {
                imageView3 = null;
            }
            C426750GoL.LJIIJ(marginLayoutParams, imageView3.getContext(), Integer.valueOf(rect.left), null, null, null, 60);
            ImageView imageView4 = c1649320t1O.LLJJJIL;
            if (imageView4 != null) {
                imageView2 = imageView4;
            }
            C786410Ut5.c6(imageView2, marginLayoutParams);
        }
    }

    public static final void onAnimationUpdate$5(AUListenerS273S0100000_25 aUListenerS273S0100000_25, ValueAnimator valueAnimator) {
        ((b) aUListenerS273S0100000_25.l0).LLLFFI.LJII(Float.valueOf(((Float) valueAnimator.getAnimatedValue()).floatValue()));
    }

    public static final void onAnimationUpdate$6(AUListenerS273S0100000_25 aUListenerS273S0100000_25, ValueAnimator valueAnimator) {
        C786410Ut5.ed(((C214795194f) aUListenerS273S0100000_25.l0).LIZIZ, ((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static final void onAnimationUpdate$7(AUListenerS273S0100000_25 aUListenerS273S0100000_25, ValueAnimator valueAnimator) {
        ((ViewOnTouchListenerC1648890t0h) aUListenerS273S0100000_25.l0).LLJ.setValue(Long.valueOf((long) (valueAnimator.getAnimatedFraction() * 2000)));
    }

    public static final void onAnimationUpdate$8(AUListenerS273S0100000_25 aUListenerS273S0100000_25, ValueAnimator valueAnimator) {
        ((C1644380stQ) aUListenerS273S0100000_25.l0).LIZ(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static final void onAnimationUpdate$9(AUListenerS273S0100000_25 aUListenerS273S0100000_25, ValueAnimator valueAnimator) {
        ((C1644370stP) aUListenerS273S0100000_25.l0).LIZ(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
