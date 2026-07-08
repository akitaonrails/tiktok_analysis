package Y;

import X.C0RVE;
import X.C0SIV;
import X.C0SSM;
import X.C0SU0;
import X.C21415018rM;
import X.C718770SHj;
import android.animation.ValueAnimator;
import com.ss.android.ugc.aweme.ability.ISlideIndicatorAbility;

/* JADX INFO: loaded from: classes12.dex */
public class AUListenerS68S0101000_11 implements ValueAnimator.AnimatorUpdateListener {
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
            case 3:
                onAnimationUpdate$3(this, valueAnimator);
                break;
            case 4:
                onAnimationUpdate$4(this, valueAnimator);
                break;
        }
    }

    public AUListenerS68S0101000_11(C0RVE c0rve, int i) {
        this.$t = i;
        this.l0 = c0rve;
    }

    public static final void onAnimationUpdate$0(AUListenerS68S0101000_11 aUListenerS68S0101000_11, ValueAnimator valueAnimator) {
        int iPow;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        int patientTopMargin = ((C0SU0) aUListenerS68S0101000_11.l0).getPatientTopMargin();
        if (animatedFraction == 1.0f) {
            iPow = -patientTopMargin;
        } else {
            iPow = (int) (((((double) 1) - Math.pow(animatedFraction, 3.0d)) * ((double) aUListenerS68S0101000_11.i1)) - ((double) ((C0SU0) aUListenerS68S0101000_11.l0).getPatientTopMargin()));
        }
        ((C0SU0) aUListenerS68S0101000_11.l0).LJJIIJ(iPow);
    }

    public static final void onAnimationUpdate$1(AUListenerS68S0101000_11 aUListenerS68S0101000_11, ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        ((C718770SHj) aUListenerS68S0101000_11.l0).LLJI.getLayoutParams().height = ((C718770SHj) aUListenerS68S0101000_11.l0).LJJJIL(iIntValue);
        C21415018rM c21415018rM = ((C718770SHj) aUListenerS68S0101000_11.l0).LLJZ;
        if (c21415018rM == null) {
            c21415018rM = null;
        }
        c21415018rM.requestLayout();
        C718770SHj c718770SHj = (C718770SHj) aUListenerS68S0101000_11.l0;
        int i = aUListenerS68S0101000_11.i1;
        C0SIV c0siv = c718770SHj.LL.LLLLJ;
        if (c0siv != null) {
            c0siv.LLD(iIntValue, i);
        }
    }

    public static final void onAnimationUpdate$2(AUListenerS68S0101000_11 aUListenerS68S0101000_11, ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        ((C718770SHj) aUListenerS68S0101000_11.l0).LLJI.getLayoutParams().height = ((C718770SHj) aUListenerS68S0101000_11.l0).LJJJIL(iIntValue);
        C21415018rM c21415018rM = ((C718770SHj) aUListenerS68S0101000_11.l0).LLJZ;
        if (c21415018rM == null) {
            c21415018rM = null;
        }
        c21415018rM.requestLayout();
        C718770SHj c718770SHj = (C718770SHj) aUListenerS68S0101000_11.l0;
        int i = aUListenerS68S0101000_11.i1;
        C0SIV c0siv = c718770SHj.LL.LLLLJ;
        if (c0siv != null) {
            c0siv.LLD(iIntValue, i);
        }
    }

    public static final void onAnimationUpdate$3(AUListenerS68S0101000_11 aUListenerS68S0101000_11, ValueAnimator valueAnimator) {
        int iPow;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        int patientLeftMargin = ((C0SSM) aUListenerS68S0101000_11.l0).getPatientLeftMargin();
        if (animatedFraction == 1.0f) {
            iPow = -patientLeftMargin;
        } else {
            iPow = (int) (((((double) 1) - Math.pow(animatedFraction, 3.0d)) * ((double) aUListenerS68S0101000_11.i1)) - ((double) ((C0SSM) aUListenerS68S0101000_11.l0).getPatientLeftMargin()));
        }
        ((C0SSM) aUListenerS68S0101000_11.l0).j0(iPow, false);
    }

    public static final void onAnimationUpdate$4(AUListenerS68S0101000_11 aUListenerS68S0101000_11, ValueAnimator valueAnimator) {
        ISlideIndicatorAbility iSlideIndicatorAbilityInvoke = ((C0RVE) aUListenerS68S0101000_11.l0).LJ.invoke();
        if (iSlideIndicatorAbilityInvoke != null) {
            iSlideIndicatorAbilityInvoke.Od(((Float) valueAnimator.getAnimatedValue()).floatValue(), aUListenerS68S0101000_11.i1);
        }
    }

    public AUListenerS68S0101000_11(Object obj, int i, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.i1 = i;
    }
}
