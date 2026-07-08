package X;

import android.view.animation.Animation;

/* JADX INFO: renamed from: X.1Amc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class AnimationAnimationListenerC2189521Amc implements Animation.AnimationListener {
    public final int $t;
    public Object l0;
    public Object l1;

    public static final void onAnimationEnd$1(AnimationAnimationListenerC2189521Amc animationAnimationListenerC2189521Amc, Animation animation) {
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

    public static final void onAnimationEnd$0(AnimationAnimationListenerC2189521Amc animationAnimationListenerC2189521Amc, Animation animation) {
        Animation.AnimationListener animationListener = (Animation.AnimationListener) animationAnimationListenerC2189521Amc.l0;
        if (animationListener != null) {
            animationListener.onAnimationEnd(animation);
        }
        ((AbstractC21610319hl) animationAnimationListenerC2189521Amc.l1).LIZIZ(true);
    }

    public static final void onAnimationRepeat$0(AnimationAnimationListenerC2189521Amc animationAnimationListenerC2189521Amc, Animation animation) {
        Animation.AnimationListener animationListener = (Animation.AnimationListener) animationAnimationListenerC2189521Amc.l0;
        if (animationListener != null) {
            animationListener.onAnimationRepeat(animation);
        }
    }

    public static final void onAnimationRepeat$1(AnimationAnimationListenerC2189521Amc animationAnimationListenerC2189521Amc, Animation animation) {
        C21609519hd c21609519hd = (C21609519hd) animationAnimationListenerC2189521Amc.l0;
        c21609519hd.LJIIJJI = c21609519hd.LJ;
        c21609519hd.LJIIL = c21609519hd.LJFF;
        c21609519hd.LJIILIIL = c21609519hd.LJI;
        c21609519hd.LIZIZ((c21609519hd.LJIIJ + 1) % c21609519hd.LJIIIZ.length);
        C21609519hd c21609519hd2 = (C21609519hd) animationAnimationListenerC2189521Amc.l0;
        c21609519hd2.LJ = c21609519hd2.LJFF;
        c21609519hd2.LIZ();
        C21609419hc c21609419hc = (C21609419hc) animationAnimationListenerC2189521Amc.l1;
        if (c21609419hc.LLJI) {
            c21609419hc.LLJI = false;
            animation.setDuration(1332L);
            C21609519hd c21609519hd3 = (C21609519hd) animationAnimationListenerC2189521Amc.l0;
            if (c21609519hd3.LJIILJJIL) {
                c21609519hd3.LJIILJJIL = false;
                c21609519hd3.LIZ();
                return;
            }
            return;
        }
        c21609419hc.LLIZ = (c21609419hc.LLIZ + 1.0f) % 5.0f;
    }

    public static final void onAnimationStart$0(AnimationAnimationListenerC2189521Amc animationAnimationListenerC2189521Amc, Animation animation) {
        Animation.AnimationListener animationListener = (Animation.AnimationListener) animationAnimationListenerC2189521Amc.l0;
        if (animationListener != null) {
            animationListener.onAnimationStart(animation);
        }
    }

    public static final void onAnimationStart$1(AnimationAnimationListenerC2189521Amc animationAnimationListenerC2189521Amc, Animation animation) {
        ((C21609419hc) animationAnimationListenerC2189521Amc.l1).LLIZ = 0.0f;
    }

    public AnimationAnimationListenerC2189521Amc(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l1 = obj;
        this.l0 = obj2;
    }
}
