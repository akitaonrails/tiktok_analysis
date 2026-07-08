package Y;

import X.C1846630y9d;
import X.C1846800y9u;
import X.C1847180yAW;
import X.C786410Ut5;
import android.animation.ValueAnimator;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes28.dex */
public class AUListenerS0S0113000_27 implements ValueAnimator.AnimatorUpdateListener {
    public final int $t;
    public int i2;
    public int i3;
    public int i4;
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

    public static final void onAnimationUpdate$0(AUListenerS0S0113000_27 aUListenerS0S0113000_27, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (aUListenerS0S0113000_27.z1) {
            ImageView imageView = ((C1847180yAW) aUListenerS0S0113000_27.l0).LJII;
            int i = aUListenerS0S0113000_27.i2;
            C786410Ut5.gd(imageView, i - (i * fFloatValue));
        } else {
            C786410Ut5.gd(((C1847180yAW) aUListenerS0S0113000_27.l0).LJII, (-r2) + (aUListenerS0S0113000_27.i2 * fFloatValue));
        }
        C1846800y9u.LJIILL(((C1847180yAW) aUListenerS0S0113000_27.l0).LJIIJ, (int) (aUListenerS0S0113000_27.i3 + ((aUListenerS0S0113000_27.i4 - r2) * fFloatValue)));
    }

    public static final void onAnimationUpdate$1(AUListenerS0S0113000_27 aUListenerS0S0113000_27, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (aUListenerS0S0113000_27.z1) {
            C786410Ut5.hd(((C1847180yAW) aUListenerS0S0113000_27.l0).LJIIIZ, aUListenerS0S0113000_27.i2 * fFloatValue * (-1));
            C1846630y9d c1846630y9d = ((C1847180yAW) aUListenerS0S0113000_27.l0).LJIIIIZZ;
            int i = aUListenerS0S0113000_27.i2;
            C786410Ut5.qd(c1846630y9d, i - (i * fFloatValue));
        } else {
            C786410Ut5.hd(((C1847180yAW) aUListenerS0S0113000_27.l0).LJIIIZ, aUListenerS0S0113000_27.i2 * fFloatValue);
            C1846630y9d c1846630y9d2 = ((C1847180yAW) aUListenerS0S0113000_27.l0).LJIIIIZZ;
            int i2 = aUListenerS0S0113000_27.i2;
            C786410Ut5.qd(c1846630y9d2, (i2 * (-1.0f)) + (i2 * fFloatValue));
        }
        C1846800y9u.LJIILL(((C1847180yAW) aUListenerS0S0113000_27.l0).LJIIJ, (int) (aUListenerS0S0113000_27.i3 + ((aUListenerS0S0113000_27.i4 - r2) * fFloatValue)));
    }

    public AUListenerS0S0113000_27(boolean z, C1847180yAW c1847180yAW, int i, int i2, int i3, int i4) {
        this.$t = i4;
        this.z1 = z;
        this.l0 = c1847180yAW;
        this.i2 = i;
        this.i3 = i2;
        this.i4 = i3;
    }
}
