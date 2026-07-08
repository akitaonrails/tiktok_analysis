package Y;

import X.C0DEX;
import X.C0DIT;
import X.C424620Gku;
import X.C497740JfY;
import X.C786410Ut5;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public class AUListenerS254S0100000_4 implements ValueAnimator.AnimatorUpdateListener {
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
        }
    }

    public AUListenerS254S0100000_4(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onAnimationUpdate$0(AUListenerS254S0100000_4 aUListenerS254S0100000_4, ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        ViewGroup.LayoutParams layoutParams = ((View) aUListenerS254S0100000_4.l0).getLayoutParams();
        if (layoutParams != null && layoutParams.height != iIntValue) {
            layoutParams.height = iIntValue;
            ((View) aUListenerS254S0100000_4.l0).requestLayout();
        }
    }

    public static final void onAnimationUpdate$1(AUListenerS254S0100000_4 aUListenerS254S0100000_4, ValueAnimator valueAnimator) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        View view = (View) aUListenerS254S0100000_4.l0;
        ViewGroup.LayoutParams layoutParams = null;
        if (view != null) {
            layoutParams = view.getLayoutParams();
        }
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            View view2 = (View) aUListenerS254S0100000_4.l0;
            marginLayoutParams.setMargins(marginLayoutParams.getMarginStart(), marginLayoutParams.topMargin, marginLayoutParams.getMarginEnd(), ((Integer) valueAnimator.getAnimatedValue()).intValue());
            if (view2 != null) {
                C786410Ut5.W5(view2, marginLayoutParams);
            }
        }
    }

    public static final void onAnimationUpdate$10(AUListenerS254S0100000_4 aUListenerS254S0100000_4, ValueAnimator valueAnimator) {
        C786410Ut5.V4((ImageView) aUListenerS254S0100000_4.l0, ((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static final void onAnimationUpdate$11(AUListenerS254S0100000_4 aUListenerS254S0100000_4, ValueAnimator valueAnimator) {
        C786410Ut5.V4((ImageView) aUListenerS254S0100000_4.l0, ((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static final void onAnimationUpdate$12(AUListenerS254S0100000_4 aUListenerS254S0100000_4, ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        ViewGroup.LayoutParams layoutParams = ((C0DIT) aUListenerS254S0100000_4.l0).LLJ.getLayoutParams();
        layoutParams.height = iIntValue;
        C786410Ut5.g6(((C0DIT) aUListenerS254S0100000_4.l0).LLJ, layoutParams);
    }

    public static final void onAnimationUpdate$13(AUListenerS254S0100000_4 aUListenerS254S0100000_4, ValueAnimator valueAnimator) {
        C786410Ut5.hd((LinearLayout) aUListenerS254S0100000_4.l0, ((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static final void onAnimationUpdate$14(AUListenerS254S0100000_4 aUListenerS254S0100000_4, ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        if (iIntValue > 0) {
            ((View) aUListenerS254S0100000_4.l0).getLayoutParams().height = iIntValue;
            ((View) aUListenerS254S0100000_4.l0).requestLayout();
        }
    }

    public static final void onAnimationUpdate$15(AUListenerS254S0100000_4 aUListenerS254S0100000_4, ValueAnimator valueAnimator) {
        ViewGroup.LayoutParams layoutParams = ((C0DEX) aUListenerS254S0100000_4.l0).LIZ.getLayoutParams();
        layoutParams.height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        C786410Ut5.W5(((C0DEX) aUListenerS254S0100000_4.l0).LIZ, layoutParams);
    }

    public static final void onAnimationUpdate$16(AUListenerS254S0100000_4 aUListenerS254S0100000_4, ValueAnimator valueAnimator) {
        ((View) aUListenerS254S0100000_4.l0).getLayoutParams().height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        ((View) aUListenerS254S0100000_4.l0).requestLayout();
    }

    public static final void onAnimationUpdate$17(AUListenerS254S0100000_4 aUListenerS254S0100000_4, ValueAnimator valueAnimator) {
        ((View) aUListenerS254S0100000_4.l0).getLayoutParams().height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        ((View) aUListenerS254S0100000_4.l0).requestLayout();
    }

    public static final void onAnimationUpdate$18(AUListenerS254S0100000_4 aUListenerS254S0100000_4, ValueAnimator valueAnimator) {
        Integer num;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Integer) && (num = (Integer) animatedValue) != null) {
            int iIntValue = num.intValue();
            ViewGroup.LayoutParams layoutParams = ((View) aUListenerS254S0100000_4.l0).getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                marginLayoutParams.setMarginStart(iIntValue);
                C786410Ut5.W5((View) aUListenerS254S0100000_4.l0, marginLayoutParams);
            }
        }
    }

    public static final void onAnimationUpdate$19(AUListenerS254S0100000_4 aUListenerS254S0100000_4, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        C786410Ut5.ed((View) aUListenerS254S0100000_4.l0, (1.0f - fFloatValue) * r2.getHeight());
        C786410Ut5.T4((View) aUListenerS254S0100000_4.l0, fFloatValue);
    }

    public static final void onAnimationUpdate$2(AUListenerS254S0100000_4 aUListenerS254S0100000_4, ValueAnimator valueAnimator) {
        ((Function2) aUListenerS254S0100000_4.l0).invoke(null, valueAnimator.getAnimatedValue());
    }

    public static final void onAnimationUpdate$20(AUListenerS254S0100000_4 aUListenerS254S0100000_4, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        C424620Gku c424620Gku = (C424620Gku) aUListenerS254S0100000_4.l0;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c424620Gku);
        c424620Gku.setTranslationY(100 * fFloatValue);
        C424620Gku c424620Gku2 = (C424620Gku) aUListenerS254S0100000_4.l0;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c424620Gku2);
        c424620Gku2.setAlpha(1.0f - fFloatValue);
    }

    public static final void onAnimationUpdate$21(AUListenerS254S0100000_4 aUListenerS254S0100000_4, ValueAnimator valueAnimator) {
        C786410Ut5.S4(((Float) valueAnimator.getAnimatedValue()).floatValue(), (TextView) aUListenerS254S0100000_4.l0);
    }

    public static final void onAnimationUpdate$22(AUListenerS254S0100000_4 aUListenerS254S0100000_4, ValueAnimator valueAnimator) {
        C786410Ut5.T4((View) aUListenerS254S0100000_4.l0, ((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static final void onAnimationUpdate$23(AUListenerS254S0100000_4 aUListenerS254S0100000_4, ValueAnimator valueAnimator) {
        float fLIZIZ;
        Float f;
        GradientDrawable gradientDrawable = (GradientDrawable) ((Drawable) aUListenerS254S0100000_4.l0);
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            fLIZIZ = f.floatValue();
        } else {
            fLIZIZ = C497740JfY.LIZIZ(8.0f);
        }
        gradientDrawable.setGradientRadius(fLIZIZ);
    }

    public static final void onAnimationUpdate$3(AUListenerS254S0100000_4 aUListenerS254S0100000_4, ValueAnimator valueAnimator) {
        ((Function2) aUListenerS254S0100000_4.l0).invoke(null, valueAnimator.getAnimatedValue());
    }

    public static final void onAnimationUpdate$4(AUListenerS254S0100000_4 aUListenerS254S0100000_4, ValueAnimator valueAnimator) {
        LinearLayout.LayoutParams layoutParams;
        int iIntValue;
        Integer num;
        ViewGroup.LayoutParams layoutParams2 = ((LinearLayout) aUListenerS254S0100000_4.l0).getLayoutParams();
        if ((layoutParams2 instanceof LinearLayout.LayoutParams) && (layoutParams = (LinearLayout.LayoutParams) layoutParams2) != null) {
            LinearLayout linearLayout = (LinearLayout) aUListenerS254S0100000_4.l0;
            Object animatedValue = valueAnimator.getAnimatedValue();
            if ((animatedValue instanceof Integer) && (num = (Integer) animatedValue) != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            layoutParams.width = iIntValue;
            layoutParams.weight = 0.0f;
            C786410Ut5.d6(linearLayout, layoutParams);
        }
    }

    public static final void onAnimationUpdate$5(AUListenerS254S0100000_4 aUListenerS254S0100000_4, ValueAnimator valueAnimator) {
        C786410Ut5.ed((View) aUListenerS254S0100000_4.l0, ((Float) valueAnimator.getAnimatedValue()).floatValue() * ((View) aUListenerS254S0100000_4.l0).getHeight());
    }

    public static final void onAnimationUpdate$6(AUListenerS254S0100000_4 aUListenerS254S0100000_4, ValueAnimator valueAnimator) {
        C786410Ut5.T4((View) aUListenerS254S0100000_4.l0, ((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static final void onAnimationUpdate$7(AUListenerS254S0100000_4 aUListenerS254S0100000_4, ValueAnimator valueAnimator) {
        C786410Ut5.T4((View) aUListenerS254S0100000_4.l0, ((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static final void onAnimationUpdate$8(AUListenerS254S0100000_4 aUListenerS254S0100000_4, ValueAnimator valueAnimator) {
        Object animatedValue = valueAnimator.getAnimatedValue();
        if (animatedValue != null) {
            C786410Ut5.T4(((LynxUI) aUListenerS254S0100000_4.l0).mView, ((Float) animatedValue).floatValue());
        }
    }

    public static final void onAnimationUpdate$9(AUListenerS254S0100000_4 aUListenerS254S0100000_4, ValueAnimator valueAnimator) {
        C786410Ut5.T4((View) aUListenerS254S0100000_4.l0, ((Integer) valueAnimator.getAnimatedValue()).intValue() / 100);
    }
}
