package Y;

import X.C786410Ut5;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.feed.adapter.widget.openlive.GoLiveGuideCardWidget;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes8.dex */
public class AUListenerS0S0100002_7 implements ValueAnimator.AnimatorUpdateListener {
    public final int $t;
    public float f1;
    public float f2;
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

    public static final void onAnimationUpdate$0(AUListenerS0S0100002_7 aUListenerS0S0100002_7, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        float f = 1 - fFloatValue;
        C786410Ut5.bd(aUListenerS0S0100002_7.f1 * f, ((GoLiveGuideCardWidget) aUListenerS0S0100002_7.l0).LLJIJIL);
        int childCount = ((GoLiveGuideCardWidget) aUListenerS0S0100002_7.l0).LLJIJIL.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = ((GoLiveGuideCardWidget) aUListenerS0S0100002_7.l0).LLJIJIL.getChildAt(i);
            if (childAt.getId() != R.id.chm) {
                C786410Ut5.T4(childAt, fFloatValue);
            }
        }
        ViewGroup viewGroup = ((GoLiveGuideCardWidget) aUListenerS0S0100002_7.l0).LLJJIJIL;
        if (viewGroup != null) {
            C786410Ut5.bd(fFloatValue * aUListenerS0S0100002_7.f2, viewGroup);
        }
        ViewGroup viewGroup2 = ((GoLiveGuideCardWidget) aUListenerS0S0100002_7.l0).LLJJIJIL;
        if (viewGroup2 != null) {
            C786410Ut5.R4(f, viewGroup2);
        }
    }

    public static final void onAnimationUpdate$1(AUListenerS0S0100002_7 aUListenerS0S0100002_7, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        ViewGroup viewGroup = ((GoLiveGuideCardWidget) aUListenerS0S0100002_7.l0).LLJJIJIL;
        if (viewGroup != null) {
            C786410Ut5.R4(fFloatValue, viewGroup);
        }
        ViewGroup viewGroup2 = ((GoLiveGuideCardWidget) aUListenerS0S0100002_7.l0).LLJJIJIL;
        if (viewGroup2 != null) {
            C786410Ut5.bd((1 - fFloatValue) * aUListenerS0S0100002_7.f1, viewGroup2);
        }
        C786410Ut5.bd(aUListenerS0S0100002_7.f2 * fFloatValue, ((GoLiveGuideCardWidget) aUListenerS0S0100002_7.l0).LLJIJIL);
        int childCount = ((GoLiveGuideCardWidget) aUListenerS0S0100002_7.l0).LLJIJIL.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = ((GoLiveGuideCardWidget) aUListenerS0S0100002_7.l0).LLJIJIL.getChildAt(i);
            if (childAt.getId() != R.id.chm) {
                C786410Ut5.T4(childAt, 1 - fFloatValue);
            }
        }
    }

    public AUListenerS0S0100002_7(GoLiveGuideCardWidget goLiveGuideCardWidget, float f, float f2, int i) {
        this.$t = i;
        this.l0 = goLiveGuideCardWidget;
        this.f1 = f;
        this.f2 = f2;
    }
}
