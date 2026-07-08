package Y;

import X.C786410Ut5;
import X.C936503lL;
import X.InterfaceC10458047c;
import android.animation.Animator;
import android.animation.ValueAnimator;
import com.ss.android.ugc.aweme.ecommerce.base.sku.assem.reusedassem.SkuPanelBaseReusedAssem;

/* JADX INFO: loaded from: classes2.dex */
public class AAListenerS314S0100000_1 implements Animator.AnimatorListener {
    public final int $t;
    public Object l0;

    public static final void onAnimationCancel$1(AAListenerS314S0100000_1 aAListenerS314S0100000_1, Animator animator) {
    }

    public static final void onAnimationRepeat$0(AAListenerS314S0100000_1 aAListenerS314S0100000_1, Animator animator) {
    }

    public static final void onAnimationRepeat$1(AAListenerS314S0100000_1 aAListenerS314S0100000_1, Animator animator) {
    }

    public static final void onAnimationStart$1(AAListenerS314S0100000_1 aAListenerS314S0100000_1, Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationCancel$0(this, animator);
                break;
            case 1:
                onAnimationCancel$1(this, animator);
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationEnd$0(this, animator);
                break;
            case 1:
                onAnimationEnd$1(this, animator);
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationRepeat$0(this, animator);
                break;
            case 1:
                onAnimationRepeat$1(this, animator);
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationStart$0(this, animator);
                break;
            case 1:
                onAnimationStart$1(this, animator);
                break;
        }
    }

    public AAListenerS314S0100000_1(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onAnimationCancel$0(AAListenerS314S0100000_1 aAListenerS314S0100000_1, Animator animator) {
        C936503lL c936503lL = (C936503lL) aAListenerS314S0100000_1.l0;
        ValueAnimator valueAnimator = c936503lL.LLILZIL;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        c936503lL.LLILZIL = null;
        C786410Ut5.G5(((C936503lL) aAListenerS314S0100000_1.l0).LL, 1.0f);
        C936503lL c936503lL2 = (C936503lL) aAListenerS314S0100000_1.l0;
        c936503lL2.LLJI = false;
        c936503lL2.LLJIJIL = null;
    }

    public static final void onAnimationEnd$0(AAListenerS314S0100000_1 aAListenerS314S0100000_1, Animator animator) {
        C936503lL c936503lL = (C936503lL) aAListenerS314S0100000_1.l0;
        ValueAnimator valueAnimator = c936503lL.LLILZIL;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        c936503lL.LLILZIL = null;
        C786410Ut5.LLZZ(((C936503lL) aAListenerS314S0100000_1.l0).LL, 8);
        C786410Ut5.G5(((C936503lL) aAListenerS314S0100000_1.l0).LL, 1.0f);
        C936503lL c936503lL2 = (C936503lL) aAListenerS314S0100000_1.l0;
        c936503lL2.LLJI = false;
        c936503lL2.LLJIJIL = null;
    }

    public static final void onAnimationEnd$1(AAListenerS314S0100000_1 aAListenerS314S0100000_1, Animator animator) {
        ((SkuPanelBaseReusedAssem) ((InterfaceC10458047c) aAListenerS314S0100000_1.l0)).getViewModel().LLJLIL = null;
    }

    public static final void onAnimationStart$0(AAListenerS314S0100000_1 aAListenerS314S0100000_1, Animator animator) {
        ((C936503lL) aAListenerS314S0100000_1.l0).LL.getVisibility();
    }
}
