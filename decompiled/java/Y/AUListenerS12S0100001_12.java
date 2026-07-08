package Y;

import X.C15CZ;
import X.C16FZ;
import X.C19737412Ke;
import X.C20480615Ca;
import X.C786410Ut5;
import X.InterfaceC782600Umw;
import android.animation.ValueAnimator;

/* JADX INFO: loaded from: classes13.dex */
public class AUListenerS12S0100001_12 implements ValueAnimator.AnimatorUpdateListener {
    public final int $t;
    public float f1;
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

    public static final void onAnimationUpdate$0(AUListenerS12S0100001_12 aUListenerS12S0100001_12, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        int i = (int) (255 * (fFloatValue / aUListenerS12S0100001_12.f1));
        C19737412Ke expandingCircleViewFromXml = ((C20480615Ca) aUListenerS12S0100001_12.l0).getExpandingCircleViewFromXml();
        if (expandingCircleViewFromXml != null) {
            expandingCircleViewFromXml.LLILLL = fFloatValue;
            expandingCircleViewFromXml.LLILZ = i;
            expandingCircleViewFromXml.invalidate();
        }
        if (valueAnimator.getAnimatedFraction() >= 1.0d) {
            C16FZ liveBroadcastLoadingViewFromXml = ((C20480615Ca) aUListenerS12S0100001_12.l0).getLiveBroadcastLoadingViewFromXml();
            if (liveBroadcastLoadingViewFromXml != null) {
                C786410Ut5.LLLIZZ(liveBroadcastLoadingViewFromXml, 0);
            }
            InterfaceC782600Umw interfaceC782600Umw = ((C20480615Ca) aUListenerS12S0100001_12.l0).LLJI;
            if (interfaceC782600Umw != null) {
                interfaceC782600Umw.t8();
            }
        }
    }

    public static final void onAnimationUpdate$1(AUListenerS12S0100001_12 aUListenerS12S0100001_12, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        int i = (int) (255 * (fFloatValue / aUListenerS12S0100001_12.f1));
        C19737412Ke expandingCircleViewFromXml = ((C15CZ) aUListenerS12S0100001_12.l0).getExpandingCircleViewFromXml();
        if (expandingCircleViewFromXml != null) {
            expandingCircleViewFromXml.LLILLL = fFloatValue;
            expandingCircleViewFromXml.LLILZ = i;
            expandingCircleViewFromXml.invalidate();
        }
        if (valueAnimator.getAnimatedFraction() >= 1.0d) {
            C16FZ liveBroadcastLoadingViewFromXml = ((C15CZ) aUListenerS12S0100001_12.l0).getLiveBroadcastLoadingViewFromXml();
            if (liveBroadcastLoadingViewFromXml != null) {
                C786410Ut5.LLLIZZ(liveBroadcastLoadingViewFromXml, 0);
            }
            InterfaceC782600Umw interfaceC782600Umw = ((C15CZ) aUListenerS12S0100001_12.l0).LLJIJIL;
            if (interfaceC782600Umw != null) {
                interfaceC782600Umw.t8();
            }
        }
    }

    public AUListenerS12S0100001_12(float f, Object obj, int i) {
        this.$t = i;
        this.f1 = f;
        this.l0 = obj;
    }
}
