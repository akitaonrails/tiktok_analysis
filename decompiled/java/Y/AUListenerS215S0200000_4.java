package Y;

import X.C118300cf;
import X.C238400w2;
import X.C337760DLy;
import X.C786410Ut5;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tux.icon.TuxIconView;

/* JADX INFO: loaded from: classes5.dex */
public class AUListenerS215S0200000_4 implements ValueAnimator.AnimatorUpdateListener {
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
        }
    }

    public static final void onAnimationUpdate$0(AUListenerS215S0200000_4 aUListenerS215S0200000_4, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        C786410Ut5.hc((TuxIconView) aUListenerS215S0200000_4.l0, fFloatValue);
        C786410Ut5.Cc((TuxIconView) aUListenerS215S0200000_4.l0, fFloatValue);
        ((C337760DLy) aUListenerS215S0200000_4.l1).invalidate();
    }

    public static final void onAnimationUpdate$1(AUListenerS215S0200000_4 aUListenerS215S0200000_4, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        C786410Ut5.hc((TuxIconView) aUListenerS215S0200000_4.l0, fFloatValue);
        C786410Ut5.Cc((TuxIconView) aUListenerS215S0200000_4.l0, fFloatValue);
        ((C337760DLy) aUListenerS215S0200000_4.l1).invalidate();
    }

    public static final void onAnimationUpdate$2(AUListenerS215S0200000_4 aUListenerS215S0200000_4, ValueAnimator valueAnimator) {
        int[] iArr = (int[]) valueAnimator.getAnimatedValue();
        ViewGroup.LayoutParams layoutParams = (ViewGroup.LayoutParams) aUListenerS215S0200000_4.l0;
        layoutParams.width = iArr[0];
        layoutParams.height = iArr[1];
        C786410Ut5.W5((View) aUListenerS215S0200000_4.l1, (ViewGroup.LayoutParams) aUListenerS215S0200000_4.l0);
    }

    public static final void onAnimationUpdate$3(AUListenerS215S0200000_4 aUListenerS215S0200000_4, ValueAnimator valueAnimator) {
        Integer num;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Integer) && (num = (Integer) animatedValue) != null) {
            int iIntValue = num.intValue();
            View view = (View) aUListenerS215S0200000_4.l0;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) aUListenerS215S0200000_4.l1;
            marginLayoutParams.setMarginStart(iIntValue);
            C786410Ut5.W5(view, marginLayoutParams);
            ((View) aUListenerS215S0200000_4.l0).requestLayout();
        }
    }

    public static final void onAnimationUpdate$4(AUListenerS215S0200000_4 aUListenerS215S0200000_4, ValueAnimator valueAnimator) {
        if (valueAnimator.getAnimatedFraction() <= 0.0f) {
            ((C238400w2) aUListenerS215S0200000_4.l0).element = System.nanoTime();
            ((C118300cf) aUListenerS215S0200000_4.l1).element = 1;
        } else {
            ((C118300cf) aUListenerS215S0200000_4.l1).element++;
        }
    }

    public AUListenerS215S0200000_4(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
