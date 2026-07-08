package Y;

import X.C1052130dUB;
import X.C814420VxA;
import android.animation.ValueAnimator;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.ViewGroup;
import com.bytedance.tux.input.TuxTextView;

/* JADX INFO: loaded from: classes7.dex */
public class AUListenerS2S0103000_6 implements ValueAnimator.AnimatorUpdateListener {
    public final int $t;
    public int i1;
    public int i2;
    public int i3;
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
        }
    }

    public static final void onAnimationUpdate$0(AUListenerS2S0103000_6 aUListenerS2S0103000_6, ValueAnimator valueAnimator) {
        Float f;
        ViewGroup.LayoutParams layoutParams;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            float fFloatValue = f.floatValue();
            TuxTextView tuxTextView = ((C1052130dUB) aUListenerS2S0103000_6.l0).LLILZIL;
            if (tuxTextView != null && (layoutParams = tuxTextView.getLayoutParams()) != null) {
                int i = aUListenerS2S0103000_6.i1;
                int i2 = aUListenerS2S0103000_6.i2;
                if (i > i2) {
                    layoutParams.width = i2 + C814420VxA.LIZIZ((i - i2) * fFloatValue);
                }
                layoutParams.height = C814420VxA.LIZIZ(aUListenerS2S0103000_6.i3 * fFloatValue);
                TuxTextView tuxTextView2 = ((C1052130dUB) aUListenerS2S0103000_6.l0).LLILZIL;
                if (tuxTextView2 != null) {
                    tuxTextView2.requestLayout();
                }
            }
        }
    }

    public static final void onAnimationUpdate$1(AUListenerS2S0103000_6 aUListenerS2S0103000_6, ValueAnimator valueAnimator) {
        ((GradientDrawable) aUListenerS2S0103000_6.l0).setColor(Color.argb((int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255), aUListenerS2S0103000_6.i1, aUListenerS2S0103000_6.i2, aUListenerS2S0103000_6.i3));
    }

    public AUListenerS2S0103000_6(Object obj, int i, int i2, int i3, int i4) {
        this.$t = i4;
        this.l0 = obj;
        this.i1 = i;
        this.i2 = i2;
        this.i3 = i3;
    }
}
