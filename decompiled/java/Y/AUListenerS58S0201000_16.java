package Y;

import X.C118300cf;
import X.C18NR;
import X.C18NS;
import X.C786410Ut5;
import X.C814420VxA;
import X.C990390bsb;
import X.C990470bsj;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;

/* JADX INFO: loaded from: classes17.dex */
public class AUListenerS58S0201000_16 implements ValueAnimator.AnimatorUpdateListener {
    public final int $t;
    public int i2;
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
        }
    }

    public static final void onAnimationUpdate$0(AUListenerS58S0201000_16 aUListenerS58S0201000_16, ValueAnimator valueAnimator) {
        View underView;
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        C990390bsb c990390bsb = (C990390bsb) aUListenerS58S0201000_16.l0;
        float f = 0.0f;
        if (0.0f <= fFloatValue && fFloatValue <= 200.0f) {
            f = 1.0f - (fFloatValue / 200.0f);
        }
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c990390bsb);
        c990390bsb.setAlpha(f);
        if (100.0f <= fFloatValue && fFloatValue <= 300.0f && (underView = ((C990390bsb) aUListenerS58S0201000_16.l0).getUnderView()) != null) {
            C990390bsb c990390bsb2 = (C990390bsb) aUListenerS58S0201000_16.l0;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) aUListenerS58S0201000_16.l1;
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) underView.getLayoutParams();
            marginLayoutParams2.topMargin = aUListenerS58S0201000_16.i2 - ((int) (((fFloatValue - 100.0f) / 200.0f) * ((c990390bsb2.getHeight() + marginLayoutParams.topMargin) + marginLayoutParams.bottomMargin)));
            C786410Ut5.W5(underView, marginLayoutParams2);
        }
    }

    public static final void onAnimationUpdate$1(AUListenerS58S0201000_16 aUListenerS58S0201000_16, ValueAnimator valueAnimator) {
        View underView;
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        C990470bsj c990470bsj = (C990470bsj) aUListenerS58S0201000_16.l0;
        float f = 0.0f;
        if (0.0f <= fFloatValue && fFloatValue <= 200.0f) {
            f = 1.0f - (fFloatValue / 200.0f);
        }
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c990470bsj);
        c990470bsj.setAlpha(f);
        if (100.0f <= fFloatValue && fFloatValue <= 300.0f && (underView = ((C990470bsj) aUListenerS58S0201000_16.l0).getUnderView()) != null) {
            C990470bsj c990470bsj2 = (C990470bsj) aUListenerS58S0201000_16.l0;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) aUListenerS58S0201000_16.l1;
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) underView.getLayoutParams();
            marginLayoutParams2.topMargin = aUListenerS58S0201000_16.i2 - ((int) (((fFloatValue - 100.0f) / 200.0f) * ((c990470bsj2.getHeight() + marginLayoutParams.topMargin) + marginLayoutParams.bottomMargin)));
            C786410Ut5.W5(underView, marginLayoutParams2);
        }
    }

    public static final void onAnimationUpdate$2(AUListenerS58S0201000_16 aUListenerS58S0201000_16, ValueAnimator valueAnimator) {
        float fFloatValue;
        Float f;
        ViewGroup.LayoutParams layoutParams = ((C18NS) aUListenerS58S0201000_16.l0).getAnchorPromotionFlowFromXml().getLayoutParams();
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            fFloatValue = f.floatValue();
        } else {
            fFloatValue = 0.0f;
        }
        layoutParams.height = C814420VxA.LIZIZ(aUListenerS58S0201000_16.i2 * fFloatValue);
        if (((C18NS) aUListenerS58S0201000_16.l0).getAnchorDescFromXml().getMeasuredWidth() < ((C118300cf) aUListenerS58S0201000_16.l1).element) {
            layoutParams.width = (int) Math.ceil(((C18NS) aUListenerS58S0201000_16.l0).getAnchorDescFromXml().getMeasuredWidth() + (fFloatValue * (((C118300cf) aUListenerS58S0201000_16.l1).element - ((C18NS) aUListenerS58S0201000_16.l0).getAnchorDescFromXml().getMeasuredWidth())));
        }
        C786410Ut5.m6(((C18NS) aUListenerS58S0201000_16.l0).getAnchorPromotionFlowFromXml(), layoutParams);
    }

    public static final void onAnimationUpdate$3(AUListenerS58S0201000_16 aUListenerS58S0201000_16, ValueAnimator valueAnimator) {
        ViewGroup.LayoutParams layoutParams = ((C18NR) aUListenerS58S0201000_16.l0).getAnchorPromotionFlowFromXml().getLayoutParams();
        layoutParams.height = C814420VxA.LIZIZ(CastFloatProtector.parseFloat(valueAnimator.getAnimatedValue().toString()) * aUListenerS58S0201000_16.i2);
        if (((C18NR) aUListenerS58S0201000_16.l0).getAnchorDescFromXml().getMeasuredWidth() < ((C118300cf) aUListenerS58S0201000_16.l1).element) {
            layoutParams.width = (int) Math.ceil(((C18NR) aUListenerS58S0201000_16.l0).getAnchorDescFromXml().getMeasuredWidth() + (CastFloatProtector.parseFloat(valueAnimator.getAnimatedValue().toString()) * (((C118300cf) aUListenerS58S0201000_16.l1).element - ((C18NR) aUListenerS58S0201000_16.l0).getAnchorDescFromXml().getMeasuredWidth())));
        }
        C786410Ut5.m6(((C18NR) aUListenerS58S0201000_16.l0).getAnchorPromotionFlowFromXml(), layoutParams);
    }

    public AUListenerS58S0201000_16(Object obj, Object obj2, int i, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.l1 = obj2;
        this.i2 = i;
    }
}
