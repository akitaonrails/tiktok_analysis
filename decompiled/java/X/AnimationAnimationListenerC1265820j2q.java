package X;

import android.view.View;
import android.view.animation.Animation;
import com.ss.android.ugc.profile.business.profile.popup.BaseMyProfileGuideWidget;

/* JADX INFO: renamed from: X.0j2q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public class AnimationAnimationListenerC1265820j2q implements Animation.AnimationListener {
    public final int $t;
    public Object l0;

    public static final void onAnimationRepeat$0(AnimationAnimationListenerC1265820j2q animationAnimationListenerC1265820j2q, Animation animation) {
    }

    public static final void onAnimationRepeat$1(AnimationAnimationListenerC1265820j2q animationAnimationListenerC1265820j2q, Animation animation) {
    }

    public static final void onAnimationStart$1(AnimationAnimationListenerC1265820j2q animationAnimationListenerC1265820j2q, Animation animation) {
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
        }
    }

    public AnimationAnimationListenerC1265820j2q(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onAnimationEnd$0(AnimationAnimationListenerC1265820j2q animationAnimationListenerC1265820j2q, Animation animation) {
        ((C1257570ipX) animationAnimationListenerC1265820j2q.l0).LLILLJJLI = false;
    }

    public static final void onAnimationEnd$1(AnimationAnimationListenerC1265820j2q animationAnimationListenerC1265820j2q, Animation animation) {
        View view = ((BaseMyProfileGuideWidget) animationAnimationListenerC1265820j2q.l0).LLJILJILJ;
        if (view != null) {
            view.setLayerType(0, null);
        }
    }

    public static final void onAnimationStart$0(AnimationAnimationListenerC1265820j2q animationAnimationListenerC1265820j2q, Animation animation) {
        ((C1257570ipX) animationAnimationListenerC1265820j2q.l0).LLILLJJLI = true;
    }
}
