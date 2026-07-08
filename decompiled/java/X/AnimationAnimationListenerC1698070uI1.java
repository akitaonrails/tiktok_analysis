package X;

import Y.ARunnableS125S0100000_25;
import android.view.animation.Animation;

/* JADX INFO: renamed from: X.0uI1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public class AnimationAnimationListenerC1698070uI1 implements Animation.AnimationListener {
    public final int $t;
    public Object l0;

    public static final void onAnimationRepeat$0(AnimationAnimationListenerC1698070uI1 animationAnimationListenerC1698070uI1, Animation animation) {
    }

    public static final void onAnimationRepeat$1(AnimationAnimationListenerC1698070uI1 animationAnimationListenerC1698070uI1, Animation animation) {
    }

    public static final void onAnimationStart$0(AnimationAnimationListenerC1698070uI1 animationAnimationListenerC1698070uI1, Animation animation) {
    }

    public static final void onAnimationStart$1(AnimationAnimationListenerC1698070uI1 animationAnimationListenerC1698070uI1, Animation animation) {
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

    public AnimationAnimationListenerC1698070uI1(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onAnimationEnd$0(AnimationAnimationListenerC1698070uI1 animationAnimationListenerC1698070uI1, Animation animation) {
        C19518211Xw c19518211Xw = ((C1657150tE1) animationAnimationListenerC1698070uI1.l0).LLJL;
        if (c19518211Xw == null) {
            c19518211Xw = null;
        }
        C786410Ut5.D1(c19518211Xw, 4);
    }

    public static final void onAnimationEnd$1(AnimationAnimationListenerC1698070uI1 animationAnimationListenerC1698070uI1, Animation animation) {
        ((C1655180tAq) ((ARunnableS125S0100000_25) animationAnimationListenerC1698070uI1.l0).l0).LJJJJLL(true);
    }
}
