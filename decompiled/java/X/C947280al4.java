package X;

import Y.AAListenerS267S0200000_15;
import Y.AObserverS219S0100000_15;
import Y.ARunnableS115S0100000_15;
import Y.ARunnableS84S0200000_15;
import android.content.Context;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Observer;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestLetsDanceDownGradeConfig;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestSocialGameLetsDanceSetting;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.OppoPermissionPopupMaskDelayExp;
import com.tiktok.kmp.live.socialgamebusinessapi.event.MultiLetsDanceGameFinishEvent;
import com.tiktok.kmp.live.socialgamebusinessapi.event.MultiLetsDanceGameProgressChannel;
import com.tiktok.kmp.live.socialgamebusinessapi.event.MultiLetsDanceMainSpotJoinEvent;
import com.tiktok.kmp.live.socialgamebusinessapi.event.MultiLetsDanceMediaOnRenderStartEvent;
import com.tiktok.kmp.live.socialgamebusinessapi.event.MultiLetsDanceShowFinishBgEvent;
import com.tiktok.kmp.live.socialgamebusinessapi.event.MultiLetsDanceSongNameChannel;
import com.tiktok.kmp.live.socialgamebusinessapi.event.MultiLetsDanceStartGameEvent;
import com.tiktok.kmp.live.socialgamebusinessapi.event.MultiLetsDanceStartGameFromSeiChannel;
import com.tiktok.kmp.live.socialgamebusinessapi.service.ILiveDanceService;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import kotlin.jvm.internal.AwS224S0300000_15;
import kotlin.jvm.internal.AwS416S0200000_15;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS594S0100000_15;

/* JADX INFO: renamed from: X.0al4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C947280al4 extends AbstractC939840aZ4 {
    public static final /* synthetic */ int LLJLLIL = 0;
    public final DataChannel LLIZLLLIL;
    public final C01GW LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;
    public final C01GW LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C01GW LLJILLL;
    public final C01GW LLJJ;
    public final C01GW LLJJI;
    public C1295960jpS LLJJIII;
    public AAListenerS267S0200000_15 LLJJIJI;
    public C1295960jpS LLJJIJIIJIL;
    public AAListenerS267S0200000_15 LLJJIJIL;
    public final C01GW LLJJJ;
    public InterfaceC940910aan LLJJJIL;
    public EnumC947440alK LLJJJJ;
    public boolean LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public boolean LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL;
    public final C01GW LLJLIL;
    public final C947070akj LLJLILLLLZIIL;
    public boolean LLJLL;

    private final C1324720kZq getAnimationImageView() {
        return (C1324720kZq) this.LLJI.getValue();
    }

    private final View getBottomScrimView() {
        return (View) this.LLJLIL.getValue();
    }

    private final C1324720kZq getFinishBackgroundView() {
        return (C1324720kZq) this.LLJIJIL.getValue();
    }

    private final View getLoadingMaskView() {
        return (View) this.LLJJLIIIJLLLLLLLZ.getValue();
    }

    private final View getLoadingSpinnerView() {
        return (View) this.LLJL.getValue();
    }

    private final LiveIconView getMusicIconView() {
        return (LiveIconView) this.LLJILJILJ.getValue();
    }

    private final LiveIconView getRankIconView() {
        return (LiveIconView) this.LLJILJIL.getValue();
    }

    private final ConstraintLayout getRootContainer() {
        return (ConstraintLayout) this.LLJ.getValue();
    }

    public final void LJIIL() {
        C20441214yg.LIZIZ("lzp-test", "LetsDanceMainSpotBizViewElement playFinishLottie");
        final ConstraintLayout rootContainer = getRootContainer();
        if (rootContainer == null) {
            return;
        }
        if (this.LLJLL) {
            C20441214yg.LIZIZ("lzp-test", "LetsDanceMainSpotBizViewElement playFinishLottie isPlayingFinishLottie = true, return");
            return;
        }
        this.LLJLL = true;
        C1295960jpS c1295960jpS = this.LLJJIJIIJIL;
        if (c1295960jpS != null) {
            C930540aK4.LJJIJL(c1295960jpS);
        }
        final C1295960jpS c1295960jpS2 = new C1295960jpS(getContext());
        this.LLJJIJIIJIL = c1295960jpS2;
        c1295960jpS2.setRepeatCount(0);
        c1295960jpS2.removeAllAnimatorListeners();
        c1295960jpS2.cancelAnimation();
        c1295960jpS2.setProgress(0.0f);
        C1143680frq.LJIILL(c1295960jpS2, "tiktok_live_interaction_normal_4", "live_mg_lets_dance_finish_lottie.zip", false, new InterfaceC1143790fs1() { // from class: X.0al6
            @Override // X.InterfaceC1143790fs1
            public final void onFinish(boolean z) {
                if (z) {
                    C930540aK4.LJJIL(-1, c1295960jpS2, rootContainer);
                    C1295960jpS c1295960jpS3 = c1295960jpS2;
                    C947280al4 c947280al4 = this;
                    AAListenerS267S0200000_15 aAListenerS267S0200000_15 = new AAListenerS267S0200000_15(c1295960jpS3, c947280al4, 12);
                    AAListenerS267S0200000_15 aAListenerS267S0200000_152 = c947280al4.LLJJIJIL;
                    if (aAListenerS267S0200000_152 != null) {
                        c1295960jpS3.removeAnimatorListener(aAListenerS267S0200000_152);
                    }
                    this.LLJJIJIL = aAListenerS267S0200000_15;
                    c1295960jpS2.setMinAndMaxProgress(0.0f, 1.0f);
                    c1295960jpS2.setProgress(0.0f);
                    c1295960jpS2.addAnimatorListener(aAListenerS267S0200000_15);
                    c1295960jpS2.playAnimation();
                    return;
                }
                C930540aK4.LJJIJL(c1295960jpS2);
                c1295960jpS2.cancelAnimation();
                this.LLJLL = false;
            }
        });
    }

    public final C16FS getMainButton() {
        return (C16FS) this.LLJJ.getValue();
    }

    public final C16F5 getMusicNameView() {
        return (C16F5) this.LLJILLL.getValue();
    }

    public final SeekBar getMusicProgressView() {
        return (SeekBar) this.LLJJI.getValue();
    }

    public final C947050akh getViewModel() {
        return (C947050akh) this.LLJJJ.getValue();
    }

    @Override // X.AbstractC939840aZ4, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        C1295960jpS c1295960jpS;
        C1295960jpS c1295960jpS2;
        C20441214yg.LIZIZ("lzp-test", "LetsDanceMainSpotBizViewElement onDetachedFromWindow");
        InterfaceC940910aan interfaceC940910aan = this.LLJJJIL;
        if (interfaceC940910aan != null) {
            interfaceC940910aan.unsubscribe();
        }
        C947050akh viewModel = getViewModel();
        viewModel.getClass();
        C20441214yg.LJ("BaseLetsDanceBizViewModel", "BaseLetsDanceBizViewModel dispose");
        InterfaceC940910aan interfaceC940910aan2 = viewModel.LIZLLL;
        if (interfaceC940910aan2 != null) {
            interfaceC940910aan2.unsubscribe();
        }
        viewModel.LIZLLL = null;
        InterfaceC940910aan interfaceC940910aan3 = viewModel.LJ;
        if (interfaceC940910aan3 != null) {
            interfaceC940910aan3.unsubscribe();
        }
        viewModel.LJ = null;
        InterfaceC940910aan interfaceC940910aan4 = viewModel.LJFF;
        if (interfaceC940910aan4 != null) {
            interfaceC940910aan4.unsubscribe();
        }
        viewModel.LJFF = null;
        AAListenerS267S0200000_15 aAListenerS267S0200000_15 = this.LLJJIJI;
        if (aAListenerS267S0200000_15 != null && (c1295960jpS2 = this.LLJJIII) != null) {
            c1295960jpS2.removeAnimatorListener(aAListenerS267S0200000_15);
        }
        this.LLJJIJI = null;
        this.LLJJJJLIIL = false;
        AAListenerS267S0200000_15 aAListenerS267S0200000_152 = this.LLJJIJIL;
        if (aAListenerS267S0200000_152 != null && (c1295960jpS = this.LLJJIJIIJIL) != null) {
            c1295960jpS.removeAnimatorListener(aAListenerS267S0200000_152);
        }
        this.LLJJIJIL = null;
        this.LLJLL = false;
        DataChannelGlobal.LLILZ.zQ2(this);
        super.onDetachedFromWindow();
    }

    public final void LJIIJJI() {
        C1324720kZq finishBackgroundView = getFinishBackgroundView();
        if (finishBackgroundView != null) {
            C500260Jjc.LJIILIIL(finishBackgroundView);
        }
    }

    public final void LJIILIIL() {
        C16FS mainButton = getMainButton();
        if (mainButton == null) {
            return;
        }
        HandlerHook.viewPost(mainButton, new ARunnableS84S0200000_15(this, mainButton, 82));
    }

    public final void LJIILL() {
        String str = MultiGuestSocialGameLetsDanceSetting.config().mainSpotWaterMaskUrl;
        C1324720kZq finishBackgroundView = getFinishBackgroundView();
        if (finishBackgroundView == null) {
            return;
        }
        C500260Jjc.LLFFF(finishBackgroundView);
        C1819620xS4.LIZ().LIZJ(Collections.singletonList(str)).LJJI(finishBackgroundView);
    }

    public final void LJIJ() {
        ConstraintLayout rootContainer = getRootContainer();
        if (rootContainer != null) {
            C786410Ut5.LL(0, rootContainer);
        }
        C1324720kZq animationImageView = getAnimationImageView();
        if (animationImageView != null) {
            C500260Jjc.LJIILIIL(animationImageView);
        }
        C16FS mainButton = getMainButton();
        if (mainButton != null) {
            C500260Jjc.LJIILIIL(mainButton);
        }
        C16F5 musicNameView = getMusicNameView();
        if (musicNameView != null) {
            C500260Jjc.LJIILIIL(musicNameView);
        }
        LiveIconView musicIconView = getMusicIconView();
        if (musicIconView != null) {
            C500260Jjc.LJIILIIL(musicIconView);
        }
        LiveIconView rankIconView = getRankIconView();
        if (rankIconView != null) {
            C786410Ut5.LLJJIJIL(rankIconView, 0);
        }
        SeekBar musicProgressView = getMusicProgressView();
        if (musicProgressView != null) {
            C786410Ut5.LLIILZL(musicProgressView, 0);
        }
        SeekBar musicProgressView2 = getMusicProgressView();
        if (musicProgressView2 != null) {
            musicProgressView2.setMax(100);
        }
        SeekBar musicProgressView3 = getMusicProgressView();
        if (musicProgressView3 != null) {
            musicProgressView3.setProgress(100);
        }
        this.LLJJL = false;
        LJIILJJIL(20);
    }

    public final void LJIJI() {
        ConstraintLayout rootContainer = getRootContainer();
        if (rootContainer != null) {
            C786410Ut5.LL(0, rootContainer);
        }
        C1324720kZq animationImageView = getAnimationImageView();
        if (animationImageView != null) {
            C500260Jjc.LJIILIIL(animationImageView);
        }
        C16FS mainButton = getMainButton();
        if (mainButton != null) {
            C500260Jjc.LJIILIIL(mainButton);
        }
        C16F5 musicNameView = getMusicNameView();
        if (musicNameView != null) {
            C500260Jjc.LJIILIIL(musicNameView);
        }
        LiveIconView musicIconView = getMusicIconView();
        if (musicIconView != null) {
            C500260Jjc.LJIILIIL(musicIconView);
        }
        LiveIconView rankIconView = getRankIconView();
        if (rankIconView != null) {
            C786410Ut5.LLJJIJIL(rankIconView, 0);
        }
        SeekBar musicProgressView = getMusicProgressView();
        if (musicProgressView != null) {
            C786410Ut5.LLIILZL(musicProgressView, 0);
        }
        SeekBar musicProgressView2 = getMusicProgressView();
        if (musicProgressView2 != null) {
            musicProgressView2.setMax(100);
        }
        SeekBar musicProgressView3 = getMusicProgressView();
        if (musicProgressView3 != null) {
            musicProgressView3.setProgress(0);
        }
        this.LLJJL = true;
        LJIILLIIL(false);
        LJIILJJIL(20);
        C946950akX.LJIIIIZZ("video_play_result", new LinkedHashMap());
    }

    public final void LJIJJ() {
        LJIILIIL();
        C1324720kZq animationImageView = getAnimationImageView();
        if (animationImageView != null) {
            C500260Jjc.LLFFF(animationImageView);
        }
        C16FS mainButton = getMainButton();
        if (mainButton != null) {
            C500260Jjc.LLFFF(mainButton);
        }
        C16F5 musicNameView = getMusicNameView();
        if (musicNameView != null) {
            C500260Jjc.LLFFF(musicNameView);
        }
        LiveIconView musicIconView = getMusicIconView();
        if (musicIconView != null) {
            C500260Jjc.LLFFF(musicIconView);
        }
        LiveIconView rankIconView = getRankIconView();
        if (rankIconView != null) {
            C500260Jjc.LJIILIIL(rankIconView);
        }
        SeekBar musicProgressView = getMusicProgressView();
        if (musicProgressView != null) {
            C500260Jjc.LJIILIIL(musicProgressView);
        }
        SeekBar musicProgressView2 = getMusicProgressView();
        if (musicProgressView2 != null) {
            musicProgressView2.setMax(100);
        }
        SeekBar musicProgressView3 = getMusicProgressView();
        if (musicProgressView3 != null) {
            musicProgressView3.setProgress(0);
        }
        C1295960jpS c1295960jpS = this.LLJJIJIIJIL;
        if (c1295960jpS != null) {
            C500260Jjc.LJIILIIL(c1295960jpS);
        }
        this.LLJJIJIIJIL = null;
        this.LLJLL = false;
        this.LLJJL = false;
        LJIILJJIL(44);
    }

    @Override // X.AbstractC939840aZ4
    public Integer getLayoutId() {
        return Integer.valueOf(R.layout.hu1);
    }

    @Override // X.AbstractC939840aZ4, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onAttachedToWindow ");
        sbLIZ.append(hashCode());
        C20441214yg.LIZIZ("LetsDanceMainSpotBizViewElement", C2188811AlT.LIZIZ(sbLIZ));
        getViewModel().LJIIIZ();
        C947050akh viewModel = getViewModel();
        C947070akj c947070akj = this.LLJLILLLLZIIL;
        InterfaceC946970akZ interfaceC946970akZLJII = viewModel.LJII();
        this.LLJJJIL = interfaceC946970akZLJII != null ? interfaceC946970akZLJII.LJIIL(c947070akj) : null;
        C1324720kZq animationImageView = getAnimationImageView();
        if (animationImageView != null) {
            if (MultiGuestLetsDanceDownGradeConfig.downgradePrepareAnimation()) {
                C1143680frq.LIZLLL(animationImageView, "tiktok_live_interaction_normal_4", "mg_lets_dance_downgrade_prepare_pic.png");
            } else {
                C1143920fsE c1143920fsE = new C1143920fsE();
                c1143920fsE.LIZIZ = "tiktok_live_interaction_normal_4";
                c1143920fsE.LIZJ = "live_mg_lets_dance_preparation_animation.webp";
                c1143920fsE.LIZ = animationImageView;
                c1143920fsE.LJFF = true;
                c1143920fsE.LJI = Integer.MAX_VALUE;
                c1143920fsE.LJIIJJI = true;
                C1143680frq.LJIIIIZZ(c1143920fsE);
            }
        }
        C16FS mainButton = getMainButton();
        if (mainButton != null) {
            C16F5 c16f5 = mainButton.LLILZIL;
            if (c16f5 != null) {
                c16f5.setTypeface(C1119920fFW.LIZIZ(OppoPermissionPopupMaskDelayExp.DEFAULT, 128));
            } else {
                SparseIntArray sparseIntArray = C1119920fFW.LIZ;
            }
            if (getViewModel().LJIIJJI()) {
                C20441214yg.LIZIZ("lzp-test", "LetsDanceMainSpotBizViewElement resource is ready.");
                this.LLJJJJJIL = false;
                LJIILIIL();
            } else {
                C20441214yg.LIZIZ("lzp-test", "LetsDanceMainSpotBizViewElement resource not ready. start download!");
                this.LLJJJJJIL = true;
                LJIILIIL();
                getViewModel().LJFF();
            }
        }
        C500260Jjc.LJLIIIL(500L, this, new AwS594S0100000_15(this, 1120));
        C16FS mainButton2 = getMainButton();
        if (mainButton2 != null) {
            C500260Jjc.LJLIIIL(500L, mainButton2, new AwS594S0100000_15(this, 1123));
        }
        DataChannelGlobal.LLILZ.BQ2(this, this, MultiLetsDanceMainSpotJoinEvent.class, new AwS594S0100000_15(this, 1139));
        if (!C930540aK4.LIZJ()) {
            getViewModel().LJIIJ.observe(this, new AObserverS219S0100000_15(this, 121));
        }
        getViewModel().LJIIJJI.observe(this, new AObserverS219S0100000_15(this, 122));
        getDataChannel().EQ2(this, MultiLetsDanceSongNameChannel.class, new AwS594S0100000_15(this, 1108));
        getViewModel().LJIIIIZZ.observe(this, new Observer() { // from class: X.04jk
            @Override // androidx.lifecycle.Observer
            public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
            }
        });
        getViewModel().LJIIIZ.observe(this, new AObserverS219S0100000_15(this, 120));
        getDataChannel().BQ2(this, MultiLetsDanceGameProgressChannel.class, new AwS594S0100000_15(this, 1112));
        getDataChannel().BQ2(this, MultiLetsDanceGameFinishEvent.class, new AwS594S0100000_15(this, 1113));
        getDataChannel().BQ2(this, MultiLetsDanceMediaOnRenderStartEvent.class, new AwS594S0100000_15(this, 1116));
        getDataChannel().BQ2(this, MultiLetsDanceShowFinishBgEvent.class, new AwS594S0100000_15(this, 1134));
        getDataChannel().BQ2(this, MultiLetsDanceStartGameFromSeiChannel.class, new AwS594S0100000_15(this, 1136));
    }

    @Override // X.AbstractC939840aZ4
    public DataChannel getDataChannel() {
        return this.LLIZLLLIL;
    }

    @Override // X.AbstractC939840aZ4
    public EnumC939900aZA getElementType() {
        return EnumC939900aZA.LETS_DANCE_MAIN_SPOT;
    }

    public static void LJIIIZ(C16FS c16fs) {
        c16fs.LJIIL();
        C20441214yg.LIZIZ("lzp-test", "LetsDanceMainSpotBizViewElement applyIdleStyle");
        c16fs.setBackground(C800330VaR.LIZIZ(c16fs.getContext(), R.drawable.dwt));
        c16fs.setText(C20642515q3.LJI(2131854459));
    }

    public final void LJIIJ(View view) {
        if (view.getId() == R.id.oa0) {
            if (this.LLJJJJ != EnumC947440alK.PLAYING) {
                C1295960jpS c1295960jpS = this.LLJJIII;
                if (c1295960jpS != null && c1295960jpS.isAnimating()) {
                    return;
                }
                if (!getViewModel().LJIIJJI()) {
                    if (this.LLJJJJJIL) {
                        C766270U4b.LJIIJJI(C497740JfY.LJIJI(2131852819));
                        return;
                    }
                    getViewModel().LJFF();
                    this.LLJJJJJIL = true;
                    LJIILIIL();
                    return;
                }
                C20441214yg.LIZIZ("LetsDanceMainSpotBizViewElement", "Main button clicked");
                getViewModel().LJIIL(null);
                return;
            }
            return;
        }
        C20441214yg.LIZIZ("LetsDanceMainSpotBizViewElement", "Main spot clicked");
        getViewModel().LJIILJJIL();
    }

    public final void LJIILJJIL(int i) {
        View bottomScrimView = getBottomScrimView();
        if (bottomScrimView != null) {
            C500260Jjc.LLFFF(bottomScrimView);
            ViewGroup.LayoutParams layoutParams = bottomScrimView.getLayoutParams();
            layoutParams.height = C439101nJ.LIZ(i);
            C786410Ut5.W5(bottomScrimView, layoutParams);
        }
    }

    public final void LJIILLIIL(boolean z) {
        if (z) {
            View loadingMaskView = getLoadingMaskView();
            if (loadingMaskView != null) {
                C500260Jjc.LLFFF(loadingMaskView);
            }
            View loadingSpinnerView = getLoadingSpinnerView();
            if (loadingSpinnerView != null) {
                C500260Jjc.LLFFF(loadingSpinnerView);
            }
            C16FS mainButton = getMainButton();
            if (mainButton != null) {
                C500260Jjc.LJIILIIL(mainButton);
                return;
            }
            return;
        }
        View loadingMaskView2 = getLoadingMaskView();
        if (loadingMaskView2 != null) {
            C500260Jjc.LJIILIIL(loadingMaskView2);
        }
        View loadingSpinnerView2 = getLoadingSpinnerView();
        if (loadingSpinnerView2 == null) {
            return;
        }
        C500260Jjc.LJIILIIL(loadingSpinnerView2);
    }

    public final void LJIIZILJ(long j, Long l) {
        ConstraintLayout rootContainer = getRootContainer();
        if (rootContainer == null) {
            return;
        }
        C1295960jpS c1295960jpS = new C1295960jpS(getContext());
        this.LLJJIII = c1295960jpS;
        if (this.LLJJJJLIIL) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("startCountdownLottieAt isCountDownPlaying = true, timeLeftFromSei=");
            sbLIZ.append(l);
            C20441214yg.LIZIZ("LetsDanceMainSpotBizViewElement", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        this.LLJJJJLIIL = true;
        c1295960jpS.setRepeatCount(0);
        c1295960jpS.removeAllAnimatorListeners();
        c1295960jpS.cancelAnimation();
        c1295960jpS.setProgress(0.0f);
        long jLIZ = (j - C158B.LIZ()) - 3000;
        if (l != null) {
            jLIZ = l.longValue() - 3000;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("startCountdownLottieAt timeLeft = ");
        sbLIZ2.append(jLIZ);
        C20441214yg.LIZIZ("LetsDanceMainSpotBizViewElement", C2188811AlT.LIZIZ(sbLIZ2));
        final AwS224S0300000_15 awS224S0300000_15 = new AwS224S0300000_15(c1295960jpS, rootContainer, this, 59);
        if (jLIZ > 0) {
            HandlerHook.viewPostDelay(rootContainer, new ARunnableS115S0100000_15(awS224S0300000_15, 205), jLIZ);
            return;
        }
        long jAbs = Math.abs(jLIZ);
        if (jAbs < 3000) {
            final float f = jAbs / 3000.0f;
            HandlerHook.viewPost(rootContainer, new Runnable() { // from class: X.0al7
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("LetsDanceMainSpotBizViewElement@4462.startCountdownLottieAt$3");
                    try {
                        awS224S0300000_15.invoke(Float.valueOf(f));
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("LetsDanceMainSpotBizViewElement@4462.startCountdownLottieAt$3");
                }
            });
        } else {
            this.LLJJJJLIIL = false;
            getDataChannel().LC0(MultiLetsDanceStartGameEvent.class, Integer.valueOf((int) jAbs));
        }
    }

    /* JADX WARN: Type inference failed for: r0v25, types: [X.0akj] */
    public C947280al4(Context context, DataChannel dataChannel, C957020b0m c957020b0m) {
        super(context, dataChannel, c957020b0m, null);
        this.LLIZLLLIL = dataChannel;
        this.LLJ = C930540aK4.LJJIJIL(new AwS559S0100000_15(this, 1153));
        this.LLJI = C930540aK4.LJJIJIL(new AwS559S0100000_15(this, 1143));
        this.LLJIJIL = C930540aK4.LJJIJIL(new AwS559S0100000_15(this, 1145));
        this.LLJILJIL = C930540aK4.LJJIJIL(new AwS559S0100000_15(this, 1152));
        this.LLJILJILJ = C930540aK4.LJJIJIL(new AwS559S0100000_15(this, 1149));
        this.LLJILLL = C930540aK4.LJJIJIL(new AwS559S0100000_15(this, 1150));
        this.LLJJ = C930540aK4.LJJIJIL(new AwS559S0100000_15(this, 1148));
        this.LLJJI = C930540aK4.LJJIJIL(new AwS559S0100000_15(this, 1151));
        this.LLJJJ = C930540aK4.LJJIJIL(new AwS416S0200000_15(context, this, 117));
        this.LLJJLIIIJLLLLLLLZ = C930540aK4.LJJIJIL(new AwS559S0100000_15(this, 1146));
        this.LLJL = C930540aK4.LJJIJIL(new AwS559S0100000_15(this, 1147));
        this.LLJLIL = C930540aK4.LJJIJIL(new AwS559S0100000_15(this, 1144));
        this.LLJLILLLLZIIL = new InterfaceC949260aoG() { // from class: X.0akj
            @Override // X.InterfaceC949260aoG
            public final void LIZ(EnumC947020ake enumC947020ake) {
                String str;
                C949120ao2 c949120ao2LJIILIIL;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("resourceDownloadListener onSuccess: ");
                sbLIZ.append(enumC947020ake);
                C20441214yg.LIZIZ("LetsDanceMainSpotBizViewElement", C2188811AlT.LIZIZ(sbLIZ));
                C949060anw c949060anwYo1 = ((ILiveDanceService) C1161920gLG.LIZJ(ILiveDanceService.class)).Yo1();
                if (c949060anwYo1 != null && (c949120ao2LJIILIIL = c949060anwYo1.LJIILIIL(enumC947020ake)) != null) {
                    str = c949120ao2LJIILIIL.LIZIZ;
                } else {
                    str = null;
                }
                String lowerCase = enumC947020ake.name().toLowerCase(Locale.ROOT);
                if (str == null) {
                    str = "";
                }
                C946950akX.LJI(lowerCase, str, "success");
                if (this.LIZ.getViewModel().LJIIJJI()) {
                    C947280al4 c947280al4 = this.LIZ;
                    c947280al4.LLJJJJJIL = false;
                    c947280al4.LJIILIIL();
                    this.LIZ.LJIILLIIL(false);
                }
            }

            @Override // X.InterfaceC949260aoG
            public final void LIZIZ(EnumC947020ake enumC947020ake) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("resourceDownloadListener onStart: ");
                sbLIZ.append(enumC947020ake);
                C20441214yg.LIZIZ("LetsDanceMainSpotBizViewElement", C2188811AlT.LIZIZ(sbLIZ));
                C947280al4 c947280al4 = this.LIZ;
                c947280al4.LLJJJJJIL = true;
                C16FS mainButton = c947280al4.getMainButton();
                if (mainButton != null) {
                    HandlerHook.viewPost(mainButton, new ARunnableS115S0100000_15(this.LIZ, 200));
                }
            }

            @Override // X.InterfaceC949260aoG
            public final void LIZJ(EnumC947020ake enumC947020ake, Long l) {
                String string;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("resourceDownloadListener onFail: ");
                sbLIZ.append(enumC947020ake);
                C20441214yg.LJ("LetsDanceMainSpotBizViewElement", C2188811AlT.LIZIZ(sbLIZ));
                String lowerCase = enumC947020ake.name().toLowerCase(Locale.ROOT);
                if (l == null || (string = l.toString()) == null) {
                    string = "";
                }
                C946950akX.LJI(lowerCase, string, "fail");
                if (this.LIZ.getViewModel().LJIIIIZZ().contains(enumC947020ake)) {
                    C947280al4 c947280al4 = this.LIZ;
                    c947280al4.LLJJJJJIL = false;
                    C16FS mainButton = c947280al4.getMainButton();
                    if (mainButton != null) {
                        HandlerHook.viewPost(mainButton, new ARunnableS115S0100000_15(this.LIZ, 204));
                    }
                }
            }
        };
    }
}
