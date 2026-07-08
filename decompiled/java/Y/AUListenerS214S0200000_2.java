package Y;

import X.AbstractC212214182y;
import X.C06VM;
import X.C1295960jpS;
import X.C497820Jfg;
import X.C786410Ut5;
import X.C817403Hg;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.quickinteraction.fragment.BaseQuickChatRoomFragment;
import com.tts.oecverify.BdTuring;

/* JADX INFO: loaded from: classes3.dex */
public class AUListenerS214S0200000_2 implements ValueAnimator.AnimatorUpdateListener {
    public final int $t;
    public Object l0;
    public Object l1;

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
        }
    }

    public static final void onAnimationUpdate$0(AUListenerS214S0200000_2 aUListenerS214S0200000_2, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        C786410Ut5.hc((TuxIconView) aUListenerS214S0200000_2.l0, fFloatValue);
        C786410Ut5.Cc((TuxIconView) aUListenerS214S0200000_2.l0, fFloatValue);
        ((C06VM) aUListenerS214S0200000_2.l1).invalidate();
    }

    public static final void onAnimationUpdate$1(AUListenerS214S0200000_2 aUListenerS214S0200000_2, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        C786410Ut5.hc((TuxIconView) aUListenerS214S0200000_2.l0, fFloatValue);
        C786410Ut5.Cc((TuxIconView) aUListenerS214S0200000_2.l0, fFloatValue);
        ((C06VM) aUListenerS214S0200000_2.l1).invalidate();
    }

    public static final void onAnimationUpdate$2(AUListenerS214S0200000_2 aUListenerS214S0200000_2, ValueAnimator valueAnimator) {
        int iLIZJ;
        View view = (View) aUListenerS214S0200000_2.l0;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            C786410Ut5.W5(view, layoutParams);
            View view2 = (View) aUListenerS214S0200000_2.l0;
            BaseQuickChatRoomFragment baseQuickChatRoomFragment = (BaseQuickChatRoomFragment) aUListenerS214S0200000_2.l1;
            if (((Number) baseQuickChatRoomFragment.LLJJIII.getValue()).intValue() > 0) {
                iLIZJ = ((Number) baseQuickChatRoomFragment.LLJJIII.getValue()).intValue();
            } else {
                iLIZJ = C497820Jfg.LIZJ(baseQuickChatRoomFragment.requireContext());
            }
            view2.setPadding(view2.getPaddingLeft(), (int) (iLIZJ * valueAnimator.getAnimatedFraction()), view2.getPaddingRight(), view2.getPaddingBottom());
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    public static final void onAnimationUpdate$3(AUListenerS214S0200000_2 aUListenerS214S0200000_2, ValueAnimator valueAnimator) {
        int iIntValue;
        Integer num;
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) aUListenerS214S0200000_2.l0;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Integer) && (num = (Integer) animatedValue) != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        layoutParams.setMarginEnd(iIntValue);
        C786410Ut5.R6((TuxTextView) aUListenerS214S0200000_2.l1, (LinearLayout.LayoutParams) aUListenerS214S0200000_2.l0);
    }

    public static final void onAnimationUpdate$4(AUListenerS214S0200000_2 aUListenerS214S0200000_2, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        AbstractC212214182y abstractC212214182y = (AbstractC212214182y) aUListenerS214S0200000_2.l0;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(abstractC212214182y);
        abstractC212214182y.setAlpha(fFloatValue);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) aUListenerS214S0200000_2.l1;
        layoutParams.bottomMargin = (int) (layoutParams.height * (fFloatValue - 1));
        AbstractC212214182y abstractC212214182y2 = (AbstractC212214182y) aUListenerS214S0200000_2.l0;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(abstractC212214182y2);
        abstractC212214182y2.setLayoutParams(layoutParams);
    }

    public static final void onAnimationUpdate$5(AUListenerS214S0200000_2 aUListenerS214S0200000_2, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        AbstractC212214182y abstractC212214182y = (AbstractC212214182y) aUListenerS214S0200000_2.l0;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(abstractC212214182y);
        abstractC212214182y.setAlpha(fFloatValue);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) aUListenerS214S0200000_2.l1;
        layoutParams.bottomMargin = (int) (layoutParams.height * (fFloatValue - 1));
        AbstractC212214182y abstractC212214182y2 = (AbstractC212214182y) aUListenerS214S0200000_2.l0;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(abstractC212214182y2);
        abstractC212214182y2.setLayoutParams(layoutParams);
    }

    public static final void onAnimationUpdate$6(AUListenerS214S0200000_2 aUListenerS214S0200000_2, ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) aUListenerS214S0200000_2.l0;
        if (layoutParams != null) {
            layoutParams.topMargin = iIntValue;
        }
        FrameLayout frameLayout = (FrameLayout) aUListenerS214S0200000_2.l1;
        if (frameLayout != null) {
            C786410Ut5.a6(frameLayout, (FrameLayout.LayoutParams) aUListenerS214S0200000_2.l0);
        }
    }

    public static final void onAnimationUpdate$7(AUListenerS214S0200000_2 aUListenerS214S0200000_2, ValueAnimator valueAnimator) {
        Integer num;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Integer) && (num = (Integer) animatedValue) != null) {
            int iIntValue = num.intValue();
            View view = (View) aUListenerS214S0200000_2.l0;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) aUListenerS214S0200000_2.l1;
            marginLayoutParams.topMargin = iIntValue;
            C786410Ut5.W5(view, marginLayoutParams);
            ((View) aUListenerS214S0200000_2.l0).requestLayout();
        }
    }

    public static final void onAnimationUpdate$8(AUListenerS214S0200000_2 aUListenerS214S0200000_2, ValueAnimator valueAnimator) {
        Float f;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            float fFloatValue = f.floatValue();
            if (fFloatValue < 2750.0f) {
                ((C1295960jpS) aUListenerS214S0200000_2.l0).setProgress(fFloatValue / 5500.0f);
                return;
            }
            if (fFloatValue >= 2750.0f && fFloatValue <= ((C817403Hg) aUListenerS214S0200000_2.l1).element + 2750.0f) {
                ((C1295960jpS) aUListenerS214S0200000_2.l0).setProgress(0.5f);
                return;
            }
            float f2 = (fFloatValue - 2750.0f) / 5500.0f;
            C1295960jpS c1295960jpS = (C1295960jpS) aUListenerS214S0200000_2.l0;
            if (f2 > 1.0f) {
                f2 = 1.0f;
            }
            c1295960jpS.setProgress(f2);
        }
    }

    public static final void onAnimationUpdate$9(AUListenerS214S0200000_2 aUListenerS214S0200000_2, ValueAnimator valueAnimator) {
        int iIntValue;
        Integer num;
        ViewGroup.LayoutParams layoutParams = (ViewGroup.LayoutParams) aUListenerS214S0200000_2.l0;
        if (layoutParams != null) {
            Object animatedValue = valueAnimator.getAnimatedValue();
            if ((animatedValue instanceof Integer) && (num = (Integer) animatedValue) != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            layoutParams.height = iIntValue;
        }
        ViewGroup viewGroup = (ViewGroup) aUListenerS214S0200000_2.l1;
        if (viewGroup != null) {
            C786410Ut5.X5((ViewGroup.LayoutParams) aUListenerS214S0200000_2.l0, viewGroup);
        }
    }

    public AUListenerS214S0200000_2(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
