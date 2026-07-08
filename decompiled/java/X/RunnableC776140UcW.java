package X;

import Y.ALAdapterS4S0110000_12;
import Y.ALAdapterS9S0200000_12;
import Y.AUListenerS262S0100000_12;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.broadcast.record.LiveRecordManager;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS556S0100000_12;
import wh6.AbS694S0100000_12;

/* JADX INFO: renamed from: X.0UcW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class RunnableC776140UcW extends FrameLayout implements InterfaceC775360UbG, Runnable {
    public static final int LLJJIJIL = C439101nJ.LIZ(22);
    public ConstraintLayout LL;
    public View LLILLJJLI;
    public LiveIconView LLILLL;
    public View LLILZ;
    public C16F5 LLILZIL;
    public final int LLILZLL;
    public final int LLIZ;
    public final float[] LLIZLLLIL;
    public final float[] LLJ;
    public final float[] LLJI;
    public int LLJIJIL;
    public final GradientDrawable LLJILJIL;
    public int LLJILJILJ;
    public ValueAnimator LLJILLL;
    public boolean LLJJ;
    public boolean LLJJI;
    public boolean LLJJIII;
    public boolean LLJJIJI;
    public Function0<Unit> LLJJIJIIJIL;

    @Override // X.InterfaceC775360UbG
    public final void LIZJ() {
        this.LLJJIII = false;
    }

    @Override // X.InterfaceC775360UbG
    public final void LIZLLL() {
        this.LLJJIII = false;
    }

    @Override // X.InterfaceC775360UbG
    public final void LJJJJ() {
        this.LLJJIII = true;
        if (this.LLJJ) {
            LJFF();
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_anchor_record_floating_ball_drag");
        c474500IjALIZ.LJIL();
        LiveRecordManager.LL.getClass();
        c474500IjALIZ.LJJII(Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(LiveRecordManager.LLILZ)) ? 1 : 0), "is_record");
        c474500IjALIZ.LIZ();
        C473410IhP.LIZ().removeCallbacks(this);
        this.LLJILJIL.setCornerRadii(this.LLJI);
        this.LLJILJIL.invalidateSelf();
    }

    public final void LJ() {
        if (this.LLJJ || this.LLJJIJI) {
            return;
        }
        this.LLJJ = true;
        this.LLJJI = false;
        this.LLJJIJI = true;
        int i = this.LLJIJIL;
        if (i == 0) {
            LJIIJ(new AwS556S0100000_12(this, 958), true);
        } else if (i == 1) {
            LJIIJ(new AwS556S0100000_12(this, 959), false);
        }
    }

    public final void LJFF() {
        if (!this.LLJJ || this.LLJJIJI) {
            return;
        }
        this.LLJJ = false;
        this.LLJJI = true;
        this.LLJJIJI = true;
        int i = this.LLJIJIL;
        if (i == 0) {
            LJIIJJI(new AwS556S0100000_12(this, 960), true);
        } else if (i == 1) {
            LJIIJJI(new AwS556S0100000_12(this, 961), false);
        }
        C473410IhP.LIZ().removeCallbacks(this);
        C786410Ut5.LJLIIL(3000L, C473410IhP.LIZ(), this);
    }

    public final LiveIconView getIvCloseFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.lc0);
            this.LLILLL = (LiveIconView) callbackFindViewById;
        }
        return (LiveIconView) callbackFindViewById;
    }

    public final View getIvRecordRedDotFromXml() {
        View view = this.LLILZ;
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(R.id.lt1);
        this.LLILZ = viewFindViewById;
        return viewFindViewById;
    }

    public final View getIvRecordRedRingFromXml() {
        View view = this.LLILLJJLI;
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(R.id.lt2);
        this.LLILLJJLI = viewFindViewById;
        return viewFindViewById;
    }

    public final ConstraintLayout getRecordBallLayoutFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.sy9);
            this.LL = (ConstraintLayout) callbackFindViewById;
        }
        return (ConstraintLayout) callbackFindViewById;
    }

    public final C16F5 getTvRecordTimeFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.tv_record_time);
            this.LLILZIL = (C16F5) callbackFindViewById;
        }
        return (C16F5) callbackFindViewById;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("LiveRecordHandleBallView@974f.run");
        try {
            LJ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveRecordHandleBallView@974f.run");
    }

    @Override // X.InterfaceC775360UbG
    public final boolean LIZ() {
        return this.LLJJI;
    }

    public final boolean getCollapse() {
        return this.LLJJ;
    }

    @Override // X.InterfaceC775360UbG
    public int getExpandWidth() {
        return this.LLJILJILJ;
    }

    public RunnableC776140UcW(Context context) {
        super(context, null, 0);
        int iLJIIIIZZ = LJIIIIZZ(R.attr.exn);
        this.LLILZLL = iLJIIIIZZ;
        this.LLIZ = LJIIIIZZ(R.attr.exl);
        float[] fArr = {0.0f, 0.0f, C418440Gaw.LIZIZ(25), C418440Gaw.LIZIZ(25), C418440Gaw.LIZIZ(25), C418440Gaw.LIZIZ(25), 0.0f, 0.0f};
        this.LLIZLLLIL = fArr;
        float[] fArr2 = {C418440Gaw.LIZIZ(25), C418440Gaw.LIZIZ(25), 0.0f, 0.0f, 0.0f, 0.0f, C418440Gaw.LIZIZ(25), C418440Gaw.LIZIZ(25)};
        this.LLJ = fArr2;
        this.LLJI = new float[]{C418440Gaw.LIZIZ(25), C418440Gaw.LIZIZ(25), C418440Gaw.LIZIZ(25), C418440Gaw.LIZIZ(25), C418440Gaw.LIZIZ(25), C418440Gaw.LIZIZ(25), C418440Gaw.LIZIZ(25), C418440Gaw.LIZIZ(25)};
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(iLJIIIIZZ);
        gradientDrawable.setShape(0);
        this.LLJILJIL = gradientDrawable;
        this.LLJJI = true;
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.hkt, this, true);
        this.LLJIJIL = C497740JfY.LJJ() ? 1 : 0;
        ConstraintLayout recordBallLayoutFromXml = getRecordBallLayoutFromXml();
        gradientDrawable.setCornerRadii(C497740JfY.LJJ() ? fArr2 : fArr);
        recordBallLayoutFromXml.setBackground(gradientDrawable);
        C786410Ut5.LJLIIL(3000L, C473410IhP.LIZ(), this);
        C786410Ut5.I7(new AbS694S0100000_12(this, 32), this);
        C786410Ut5.I7(new AbS694S0100000_12(this, 33), getIvRecordRedRingFromXml());
        C786410Ut5.I7(new AbS694S0100000_12(this, 34), getIvCloseFromXml());
    }

    @Override // X.InterfaceC775360UbG
    public final void LIZIZ(int i) {
        this.LLJIJIL = i;
        if (i == 0) {
            this.LLJILJIL.setCornerRadii(this.LLIZLLLIL);
        } else {
            this.LLJILJIL.setCornerRadii(this.LLJ);
        }
        this.LLJILJIL.invalidateSelf();
        C473410IhP.LIZ().removeCallbacks(this);
        C786410Ut5.LJLIIL(3000L, C473410IhP.LIZ(), this);
    }

    public final int LJIIIIZZ(int i) {
        return C20736316Cj.LIZIZ(i, getContext());
    }

    public final void LJIIL(boolean z) {
        int i;
        int i2;
        float f;
        float f2;
        if (z) {
            ValueAnimator valueAnimatorOfFloat = this.LLJILLL;
            if (valueAnimatorOfFloat == null) {
                valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.8f);
                valueAnimatorOfFloat.setDuration(500L);
                valueAnimatorOfFloat.setRepeatMode(2);
                valueAnimatorOfFloat.setRepeatCount(-1);
                valueAnimatorOfFloat.addUpdateListener(new AUListenerS262S0100000_12(this, 66));
                this.LLJILLL = valueAnimatorOfFloat;
            }
            if (valueAnimatorOfFloat.isRunning()) {
                valueAnimatorOfFloat.cancel();
            }
            valueAnimatorOfFloat.start();
            Drawable background = getIvRecordRedDotFromXml().getBackground();
            background.mutate();
            background.setTint(LJIIIIZZ(R.attr.f09));
            getIvRecordRedRingFromXml().setBackground(getContext().getDrawable(R.drawable.f_c));
            if (this.LLJJ) {
                LJFF();
                return;
            }
            return;
        }
        ValueAnimator valueAnimator = this.LLJILLL;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        View ivRecordRedDotFromXml = getIvRecordRedDotFromXml();
        ivRecordRedDotFromXml.getLayoutParams().width = C439101nJ.LIZ(14);
        ivRecordRedDotFromXml.getLayoutParams().height = C439101nJ.LIZ(14);
        Drawable background2 = getIvRecordRedDotFromXml().getBackground();
        background2.mutate();
        if (this.LLJJ) {
            i = R.attr.f07;
        } else {
            i = R.attr.f08;
        }
        background2.setTint(LJIIIIZZ(i));
        View ivRecordRedRingFromXml = getIvRecordRedRingFromXml();
        Context context = getContext();
        if (this.LLJJ) {
            i2 = R.drawable.f_a;
        } else {
            i2 = R.drawable.f_b;
        }
        ivRecordRedRingFromXml.setBackground(context.getDrawable(i2));
        C786410Ut5.T4(getIvRecordRedRingFromXml(), 1.0f);
        if (this.LLJJIII) {
            return;
        }
        int i3 = this.LLJIJIL;
        float f3 = 0.0f;
        if (i3 != 0) {
            if (i3 != 1) {
                return;
            }
            if (C497740JfY.LJJ()) {
                View ivRecordRedRingFromXml2 = getIvRecordRedRingFromXml();
                if (this.LLJJ) {
                    f2 = LLJJIJIL;
                } else {
                    f2 = 0.0f;
                }
                C786410Ut5.Jc(ivRecordRedRingFromXml2, f2);
                View ivRecordRedDotFromXml2 = getIvRecordRedDotFromXml();
                if (this.LLJJ) {
                    f3 = LLJJIJIL;
                }
                C786410Ut5.Jc(ivRecordRedDotFromXml2, f3);
                return;
            }
            C786410Ut5.Jc(getIvRecordRedRingFromXml(), 0.0f);
            C786410Ut5.Jc(getIvRecordRedDotFromXml(), 0.0f);
            return;
        }
        if (!C497740JfY.LJJ()) {
            View ivRecordRedRingFromXml3 = getIvRecordRedRingFromXml();
            if (this.LLJJ) {
                f = -LLJJIJIL;
            } else {
                f = 0.0f;
            }
            C786410Ut5.Jc(ivRecordRedRingFromXml3, f);
            View ivRecordRedDotFromXml3 = getIvRecordRedDotFromXml();
            if (this.LLJJ) {
                f3 = -LLJJIJIL;
            }
            C786410Ut5.Jc(ivRecordRedDotFromXml3, f3);
            return;
        }
        C786410Ut5.Jc(getIvRecordRedRingFromXml(), 0.0f);
        C786410Ut5.Jc(getIvRecordRedDotFromXml(), 0.0f);
    }

    public final void setCloseAction$livebroadcast_impl_release(Function0<Unit> function0) {
        this.LLJJIJIIJIL = function0;
    }

    public final void setIvCloseFromXml(LiveIconView liveIconView) {
        this.LLILLL = liveIconView;
    }

    public final void setIvRecordRedDotFromXml(View view) {
        this.LLILZ = view;
    }

    public final void setIvRecordRedRingFromXml(View view) {
        this.LLILLJJLI = view;
    }

    public final void setRecordBallLayoutFromXml(ConstraintLayout constraintLayout) {
        this.LL = constraintLayout;
    }

    public final void setTvRecordTimeFromXml(C16F5 c16f5) {
        this.LLILZIL = c16f5;
    }

    public final ValueAnimator LJII(int i, int i2) {
        ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(i), Integer.valueOf(i2));
        valueAnimatorOfObject.setDuration(300L);
        valueAnimatorOfObject.addUpdateListener(new AUListenerS262S0100000_12(this, 64));
        return valueAnimatorOfObject;
    }

    public final void LJIIJ(Function0 function0, boolean z) {
        this.LLJILJILJ = getRecordBallLayoutFromXml().getMeasuredWidth();
        ValueAnimator valueAnimatorLJII = LJII(this.LLILZLL, this.LLIZ);
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(this.LLJILJILJ, LLJJIJIL);
        valueAnimatorOfInt.setDuration(300L);
        valueAnimatorOfInt.addUpdateListener(new AUListenerS262S0100000_12(this, 65));
        ValueAnimator valueAnimatorLJIIIZ = LJIIIZ(1.0f, 0.0f, z, true);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(valueAnimatorLJII).with(valueAnimatorOfInt).with(valueAnimatorLJIIIZ);
        animatorSet.addListener(new ALAdapterS9S0200000_12(this, function0, 7));
        animatorSet.start();
    }

    public final void LJIIJJI(Function0 function0, boolean z) {
        ValueAnimator valueAnimatorLJII = LJII(this.LLIZ, this.LLILZLL);
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(LLJJIJIL, this.LLJILJILJ);
        valueAnimatorOfInt.setDuration(300L);
        valueAnimatorOfInt.addUpdateListener(new AUListenerS262S0100000_12(this, 65));
        ValueAnimator valueAnimatorLJIIIZ = LJIIIZ(0.0f, 1.0f, z, false);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(valueAnimatorLJII).with(valueAnimatorOfInt).with(valueAnimatorLJIIIZ);
        animatorSet.addListener(new ALAdapterS9S0200000_12(this, function0, 8));
        animatorSet.start();
    }

    public final ValueAnimator LJIIIZ(float f, float f2, final boolean z, boolean z2) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, f2);
        valueAnimatorOfFloat.setDuration(150L);
        if (!z2) {
            valueAnimatorOfFloat.setStartDelay(100L);
        }
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.0UcX
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                Float f3;
                Object animatedValue = valueAnimator.getAnimatedValue();
                if ((animatedValue instanceof Float) && (f3 = (Float) animatedValue) != null) {
                    RunnableC776140UcW runnableC776140UcW = this.LL;
                    boolean z3 = z;
                    float fFloatValue = f3.floatValue();
                    LiveRecordManager.LL.getClass();
                    if (LiveRecordManager.LLILZ) {
                        C786410Ut5.T4(runnableC776140UcW.getIvRecordRedRingFromXml(), fFloatValue);
                        C786410Ut5.Jc(runnableC776140UcW.getIvRecordRedRingFromXml(), 0.0f);
                        if (z3) {
                            if (C497740JfY.LJJ()) {
                                C786410Ut5.Jc(runnableC776140UcW.getIvRecordRedDotFromXml(), (1 - fFloatValue) * C418440Gaw.LIZIZ(7));
                            } else {
                                C786410Ut5.Jc(runnableC776140UcW.getIvRecordRedDotFromXml(), (-(1 - fFloatValue)) * C418440Gaw.LIZIZ(12));
                            }
                        } else if (C497740JfY.LJJ()) {
                            C786410Ut5.Jc(runnableC776140UcW.getIvRecordRedDotFromXml(), (1 - fFloatValue) * C418440Gaw.LIZIZ(11));
                        } else {
                            C786410Ut5.Jc(runnableC776140UcW.getIvRecordRedDotFromXml(), (-(1 - fFloatValue)) * C418440Gaw.LIZIZ(9));
                        }
                    } else {
                        C786410Ut5.T4(runnableC776140UcW.getIvRecordRedRingFromXml(), 1.0f);
                        if (z3) {
                            if (!C497740JfY.LJJ()) {
                                View ivRecordRedRingFromXml = runnableC776140UcW.getIvRecordRedRingFromXml();
                                float f4 = -(1 - fFloatValue);
                                int i = RunnableC776140UcW.LLJJIJIL;
                                int i2 = RunnableC776140UcW.LLJJIJIL;
                                C786410Ut5.Jc(ivRecordRedRingFromXml, i2 * f4);
                                C786410Ut5.Jc(runnableC776140UcW.getIvRecordRedDotFromXml(), f4 * i2);
                            }
                        } else if (C497740JfY.LJJ()) {
                            View ivRecordRedRingFromXml2 = runnableC776140UcW.getIvRecordRedRingFromXml();
                            float f5 = 1 - fFloatValue;
                            int i3 = RunnableC776140UcW.LLJJIJIL;
                            int i4 = RunnableC776140UcW.LLJJIJIL;
                            C786410Ut5.Jc(ivRecordRedRingFromXml2, i4 * f5);
                            C786410Ut5.Jc(runnableC776140UcW.getIvRecordRedDotFromXml(), f5 * i4);
                        }
                    }
                    C786410Ut5.k5(runnableC776140UcW.getTvRecordTimeFromXml(), fFloatValue);
                    C786410Ut5.i5(runnableC776140UcW.getIvCloseFromXml(), fFloatValue);
                }
            }
        });
        valueAnimatorOfFloat.addListener(new ALAdapterS4S0110000_12(this, z2, 2));
        return valueAnimatorOfFloat;
    }
}
