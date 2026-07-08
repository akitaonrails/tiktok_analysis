package Y;

import X.C1080680eEE;
import X.C1087140eOe;
import X.C1099390eiP;
import X.C118300cf;
import X.C429740GtA;
import X.C786410Ut5;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import android.animation.ValueAnimator;
import android.view.View;
import com.bytedance.android.livesdk.model.BorderInfo;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public class AUListenerS152S0300000_17 implements ValueAnimator.AnimatorUpdateListener {
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
            case 3:
                onAnimationUpdate$3(this, valueAnimator);
                break;
        }
    }

    public static final void onAnimationUpdate$0(AUListenerS152S0300000_17 aUListenerS152S0300000_17, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        C786410Ut5.ed((View) aUListenerS152S0300000_17.l2, ((C1087140eOe) aUListenerS152S0300000_17.l0).LIZIZ * ((float) Math.sin(6.2831855f * fFloatValue)) * ((C118300cf) aUListenerS152S0300000_17.l1).element);
        C1087140eOe c1087140eOe = (C1087140eOe) aUListenerS152S0300000_17.l0;
        if (c1087140eOe.LIZJ == 1.0f && c1087140eOe.LIZLLL == 1.0f) {
            C786410Ut5.Ob((View) aUListenerS152S0300000_17.l2, 1.0f);
            C786410Ut5.pc((View) aUListenerS152S0300000_17.l2, 1.0f);
            return;
        }
        ((View) aUListenerS152S0300000_17.l2).setPivotX(r1.getMeasuredWidth() / 2.0f);
        ((View) aUListenerS152S0300000_17.l2).setPivotY(r1.getMeasuredHeight() / 2.0f);
        C1087140eOe c1087140eOe2 = (C1087140eOe) aUListenerS152S0300000_17.l0;
        float f = c1087140eOe2.LIZJ;
        float fAbs = f + ((c1087140eOe2.LIZLLL - f) * Math.abs((float) Math.sin(fFloatValue * 3.1415927f)));
        C786410Ut5.Ob((View) aUListenerS152S0300000_17.l2, fAbs);
        C786410Ut5.pc((View) aUListenerS152S0300000_17.l2, fAbs);
    }

    public static final void onAnimationUpdate$1(AUListenerS152S0300000_17 aUListenerS152S0300000_17, ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        ConstraintProperty constraintProperty = (ConstraintProperty) aUListenerS152S0300000_17.l0;
        if (constraintProperty != null) {
            constraintProperty.margin(4, iIntValue);
            constraintProperty.apply();
        }
        ((ConstraintProperty) aUListenerS152S0300000_17.l1).alpha(iIntValue / ((C1080680eEE) aUListenerS152S0300000_17.l2).LIZJ);
    }

    public static final void onAnimationUpdate$2(AUListenerS152S0300000_17 aUListenerS152S0300000_17, ValueAnimator valueAnimator) {
        if (Intrinsics.LJFF((BorderInfo) aUListenerS152S0300000_17.l0, (BorderInfo) aUListenerS152S0300000_17.l1)) {
            C786410Ut5.h5(((C1099390eiP) aUListenerS152S0300000_17.l2).LJII, 1.0f);
            C429740GtA c429740GtA = ((C1099390eiP) aUListenerS152S0300000_17.l2).LJIIIIZZ;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c429740GtA);
            c429740GtA.setAlpha(0.0f);
            return;
        }
        C786410Ut5.h5(((C1099390eiP) aUListenerS152S0300000_17.l2).LJII, ((Float) valueAnimator.getAnimatedValue()).floatValue());
        C429740GtA c429740GtA2 = ((C1099390eiP) aUListenerS152S0300000_17.l2).LJIIIIZZ;
        float fFloatValue = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c429740GtA2);
        c429740GtA2.setAlpha(fFloatValue);
    }

    public static final void onAnimationUpdate$3(AUListenerS152S0300000_17 aUListenerS152S0300000_17, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        C786410Ut5.ed((View) aUListenerS152S0300000_17.l2, ((C1087140eOe) aUListenerS152S0300000_17.l0).LIZIZ * ((float) Math.sin(6.2831855f * fFloatValue)) * ((C118300cf) aUListenerS152S0300000_17.l1).element);
        C1087140eOe c1087140eOe = (C1087140eOe) aUListenerS152S0300000_17.l0;
        if (c1087140eOe.LIZJ == 1.0f && c1087140eOe.LIZLLL == 1.0f) {
            C786410Ut5.Ob((View) aUListenerS152S0300000_17.l2, 1.0f);
            C786410Ut5.pc((View) aUListenerS152S0300000_17.l2, 1.0f);
            return;
        }
        ((View) aUListenerS152S0300000_17.l2).setPivotX(r1.getMeasuredWidth() / 2.0f);
        ((View) aUListenerS152S0300000_17.l2).setPivotY(r1.getMeasuredHeight() / 2.0f);
        C1087140eOe c1087140eOe2 = (C1087140eOe) aUListenerS152S0300000_17.l0;
        float f = c1087140eOe2.LIZJ;
        float fAbs = f + ((c1087140eOe2.LIZLLL - f) * Math.abs((float) Math.sin(fFloatValue * 3.1415927f)));
        C786410Ut5.Ob((View) aUListenerS152S0300000_17.l2, fAbs);
        C786410Ut5.pc((View) aUListenerS152S0300000_17.l2, fAbs);
    }

    public AUListenerS152S0300000_17(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
