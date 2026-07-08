package Y;

import X.C1846630y9d;
import X.C1847050yAJ;
import X.C1847150yAT;
import X.C786410Ut5;
import android.animation.ValueAnimator;

/* JADX INFO: loaded from: classes28.dex */
public class AUListenerS11S0111000_27 implements ValueAnimator.AnimatorUpdateListener {
    public final int $t;
    public int i2;
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
        }
    }

    public static final void onAnimationUpdate$0(AUListenerS11S0111000_27 aUListenerS11S0111000_27, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (aUListenerS11S0111000_27.z1) {
            C786410Ut5.qd(((C1847050yAJ) aUListenerS11S0111000_27.l0).LJII, aUListenerS11S0111000_27.i2 * fFloatValue * (-1));
            C1846630y9d c1846630y9d = ((C1847050yAJ) aUListenerS11S0111000_27.l0).LJIIIZ;
            int i = aUListenerS11S0111000_27.i2;
            C786410Ut5.qd(c1846630y9d, i - (i * fFloatValue));
            return;
        }
        C786410Ut5.qd(((C1847050yAJ) aUListenerS11S0111000_27.l0).LJII, aUListenerS11S0111000_27.i2 * fFloatValue);
        C1846630y9d c1846630y9d2 = ((C1847050yAJ) aUListenerS11S0111000_27.l0).LJIIIZ;
        int i2 = aUListenerS11S0111000_27.i2;
        C786410Ut5.qd(c1846630y9d2, (i2 * (-1.0f)) + (i2 * fFloatValue));
    }

    public static final void onAnimationUpdate$1(AUListenerS11S0111000_27 aUListenerS11S0111000_27, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (aUListenerS11S0111000_27.z1) {
            C1846630y9d c1846630y9d = ((C1847150yAT) aUListenerS11S0111000_27.l0).LL;
            if (c1846630y9d != null) {
                C786410Ut5.qd(c1846630y9d, aUListenerS11S0111000_27.i2 * fFloatValue * (-1));
            }
            C1846630y9d c1846630y9d2 = ((C1847150yAT) aUListenerS11S0111000_27.l0).LLILLJJLI;
            if (c1846630y9d2 != null) {
                int i = aUListenerS11S0111000_27.i2;
                C786410Ut5.qd(c1846630y9d2, i - (i * fFloatValue));
                return;
            }
            return;
        }
        C1846630y9d c1846630y9d3 = ((C1847150yAT) aUListenerS11S0111000_27.l0).LL;
        if (c1846630y9d3 != null) {
            C786410Ut5.qd(c1846630y9d3, aUListenerS11S0111000_27.i2 * fFloatValue);
        }
        C1846630y9d c1846630y9d4 = ((C1847150yAT) aUListenerS11S0111000_27.l0).LLILLJJLI;
        if (c1846630y9d4 == null) {
            return;
        }
        int i2 = aUListenerS11S0111000_27.i2;
        C786410Ut5.qd(c1846630y9d4, (i2 * (-1.0f)) + (i2 * fFloatValue));
    }

    public AUListenerS11S0111000_27(boolean z, Object obj, int i, int i2) {
        this.$t = i2;
        this.z1 = z;
        this.l0 = obj;
        this.i2 = i;
    }
}
