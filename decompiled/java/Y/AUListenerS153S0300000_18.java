package Y;

import X.C118300cf;
import X.C1388190mED;
import X.C786410Ut5;
import X.ViewOnAttachStateChangeListenerC20631115oD;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.view.View;
import kotlin.jvm.internal.AFwS206S0000000_18;

/* JADX INFO: loaded from: classes19.dex */
public class AUListenerS153S0300000_18 implements ValueAnimator.AnimatorUpdateListener {
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
        }
    }

    public static final void onAnimationUpdate$0(AUListenerS153S0300000_18 aUListenerS153S0300000_18, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        C786410Ut5.T4((View) aUListenerS153S0300000_18.l0, fFloatValue);
        C786410Ut5.T4((View) aUListenerS153S0300000_18.l1, fFloatValue);
        C786410Ut5.T4((View) aUListenerS153S0300000_18.l2, fFloatValue);
    }

    public static final void onAnimationUpdate$1(AUListenerS153S0300000_18 aUListenerS153S0300000_18, ValueAnimator valueAnimator) {
        Integer num;
        Activity activityLIZ = C1388190mED.LIZ(((ViewOnAttachStateChangeListenerC20631115oD) aUListenerS153S0300000_18.l0).getContext());
        if (activityLIZ != null && !activityLIZ.isFinishing()) {
            Object animatedValue = valueAnimator.getAnimatedValue();
            if ((animatedValue instanceof Integer) && (num = (Integer) animatedValue) != null) {
                int iIntValue = num.intValue();
                ((ViewOnAttachStateChangeListenerC20631115oD) aUListenerS153S0300000_18.l0).fakeDragBy(-(iIntValue - ((C118300cf) aUListenerS153S0300000_18.l2).element));
                ((C118300cf) aUListenerS153S0300000_18.l2).element = iIntValue;
                return;
            }
            return;
        }
        AFwS206S0000000_18.get$arr$(683).getClass();
        ((ValueAnimator) aUListenerS153S0300000_18.l1).cancel();
    }

    public AUListenerS153S0300000_18(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
