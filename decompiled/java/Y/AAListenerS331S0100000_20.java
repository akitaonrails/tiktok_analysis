package Y;

import X.C1290850jhD;
import X.C1290940jhM;
import X.C1291330jhz;
import X.C1291600jiQ;
import android.animation.Animator;
import com.bytedance.ies.xelement.bytedlottie.LynxBytedLottieView;
import java.util.ArrayList;
import org.json.JSONException;

/* JADX INFO: loaded from: classes21.dex */
public class AAListenerS331S0100000_20 implements Animator.AnimatorListener {
    public final int $t;
    public Object l0;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationCancel$0(this, animator);
                break;
            case 1:
                onAnimationCancel$1(this, animator);
                break;
            case 2:
                onAnimationCancel$2(this, animator);
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) throws JSONException {
        switch (this.$t) {
            case 0:
                onAnimationEnd$0(this, animator);
                break;
            case 1:
                onAnimationEnd$1(this, animator);
                break;
            case 2:
                onAnimationEnd$2(this, animator);
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) throws JSONException {
        switch (this.$t) {
            case 0:
                onAnimationRepeat$0(this, animator);
                break;
            case 1:
                onAnimationRepeat$1(this, animator);
                break;
            case 2:
                onAnimationRepeat$2(this, animator);
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
            case 2:
                onAnimationStart$2(this, animator);
                break;
        }
    }

    public AAListenerS331S0100000_20(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onAnimationCancel$0(AAListenerS331S0100000_20 aAListenerS331S0100000_20, Animator animator) {
        ((Animator.AnimatorListener) aAListenerS331S0100000_20.l0).onAnimationCancel(animator);
    }

    public static final void onAnimationCancel$1(AAListenerS331S0100000_20 aAListenerS331S0100000_20, Animator animator) {
        int frame;
        float f;
        C1291600jiQ composition;
        LynxBytedLottieView lynxBytedLottieView = (LynxBytedLottieView) aAListenerS331S0100000_20.l0;
        C1291330jhz c1291330jhz = (C1291330jhz) lynxBytedLottieView.mView;
        if (c1291330jhz != null) {
            frame = c1291330jhz.getFrame();
        } else {
            frame = 0;
        }
        C1291330jhz c1291330jhz2 = (C1291330jhz) ((LynxBytedLottieView) aAListenerS331S0100000_20.l0).mView;
        if (c1291330jhz2 != null && (composition = c1291330jhz2.getComposition()) != null) {
            f = composition.LJIIJ - composition.LJIIIZ;
        } else {
            f = 0.0f;
        }
        LynxBytedLottieView lynxBytedLottieView2 = (LynxBytedLottieView) aAListenerS331S0100000_20.l0;
        lynxBytedLottieView.LJJJIL("cancel", lynxBytedLottieView.LJJIJ(frame, (int) f, lynxBytedLottieView2.LLIZ, lynxBytedLottieView2.LLJJ));
        ((LynxBytedLottieView) aAListenerS331S0100000_20.l0).LLJJIJIIJIL.clear();
    }

    public static final void onAnimationCancel$2(AAListenerS331S0100000_20 aAListenerS331S0100000_20, Animator animator) {
        int frame;
        C1291600jiQ composition;
        C1290850jhD c1290850jhD = (C1290850jhD) aAListenerS331S0100000_20.l0;
        C1291330jhz c1291330jhz = (C1291330jhz) c1290850jhD.LLLLLILLIL;
        if (c1291330jhz == null) {
            frame = 0;
        } else {
            frame = c1291330jhz.getFrame();
        }
        C1291330jhz c1291330jhz2 = (C1291330jhz) ((C1290850jhD) aAListenerS331S0100000_20.l0).LLLLLILLIL;
        float f = 0.0f;
        if (c1291330jhz2 != null && (composition = c1291330jhz2.getComposition()) != null) {
            f = composition.LJIIJ - composition.LJIIIZ;
        }
        C1290850jhD c1290850jhD2 = (C1290850jhD) aAListenerS331S0100000_20.l0;
        c1290850jhD.LJZ("cancel", C1290850jhD.LJLLI(frame, (int) f, c1290850jhD2.LLLLZ, c1290850jhD2.LLLZI));
        ((ArrayList) ((C1290850jhD) aAListenerS331S0100000_20.l0).LLLZL).clear();
    }

    public static final void onAnimationEnd$0(AAListenerS331S0100000_20 aAListenerS331S0100000_20, Animator animator) {
        ((Animator.AnimatorListener) aAListenerS331S0100000_20.l0).onAnimationEnd(animator);
    }

    public static final void onAnimationEnd$1(AAListenerS331S0100000_20 aAListenerS331S0100000_20, Animator animator) throws JSONException {
        int frame;
        float f;
        Float fValueOf;
        Float fValueOf2;
        float minFrame;
        LynxBytedLottieView lynxBytedLottieView = (LynxBytedLottieView) aAListenerS331S0100000_20.l0;
        T t = lynxBytedLottieView.mView;
        C1291330jhz c1291330jhz = (C1291330jhz) t;
        if (c1291330jhz != null) {
            C1291330jhz c1291330jhz2 = (C1291330jhz) t;
            if (lynxBytedLottieView.LL) {
                minFrame = c1291330jhz2.getMaxFrame();
            } else {
                minFrame = c1291330jhz2.getMinFrame();
            }
            c1291330jhz.setFrame((int) minFrame);
        }
        LynxBytedLottieView lynxBytedLottieView2 = (LynxBytedLottieView) aAListenerS331S0100000_20.l0;
        C1291330jhz c1291330jhz3 = (C1291330jhz) lynxBytedLottieView2.mView;
        if (c1291330jhz3 != null) {
            frame = c1291330jhz3.getFrame();
        } else {
            frame = 0;
        }
        C1291600jiQ composition = ((C1291330jhz) ((LynxBytedLottieView) aAListenerS331S0100000_20.l0).mView).getComposition();
        if (composition != null) {
            f = composition.LJIIJ - composition.LJIIIZ;
        } else {
            f = 0.0f;
        }
        LynxBytedLottieView lynxBytedLottieView3 = (LynxBytedLottieView) aAListenerS331S0100000_20.l0;
        lynxBytedLottieView2.LJJJIL("completion", lynxBytedLottieView2.LJJIJ(frame, (int) f, lynxBytedLottieView3.LLIZ, lynxBytedLottieView3.LLJJ));
        LynxBytedLottieView lynxBytedLottieView4 = (LynxBytedLottieView) aAListenerS331S0100000_20.l0;
        C1290940jhM c1290940jhM = lynxBytedLottieView4.LLJJIJIL;
        String str = lynxBytedLottieView4.LLJI;
        String str2 = lynxBytedLottieView4.LLJJJJ;
        Float fValueOf3 = Float.valueOf(lynxBytedLottieView4.LLJJJIL.LIZ());
        C1291600jiQ c1291600jiQ = ((LynxBytedLottieView) aAListenerS331S0100000_20.l0).LLJJJ;
        Float fValueOf4 = null;
        if (c1291600jiQ != null) {
            fValueOf = Float.valueOf(c1291600jiQ.LJIIJJI);
        } else {
            fValueOf = null;
        }
        C1291600jiQ c1291600jiQ2 = ((LynxBytedLottieView) aAListenerS331S0100000_20.l0).LLJJJ;
        if (c1291600jiQ2 != null) {
            fValueOf2 = Float.valueOf(c1291600jiQ2.LJIIJ - c1291600jiQ2.LJIIIZ);
        } else {
            fValueOf2 = null;
        }
        C1291600jiQ c1291600jiQ3 = ((LynxBytedLottieView) aAListenerS331S0100000_20.l0).LLJJJ;
        if (c1291600jiQ3 != null) {
            fValueOf4 = Float.valueOf(c1291600jiQ3.LIZIZ());
        }
        c1290940jhM.LIZJ(str, str2, fValueOf3, fValueOf, fValueOf2, fValueOf4, Boolean.FALSE);
        ((LynxBytedLottieView) aAListenerS331S0100000_20.l0).LLJJIJIIJIL.clear();
    }

    public static final void onAnimationEnd$2(AAListenerS331S0100000_20 aAListenerS331S0100000_20, Animator animator) throws JSONException {
        int frame;
        float f;
        Float fValueOf;
        Float fValueOf2;
        float minFrame;
        C1290850jhD c1290850jhD = (C1290850jhD) aAListenerS331S0100000_20.l0;
        T t = c1290850jhD.LLLLLILLIL;
        C1291330jhz c1291330jhz = (C1291330jhz) t;
        if (c1291330jhz != null) {
            C1291330jhz c1291330jhz2 = (C1291330jhz) t;
            if (c1290850jhD.LLLLLLLZIL) {
                minFrame = c1291330jhz2.getMaxFrame();
            } else {
                minFrame = c1291330jhz2.getMinFrame();
            }
            c1291330jhz.setFrame((int) minFrame);
        }
        C1290850jhD c1290850jhD2 = (C1290850jhD) aAListenerS331S0100000_20.l0;
        C1291330jhz c1291330jhz3 = (C1291330jhz) c1290850jhD2.LLLLLILLIL;
        if (c1291330jhz3 == null) {
            frame = 0;
        } else {
            frame = c1291330jhz3.getFrame();
        }
        C1291600jiQ composition = ((C1291330jhz) ((C1290850jhD) aAListenerS331S0100000_20.l0).LLLLLILLIL).getComposition();
        if (composition == null) {
            f = 0.0f;
        } else {
            f = composition.LJIIJ - composition.LJIIIZ;
        }
        C1290850jhD c1290850jhD3 = (C1290850jhD) aAListenerS331S0100000_20.l0;
        c1290850jhD2.LJZ("completion", C1290850jhD.LJLLI(frame, (int) f, c1290850jhD3.LLLLZ, c1290850jhD3.LLLZI));
        C1290850jhD c1290850jhD4 = (C1290850jhD) aAListenerS331S0100000_20.l0;
        C1290940jhM c1290940jhM = c1290850jhD4.LLLZLL;
        String str = c1290850jhD4.LLLLZLL;
        String str2 = c1290850jhD4.LLLZZIL;
        Float fValueOf3 = Float.valueOf(c1290850jhD4.LLLZZ.LIZ());
        C1291600jiQ c1291600jiQ = ((C1290850jhD) aAListenerS331S0100000_20.l0).LLLZLZ;
        Float fValueOf4 = null;
        if (c1291600jiQ == null) {
            fValueOf = null;
        } else {
            fValueOf = Float.valueOf(c1291600jiQ.LJIIJJI);
        }
        C1291600jiQ c1291600jiQ2 = ((C1290850jhD) aAListenerS331S0100000_20.l0).LLLZLZ;
        if (c1291600jiQ2 == null) {
            fValueOf2 = null;
        } else {
            fValueOf2 = Float.valueOf(c1291600jiQ2.LJIIJ - c1291600jiQ2.LJIIIZ);
        }
        C1291600jiQ c1291600jiQ3 = ((C1290850jhD) aAListenerS331S0100000_20.l0).LLLZLZ;
        if (c1291600jiQ3 != null) {
            fValueOf4 = Float.valueOf(c1291600jiQ3.LIZIZ());
        }
        c1290940jhM.LIZJ(str, str2, fValueOf3, fValueOf, fValueOf2, fValueOf4, Boolean.FALSE);
        ((ArrayList) ((C1290850jhD) aAListenerS331S0100000_20.l0).LLLZL).clear();
    }

    public static final void onAnimationRepeat$0(AAListenerS331S0100000_20 aAListenerS331S0100000_20, Animator animator) {
        ((Animator.AnimatorListener) aAListenerS331S0100000_20.l0).onAnimationRepeat(animator);
    }

    public static final void onAnimationRepeat$1(AAListenerS331S0100000_20 aAListenerS331S0100000_20, Animator animator) throws JSONException {
        int frame;
        float f;
        Float fValueOf;
        Float fValueOf2;
        LynxBytedLottieView lynxBytedLottieView = (LynxBytedLottieView) aAListenerS331S0100000_20.l0;
        lynxBytedLottieView.LLIZ++;
        C1291330jhz c1291330jhz = (C1291330jhz) lynxBytedLottieView.mView;
        if (c1291330jhz != null) {
            frame = c1291330jhz.getFrame();
        } else {
            frame = 0;
        }
        C1291600jiQ composition = ((C1291330jhz) ((LynxBytedLottieView) aAListenerS331S0100000_20.l0).mView).getComposition();
        if (composition != null) {
            f = composition.LJIIJ - composition.LJIIIZ;
        } else {
            f = 0.0f;
        }
        LynxBytedLottieView lynxBytedLottieView2 = (LynxBytedLottieView) aAListenerS331S0100000_20.l0;
        lynxBytedLottieView.LJJJIL("repeat", lynxBytedLottieView.LJJIJ(frame, (int) f, lynxBytedLottieView2.LLIZ, lynxBytedLottieView2.LLJJ));
        ((LynxBytedLottieView) aAListenerS331S0100000_20.l0).LLJJIJIIJIL.clear();
        LynxBytedLottieView lynxBytedLottieView3 = (LynxBytedLottieView) aAListenerS331S0100000_20.l0;
        C1290940jhM c1290940jhM = lynxBytedLottieView3.LLJJIJIL;
        String str = lynxBytedLottieView3.LLJI;
        String str2 = lynxBytedLottieView3.LLJJJJ;
        Float fValueOf3 = Float.valueOf(lynxBytedLottieView3.LLJJJIL.LIZ());
        C1291600jiQ c1291600jiQ = ((LynxBytedLottieView) aAListenerS331S0100000_20.l0).LLJJJ;
        Float fValueOf4 = null;
        if (c1291600jiQ != null) {
            fValueOf = Float.valueOf(c1291600jiQ.LJIIJJI);
        } else {
            fValueOf = null;
        }
        C1291600jiQ c1291600jiQ2 = ((LynxBytedLottieView) aAListenerS331S0100000_20.l0).LLJJJ;
        if (c1291600jiQ2 != null) {
            fValueOf2 = Float.valueOf(c1291600jiQ2.LJIIJ - c1291600jiQ2.LJIIIZ);
        } else {
            fValueOf2 = null;
        }
        C1291600jiQ c1291600jiQ3 = ((LynxBytedLottieView) aAListenerS331S0100000_20.l0).LLJJJ;
        if (c1291600jiQ3 != null) {
            fValueOf4 = Float.valueOf(c1291600jiQ3.LIZIZ());
        }
        c1290940jhM.LIZJ(str, str2, fValueOf3, fValueOf, fValueOf2, fValueOf4, Boolean.TRUE);
    }

    public static final void onAnimationRepeat$2(AAListenerS331S0100000_20 aAListenerS331S0100000_20, Animator animator) throws JSONException {
        int frame;
        float f;
        Float fValueOf;
        Float fValueOf2;
        C1290850jhD c1290850jhD = (C1290850jhD) aAListenerS331S0100000_20.l0;
        c1290850jhD.LLLLZ++;
        C1291330jhz c1291330jhz = (C1291330jhz) c1290850jhD.LLLLLILLIL;
        if (c1291330jhz == null) {
            frame = 0;
        } else {
            frame = c1291330jhz.getFrame();
        }
        C1291600jiQ composition = ((C1291330jhz) ((C1290850jhD) aAListenerS331S0100000_20.l0).LLLLLILLIL).getComposition();
        if (composition == null) {
            f = 0.0f;
        } else {
            f = composition.LJIIJ - composition.LJIIIZ;
        }
        C1290850jhD c1290850jhD2 = (C1290850jhD) aAListenerS331S0100000_20.l0;
        c1290850jhD.LJZ("repeat", C1290850jhD.LJLLI(frame, (int) f, c1290850jhD2.LLLLZ, c1290850jhD2.LLLZI));
        ((ArrayList) ((C1290850jhD) aAListenerS331S0100000_20.l0).LLLZL).clear();
        C1290850jhD c1290850jhD3 = (C1290850jhD) aAListenerS331S0100000_20.l0;
        C1290940jhM c1290940jhM = c1290850jhD3.LLLZLL;
        String str = c1290850jhD3.LLLLZLL;
        String str2 = c1290850jhD3.LLLZZIL;
        Float fValueOf3 = Float.valueOf(c1290850jhD3.LLLZZ.LIZ());
        C1291600jiQ c1291600jiQ = ((C1290850jhD) aAListenerS331S0100000_20.l0).LLLZLZ;
        Float fValueOf4 = null;
        if (c1291600jiQ == null) {
            fValueOf = null;
        } else {
            fValueOf = Float.valueOf(c1291600jiQ.LJIIJJI);
        }
        C1291600jiQ c1291600jiQ2 = ((C1290850jhD) aAListenerS331S0100000_20.l0).LLLZLZ;
        if (c1291600jiQ2 == null) {
            fValueOf2 = null;
        } else {
            fValueOf2 = Float.valueOf(c1291600jiQ2.LJIIJ - c1291600jiQ2.LJIIIZ);
        }
        C1291600jiQ c1291600jiQ3 = ((C1290850jhD) aAListenerS331S0100000_20.l0).LLLZLZ;
        if (c1291600jiQ3 != null) {
            fValueOf4 = Float.valueOf(c1291600jiQ3.LIZIZ());
        }
        c1290940jhM.LIZJ(str, str2, fValueOf3, fValueOf, fValueOf2, fValueOf4, Boolean.TRUE);
    }

    public static final void onAnimationStart$0(AAListenerS331S0100000_20 aAListenerS331S0100000_20, Animator animator) {
        ((Animator.AnimatorListener) aAListenerS331S0100000_20.l0).onAnimationStart(animator);
    }

    public static final void onAnimationStart$1(AAListenerS331S0100000_20 aAListenerS331S0100000_20, Animator animator) {
        float f;
        C1291600jiQ composition;
        LynxBytedLottieView lynxBytedLottieView = (LynxBytedLottieView) aAListenerS331S0100000_20.l0;
        int frame = 0;
        lynxBytedLottieView.LLIZ = 0;
        C1291330jhz c1291330jhz = (C1291330jhz) lynxBytedLottieView.mView;
        if (c1291330jhz != null) {
            frame = c1291330jhz.getFrame();
        }
        C1291330jhz c1291330jhz2 = (C1291330jhz) ((LynxBytedLottieView) aAListenerS331S0100000_20.l0).mView;
        if (c1291330jhz2 != null && (composition = c1291330jhz2.getComposition()) != null) {
            f = composition.LJIIJ - composition.LJIIIZ;
        } else {
            f = 0.0f;
        }
        LynxBytedLottieView lynxBytedLottieView2 = (LynxBytedLottieView) aAListenerS331S0100000_20.l0;
        lynxBytedLottieView.LJJJIL("start", lynxBytedLottieView.LJJIJ(frame, (int) f, lynxBytedLottieView2.LLIZ, lynxBytedLottieView2.LLJJ));
    }

    public static final void onAnimationStart$2(AAListenerS331S0100000_20 aAListenerS331S0100000_20, Animator animator) {
        C1291600jiQ composition;
        C1290850jhD c1290850jhD = (C1290850jhD) aAListenerS331S0100000_20.l0;
        int frame = 0;
        c1290850jhD.LLLLZ = 0;
        C1291330jhz c1291330jhz = (C1291330jhz) c1290850jhD.LLLLLILLIL;
        if (c1291330jhz != null) {
            frame = c1291330jhz.getFrame();
        }
        C1291330jhz c1291330jhz2 = (C1291330jhz) ((C1290850jhD) aAListenerS331S0100000_20.l0).LLLLLILLIL;
        float f = 0.0f;
        if (c1291330jhz2 != null && (composition = c1291330jhz2.getComposition()) != null) {
            f = composition.LJIIJ - composition.LJIIIZ;
        }
        C1290850jhD c1290850jhD2 = (C1290850jhD) aAListenerS331S0100000_20.l0;
        c1290850jhD.LJZ("start", C1290850jhD.LJLLI(frame, (int) f, c1290850jhD2.LLLLZ, c1290850jhD2.LLLZI));
    }
}
