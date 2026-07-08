package Y;

import X.AnonymousClass1964;
import X.C196E;
import X.C786410Ut5;
import android.animation.ValueAnimator;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes33.dex */
public class AUListenerS3S0100002_32 implements ValueAnimator.AnimatorUpdateListener {
    public final int $t;
    public float f1;
    public float f2;
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

    public static final void onAnimationUpdate$0(AUListenerS3S0100002_32 aUListenerS3S0100002_32, ValueAnimator valueAnimator) {
        Float f;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            AnonymousClass1964 anonymousClass1964 = (AnonymousClass1964) aUListenerS3S0100002_32.l0;
            float f2 = aUListenerS3S0100002_32.f1;
            float f3 = aUListenerS3S0100002_32.f2;
            f.floatValue();
            View viewLIZIZ = anonymousClass1964.LIZIZ();
            if (viewLIZIZ != null) {
                C786410Ut5.T4(viewLIZIZ, f2 * f.floatValue());
            }
            ConstraintLayout constraintLayout = anonymousClass1964.LLJILJIL;
            if (constraintLayout != null) {
                C786410Ut5.c5(constraintLayout, f3 * f.floatValue());
            }
        }
    }

    public static final void onAnimationUpdate$1(AUListenerS3S0100002_32 aUListenerS3S0100002_32, ValueAnimator valueAnimator) {
        Float f;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            C196E c196e = (C196E) aUListenerS3S0100002_32.l0;
            float f2 = aUListenerS3S0100002_32.f1;
            float f3 = aUListenerS3S0100002_32.f2;
            f.floatValue();
            C786410Ut5.T4(c196e.LIZIZ(), f2 * f.floatValue());
            ConstraintLayout constraintLayout = c196e.LLIZ;
            if (constraintLayout != null) {
                C786410Ut5.c5(constraintLayout, f3 * f.floatValue());
            }
        }
    }

    public AUListenerS3S0100002_32(Object obj, float f, float f2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.f1 = f;
        this.f2 = f2;
    }
}
