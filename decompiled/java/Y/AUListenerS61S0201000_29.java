package Y;

import X.C19510111Ut;
import X.C19510411Uw;
import X.C19510511Ux;
import X.C19735612Jm;
import X.C19737212Kc;
import X.C19737512Kf;
import X.C786410Ut5;
import X.InterfaceC1645910svt;
import X.InterfaceC19510211Uu;
import android.animation.ValueAnimator;
import com.tts.oecverify.BdTuring;

/* JADX INFO: loaded from: classes30.dex */
public class AUListenerS61S0201000_29 implements ValueAnimator.AnimatorUpdateListener {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

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
            case BdTuring.TYPE_ECAF /* 9 */:
                onAnimationUpdate$9(this, valueAnimator);
                break;
        }
    }

    public static final void onAnimationUpdate$0(AUListenerS61S0201000_29 aUListenerS61S0201000_29, ValueAnimator valueAnimator) {
        ((C19510111Ut) aUListenerS61S0201000_29.l1).LIZ.LJIIIIZZ(valueAnimator.getAnimatedFraction(), 0, aUListenerS61S0201000_29.i2);
        ((C19510111Ut) aUListenerS61S0201000_29.l1).LJIIIIZZ(valueAnimator.getAnimatedFraction(), 0, aUListenerS61S0201000_29.i2);
        ((InterfaceC19510211Uu) aUListenerS61S0201000_29.l0).LJIIIIZZ(valueAnimator.getAnimatedFraction(), 0, aUListenerS61S0201000_29.i2);
    }

    public static final void onAnimationUpdate$1(AUListenerS61S0201000_29 aUListenerS61S0201000_29, ValueAnimator valueAnimator) {
        ((C19737512Kf) aUListenerS61S0201000_29.l1).LIZ.LJ(valueAnimator.getAnimatedFraction(), 0, aUListenerS61S0201000_29.i2);
        ((C19737512Kf) aUListenerS61S0201000_29.l1).LJ(valueAnimator.getAnimatedFraction(), 0, aUListenerS61S0201000_29.i2);
        ((InterfaceC19510211Uu) aUListenerS61S0201000_29.l0).LJ(valueAnimator.getAnimatedFraction(), 0, aUListenerS61S0201000_29.i2);
    }

    public static final void onAnimationUpdate$2(AUListenerS61S0201000_29 aUListenerS61S0201000_29, ValueAnimator valueAnimator) {
        ((C19737512Kf) aUListenerS61S0201000_29.l1).LIZ.LJIIIIZZ(valueAnimator.getAnimatedFraction(), 0, aUListenerS61S0201000_29.i2);
        ((C19737512Kf) aUListenerS61S0201000_29.l1).LJIIIIZZ(valueAnimator.getAnimatedFraction(), 0, aUListenerS61S0201000_29.i2);
        ((InterfaceC19510211Uu) aUListenerS61S0201000_29.l0).LJIIIIZZ(valueAnimator.getAnimatedFraction(), 0, aUListenerS61S0201000_29.i2);
    }

    public static final void onAnimationUpdate$3(AUListenerS61S0201000_29 aUListenerS61S0201000_29, ValueAnimator valueAnimator) {
        ((C19735612Jm) aUListenerS61S0201000_29.l1).LIZ.LJIIIIZZ(valueAnimator.getAnimatedFraction(), 0, aUListenerS61S0201000_29.i2);
        ((C19735612Jm) aUListenerS61S0201000_29.l1).LJIIIIZZ(valueAnimator.getAnimatedFraction(), 0, aUListenerS61S0201000_29.i2);
        ((InterfaceC19510211Uu) aUListenerS61S0201000_29.l0).LJIIIIZZ(valueAnimator.getAnimatedFraction(), 0, aUListenerS61S0201000_29.i2);
    }

    public static final void onAnimationUpdate$4(AUListenerS61S0201000_29 aUListenerS61S0201000_29, ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        int i = aUListenerS61S0201000_29.i2;
        InterfaceC1645910svt interfaceC1645910svt = ((C19737212Kc) aUListenerS61S0201000_29.l0).LJFF;
        if (interfaceC1645910svt != null) {
            interfaceC1645910svt.LJIIIIZZ(animatedFraction, 0, i);
        }
        C786410Ut5.ed(((C19737212Kc) aUListenerS61S0201000_29.l0).LIZ, i * animatedFraction);
        C786410Ut5.T4(((C19737212Kc) aUListenerS61S0201000_29.l0).LIZ, 1 - animatedFraction);
        InterfaceC19510211Uu interfaceC19510211Uu = (InterfaceC19510211Uu) aUListenerS61S0201000_29.l1;
        if (interfaceC19510211Uu != null) {
            interfaceC19510211Uu.LJIIIIZZ(animatedFraction, 0, i);
        }
    }

    public static final void onAnimationUpdate$5(AUListenerS61S0201000_29 aUListenerS61S0201000_29, ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        int i = aUListenerS61S0201000_29.i2;
        InterfaceC1645910svt interfaceC1645910svt = ((C19737212Kc) aUListenerS61S0201000_29.l0).LJFF;
        if (interfaceC1645910svt != null) {
            interfaceC1645910svt.LJ(animatedFraction, 0, i);
        }
        C786410Ut5.ed(((C19737212Kc) aUListenerS61S0201000_29.l0).LIZ, i + ((-i) * animatedFraction));
        C786410Ut5.T4(((C19737212Kc) aUListenerS61S0201000_29.l0).LIZ, animatedFraction);
        InterfaceC19510211Uu interfaceC19510211Uu = (InterfaceC19510211Uu) aUListenerS61S0201000_29.l1;
        if (interfaceC19510211Uu != null) {
            interfaceC19510211Uu.LJ(animatedFraction, 0, i);
        }
    }

    public static final void onAnimationUpdate$6(AUListenerS61S0201000_29 aUListenerS61S0201000_29, ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        int i = aUListenerS61S0201000_29.i2;
        InterfaceC1645910svt interfaceC1645910svt = ((C19510511Ux) aUListenerS61S0201000_29.l0).LIZJ;
        if (interfaceC1645910svt != null) {
            interfaceC1645910svt.LJIIIIZZ(animatedFraction, 0, i);
        }
        C786410Ut5.ed(((C19510511Ux) aUListenerS61S0201000_29.l0).LIZ, i * animatedFraction);
        C786410Ut5.T4(((C19510511Ux) aUListenerS61S0201000_29.l0).LIZ, 1 - animatedFraction);
        InterfaceC19510211Uu interfaceC19510211Uu = (InterfaceC19510211Uu) aUListenerS61S0201000_29.l1;
        if (interfaceC19510211Uu != null) {
            interfaceC19510211Uu.LJIIIIZZ(animatedFraction, 0, i);
        }
    }

    public static final void onAnimationUpdate$7(AUListenerS61S0201000_29 aUListenerS61S0201000_29, ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        int i = aUListenerS61S0201000_29.i2;
        InterfaceC1645910svt interfaceC1645910svt = ((C19510511Ux) aUListenerS61S0201000_29.l0).LIZJ;
        if (interfaceC1645910svt != null) {
            interfaceC1645910svt.LJ(animatedFraction, 0, i);
        }
        C786410Ut5.ed(((C19510511Ux) aUListenerS61S0201000_29.l0).LIZ, i + ((-i) * animatedFraction));
        C786410Ut5.T4(((C19510511Ux) aUListenerS61S0201000_29.l0).LIZ, animatedFraction);
        InterfaceC19510211Uu interfaceC19510211Uu = (InterfaceC19510211Uu) aUListenerS61S0201000_29.l1;
        if (interfaceC19510211Uu != null) {
            interfaceC19510211Uu.LJ(animatedFraction, 0, i);
        }
    }

    public static final void onAnimationUpdate$8(AUListenerS61S0201000_29 aUListenerS61S0201000_29, ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        InterfaceC1645910svt interfaceC1645910svt = ((C19510411Uw) aUListenerS61S0201000_29.l0).LJIIIZ;
        if (interfaceC1645910svt != null) {
            interfaceC1645910svt.LJIIIIZZ(animatedFraction, 0, aUListenerS61S0201000_29.i2);
        }
        ((C19510411Uw) aUListenerS61S0201000_29.l0).LJIIIIZZ(animatedFraction, 0, aUListenerS61S0201000_29.i2);
        InterfaceC19510211Uu interfaceC19510211Uu = (InterfaceC19510211Uu) aUListenerS61S0201000_29.l1;
        if (interfaceC19510211Uu != null) {
            interfaceC19510211Uu.LJIIIIZZ(animatedFraction, 0, aUListenerS61S0201000_29.i2);
        }
    }

    public static final void onAnimationUpdate$9(AUListenerS61S0201000_29 aUListenerS61S0201000_29, ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        InterfaceC1645910svt interfaceC1645910svt = ((C19510411Uw) aUListenerS61S0201000_29.l0).LJIIIZ;
        if (interfaceC1645910svt != null) {
            interfaceC1645910svt.LJ(animatedFraction, 0, aUListenerS61S0201000_29.i2);
        }
        ((C19510411Uw) aUListenerS61S0201000_29.l0).LJ(animatedFraction, 0, aUListenerS61S0201000_29.i2);
        InterfaceC19510211Uu interfaceC19510211Uu = (InterfaceC19510211Uu) aUListenerS61S0201000_29.l1;
        if (interfaceC19510211Uu != null) {
            interfaceC19510211Uu.LJ(animatedFraction, 0, aUListenerS61S0201000_29.i2);
        }
    }

    public AUListenerS61S0201000_29(int i, Object obj, Object obj2, int i2) {
        this.$t = i2;
        this.i2 = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
