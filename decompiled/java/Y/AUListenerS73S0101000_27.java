package Y;

import X.AbstractC1842530y31;
import X.C1842520y30;
import X.C1842540y32;
import android.animation.ValueAnimator;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: classes28.dex */
public class AUListenerS73S0101000_27 implements ValueAnimator.AnimatorUpdateListener {
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
        }
    }

    public static final void onAnimationUpdate$0(AUListenerS73S0101000_27 aUListenerS73S0101000_27, ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        float f = animatedFraction / 0.5f;
        if (f > 1.0f) {
            f = 1.0f;
        }
        float f2 = 1;
        AbstractC1842530y31.LJIILJJIL(((C1842540y32) aUListenerS73S0101000_27.l0).LJIILIIL, (int) (aUListenerS73S0101000_27.i1 * (f2 - animatedFraction)));
        C1842540y32.LJIJ((int) (C1842540y32.LJJIIZ * (f2 - f)), ((C1842540y32) aUListenerS73S0101000_27.l0).LJIILIIL);
        C1842540y32 c1842540y32 = (C1842540y32) aUListenerS73S0101000_27.l0;
        int i = C1842540y32.LJJIIZI;
        int i2 = C1842540y32.LJJIJIIJI;
        c1842540y32.getClass();
        int i3 = (int) (i + ((i2 - i) * animatedFraction));
        C1842540y32 c1842540y322 = (C1842540y32) aUListenerS73S0101000_27.l0;
        int i4 = C1842540y32.LJJIJ;
        c1842540y322.getClass();
        int i5 = (int) (i4 + ((i2 - i4) * animatedFraction));
        LinearLayout linearLayout = c1842540y32.LJIIJJI;
        linearLayout.setPaddingRelative(i3, linearLayout.getPaddingTop(), i5, c1842540y32.LJIIJJI.getPaddingBottom());
    }

    public static final void onAnimationUpdate$1(AUListenerS73S0101000_27 aUListenerS73S0101000_27, ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        float f = animatedFraction / 0.5f;
        if (f > 1.0f) {
            f = 1.0f;
        }
        AbstractC1842530y31.LJIILJJIL(((C1842520y30) aUListenerS73S0101000_27.l0).LJIILIIL, (int) (aUListenerS73S0101000_27.i1 * animatedFraction));
        C1842520y30.LJIJI((int) (C1842520y30.LJJIIZ * f), ((C1842520y30) aUListenerS73S0101000_27.l0).LJIILIIL);
        C1842520y30 c1842520y30 = (C1842520y30) aUListenerS73S0101000_27.l0;
        int i = C1842520y30.LJJIIZI;
        int i2 = C1842520y30.LJJIJ;
        c1842520y30.getClass();
        float f2 = i;
        int i3 = (int) (((i2 - i) * animatedFraction) + f2);
        C1842520y30 c1842520y302 = (C1842520y30) aUListenerS73S0101000_27.l0;
        int i4 = C1842520y30.LJJIJIIJI;
        c1842520y302.getClass();
        int i5 = (int) (f2 + ((i4 - i) * animatedFraction));
        LinearLayout linearLayout = c1842520y30.LJIIJJI;
        linearLayout.setPaddingRelative(i3, linearLayout.getPaddingTop(), i5, c1842520y30.LJIIJJI.getPaddingBottom());
    }

    public AUListenerS73S0101000_27(Object obj, int i, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.i1 = i;
    }
}
