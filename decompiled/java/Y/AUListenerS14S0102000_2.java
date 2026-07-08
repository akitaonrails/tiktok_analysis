package Y;

import X.C197039127h;
import X.C786410Ut5;
import android.animation.ValueAnimator;
import android.view.ViewGroup;
import com.bytedance.tux.icon.TuxIconView;

/* JADX INFO: loaded from: classes3.dex */
public class AUListenerS14S0102000_2 implements ValueAnimator.AnimatorUpdateListener {
    public final int $t;
    public int i1;
    public int i2;
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

    public static final void onAnimationUpdate$0(AUListenerS14S0102000_2 aUListenerS14S0102000_2, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        ViewGroup.LayoutParams layoutParams = ((TuxIconView) aUListenerS14S0102000_2.l0).getLayoutParams();
        layoutParams.width = (int) (aUListenerS14S0102000_2.i1 * fFloatValue);
        layoutParams.height = (int) (aUListenerS14S0102000_2.i2 * fFloatValue);
        C786410Ut5.M6((TuxIconView) aUListenerS14S0102000_2.l0, layoutParams);
    }

    public static final void onAnimationUpdate$1(AUListenerS14S0102000_2 aUListenerS14S0102000_2, ValueAnimator valueAnimator) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        ViewGroup.LayoutParams layoutParams = ((C197039127h) aUListenerS14S0102000_2.l0).getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            int i = (int) (aUListenerS14S0102000_2.i1 * fFloatValue);
            int i2 = 0;
            if (i < 0) {
                i = 0;
            }
            marginLayoutParams.width = i;
            int i3 = (int) (aUListenerS14S0102000_2.i2 * fFloatValue);
            if (i3 >= 0) {
                i2 = i3;
            }
            marginLayoutParams.setMarginStart(i2);
            C786410Ut5.J6((C197039127h) aUListenerS14S0102000_2.l0, marginLayoutParams);
        }
    }

    public AUListenerS14S0102000_2(Object obj, int i, int i2, int i3) {
        this.$t = i3;
        this.l0 = obj;
        this.i1 = i;
        this.i2 = i2;
    }
}
