package X;

import android.view.animation.Animation;
import com.ss.android.ugc.aweme.upvote.detail.input.RepostInputFragment;
import com.ss.android.ugc.tiktok.report.ReportWebContainer;

/* JADX INFO: renamed from: X.0maH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public class AnimationAnimationListenerC1401870maH implements Animation.AnimationListener {
    public final int $t;
    public Object l0;

    public static final void onAnimationRepeat$0(AnimationAnimationListenerC1401870maH animationAnimationListenerC1401870maH, Animation animation) {
    }

    public static final void onAnimationRepeat$1(AnimationAnimationListenerC1401870maH animationAnimationListenerC1401870maH, Animation animation) {
    }

    public static final void onAnimationRepeat$2(AnimationAnimationListenerC1401870maH animationAnimationListenerC1401870maH, Animation animation) {
    }

    public static final void onAnimationStart$0(AnimationAnimationListenerC1401870maH animationAnimationListenerC1401870maH, Animation animation) {
    }

    public static final void onAnimationStart$1(AnimationAnimationListenerC1401870maH animationAnimationListenerC1401870maH, Animation animation) {
    }

    public static final void onAnimationStart$2(AnimationAnimationListenerC1401870maH animationAnimationListenerC1401870maH, Animation animation) {
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

    public AnimationAnimationListenerC1401870maH(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onAnimationEnd$0(AnimationAnimationListenerC1401870maH animationAnimationListenerC1401870maH, Animation animation) {
        ((RepostInputFragment) animationAnimationListenerC1401870maH.l0).OR(System.currentTimeMillis());
    }

    public static final void onAnimationEnd$1(AnimationAnimationListenerC1401870maH animationAnimationListenerC1401870maH, Animation animation) {
        ReportWebContainer reportWebContainer = (ReportWebContainer) animationAnimationListenerC1401870maH.l0;
        reportWebContainer.LLILZLL = null;
        reportWebContainer.LLIZ = 4;
        if (!reportWebContainer.isFinishing()) {
            super/*com.bytedance.ies.foundation.activity.BaseActivity*/.finish();
            C786410Ut5.le((ReportWebContainer) animationAnimationListenerC1401870maH.l0);
        }
    }

    public static final void onAnimationEnd$2(AnimationAnimationListenerC1401870maH animationAnimationListenerC1401870maH, Animation animation) {
        ReportWebContainer reportWebContainer = (ReportWebContainer) animationAnimationListenerC1401870maH.l0;
        reportWebContainer.LLILZLL = null;
        reportWebContainer.LLIZ = 2;
    }
}
