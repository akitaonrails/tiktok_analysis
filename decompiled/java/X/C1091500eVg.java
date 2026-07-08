package X;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.PathInterpolator;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0eVg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1091500eVg extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C1908530zlT LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1091500eVg(C1908530zlT c1908530zlT) {
        super(0);
        this.LL = c1908530zlT;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        final C1908530zlT c1908530zlT = this.LL;
        c1908530zlT.getClass();
        final ArrayList arrayList = new ArrayList();
        LinearLayout linearLayout = c1908530zlT.LLILZ;
        int childCount = linearLayout != null ? linearLayout.getChildCount() : 0;
        for (final int i = 0; i < childCount; i++) {
            final ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            final int iLIZIZ = (int) C497740JfY.LIZIZ(20.0f);
            LinearLayout linearLayout2 = c1908530zlT.LLILZ;
            final View childAt = linearLayout2 != null ? linearLayout2.getChildAt(i) : null;
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.0Gd6
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    View view = childAt;
                    if (view != null) {
                        C786410Ut5.T4(view, valueAnimatorOfFloat.getAnimatedFraction());
                    }
                    View view2 = childAt;
                    if (view2 != null) {
                        C786410Ut5.Jc(view2, (-iLIZIZ) * (1 - valueAnimatorOfFloat.getAnimatedFraction()));
                    }
                }
            });
            valueAnimatorOfFloat.addListener(new Animator.AnimatorListener() { // from class: X.0eOh
                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationCancel(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationRepeat(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
                    C19724012Fa.LIZLLL(48L, c1908530zlT, new C0H0Q(arrayList, i));
                }
            });
            valueAnimatorOfFloat.setDuration(80L);
            valueAnimatorOfFloat.setInterpolator(new PathInterpolator(0.42f, 0.0f, 0.58f, 1.0f));
            arrayList.add(valueAnimatorOfFloat);
        }
        final ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        final TuxTextView[] tuxTextViewArr = {c1908530zlT.LLILLL, c1908530zlT.LLILZIL, c1908530zlT.LLILZLL};
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.0eVh
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                TuxTextView[] tuxTextViewArr2 = tuxTextViewArr;
                ValueAnimator valueAnimator2 = valueAnimatorOfFloat2;
                for (TuxTextView tuxTextView : tuxTextViewArr2) {
                    if (tuxTextView != null) {
                        C786410Ut5.B5(tuxTextView, valueAnimator2.getAnimatedFraction());
                    }
                }
            }
        });
        valueAnimatorOfFloat2.addListener(new Animator.AnimatorListener() { // from class: X.0eOg
            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                C1908530zlT c1908530zlT2 = c1908530zlT;
                C19724012Fa.LIZLLL(80L, c1908530zlT2, new C1087150eOf(c1908530zlT2, arrayList));
            }
        });
        valueAnimatorOfFloat2.setDuration(320L);
        valueAnimatorOfFloat2.setInterpolator(new PathInterpolator(0.65f, 0.0f, 0.35f, 1.0f));
        final ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
        final int iLIZIZ2 = (int) C497740JfY.LIZIZ(30.0f);
        valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.0eWI
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float animatedFraction = (0.100000024f * (1 - valueAnimatorOfFloat3.getAnimatedFraction())) + 1.0f;
                C1324720kZq c1324720kZq = c1908530zlT.LLIZ;
                if (c1324720kZq != null) {
                    C786410Ut5.Qc(c1324720kZq, (-iLIZIZ2) * (1.0f - valueAnimatorOfFloat3.getAnimatedFraction()));
                    C786410Ut5.Yb(c1324720kZq, animatedFraction);
                    C786410Ut5.xc(c1324720kZq, animatedFraction);
                }
                C1324720kZq c1324720kZq2 = c1908530zlT.LLILLJJLI;
                if (c1324720kZq2 != null) {
                    C786410Ut5.Qc(c1324720kZq2, (-iLIZIZ2) * (1.0f - valueAnimatorOfFloat3.getAnimatedFraction()));
                    C786410Ut5.Yb(c1324720kZq2, animatedFraction);
                    C786410Ut5.xc(c1324720kZq2, animatedFraction);
                }
            }
        });
        valueAnimatorOfFloat3.addListener(new Animator.AnimatorListener() { // from class: X.0eVi
            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                C19724012Fa.LIZLLL(320L, c1908530zlT, new C1091530eVj(valueAnimatorOfFloat2));
            }
        });
        valueAnimatorOfFloat3.addListener(new Animator.AnimatorListener() { // from class: X.0eVm
            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                C1908530zlT c1908530zlT2 = c1908530zlT;
                c1908530zlT2.getClass();
                if (C500260Jjc.LJJIFFI(InterfaceC772390URp.a.LIZIZ())) {
                    C19724012Fa.LIZLLL(3000L, c1908530zlT2, new C1091550eVl(c1908530zlT2));
                }
                c1908530zlT.z0(true);
                c1908530zlT.u0(false);
                c1908530zlT.LLJJIJI = false;
            }
        });
        valueAnimatorOfFloat3.setDuration(640L);
        valueAnimatorOfFloat3.setInterpolator(new PathInterpolator(0.42f, 0.0f, 0.58f, 1.0f));
        valueAnimatorOfFloat3.start();
        return Unit.LIZ;
    }
}
