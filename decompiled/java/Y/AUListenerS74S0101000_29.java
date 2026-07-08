package Y;

import X.C12CZ;
import X.C1462760oAU;
import X.C19510111Ut;
import X.C19735612Jm;
import X.C444960Hcc;
import X.InterfaceC19510211Uu;
import android.animation.ValueAnimator;
import androidx.viewpager.widget.PagerAdapter;

/* JADX INFO: loaded from: classes30.dex */
public class AUListenerS74S0101000_29 implements ValueAnimator.AnimatorUpdateListener {
    public final int $t;
    public int i1;
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
        }
    }

    public AUListenerS74S0101000_29(C12CZ c12cz, int i) {
        this.$t = i;
        this.l0 = c12cz;
    }

    public static final void onAnimationUpdate$0(AUListenerS74S0101000_29 aUListenerS74S0101000_29, ValueAnimator valueAnimator) {
        ((C19510111Ut) ((ARunnableS98S0200000_29) aUListenerS74S0101000_29.l0).l1).LIZ.LJ(valueAnimator.getAnimatedFraction(), 0, aUListenerS74S0101000_29.i1);
        ((C19510111Ut) ((ARunnableS98S0200000_29) aUListenerS74S0101000_29.l0).l1).LJ(valueAnimator.getAnimatedFraction(), 0, aUListenerS74S0101000_29.i1);
        ((InterfaceC19510211Uu) ((ARunnableS98S0200000_29) aUListenerS74S0101000_29.l0).l0).LJ(valueAnimator.getAnimatedFraction(), 0, aUListenerS74S0101000_29.i1);
    }

    public static final void onAnimationUpdate$1(AUListenerS74S0101000_29 aUListenerS74S0101000_29, ValueAnimator valueAnimator) {
        ((C19735612Jm) ((ARunnableS98S0200000_29) aUListenerS74S0101000_29.l0).l1).LIZ.LJ(valueAnimator.getAnimatedFraction(), 0, aUListenerS74S0101000_29.i1);
        ((C19735612Jm) ((ARunnableS98S0200000_29) aUListenerS74S0101000_29.l0).l1).LJ(valueAnimator.getAnimatedFraction(), 0, aUListenerS74S0101000_29.i1);
        ((InterfaceC19510211Uu) ((ARunnableS98S0200000_29) aUListenerS74S0101000_29.l0).l0).LJ(valueAnimator.getAnimatedFraction(), 0, aUListenerS74S0101000_29.i1);
    }

    public static final void onAnimationUpdate$2(AUListenerS74S0101000_29 aUListenerS74S0101000_29, ValueAnimator valueAnimator) {
        PagerAdapter adapter = ((C12CZ) aUListenerS74S0101000_29.l0).LIZ.getAdapter();
        if (adapter != null && adapter.getCount() > 0) {
            int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            int i = iIntValue - aUListenerS74S0101000_29.i1;
            aUListenerS74S0101000_29.i1 = iIntValue;
            C1462760oAU c1462760oAU = ((C12CZ) aUListenerS74S0101000_29.l0).LIZ;
            if (c1462760oAU.LLLIZZ) {
                if (C444960Hcc.LIZJ(c1462760oAU.getContext())) {
                    ((C12CZ) aUListenerS74S0101000_29.l0).LIZ.LJIILIIL(i);
                } else {
                    ((C12CZ) aUListenerS74S0101000_29.l0).LIZ.LJIILIIL(-i);
                }
            }
        }
    }

    public AUListenerS74S0101000_29(ARunnableS98S0200000_29 aRunnableS98S0200000_29, int i, int i2) {
        this.$t = i2;
        this.l0 = aRunnableS98S0200000_29;
        this.i1 = i;
    }
}
