package Y;

import X.C1086660eNs;
import X.C1096340edU;
import X.C1099560eig;
import X.C16F5;
import X.C497740JfY;
import X.C500260Jjc;
import X.C786410Ut5;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.livesetting.level.LiveFansClubFollowShrinkAnimEnableSetting;

/* JADX INFO: loaded from: classes18.dex */
public class AUListenerS78S0110000_17 implements ValueAnimator.AnimatorUpdateListener {
    public final int $t;
    public Object l0;
    public boolean z1;

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
        }
    }

    public static final void onAnimationUpdate$0(AUListenerS78S0110000_17 aUListenerS78S0110000_17, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        C500260Jjc.LJJZZIII(((int) C497740JfY.LIZIZ(16.0f)) + ((int) (fFloatValue / 2.0f)), ((C1086660eNs) aUListenerS78S0110000_17.l0).getSelectPollTextFromXml());
        if (aUListenerS78S0110000_17.z1) {
            C500260Jjc.LJLJJI(-((int) fFloatValue), (C1086660eNs) aUListenerS78S0110000_17.l0);
        } else {
            C500260Jjc.LJLI(-((int) fFloatValue), (C1086660eNs) aUListenerS78S0110000_17.l0);
        }
    }

    public static final void onAnimationUpdate$1(AUListenerS78S0110000_17 aUListenerS78S0110000_17, ValueAnimator valueAnimator) {
        C16F5 c16f5;
        if (aUListenerS78S0110000_17.z1) {
            c16f5 = (C16F5) ((C1099560eig) aUListenerS78S0110000_17.l0).LJIIL.getValue();
        } else {
            c16f5 = (C16F5) ((C1099560eig) aUListenerS78S0110000_17.l0).LJIILIIL.getValue();
        }
        C786410Ut5.ac(c16f5, ((Float) valueAnimator.getAnimatedValue()).floatValue());
        C786410Ut5.yc(c16f5, ((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static final void onAnimationUpdate$2(AUListenerS78S0110000_17 aUListenerS78S0110000_17, ValueAnimator valueAnimator) {
        View view = (View) aUListenerS78S0110000_17.l0;
        boolean z = aUListenerS78S0110000_17.z1;
        float fIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        if (z) {
            fIntValue *= -1.0f;
        }
        C786410Ut5.Jc(view, fIntValue);
    }

    public static final void onAnimationUpdate$3(AUListenerS78S0110000_17 aUListenerS78S0110000_17, ValueAnimator valueAnimator) {
        View view = (View) aUListenerS78S0110000_17.l0;
        boolean z = aUListenerS78S0110000_17.z1;
        float fIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        if (z) {
            fIntValue *= -1.0f;
        }
        C786410Ut5.Jc(view, fIntValue);
    }

    public static final void onAnimationUpdate$4(AUListenerS78S0110000_17 aUListenerS78S0110000_17, ValueAnimator valueAnimator) {
        View view = (View) aUListenerS78S0110000_17.l0;
        boolean z = aUListenerS78S0110000_17.z1;
        float fIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        if (z) {
            fIntValue *= -1.0f;
        }
        C786410Ut5.Jc(view, fIntValue);
    }

    public static final void onAnimationUpdate$5(AUListenerS78S0110000_17 aUListenerS78S0110000_17, ValueAnimator valueAnimator) {
        View view = (View) aUListenerS78S0110000_17.l0;
        boolean z = aUListenerS78S0110000_17.z1;
        float fIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        if (z) {
            fIntValue *= -1.0f;
        }
        C786410Ut5.Jc(view, fIntValue);
    }

    public static final void onAnimationUpdate$6(AUListenerS78S0110000_17 aUListenerS78S0110000_17, ValueAnimator valueAnimator) {
        if (aUListenerS78S0110000_17.z1 && LiveFansClubFollowShrinkAnimEnableSetting.INSTANCE.getValue()) {
            int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            ViewGroup.LayoutParams layoutParams = ((C1096340edU) aUListenerS78S0110000_17.l0).LJ.getLayoutParams();
            layoutParams.width = iIntValue;
            C786410Ut5.X5(layoutParams, ((C1096340edU) aUListenerS78S0110000_17.l0).LJ);
        }
    }

    public static final void onAnimationUpdate$7(AUListenerS78S0110000_17 aUListenerS78S0110000_17, ValueAnimator valueAnimator) {
        if (aUListenerS78S0110000_17.z1 && LiveFansClubFollowShrinkAnimEnableSetting.INSTANCE.getValue()) {
            int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            ViewGroup.LayoutParams layoutParams = ((C1096340edU) aUListenerS78S0110000_17.l0).LJ.getLayoutParams();
            layoutParams.width = iIntValue;
            C786410Ut5.X5(layoutParams, ((C1096340edU) aUListenerS78S0110000_17.l0).LJ);
        }
    }

    public AUListenerS78S0110000_17(Object obj, boolean z, int i) {
        this.$t = i;
        this.l0 = obj;
        this.z1 = z;
    }
}
