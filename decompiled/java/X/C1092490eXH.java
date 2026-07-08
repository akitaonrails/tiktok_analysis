package X;

import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0eXH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1092490eXH {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(final View view, final Function0 function0, boolean z) {
        float f;
        float f2;
        AlphaAnimation alphaAnimation;
        Animation animation = view.getAnimation();
        if (animation != null) {
            animation.setAnimationListener(null);
        }
        Animation animation2 = view.getAnimation();
        if (animation2 != null) {
            animation2.cancel();
        }
        if (z) {
            f = 0.0f;
            f2 = 1.0f;
        } else {
            f = 1.0f;
            f2 = 0.0f;
        }
        ScaleAnimation scaleAnimation = new ScaleAnimation(f, f2, f, f2, 1, 0.0f, 1, 1.0f);
        if (z) {
            alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        } else {
            alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        }
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.setDuration(300L);
        animationSet.addAnimation(scaleAnimation);
        animationSet.addAnimation(alphaAnimation);
        animationSet.setAnimationListener(new Animation.AnimationListener() { // from class: X.0Gfn
            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationRepeat(Animation animation3) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationEnd(Animation animation3) {
                Function0<Unit> function02 = function0;
                if (function02 != null) {
                    function02.invoke();
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationStart(Animation animation3) {
                C786410Ut5.LJLLLLLL(0, view);
            }
        });
        view.startAnimation(animationSet);
    }
}
