package Y;

import X.C1447500nls;
import X.C1462980oAq;
import X.C1463000oAs;
import X.C817403Hg;
import android.animation.ValueAnimator;
import com.ss.android.ugc.aweme.ftc.pages.FTCChooseCoverFragment;

/* JADX INFO: loaded from: classes23.dex */
public class AUListenerS0S0201001_22 implements ValueAnimator.AnimatorUpdateListener {
    public final int $t;
    public float f3;
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
        }
    }

    public static final void onAnimationUpdate$0(AUListenerS0S0201001_22 aUListenerS0S0201001_22, ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        C1462980oAq c1462980oAq = ((C1463000oAs) aUListenerS0S0201001_22.l0).LLJI;
        if (c1462980oAq != null) {
            float f = ((C817403Hg) aUListenerS0S0201001_22.l1).element + (aUListenerS0S0201001_22.f3 * animatedFraction);
            c1462980oAq.LIZ((90 * animatedFraction) + 0, f, f, 0, aUListenerS0S0201001_22.i2);
        }
    }

    public static final void onAnimationUpdate$1(AUListenerS0S0201001_22 aUListenerS0S0201001_22, ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        float f = aUListenerS0S0201001_22.f3 * fFloatValue;
        int i = (int) ((aUListenerS0S0201001_22.i2 - f) / 2);
        int measuredHeight = (int) (((FTCChooseCoverFragment) aUListenerS0S0201001_22.l0).OR().getMeasuredHeight() * animatedFraction);
        int i2 = (int) f;
        int i3 = (int) fFloatValue;
        ((C1447500nls) aUListenerS0S0201001_22.l1).LLILZ.LJIIIZ.setDisplayPos(i, measuredHeight, i2, i3);
        ((C1447500nls) aUListenerS0S0201001_22.l1).LIZ(measuredHeight, i2, i3);
    }

    public AUListenerS0S0201001_22(float f, int i, Object obj, Object obj2, int i2) {
        this.$t = i2;
        this.f3 = f;
        this.i2 = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
