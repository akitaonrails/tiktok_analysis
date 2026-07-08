package X;

import android.view.View;
import android.view.animation.Animation;
import android.widget.TextView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.shortvideo.vechoosecover.ChooseCoverActivity;
import kotlin.jvm.internal.AFwS210S0000000_22;

/* JADX INFO: renamed from: X.0oGf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public class AnimationAnimationListenerC1466590oGf implements Animation.AnimationListener {
    public final int $t;
    public Object l0;

    public static final void onAnimationRepeat$0(AnimationAnimationListenerC1466590oGf animationAnimationListenerC1466590oGf, Animation animation) {
    }

    public static final void onAnimationRepeat$1(AnimationAnimationListenerC1466590oGf animationAnimationListenerC1466590oGf, Animation animation) {
    }

    public static final void onAnimationRepeat$2(AnimationAnimationListenerC1466590oGf animationAnimationListenerC1466590oGf, Animation animation) {
    }

    public static final void onAnimationStart$0(AnimationAnimationListenerC1466590oGf animationAnimationListenerC1466590oGf, Animation animation) {
    }

    public static final void onAnimationStart$1(AnimationAnimationListenerC1466590oGf animationAnimationListenerC1466590oGf, Animation animation) {
    }

    public static final void onAnimationStart$2(AnimationAnimationListenerC1466590oGf animationAnimationListenerC1466590oGf, Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        switch (this.$t) {
            case 0:
                onAnimationEnd$0(this, animation);
                break;
            case 1:
                onAnimationEnd$1(this, animation);
                break;
            case 2:
                onAnimationEnd$2(this, animation);
                break;
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        switch (this.$t) {
            case 0:
                onAnimationRepeat$0(this, animation);
                break;
            case 1:
                onAnimationRepeat$1(this, animation);
                break;
            case 2:
                onAnimationRepeat$2(this, animation);
                break;
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        switch (this.$t) {
            case 0:
                onAnimationStart$0(this, animation);
                break;
            case 1:
                onAnimationStart$1(this, animation);
                break;
            case 2:
                onAnimationStart$2(this, animation);
                break;
        }
    }

    public AnimationAnimationListenerC1466590oGf(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onAnimationEnd$0(AnimationAnimationListenerC1466590oGf animationAnimationListenerC1466590oGf, Animation animation) {
        View view = ((C1423960n9u) animationAnimationListenerC1466590oGf.l0).LLJLIL;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
    }

    public static final void onAnimationEnd$1(AnimationAnimationListenerC1466590oGf animationAnimationListenerC1466590oGf, Animation animation) {
        TextView textView = ((C1447790nmL) animationAnimationListenerC1466590oGf.l0).LLJI;
        if (textView == null) {
            textView = null;
        }
        C786410Ut5.LLIL(textView, 8);
        C430110Gtl.LIZ((C1447790nmL) animationAnimationListenerC1466590oGf.l0, AFwS210S0000000_22.get$arr$(163));
    }

    public static final void onAnimationEnd$2(AnimationAnimationListenerC1466590oGf animationAnimationListenerC1466590oGf, Animation animation) {
        super/*com.bytedance.ies.foundation.activity.BaseActivity*/.finish();
        ChooseCoverActivity chooseCoverActivity = (ChooseCoverActivity) animationAnimationListenerC1466590oGf.l0;
        try {
            C1389600mGU.LIZIZ(chooseCoverActivity);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        chooseCoverActivity.overridePendingTransition(0, 0);
    }
}
