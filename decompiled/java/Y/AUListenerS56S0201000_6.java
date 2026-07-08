package Y;

import X.C418440Gaw;
import X.C426750GoL;
import X.C786410Ut5;
import X.C814420VxA;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.basicui.BasicImageHeaderSheetFragment;
import com.ss.android.ugc.aweme.feed.assem.relationbtn.VideoRelationBtnAssem;
import com.ss.android.ugc.aweme.feed.assem.relationbtn.VideoRelationBtnAssemV2;

/* JADX INFO: loaded from: classes7.dex */
public class AUListenerS56S0201000_6 implements ValueAnimator.AnimatorUpdateListener {
    public final int $t;
    public int i2;
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
        }
    }

    public static final void onAnimationUpdate$0(AUListenerS56S0201000_6 aUListenerS56S0201000_6, ValueAnimator valueAnimator) {
        VideoRelationBtnAssem videoRelationBtnAssem = (VideoRelationBtnAssem) aUListenerS56S0201000_6.l0;
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        View view = (View) aUListenerS56S0201000_6.l1;
        int i = aUListenerS56S0201000_6.i2;
        videoRelationBtnAssem.getClass();
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        C786410Ut5.T4(view, fFloatValue);
                    }
                } else {
                    layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(fFloatValue)));
                }
            } else {
                layoutParams.width = (int) fFloatValue;
            }
            C786410Ut5.W5(view, layoutParams);
        }
    }

    public static final void onAnimationUpdate$1(AUListenerS56S0201000_6 aUListenerS56S0201000_6, ValueAnimator valueAnimator) {
        VideoRelationBtnAssemV2 videoRelationBtnAssemV2 = (VideoRelationBtnAssemV2) aUListenerS56S0201000_6.l0;
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        View view = (View) aUListenerS56S0201000_6.l1;
        int i = aUListenerS56S0201000_6.i2;
        videoRelationBtnAssemV2.getClass();
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        C786410Ut5.T4(view, fFloatValue);
                    }
                } else {
                    layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(fFloatValue)));
                }
            } else {
                layoutParams.width = (int) fFloatValue;
            }
            C786410Ut5.W5(view, layoutParams);
        }
    }

    public static final void onAnimationUpdate$2(AUListenerS56S0201000_6 aUListenerS56S0201000_6, ValueAnimator valueAnimator) {
        Float f;
        Object animatedValue = ((ValueAnimator) aUListenerS56S0201000_6.l0).getAnimatedValue();
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            float fFloatValue = f.floatValue();
            FrameLayout frameLayout = ((BasicImageHeaderSheetFragment) aUListenerS56S0201000_6.l1).LLILZ;
            if (frameLayout != null) {
                C426750GoL.LJIIL(frameLayout, null, null, null, Integer.valueOf((int) (aUListenerS56S0201000_6.i2 * fFloatValue)), 23);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AUListenerS56S0201000_6(Object obj, ValueAnimator valueAnimator, BasicImageHeaderSheetFragment<Object> basicImageHeaderSheetFragment, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = valueAnimator;
        this.i2 = basicImageHeaderSheetFragment;
    }
}
