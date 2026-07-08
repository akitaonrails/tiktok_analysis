package X;

import Y.AUListenerS253S0100000_2;
import android.animation.ValueAnimator;
import android.graphics.drawable.GradientDrawable;
import android.os.Looper;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;

/* JADX INFO: renamed from: X.0Giq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C423340Giq {
    public static final BPEAHandler LIZ = new BPEAHandler(Looper.getMainLooper());

    public static ValueAnimator LIZ(RelationButton relationButton, int i, int i2) {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i, i2);
        valueAnimatorOfInt.addUpdateListener(new AUListenerS253S0100000_2(relationButton, 32));
        valueAnimatorOfInt.setDuration(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL);
        valueAnimatorOfInt.setTarget(relationButton);
        return valueAnimatorOfInt;
    }

    public static void LIZIZ(View view, Integer num, Integer num2) {
        if (view != null && num != null) {
            num.intValue();
            if (num2 != null) {
                num2.intValue();
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setColor(num.intValue());
                C421740GgG.LIZJ(view, gradientDrawable, num.intValue(), num2.intValue(), DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL);
            }
        }
    }

    public static void LIZJ(RelationButton relationButton, int i, boolean z) {
        if (relationButton == null) {
            return;
        }
        int i2 = ((FrameLayout.LayoutParams) relationButton.getLayoutParams()).bottomMargin;
        if (z) {
            if (i2 < 0) {
                LIZ(relationButton, i2, i).start();
            }
        } else {
            if (i2 < 0) {
                return;
            }
            LIZ(relationButton, i2, i).start();
        }
    }
}
