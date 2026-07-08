package Y;

import X.C786410Ut5;
import android.animation.ValueAnimator;
import android.view.View;
import com.ss.android.ugc.aweme.feed.adapter.widget.aisummary.LivePreviewAiSummaryNewWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.follow.LivePreviewFollowGuideCardWidget;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes13.dex */
public class AUListenerS1S0100002_12 implements ValueAnimator.AnimatorUpdateListener {
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
            case 2:
                onAnimationUpdate$2(this, valueAnimator);
                break;
            case 3:
                onAnimationUpdate$3(this, valueAnimator);
                break;
        }
    }

    public static final void onAnimationUpdate$0(AUListenerS1S0100002_12 aUListenerS1S0100002_12, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        float f = 1 - fFloatValue;
        C786410Ut5.bd(aUListenerS1S0100002_12.f1 * f, ((LivePreviewAiSummaryNewWidget) aUListenerS1S0100002_12.l0).O1());
        int childCount = ((LivePreviewAiSummaryNewWidget) aUListenerS1S0100002_12.l0).O1().getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = ((LivePreviewAiSummaryNewWidget) aUListenerS1S0100002_12.l0).O1().getChildAt(i);
            if (childAt.getId() != R.id.chm) {
                C786410Ut5.T4(childAt, fFloatValue);
            }
        }
        View view = ((LivePreviewAiSummaryNewWidget) aUListenerS1S0100002_12.l0).getView();
        if (view != null) {
            C786410Ut5.ed(view, fFloatValue * aUListenerS1S0100002_12.f2);
        }
        View view2 = ((LivePreviewAiSummaryNewWidget) aUListenerS1S0100002_12.l0).getView();
        if (view2 != null) {
            C786410Ut5.T4(view2, f);
        }
    }

    public static final void onAnimationUpdate$1(AUListenerS1S0100002_12 aUListenerS1S0100002_12, ValueAnimator valueAnimator) {
        View view;
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        View view2 = ((LivePreviewAiSummaryNewWidget) aUListenerS1S0100002_12.l0).getView();
        if (view2 != null) {
            C786410Ut5.ed(view2, (1 - fFloatValue) * aUListenerS1S0100002_12.f1);
        }
        if (((LivePreviewAiSummaryNewWidget) aUListenerS1S0100002_12.l0).S1() && (view = ((LivePreviewAiSummaryNewWidget) aUListenerS1S0100002_12.l0).getView()) != null) {
            C786410Ut5.T4(view, fFloatValue);
        }
        C786410Ut5.bd(aUListenerS1S0100002_12.f2 * fFloatValue, ((LivePreviewAiSummaryNewWidget) aUListenerS1S0100002_12.l0).O1());
        int childCount = ((LivePreviewAiSummaryNewWidget) aUListenerS1S0100002_12.l0).O1().getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = ((LivePreviewAiSummaryNewWidget) aUListenerS1S0100002_12.l0).O1().getChildAt(i);
            if (childAt.getId() != R.id.chm) {
                C786410Ut5.T4(childAt, 1 - fFloatValue);
            }
        }
    }

    public static final void onAnimationUpdate$2(AUListenerS1S0100002_12 aUListenerS1S0100002_12, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        float f = 1 - fFloatValue;
        C786410Ut5.bd(aUListenerS1S0100002_12.f1 * f, ((LivePreviewFollowGuideCardWidget) aUListenerS1S0100002_12.l0).N1());
        int childCount = ((LivePreviewFollowGuideCardWidget) aUListenerS1S0100002_12.l0).N1().getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = ((LivePreviewFollowGuideCardWidget) aUListenerS1S0100002_12.l0).N1().getChildAt(i);
            if (childAt.getId() != R.id.chm) {
                C786410Ut5.T4(childAt, fFloatValue);
            }
        }
        View view = ((LivePreviewFollowGuideCardWidget) aUListenerS1S0100002_12.l0).getView();
        if (view != null) {
            C786410Ut5.ed(view, fFloatValue * aUListenerS1S0100002_12.f2);
        }
        View view2 = ((LivePreviewFollowGuideCardWidget) aUListenerS1S0100002_12.l0).getView();
        if (view2 != null) {
            C786410Ut5.T4(view2, f);
        }
    }

    public static final void onAnimationUpdate$3(AUListenerS1S0100002_12 aUListenerS1S0100002_12, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        View view = ((LivePreviewFollowGuideCardWidget) aUListenerS1S0100002_12.l0).getView();
        if (view != null) {
            C786410Ut5.ed(view, (1 - fFloatValue) * aUListenerS1S0100002_12.f1);
        }
        C786410Ut5.bd(aUListenerS1S0100002_12.f2 * fFloatValue, ((LivePreviewFollowGuideCardWidget) aUListenerS1S0100002_12.l0).N1());
        int childCount = ((LivePreviewFollowGuideCardWidget) aUListenerS1S0100002_12.l0).N1().getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = ((LivePreviewFollowGuideCardWidget) aUListenerS1S0100002_12.l0).N1().getChildAt(i);
            if (childAt.getId() != R.id.chm) {
                C786410Ut5.T4(childAt, 1 - fFloatValue);
            }
        }
    }

    public AUListenerS1S0100002_12(Object obj, float f, float f2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.f1 = f;
        this.f2 = f2;
    }
}
