package X;

import Y.ACListenerS161S0100000_27;
import Y.ALAdapterS21S0200000_27;
import Y.AUListenerS18S0102000_27;
import Y.AUListenerS275S0100000_27;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.os.Looper;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.im.business.capability.api.conflicts.BusinessCapabilityService;
import com.ss.android.ugc.aweme.tako.experiment.TakoEnterMethodListExperiment;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yNh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1855350yNh extends FrameLayout {
    public static final float LLLIIIL = C418440Gaw.LIZIZ(12);
    public TuxIconView LL;
    public Function0<Unit> LLILLJJLI;
    public Function0<Unit> LLILLL;
    public Function0<Unit> LLILZ;
    public Function0<Unit> LLILZIL;
    public Function0<Unit> LLILZLL;
    public Function0<Boolean> LLIZ;
    public Function1<? super Long, Boolean> LLIZLLLIL;
    public Function0<Unit> LLJ;
    public Function0<Unit> LLJI;
    public final C01GW LLJIJIL;
    public final C01GW LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C01GW LLJILLL;
    public final C01GW LLJJ;
    public final C01GW LLJJI;
    public final C01GW LLJJIII;
    public final C01GW LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public int LLJJJ;
    public final float LLJJJIL;
    public final C01GW LLJJJJ;
    public final C01GW LLJJJJJIL;
    public final C384050F3z LLJJJJLIIL;
    public C384050F3z LLJJL;
    public Integer LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public final C01GW LLJLIL;
    public final ArgbEvaluator LLJLILLLLZIIL;
    public final C01GW LLJLL;
    public Long LLJLLIL;
    public final C01GW LLJLLL;
    public EnumC1855310yNd LLJZ;
    public EnumC1855290yNb LLJZIJLIL;
    public boolean LLL;
    public boolean LLLF;
    public boolean LLLFF;
    public TuxSheet LLLFFI;
    public boolean LLLFZ;
    public Integer LLLI;
    public boolean LLLII;
    public Function0<Unit> LLLIIII;
    public boolean LLLIIIIL;

    public final void LIZJ() {
        Function0<Unit> function0;
        this.LLJLLIL = null;
        setState(EnumC1855310yNd.INITIATE);
        if (this.LLJZIJLIL == EnumC1855290yNb.START) {
            setTalkState(EnumC1855290yNb.STOP);
        }
        LIZ(false);
        if (this.LLLII && (function0 = this.LLLIIII) != null) {
            function0.invoke();
        }
        this.LLLIIII = null;
        Function0<Unit> function02 = this.LLILZ;
        if (function02 != null) {
            function02.invoke();
        }
        BusinessCapabilityService.LIZ.getClass();
        BusinessCapabilityService businessCapabilityServiceLIZ = C1355280lN8.LIZ();
        if (businessCapabilityServiceLIZ != null) {
            businessCapabilityServiceLIZ.LIZIZ(EnumC1355300lNA.TAKO_VOICE_MESSAGE);
        }
    }

    private final ValueAnimator getContainerColorAnimator() {
        return (ValueAnimator) this.LLJJJJJIL.getValue();
    }

    private final ValueAnimator getContainerHeightAnimator() {
        return (ValueAnimator) this.LLJJJJ.getValue();
    }

    private final C1855370yNj getContentView() {
        return (C1855370yNj) this.LLJLLL.getValue();
    }

    private final View getDivider() {
        return (View) this.LLJJIII.getValue();
    }

    private final TuxTextView getHoldToTalk() {
        return (TuxTextView) this.LLJIJIL.getValue();
    }

    private final View getHotspot() {
        return (View) this.LLJILJIL.getValue();
    }

    private final int getInitContainerColor() {
        Integer num = this.LLJJLIIIJLLLLLLLZ;
        return num != null ? num.intValue() : getDefaultContainerColor();
    }

    private final ValueAnimator getInitiateViewAlphaAnimator() {
        return (ValueAnimator) this.LLJLL.getValue();
    }

    private final TuxIconView getStopBtn() {
        return (TuxIconView) this.LLJILJILJ.getValue();
    }

    private final C1303280k1G getTalkingHighVolumeView() {
        return (C1303280k1G) this.LLJJIJIL.getValue();
    }

    private final C1303280k1G getTalkingLowVolumeView() {
        return (C1303280k1G) this.LLJJIJIIJIL.getValue();
    }

    private final C1303280k1G getTalkingStartView() {
        return (C1303280k1G) this.LLJJIJI.getValue();
    }

    private final ValueAnimator getTalkingViewAlphaAnimator() {
        return (ValueAnimator) this.LLJLIL.getValue();
    }

    private final int getVoiceInputColor() {
        Integer num = this.LLLI;
        if (num != null) {
            return C1857690yRT.LJIIJ(num.intValue());
        }
        return C1857690yRT.LJIIJ(C07IF.LIZ() ? R.attr.a0d : R.attr.d5);
    }

    public final void LJFF() {
        if (!this.LLLF) {
            this.LLLF = true;
            C1389890mGx c1389890mGx = new C1389890mGx(this);
            c1389890mGx.LJIIIZ(2131849845);
            c1389890mGx.LJIIJJI();
            Function0<Unit> function0 = this.LLILZLL;
            if (function0 != null) {
                function0.invoke();
            }
        }
        if (this.LLJZ == EnumC1855310yNd.CANCELLING) {
            LIZ(false);
        }
    }

    public final View getHttContainer() {
        return (View) this.LLJJ.getValue();
    }

    public final View getInitiateView() {
        return (View) this.LLJILLL.getValue();
    }

    public final TuxIconView getKeyboardEntranceFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.m2k);
            this.LL = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final View getTalkingView() {
        return (View) this.LLJJI.getValue();
    }

    public final void LIZIZ() {
        getTalkingStartView().setAnimation("im_htt_start_talk.json");
        getTalkingLowVolumeView().setAnimation("im_htt_talking_low_volume.json");
        getTalkingLowVolumeView().setRepeatCount(-1);
        getTalkingHighVolumeView().setAnimation("im_htt_talking_high_volume.json");
        getTalkingHighVolumeView().setRepeatCount(-1);
    }

    public final void LIZLLL() {
        getContainerColorAnimator().cancel();
        getContainerColorAnimator().removeAllListeners();
        getInitiateViewAlphaAnimator().cancel();
        getContainerHeightAnimator().cancel();
    }

    public final void LJ() {
        if (getTalkingStartView().isAnimating()) {
            getTalkingStartView().cancelAnimation();
            C786410Ut5.i(getTalkingStartView(), 8);
        }
        if (getTalkingLowVolumeView().isAnimating()) {
            getTalkingLowVolumeView().cancelAnimation();
        }
        if (getTalkingHighVolumeView().isAnimating()) {
            getTalkingHighVolumeView().cancelAnimation();
        }
        C786410Ut5.i(getTalkingStartView(), 8);
        C786410Ut5.i(getTalkingLowVolumeView(), 8);
        C786410Ut5.i(getTalkingHighVolumeView(), 8);
        if (C298800BnS.LIZ() && TakoEnterMethodListExperiment.LIZ(false) && !Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            return;
        }
        getTalkingViewAlphaAnimator().cancel();
    }

    public final void LJII() {
        getInitiateViewAlphaAnimator().cancel();
        getInitiateViewAlphaAnimator().setFloatValues(getInitiateView().getAlpha(), 0.0f);
        getInitiateViewAlphaAnimator().start();
        getContainerHeightAnimator().cancel();
        if (this.LLJL) {
            return;
        }
        getContainerHeightAnimator().setIntValues(getHttContainer().getHeight(), this.LLJJJ);
        getContainerHeightAnimator().start();
    }

    public final int getDefaultContainerColor() {
        return C1857690yRT.LJIIJ(R.attr.c3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        LJ();
        LIZLLL();
    }

    public final Function1<Long, Boolean> getCheckRecordingDuration() {
        return this.LLIZLLLIL;
    }

    public final Function0<Boolean> getCheckTakoTypingOrSending() {
        return this.LLIZ;
    }

    public final boolean getFromInputLongPress() {
        return this.LLLII;
    }

    public final Function0<Unit> getKeyboardEntranceClickCallback() {
        return this.LLILLJJLI;
    }

    public final Function0<Unit> getOnCancelCallback() {
        return this.LLILZ;
    }

    public final Function0<Unit> getOnDispatchTouchDown() {
        return this.LLJI;
    }

    public final Function0<Unit> getOnErrorCallback() {
        return this.LLILZLL;
    }

    public final Function0<Unit> getOnSendCallback() {
        return this.LLILLL;
    }

    public final Function0<Unit> getOnStartSpeechCallback() {
        return this.LLILZIL;
    }

    public final TuxSheet getSheetDialog() {
        return this.LLLFFI;
    }

    public final EnumC1855310yNd getState() {
        return this.LLJZ;
    }

    public final Function0<Unit> getStopBtnClick() {
        return this.LLJ;
    }

    public final EnumC1855290yNb getTalkState() {
        return this.LLJZIJLIL;
    }

    public final void LIZ(boolean z) {
        Window window;
        if (z) {
            int[] iArr = new int[2];
            getLocationOnScreen(iArr);
            TuxSheet tuxSheet = this.LLLFFI;
            View decorView = null;
            if (tuxSheet != null) {
                C1855370yNj contentView = getContentView();
                Dialog dialog = tuxSheet.getDialog();
                if (dialog != null && (window = dialog.getWindow()) != null) {
                    decorView = window.getDecorView();
                }
                contentView.LIZJ(decorView, iArr);
                return;
            }
            getContentView().LIZJ(null, iArr);
            return;
        }
        this.LLLF = false;
        getContentView().LIZ();
    }

    public final void LJI(EnumC1855310yNd enumC1855310yNd) {
        int i = C1855300yNc.LIZ[enumC1855310yNd.ordinal()];
        if (i != 1) {
            if (i != 4) {
                C786410Ut5.LJLLLLLL(8, getInitiateView());
                C786410Ut5.LJLLLLLL(0, getTalkingView());
                return;
            }
            if (this.LLLII) {
                C786410Ut5.V0(this, 8);
            }
            C786410Ut5.LJLLLLLL(0, getInitiateView());
            C786410Ut5.LJLLLLLL(8, getTalkingView());
            C786410Ut5.LLLLLLZZ(getStopBtn(), 0);
            C786410Ut5.LLLLLLZZ(getKeyboardEntranceFromXml(), 8);
            LJ();
            return;
        }
        if (this.LLLII) {
            C786410Ut5.V0(this, 8);
        }
        C786410Ut5.LJLLLLLL(0, getInitiateView());
        C786410Ut5.LJLLLLLL(8, getTalkingView());
        C786410Ut5.LLLLLLZZ(getStopBtn(), 8);
        C786410Ut5.LLLLLLZZ(getKeyboardEntranceFromXml(), 0);
        LJ();
    }

    public final void LJIIIIZZ(EnumC1855360yNi enumC1855360yNi) {
        getContentView().setTipState(enumC1855360yNi);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Function0<Unit> function0;
        if (motionEvent != null && motionEvent.getActionMasked() == 0 && (function0 = this.LLJI) != null) {
            function0.invoke();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r12) {
        /*
            Method dump skipped, instruction units count: 665
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1855350yNh.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setCheckRecordingDuration(Function1<? super Long, Boolean> function1) {
        this.LLIZLLLIL = function1;
    }

    public final void setCheckTakoTypingOrSending(Function0<Boolean> function0) {
        this.LLIZ = function0;
    }

    public final void setContainerCustomShape(C384050F3z c384050F3z) {
        Integer num;
        this.LLJJL = c384050F3z;
        if (c384050F3z != null) {
            num = c384050F3z.LIZ;
        } else {
            num = null;
        }
        this.LLJJLIIIJLLLLLLLZ = num;
    }

    public final void setForbidTalkingHeightAnim(boolean z) {
        this.LLJL = z;
    }

    public final void setFromInputLongPress(boolean z) {
        this.LLLII = z;
    }

    public final void setKeyboardEntranceClickCallback(Function0<Unit> function0) {
        this.LLILLJJLI = function0;
    }

    public final void setKeyboardEntranceFromXml(TuxIconView tuxIconView) {
        this.LL = tuxIconView;
    }

    public final void setOnCancelCallback(Function0<Unit> function0) {
        this.LLILZ = function0;
    }

    public final void setOnDispatchTouchDown(Function0<Unit> function0) {
        this.LLJI = function0;
    }

    public final void setOnErrorCallback(Function0<Unit> function0) {
        this.LLILZLL = function0;
    }

    public final void setOnSendCallback(Function0<Unit> function0) {
        this.LLILLL = function0;
    }

    public final void setOnStartSpeechCallback(Function0<Unit> function0) {
        this.LLILZIL = function0;
    }

    public final void setSheetDialog(TuxSheet tuxSheet) {
        this.LLLFFI = tuxSheet;
    }

    public final void setState(EnumC1855310yNd enumC1855310yNd) {
        if (this.LLJZ == enumC1855310yNd) {
            return;
        }
        LJI(enumC1855310yNd);
        int i = C1855300yNc.LIZ[enumC1855310yNd.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        throw new C1954807lC();
                    }
                } else {
                    getContentView().setTipState(EnumC1855360yNi.CANCEL_TIP);
                    getContainerColorAnimator().cancel();
                    getContainerColorAnimator().removeAllListeners();
                    this.LLJJJJLIIL.LIZJ = Float.valueOf(this.LLJJJIL);
                    if (this.LLJZ == EnumC1855310yNd.INITIATE) {
                        LJII();
                        getContainerColorAnimator().addUpdateListener(new AUListenerS18S0102000_27(getInitContainerColor(), C1857690yRT.LJIIJ(R.attr.zs), this, 1));
                    } else {
                        getContainerColorAnimator().addUpdateListener(new AUListenerS18S0102000_27(getVoiceInputColor(), C1857690yRT.LJIIJ(R.attr.zs), this, 1));
                    }
                    getContainerColorAnimator().start();
                }
            } else {
                getContainerColorAnimator().cancel();
                getContainerColorAnimator().removeAllListeners();
                this.LLJJJJLIIL.LIZJ = Float.valueOf(this.LLJJJIL);
                if (this.LLJZ == EnumC1855310yNd.INITIATE) {
                    LJII();
                    getContainerColorAnimator().addUpdateListener(new AUListenerS18S0102000_27(getInitContainerColor(), getVoiceInputColor(), this, 1));
                } else {
                    getContainerColorAnimator().addUpdateListener(new AUListenerS18S0102000_27(C1857690yRT.LJIIJ(R.attr.zs), getVoiceInputColor(), this, 1));
                }
                getContainerColorAnimator().start();
            }
        } else if (this.LLJZ != EnumC1855310yNd.STOP_MESSAGE) {
            LIZLLL();
            this.LLJJJJLIIL.LIZJ = Float.valueOf(this.LLJJJIL);
            if (this.LLJZ == EnumC1855310yNd.TALKING) {
                getContainerColorAnimator().addUpdateListener(new AUListenerS18S0102000_27(getVoiceInputColor(), getInitContainerColor(), this, 1));
            } else {
                getContainerColorAnimator().addUpdateListener(new AUListenerS18S0102000_27(C1857690yRT.LJIIJ(R.attr.zs), getInitContainerColor(), this, 1));
            }
            getContainerColorAnimator().start();
            getContainerHeightAnimator().setIntValues(getHttContainer().getHeight(), this.LLJJJ);
            getContainerHeightAnimator().start();
            getInitiateViewAlphaAnimator().setFloatValues(getInitiateView().getAlpha(), 1.0f);
            getInitiateViewAlphaAnimator().start();
        }
        this.LLJZ = enumC1855310yNd;
    }

    public final void setStop(boolean z) {
        if (z) {
            setState(EnumC1855310yNd.STOP_MESSAGE);
        } else {
            setState(EnumC1855310yNd.INITIATE);
        }
    }

    public final void setStopBtnClick(Function0<Unit> function0) {
        this.LLJ = function0;
    }

    public final void setTalkInterrupted(boolean z) {
        this.LLL = z;
    }

    public final void setTalkState(EnumC1855290yNb enumC1855290yNb) {
        if (this.LLJZIJLIL == enumC1855290yNb) {
            return;
        }
        this.LLJZIJLIL = enumC1855290yNb;
        int i = C1855300yNc.LIZIZ[enumC1855290yNb.ordinal()];
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
                        talkingViewAlphaAnimator.addUpdateListener(new AUListenerS275S0100000_27(this, 24));
                        talkingViewAlphaAnimator.setDuration(50L);
                        talkingViewAlphaAnimator.start();
                        return;
                    }
                    throw new C1954807lC();
                }
                LJ();
                C786410Ut5.i(getTalkingHighVolumeView(), 0);
                getTalkingHighVolumeView().playAnimation();
                return;
            }
            LJ();
            C786410Ut5.i(getTalkingLowVolumeView(), 0);
            getTalkingLowVolumeView().playAnimation();
            return;
        }
        if (C0BO3.LIZ() && TakoEnterMethodListExperiment.LIZ(false) && !this.LLLFZ) {
            this.LLLFZ = true;
            LIZIZ();
        }
        LJ();
        ValueAnimator talkingViewAlphaAnimator2 = getTalkingViewAlphaAnimator();
        if (talkingViewAlphaAnimator2.isRunning()) {
            talkingViewAlphaAnimator2.cancel();
        }
        talkingViewAlphaAnimator2.setFloatValues(0.0f, 1.0f);
        talkingViewAlphaAnimator2.setDuration(100L);
        talkingViewAlphaAnimator2.start();
        C786410Ut5.i(getTalkingStartView(), 0);
        getTalkingStartView().playAnimation();
        C1303280k1G talkingStartView = getTalkingStartView();
        talkingStartView.addAnimatorListener(new ALAdapterS21S0200000_27(talkingStartView, new AwS571S0100000_27(this, 691), 2));
        Function0<Unit> function0 = this.LLILZIL;
        if (function0 == null) {
            return;
        }
        function0.invoke();
    }

    public final void setVoiceInputColor(Integer num) {
        this.LLLI = num;
    }

    public C1855350yNh(Context context, AttributeSet attributeSet) {
        float fLIZIZ;
        super(context, attributeSet, 0);
        this.LLJIJIL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 1071));
        this.LLJILJIL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 1073));
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS571S0100000_27(this, 1085));
        this.LLJILLL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 1078));
        this.LLJJ = C452501pT.LIZIZ(new AwS571S0100000_27(this, 1075));
        this.LLJJI = C452501pT.LIZIZ(new AwS571S0100000_27(this, 1041));
        this.LLJJIII = C452501pT.LIZIZ(new AwS571S0100000_27(this, 1069));
        this.LLJJIJI = C452501pT.LIZIZ(new AwS571S0100000_27(this, 1039));
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 1037));
        this.LLJJIJIL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 1088));
        this.LLJJJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44));
        C1855770yON.LIZ.getClass();
        if (C1855770yON.LIZLLL()) {
            fLIZIZ = C418440Gaw.LIZIZ(16);
        } else {
            fLIZIZ = this.LLJJJ / 2.0f;
        }
        this.LLJJJIL = fLIZIZ;
        this.LLJJJJ = C452501pT.LIZIZ(new AwS571S0100000_27(this, 1067));
        this.LLJJJJJIL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(414));
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZ = Integer.valueOf(getDefaultContainerColor());
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(25));
        this.LLJJJJLIIL = c384050F3z;
        this.LLJLIL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 1046));
        this.LLJLILLLLZIIL = new ArgbEvaluator();
        this.LLJLL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 1083));
        this.LLJLLL = C452501pT.LIZIZ(new AwS571S0100000_27(context, 1068));
        EnumC1855310yNd enumC1855310yNd = EnumC1855310yNd.INITIATE;
        this.LLJZ = enumC1855310yNd;
        this.LLJZIJLIL = EnumC1855290yNb.STOP;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (C298800BnS.LIZ() && TakoEnterMethodListExperiment.LIZ(false)) {
            C21146717pB.LIZIZ(context, R.layout.fp9, this, true);
        } else {
            C786410Ut5.Sd(R.layout.fp9, C786410Ut5.ne(context), this);
        }
        TuxIconView tuxIconView = (TuxIconView) findViewById(R.id.m2k);
        if (tuxIconView != null) {
            C786410Ut5.a9(tuxIconView, new ACListenerS161S0100000_27(this, 109));
        }
        getHttContainer().setBackground(c384050F3z.LIZ(context));
        LJI(enumC1855310yNd);
        if (!C0BO3.LIZ() || !TakoEnterMethodListExperiment.LIZ(false)) {
            LIZIZ();
        }
        C786410Ut5.a9(getStopBtn(), new ACListenerS161S0100000_27(this, 110));
        if (C1855770yON.LIZLLL()) {
            C0DSB.LIZIZ(getDivider());
            C426750GoL.LJIIIZ(getHoldToTalk(), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), null, null, null, false, 30);
        }
        C054G c054g = C319390CfZ.LIZ;
        C319390CfZ.LIZ(SystemClock.elapsedRealtime() - jElapsedRealtime, "tako_htt_view_init");
    }
}
