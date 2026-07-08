package Y;

import android.animation.ValueAnimator;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;

/* JADX INFO: loaded from: classes18.dex */
public class AUListenerS14S0100001_17 implements ValueAnimator.AnimatorUpdateListener {
    public final int $t;
    public float f1;
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

    public static final void onAnimationUpdate$0(AUListenerS14S0100001_17 aUListenerS14S0100001_17, ValueAnimator valueAnimator) {
        ConstraintProperty constraintProperty = (ConstraintProperty) aUListenerS14S0100001_17.l0;
        constraintProperty.margin(4, ((Integer) valueAnimator.getAnimatedValue()).intValue());
        constraintProperty.apply();
        ((ConstraintProperty) aUListenerS14S0100001_17.l0).alpha((1.0f - valueAnimator.getAnimatedFraction()) * aUListenerS14S0100001_17.f1);
    }

    public static final void onAnimationUpdate$1(AUListenerS14S0100001_17 aUListenerS14S0100001_17, ValueAnimator valueAnimator) {
        ConstraintProperty constraintProperty = (ConstraintProperty) aUListenerS14S0100001_17.l0;
        constraintProperty.margin(4, ((Integer) valueAnimator.getAnimatedValue()).intValue());
        constraintProperty.apply();
        ((ConstraintProperty) aUListenerS14S0100001_17.l0).alpha((1.0f - valueAnimator.getAnimatedFraction()) * aUListenerS14S0100001_17.f1);
    }

    public AUListenerS14S0100001_17(ConstraintProperty constraintProperty, float f, int i) {
        this.$t = i;
        this.l0 = constraintProperty;
        this.f1 = f;
    }
}
