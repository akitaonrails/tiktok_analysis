package Y;

import X.C786410Ut5;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.abmock.SettingsManager;

/* JADX INFO: loaded from: classes5.dex */
public class AUListenerS65S0101000_4 implements ValueAnimator.AnimatorUpdateListener {
    public final int $t;
    public int i1;
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

    public static final void onAnimationUpdate$0(AUListenerS65S0101000_4 aUListenerS65S0101000_4, ValueAnimator valueAnimator) {
        Integer num;
        float animatedFraction;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Integer) && (num = (Integer) animatedValue) != null) {
            int iIntValue = num.intValue();
            View view = (View) aUListenerS65S0101000_4.l0;
            int i = aUListenerS65S0101000_4.i1;
            view.getLayoutParams().height = iIntValue;
            SettingsManager.LIZLLL().getClass();
            if (SettingsManager.LIZ("im_action_bar_animation_flash_fix_setting", true)) {
                animatedFraction = iIntValue / i;
            } else {
                animatedFraction = valueAnimator.getAnimatedFraction();
            }
            C786410Ut5.T4(view, animatedFraction);
            view.requestLayout();
        }
    }

    public static final void onAnimationUpdate$1(AUListenerS65S0101000_4 aUListenerS65S0101000_4, ValueAnimator valueAnimator) {
        Integer num;
        float animatedFraction;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Integer) && (num = (Integer) animatedValue) != null) {
            int iIntValue = num.intValue();
            ViewGroup.LayoutParams layoutParams = ((View) aUListenerS65S0101000_4.l0).getLayoutParams();
            layoutParams.height = iIntValue;
            C786410Ut5.W5((View) aUListenerS65S0101000_4.l0, layoutParams);
            View view = (View) aUListenerS65S0101000_4.l0;
            SettingsManager.LIZLLL().getClass();
            if (SettingsManager.LIZ("im_action_bar_animation_flash_fix_setting", true)) {
                animatedFraction = iIntValue / aUListenerS65S0101000_4.i1;
            } else {
                animatedFraction = 1.0f - valueAnimator.getAnimatedFraction();
            }
            C786410Ut5.T4(view, animatedFraction);
        }
    }

    public AUListenerS65S0101000_4(int i, ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv, int i2) {
        this.$t = i2;
        this.l0 = viewOnAttachStateChangeListenerC20604515jv;
        this.i1 = i;
    }
}
