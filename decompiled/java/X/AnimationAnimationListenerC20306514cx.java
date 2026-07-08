package X;

import android.view.animation.Animation;

/* JADX INFO: renamed from: X.14cx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class AnimationAnimationListenerC20306514cx implements Animation.AnimationListener {
    public final int $t;
    public Object l0;

    public static final void onAnimationRepeat$0(AnimationAnimationListenerC20306514cx animationAnimationListenerC20306514cx, Animation animation) {
    }

    public static final void onAnimationRepeat$1(AnimationAnimationListenerC20306514cx animationAnimationListenerC20306514cx, Animation animation) {
    }

    public static final void onAnimationRepeat$2(AnimationAnimationListenerC20306514cx animationAnimationListenerC20306514cx, Animation animation) {
    }

    public static final void onAnimationStart$0(AnimationAnimationListenerC20306514cx animationAnimationListenerC20306514cx, Animation animation) {
    }

    public static final void onAnimationStart$1(AnimationAnimationListenerC20306514cx animationAnimationListenerC20306514cx, Animation animation) {
    }

    public static final void onAnimationStart$2(AnimationAnimationListenerC20306514cx animationAnimationListenerC20306514cx, Animation animation) {
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

    public AnimationAnimationListenerC20306514cx(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onAnimationEnd$0(AnimationAnimationListenerC20306514cx animationAnimationListenerC20306514cx, Animation animation) {
        C20242914Ip c20242914Ip = (C20242914Ip) animationAnimationListenerC20306514cx.l0;
        int visibility = c20242914Ip.getVisibility();
        c20242914Ip.setVisibility(8);
        C1602160rnK.LIZIZ(visibility, 8, c20242914Ip);
        if (((C20242914Ip) animationAnimationListenerC20306514cx.l0).LL.isAnimating()) {
            ((C20242914Ip) animationAnimationListenerC20306514cx.l0).LL.cancelAnimation();
        }
        ((C20242914Ip) animationAnimationListenerC20306514cx.l0).LLILZ.LIZJ.invoke();
    }

    public static final void onAnimationEnd$1(AnimationAnimationListenerC20306514cx animationAnimationListenerC20306514cx, Animation animation) {
        C20243014Iq c20243014Iq = (C20243014Iq) animationAnimationListenerC20306514cx.l0;
        int visibility = c20243014Iq.getVisibility();
        c20243014Iq.setVisibility(8);
        C1602160rnK.LIZIZ(visibility, 8, c20243014Iq);
        if (((C20243014Iq) animationAnimationListenerC20306514cx.l0).LL.isAnimating()) {
            ((C20243014Iq) animationAnimationListenerC20306514cx.l0).LL.cancelAnimation();
        }
        if (((C20243014Iq) animationAnimationListenerC20306514cx.l0).LLILLJJLI.isAnimating()) {
            ((C20243014Iq) animationAnimationListenerC20306514cx.l0).LLILLJJLI.cancelAnimation();
        }
        ((C20243014Iq) animationAnimationListenerC20306514cx.l0).LLILZIL.LIZJ.invoke();
    }

    public static final void onAnimationEnd$2(AnimationAnimationListenerC20306514cx animationAnimationListenerC20306514cx, Animation animation) {
        C20243114Ir c20243114Ir = (C20243114Ir) animationAnimationListenerC20306514cx.l0;
        int visibility = c20243114Ir.getVisibility();
        c20243114Ir.setVisibility(8);
        C1602160rnK.LIZIZ(visibility, 8, c20243114Ir);
        if (((C20243114Ir) animationAnimationListenerC20306514cx.l0).LLJI.isAnimating()) {
            ((C20243114Ir) animationAnimationListenerC20306514cx.l0).LLJI.cancelAnimation();
        }
        ((C20243114Ir) animationAnimationListenerC20306514cx.l0).LLJILJIL.LIZJ.invoke();
    }
}
