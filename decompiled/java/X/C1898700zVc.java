package X;

import Y.AAListenerS338S0100000_28;
import Y.ACListenerS162S0100000_28;
import Y.ALAdapterS22S0200000_28;
import Y.ALAdapterS23S0100000_28;
import Y.ALAdapterS9S0100000_12;
import Y.ARunnableS128S0100000_28;
import Y.ARunnableS81S0200000_12;
import Y.ARunnableS97S0200000_28;
import Y.AUListenerS276S0100000_28;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.touchpoint.api.model.ProgressInfo;
import com.bytedance.touchpoint.api.model.TimeInfo;
import com.bytedance.touchpoint.api.model.TimerPendant;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AwS134S0101000_28;
import kotlin.jvm.internal.AwS149S0201000_28;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0zVc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public class C1898700zVc extends ViewOnTouchListenerC1899510zWv {
    public static final /* synthetic */ int LLLLIL = 0;
    public int LLJJIJIL;
    public GradientDrawable LLJJJ;
    public ARunnableS97S0200000_28 LLJJJIL;
    public C0P0T LLJJJJ;
    public boolean LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public boolean LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public C1294720jnS LLJLIL;
    public C1294720jnS LLJLILLLLZIIL;
    public boolean LLJLL;
    public float LLJLLIL;
    public boolean LLJLLL;
    public boolean LLJZ;
    public TimerPendant LLJZIJLIL;
    public final C01GW LLL;
    public int LLLF;
    public final C01GW LLLFF;
    public final C01GW LLLFFI;
    public final C01GW LLLFZ;
    public final C01GW LLLI;
    public final C01GW LLLII;
    public final C01GW LLLIIII;
    public final C01GW LLLIIIIL;
    public final C01GW LLLIIIL;
    public final C01GW LLLIIL;
    public final C01GW LLLIILIL;
    public final C01GW LLLIL;
    public final C01GW LLLILZ;
    public InterfaceC1898910zVx LLLILZJ;
    public final C01GW LLLILZLLLI;
    public final C01GW LLLIZZ;
    public final C01GW LLLJ;
    public final C01GW LLLJIL;
    public int LLLJL;
    public View LLLL;
    public TextView LLLLII;
    public View LLLLIIIILLL;
    public C1898780zVk LLLLIIL;
    public int[] LLLLIILL;
    public boolean LLLLIILLL;

    public void LJJII(String str, String str2) {
    }

    private final TuxIconView getArrowView() {
        return (TuxIconView) this.LLLJ.getValue();
    }

    private final View getProgressLayout() {
        return (View) this.LLLIILIL.getValue();
    }

    private final C419210GcB getTopRewardsView() {
        return (C419210GcB) this.LLLIZZ.getValue();
    }

    @Override // X.ViewOnTouchListenerC1899510zWv
    public final void LIZIZ() {
        if (!this.LLLLIILLL || this.LLJJI) {
            return;
        }
        LJIIZILJ(C1899620zX6.LIZ());
    }

    @Override // X.ViewOnTouchListenerC1899510zWv
    public final void LIZJ() {
        this.LLLLIILLL = this.LLJJI;
    }

    @Override // X.ViewOnTouchListenerC1899510zWv
    public final void LJ() {
        if (!this.LLLLIILLL || this.LLJJI) {
            return;
        }
        LJIIZILJ(C1899620zX6.LIZ());
    }

    public final void LJJIJIL() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        TimerPendant timerPendant;
        if (!this.LLJZ && ((timerPendant = this.LLJZIJLIL) == null || !Intrinsics.LJFF(timerPendant.canBeClosed, Boolean.TRUE))) {
            C786410Ut5.LJZI(8, getTimerCloseView());
            return;
        }
        C786410Ut5.LJZI(0, getTimerCloseView());
        C786410Ut5.Q7(getTimerCloseView(), new ACListenerS162S0100000_28(this, 181));
        if (getCloseViewLocation() == 1) {
            ViewGroup.LayoutParams layoutParams = getTimerCloseView().getLayoutParams();
            if (!(layoutParams instanceof FrameLayout.LayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) == null) {
                return;
            }
            marginLayoutParams.setMarginEnd(marginLayoutParams.getMarginStart());
            marginLayoutParams.setMarginStart(0);
            C786410Ut5.c6(getTimerCloseView(), marginLayoutParams);
        }
    }

    public final TextView getBonusTextView() {
        return (TextView) this.LLLII.getValue();
    }

    public final C1302030jzF getBreathLottieView() {
        return (C1302030jzF) this.LLLFZ.getValue();
    }

    public final View getCenterAwardBg() {
        return (View) this.LLLIIIL.getValue();
    }

    public final View getCenterAwardLayout() {
        return (View) this.LLLIIIIL.getValue();
    }

    public final TuxTextView getCenterAwardText() {
        return (TuxTextView) this.LLLIIL.getValue();
    }

    public final TextView getCoinTextView() {
        return (TextView) this.LLLILZLLLI.getValue();
    }

    public final View getLongBubbleLayout() {
        return (View) this.LLLILZ.getValue();
    }

    public final C1302030jzF getLottieView() {
        return (C1302030jzF) this.LLLFFI.getValue();
    }

    public final View getPendantLayout() {
        return (View) this.LLLIIII.getValue();
    }

    public final C416200GTq getProgressBarTimerView() {
        return (C416200GTq) this.LLLFF.getValue();
    }

    public final C1302030jzF getRewardLottieView() {
        return (C1302030jzF) this.LLLI.getValue();
    }

    public final C19322810ig getShapeBubbleView() {
        return (C19322810ig) this.LLLJIL.getValue();
    }

    public final C1899050zWB getTimer() {
        return (C1899050zWB) this.LLL.getValue();
    }

    public final ImageView getTimerCloseView() {
        return (ImageView) this.LLLIL.getValue();
    }

    @Override // X.ViewOnTouchListenerC1899510zWv
    public final boolean LJFF() {
        return getCoinTextView().getVisibility() == 0;
    }

    @Override // X.ViewOnTouchListenerC1899510zWv
    public final boolean LJIIIZ() {
        return !LJII() && getCoinTextView().getMeasuredWidth() > C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
    }

    public final void LJIIJJI() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            ((FrameLayout.LayoutParams) layoutParams).topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
            setLayoutParams(layoutParams);
        }
        ViewGroup.LayoutParams layoutParams2 = getPendantLayout().getLayoutParams();
        if (layoutParams2 instanceof FrameLayout.LayoutParams) {
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) layoutParams2;
            layoutParams3.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(46));
            layoutParams3.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(46));
            layoutParams3.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
        }
        C786410Ut5.W5(getPendantLayout(), layoutParams2);
        ViewGroup.LayoutParams layoutParams4 = getProgressLayout().getLayoutParams();
        if (layoutParams4 instanceof FrameLayout.LayoutParams) {
            FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) layoutParams4;
            layoutParams5.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(38));
            layoutParams5.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(38));
        }
        C786410Ut5.W5(getProgressLayout(), layoutParams4);
        ViewGroup.LayoutParams layoutParams6 = getShapeBubbleView().getLayoutParams();
        if (layoutParams6 instanceof FrameLayout.LayoutParams) {
            FrameLayout.LayoutParams layoutParams7 = (FrameLayout.LayoutParams) layoutParams6;
            layoutParams7.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
            layoutParams7.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(38));
        }
        getShapeBubbleView().setShapeRadius(C418440Gaw.LIZIZ(19));
        getShapeBubbleView().setShapeBgColor(C0SVC.LIZIZ(C0SVC.LIZ, "#99000000"));
        C19322810ig shapeBubbleView = getShapeBubbleView();
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(shapeBubbleView);
        shapeBubbleView.setLayoutParams(layoutParams6);
        this.LLJJIJI = false;
    }

    public final void LJIIL() {
        if (LJII()) {
            return;
        }
        float transitionX = this.LLJLLIL + getShapeBubbleView().getTransitionX();
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setX(transitionX);
    }

    public final boolean LJIJJ() {
        View longBubbleLayout;
        if (getShapeBubbleView().getVisibility() == 0 || ((longBubbleLayout = getLongBubbleLayout()) != null && longBubbleLayout.getVisibility() == 0)) {
            return true;
        }
        C0P0T c0p0t = this.LLJJJJ;
        return c0p0t != null && c0p0t.isShowing();
    }

    public final void LJJIFFI() {
        if (LJII()) {
            C786410Ut5.lc(this, 1.0f);
            C19322810ig shapeBubbleView = getShapeBubbleView();
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(shapeBubbleView);
            shapeBubbleView.setScaleX(1.0f);
            C786410Ut5.gc(getLottieView(), 1.0f);
            return;
        }
        C786410Ut5.lc(this, 1.0f);
        float x = getX() - getShapeBubbleView().getTransitionX();
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setX(x);
        C786410Ut5.gc(getLottieView(), 1.0f);
        getShapeBubbleView().LIZJ(false);
        C419210GcB topRewardsView = getTopRewardsView();
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(topRewardsView);
        topRewardsView.setScaleX(1.0f);
        C416200GTq progressBarTimerView = getProgressBarTimerView();
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(progressBarTimerView);
        progressBarTimerView.setScaleX(1.0f);
    }

    public final void LJJIIZI() {
        HandlerHook.viewPost(getCoinTextView(), new ARunnableS128S0100000_28(this, 124));
    }

    public final void LJJIJ() {
        if (LJII()) {
            C786410Ut5.gc(getLottieView(), 1.0f);
            C786410Ut5.lc(this, 1.0f);
            getShapeBubbleView().LIZJ(false);
            C419210GcB topRewardsView = getTopRewardsView();
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(topRewardsView);
            topRewardsView.setScaleX(1.0f);
            C416200GTq progressBarTimerView = getProgressBarTimerView();
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(progressBarTimerView);
            progressBarTimerView.setScaleX(1.0f);
        } else {
            if (this.LLJLLIL == 0.0f) {
                this.LLJLLIL = getX();
            }
            float x = getX() + getShapeBubbleView().getTransitionX();
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
            setX(x);
            C786410Ut5.gc(getLottieView(), -1.0f);
            C786410Ut5.lc(this, -1.0f);
            getShapeBubbleView().LIZJ(true);
            C419210GcB topRewardsView2 = getTopRewardsView();
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(topRewardsView2);
            topRewardsView2.setScaleX(-1.0f);
            C416200GTq progressBarTimerView2 = getProgressBarTimerView();
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(progressBarTimerView2);
            progressBarTimerView2.setScaleX(-1.0f);
        }
        getShapeBubbleView().LIZLLL();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (getLottieView().isAnimating()) {
            getLottieView().cancelAnimation();
        }
    }

    public final float getBaseRightX() {
        return this.LLJLLIL;
    }

    public final boolean getBreathLottieLoadSuccess() {
        return this.LLJL;
    }

    public int getCloseViewLocation() {
        return this.LLLF;
    }

    public final boolean getHasBreathLottie() {
        return this.LLJJL;
    }

    public final int getPreviousConsumeTime() {
        return this.LLJJIJIL;
    }

    public final boolean getResourceLoadSuccess() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    public final InterfaceC1898910zVx getSubViewListener() {
        return this.LLLILZJ;
    }

    public final TimerPendant getTimerPendant() {
        return this.LLJZIJLIL;
    }

    @Override // X.ViewOnTouchListenerC1899510zWv
    public final void LIZLLL(MotionEvent motionEvent) {
        if (this.LLJJI && this.LLLLIILLL) {
            LJJIJIIJI(null, C1899620zX6.LIZ());
        }
    }

    public final void LJIIZILJ(boolean z) {
        boolean z2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("foldTimerPendant, coinTextView visible: ");
        if (getCoinTextView().getVisibility() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        sbLIZ.append(z2);
        C2188811AlT.LIZIZ(sbLIZ);
        setCanDrag(true);
        getShapeBubbleView().LIZ();
        C786410Ut5.LLIL(getCoinTextView(), 8);
        LJJIIZ(null, true, z);
        setShrink(true);
        C786410Ut5.LJLLLLLL(8, getLongBubbleLayout());
    }

    public final void LJIJ(boolean z) {
        if (getShapeBubbleView().getVisibility() == 8) {
            return;
        }
        this.LLJLL = false;
        if (z) {
            getShapeBubbleView().LJ(new AwS572S0100000_28(this, 1043));
            return;
        }
        C19322810ig shapeBubbleView = getShapeBubbleView();
        int visibility = shapeBubbleView.getVisibility();
        shapeBubbleView.setVisibility(8);
        C1602160rnK.LIZIZ(visibility, 8, shapeBubbleView);
        LJJIFFI();
    }

    public final void LJJIIJ(boolean z) {
        String string;
        String string2;
        TimerPendant timerPendant = this.LLJZIJLIL;
        if (timerPendant != null && Intrinsics.LJFF(timerPendant.bottomTexShow, Boolean.TRUE) && !this.LLJJI) {
            if (z) {
                if (getCoinTextView().getVisibility() == 8 || getCoinTextView().getAlpha() != 1.0f) {
                    C1895550zQX.LL.getClass();
                    CharSequence text = getCoinTextView().getText();
                    if (text == null || (string2 = text.toString()) == null || (string = a0.LJLIIIL(string2).toString()) == null) {
                        string = "";
                    }
                    if (string.length() != 0 && !Intrinsics.LJFF(string, CardStruct.IStatusCode.DEFAULT)) {
                        C786410Ut5.LLIL(getCoinTextView(), 0);
                    } else {
                        C786410Ut5.LLIL(getCoinTextView(), 8);
                    }
                    ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(getCoinTextView(), "alpha", 0.0f, 1.0f);
                    objectAnimatorOfFloat.setDuration(350L);
                    C786410Ut5.Pd(objectAnimatorOfFloat);
                }
            } else if (getCoinTextView().getVisibility() == 0) {
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(getCoinTextView(), "alpha", 1.0f, 0.0f);
                objectAnimatorOfFloat2.setDuration(350L);
                C786410Ut5.Pd(objectAnimatorOfFloat2);
                objectAnimatorOfFloat2.addListener(new ALAdapterS23S0100000_28(this, 10));
            }
            LJJIIZI();
        }
    }

    public final void LJJIIJZLJL(String str) {
        C419210GcB.LIZIZ(getTopRewardsView(), str);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    public final void setBaseRightX(float f) {
        this.LLJLLIL = f;
    }

    public final void setBreathLottieLoadSuccess(boolean z) {
        this.LLJL = z;
    }

    public final void setClaimable(boolean z) {
        this.LLJJJJJIL = z;
    }

    public final void setClientControlCloseable(boolean z) {
        this.LLJZ = z;
        LJJIJIL();
    }

    public void setCloseViewLocation(int i) {
        this.LLLF = i;
    }

    public final void setHasBreathLottie(boolean z) {
        this.LLJJL = z;
    }

    public final void setPreviousConsumeTime(int i) {
        this.LLJJIJIL = i;
    }

    public final void setProgressBackgroundColor(List<String> list) {
        try {
            this.LLJJJ = LJIILJJIL(Color.parseColor(list.get(0)), Color.parseColor(list.get(1)));
            getProgressLayout().setBackground(this.LLJJJ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public final void setProgressForegroundColor(List<String> list) {
        getProgressBarTimerView().setProgressForegroundColor(list);
    }

    public final void setResourceLoadSuccess(boolean z) {
        this.LLJJLIIIJLLLLLLLZ = z;
    }

    public final void setShapeBubbleMaxWidth(int i) {
        getShapeBubbleView().setMaxWidth(i);
    }

    public final void setShapeBubbleSecondRowText(String str) {
        if (str != null && str.length() != 0) {
            getShapeBubbleView().setSecondRowContent(str);
        }
    }

    public final void setSubViewListener(InterfaceC1898910zVx interfaceC1898910zVx) {
        this.LLLILZJ = interfaceC1898910zVx;
    }

    public final void setTimerPendant(TimerPendant timerPendant) {
        this.LLJZIJLIL = timerPendant;
    }

    public static void LJIL(C1302030jzF c1302030jzF, Function0 function0) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(c1302030jzF, "scaleX", 1.0f, 0.9f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(c1302030jzF, "scaleY", 1.0f, 0.9f);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(c1302030jzF, "scaleX", 0.9f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(c1302030jzF, "scaleY", 0.9f, 1.0f);
        objectAnimatorOfFloat.setDuration(100L);
        objectAnimatorOfFloat2.setDuration(100L);
        objectAnimatorOfFloat3.setDuration(100L);
        objectAnimatorOfFloat4.setDuration(100L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        animatorSet.setInterpolator(C1619980sG4.LJFF());
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(objectAnimatorOfFloat3, objectAnimatorOfFloat4);
        animatorSet2.setInterpolator(new AccelerateInterpolator(2.5f));
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.playSequentially(animatorSet, animatorSet2);
        animatorSet3.addListener(new AAListenerS338S0100000_28(function0, 7));
        animatorSet3.start();
    }

    public final GradientDrawable LJIILJJIL(int i, int i2) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setGradientType(2);
        gradientDrawable.setShape(0);
        int[] iArr = {i, i2};
        this.LLLLIILL = iArr;
        gradientDrawable.setColors(iArr);
        gradientDrawable.setCornerRadius(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28)));
        return gradientDrawable;
    }

    public void LJIJJLI(C1302030jzF c1302030jzF, Function0 function0) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(c1302030jzF, "scaleX", 1.0f, 1.1f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(c1302030jzF, "scaleY", 1.0f, 1.1f);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(c1302030jzF, "scaleX", 1.1f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(c1302030jzF, "scaleY", 1.1f, 1.0f);
        objectAnimatorOfFloat.setDuration(100L);
        objectAnimatorOfFloat2.setDuration(100L);
        objectAnimatorOfFloat3.setDuration(100L);
        objectAnimatorOfFloat4.setDuration(100L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        animatorSet.setInterpolator(C0GY9.LIZIZ(0.5f, 1.0f, 0.89f, 1.0f));
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(objectAnimatorOfFloat3, objectAnimatorOfFloat4);
        animatorSet2.setInterpolator(C1619980sG4.LJFF());
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.playSequentially(animatorSet, animatorSet2);
        animatorSet3.addListener(new AAListenerS338S0100000_28(function0, 6));
        animatorSet3.start();
    }

    public void LJJI(Integer num, AwS134S0101000_28 awS134S0101000_28) {
        C1302030jzF lottieView = getLottieView();
        lottieView.setRepeatCount(0);
        lottieView.setRepeatMode(1);
        lottieView.removeAllAnimatorListeners();
        lottieView.addAnimatorListener(new ALAdapterS22S0200000_28(awS134S0101000_28, this, 2));
        lottieView.playAnimation();
    }

    public final void LJJIJIIJI(Runnable runnable, boolean z) {
        TimerPendant timerPendant;
        int i;
        boolean z2 = true;
        setCanDrag(true);
        setShrink(false);
        if (runnable == null && (timerPendant = this.LLJZIJLIL) != null && Intrinsics.LJFF(timerPendant.bottomTexShow, Boolean.TRUE)) {
            String string = getCoinTextView().getText().toString();
            TextView coinTextView = getCoinTextView();
            if (!Intrinsics.LJFF(CardStruct.IStatusCode.DEFAULT, string) && string.length() != 0) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LLIL(coinTextView, i);
        }
        C786410Ut5.LJLLLLLL(0, getPendantLayout());
        LJJIIZ(new ARunnableS81S0200000_12(runnable, this, 153), false, z);
        C786410Ut5.LLLLLIL(getRewardLottieView(), 8);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("unFoldTimerPendant, coinTextView visible: ");
        if (getCoinTextView().getVisibility() != 0) {
            z2 = false;
        }
        sbLIZ.append(z2);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1898700zVc(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLJJLIIIJLLLLLLLZ = true;
        this.LLJL = true;
        this.LLJLLL = true;
        this.LLL = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(712));
        this.LLLF = 2;
        this.LLLFF = C452501pT.LIZIZ(new AwS572S0100000_28(this, 1047));
        this.LLLFFI = C452501pT.LIZIZ(new AwS572S0100000_28(this, 1045));
        this.LLLFZ = C452501pT.LIZIZ(new AwS572S0100000_28(this, 1038));
        this.LLLI = C452501pT.LIZIZ(new AwS572S0100000_28(this, 1049));
        this.LLLII = C452501pT.LIZIZ(new AwS572S0100000_28(this, 1037));
        this.LLLIIII = C452501pT.LIZIZ(new AwS572S0100000_28(this, 1046));
        this.LLLIIIIL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 1040));
        this.LLLIIIL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 1039));
        this.LLLIIL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 1041));
        this.LLLIILIL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 1048));
        this.LLLIL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 1051));
        this.LLLILZ = C452501pT.LIZIZ(new AwS572S0100000_28(this, 1044));
        this.LLLILZLLLI = C452501pT.LIZIZ(new AwS572S0100000_28(this, 1042));
        this.LLLIZZ = C452501pT.LIZIZ(new AwS572S0100000_28(this, 1052));
        this.LLLJ = C452501pT.LIZIZ(new AwS572S0100000_28(this, 1036));
        this.LLLJIL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 1050));
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.fwo, this, true);
        if (this.LLJJJ == null) {
            int iLIZ = C0SVC.LIZ(R.attr.jv, context);
            this.LLJJJ = LJIILJJIL(iLIZ, iLIZ);
            this.LLJJIJI = true;
        }
        if (C1899620zX6.LIZ()) {
            C786410Ut5.Fb(getArrowView(), 180.0f);
        }
    }

    public final void LJJIIZ(Runnable runnable, final boolean z, final boolean z2) {
        float f;
        C1294720jnS c1294720jnS;
        float f2 = 1.0f;
        if (z) {
            f = 1.0f;
            f2 = 0.0f;
        } else {
            f = 0.0f;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, f2);
        valueAnimatorOfFloat.setDuration(350L);
        valueAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.0T3b
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.LL.LJJIJIIJIL(((Float) valueAnimator.getAnimatedValue()).floatValue(), z, z2);
            }
        });
        if (((z && (c1294720jnS = this.LLJLILLLLZIIL) != null) || (c1294720jnS = this.LLJLIL) != null) && !Intrinsics.LJFF(c1294720jnS, getLottieView().getComposition())) {
            getLottieView().setComposition(c1294720jnS);
        }
        getLottieView().pauseAnimation();
        getLottieView().setProgress(0.0f);
        valueAnimatorOfFloat.addListener(new ALAdapterS9S0100000_12(runnable, 49));
        valueAnimatorOfFloat.start();
    }

    public final void LJJIJIIJIL(float f, boolean z, boolean z2) {
        int iLIZIZ;
        float f2;
        float fLIZIZ;
        float f3;
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(30));
        int iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf((18.0f * f) + 38.0f)));
        int iLIZIZ4 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf((22.0f * f) + 34.0f)));
        int iLIZIZ5 = iLIZIZ2 + ((C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(56.0f))) - iLIZIZ4) / 2);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getPendantLayout().getLayoutParams();
        layoutParams.width = iLIZIZ3;
        layoutParams.height = iLIZIZ4;
        int iLIZIZ6 = 0;
        if (z) {
            iLIZIZ = 0;
        } else {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
        }
        layoutParams.setMarginStart(iLIZIZ);
        layoutParams.topMargin = iLIZIZ5;
        C786410Ut5.W5(getPendantLayout(), layoutParams);
        float fLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(r5))) / 2.0f;
        float f4 = fLIZIZ2 * f;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setGradientType(2);
        gradientDrawable.setShape(0);
        gradientDrawable.setColors(this.LLLLIILL);
        float[] fArr = new float[8];
        if (z2) {
            fArr[0] = fLIZIZ2;
            fArr[1] = fLIZIZ2;
            fArr[2] = f4;
            fArr[3] = f4;
            fArr[4] = f4;
            fArr[5] = f4;
            fArr[6] = fLIZIZ2;
            fArr[7] = fLIZIZ2;
        } else {
            fArr[0] = f4;
            fArr[1] = f4;
            fArr[2] = fLIZIZ2;
            fArr[3] = fLIZIZ2;
            fArr[4] = fLIZIZ2;
            fArr[5] = fLIZIZ2;
            fArr[6] = f4;
            fArr[7] = f4;
        }
        gradientDrawable.setCornerRadii(fArr);
        if (z) {
            getPendantLayout().setBackground(gradientDrawable);
            getProgressLayout().setBackground(null);
        } else {
            getProgressLayout().setBackground(gradientDrawable);
            getPendantLayout().setBackground(null);
        }
        float f5 = (14.0f * f) + 34.0f;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) getProgressLayout().getLayoutParams();
        layoutParams2.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(f5)));
        layoutParams2.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(f5)));
        if (z) {
            f2 = 0.60714287f;
        } else {
            f2 = 1.0f;
        }
        C786410Ut5.Ob(getCenterAwardLayout(), f2);
        C786410Ut5.pc(getCenterAwardLayout(), f2);
        View centerAwardLayout = getCenterAwardLayout();
        if (z) {
            fLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
        } else {
            fLIZIZ = 0.0f;
        }
        C786410Ut5.Jc(centerAwardLayout, fLIZIZ);
        if (z) {
            layoutParams2.gravity = 8388613;
        } else {
            layoutParams2.gravity = 17;
        }
        C1302030jzF lottieView = getLottieView();
        if (lottieView.getVisibility() == 0) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) lottieView.getLayoutParams();
            if (z) {
                iLIZIZ6 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
            }
            marginLayoutParams.setMarginStart(iLIZIZ6);
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(lottieView);
            lottieView.setLayoutParams(marginLayoutParams);
        }
        C786410Ut5.W5(getProgressLayout(), layoutParams2);
        if (z) {
            f3 = -10.0f;
        } else {
            f3 = -14.0f;
        }
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) getPendantLayout().getLayoutParams();
        int iLIZIZ7 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(f3)));
        float f6 = layoutParams3.leftMargin + layoutParams3.width + iLIZIZ7;
        int height = (layoutParams3.topMargin - iLIZIZ7) - getTimerCloseView().getHeight();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) getTimerCloseView().getLayoutParams();
        C426750GoL.LJIIJ(marginLayoutParams2, getContext(), Integer.valueOf((int) f6), Integer.valueOf(height), null, null, 56);
        C786410Ut5.c6(getTimerCloseView(), marginLayoutParams2);
    }

    public void LJIILL(ProgressInfo progressInfo, TimeInfo timeInfo, int i, boolean z) {
        Integer num;
        int i2;
        int iIntValue = 0;
        this.LLJJIJIL = 0;
        C786410Ut5.LLLLLILLIL(getProgressBarTimerView(), 4);
        this.LLJJJJLIIL = true;
        if (i == 0) {
            if (timeInfo != null && Intrinsics.LJFF(timeInfo.enableLoopAnimation, Boolean.TRUE)) {
                i2 = Integer.MAX_VALUE;
            } else {
                i2 = 0;
            }
            C786410Ut5.LLLLLIL(getLottieView(), 0);
            getBreathLottieView().pauseAnimation();
            C786410Ut5.LLLLLIL(getBreathLottieView(), 8);
            LJIJJLI(getLottieView(), new AwS149S0201000_28(this, progressInfo, i2, 17));
        }
        if (progressInfo != null && (num = progressInfo.awardAmount) != null) {
            iIntValue = num.intValue();
        }
        LJJIII(true, false, iIntValue, i, false);
    }

    public final void LJJIII(boolean z, boolean z2, int i, int i2, boolean z3) {
        List arrayList;
        String str;
        String str2;
        int i3;
        boolean z4;
        String str3;
        List arrayList2;
        this.LLJJJJJIL = z3;
        String str4 = "#FFAF37";
        if (z3) {
            TextView coinTextView = getCoinTextView();
            TimerPendant timerPendant = this.LLJZIJLIL;
            if (timerPendant != null) {
                str3 = timerPendant.rewardText;
            } else {
                str3 = null;
            }
            coinTextView.setText(str3);
            TimerPendant timerPendant2 = this.LLJZIJLIL;
            if (timerPendant2 == null || (arrayList2 = timerPendant2.awardTextBGColor) == null) {
                arrayList2 = new ArrayList();
            }
            if (arrayList2.isEmpty() || arrayList2.size() < 2) {
                arrayList2.add("#FFAF37");
                arrayList2.add("#FFAF37");
            }
            TextView coinTextView2 = getCoinTextView();
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(C12ES.LIZJ(8.0f, getContext()));
            ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                arrayList3.add(Integer.valueOf(C0SVC.LIZIZ(C0SVC.LIZ, (String) it2.next())));
            }
            gradientDrawable.setColors(C13LP.LLII(arrayList3));
            coinTextView2.setBackground(gradientDrawable);
        } else {
            TimerPendant timerPendant3 = this.LLJZIJLIL;
            if (timerPendant3 == null || (arrayList = timerPendant3.textBGColors) == null) {
                arrayList = new ArrayList();
            }
            if (arrayList.isEmpty() || arrayList.size() < 2) {
                TimerPendant timerPendant4 = this.LLJZIJLIL;
                if (timerPendant4 == null || (str = timerPendant4.textBGColor) == null) {
                    str = "#FFAF37";
                }
                arrayList.add(str);
                TimerPendant timerPendant5 = this.LLJZIJLIL;
                if (timerPendant5 != null && (str2 = timerPendant5.textBGColor) != null) {
                    str4 = str2;
                }
                arrayList.add(str4);
            }
            getCoinTextView().setShadowLayer(1.0f, 3.0f, 3.0f, C0SVC.LIZIZ(C0SVC.LIZ, "#FF7C02"));
            TextView coinTextView3 = getCoinTextView();
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setShape(0);
            gradientDrawable2.setCornerRadius(C12ES.LIZJ(8.0f, getContext()));
            ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                arrayList4.add(Integer.valueOf(C0SVC.LIZIZ(C0SVC.LIZ, (String) it3.next())));
            }
            gradientDrawable2.setColors(C13LP.LLII(arrayList4));
            coinTextView3.setBackground(gradientDrawable2);
        }
        TimerPendant timerPendant6 = this.LLJZIJLIL;
        if (timerPendant6 != null && Intrinsics.LJFF(timerPendant6.bottomTexShow, Boolean.TRUE)) {
            TextView coinTextView4 = getCoinTextView();
            if (z && i > 0 && (i2 == 0 || i2 == 2)) {
                i3 = 0;
            } else {
                i3 = 8;
            }
            C786410Ut5.LLIL(coinTextView4, i3);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("showCoinWithAnimation, isShrink: ");
            sbLIZ.append(this.LLJJI);
            sbLIZ.append(", coinTextView.isVisible: ");
            if (getCoinTextView().getVisibility() == 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            sbLIZ.append(z4);
            C2188811AlT.LIZIZ(sbLIZ);
            C01GW<C1894700zPA> c01gw = C1894700zPA.LJIJ;
            C2178808gE.LIZ();
            if (z && !z3) {
                if (i2 != 0) {
                    if (i2 == 1) {
                        getCoinTextView().setText(String.valueOf(i));
                    }
                } else {
                    ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(this.LLLJL, i);
                    valueAnimatorOfInt.setDuration(1000L);
                    valueAnimatorOfInt.addUpdateListener(new AUListenerS276S0100000_28(this, 5));
                    this.LLLJL = i;
                    valueAnimatorOfInt.setStartDelay(600L);
                    valueAnimatorOfInt.start();
                    ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(getCoinTextView(), "scaleX", 1.0f, 1.15f, 1.0f);
                    objectAnimatorOfFloat.setDuration(600L);
                    ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(getCoinTextView(), "scaleY", 1.0f, 1.15f, 1.0f);
                    objectAnimatorOfFloat2.setDuration(600L);
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat2).after(600L);
                    animatorSet.start();
                }
            }
            LJJIIZI();
            if (getShapeBubbleView().getVisibility() == 0) {
                C786410Ut5.LLIL(getCoinTextView(), 8);
            }
        }
    }

    public void LJIILLIIL(boolean z, boolean z2, Integer num, int i, boolean z3, boolean z4) {
        int iIntValue;
        this.LLJJIJIL = 0;
        C786410Ut5.LLLLLILLIL(getProgressBarTimerView(), 4);
        this.LLJJJJLIIL = false;
        if (z) {
            C786410Ut5.LLLLLIL(getLottieView(), 0);
            C786410Ut5.LLLLLIL(getBreathLottieView(), 8);
            LJJI(num, null);
        }
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = this.LLLJL;
        }
        LJJIII(z2, z3, iIntValue, i, z4);
    }

    public final void LJIJI(C0VSP c0vsp, final C1898310zUz c1898310zUz, C0VSP c0vsp2, C0VSP c0vsp3, String str, String str2, String str3, String str4, C0VSP c0vsp4) {
        try {
            final C1302030jzF lottieView = getLottieView();
            C1292030jj7<C1294720jnS> c1292030jj7LJ = C1294250jmh.LJ(c0vsp, str);
            c1292030jj7LJ.LIZIZ(new InterfaceC1292040jj8() { // from class: X.0zVd
                @Override // X.InterfaceC1292040jj8
                public final void onResult(Object obj) {
                    C1294720jnS c1294720jnS = (C1294720jnS) obj;
                    this.LL.LLJLIL = c1294720jnS;
                    lottieView.setComposition(c1294720jnS);
                    InterfaceC1898930zVz interfaceC1898930zVz = c1898310zUz;
                    if (interfaceC1898930zVz != null) {
                        interfaceC1898930zVz.LIZ();
                    }
                }
            });
            c1292030jj7LJ.LIZ(new InterfaceC1292040jj8() { // from class: X.0T3i
                @Override // X.InterfaceC1292040jj8
                public final /* bridge */ /* synthetic */ void onResult(Object obj) {
                }
            });
            if (c0vsp3 != null) {
                C1292030jj7<C1294720jnS> c1292030jj7LJ2 = C1294250jmh.LJ(c0vsp3, str3);
                c1292030jj7LJ2.LIZIZ(new C19335910kn(this, c1898310zUz, 2));
                c1292030jj7LJ2.LIZ(new InterfaceC1292040jj8() { // from class: X.0T3j
                    @Override // X.InterfaceC1292040jj8
                    public final /* bridge */ /* synthetic */ void onResult(Object obj) {
                    }
                });
            }
            if (c0vsp2 != null) {
                C1302030jzF rewardLottieView = getRewardLottieView();
                C1292030jj7<C1294720jnS> c1292030jj7LJ3 = C1294250jmh.LJ(c0vsp2, str2);
                c1292030jj7LJ3.LIZIZ(new C19335910kn(rewardLottieView, c1898310zUz, 3));
                c1292030jj7LJ3.LIZ(new InterfaceC1292040jj8() { // from class: X.0T3k
                    @Override // X.InterfaceC1292040jj8
                    public final /* bridge */ /* synthetic */ void onResult(Object obj) {
                    }
                });
            }
            if (c0vsp4 != null) {
                C1302030jzF breathLottieView = getBreathLottieView();
                C1292030jj7<C1294720jnS> c1292030jj7LJ4 = C1294250jmh.LJ(c0vsp4, str4);
                c1292030jj7LJ4.LIZIZ(new C19335910kn(breathLottieView, c1898310zUz, 4));
                c1292030jj7LJ4.LIZ(new InterfaceC1292040jj8() { // from class: X.0T3l
                    @Override // X.InterfaceC1292040jj8
                    public final /* bridge */ /* synthetic */ void onResult(Object obj) {
                    }
                });
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
