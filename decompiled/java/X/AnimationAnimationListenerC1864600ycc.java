package X;

import android.view.animation.Animation;
import com.bytedance.android.live.wallet.infrastructure.view.WalletUSDisclaimerView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0ycc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public class AnimationAnimationListenerC1864600ycc implements Animation.AnimationListener {
    public final int $t;
    public Object l0;

    public static final void onAnimationRepeat$0(AnimationAnimationListenerC1864600ycc animationAnimationListenerC1864600ycc, Animation animation) {
    }

    public static final void onAnimationRepeat$1(AnimationAnimationListenerC1864600ycc animationAnimationListenerC1864600ycc, Animation animation) {
    }

    public static final void onAnimationStart$0(AnimationAnimationListenerC1864600ycc animationAnimationListenerC1864600ycc, Animation animation) {
    }

    public static final void onAnimationStart$1(AnimationAnimationListenerC1864600ycc animationAnimationListenerC1864600ycc, Animation animation) {
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

    public AnimationAnimationListenerC1864600ycc(WalletUSDisclaimerView walletUSDisclaimerView, int i) {
        this.$t = i;
        this.l0 = walletUSDisclaimerView;
    }

    public static final void onAnimationEnd$0(AnimationAnimationListenerC1864600ycc animationAnimationListenerC1864600ycc, Animation animation) {
        ((WalletUSDisclaimerView) animationAnimationListenerC1864600ycc.l0).LJFF.setIcon(R.drawable.edv);
    }

    public static final void onAnimationEnd$1(AnimationAnimationListenerC1864600ycc animationAnimationListenerC1864600ycc, Animation animation) {
        ((WalletUSDisclaimerView) animationAnimationListenerC1864600ycc.l0).LJFF.setIcon(R.drawable.edu);
    }
}
