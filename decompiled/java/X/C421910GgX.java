package X;

import Y.ALAdapterS3S0100000_6;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;

/* JADX INFO: renamed from: X.0GgX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C421910GgX extends FrameLayout {
    public EnumC429320GsU LL;
    public C0GRU LLILLJJLI;
    public C0GRT LLILLL;
    public AnimatorSet LLILZ;
    public AnimatorSet LLILZIL;

    public final void LIZIZ() {
        C0GRU c0gru = new C0GRU(getContext(), null, 6);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 8388611;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c0gru);
        c0gru.setLayoutParams(layoutParams);
        int visibility = c0gru.getVisibility();
        c0gru.setVisibility(8);
        C1602160rnK.LIZIZ(visibility, 8, c0gru);
        this.LLILLJJLI = c0gru;
        C0GRT c0grt = new C0GRT(getContext(), null, 6);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams2.gravity = 8388613;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c0grt);
        c0grt.setLayoutParams(layoutParams2);
        int visibility2 = c0grt.getVisibility();
        c0grt.setVisibility(8);
        C1602160rnK.LIZIZ(visibility2, 8, c0grt);
        this.LLILLL = c0grt;
        C0GRU c0gru2 = this.LLILLJJLI;
        if (c0gru2 == null) {
            c0gru2 = null;
        }
        addView(c0gru2);
        C0GRT c0grt2 = this.LLILLL;
        addView(c0grt2 != null ? c0grt2 : null);
    }

    public final void LIZJ() {
        C0GRU c0gru = this.LLILLJJLI;
        if (c0gru == null) {
            c0gru = null;
        }
        int visibility = c0gru.getVisibility();
        c0gru.setVisibility(0);
        C1602160rnK.LIZIZ(visibility, 0, c0gru);
        AnimatorSet animatorSet = this.LLILZ;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        C0GRU c0gru2 = this.LLILLJJLI;
        AnimatorSet animatorSetLIZ = LIZ(-10.0f, c0gru2 != null ? c0gru2 : null);
        this.LLILZ = animatorSetLIZ;
        animatorSetLIZ.start();
    }

    public final void LIZLLL() {
        C0GRT c0grt = this.LLILLL;
        if (c0grt == null) {
            c0grt = null;
        }
        int visibility = c0grt.getVisibility();
        c0grt.setVisibility(0);
        C1602160rnK.LIZIZ(visibility, 0, c0grt);
        AnimatorSet animatorSet = this.LLILZIL;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        C0GRT c0grt2 = this.LLILLL;
        AnimatorSet animatorSetLIZ = LIZ(10.0f, c0grt2 != null ? c0grt2 : null);
        this.LLILZIL = animatorSetLIZ;
        animatorSetLIZ.start();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C0GRU c0gru = this.LLILLJJLI;
        C0GRT c0grt = null;
        if (c0gru == null) {
            c0gru = null;
        }
        RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, c0gru);
        removeView(c0gru);
        C0GRT c0grt2 = this.LLILLL;
        if (c0grt2 != null) {
            c0grt = c0grt2;
        }
        RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, c0grt);
        removeView(c0grt);
        LIZIZ();
    }

    public final void setRippleType(EnumC429320GsU enumC429320GsU) {
        this.LL = enumC429320GsU;
    }

    public C421910GgX(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = EnumC429320GsU.NONE_RIPPLE;
        LIZIZ();
    }

    public static AnimatorSet LIZ(float f, View view) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, "translationX", f, 0.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(600L);
        animatorSet.setInterpolator(new C21388018n0());
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f);
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(view, "translationX", 0.0f, f);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.setDuration(600L);
        animatorSet2.setInterpolator(new C21387918mz());
        animatorSet2.playTogether(objectAnimatorOfFloat3, objectAnimatorOfFloat4);
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.addListener(new ALAdapterS3S0100000_6(view, 47));
        animatorSet3.play(animatorSet2).after(animatorSet);
        return animatorSet3;
    }
}
