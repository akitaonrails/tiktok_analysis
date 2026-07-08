package X;

import Y.ARunnableS106S0100000_6;
import Y.AUListenerS256S0100000_6;
import android.animation.Animator;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: renamed from: X.0H9B, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0H9B extends LinearLayout implements InterfaceC736220SuK {
    public final C21415018rM LL;
    public final C444830HcP LLILLJJLI;
    public final C1295960jpS LLILLL;
    public final TuxIconView LLILZ;
    public boolean LLILZIL;
    public boolean LLILZLL;
    public final GradientDrawable LLIZ;
    public ValueAnimator LLIZLLLIL;
    public ValueAnimator LLJ;
    public ValueAnimator LLJI;
    public final C01GW LLJIJIL;
    public final C01GW LLJILJIL;
    public final C01GW LLJILJILJ;
    public final int LLJILLL;
    public boolean LLJJ;
    public final ARunnableS106S0100000_6 LLJJI;

    private final int getMaxContainerWidth() {
        return ((Number) this.LLJILJILJ.getValue()).intValue();
    }

    private final Handler getUiHandler() {
        return (Handler) this.LLJIJIL.getValue();
    }

    private final C0ZDN getVibrator() {
        return (C0ZDN) this.LLJILJIL.getValue();
    }

    @Override // X.InterfaceC736220SuK
    public final void LIZ() {
        int iIntValue;
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        ValueAnimator valueAnimator3;
        float fLJII = LJII(this.LLILZIL ? getContext().getString(2131848692) : getContext().getString(2131848696));
        getUiHandler().removeCallbacks(this.LLJJI);
        ValueAnimator valueAnimator4 = this.LLJI;
        if (valueAnimator4 != null && valueAnimator4.isRunning() && (valueAnimator3 = this.LLJI) != null) {
            valueAnimator3.cancel();
        }
        getVibrator().LIZ(0);
        LIZLLL(false);
        ValueAnimator valueAnimator5 = this.LLIZLLLIL;
        if (valueAnimator5 != null && valueAnimator5.isRunning() && (valueAnimator2 = this.LLIZLLLIL) != null) {
            valueAnimator2.end();
        }
        ValueAnimator valueAnimator6 = this.LLJ;
        if (valueAnimator6 != null && valueAnimator6.isRunning() && (valueAnimator = this.LLJ) != null) {
            valueAnimator.end();
        }
        int iLJFF = LJFF(this.LLILZLL);
        if (this.LLILZLL) {
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zj, getContext());
            iIntValue = numLIZJ != null ? numLIZJ.intValue() : -16777216;
        } else {
            iIntValue = -1;
        }
        LJIIIZ(fLJII, iLJFF, iIntValue);
    }

    @Override // X.InterfaceC736220SuK
    public final void LIZIZ() {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        ValueAnimator valueAnimator3;
        float fLJII = LJII(this.LLILZIL ? getContext().getString(2131848691) : getContext().getString(2131848695));
        ValueAnimator valueAnimator4 = this.LLJI;
        if (valueAnimator4 != null && valueAnimator4.isRunning() && (valueAnimator3 = this.LLJI) != null) {
            valueAnimator3.cancel();
        }
        LIZLLL(true);
        ValueAnimator valueAnimator5 = this.LLIZLLLIL;
        if (valueAnimator5 != null && valueAnimator5.isRunning() && (valueAnimator2 = this.LLIZLLLIL) != null) {
            valueAnimator2.end();
        }
        ValueAnimator valueAnimator6 = this.LLJ;
        if (valueAnimator6 != null && valueAnimator6.isRunning() && (valueAnimator = this.LLJ) != null) {
            valueAnimator.end();
        }
        int iLJFF = LJFF(true);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zj, getContext());
        LJIIIZ(fLJII, iLJFF, numLIZJ != null ? numLIZJ.intValue() : -16777216);
    }

    public final void LJI() {
        setPadding(this.LLJILLL, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(9)), this.LLJILLL, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(9)));
    }

    @Override // X.InterfaceC736220SuK
    public final void LJJL() {
        int visibility = getVisibility();
        setVisibility(8);
        C1602160rnK.LIZIZ(visibility, 8, this);
        ValueAnimator valueAnimator = this.LLIZLLLIL;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.LLJ;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        ValueAnimator valueAnimator3 = this.LLJI;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
        }
        getUiHandler().removeCallbacks(this.LLJJI);
        this.LLILLL.cancelAnimation();
    }

    public final void LIZLLL(boolean z) {
        if (z) {
            C1295960jpS c1295960jpS = this.LLILLL;
            C786410Ut5.LLD(0, c1295960jpS);
            c1295960jpS.playAnimation();
            C786410Ut5.LLLLLLZZ(this.LLILZ, 8);
            return;
        }
        C1295960jpS c1295960jpS2 = this.LLILLL;
        C786410Ut5.LLD(8, c1295960jpS2);
        c1295960jpS2.cancelAnimation();
        C786410Ut5.LLLLLLZZ(this.LLILZ, 0);
    }

    public final Layout LJ(C444830HcP c444830HcP) {
        int maxContainerWidth = getMaxContainerWidth();
        int i = this.LLJILLL;
        c444830HcP.LIZIZ.LJ = (((maxContainerWidth - i) - i) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6))) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
        return C444830HcP.LIZJ(c444830HcP, 1.0f, true, null, 28);
    }

    public final int LJFF(boolean z) {
        if (z) {
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zi, getContext());
            if (numLIZJ != null) {
                return numLIZJ.intValue();
            }
            return -1;
        }
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.zj, getContext());
        if (numLIZJ2 != null) {
            return numLIZJ2.intValue();
        }
        return -16777216;
    }

    public final float LJII(String str) {
        int width;
        if (!this.LLJJ) {
            C444830HcP c444830HcP = this.LLILLJJLI;
            c444830HcP.LJII(42);
            c444830HcP.LJIILIIL(str);
            Layout layoutLIZIZ = c444830HcP.LIZIZ();
            this.LL.setTextLayout(layoutLIZIZ);
            width = layoutLIZIZ.getWidth();
        } else {
            C444830HcP c444830HcP2 = this.LLILLJJLI;
            c444830HcP2.LJII(82);
            c444830HcP2.LJIILIIL(str);
            Layout layoutLJ = LJ(c444830HcP2);
            this.LL.setTextLayout(layoutLJ);
            width = layoutLJ.getWidth();
        }
        return width;
    }

    public final void LJIIIIZZ(boolean z) {
        int iIntValue;
        C21415018rM c21415018rM = this.LL;
        C444830HcP c444830HcP = this.LLILLJJLI;
        if (z) {
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.z_, getContext());
            if (numLIZJ != null) {
                iIntValue = numLIZJ.intValue();
            } else {
                iIntValue = -16777216;
            }
        } else {
            Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.zi, getContext());
            if (numLIZJ2 != null) {
                iIntValue = numLIZJ2.intValue();
            } else {
                iIntValue = -1;
            }
        }
        c444830HcP.LJIILJJIL(iIntValue);
        c21415018rM.setTextLayout(LJ(c444830HcP));
    }

    public C0H9B(Context context, AttributeSet attributeSet) {
        int iIntValue;
        super(context, attributeSet, 0);
        this.LLILZIL = true;
        this.LLJIJIL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(518));
        this.LLJILJIL = C452501pT.LIZIZ(new AwS550S0100000_6(context, 1317));
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS550S0100000_6(context, 1316));
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
        this.LLJILLL = iLIZIZ;
        this.LLJJI = new ARunnableS106S0100000_6((Object) this, 244);
        setOrientation(0);
        setGravity(17);
        LJI();
        C1295960jpS c1295960jpS = new C1295960jpS(context);
        C786410Ut5.LLD(8, c1295960jpS);
        c1295960jpS.setAnimation(R.raw.tux_lottie_common_infrastructure_playback_lock2xspeed);
        c1295960jpS.setRepeatCount(-1);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
        marginLayoutParams.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
        C786410Ut5.s6(c1295960jpS, marginLayoutParams);
        this.LLILLL = c1295960jpS;
        addView(c1295960jpS);
        TuxIconView tuxIconView = new TuxIconView(context, null, 0, 6, null);
        C786410Ut5.LLLLLLZZ(tuxIconView, 8);
        tuxIconView.setIconRes(R.raw.icon_lock_fill);
        tuxIconView.setIconWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14)));
        tuxIconView.setIconHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14)));
        ViewGroup.MarginLayoutParams marginLayoutParams2 = new ViewGroup.MarginLayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14)));
        marginLayoutParams2.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)));
        C786410Ut5.M6(tuxIconView, marginLayoutParams2);
        this.LLILZ = tuxIconView;
        addView(tuxIconView);
        C21415018rM c21415018rM = new C21415018rM(context, null, 6);
        C444830HcP c444830HcP = new C444830HcP();
        c444830HcP.LIZIZ.LJ = (((getMaxContainerWidth() - iLIZIZ) - iLIZIZ) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6))) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
        c444830HcP.LJIILIIL(context.getString(2131848691));
        c444830HcP.LJII(42);
        c444830HcP.LIZIZ.LJI = Layout.Alignment.ALIGN_CENTER;
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zi, c21415018rM.getRootView().getContext());
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        c444830HcP.LJIILJJIL(iIntValue);
        c444830HcP.LJIIIZ(2);
        this.LLILLJJLI = c444830HcP;
        c21415018rM.setTextLayout(LJ(c444830HcP));
        ViewGroup.MarginLayoutParams marginLayoutParams3 = new ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams3.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)));
        C786410Ut5.Q6(c21415018rM, marginLayoutParams3);
        this.LL = c21415018rM;
        addView(c21415018rM);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(200.0f);
        gradientDrawable.setColor(LJFF(false));
        this.LLIZ = gradientDrawable;
        setBackground(gradientDrawable);
        int visibility = getVisibility();
        setVisibility(8);
        C1602160rnK.LIZIZ(visibility, 8, this);
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams((int) LJII(context.getString(2131848691)), -2);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(layoutParams);
        for (String str : C1697810uHb.LJIIJJI(getContext().getString(2131848691), getContext().getString(2131848695), getContext().getString(2131848692), getContext().getString(2131848696))) {
            C444830HcP c444830HcP2 = this.LLILLJJLI;
            c444830HcP2.LJII(42);
            c444830HcP2.LJIILIIL(str);
            if (c444830HcP2.LIZIZ().getLineCount() > 1) {
                this.LLJJ = true;
            }
        }
    }

    @Override // X.InterfaceC736220SuK
    public final void LIZJ(float f, boolean z) {
        boolean z2;
        String string;
        int visibility = getVisibility();
        setVisibility(0);
        C1602160rnK.LIZIZ(visibility, 0, this);
        if (f == 2.0f) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z3 = !z2;
        this.LLILZIL = z3;
        if (z3) {
            string = getContext().getString(2131848691);
        } else {
            string = getContext().getString(2131848695);
        }
        LJII(string);
        if (z) {
            C786410Ut5.LJLIIL(3000L, getUiHandler(), this.LLJJI);
        }
        LIZLLL(true);
        this.LLILZLL = false;
        this.LLIZ.setColor(LJFF(false));
        setBackground(this.LLIZ);
        LJIIIIZZ(false);
    }

    public final void LJIIIZ(float f, int i, final int i2) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i3;
        int i4;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        int width = getWidth();
        int i5 = this.LLJILLL;
        float paddingRight = i5 + i5 + f + this.LL.getPaddingRight() + this.LL.getPaddingLeft();
        ViewGroup.LayoutParams layoutParams = this.LL.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        } else {
            marginLayoutParams = null;
        }
        if (marginLayoutParams != null) {
            i3 = marginLayoutParams.rightMargin;
        } else {
            i3 = 0;
        }
        float f2 = paddingRight + i3;
        ViewGroup.LayoutParams layoutParams2 = this.LL.getLayoutParams();
        if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
            i4 = marginLayoutParams2.leftMargin;
        } else {
            i4 = 0;
        }
        float fLIZIZ = f2 + i4 + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
        ViewGroup.LayoutParams layoutParams3 = getLayoutParams();
        layoutParams3.width = width;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(layoutParams3);
        setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(9)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(9)));
        ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(i), Integer.valueOf(i2));
        valueAnimatorOfObject.setDuration(200L);
        valueAnimatorOfObject.addUpdateListener(new AUListenerS256S0100000_6(this, 24));
        this.LLIZLLLIL = valueAnimatorOfObject;
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(width, (int) fLIZIZ);
        valueAnimatorOfInt.setDuration(200L);
        valueAnimatorOfInt.addUpdateListener(new AUListenerS256S0100000_6(this, 25));
        valueAnimatorOfInt.addListener(new Animator.AnimatorListener() { // from class: X.0H9C
            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
                this.LL.getClass();
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                C0H9B c0h9b = this.LL;
                ViewGroup.LayoutParams layoutParams4 = c0h9b.getLayoutParams();
                layoutParams4.width = -2;
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c0h9b);
                c0h9b.setLayoutParams(layoutParams4);
                this.LL.LJI();
                C0H9B c0h9b2 = this.LL;
                c0h9b2.LLIZ.setColor(i2);
                c0h9b2.setBackground(c0h9b2.LLIZ);
                C0H9B c0h9b3 = this.LL;
                c0h9b3.getClass();
                boolean z = !c0h9b3.LLILZLL;
                c0h9b3.LLILZLL = z;
                c0h9b3.LJIIIIZZ(z);
            }
        });
        this.LLJ = valueAnimatorOfInt;
        ValueAnimator valueAnimator = this.LLIZLLLIL;
        if (valueAnimator != null) {
            valueAnimator.start();
        }
        ValueAnimator valueAnimator2 = this.LLJ;
        if (valueAnimator2 != null) {
            valueAnimator2.start();
        }
    }
}
