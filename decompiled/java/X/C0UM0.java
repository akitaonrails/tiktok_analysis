package X;

import Y.ALAdapterS0S0000000_12;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewPropertyAnimator;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import com.bytedance.android.livesdk.livesetting.performance.LiveHostAutoAdaptiveParams;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0UM0, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UM0 {
    public static boolean LIZ;

    public static void LIZ(ImageView imageView, final float f, final Function0 function0, int i) {
        final ViewPropertyAnimator viewPropertyAnimatorAnimate;
        if ((i & 4) != 0) {
            f = 1.0f;
        }
        if (LiveHostAutoAdaptiveParams.disableInsertStickerAnimation()) {
            if (imageView != null) {
                C786410Ut5.Qb(imageView, f);
                C786410Ut5.rc(imageView, f);
            }
            function0.invoke();
            return;
        }
        if (imageView == null || (viewPropertyAnimatorAnimate = imageView.animate()) == null) {
            return;
        }
        viewPropertyAnimatorAnimate.scaleX(0.0f);
        viewPropertyAnimatorAnimate.scaleY(0.0f);
        viewPropertyAnimatorAnimate.setDuration(150L);
        viewPropertyAnimatorAnimate.setStartDelay(0L);
        viewPropertyAnimatorAnimate.setInterpolator(new DecelerateInterpolator(1.5f));
        viewPropertyAnimatorAnimate.setListener(new AnimatorListenerAdapter() { // from class: X.0UM1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                function0.invoke();
                viewPropertyAnimatorAnimate.scaleX(f);
                viewPropertyAnimatorAnimate.scaleY(f);
                viewPropertyAnimatorAnimate.setDuration(300L);
                viewPropertyAnimatorAnimate.setStartDelay(0L);
                viewPropertyAnimatorAnimate.setInterpolator(C0GY9.LIZIZ(0.3f, 1.3f, 0.3f, 1.0f));
                viewPropertyAnimatorAnimate.setListener(new ALAdapterS0S0000000_12(4));
                viewPropertyAnimatorAnimate.start();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                C0UM0.LIZ = true;
            }
        });
        viewPropertyAnimatorAnimate.start();
    }
}
