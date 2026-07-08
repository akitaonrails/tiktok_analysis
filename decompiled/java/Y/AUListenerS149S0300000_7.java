package Y;

import X.C500260Jjc;
import X.C786410Ut5;
import android.animation.ValueAnimator;
import android.view.View;
import com.ss.android.ugc.aweme.hangout.component.newuserguide.view.HangoutNewUserGuideAssem;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public class AUListenerS149S0300000_7 implements ValueAnimator.AnimatorUpdateListener {
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

    public static final void onAnimationUpdate$0(AUListenerS149S0300000_7 aUListenerS149S0300000_7, ValueAnimator valueAnimator) {
        Float f;
        Float fValueOf;
        Float fValueOf2;
        Object animatedValue = ((ValueAnimator) aUListenerS149S0300000_7.l0).getAnimatedValue();
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            float fFloatValue = f.floatValue();
            for (View view : (List) aUListenerS149S0300000_7.l1) {
                if (view != null) {
                    fValueOf2 = Float.valueOf(view.getAlpha());
                } else {
                    fValueOf2 = null;
                }
                if (!Intrinsics.LIZLLL(fValueOf2, 1.0f) && view != null) {
                    C786410Ut5.T4(view, fFloatValue);
                }
            }
            for (View view2 : (List) aUListenerS149S0300000_7.l2) {
                if (view2 != null) {
                    fValueOf = Float.valueOf(view2.getAlpha());
                } else {
                    fValueOf = null;
                }
                if (!Intrinsics.LIZLLL(fValueOf, 0.0f) || C500260Jjc.LJJJJIZL(view2)) {
                    if (view2 != null) {
                        C786410Ut5.T4(view2, 1 - fFloatValue);
                    }
                }
            }
        }
    }

    public static final void onAnimationUpdate$1(AUListenerS149S0300000_7 aUListenerS149S0300000_7, ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        HangoutNewUserGuideAssem hangoutNewUserGuideAssem = (HangoutNewUserGuideAssem) aUListenerS149S0300000_7.l0;
        View view = (View) aUListenerS149S0300000_7.l1;
        hangoutNewUserGuideAssem.getClass();
        HangoutNewUserGuideAssem.op(iIntValue, view);
        HangoutNewUserGuideAssem hangoutNewUserGuideAssem2 = (HangoutNewUserGuideAssem) aUListenerS149S0300000_7.l0;
        View view2 = (View) aUListenerS149S0300000_7.l2;
        hangoutNewUserGuideAssem2.getClass();
        HangoutNewUserGuideAssem.op(iIntValue, view2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AUListenerS149S0300000_7(Object obj, ValueAnimator valueAnimator, List<? extends View> list, List<? extends View> list2) {
        this.$t = list2;
        this.l0 = obj;
        this.l1 = valueAnimator;
        this.l2 = list;
    }
}
