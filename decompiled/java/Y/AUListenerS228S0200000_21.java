package Y;

import X.C1384030m7V;
import X.C786410Ut5;
import android.animation.ValueAnimator;
import android.view.View;
import com.bytedance.tux.icon.TuxIconView;

/* JADX INFO: loaded from: classes22.dex */
public class AUListenerS228S0200000_21 implements ValueAnimator.AnimatorUpdateListener {
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
        }
    }

    public static final void onAnimationUpdate$0(AUListenerS228S0200000_21 aUListenerS228S0200000_21, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        C786410Ut5.hc((TuxIconView) aUListenerS228S0200000_21.l0, fFloatValue);
        C786410Ut5.Cc((TuxIconView) aUListenerS228S0200000_21.l0, fFloatValue);
        ((C1384030m7V) aUListenerS228S0200000_21.l1).invalidate();
    }

    public static final void onAnimationUpdate$1(AUListenerS228S0200000_21 aUListenerS228S0200000_21, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        C786410Ut5.hc((TuxIconView) aUListenerS228S0200000_21.l0, fFloatValue);
        C786410Ut5.Cc((TuxIconView) aUListenerS228S0200000_21.l0, fFloatValue);
        ((C1384030m7V) aUListenerS228S0200000_21.l1).invalidate();
    }

    public static final void onAnimationUpdate$2(AUListenerS228S0200000_21 aUListenerS228S0200000_21, ValueAnimator valueAnimator) {
        Float f;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            C786410Ut5.T4((View) aUListenerS228S0200000_21.l1, f.floatValue());
        }
        ((ValueAnimator) aUListenerS228S0200000_21.l0).addListener(new AAListenerS332S0100000_21((View) aUListenerS228S0200000_21.l1, 69));
        ((ValueAnimator) aUListenerS228S0200000_21.l0).addListener(new AAListenerS332S0100000_21((View) aUListenerS228S0200000_21.l1, 68));
        ((ValueAnimator) aUListenerS228S0200000_21.l0).addListener(new AAListenerS332S0100000_21((View) aUListenerS228S0200000_21.l1, 67));
    }

    public AUListenerS228S0200000_21(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
