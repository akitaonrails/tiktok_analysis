package Y;

import X.C1215180hjA;
import X.C1262780ixw;
import X.C268330AfP;
import X.C418440Gaw;
import X.C786410Ut5;
import X.C814420VxA;
import android.animation.ValueAnimator;
import android.view.ViewGroup;
import com.ss.android.ugc.profile.business.ur.platform.HeaderRecommendUserCardMineComponent;

/* JADX INFO: loaded from: classes20.dex */
public class AUListenerS16S0102000_19 implements ValueAnimator.AnimatorUpdateListener {
    public final int $t;
    public int i1;
    public int i2;
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

    public static final void onAnimationUpdate$0(AUListenerS16S0102000_19 aUListenerS16S0102000_19, ValueAnimator valueAnimator) {
        float fFloatValue;
        Float f;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            fFloatValue = f.floatValue();
        } else {
            fFloatValue = 1.0f;
        }
        ViewGroup.LayoutParams layoutParams = ((C1215180hjA) aUListenerS16S0102000_19.l0).getAnchorSubtitleFlowFromXml().getLayoutParams();
        layoutParams.height = C814420VxA.LIZIZ(aUListenerS16S0102000_19.i1 * fFloatValue);
        if (((C1215180hjA) aUListenerS16S0102000_19.l0).getAnchorDescFromXml().getMeasuredWidth() < aUListenerS16S0102000_19.i2) {
            layoutParams.width = (int) Math.ceil(((C1215180hjA) aUListenerS16S0102000_19.l0).getAnchorDescFromXml().getMeasuredWidth() + (fFloatValue * (aUListenerS16S0102000_19.i2 - ((C1215180hjA) aUListenerS16S0102000_19.l0).getAnchorDescFromXml().getMeasuredWidth())));
        }
        C786410Ut5.a7(((C1215180hjA) aUListenerS16S0102000_19.l0).getAnchorSubtitleFlowFromXml(), layoutParams);
    }

    public static final void onAnimationUpdate$1(AUListenerS16S0102000_19 aUListenerS16S0102000_19, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        C1262780ixw c1262780ixwZp = ((HeaderRecommendUserCardMineComponent) aUListenerS16S0102000_19.l0).zp();
        ViewGroup.LayoutParams layoutParams = c1262780ixwZp.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = (int) (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(250)) * fFloatValue);
            C786410Ut5.W5(c1262780ixwZp, layoutParams);
            if (!C268330AfP.LJIIIZ()) {
                float f = 1 - fFloatValue;
                ((HeaderRecommendUserCardMineComponent) aUListenerS16S0102000_19.l0).Ep((int) (aUListenerS16S0102000_19.i1 * f));
                ((HeaderRecommendUserCardMineComponent) aUListenerS16S0102000_19.l0).Ap((int) (aUListenerS16S0102000_19.i2 * f));
                ((HeaderRecommendUserCardMineComponent) aUListenerS16S0102000_19.l0).Bp(f);
                return;
            }
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    public AUListenerS16S0102000_19(Object obj, int i, int i2, int i3) {
        this.$t = i3;
        this.l0 = obj;
        this.i1 = i;
        this.i2 = i2;
    }
}
