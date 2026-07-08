package Y;

import X.C1664680tQA;
import X.C786410Ut5;
import android.animation.ValueAnimator;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import kotlin.jvm.internal.AwS14S0000001_29;
import kotlin.jvm.internal.AwS2S0000002_29;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes30.dex */
public class AUListenerS0S1210001_29 implements ValueAnimator.AnimatorUpdateListener {
    public final int $t;
    public float f4;
    public Object l1;
    public Object l2;
    public String s0;
    public boolean z3;

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

    public static final void onAnimationUpdate$0(AUListenerS0S1210001_29 aUListenerS0S1210001_29, ValueAnimator valueAnimator) {
        Float f;
        if (!Intrinsics.LJFF(((TuxTextView) aUListenerS0S1210001_29.l1).getText(), aUListenerS0S1210001_29.s0)) {
            ((TuxTextView) aUListenerS0S1210001_29.l1).setText(aUListenerS0S1210001_29.s0);
        }
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            float fFloatValue = f.floatValue();
            float f2 = 1 - fFloatValue;
            float f3 = (1.0f - (fFloatValue * 0.2f)) * aUListenerS0S1210001_29.f4;
            if (aUListenerS0S1210001_29.z3) {
                C1664680tQA c1664680tQA = (C1664680tQA) aUListenerS0S1210001_29.l2;
                if (c1664680tQA != null) {
                    c1664680tQA.LIZLLL(new AwS2S0000002_29(f3, f2, 1), true);
                }
            } else {
                C1664680tQA c1664680tQA2 = (C1664680tQA) aUListenerS0S1210001_29.l2;
                if (c1664680tQA2 != null) {
                    c1664680tQA2.LIZLLL(new AwS14S0000001_29(f2, 4), true);
                }
            }
            C786410Ut5.B5((TuxTextView) aUListenerS0S1210001_29.l1, f2);
            if (aUListenerS0S1210001_29.z3) {
                C786410Ut5.ic((TuxTextView) aUListenerS0S1210001_29.l1, f3);
                C786410Ut5.Dc((TuxTextView) aUListenerS0S1210001_29.l1, f3);
            }
        }
    }

    public static final void onAnimationUpdate$1(AUListenerS0S1210001_29 aUListenerS0S1210001_29, ValueAnimator valueAnimator) {
        Float f;
        if (!Intrinsics.LJFF(((TuxTextView) aUListenerS0S1210001_29.l1).getText(), aUListenerS0S1210001_29.s0)) {
            ((TuxTextView) aUListenerS0S1210001_29.l1).setText(aUListenerS0S1210001_29.s0);
        }
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            float fFloatValue = f.floatValue();
            float f2 = ((0.2f * fFloatValue) + 0.8f) * aUListenerS0S1210001_29.f4;
            if (aUListenerS0S1210001_29.z3) {
                C1664680tQA c1664680tQA = (C1664680tQA) aUListenerS0S1210001_29.l2;
                if (c1664680tQA != null) {
                    c1664680tQA.LIZLLL(new AwS2S0000002_29(f2, fFloatValue, 2), true);
                }
            } else {
                C1664680tQA c1664680tQA2 = (C1664680tQA) aUListenerS0S1210001_29.l2;
                if (c1664680tQA2 != null) {
                    c1664680tQA2.LIZLLL(new AwS14S0000001_29(fFloatValue, 6), true);
                }
            }
            C786410Ut5.B5((TuxTextView) aUListenerS0S1210001_29.l1, fFloatValue);
            if (aUListenerS0S1210001_29.z3) {
                C786410Ut5.ic((TuxTextView) aUListenerS0S1210001_29.l1, f2);
                C786410Ut5.Dc((TuxTextView) aUListenerS0S1210001_29.l1, f2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AUListenerS0S1210001_29(TuxTextView tuxTextView, TuxTextView tuxTextView2, String str, float f, boolean z, C1664680tQA<BaseStickerModel> c1664680tQA) {
        this.$t = c1664680tQA;
        this.l1 = tuxTextView;
        this.s0 = tuxTextView2;
        this.f4 = str;
        this.z3 = f;
        this.l2 = z;
    }
}
