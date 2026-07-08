package X;

import Y.AUListenerS274S0100000_26;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import com.bytedance.pipo.stellar.base.model.BackgroundDO;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS270S0300000_26;

/* JADX INFO: renamed from: X.0utN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1721230utN extends FrameLayout {
    public ValueAnimator LL;
    public final View LLILLJJLI;
    public final C1721230utN LLILLL;
    public long LLILZ;
    public Function0<Unit> LLILZIL;

    public final void LIZIZ() {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, this.LLILLL.getWidth());
        this.LL = valueAnimatorOfInt;
        if (valueAnimatorOfInt != null) {
            valueAnimatorOfInt.setInterpolator(new LinearInterpolator());
        }
        ValueAnimator valueAnimator = this.LL;
        if (valueAnimator != null) {
            valueAnimator.setRepeatCount(0);
        }
        ValueAnimator valueAnimator2 = this.LL;
        if (valueAnimator2 != null) {
            valueAnimator2.setDuration(this.LLILZ);
        }
        ValueAnimator valueAnimator3 = this.LL;
        if (valueAnimator3 != null) {
            valueAnimator3.addUpdateListener(new AUListenerS274S0100000_26(this, 0));
        }
        ValueAnimator valueAnimator4 = this.LL;
        if (valueAnimator4 != null) {
            valueAnimator4.addListener(new Animator.AnimatorListener() { // from class: X.0utS
                public boolean LL;

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationRepeat(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationCancel(Animator animator) {
                    this.LL = true;
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    Function0<Unit> function0;
                    if (!this.LL && (function0 = this.LLILLJJLI.LLILZIL) != null) {
                        function0.invoke();
                    }
                    this.LL = false;
                }
            });
        }
        ValueAnimator valueAnimator5 = this.LL;
        if (valueAnimator5 != null) {
            valueAnimator5.start();
        }
    }

    public C1721230utN(Context context) {
        super(context);
        this.LLILLJJLI = new View(getContext());
        this.LLILLL = this;
    }

    public final void setProgress(EnumC1721240utO enumC1721240utO) {
        int i = C1721250utP.LIZ[enumC1721240utO.ordinal()];
        if (i != 1) {
            if (i == 2) {
                ValueAnimator valueAnimator = this.LL;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                C1721300utU c1721300utU = C1721300utU.LIZ;
                View view = this.LLILLJJLI;
                int width = this.LLILLL.getWidth();
                c1721300utU.getClass();
                C1721300utU.LJIIJ(view, width);
                return;
            }
            throw new C1954807lC();
        }
        ValueAnimator valueAnimator2 = this.LL;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        C1721300utU c1721300utU2 = C1721300utU.LIZ;
        View view2 = this.LLILLJJLI;
        c1721300utU2.getClass();
        C1721300utU.LJIIJ(view2, 0);
    }

    public final void LIZ(int i, int i2, BackgroundDO backgroundDO, BackgroundDO backgroundDO2, long j, AwS270S0300000_26 awS270S0300000_26) {
        C1721300utU c1721300utU = C1721300utU.LIZ;
        View view = this.LLILLJJLI;
        c1721300utU.getClass();
        C1721300utU.LJIIJ(view, 0);
        C1721300utU.LJIIIZ(i2, this.LLILLJJLI);
        C1721300utU.LJIIJ(this.LLILLL, i);
        C1721300utU.LJIIIZ(i2, this.LLILLL);
        View view2 = this.LLILLJJLI;
        c1721300utU.getClass();
        C1721300utU.LIZ(view2, backgroundDO, null);
        C1721230utN c1721230utN = this.LLILLL;
        c1721300utU.getClass();
        C1721300utU.LIZ(c1721230utN, backgroundDO2, null);
        addView(this.LLILLJJLI);
        this.LLILZ = j;
        this.LLILZIL = awS270S0300000_26;
    }
}
