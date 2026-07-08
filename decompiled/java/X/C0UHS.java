package X;

import Y.ALAdapterS9S0100000_12;
import Y.AUListenerS253S0100000_2;
import Y.AUListenerS256S0100000_6;
import Y.AUListenerS262S0100000_12;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS199S0000000_12;

/* JADX INFO: renamed from: X.0UHS, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public class C0UHS {
    public final C19P4 LIZ;
    public final ViewGroup LIZIZ;
    public final ViewGroup LIZJ;
    public final View LIZLLL;
    public final ViewGroup LJ;
    public final ViewGroup LJFF;
    public final FrameLayout LJI;
    public boolean LJII;
    public WeakReference<View> LJIIIIZZ;
    public boolean LJIIIZ;
    public AnimatorSet LJIIJ;
    public AnimatorSet LJIIJJI;
    public AnimatorSet LJIIL;
    public AnimatorSet LJIILIIL;
    public AnimatorSet LJIILJJIL;
    public boolean LJIILL;

    public static ValueAnimator LIZJ(ViewGroup viewGroup) {
        if (viewGroup != null) {
            C786410Ut5.R4(0.0f, viewGroup);
            C12ES.LJIILL(0, viewGroup);
        }
        return LJ(0.0f, 1.0f, viewGroup);
    }

    public static ValueAnimator LIZLLL(ViewGroup viewGroup) {
        float alpha;
        if (viewGroup != null) {
            alpha = viewGroup.getAlpha();
        } else {
            alpha = 0.0f;
        }
        ValueAnimator valueAnimatorLJ = LJ(alpha, 0.0f, viewGroup);
        valueAnimatorLJ.addUpdateListener(new AUListenerS262S0100000_12(viewGroup, 37));
        return valueAnimatorLJ;
    }

    public final void LJII(View view) {
        FrameLayout frameLayout = this.LJI;
        if (frameLayout != null) {
            C12ES.LJIILL(0, frameLayout);
        }
        this.LJIIIIZZ = new WeakReference<>(view);
        this.LJII = true;
        this.LJIILL = true;
        if (view != null) {
            C786410Ut5.T4(view, 0.1f);
        }
        C500260Jjc.LLFFF(view);
        ValueAnimator valueAnimatorLJ = LJ(0.1f, 1.0f, view);
        ValueAnimator valueAnimatorLIZJ = LIZJ(this.LIZJ);
        ValueAnimator valueAnimatorLJ2 = LJ(1.0f, 0.0f, this.LJ);
        ValueAnimator valueAnimatorLIZLLL = LIZLLL(this.LIZIZ);
        ValueAnimator valueAnimatorLIZIZ = LIZIZ(view, (int) C497740JfY.LIZIZ(50.0f), true);
        ValueAnimator valueAnimatorLIZIZ2 = LIZIZ(this.LJ, (int) C497740JfY.LIZIZ(50.0f), true);
        valueAnimatorLIZIZ2.addListener(new ALAdapterS9S0100000_12(this, 31));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(valueAnimatorLJ, valueAnimatorLIZLLL, valueAnimatorLJ2, valueAnimatorLIZIZ, valueAnimatorLIZJ, valueAnimatorLIZIZ2);
        animatorSet.start();
    }

    public final void LIZ(View view, Function0<Unit> function0) {
        FrameLayout frameLayout = this.LJI;
        if (frameLayout != null) {
            C439101nJ.LJI(frameLayout);
        }
        this.LJIIIIZZ = new WeakReference<>(view);
        this.LJII = false;
        ValueAnimator valueAnimatorLJ = LJ(1.0f, 0.0f, view);
        ValueAnimator valueAnimatorLIZLLL = LIZLLL(this.LIZJ);
        ValueAnimator valueAnimatorLIZIZ = LIZIZ(view, (int) C497740JfY.LIZIZ(50.0f), false);
        ValueAnimator valueAnimatorLIZIZ2 = LIZIZ(this.LJ, (int) C497740JfY.LIZIZ(50.0f), false);
        ValueAnimator valueAnimatorLJ2 = LJ(0.0f, 1.0f, this.LJ);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isVideoOn: ");
        sbLIZ.append(this.LJIIIZ);
        C20441214yg.LIZIZ("EffectMonitor#guest", C2188811AlT.LIZIZ(sbLIZ));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(valueAnimatorLJ, valueAnimatorLIZLLL, valueAnimatorLIZIZ, valueAnimatorLIZIZ2, valueAnimatorLJ2);
        if (this.LJIIIZ) {
            animatorSet.play(LIZJ(this.LIZIZ));
        } else {
            animatorSet.play(LIZLLL(this.LIZIZ));
        }
        animatorSet.addListener(new ALAdapterS9S0100000_12(function0, 30));
        animatorSet.start();
    }

    public final void LJFF(boolean z, boolean z2) {
        ValueAnimator valueAnimatorLIZJ;
        this.LJIIIZ = true;
        AnimatorSet animatorSet = this.LJIILIIL;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = this.LJIILJJIL;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        View view = null;
        if (this.LJIILL) {
            WeakReference<View> weakReference = this.LJIIIIZZ;
            if (weakReference != null) {
                view = weakReference.get();
            }
            LJII(view);
            return;
        }
        if (z) {
            C19P4 c19p4 = this.LIZ;
            if (c19p4 != null) {
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c19p4);
                c19p4.setAlpha(0.0f);
            }
            C19P4 c19p42 = this.LIZ;
            if (c19p42 != null) {
                C12ES.LJIILL(0, c19p42);
            }
            valueAnimatorLIZJ = LJ(0.0f, 1.0f, this.LIZ);
        } else if (!z2) {
            return;
        } else {
            valueAnimatorLIZJ = LIZJ(this.LIZIZ);
        }
        if (valueAnimatorLIZJ == null) {
            return;
        }
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.playSequentially(valueAnimatorLIZJ);
        this.LJIILIIL = animatorSet3;
        animatorSet3.start();
    }

    public final void LJI(boolean z, boolean z2) {
        ValueAnimator valueAnimatorLIZLLL;
        View view;
        this.LJIIIZ = false;
        if (this.LJII) {
            WeakReference<View> weakReference = this.LJIIIIZZ;
            if (weakReference != null) {
                view = weakReference.get();
            } else {
                view = null;
            }
            LIZ(view, AFwS199S0000000_12.get$arr$(359));
            return;
        }
        if (!z && !z2) {
            return;
        }
        AnimatorSet animatorSet = this.LJIILJJIL;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = this.LJIILIIL;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        if (z) {
            C19P4 c19p4 = this.LIZ;
            if (c19p4 != null) {
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c19p4);
                c19p4.setAlpha(1.0f);
            }
            valueAnimatorLIZLLL = LJ(1.0f, 0.0f, this.LIZ);
            valueAnimatorLIZLLL.addUpdateListener(new AUListenerS262S0100000_12(this, 38));
        } else {
            valueAnimatorLIZLLL = LIZLLL(this.LIZIZ);
        }
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.playSequentially(valueAnimatorLIZLLL);
        this.LJIILJJIL = animatorSet3;
        animatorSet3.start();
    }

    public static ValueAnimator LIZIZ(View view, int i, boolean z) {
        ViewGroup.LayoutParams layoutParams;
        int measuredHeight;
        int i2;
        if (view != null) {
            layoutParams = view.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (layoutParams == null || (measuredHeight = layoutParams.height) <= 0) {
            if (view != null) {
                measuredHeight = view.getMeasuredHeight();
            } else {
                measuredHeight = 0;
            }
        }
        if (measuredHeight <= 0) {
            return ValueAnimator.ofFloat(0.0f, 0.0f);
        }
        if (z) {
            i2 = i + measuredHeight;
        } else {
            i2 = measuredHeight - i;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(measuredHeight, i2);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.setDuration(400);
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS253S0100000_2(view, 24));
        return valueAnimatorOfFloat;
    }

    public static ValueAnimator LJ(float f, float f2, View view) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, f2);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.setDuration(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL);
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS256S0100000_6(view, 92));
        return valueAnimatorOfFloat;
    }

    public C0UHS(C19P4 c19p4, ViewGroup viewGroup, ViewGroup viewGroup2, View view, ViewGroup viewGroup3, ViewGroup viewGroup4, FrameLayout frameLayout) {
        this.LIZ = c19p4;
        this.LIZIZ = viewGroup;
        this.LIZJ = viewGroup2;
        this.LIZLLL = view;
        this.LJ = viewGroup3;
        this.LJFF = viewGroup4;
        this.LJI = frameLayout;
    }
}
