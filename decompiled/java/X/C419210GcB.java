package X;

import Y.ALAdapterS3S0100000_6;
import Y.ARunnableS106S0100000_6;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: renamed from: X.0GcB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C419210GcB extends LinearLayout {
    public final C01GW LL;

    public final void LIZ() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "alpha", 1.0f, 0.0f);
        objectAnimatorOfFloat.setDuration(150L);
        objectAnimatorOfFloat.setInterpolator(getAnimInterpolator());
        objectAnimatorOfFloat.addListener(new ALAdapterS3S0100000_6(this, 7));
        C786410Ut5.Pd(objectAnimatorOfFloat);
    }

    private final Interpolator getAnimInterpolator() {
        return C0GY9.LIZIZ(0.25f, 0.0f, 0.25f, 1.0f);
    }

    private final TuxTextView getIncreasePointsTextView() {
        return (TuxTextView) this.LL.getValue();
    }

    public C419210GcB(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 1576));
        LinearLayout.inflate(context, R.layout.fwk, this);
        setGravity(16);
    }

    public static void LIZIZ(C419210GcB c419210GcB, String str) {
        c419210GcB.getIncreasePointsTextView().setText(str);
        int visibility = c419210GcB.getVisibility();
        c419210GcB.setVisibility(0);
        C1602160rnK.LIZIZ(visibility, 0, c419210GcB);
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(c419210GcB, "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(335L);
        objectAnimatorOfFloat.setInterpolator(c419210GcB.getAnimInterpolator());
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(c419210GcB, "translationY", C418440Gaw.LIZIZ(36), 0.0f);
        objectAnimatorOfFloat2.setDuration(335L);
        objectAnimatorOfFloat2.setInterpolator(c419210GcB.getAnimInterpolator());
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        animatorSet.start();
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c419210GcB);
        c419210GcB.setTranslationY(0.0f);
        HandlerHook.viewPostDelay(c419210GcB, new ARunnableS106S0100000_6((Object) c419210GcB, 311), Mp4ScreenVideoLoadTimeout.CONTROL);
    }
}
