package Y;

import X.AbstractC390720FTq;
import X.C0E48;
import X.C0E55;
import X.C0EZS;
import X.C12P4;
import X.C341940Daq;
import X.C786410Ut5;
import android.animation.ValueAnimator;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.ies.nle.editor_jni.PairIntInt;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;

/* JADX INFO: loaded from: classes6.dex */
public class AUListenerS147S0300000_5 implements ValueAnimator.AnimatorUpdateListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

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

    public static final void onAnimationUpdate$0(AUListenerS147S0300000_5 aUListenerS147S0300000_5, ValueAnimator valueAnimator) {
        Float f;
        int width;
        C0E55 player;
        C0E55 player2;
        SurfaceView surfaceViewLJIJJLI;
        float[] fArr = ((C0EZS) aUListenerS147S0300000_5.l0).LLJL;
        if (fArr == null) {
            return;
        }
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            float fFloatValue = f.floatValue();
            if (((PairIntInt) aUListenerS147S0300000_5.l1) == null) {
                return;
            }
            C0E48 c0e48 = ((C0EZS) aUListenerS147S0300000_5.l0).LLJJJJ;
            if (c0e48 != null && (surfaceViewLJIJJLI = c0e48.LJIJJLI()) != null) {
                width = surfaceViewLJIJJLI.getWidth();
            } else {
                width = 0;
            }
            int first = (width - ((PairIntInt) aUListenerS147S0300000_5.l1).getFirst()) / 2;
            int[] iArr = {(int) fArr[0], (int) fArr[1], (int) fArr[2], (int) fArr[3]};
            if (((Boolean) aUListenerS147S0300000_5.l2).booleanValue()) {
                float f2 = fArr[1] * (1 - fFloatValue);
                float first2 = fArr[2] + ((((PairIntInt) aUListenerS147S0300000_5.l1).getFirst() - fArr[2]) * fFloatValue);
                C0E48 c0e482 = ((C0EZS) aUListenerS147S0300000_5.l0).LLJJJJ;
                if (c0e482 != null && (player2 = c0e482.getPlayer()) != null) {
                    float f3 = fArr[0];
                    player2.LJIILJJIL(f3 + ((first - f3) * fFloatValue), f2, first2, fArr[3] + ((((PairIntInt) aUListenerS147S0300000_5.l1).getSecond() - fArr[3]) * fFloatValue), null);
                }
                ((C0EZS) aUListenerS147S0300000_5.l0).LLLLIL().LJI.invoke(iArr, Float.valueOf(first2 / ((PairIntInt) aUListenerS147S0300000_5.l1).getFirst()), Float.valueOf(f2), Float.valueOf(fFloatValue), Boolean.TRUE);
                return;
            }
            float f4 = fArr[1] * fFloatValue;
            float first3 = ((fArr[2] - ((PairIntInt) aUListenerS147S0300000_5.l1).getFirst()) * fFloatValue) + ((PairIntInt) aUListenerS147S0300000_5.l1).getFirst();
            C0E48 c0e483 = ((C0EZS) aUListenerS147S0300000_5.l0).LLJJJJ;
            if (c0e483 != null && (player = c0e483.getPlayer()) != null) {
                float f5 = first;
                player.LJIILJJIL(f5 + ((fArr[0] - f5) * fFloatValue), f4, first3, ((PairIntInt) aUListenerS147S0300000_5.l1).getSecond() + ((fArr[3] - ((PairIntInt) aUListenerS147S0300000_5.l1).getSecond()) * fFloatValue), null);
            }
            ((C0EZS) aUListenerS147S0300000_5.l0).LLLLIL().LJI.invoke(iArr, Float.valueOf(first3 / ((PairIntInt) aUListenerS147S0300000_5.l1).getFirst()), Float.valueOf(f4), Float.valueOf(fFloatValue), Boolean.FALSE);
        }
    }

    public static final void onAnimationUpdate$1(AUListenerS147S0300000_5 aUListenerS147S0300000_5, ValueAnimator valueAnimator) {
        float fFloatValue;
        Float f;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            fFloatValue = f.floatValue();
        } else {
            fFloatValue = 1.0f;
        }
        double d = ((double) fFloatValue) * 40.0d;
        C12P4 c12p4 = (C12P4) aUListenerS147S0300000_5.l0;
        ViewGroup.LayoutParams layoutParams = c12p4.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = C341940Daq.LIZ(48.0d + d);
            C786410Ut5.W5(c12p4, layoutParams);
            C786410Ut5.wd((TuxTextView) aUListenerS147S0300000_5.l1, -C341940Daq.LIZ(d));
            C786410Ut5.fd((FrameLayout) aUListenerS147S0300000_5.l2, -C341940Daq.LIZ(d));
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    public static final void onAnimationUpdate$2(AUListenerS147S0300000_5 aUListenerS147S0300000_5, ValueAnimator valueAnimator) {
        float fFloatValue;
        Float f;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            fFloatValue = f.floatValue();
        } else {
            fFloatValue = 1.0f;
        }
        double d = ((double) fFloatValue) * 40.0d;
        C12P4 c12p4 = (C12P4) aUListenerS147S0300000_5.l0;
        ViewGroup.LayoutParams layoutParams = c12p4.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = C341940Daq.LIZ(88.0d - d);
            C786410Ut5.W5(c12p4, layoutParams);
            double d2 = ((double) 40) - d;
            C786410Ut5.wd((TuxTextView) aUListenerS147S0300000_5.l1, -C341940Daq.LIZ(d2));
            C786410Ut5.fd((FrameLayout) aUListenerS147S0300000_5.l2, -C341940Daq.LIZ(d2));
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    public static final void onAnimationUpdate$3(AUListenerS147S0300000_5 aUListenerS147S0300000_5, ValueAnimator valueAnimator) {
        Float f;
        float stickerContainerTranslationY = ((AbstractC390720FTq) aUListenerS147S0300000_5.l0).getStickerContainerTranslationY();
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            C786410Ut5.ed((View) aUListenerS147S0300000_5.l1, ((BaseStickerModel) aUListenerS147S0300000_5.l2).getTranslateY() + ((stickerContainerTranslationY - ((BaseStickerModel) aUListenerS147S0300000_5.l2).getTranslateY()) * f.floatValue()));
        }
    }

    public AUListenerS147S0300000_5(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
