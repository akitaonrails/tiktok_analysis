package Y;

import X.C1603210rp1;
import X.C1607680rwE;
import X.C1611030s1d;
import X.C1611050s1f;
import android.animation.ValueAnimator;
import com.ss.android.ugc.aweme.experiment.LiveHeadAnimDowngradeExperiment;
import java.util.Iterator;

/* JADX INFO: loaded from: classes25.dex */
public class AUListenerS72S0101000_24 implements ValueAnimator.AnimatorUpdateListener {
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
        }
    }

    public AUListenerS72S0101000_24(C1611030s1d c1611030s1d, int i) {
        this.$t = i;
        this.l0 = c1611030s1d;
    }

    public static final void onAnimationUpdate$0(AUListenerS72S0101000_24 aUListenerS72S0101000_24, ValueAnimator valueAnimator) {
        int viewPagerMarginTop;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        int viewPagerMarginTop2 = ((C1603210rp1) aUListenerS72S0101000_24.l0).getViewPagerMarginTop();
        C1603210rp1 c1603210rp1 = (C1603210rp1) aUListenerS72S0101000_24.l0;
        if (animatedFraction == 1.0f) {
            viewPagerMarginTop = -(viewPagerMarginTop2 + c1603210rp1.LLJJ);
        } else {
            double dPow = 1.0d - Math.pow(animatedFraction, 3.0d);
            int i = aUListenerS72S0101000_24.i1;
            C1603210rp1 c1603210rp12 = (C1603210rp1) aUListenerS72S0101000_24.l0;
            viewPagerMarginTop = (int) ((dPow * ((double) (i + c1603210rp12.LLJJ))) - ((double) (c1603210rp12.getViewPagerMarginTop() + ((C1603210rp1) aUListenerS72S0101000_24.l0).LLJJ)));
        }
        c1603210rp1.setViewPagerMarginTopByDelta(viewPagerMarginTop);
    }

    public static final void onAnimationUpdate$1(AUListenerS72S0101000_24 aUListenerS72S0101000_24, ValueAnimator valueAnimator) {
        int iPow;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        int viewPagerMarginTop = ((C1607680rwE) aUListenerS72S0101000_24.l0).getViewPagerMarginTop();
        C1607680rwE c1607680rwE = (C1607680rwE) aUListenerS72S0101000_24.l0;
        if (animatedFraction == 1.0f) {
            iPow = -viewPagerMarginTop;
        } else {
            iPow = (int) (((1.0d - Math.pow(animatedFraction, 3.0d)) * ((double) aUListenerS72S0101000_24.i1)) - ((double) ((C1607680rwE) aUListenerS72S0101000_24.l0).getViewPagerMarginTop()));
        }
        c1607680rwE.setViewPagerMarginTopByDelta(iPow);
    }

    public static final void onAnimationUpdate$2(AUListenerS72S0101000_24 aUListenerS72S0101000_24, ValueAnimator valueAnimator) {
        int viewPagerMarginTop;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        int viewPagerMarginTop2 = ((C1607680rwE) aUListenerS72S0101000_24.l0).getViewPagerMarginTop();
        C1607680rwE c1607680rwE = (C1607680rwE) aUListenerS72S0101000_24.l0;
        if (animatedFraction == 1.0f) {
            viewPagerMarginTop = -(viewPagerMarginTop2 + c1607680rwE.LLJI);
        } else {
            double dPow = 1.0d - Math.pow(animatedFraction, 3.0d);
            int i = aUListenerS72S0101000_24.i1;
            C1607680rwE c1607680rwE2 = (C1607680rwE) aUListenerS72S0101000_24.l0;
            viewPagerMarginTop = (int) ((dPow * ((double) (i + c1607680rwE2.LLJI))) - ((double) (c1607680rwE2.getViewPagerMarginTop() + ((C1607680rwE) aUListenerS72S0101000_24.l0).LLJI)));
        }
        c1607680rwE.setViewPagerMarginTopByDelta(viewPagerMarginTop);
    }

    public static final void onAnimationUpdate$3(AUListenerS72S0101000_24 aUListenerS72S0101000_24, ValueAnimator valueAnimator) {
        if (!LiveHeadAnimDowngradeExperiment.INSTANCE.isSoftDowngradeEnable()) {
            C1611030s1d c1611030s1d = (C1611030s1d) aUListenerS72S0101000_24.l0;
            c1611030s1d.getClass();
            c1611030s1d.LL = C1611050s1f.LIZ;
        }
        int i = aUListenerS72S0101000_24.i1;
        C1611030s1d c1611030s1d2 = (C1611030s1d) aUListenerS72S0101000_24.l0;
        if (i % c1611030s1d2.LL == 0) {
            Iterator<ValueAnimator.AnimatorUpdateListener> it2 = c1611030s1d2.LLILLL.iterator();
            while (it2.hasNext()) {
                it2.next().onAnimationUpdate(valueAnimator);
            }
        }
        aUListenerS72S0101000_24.i1 = (aUListenerS72S0101000_24.i1 + 1) % ((C1611030s1d) aUListenerS72S0101000_24.l0).LL;
    }

    public AUListenerS72S0101000_24(Object obj, int i, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.i1 = i;
    }
}
