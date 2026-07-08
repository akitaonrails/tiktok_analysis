package Y;

import X.C1591700rWS;
import X.C1592450rXf;
import X.C1604590rrF;
import X.C705890RmV;
import X.C786410Ut5;
import android.animation.ValueAnimator;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes25.dex */
public class AUListenerS154S0300000_24 implements ValueAnimator.AnimatorUpdateListener {
    public final int $t;
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
            case 2:
                onAnimationUpdate$2(this, valueAnimator);
                break;
        }
    }

    public static final void onAnimationUpdate$0(AUListenerS154S0300000_24 aUListenerS154S0300000_24, ValueAnimator valueAnimator) {
        Integer num;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Integer) && (num = (Integer) animatedValue) != null) {
            C705890RmV c705890RmV = (C705890RmV) aUListenerS154S0300000_24.l0;
            C1591700rWS c1591700rWS = (C1591700rWS) aUListenerS154S0300000_24.l1;
            C1592450rXf c1592450rXf = (C1592450rXf) aUListenerS154S0300000_24.l2;
            int iIntValue = num.intValue();
            ViewGroup.LayoutParams layoutParams = c705890RmV.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.leftMargin = iIntValue;
                C786410Ut5.W5(c705890RmV, marginLayoutParams);
                c1591700rWS.LJIIIIZZ = iIntValue;
                c1592450rXf.LLILLL.postInvalidateOnAnimation();
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
    }

    public static final void onAnimationUpdate$1(AUListenerS154S0300000_24 aUListenerS154S0300000_24, ValueAnimator valueAnimator) {
        Integer num;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Integer) && (num = (Integer) animatedValue) != null) {
            C705890RmV c705890RmV = (C705890RmV) aUListenerS154S0300000_24.l0;
            C1591700rWS c1591700rWS = (C1591700rWS) aUListenerS154S0300000_24.l1;
            C1592450rXf c1592450rXf = (C1592450rXf) aUListenerS154S0300000_24.l2;
            int iIntValue = num.intValue();
            ViewGroup.LayoutParams layoutParams = c705890RmV.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.rightMargin = iIntValue;
                C786410Ut5.W5(c705890RmV, marginLayoutParams);
                c1591700rWS.LJIIIZ = iIntValue;
                c1592450rXf.LLILLL.postInvalidateOnAnimation();
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
    }

    public static final void onAnimationUpdate$2(AUListenerS154S0300000_24 aUListenerS154S0300000_24, ValueAnimator valueAnimator) {
        C1604590rrF c1604590rrF = (C1604590rrF) aUListenerS154S0300000_24.l0;
        Function1<Float, Unit> function1 = c1604590rrF.LJ;
        if (function1 != null) {
            function1.invoke(Float.valueOf(c1604590rrF.LIZ.getTranslationY()));
        }
        ((ViewPropertyAnimator) aUListenerS154S0300000_24.l1).setListener((AAListenerS334S0100000_24) aUListenerS154S0300000_24.l2);
    }

    public AUListenerS154S0300000_24(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj3;
        this.l1 = obj2;
        this.l2 = obj;
    }
}
