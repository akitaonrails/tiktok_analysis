package Y;

import X.C1135940ffM;
import X.C786410Ut5;
import X.C937610aVT;
import X.C961510b81;
import X.C962470b9Z;
import X.C962490b9b;
import X.RunnableC781530UlD;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import android.animation.ValueAnimator;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.liveinteract.multihost.biz.link.fragment.MultiHostInviteListFragmentV2;
import com.tts.oecverify.BdTuring;

/* JADX INFO: loaded from: classes16.dex */
public class AUListenerS222S0200000_15 implements ValueAnimator.AnimatorUpdateListener {
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

    public static final void onAnimationUpdate$0(AUListenerS222S0200000_15 aUListenerS222S0200000_15, ValueAnimator valueAnimator) {
        float fFloatValue;
        Float f;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            fFloatValue = f.floatValue();
        } else {
            fFloatValue = 0.0f;
        }
        ((C937610aVT) aUListenerS222S0200000_15.l0).LIZ = fFloatValue / 10.0f;
        ((ImageView) aUListenerS222S0200000_15.l1).invalidateOutline();
    }

    public static final void onAnimationUpdate$1(AUListenerS222S0200000_15 aUListenerS222S0200000_15, ValueAnimator valueAnimator) {
        int iIntValue;
        Integer num;
        ViewGroup.LayoutParams layoutParams = (ViewGroup.LayoutParams) aUListenerS222S0200000_15.l0;
        if (layoutParams != null) {
            Object animatedValue = valueAnimator.getAnimatedValue();
            if ((animatedValue instanceof Integer) && (num = (Integer) animatedValue) != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            layoutParams.height = iIntValue;
        }
        ViewGroup viewGroup = (ViewGroup) aUListenerS222S0200000_15.l1;
        if (viewGroup != null) {
            C786410Ut5.X5((ViewGroup.LayoutParams) aUListenerS222S0200000_15.l0, viewGroup);
        }
    }

    public static final void onAnimationUpdate$2(AUListenerS222S0200000_15 aUListenerS222S0200000_15, ValueAnimator valueAnimator) {
        ((C961510b81) ((MultiHostInviteListFragmentV2) aUListenerS222S0200000_15.l0).LLLFZ.getValue()).LL = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
        ((RunnableC781530UlD) aUListenerS222S0200000_15.l1).invalidateItemDecorations();
    }

    public static final void onAnimationUpdate$3(AUListenerS222S0200000_15 aUListenerS222S0200000_15, ValueAnimator valueAnimator) {
        ((C961510b81) ((MultiHostInviteListFragmentV2) aUListenerS222S0200000_15.l0).LLLFZ.getValue()).LL = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
        ((RunnableC781530UlD) aUListenerS222S0200000_15.l1).invalidateItemDecorations();
    }

    public static final void onAnimationUpdate$4(AUListenerS222S0200000_15 aUListenerS222S0200000_15, ValueAnimator valueAnimator) {
        ((C961510b81) ((MultiHostInviteListFragmentV2) aUListenerS222S0200000_15.l0).LLLFZ.getValue()).LL = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
        ((RunnableC781530UlD) aUListenerS222S0200000_15.l1).invalidateItemDecorations();
    }

    public static final void onAnimationUpdate$5(AUListenerS222S0200000_15 aUListenerS222S0200000_15, ValueAnimator valueAnimator) {
        C962470b9Z c962470b9Z = ((C962490b9b) aUListenerS222S0200000_15.l0).LLIZ;
        if (c962470b9Z != null) {
            float fFloatValue = ((Float) ((ValueAnimator) aUListenerS222S0200000_15.l1).getAnimatedValue()).floatValue();
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c962470b9Z);
            c962470b9Z.setTranslationY(fFloatValue);
        }
    }

    public static final void onAnimationUpdate$6(AUListenerS222S0200000_15 aUListenerS222S0200000_15, ValueAnimator valueAnimator) {
        C962470b9Z c962470b9Z = ((C962490b9b) aUListenerS222S0200000_15.l0).LLIZ;
        if (c962470b9Z != null) {
            float fFloatValue = ((Float) ((ValueAnimator) aUListenerS222S0200000_15.l1).getAnimatedValue()).floatValue();
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c962470b9Z);
            c962470b9Z.setTranslationY(fFloatValue);
        }
    }

    public static final void onAnimationUpdate$7(AUListenerS222S0200000_15 aUListenerS222S0200000_15, ValueAnimator valueAnimator) {
        ((TextView) aUListenerS222S0200000_15.l0).setTextColor(((Integer) ((ValueAnimator) aUListenerS222S0200000_15.l1).getAnimatedValue()).intValue());
    }

    public static final void onAnimationUpdate$8(AUListenerS222S0200000_15 aUListenerS222S0200000_15, ValueAnimator valueAnimator) {
        ((TextView) aUListenerS222S0200000_15.l0).setTextColor(((Integer) ((ValueAnimator) aUListenerS222S0200000_15.l1).getAnimatedValue()).intValue());
    }

    public static final void onAnimationUpdate$9(AUListenerS222S0200000_15 aUListenerS222S0200000_15, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) ((ValueAnimator) aUListenerS222S0200000_15.l0).getAnimatedValue()).floatValue();
        ViewGroup viewGroup = ((C1135940ffM) aUListenerS222S0200000_15.l1).LJII;
        if (viewGroup != null) {
            C786410Ut5.R4(fFloatValue, viewGroup);
        }
    }

    public AUListenerS222S0200000_15(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
