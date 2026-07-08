package X;

import android.animation.ValueAnimator;
import android.graphics.PointF;
import android.view.View;

/* JADX INFO: renamed from: X.18mv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public class C21387518mv implements ValueAnimator.AnimatorUpdateListener {
    public View LL;
    public final int LLILLJJLI;
    public final int LLILLL;
    public final /* synthetic */ C21387418mu LLILZ;

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        View view = this.LL;
        if (view != null && view.getTag() != null) {
            PointF pointF = (PointF) valueAnimator.getAnimatedValue();
            C786410Ut5.Fd(this.LL, pointF.x);
            C786410Ut5.Ld(this.LL, pointF.y);
            float animatedFraction = valueAnimator.getAnimatedFraction();
            if (animatedFraction <= 0.7f) {
                float f = animatedFraction / 0.7f;
                C786410Ut5.T4(this.LL, 0.7f * f);
                float f2 = (f * 0.3f) + 0.3f;
                C786410Ut5.Ob(this.LL, f2);
                C786410Ut5.pc(this.LL, f2);
            } else if (animatedFraction <= 0.8d) {
                C786410Ut5.T4(this.LL, 0.7f);
                C786410Ut5.Ob(this.LL, 0.6f);
                C786410Ut5.pc(this.LL, 0.6f);
            } else if (animatedFraction <= 1.0f) {
                float f3 = (animatedFraction - 0.8f) / 0.2f;
                C786410Ut5.T4(this.LL, (1.0f - f3) * 0.7f);
                float f4 = (f3 * 0.1f) + 0.6f;
                C786410Ut5.Ob(this.LL, f4);
                C786410Ut5.pc(this.LL, f4);
                if (1.0f - animatedFraction < 1.0E-10d) {
                    this.LLILZ.LIZIZ(this.LL);
                    return;
                }
            }
            if (animatedFraction <= 0.5f) {
                C786410Ut5.Ab(this.LL, (animatedFraction / 0.5f) * 20.0f * this.LLILLJJLI);
            } else {
                C786410Ut5.Ab(this.LL, (((animatedFraction - 0.5f) / 0.5f) * 20.0f * this.LLILLL) + (this.LLILLJJLI * 20));
            }
        }
    }

    public C21387518mv(C21387418mu c21387418mu, View view) {
        int i;
        this.LLILZ = c21387418mu;
        this.LL = view;
        if (c21387418mu.LLILZIL.nextBoolean()) {
            i = 1;
        } else {
            i = -1;
        }
        this.LLILLJJLI = i;
        this.LLILLL = c21387418mu.LLILZIL.nextBoolean() ? 1 : -1;
    }
}
