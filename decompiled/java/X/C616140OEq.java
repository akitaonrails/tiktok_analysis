package X;

import Y.AAListenerS134S0300000_9;
import Y.AUListenerS2S0303000_9;
import Y.AUListenerS77S0110000_9;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.AwS553S0100000_9;

/* JADX INFO: renamed from: X.0OEq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C616140OEq {
    public final TuxTextView LIZ;
    public final TuxTextView LIZIZ;
    public final View LIZJ;
    public final LinearLayout LIZLLL;
    public final LinearLayout LJ;
    public final Function0<Float> LJFF;
    public C1735430vGH LJI;
    public boolean LJII;
    public final C01GW LJIIIIZZ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(424));

    public final void LIZLLL() {
        ViewGroup.LayoutParams layoutParams;
        this.LJII = false;
        C1735430vGH c1735430vGH = this.LJI;
        if (c1735430vGH == null || !c1735430vGH.LIZJ()) {
            return;
        }
        C1735430vGH c1735430vGH2 = this.LJI;
        if (c1735430vGH2 != null) {
            c1735430vGH2.LIZ();
        }
        TuxTextView tuxTextView = this.LIZIZ;
        if (tuxTextView != null) {
            C786410Ut5.LLLLZLL(tuxTextView, 8);
        }
        View view = this.LIZJ;
        if (view == null || (layoutParams = view.getLayoutParams()) == null) {
            return;
        }
        layoutParams.width = -2;
    }

    public final void LIZ(final boolean z) {
        float f;
        View view = this.LIZJ;
        if (view != null) {
            C786410Ut5.LJLLLLLL(0, view);
        }
        View view2 = this.LIZJ;
        if (view2 != null) {
            if (z) {
                f = 0.0f;
            } else {
                f = 1.0f;
            }
            C786410Ut5.T4(view2, f);
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS77S0110000_9(this, z, 0));
        valueAnimatorOfFloat.addListener(new Animator.AnimatorListener(this) { // from class: X.0OB4
            public final /* synthetic */ C616140OEq LLILLJJLI;

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
                if (z) {
                    View view3 = this.LLILLJJLI.LIZJ;
                    if (view3 != null) {
                        C786410Ut5.LJLLLLLL(0, view3);
                    }
                    View view4 = this.LLILLJJLI.LIZJ;
                    if (view4 != null) {
                        C786410Ut5.T4(view4, 1.0f);
                        return;
                    }
                    return;
                }
                View view5 = this.LLILLJJLI.LIZJ;
                if (view5 != null) {
                    C786410Ut5.LJLLLLLL(8, view5);
                }
                View view6 = this.LLILLJJLI.LIZJ;
                if (view6 == null) {
                    return;
                }
                C786410Ut5.T4(view6, 0.0f);
            }

            {
                this.LLILLJJLI = this;
            }
        });
        valueAnimatorOfFloat.start();
    }

    public final void LIZIZ(final Function0 function0, final boolean z) {
        float f;
        LinearLayout linearLayout = this.LIZLLL;
        if (linearLayout != null) {
            C786410Ut5.LJZL(0, linearLayout);
        }
        LinearLayout linearLayout2 = this.LIZLLL;
        if (linearLayout2 != null) {
            if (z) {
                f = 0.0f;
            } else {
                f = 1.0f;
            }
            C786410Ut5.W4(linearLayout2, f);
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(100L);
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS77S0110000_9(this, z, 1));
        valueAnimatorOfFloat.addListener(new Animator.AnimatorListener() { // from class: X.0OEr
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
                if (z) {
                    LinearLayout linearLayout3 = this.LIZLLL;
                    if (linearLayout3 != null) {
                        C786410Ut5.LJZL(0, linearLayout3);
                    }
                    LinearLayout linearLayout4 = this.LIZLLL;
                    if (linearLayout4 != null) {
                        C786410Ut5.W4(linearLayout4, 1.0f);
                    }
                } else {
                    LinearLayout linearLayout5 = this.LIZLLL;
                    if (linearLayout5 != null) {
                        C786410Ut5.LJZL(8, linearLayout5);
                    }
                    LinearLayout linearLayout6 = this.LIZLLL;
                    if (linearLayout6 != null) {
                        C786410Ut5.W4(linearLayout6, 0.0f);
                    }
                }
                Function0<Unit> function02 = function0;
                if (function02 != null) {
                    function02.invoke();
                }
            }
        });
        valueAnimatorOfFloat.start();
    }

    public final void LIZJ(View view, Function0<Unit> function0) {
        View view2;
        if (view == null || (view2 = this.LIZJ) == null) {
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(150L);
        int width = view.getWidth();
        int width2 = view2.getWidth();
        float fFloatValue = this.LJFF.invoke().floatValue();
        int iLIZ = 0;
        if (fFloatValue != 1.0f && fFloatValue != 2.0f) {
            if (fFloatValue == 0.5f || fFloatValue == 1.5f) {
                iLIZ = C341940Daq.LIZ(67.0d);
            }
        } else {
            iLIZ = C341940Daq.LIZ(58.0d);
        }
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS2S0303000_9(this, view, width, width2, view2, iLIZ, 0));
        valueAnimatorOfFloat.addListener(new AAListenerS134S0300000_9(function0, view, this, 1));
        valueAnimatorOfFloat.start();
    }

    public C616140OEq(TuxTextView tuxTextView, TuxTextView tuxTextView2, View view, LinearLayout linearLayout, LinearLayout linearLayout2, AwS553S0100000_9 awS553S0100000_9) {
        this.LIZ = tuxTextView;
        this.LIZIZ = tuxTextView2;
        this.LIZJ = view;
        this.LIZLLL = linearLayout;
        this.LJ = linearLayout2;
        this.LJFF = awS553S0100000_9;
    }
}
