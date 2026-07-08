package X;

import Y.AAListenerS324S0100000_13;
import Y.AAListenerS334S0100000_24;
import Y.ACListenerS158S0100000_24;
import Y.AUListenerS226S0200000_19;
import Y.AUListenerS268S0100000_19;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.Layout;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS603S0100000_24;

/* JADX INFO: renamed from: X.0roQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1602840roQ extends C214906198m {
    public final Context LL;
    public final Function1<Context, ImageView> LLILLJJLI;
    public final Function1<TuxIconView, Animator> LLILLL;
    public final Function0<Unit> LLILZ;
    public final Function0<Unit> LLILZIL;
    public final boolean LLILZLL;
    public final View LLIZ;
    public final C21415018rM LLIZLLLIL;
    public final String LLJ;
    public final FrameLayout LLJI;
    public final EnumC429580Gsu LLJIJIL;
    public View LLJILJIL;
    public int LLJILJILJ;
    public final int LLJILLL;
    public final int LLJJ;
    public final int LLJJI;
    public AnimatorSet LLJJIII;
    public Long LLJJIJI;
    public long LLJJIJIIJIL;

    @Override // X.C214906198m, android.widget.PopupWindow
    public final void dismiss() {
        View view;
        super.dismiss();
        AnimatorSet animatorSet = this.LLJJIII;
        if (animatorSet != null && animatorSet.isRunning() && (view = this.LLJILJIL) != null) {
            view.clearAnimation();
        }
        View view2 = this.LLJILJIL;
        if (view2 != null) {
            C786410Ut5.Ob(view2, 1.0f);
            C786410Ut5.pc(view2, 1.0f);
        }
        this.LLJILJIL = null;
    }

    public final ValueAnimator LJJIIJZLJL(View view, int i, int i2) {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i, i2);
        valueAnimatorOfInt.setDuration(300L);
        valueAnimatorOfInt.setInterpolator(C1619980sG4.LIZLLL());
        valueAnimatorOfInt.addUpdateListener(new AUListenerS226S0200000_19(this, view, 1));
        return valueAnimatorOfInt;
    }

    public final void LJJIJIIJI(int i, View view, boolean z) {
        if (view == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = i;
        if (z) {
            if (C444960Hcc.LIZIZ()) {
                if (this.LLJIJIL == EnumC429580Gsu.RIGHT) {
                    C426750GoL.LJIIL(this.LLIZ, Integer.valueOf(this.LLJILLL), 0, Integer.valueOf(this.LLJJ), 0, 16);
                } else {
                    C426750GoL.LJIIL(this.LLIZ, Integer.valueOf(this.LLJJ), 0, Integer.valueOf(this.LLJILLL), 0, 16);
                }
            } else if (this.LLJIJIL == EnumC429580Gsu.RIGHT) {
                C426750GoL.LJIIL(this.LLIZ, Integer.valueOf(this.LLJJ), 0, Integer.valueOf(this.LLJILLL), 0, 16);
            } else {
                C426750GoL.LJIIL(this.LLIZ, Integer.valueOf(this.LLJILLL), 0, Integer.valueOf(this.LLJJ), 0, 16);
            }
        }
        C786410Ut5.W5(view, layoutParams);
    }

    public static ValueAnimator LJJIIJ(View view, float f, float f2, long j) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, f2);
        valueAnimatorOfFloat.setDuration(j);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS268S0100000_19(view, 10));
        return valueAnimatorOfFloat;
    }

    public final void LJJIJ(View view, ImageView imageView, int i, int i2) {
        AnimatorSet.Builder builderWith;
        AnimatorSet.Builder builderPlay;
        AnimatorSet.Builder builderPlay2;
        AnimatorSet.Builder builderPlay3;
        Function1<TuxIconView, Animator> function1;
        Animator animatorInvoke;
        C786410Ut5.LJLLLLLL(0, this.LLIZ);
        View view2 = this.LLIZ;
        ValueAnimator valueAnimatorLJJIIJZLJL = LJJIIJZLJL(view2, i, i2);
        ValueAnimator valueAnimatorLJJIIJ = LJJIIJ(view2, 0.0f, 1.0f, 150L);
        AnimatorSet animatorSet = new AnimatorSet();
        AnimatorSet.Builder builderPlay4 = animatorSet.play(valueAnimatorLJJIIJZLJL);
        if (builderPlay4 != null) {
            builderPlay4.with(valueAnimatorLJJIIJ);
        }
        ValueAnimator valueAnimatorLJJIIJZLJL2 = LJJIIJZLJL(this.LLIZ, i2, i + this.LLJJ);
        if (view != null) {
            ValueAnimator valueAnimatorLJJIIZ = LJJIIZ(view, 1.0f, 0.7f, 100L, new LinearInterpolator());
            ValueAnimator valueAnimatorLJJIIJ2 = LJJIIJ(this.LLIZ, 1.0f, 0.0f, 100L);
            AnimatorSet animatorSet2 = new AnimatorSet();
            AnimatorSet.Builder builderPlay5 = animatorSet2.play(valueAnimatorLJJIIZ);
            if (builderPlay5 != null) {
                builderWith = builderPlay5.with(valueAnimatorLJJIIJ2);
            } else {
                builderWith = null;
            }
            if ((imageView instanceof TuxIconView) && (function1 = this.LLILLL) != null && (animatorInvoke = function1.invoke(imageView)) != null && builderWith != null) {
                builderWith.with(animatorInvoke);
            }
            ValueAnimator valueAnimatorLJJIIZ2 = LJJIIZ(view, 0.7f, 1.0f, 300L, C1619980sG4.LJIIIIZZ());
            valueAnimatorLJJIIJZLJL2.setStartDelay(2000L);
            animatorSet2.setStartDelay(2100L);
            valueAnimatorLJJIIZ2.setStartDelay(2300L);
            AnimatorSet animatorSet3 = new AnimatorSet();
            this.LLJJIII = animatorSet3;
            animatorSet3.play(animatorSet);
            AnimatorSet animatorSet4 = this.LLJJIII;
            if (animatorSet4 != null && (builderPlay3 = animatorSet4.play(valueAnimatorLJJIIJZLJL2)) != null) {
                builderPlay3.after(animatorSet);
            }
            AnimatorSet animatorSet5 = this.LLJJIII;
            if (animatorSet5 != null && (builderPlay2 = animatorSet5.play(animatorSet2)) != null) {
                builderPlay2.after(animatorSet);
            }
            AnimatorSet animatorSet6 = this.LLJJIII;
            if (animatorSet6 != null && (builderPlay = animatorSet6.play(valueAnimatorLJJIIZ2)) != null) {
                builderPlay.after(animatorSet);
            }
            AnimatorSet animatorSet7 = this.LLJJIII;
            if (animatorSet7 != null) {
                animatorSet7.addListener(new AAListenerS324S0100000_13(this, 3));
            }
            AnimatorSet animatorSet8 = this.LLJJIII;
            if (animatorSet8 != null) {
                animatorSet8.addPauseListener(new Animator.AnimatorPauseListener() { // from class: X.0roR
                    @Override // android.animation.Animator.AnimatorPauseListener
                    public final void onAnimationResume(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorPauseListener
                    public final void onAnimationPause(Animator animator) {
                        long jCurrentTimeMillis;
                        C1602840roQ c1602840roQ = this.LL;
                        long jCurrentTimeMillis2 = System.currentTimeMillis();
                        Long l = this.LL.LLJJIJI;
                        if (l != null) {
                            jCurrentTimeMillis = l.longValue();
                        } else {
                            jCurrentTimeMillis = System.currentTimeMillis();
                        }
                        c1602840roQ.LLJJIJIIJIL = jCurrentTimeMillis2 - jCurrentTimeMillis;
                    }
                });
            }
            AnimatorSet animatorSet9 = this.LLJJIII;
            if (animatorSet9 != null) {
                animatorSet9.addListener(new AAListenerS334S0100000_24(this, 5));
            }
            AnimatorSet animatorSet10 = this.LLJJIII;
            if (animatorSet10 != null) {
                animatorSet10.start();
            }
        }
    }

    @Override // X.C214906198m, android.widget.PopupWindow
    public final void showAtLocation(View view, int i, int i2, int i3) {
        int marginStart;
        int marginEnd;
        this.LLJILJIL = view;
        C786410Ut5.LJLLLLLL(4, this.LLIZ);
        ImageView c422820Gi0 = new C422820Gi0(this.LL);
        Function1<Context, ImageView> function1 = this.LLILLJJLI;
        if (function1 != null) {
            ImageView imageViewInvoke = function1.invoke(this.LL);
            if (imageViewInvoke != null) {
                c422820Gi0 = imageViewInvoke;
            }
        } else {
            c422820Gi0.setImageDrawable(((ImageView) view).getDrawable());
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28)));
        layoutParams.gravity = 17;
        this.LLJI.addView(c422820Gi0, layoutParams);
        C444830HcP c444830HcP = new C444830HcP();
        c444830HcP.LJIILIIL(this.LLJ);
        c444830HcP.LIZLLL = false;
        c444830HcP.LJ = false;
        c444830HcP.LJII(42);
        Layout layoutLIZIZ = c444830HcP.LIZIZ();
        this.LLIZLLLIL.setTextLayout(layoutLIZIZ);
        int i4 = this.LLJILLL + this.LLJJ;
        int width = layoutLIZIZ.getWidth();
        ViewGroup.LayoutParams layoutParams2 = this.LLIZLLLIL.getLayoutParams();
        if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
            marginStart = ((ViewGroup.MarginLayoutParams) layoutParams2).getMarginStart();
        } else {
            marginStart = 0;
        }
        int i5 = width + marginStart;
        ViewGroup.LayoutParams layoutParams3 = this.LLIZLLLIL.getLayoutParams();
        if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
            marginEnd = ((ViewGroup.MarginLayoutParams) layoutParams3).getMarginEnd();
        } else {
            marginEnd = 0;
        }
        int paddingStart = i4 + i5 + marginEnd + this.LLIZLLLIL.getPaddingStart() + this.LLIZLLLIL.getPaddingEnd() + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28));
        float f = (C1602820roO.LIZIZ - this.LLJJI) - i2;
        if (f < paddingStart) {
            paddingStart = C814420VxA.LIZIZ(f);
        }
        setWidth(paddingStart);
        int measuredWidth = view.getMeasuredWidth() + (this.LLJILLL * 2);
        this.LLJILJILJ = measuredWidth;
        LJJIJIIJI(measuredWidth, this.LLIZ, false);
        if (this.LLILZLL) {
            LJJIJ(view, c422820Gi0, this.LLJILJILJ, getWidth());
        } else {
            LJJIJ(view, c422820Gi0, this.LLJILJILJ, getWidth());
        }
        super.showAtLocation(view, i, i2, i3);
    }

    public final ValueAnimator LJJIIZ(View view, float f, float f2, long j, Interpolator interpolator) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, f2);
        valueAnimatorOfFloat.setDuration(j);
        valueAnimatorOfFloat.setInterpolator(interpolator);
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS226S0200000_19(this, view, 2));
        return valueAnimatorOfFloat;
    }

    public C1602840roQ(Context context, String str, int i, int i2, AwS603S0100000_24 awS603S0100000_24, EnumC429580Gsu enumC429580Gsu, AwS603S0100000_24 awS603S0100000_242, AwS568S0100000_24 awS568S0100000_24, AwS568S0100000_24 awS568S0100000_242, boolean z) {
        View viewSd;
        View viewSd2;
        this.LL = context;
        this.LLILLJJLI = awS603S0100000_24;
        this.LLILLL = awS603S0100000_242;
        this.LLILZ = awS568S0100000_24;
        this.LLILZIL = awS568S0100000_242;
        this.LLILZLL = z;
        EnumC429580Gsu enumC429580Gsu2 = EnumC429580Gsu.RIGHT;
        this.LLJIJIL = enumC429580Gsu2;
        this.LLJJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
        this.LLJ = str;
        setFocusable(false);
        setOutsideTouchable(false);
        this.LLJIJIL = enumC429580Gsu;
        setWidth(-2);
        setHeight(-2);
        if (C444960Hcc.LIZIZ()) {
            if (enumC429580Gsu == EnumC429580Gsu.LEFT) {
                viewSd2 = C786410Ut5.Sd(R.layout.cd7, C786410Ut5.ne(context), null);
            } else {
                viewSd2 = C786410Ut5.Sd(R.layout.cd8, C786410Ut5.ne(context), null);
            }
            setContentView(viewSd2);
        } else {
            if (enumC429580Gsu == enumC429580Gsu2) {
                viewSd = C786410Ut5.Sd(R.layout.cd8, C786410Ut5.ne(context), null);
            } else {
                viewSd = C786410Ut5.Sd(R.layout.cd7, C786410Ut5.ne(context), null);
            }
            setContentView(viewSd);
        }
        View viewFindViewById = getContentView().findViewById(R.id.ri0);
        this.LLIZ = viewFindViewById;
        if (enumC429580Gsu == enumC429580Gsu2) {
            this.LLJILLL = i2;
            this.LLJJ = i;
            viewFindViewById.setPadding(i2, 0, i2, 0);
        } else {
            this.LLJILLL = i;
            this.LLJJ = i2;
            viewFindViewById.setPadding(i, 0, i, 0);
        }
        this.LLIZLLLIL = (C21415018rM) getContentView().findViewById(R.id.rh2);
        this.LLJI = (FrameLayout) getContentView().findViewById(R.id.bi3);
        C786410Ut5.I7(new ACListenerS158S0100000_24(this, 63), viewFindViewById);
    }
}
