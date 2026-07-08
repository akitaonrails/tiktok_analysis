package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;

/* JADX INFO: renamed from: X.0oAT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1462750oAT {
    public static void LIZ(final View view, boolean z) {
        float f;
        float[] fArr = new float[2];
        float f2 = 0.0f;
        if (z) {
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        fArr[0] = f;
        if (z) {
            f2 = 1.0f;
        }
        fArr[1] = f2;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "alpha", fArr);
        objectAnimatorOfFloat.setDuration(200L);
        objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        C786410Ut5.Pd(objectAnimatorOfFloat);
        objectAnimatorOfFloat.addListener(new AnimatorListenerAdapter() { // from class: X.0T28
            public final /* synthetic */ View LL = null;
            public final /* synthetic */ boolean LLILLJJLI = false;
            public final /* synthetic */ boolean LLILLL = false;

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                int i;
                View view2 = this.LL;
                if (view2 != null) {
                    if (this.LLILLJJLI) {
                        i = 0;
                    } else {
                        i = 8;
                    }
                    C786410Ut5.LJLLLLLL(i, view2);
                }
                if (this.LLILLL) {
                    C786410Ut5.LJLLLLLL(4, view);
                }
            }
        });
    }

    public static void LIZIZ(View view, boolean z, int i, View view2, C092O<Void> c092o) {
        LIZJ(view, z, i, view2, DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL, c092o);
    }

    public static Animator LIZJ(final View view, final boolean z, int i, final View view2, int i2, final C092O c092o) {
        float f;
        float f2;
        float f3;
        if (z) {
            C786410Ut5.LJLLLLLL(0, view2);
        }
        view2.bringToFront();
        float[] fArr = new float[2];
        float f4 = 0.0f;
        if (!z) {
            f = 0.0f;
        } else {
            f = i;
        }
        fArr[0] = f;
        if (z) {
            f2 = 0.0f;
        } else {
            f2 = i;
        }
        fArr[1] = f2;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "translationY", fArr);
        long j = i2;
        objectAnimatorOfFloat.setDuration(j);
        float[] fArr2 = new float[2];
        if (!z) {
            f3 = 1.0f;
        } else {
            f3 = 0.0f;
        }
        fArr2[0] = f3;
        if (z) {
            f4 = 1.0f;
        }
        fArr2[1] = f4;
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, "alpha", fArr2);
        objectAnimatorOfFloat2.setDuration(j);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(new LinearInterpolator());
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        animatorSet.addListener(new AnimatorListenerAdapter() { // from class: X.0kaD
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                if (!z) {
                    C786410Ut5.LJLLLLLL(4, view2);
                }
                C092O c092o2 = c092o;
                if (c092o2 != null) {
                    c092o2.accept(null);
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                C786410Ut5.LJLLLLLL(0, view);
            }
        });
        animatorSet.start();
        return animatorSet;
    }
}
