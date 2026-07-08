package Y;

import X.C1431640nMI;
import X.C1DYE;
import X.C1DYS;
import X.C2251071D8v;
import X.C786410Ut5;
import android.animation.ValueAnimator;
import android.view.View;
import kotlin.jvm.internal.AwS172S0101000_35;
import kotlin.jvm.internal.AwS579S0100000_35;

/* JADX INFO: loaded from: classes36.dex */
public class AUListenerS281S0100000_35 implements ValueAnimator.AnimatorUpdateListener {
    public final int $t;
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
            case 2:
                onAnimationUpdate$2(this, valueAnimator);
                break;
            case 3:
                onAnimationUpdate$3(this, valueAnimator);
                break;
            case 4:
                onAnimationUpdate$4(this, valueAnimator);
                break;
            case 5:
                onAnimationUpdate$5(this, valueAnimator);
                break;
            case 6:
                onAnimationUpdate$6(this, valueAnimator);
                break;
            case 7:
                onAnimationUpdate$7(this, valueAnimator);
                break;
            case 8:
                onAnimationUpdate$8(this, valueAnimator);
                break;
        }
    }

    public AUListenerS281S0100000_35(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onAnimationUpdate$0(AUListenerS281S0100000_35 aUListenerS281S0100000_35, ValueAnimator valueAnimator) {
        Integer num;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Integer) && (num = (Integer) animatedValue) != null) {
            C2251071D8v c2251071D8v = (C2251071D8v) aUListenerS281S0100000_35.l0;
            int iIntValue = num.intValue();
            if (iIntValue <= c2251071D8v.LJIILJJIL) {
                return;
            }
            c2251071D8v.LJIILJJIL = iIntValue;
            c2251071D8v.LJIIIZ = iIntValue;
            c2251071D8v.LJIIL(c2251071D8v.LJII, c2251071D8v.LJIIIIZZ, iIntValue, true);
        }
    }

    public static final void onAnimationUpdate$1(AUListenerS281S0100000_35 aUListenerS281S0100000_35, ValueAnimator valueAnimator) {
        Float f;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            C2251071D8v c2251071D8v = (C2251071D8v) aUListenerS281S0100000_35.l0;
            int iFloatValue = (int) (f.floatValue() * c2251071D8v.LJIIJ);
            if (iFloatValue <= c2251071D8v.LJIIIZ) {
                return;
            }
            c2251071D8v.LJIIIZ = iFloatValue;
            if (c2251071D8v.LJI() == null) {
                c2251071D8v.LJIIL(c2251071D8v.LJII, c2251071D8v.LJIIIIZZ, c2251071D8v.LJIIJ, true);
                return;
            }
            C1431640nMI c1431640nMILJI = c2251071D8v.LJI();
            if (c1431640nMILJI == null) {
                return;
            }
            C1431640nMI.LIZ(c1431640nMILJI, new AwS579S0100000_35(c2251071D8v, 20));
        }
    }

    public static final void onAnimationUpdate$2(AUListenerS281S0100000_35 aUListenerS281S0100000_35, ValueAnimator valueAnimator) {
        Float f;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            C2251071D8v c2251071D8v = (C2251071D8v) aUListenerS281S0100000_35.l0;
            int iFloatValue = (int) (f.floatValue() * 99);
            if (iFloatValue <= c2251071D8v.LJIILJJIL) {
                return;
            }
            c2251071D8v.LJIILJJIL = iFloatValue;
            c2251071D8v.LJIIIZ = iFloatValue;
            if (c2251071D8v.LJI() == null) {
                c2251071D8v.LJIIL(c2251071D8v.LJII, c2251071D8v.LJIIIIZZ, iFloatValue, true);
                return;
            }
            C1431640nMI c1431640nMILJI = c2251071D8v.LJI();
            if (c1431640nMILJI == null) {
                return;
            }
            C1431640nMI.LIZ(c1431640nMILJI, new AwS172S0101000_35(iFloatValue, c2251071D8v, 0));
        }
    }

    public static final void onAnimationUpdate$3(AUListenerS281S0100000_35 aUListenerS281S0100000_35, ValueAnimator valueAnimator) {
        ((C1DYS) aUListenerS281S0100000_35.l0).LIZLLL = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        ((C1DYS) aUListenerS281S0100000_35.l0).LIZ.invalidate();
    }

    public static final void onAnimationUpdate$4(AUListenerS281S0100000_35 aUListenerS281S0100000_35, ValueAnimator valueAnimator) {
        ((C1DYS) aUListenerS281S0100000_35.l0).LIZLLL = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        ((C1DYS) aUListenerS281S0100000_35.l0).LIZ.invalidate();
    }

    public static final void onAnimationUpdate$5(AUListenerS281S0100000_35 aUListenerS281S0100000_35, ValueAnimator valueAnimator) {
        ((C1DYS) aUListenerS281S0100000_35.l0).LIZLLL = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        ((C1DYS) aUListenerS281S0100000_35.l0).LIZ.invalidate();
    }

    public static final void onAnimationUpdate$6(AUListenerS281S0100000_35 aUListenerS281S0100000_35, ValueAnimator valueAnimator) {
        C786410Ut5.T4(((C1DYS) aUListenerS281S0100000_35.l0).LIZ, ((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static final void onAnimationUpdate$7(AUListenerS281S0100000_35 aUListenerS281S0100000_35, ValueAnimator valueAnimator) {
        float f;
        float f2;
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        C1DYS c1dys = (C1DYS) aUListenerS281S0100000_35.l0;
        View view = c1dys.LIZ;
        C786410Ut5.T4(view, fFloatValue);
        if (c1dys.LIZJ) {
            f = c1dys.LJII * (1 - fFloatValue);
            f2 = c1dys.LJI;
        } else {
            f = c1dys.LJIIIIZZ * (1 - fFloatValue);
            f2 = c1dys.LJFF;
        }
        c1dys.LIZLLL = f + (fFloatValue * f2);
        view.invalidate();
    }

    public static final void onAnimationUpdate$8(AUListenerS281S0100000_35 aUListenerS281S0100000_35, ValueAnimator valueAnimator) {
        Object animatedValue = valueAnimator.getAnimatedValue();
        if (animatedValue == null) {
            return;
        }
        ((C1DYE) aUListenerS281S0100000_35.l0).LIZJ(animatedValue);
    }
}
