package X;

import Y.ACListenerS161S0100000_27;
import Y.ALAdapterS21S0200000_27;
import Y.ATListenerS346S0200000_27;
import Y.AUListenerS275S0100000_27;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.tako.experiment.TakoEnterMethodListExperiment;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.AwS571S0100000_27;

/* JADX INFO: renamed from: X.0yOP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1855790yOP extends FrameLayout {
    public Function0<Boolean> LL;
    public final C01GW LLILLJJLI;
    public final C01GW LLILLL;
    public final C01GW LLILZ;
    public final C01GW LLILZIL;
    public final C01GW LLILZLL;
    public final C01GW LLIZ;
    public final C01GW LLIZLLLIL;
    public final C01GW LLJ;
    public C1855820yOS LLJI;
    public final C01GW LLJIJIL;
    public final C01GW LLJILJIL;
    public final C384050F3z LLJILJILJ;
    public final C01GW LLJILLL;
    public EnumC1855660yOC LLJJ;
    public EnumC1855810yOR LLJJI;
    public boolean LLJJIII;

    public final void setClick(boolean z) {
    }

    private final C1855370yNj getContentView() {
        return (C1855370yNj) this.LLJILLL.getValue();
    }

    private final ValueAnimator getTalkViewColorAnimator() {
        return (ValueAnimator) this.LLJIJIL.getValue();
    }

    private final C1303280k1G getTalkingStateHighVolumeView() {
        return (C1303280k1G) this.LLJ.getValue();
    }

    private final C1303280k1G getTalkingStateLowVolumeView() {
        return (C1303280k1G) this.LLIZLLLIL.getValue();
    }

    private final C1303280k1G getTalkingStateStartView() {
        return (C1303280k1G) this.LLIZ.getValue();
    }

    private final ValueAnimator getTalkingViewAlphaAnimator() {
        return (ValueAnimator) this.LLJILJIL.getValue();
    }

    private final TuxIconView getVoiceInputCancelIcon() {
        return (TuxIconView) this.LLILZ.getValue();
    }

    private final View getVoiceInputContainer() {
        return (View) this.LLILLL.getValue();
    }

    private final TuxIconView getVoiceInputSendIcon() {
        return (TuxIconView) this.LLILZIL.getValue();
    }

    public final void LIZ() {
        setState(EnumC1855660yOC.INITIATE);
        setTalkState(EnumC1855810yOR.STOP);
        LIZIZ(false, false);
        Function2<? super Boolean, ? super Boolean, Unit> function2 = this.LLJI.LIZLLL;
        if (function2 != null) {
            Boolean bool = Boolean.FALSE;
            function2.invoke(bool, bool);
        }
    }

    public final void LJFF() {
        setState(EnumC1855660yOC.INITIATE);
        setTalkState(EnumC1855810yOR.STOP);
        LIZIZ(false, false);
        Function0<Unit> function0 = this.LLJI.LJ;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final View getTalkingStateView() {
        return (View) this.LLILZLL.getValue();
    }

    public final TuxIconView getVoiceInputMicIcon() {
        return (TuxIconView) this.LLILLJJLI.getValue();
    }

    public final void LIZJ() {
        getTalkingStateStartView().setAnimation("im_htt_start_talk.json");
        getTalkingStateLowVolumeView().setAnimation("im_htt_talking_low_volume.json");
        getTalkingStateLowVolumeView().setRepeatCount(-1);
        getTalkingStateHighVolumeView().setAnimation("im_htt_talking_high_volume.json");
        getTalkingStateHighVolumeView().setRepeatCount(-1);
    }

    public final void LJ() {
        if (getTalkingStateStartView().isAnimating()) {
            getTalkingStateStartView().cancelAnimation();
            C786410Ut5.i(getTalkingStateStartView(), 8);
        }
        if (getTalkingStateLowVolumeView().isAnimating()) {
            getTalkingStateLowVolumeView().cancelAnimation();
        }
        if (getTalkingStateHighVolumeView().isAnimating()) {
            getTalkingStateHighVolumeView().cancelAnimation();
        }
        C786410Ut5.i(getTalkingStateStartView(), 8);
        C786410Ut5.i(getTalkingStateLowVolumeView(), 8);
        C786410Ut5.i(getTalkingStateHighVolumeView(), 8);
    }

    public final float getIconPressedAlpha() {
        return C960203pA.LIZIZ(getContext()) ? 0.4f : 0.2f;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        LJ();
    }

    public final Function0<Boolean> getCheckAskStatus() {
        return this.LL;
    }

    public final EnumC1855660yOC getState() {
        return this.LLJJ;
    }

    public final EnumC1855810yOR getTalkState() {
        return this.LLJJI;
    }

    public final C1855820yOS getVoiceInputStateListener() {
        return this.LLJI;
    }

    public final void LJI(boolean z) {
        boolean z2;
        Function0<Unit> function0 = this.LLJI.LIZ;
        if (function0 != null) {
            function0.invoke();
        }
        Function0<Boolean> function02 = this.LL;
        if (function02 != null && function02.invoke().booleanValue()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            Function1<? super EnumC1855390yNl, Unit> function1 = this.LLJI.LIZJ;
            if (function1 != null) {
                function1.invoke(null);
                return;
            }
            return;
        }
        C449180HjQ c449180HjQ = C449180HjQ.LIZ;
        Activity activityLIZ = C1388190mED.LIZ(getContext());
        c449180HjQ.getClass();
        if (!C449180HjQ.LIZJ(activityLIZ)) {
            Activity activityLIZ2 = C1388190mED.LIZ(getContext());
            c449180HjQ.getClass();
            C449180HjQ.LJ(activityLIZ2, null);
            Function1<? super EnumC1855390yNl, Unit> function12 = this.LLJI.LIZJ;
            if (function12 != null) {
                function12.invoke(null);
                return;
            }
            return;
        }
        getContext();
        try {
            if (C036E.LIZ.LIZIZ()) {
                if (!z) {
                    setState(EnumC1855660yOC.TALKING_LONG_PRESS);
                    LIZIZ(true, false);
                    LJII(EnumC1855360yNi.LONG_PRESS_TIP);
                } else {
                    setState(EnumC1855660yOC.TALKING_CLICK);
                    LIZIZ(false, true);
                }
                setTalkState(EnumC1855810yOR.START);
                Function0<Unit> function03 = this.LLJI.LIZIZ;
                if (function03 != null) {
                    function03.invoke();
                    return;
                }
                return;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        Function1<? super EnumC1855390yNl, Unit> function13 = this.LLJI.LIZJ;
        if (function13 != null) {
            function13.invoke(EnumC1855390yNl.COMMON_ERROR);
        }
    }

    public final void LJII(EnumC1855360yNi enumC1855360yNi) {
        getContentView().setTipState(enumC1855360yNi);
    }

    public final void setCheckAskStatus(Function0<Boolean> function0) {
        this.LL = function0;
    }

    public final void setState(EnumC1855660yOC enumC1855660yOC) {
        if (this.LLJJ == enumC1855660yOC) {
            return;
        }
        int i = C1855800yOQ.LIZ[enumC1855660yOC.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        C786410Ut5.LLLLLLZZ(getVoiceInputMicIcon(), 8);
                        C786410Ut5.LLLLLLZZ(getVoiceInputSendIcon(), 8);
                        C786410Ut5.LJLLLLLL(0, getVoiceInputContainer());
                        C786410Ut5.LLLLLLZZ(getVoiceInputCancelIcon(), 0);
                        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zs, getContext());
                        if (numLIZJ != null) {
                            int iIntValue = numLIZJ.intValue();
                            getVoiceInputCancelIcon().setTintColor(iIntValue);
                            View talkingStateView = getTalkingStateView();
                            C384050F3z c384050F3z = this.LLJILJILJ;
                            c384050F3z.LIZ = Integer.valueOf(iIntValue);
                            talkingStateView.setBackground(c384050F3z.LIZ(getContext()));
                        }
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    C786410Ut5.LLLLLLZZ(getVoiceInputMicIcon(), 8);
                    C786410Ut5.LLLLLLZZ(getVoiceInputSendIcon(), 8);
                    View voiceInputContainer = getVoiceInputContainer();
                    C786410Ut5.LJLLLLLL(0, voiceInputContainer);
                    int paddingStart = voiceInputContainer.getPaddingStart();
                    int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                    C426750GoL.LJIIL(voiceInputContainer, Integer.valueOf(paddingStart), Integer.valueOf(voiceInputContainer.getPaddingTop()), Integer.valueOf(iLIZIZ), Integer.valueOf(voiceInputContainer.getPaddingBottom()), 16);
                    TuxIconView voiceInputCancelIcon = getVoiceInputCancelIcon();
                    C786410Ut5.LLLLLLZZ(voiceInputCancelIcon, 0);
                    ViewGroup.LayoutParams layoutParams = getVoiceInputCancelIcon().getLayoutParams();
                    layoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(100));
                    C786410Ut5.M6(getVoiceInputCancelIcon(), layoutParams);
                    int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                    int iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(60));
                    C426750GoL.LJIIL(voiceInputCancelIcon, Integer.valueOf(iLIZIZ2), Integer.valueOf(voiceInputCancelIcon.getPaddingTop()), Integer.valueOf(iLIZIZ3), Integer.valueOf(voiceInputCancelIcon.getPaddingBottom()), 16);
                    Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.d5, getContext());
                    if (numLIZJ2 != null) {
                        int iIntValue2 = numLIZJ2.intValue();
                        getVoiceInputCancelIcon().setTintColor(iIntValue2);
                        View talkingStateView2 = getTalkingStateView();
                        C384050F3z c384050F3z2 = this.LLJILJILJ;
                        c384050F3z2.LIZ = Integer.valueOf(iIntValue2);
                        talkingStateView2.setBackground(c384050F3z2.LIZ(getContext()));
                    }
                }
            } else {
                getTalkViewColorAnimator().cancel();
                getTalkViewColorAnimator().removeAllListeners();
                C786410Ut5.LLLLLLZZ(getVoiceInputMicIcon(), 8);
                TuxIconView voiceInputSendIcon = getVoiceInputSendIcon();
                C786410Ut5.LLLLLLZZ(voiceInputSendIcon, 0);
                voiceInputSendIcon.setOnTouchListener(new ATListenerS346S0200000_27(voiceInputSendIcon, this, 1));
                View voiceInputContainer2 = getVoiceInputContainer();
                C786410Ut5.LJLLLLLL(0, voiceInputContainer2);
                int paddingStart2 = voiceInputContainer2.getPaddingStart();
                int iLIZIZ4 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
                C426750GoL.LJIIL(voiceInputContainer2, Integer.valueOf(paddingStart2), Integer.valueOf(voiceInputContainer2.getPaddingTop()), Integer.valueOf(iLIZIZ4), Integer.valueOf(voiceInputContainer2.getPaddingBottom()), 16);
                TuxIconView voiceInputCancelIcon2 = getVoiceInputCancelIcon();
                C786410Ut5.LLLLLLZZ(voiceInputCancelIcon2, 0);
                ViewGroup.LayoutParams layoutParams2 = voiceInputCancelIcon2.getLayoutParams();
                layoutParams2.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56));
                C786410Ut5.M6(voiceInputCancelIcon2, layoutParams2);
                int iLIZIZ5 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                int iLIZIZ6 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                C426750GoL.LJIIL(voiceInputCancelIcon2, Integer.valueOf(iLIZIZ5), Integer.valueOf(voiceInputCancelIcon2.getPaddingTop()), Integer.valueOf(iLIZIZ6), Integer.valueOf(voiceInputCancelIcon2.getPaddingBottom()), 16);
                voiceInputCancelIcon2.setOnTouchListener(new ATListenerS346S0200000_27(voiceInputCancelIcon2, this, 2));
                Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.d5, getContext());
                if (numLIZJ3 != null) {
                    int iIntValue3 = numLIZJ3.intValue();
                    getVoiceInputCancelIcon().setTintColor(iIntValue3);
                    getVoiceInputSendIcon().setTintColor(iIntValue3);
                    View talkingStateView3 = getTalkingStateView();
                    C384050F3z c384050F3z3 = this.LLJILJILJ;
                    c384050F3z3.LIZ = Integer.valueOf(iIntValue3);
                    talkingStateView3.setBackground(c384050F3z3.LIZ(getContext()));
                }
            }
        } else {
            getTalkViewColorAnimator().cancel();
            getTalkViewColorAnimator().removeAllListeners();
            TuxIconView voiceInputMicIcon = getVoiceInputMicIcon();
            C786410Ut5.LLLLLLZZ(voiceInputMicIcon, 0);
            Integer numLIZJ4 = C1308910kAL.LIZJ(R.attr.d5, voiceInputMicIcon.getContext());
            if (numLIZJ4 != null) {
                voiceInputMicIcon.setTintColor(numLIZJ4.intValue());
            }
            C786410Ut5.LLLLLLZZ(getVoiceInputCancelIcon(), 8);
            View voiceInputContainer3 = getVoiceInputContainer();
            int paddingStart3 = voiceInputContainer3.getPaddingStart();
            int iLIZIZ7 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
            C426750GoL.LJIIL(voiceInputContainer3, Integer.valueOf(paddingStart3), Integer.valueOf(voiceInputContainer3.getPaddingTop()), Integer.valueOf(iLIZIZ7), Integer.valueOf(voiceInputContainer3.getPaddingBottom()), 16);
            C786410Ut5.LJLLLLLL(8, voiceInputContainer3);
        }
        this.LLJJ = enumC1855660yOC;
    }

    public final void setTalkState(EnumC1855810yOR enumC1855810yOR) {
        if (this.LLJJI == enumC1855810yOR) {
            return;
        }
        this.LLJJI = enumC1855810yOR;
        int i = C1855800yOQ.LIZIZ[enumC1855810yOR.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        LJ();
                        ValueAnimator talkingViewAlphaAnimator = getTalkingViewAlphaAnimator();
                        if (talkingViewAlphaAnimator.isRunning()) {
                            talkingViewAlphaAnimator.cancel();
                        }
                        talkingViewAlphaAnimator.setFloatValues(1.0f, 0.0f);
                        talkingViewAlphaAnimator.addUpdateListener(new AUListenerS275S0100000_27(this, 19));
                        talkingViewAlphaAnimator.setDuration(50L);
                        talkingViewAlphaAnimator.start();
                        return;
                    }
                    throw new C1954807lC();
                }
                LJ();
                C786410Ut5.i(getTalkingStateHighVolumeView(), 0);
                getTalkingStateHighVolumeView().playAnimation();
                return;
            }
            LJ();
            C786410Ut5.i(getTalkingStateLowVolumeView(), 0);
            getTalkingStateLowVolumeView().playAnimation();
            return;
        }
        if (C0BO3.LIZ() && TakoEnterMethodListExperiment.LIZ(false) && !this.LLJJIII) {
            this.LLJJIII = true;
            LIZJ();
        }
        LJ();
        ValueAnimator talkingViewAlphaAnimator2 = getTalkingViewAlphaAnimator();
        if (talkingViewAlphaAnimator2.isRunning()) {
            talkingViewAlphaAnimator2.cancel();
        }
        talkingViewAlphaAnimator2.setFloatValues(0.0f, 1.0f);
        talkingViewAlphaAnimator2.setDuration(100L);
        talkingViewAlphaAnimator2.start();
        C786410Ut5.i(getTalkingStateStartView(), 0);
        getTalkingStateStartView().playAnimation();
        C1303280k1G talkingStateStartView = getTalkingStateStartView();
        talkingStateStartView.addAnimatorListener(new ALAdapterS21S0200000_27(talkingStateStartView, new AwS571S0100000_27(this, 693), 3));
    }

    public final void setVoiceInputStateListener(Function1<? super C1855820yOS, Unit> function1) {
        function1.invoke(this.LLJI);
    }

    public final void setVoiceInputStateListener(C1855820yOS c1855820yOS) {
        this.LLJI = c1855820yOS;
    }

    public C1855790yOP(final Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLILLJJLI = C452501pT.LIZIZ(new AwS571S0100000_27(this, 1064));
        this.LLILLL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 1062));
        this.LLILZ = C452501pT.LIZIZ(new AwS571S0100000_27(this, 1061));
        this.LLILZIL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 1066));
        this.LLILZLL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 1055));
        this.LLIZ = C452501pT.LIZIZ(new AwS571S0100000_27(this, 1053));
        this.LLIZLLLIL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 1051));
        this.LLJ = C452501pT.LIZIZ(new AwS571S0100000_27(this, 1049));
        this.LLJI = new C1855820yOS();
        this.LLJIJIL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(413));
        this.LLJILJIL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 1059));
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZ = C1308910kAL.LIZJ(R.attr.d5, context);
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(29));
        this.LLJILJILJ = c384050F3z;
        this.LLJILLL = C452501pT.LIZIZ(new AwS571S0100000_27(context, 1043));
        this.LLJJ = EnumC1855660yOC.INITIATE;
        this.LLJJI = EnumC1855810yOR.STOP;
        C786410Ut5.Sd(R.layout.fqb, C786410Ut5.ne(context), this);
        getTalkingStateView().setBackground(c384050F3z.LIZ(context));
        if (!C0BO3.LIZ() || !TakoEnterMethodListExperiment.LIZ(false)) {
            LIZJ();
        }
        C786410Ut5.a9(getVoiceInputCancelIcon(), new ACListenerS161S0100000_27(this, 107));
        C786410Ut5.a9(getVoiceInputSendIcon(), new ACListenerS161S0100000_27(this, 108));
        final C238400w2 c238400w2 = new C238400w2();
        getVoiceInputMicIcon().setOnTouchListener(new View.OnTouchListener() { // from class: X.0yOO
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                int action = motionEvent.getAction();
                if (action != 0) {
                    if (action != 1) {
                        if (action != 2) {
                            if (action == 3) {
                                if (c238400w2.element == 0) {
                                    if (this.LIZLLL(motionEvent.getX(), motionEvent.getY())) {
                                        this.LIZ();
                                    } else {
                                        this.LJFF();
                                    }
                                } else if (!C0OBG.LIZIZ(view)) {
                                    this.LJI(true);
                                }
                                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.d5, context);
                                if (numLIZJ != null) {
                                    C1855790yOP c1855790yOP = this;
                                    c1855790yOP.getVoiceInputMicIcon().setTintColor(numLIZJ.intValue());
                                }
                            }
                        } else {
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            long j = c238400w2.element;
                            if (jCurrentTimeMillis - j > 250) {
                                if (j > 0) {
                                    this.LJI(false);
                                    c238400w2.element = 0L;
                                    return true;
                                }
                                if (this.getState() == EnumC1855660yOC.TALKING_LONG_PRESS || this.getState() == EnumC1855660yOC.CANCELLING_LONG_PRESS) {
                                    C1855790yOP c1855790yOP2 = this;
                                    if (c1855790yOP2.LIZLLL(motionEvent.getX(), motionEvent.getY())) {
                                        c1855790yOP2.setState(EnumC1855660yOC.CANCELLING_LONG_PRESS);
                                        c1855790yOP2.LJII(EnumC1855360yNi.CANCEL_TIP);
                                        return true;
                                    }
                                    c1855790yOP2.setState(EnumC1855660yOC.TALKING_LONG_PRESS);
                                    c1855790yOP2.LJII(EnumC1855360yNi.LONG_PRESS_TIP);
                                    return true;
                                }
                            }
                        }
                    } else {
                        if (c238400w2.element == 0) {
                            if (this.LIZLLL(motionEvent.getX(), motionEvent.getY())) {
                                this.LIZ();
                            } else {
                                this.LJFF();
                            }
                        } else if (!C0OBG.LIZIZ(view)) {
                            this.LJI(true);
                        }
                        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.d5, context);
                        if (numLIZJ2 != null) {
                            C1855790yOP c1855790yOP3 = this;
                            c1855790yOP3.getVoiceInputMicIcon().setTintColor(numLIZJ2.intValue());
                            return true;
                        }
                    }
                } else {
                    c238400w2.element = System.currentTimeMillis();
                    Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.d5, context);
                    if (numLIZJ3 != null) {
                        C1855790yOP c1855790yOP4 = this;
                        c1855790yOP4.getVoiceInputMicIcon().setTintColor(C1857690yRT.LJIIIZ(c1855790yOP4.getIconPressedAlpha(), numLIZJ3.intValue()));
                        return true;
                    }
                }
                return true;
            }
        });
    }

    public final void LIZIZ(boolean z, boolean z2) {
        int marginStart;
        int i;
        int marginEnd;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        if (z) {
            int[] iArr = new int[2];
            getVoiceInputContainer().getLocationOnScreen(iArr);
            getContentView().LIZJ(null, iArr);
            C1855370yNj contentView = getContentView();
            FrameLayout rootLayout = contentView.getRootLayout();
            if (rootLayout != null) {
                ViewGroup.LayoutParams layoutParams = rootLayout.getLayoutParams();
                layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(96));
                C786410Ut5.a6(rootLayout, layoutParams);
                ViewGroup.LayoutParams layoutParams2 = contentView.getLayoutParams();
                if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                    marginStart = ((ViewGroup.MarginLayoutParams) layoutParams2).getMarginStart();
                } else {
                    marginStart = 0;
                }
                Integer numValueOf = Integer.valueOf(marginStart);
                ViewGroup.LayoutParams layoutParams3 = contentView.getLayoutParams();
                if ((layoutParams3 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams3) != null) {
                    i = marginLayoutParams.topMargin;
                } else {
                    i = 0;
                }
                Integer numValueOf2 = Integer.valueOf(i);
                ViewGroup.LayoutParams layoutParams4 = contentView.getLayoutParams();
                if (layoutParams4 instanceof ViewGroup.MarginLayoutParams) {
                    marginEnd = ((ViewGroup.MarginLayoutParams) layoutParams4).getMarginEnd();
                } else {
                    marginEnd = 0;
                }
                C426750GoL.LJIIIZ(rootLayout, numValueOf, numValueOf2, Integer.valueOf(marginEnd), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), false, 16);
                return;
            }
            return;
        }
        if (z2) {
            getContentView().LIZIZ();
        } else {
            getContentView().LIZ();
        }
    }

    public final boolean LIZLLL(float f, float f2) {
        if (f > getVoiceInputCancelIcon().getX() && f < getVoiceInputCancelIcon().getX() + getVoiceInputCancelIcon().getWidth() && f2 > getVoiceInputCancelIcon().getY() && f2 < getVoiceInputCancelIcon().getY() + getVoiceInputCancelIcon().getHeight()) {
            return true;
        }
        return false;
    }
}
