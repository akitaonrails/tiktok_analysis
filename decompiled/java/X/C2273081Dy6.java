package X;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS436S0200000_35;

/* JADX INFO: renamed from: X.1Dy6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2273081Dy6 extends AbstractC2273051Dy3 {
    public C21583019dM LIZIZ;
    public View LIZJ;
    public View LIZLLL;

    @Override // X.AbstractC2273051Dy3
    public final void LIZ() {
        View view = this.LIZJ;
        if (view != null) {
            view.clearAnimation();
        }
        View view2 = this.LIZLLL;
        if (view2 != null) {
            view2.clearAnimation();
        }
    }

    @Override // X.AbstractC2273051Dy3
    public final void LIZLLL(View view, View view2) {
        this.LIZJ = view;
        this.LIZLLL = view2;
        this.LIZIZ = LJ(90.0f, 0.0f, view.getWidth() / 2.0f, view.getHeight() / 2.0f, true, null);
        view2.startAnimation(LJ(0.0f, 90.0f, view.getWidth() / 2.0f, view.getHeight() / 2.0f, false, new AwS436S0200000_35(view, this, 40)));
    }

    public final C21583019dM LJ(float f, float f2, float f3, float f4, final boolean z, final Function0<Unit> function0) {
        C21583019dM c21583019dM = new C21583019dM(f, f2, f3, f4);
        c21583019dM.setDuration(300L);
        c21583019dM.setFillAfter(true);
        c21583019dM.setInterpolator(new LinearInterpolator());
        c21583019dM.setAnimationListener(new Animation.AnimationListener() { // from class: X.1Dy5
            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationEnd(Animation animation) {
                if (z) {
                    this.getClass();
                    this.LIZIZ();
                } else {
                    Function0<Unit> function02 = function0;
                    if (function02 == null) {
                        return;
                    }
                    function02.invoke();
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationStart(Animation animation) {
                if (!z) {
                    this.LIZJ();
                    this.getClass();
                }
            }
        });
        return c21583019dM;
    }
}
