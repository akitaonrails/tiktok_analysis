package Y;

import X.C1850940yGa;
import X.C19WD;
import X.C19WH;
import X.C1AHS;
import X.C1AHV;
import X.C21571519bV;
import X.C21572519bf;
import X.C21574419by;
import X.C21582219dE;
import X.C21582319dF;
import X.C21646519nb;
import X.C21648419nu;
import X.C21649019o0;
import X.C21693119v7;
import X.C2188881Ala;
import X.C426320Gne;
import X.C786410Ut5;
import X.InterfaceC21641019mi;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.view.View;
import com.google.android.material.appbar.AppBarLayout$Behavior;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.component.FriendsV3NavHideOnScrollAssem;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;

/* JADX INFO: loaded from: classes34.dex */
public class AUListenerS235S0200000_33 implements ValueAnimator.AnimatorUpdateListener {
    public final int $t;
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
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onAnimationUpdate$10(this, valueAnimator);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                onAnimationUpdate$11(this, valueAnimator);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                onAnimationUpdate$12(this, valueAnimator);
                break;
        }
    }

    public static final void onAnimationUpdate$0(AUListenerS235S0200000_33 aUListenerS235S0200000_33, ValueAnimator valueAnimator) {
        Object animatedValue = valueAnimator.getAnimatedValue();
        if (animatedValue instanceof Matrix) {
            C21574419by c21574419by = (C21574419by) aUListenerS235S0200000_33.l0;
            Matrix matrix = (Matrix) animatedValue;
            c21574419by.LLJI = matrix;
            float[] fArr = new float[9];
            matrix.getValues(fArr);
            c21574419by.LLJJJJ = fArr[0];
            ((C21574419by) aUListenerS235S0200000_33.l0).postInvalidateOnAnimation();
        }
        ((ValueAnimator) aUListenerS235S0200000_33.l1).setInterpolator(((C21574419by) aUListenerS235S0200000_33.l0).LLJJJJLIIL);
    }

    public static final void onAnimationUpdate$1(AUListenerS235S0200000_33 aUListenerS235S0200000_33, ValueAnimator valueAnimator) {
        Object animatedValue = valueAnimator.getAnimatedValue();
        if (animatedValue instanceof Matrix) {
            C21572519bf c21572519bf = (C21572519bf) aUListenerS235S0200000_33.l0;
            Matrix matrix = (Matrix) animatedValue;
            c21572519bf.LLJILJILJ = matrix;
            c21572519bf.LLJJL = C21571519bV.LIZ(matrix);
            ((C21572519bf) aUListenerS235S0200000_33.l0).postInvalidateOnAnimation();
        }
        ((ValueAnimator) aUListenerS235S0200000_33.l1).setInterpolator(((C21572519bf) aUListenerS235S0200000_33.l0).LLJL);
    }

    public static final void onAnimationUpdate$10(AUListenerS235S0200000_33 aUListenerS235S0200000_33, ValueAnimator valueAnimator) {
        ((C2188881Ala) aUListenerS235S0200000_33.l1).LJFF(((Integer) ((ValueAnimator) aUListenerS235S0200000_33.l0).getAnimatedValue()).intValue());
    }

    public static final void onAnimationUpdate$11(AUListenerS235S0200000_33 aUListenerS235S0200000_33, ValueAnimator valueAnimator) {
        ((View) ((C19WD) ((C19WH) aUListenerS235S0200000_33.l0)).LIZ.LIZLLL.getParent()).invalidate();
    }

    public static final void onAnimationUpdate$12(AUListenerS235S0200000_33 aUListenerS235S0200000_33, ValueAnimator valueAnimator) {
        InterfaceC21641019mi interfaceC21641019mi = (InterfaceC21641019mi) aUListenerS235S0200000_33.l0;
        if (interfaceC21641019mi != null) {
            interfaceC21641019mi.LIZIZ(new C1850940yGa((ObjectAnimator) aUListenerS235S0200000_33.l1));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onAnimationUpdate$2(Y.AUListenerS235S0200000_33 r4, android.animation.ValueAnimator r5) {
        /*
            float r3 = r5.getAnimatedFraction()
            java.lang.Object r0 = r4.l0
            android.animation.ValueAnimator r0 = (android.animation.ValueAnimator) r0
            long r1 = r0.getDuration()
            float r0 = (float) r1
            float r3 = r3 * r0
            int r2 = (int) r3
            if (r2 < 0) goto L33
            r0 = 6001(0x1771, float:8.409E-42)
            if (r2 >= r0) goto L25
            int r2 = r2 / 100
        L17:
            java.lang.Object r0 = r4.l1
            X.1Bpv r0 = (X.AbstractC2217051Bpv) r0
            androidx.lifecycle.MutableLiveData<java.lang.Integer> r1 = r0.LJIL
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r1.setValue(r0)
            return
        L25:
            r1 = 6000(0x1770, float:8.408E-42)
            if (r1 > r2) goto L33
            r0 = 10001(0x2711, float:1.4014E-41)
            if (r2 >= r0) goto L33
            int r2 = r2 - r1
            int r0 = r2 / 200
            int r2 = r0 + 60
            goto L17
        L33:
            int r0 = r2 + (-10000)
            int r0 = r0 / 300
            int r2 = r0 + 80
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AUListenerS235S0200000_33.onAnimationUpdate$2(Y.AUListenerS235S0200000_33, android.animation.ValueAnimator):void");
    }

    public static final void onAnimationUpdate$3(AUListenerS235S0200000_33 aUListenerS235S0200000_33, ValueAnimator valueAnimator) {
        ((C21693119v7) aUListenerS235S0200000_33.l0).LJII = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        ((C426320Gne) aUListenerS235S0200000_33.l1).LIZ(((C21693119v7) aUListenerS235S0200000_33.l0).LJII, false);
    }

    public static final void onAnimationUpdate$4(AUListenerS235S0200000_33 aUListenerS235S0200000_33, ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        ((AppBarLayout$Behavior) aUListenerS235S0200000_33.l0).setTopAndBottomOffset(iIntValue);
        C21648419nu c21648419nu = ((FriendsV3NavHideOnScrollAssem) aUListenerS235S0200000_33.l1).LLJI;
        if (c21648419nu != null) {
            c21648419nu.LIZJ(iIntValue);
        }
    }

    public static final void onAnimationUpdate$5(AUListenerS235S0200000_33 aUListenerS235S0200000_33, ValueAnimator valueAnimator) {
        C21646519nb c21646519nb = (C21646519nb) aUListenerS235S0200000_33.l0;
        View view = (View) aUListenerS235S0200000_33.l1;
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        c21646519nb.getClass();
        C21646519nb.LJIIJJI(iIntValue, view);
    }

    public static final void onAnimationUpdate$6(AUListenerS235S0200000_33 aUListenerS235S0200000_33, ValueAnimator valueAnimator) {
        C1AHS c1ahs = (C1AHS) aUListenerS235S0200000_33.l0;
        C1AHV c1ahv = (C1AHV) aUListenerS235S0200000_33.l1;
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        c1ahs.getClass();
        C786410Ut5.Jc(c1ahv.LL, fFloatValue);
        C786410Ut5.Jc(c1ahv.LLILLJJLI, fFloatValue);
    }

    public static final void onAnimationUpdate$7(AUListenerS235S0200000_33 aUListenerS235S0200000_33, ValueAnimator valueAnimator) {
        C21649019o0 c21649019o0 = (C21649019o0) aUListenerS235S0200000_33.l0;
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = (ValueAnimator.AnimatorUpdateListener) aUListenerS235S0200000_33.l1;
        Matrix matrix = c21649019o0.LLJJIJI;
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        int i = 0;
        do {
            c21649019o0.LLJJI[i] = ((1.0f - fFloatValue) * c21649019o0.LLJILLL[i]) + (c21649019o0.LLJJ[i] * fFloatValue);
            i++;
        } while (i < 9);
        matrix.setValues(c21649019o0.LLJJI);
        c21649019o0.LLJIJIL.set(c21649019o0.LLJJIJI);
        c21649019o0.LJFF();
        if (animatorUpdateListener != null) {
            animatorUpdateListener.onAnimationUpdate(valueAnimator);
        }
    }

    public static final void onAnimationUpdate$8(AUListenerS235S0200000_33 aUListenerS235S0200000_33, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        C21582219dE c21582219dE = (C21582219dE) aUListenerS235S0200000_33.l1;
        C21582319dF c21582319dF = (C21582319dF) aUListenerS235S0200000_33.l0;
        c21582219dE.getClass();
        C21582219dE.LIZLLL(fFloatValue, c21582319dF);
        ((C21582219dE) aUListenerS235S0200000_33.l1).LIZ(fFloatValue, (C21582319dF) aUListenerS235S0200000_33.l0, false);
        ((C21582219dE) aUListenerS235S0200000_33.l1).invalidateSelf();
    }

    public static final void onAnimationUpdate$9(AUListenerS235S0200000_33 aUListenerS235S0200000_33, ValueAnimator valueAnimator) {
        ((C2188881Ala) aUListenerS235S0200000_33.l1).LJFF(((Integer) ((ValueAnimator) aUListenerS235S0200000_33.l0).getAnimatedValue()).intValue());
    }

    public AUListenerS235S0200000_33(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
