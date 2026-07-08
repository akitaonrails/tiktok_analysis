package Y;

import X.C1744700vVE;
import X.C212359188n;
import X.C212360188o;
import android.animation.ValueAnimator;

/* JADX INFO: loaded from: classes33.dex */
public class AUListenerS14S0202000_32 implements ValueAnimator.AnimatorUpdateListener {
    public final int $t;
    public int i2;
    public int i3;
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
        }
    }

    public static final void onAnimationUpdate$0(AUListenerS14S0202000_32 aUListenerS14S0202000_32, ValueAnimator valueAnimator) {
        int iIntValue;
        float f;
        Integer num;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Integer) && (num = (Integer) animatedValue) != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = aUListenerS14S0202000_32.i2;
        }
        C1744700vVE.LJIIIIZZ(iIntValue, (C212359188n) aUListenerS14S0202000_32.l0);
        if (aUListenerS14S0202000_32.i3 == aUListenerS14S0202000_32.i2) {
            f = 1.0f;
        } else {
            f = (iIntValue - r0) / (r2 - r0);
        }
        ((C212360188o) aUListenerS14S0202000_32.l1).LJII(f);
    }

    public static final void onAnimationUpdate$1(AUListenerS14S0202000_32 aUListenerS14S0202000_32, ValueAnimator valueAnimator) {
        int iIntValue;
        float f;
        Integer num;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Integer) && (num = (Integer) animatedValue) != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = aUListenerS14S0202000_32.i2;
        }
        C1744700vVE.LJIIIIZZ(iIntValue, (C212359188n) aUListenerS14S0202000_32.l0);
        if (aUListenerS14S0202000_32.i2 == aUListenerS14S0202000_32.i3) {
            f = 0.0f;
        } else {
            f = (iIntValue - r0) / (r2 - r0);
        }
        ((C212360188o) aUListenerS14S0202000_32.l1).LJII(f);
    }

    public AUListenerS14S0202000_32(int i, C212359188n c212359188n, int i2, C212360188o c212360188o, int i3) {
        this.$t = i3;
        this.i2 = i;
        this.l0 = c212359188n;
        this.i3 = i2;
        this.l1 = c212360188o;
    }
}
