package Y;

import X.C1322110kVd;
import X.C786410Ut5;
import android.animation.ValueAnimator;
import android.view.View;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public class AUListenerS0S0300002_5 implements ValueAnimator.AnimatorUpdateListener {
    public final int $t;
    public float f3;
    public float f4;
    public Object l0;
    public Object l1;
    public Object l2;

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

    public static final void onAnimationUpdate$0(AUListenerS0S0300002_5 aUListenerS0S0300002_5, ValueAnimator valueAnimator) {
        Float f;
        Object animatedValue = ((ValueAnimator) aUListenerS0S0300002_5.l0).getAnimatedValue();
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            float f2 = aUListenerS0S0300002_5.f3;
            float f3 = aUListenerS0S0300002_5.f4;
            View view = (View) aUListenerS0S0300002_5.l1;
            Function1 function1 = (Function1) aUListenerS0S0300002_5.l2;
            float fFloatValue = f.floatValue();
            float fAbs = (Math.abs(f2 - f3) * fFloatValue) + f2;
            C786410Ut5.Ob(view, fAbs);
            C786410Ut5.pc(view, fAbs);
            if (function1 != null) {
                function1.invoke(Float.valueOf(fFloatValue));
            }
        }
    }

    public static final void onAnimationUpdate$1(AUListenerS0S0300002_5 aUListenerS0S0300002_5, ValueAnimator valueAnimator) {
        Float f;
        Object animatedValue = ((ValueAnimator) aUListenerS0S0300002_5.l0).getAnimatedValue();
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            float f2 = aUListenerS0S0300002_5.f3;
            float f3 = aUListenerS0S0300002_5.f4;
            View view = (View) aUListenerS0S0300002_5.l1;
            Function1 function1 = (Function1) aUListenerS0S0300002_5.l2;
            float fFloatValue = f.floatValue();
            float fAbs = (Math.abs(f2 - f3) * fFloatValue) + f3;
            C786410Ut5.Ob(view, fAbs);
            C786410Ut5.pc(view, fAbs);
            if (function1 != null) {
                function1.invoke(Float.valueOf(fFloatValue));
            }
        }
    }

    public AUListenerS0S0300002_5(ValueAnimator valueAnimator, float f, float f2, C1322110kVd c1322110kVd, Function1 function1, int i) {
        this.$t = i;
        this.l0 = valueAnimator;
        this.f3 = f;
        this.f4 = f2;
        this.l1 = c1322110kVd;
        this.l2 = function1;
    }
}
