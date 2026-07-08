package X;

import Y.ACListenerS161S0100000_27;
import Y.AUListenerS230S0200000_27;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import irm.AkS94S0100000_27;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS216S0000000_27;

/* JADX INFO: renamed from: X.0yPV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1856470yPV extends FrameLayout {
    public Function1<? super Integer, Unit> LL;
    public ViewGroup LLILLJJLI;
    public final ConstraintLayout LLILLL;
    public final TuxIconView LLILZ;
    public final View LLILZIL;
    public final TuxTextView LLILZLL;
    public final C0FNZ LLIZ;
    public final TuxIconView LLIZLLLIL;
    public AnimatorSet LLJ;
    public final C384050F3z LLJI;

    private final AnimatorSet getFloatingAnim() {
        final float fMeasureText;
        TextPaint paint;
        CharSequence text;
        AnimatorSet animatorSet = this.LLJ;
        if (animatorSet != null) {
            return animatorSet;
        }
        TuxTextView tuxTextView = this.LLILZLL;
        if (tuxTextView == null || (paint = tuxTextView.getPaint()) == null) {
            fMeasureText = 0.0f;
        } else {
            TuxTextView tuxTextView2 = this.LLILZLL;
            fMeasureText = paint.measureText((tuxTextView2 == null || (text = tuxTextView2.getText()) == null) ? null : text.toString());
        }
        final C817403Hg c817403Hg = new C817403Hg();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.setInterpolator(C1619980sG4.LIZLLL());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.0yPW
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                Float f;
                Object animatedValue = valueAnimator.getAnimatedValue();
                if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
                    C1856470yPV c1856470yPV = this.LL;
                    float f2 = fMeasureText;
                    C817403Hg c817403Hg2 = c817403Hg;
                    float fFloatValue = f.floatValue();
                    ConstraintLayout constraintLayout = c1856470yPV.LLILLL;
                    if (constraintLayout != null) {
                        C384050F3z c384050F3z = c1856470yPV.LLJI;
                        float fLIZIZ = C418440Gaw.LIZIZ(36);
                        c384050F3z.LJII = (int) (fLIZIZ + ((C418440Gaw.LIZIZ(112) - fLIZIZ) * fFloatValue));
                        float fLIZIZ2 = C418440Gaw.LIZIZ(36);
                        c384050F3z.LJI = (int) (fLIZIZ2 + ((C418440Gaw.LIZIZ(142) - fLIZIZ2) * fFloatValue));
                        float fLIZIZ3 = C418440Gaw.LIZIZ(18);
                        c384050F3z.LIZJ = Float.valueOf(fLIZIZ3 + ((C418440Gaw.LIZIZ(8) - fLIZIZ3) * fFloatValue));
                        Drawable drawableLIZ = c384050F3z.LIZ(c1856470yPV.getContext());
                        drawableLIZ.setAlpha((int) (c817403Hg2.element * 255));
                        constraintLayout.setBackground(drawableLIZ);
                    }
                    ConstraintLayout constraintLayout2 = c1856470yPV.LLILLL;
                    if (constraintLayout2 != null) {
                        float fLIZIZ4 = C418440Gaw.LIZIZ(36);
                        int iLIZIZ = (int) (fLIZIZ4 + ((C418440Gaw.LIZIZ(112) - fLIZIZ4) * fFloatValue));
                        float fLIZIZ5 = C418440Gaw.LIZIZ(36);
                        C1383370m6R.LJIILJJIL(iLIZIZ, (int) (fLIZIZ5 + ((C418440Gaw.LIZIZ(142) - fLIZIZ5) * fFloatValue)), constraintLayout2);
                    }
                    TuxIconView tuxIconView = c1856470yPV.LLILZ;
                    if (tuxIconView != null) {
                        float fLIZIZ6 = C418440Gaw.LIZIZ(21);
                        int iLIZIZ2 = (int) (fLIZIZ6 + ((C418440Gaw.LIZIZ(16) - fLIZIZ6) * fFloatValue));
                        C1383370m6R.LJIILJJIL(iLIZIZ2, iLIZIZ2, tuxIconView);
                        tuxIconView.setIconWidth(iLIZIZ2);
                        tuxIconView.setIconHeight(iLIZIZ2);
                    }
                    TuxTextView tuxTextView3 = c1856470yPV.LLILZLL;
                    if (tuxTextView3 != null) {
                        C1383370m6R.LJIILJJIL((int) f2, -2, tuxTextView3);
                    }
                }
            }
        });
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat2.setDuration(300L);
        valueAnimatorOfFloat2.addUpdateListener(new AUListenerS230S0200000_27(c817403Hg, this, 13));
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.play(valueAnimatorOfFloat).with(valueAnimatorOfFloat2);
        animatorSet2.addListener(new C1855650yOB() { // from class: X.0yPY
            @Override // X.C1855650yOB, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
            }
        });
        return animatorSet2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public C1856470yPV(Context context) {
        C419910GdJ c419910GdJ;
        int i;
        super(context, null, 0);
        try {
            C786410Ut5.Td(C786410Ut5.ne(new C1361400lX0(context, R.style.o2)), R.layout.fq4, this, true);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(R.id.dyn);
        if (constraintLayout != null) {
            this.LLILLL = constraintLayout;
            C786410Ut5.Y7(constraintLayout, new ACListenerS161S0100000_27(this, 137));
            setPressedMask(constraintLayout);
        }
        TuxIconView tuxIconView = (TuxIconView) findViewById(R.id.jwq);
        if (tuxIconView != null) {
            this.LLILZ = tuxIconView;
            if (C0QSF.LIZ()) {
                c419910GdJ = C14TF.LIZIZ.LJJLIIIJ().LIZ(Integer.valueOf(R.attr.zi), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(21))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(21))), false);
            } else {
                c419910GdJ = new C419910GdJ();
                if (C07IF.LIZ()) {
                    i = R.raw.icon_tako_new;
                } else {
                    i = R.raw.icon_tako;
                }
                c419910GdJ.LIZ = i;
                c419910GdJ.LJ = Integer.valueOf(R.attr.zi);
                c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(21));
                c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(21));
            }
            tuxIconView.setTuxIcon(c419910GdJ);
            if (!C07IF.LIZ()) {
                C786410Ut5.hc(tuxIconView, -1.0f);
            }
        }
        View viewFindViewById = findViewById(R.id.by6);
        if (viewFindViewById != null) {
            this.LLILZIL = viewFindViewById;
            viewFindViewById.setBackgroundResource(R.drawable.dey);
        }
        TuxIconView tuxIconView2 = (TuxIconView) findViewById(R.id.jwp);
        if (tuxIconView2 != null) {
            this.LLIZLLLIL = tuxIconView2;
            C419910GdJ c419910GdJ2 = new C419910GdJ();
            c419910GdJ2.LIZ = R.raw.icon_x_mark;
            c419910GdJ2.LJ = Integer.valueOf(R.attr.zl);
            c419910GdJ2.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
            c419910GdJ2.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
            tuxIconView2.setTuxIcon(c419910GdJ2);
            C786410Ut5.I7(new AkS94S0100000_27(this, 25), tuxIconView2);
        }
        C0FNZ c0fnz = (C0FNZ) findViewById(R.id.ltw);
        if (c0fnz != null) {
            this.LLIZ = c0fnz;
        }
        TuxTextView tuxTextView = (TuxTextView) findViewById(R.id.tv_screen_shot);
        if (tuxTextView != null) {
            if (((Boolean) C1820207Ay.LIZ.getValue()).booleanValue()) {
                tuxTextView.setText(context.getResources().getString(2131849785));
            }
            this.LLILZLL = tuxTextView;
        }
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(112));
        c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(142));
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.zd);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a02, new C1361400lX0(context, R.style.y0));
        if (numLIZJ != null) {
            c384050F3z.LJ = Integer.valueOf(numLIZJ.intValue());
        } else {
            c384050F3z.LJFF = Integer.valueOf(R.attr.a02);
        }
        c384050F3z.LIZLLL = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(0.5f))));
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(10));
        this.LLJI = c384050F3z;
    }

    private final void setPressedMask(View view) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.zb);
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(10));
        stateListDrawable.addState(new int[]{android.R.attr.state_pressed}, c384050F3z.LIZ(view.getContext()));
        stateListDrawable.addState(new int[0], new ColorDrawable(0));
        view.setForeground(stateListDrawable);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C339190DRl.LIZIZ(this);
        Function1<? super Integer, Unit> function1 = this.LL;
        if (function1 != null) {
            function1.invoke(3);
            return true;
        }
        return true;
    }

    public static void LIZ(final C1856470yPV c1856470yPV, final boolean z, final int i, final Function0 function0, int i2) {
        if ((i2 & 2) != 0) {
            i = 3;
        }
        if ((i2 & 4) != 0) {
            function0 = AFwS216S0000000_27.get$arr$(283);
        }
        AnimatorSet floatingAnim = c1856470yPV.getFloatingAnim();
        c1856470yPV.LLJ = floatingAnim;
        floatingAnim.addListener(new C1855650yOB() { // from class: X.0yPX
            @Override // X.C1855650yOB, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                TuxIconView tuxIconView = this.LL.LLIZLLLIL;
                if (tuxIconView != null) {
                    C339190DRl.LIZIZ(tuxIconView);
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator, boolean z2) {
                animator.removeListener(this);
                if (z) {
                    C1856470yPV c1856470yPV2 = this.LL;
                    int i3 = i;
                    c1856470yPV2.getClass();
                    C339190DRl.LIZIZ(c1856470yPV2);
                    Function1<? super Integer, Unit> function1 = c1856470yPV2.LL;
                    if (function1 != null) {
                        function1.invoke(Integer.valueOf(i3));
                    }
                } else {
                    TuxIconView tuxIconView = this.LL.LLIZLLLIL;
                    if (tuxIconView != null) {
                        C339190DRl.LIZLLL(tuxIconView);
                    }
                    TuxTextView tuxTextView = this.LL.LLILZLL;
                    if (tuxTextView != null) {
                        C1383370m6R.LJIILJJIL(-2, -2, tuxTextView);
                    }
                }
                function0.invoke();
            }
        });
        if (z) {
            if (Build.VERSION.SDK_INT >= 26) {
                floatingAnim.reverse();
                return;
            }
            C339190DRl.LIZIZ(c1856470yPV);
            Function1<? super Integer, Unit> function1 = c1856470yPV.LL;
            if (function1 != null) {
                function1.invoke(Integer.valueOf(i));
            }
            function0.invoke();
            return;
        }
        C339190DRl.LIZLLL(c1856470yPV);
        floatingAnim.start();
    }
}
