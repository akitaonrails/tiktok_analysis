package Y;

import android.animation.ValueAnimator;

/* JADX INFO: loaded from: classes7.dex */
public class AUListenerS176S0000000_6 implements ValueAnimator.AnimatorUpdateListener {
    public final int $t;

    public static final void onAnimationUpdate$0(AUListenerS176S0000000_6 aUListenerS176S0000000_6, ValueAnimator valueAnimator) {
    }

    public static final void onAnimationUpdate$1(AUListenerS176S0000000_6 aUListenerS176S0000000_6, ValueAnimator valueAnimator) {
    }

    public static final void onAnimationUpdate$2(AUListenerS176S0000000_6 aUListenerS176S0000000_6, ValueAnimator valueAnimator) {
    }

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

    public AUListenerS176S0000000_6(int i) {
        this.$t = i;
    }
}
