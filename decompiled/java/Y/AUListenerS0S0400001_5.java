package Y;

import X.C0FFE;
import X.C0FTH;
import X.C1664680tQA;
import X.C390660FTk;
import X.C817403Hg;
import android.animation.ValueAnimator;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import kotlin.jvm.internal.AwS14S0100002_5;

/* JADX INFO: loaded from: classes6.dex */
public class AUListenerS0S0400001_5 implements ValueAnimator.AnimatorUpdateListener {
    public final int $t;
    public float f4;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

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

    public static final void onAnimationUpdate$0(AUListenerS0S0400001_5 aUListenerS0S0400001_5, ValueAnimator valueAnimator) {
        float scale;
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        C817403Hg c817403Hg = new C817403Hg();
        c817403Hg.element = (1 - fFloatValue) * aUListenerS0S0400001_5.f4;
        if (((C0FTH) aUListenerS0S0400001_5.l0).LIZJ().LLJJI) {
            scale = c817403Hg.element;
        } else {
            scale = ((C0FFE) aUListenerS0S0400001_5.l1).LJJIIJZLJL().getScale();
        }
        c817403Hg.element = scale;
        if (scale == 0.0f) {
            c817403Hg.element = 1.0E-4f;
        }
        ((C1664680tQA) aUListenerS0S0400001_5.l3).LIZLLL(new AwS14S0100002_5(((C0FFE) aUListenerS0S0400001_5.l1).LJJIIJZLJL().getTranslateX() + (C390660FTk.LIZIZ * (fFloatValue - ((C817403Hg) aUListenerS0S0400001_5.l2).element)), ((C0FFE) aUListenerS0S0400001_5.l1).LJJIIJZLJL().getTranslateY() + (C390660FTk.LIZJ * (fFloatValue - ((C817403Hg) aUListenerS0S0400001_5.l2).element)), c817403Hg, 0), true);
        ((C817403Hg) aUListenerS0S0400001_5.l2).element = fFloatValue;
    }

    public static final void onAnimationUpdate$1(AUListenerS0S0400001_5 aUListenerS0S0400001_5, ValueAnimator valueAnimator) {
        float scale;
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        C817403Hg c817403Hg = new C817403Hg();
        c817403Hg.element = aUListenerS0S0400001_5.f4 * fFloatValue;
        if (!((C0FTH) aUListenerS0S0400001_5.l0).LIZJ().LLJJI) {
            scale = c817403Hg.element;
        } else {
            scale = ((C0FFE) aUListenerS0S0400001_5.l1).LJJIIJZLJL().getScale();
        }
        c817403Hg.element = scale;
        if (scale == 0.0f) {
            c817403Hg.element = 1.0E-4f;
        }
        ((C1664680tQA) aUListenerS0S0400001_5.l3).LIZLLL(new AwS14S0100002_5(((C0FFE) aUListenerS0S0400001_5.l1).LJJIIJZLJL().getTranslateX() - (C390660FTk.LIZIZ * (fFloatValue - ((C817403Hg) aUListenerS0S0400001_5.l2).element)), ((C0FFE) aUListenerS0S0400001_5.l1).LJJIIJZLJL().getTranslateY() - (C390660FTk.LIZJ * (fFloatValue - ((C817403Hg) aUListenerS0S0400001_5.l2).element)), c817403Hg, 1), true);
        ((C817403Hg) aUListenerS0S0400001_5.l2).element = fFloatValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AUListenerS0S0400001_5(float f, float f2, C0FTH c0fth, C0FFE<? extends StickerModel> c0ffe, C817403Hg c817403Hg, C1664680tQA<BaseStickerModel> c1664680tQA) {
        this.$t = c1664680tQA;
        this.f4 = f;
        this.l0 = f2;
        this.l1 = c0fth;
        this.l2 = c0ffe;
        this.l3 = c817403Hg;
    }
}
