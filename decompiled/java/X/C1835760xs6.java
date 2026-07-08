package X;

import android.view.Surface;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.autopost.AutoPostLivingViewModel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS216S0000000_27;
import kotlin.jvm.internal.AwS236S0300000_27;
import kotlin.jvm.internal.AwS606S0100000_27;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0xs6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1835760xs6 {
    public final AutoPostLivingViewModel LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public C1835840xsE LJFF;
    public C1808830xAf LJI;
    public C1835750xs5 LJII;
    public final C01GW LJIIIIZZ = C452501pT.LIZIZ(AFwS216S0000000_27.get$arr$(235));

    public final InterfaceC1484830ok5 LIZ() {
        return (InterfaceC1484830ok5) this.LJIIIIZZ.getValue();
    }

    public C1835760xs6(AutoPostLivingViewModel autoPostLivingViewModel) {
        this.LIZ = autoPostLivingViewModel;
    }

    public final void LIZIZ(C1835840xsE c1835840xsE, C1808830xAf c1808830xAf) {
        float fFloatValue;
        Float f;
        InterfaceC1484830ok5 interfaceC1484830ok5LIZ = LIZ();
        if (interfaceC1484830ok5LIZ != null) {
            interfaceC1484830ok5LIZ.stop();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("resetCurrentVideoUi, viewHolder: ");
        sbLIZ.append(c1835840xsE);
        C20441214yg.LIZIZ("AutoPostVideoPlayer", C2188811AlT.LIZIZ(sbLIZ));
        C500260Jjc.LJIILLIIL(c1835840xsE.LLILLJJLI);
        C1246020iWu.LIZ(c1835840xsE.LLILZLL);
        C500260Jjc.LJIILLIIL(c1835840xsE.LLIZLLLIL);
        C500260Jjc.LJIILLIIL(c1835840xsE.LLJ);
        C500260Jjc.LJIILLIIL(c1835840xsE.LLIZ);
        C1246020iWu.LIZ(c1835840xsE.LLILLL);
        C1246020iWu.LIZ(c1835840xsE.LLJI);
        C500260Jjc.LJIILLIIL(c1835840xsE.LLJILJIL);
        C500260Jjc.LJIILLIIL(c1835840xsE.LLJIJIL);
        TuxTextView tuxTextView = c1835840xsE.LLILZIL;
        if (c1808830xAf != null && (f = c1808830xAf.LJFF) != null) {
            fFloatValue = f.floatValue();
        } else {
            fFloatValue = 0.0f;
        }
        tuxTextView.setText(C1246020iWu.LIZIZ((long) fFloatValue));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0xs5] */
    public final void LIZJ(final C1835840xsE c1835840xsE, final C1808830xAf c1808830xAf) {
        InterfaceC1484830ok5 interfaceC1484830ok5LIZ;
        C1835750xs5 c1835750xs5 = this.LJII;
        if (c1835750xs5 != null && (interfaceC1484830ok5LIZ = LIZ()) != null) {
            interfaceC1484830ok5LIZ.LJJIIZ(c1835750xs5);
        }
        this.LJII = new InterfaceC1482530ogN() { // from class: X.0xs5
            public long LL;
            public long LLILLJJLI;

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void Au(Surface surface) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void Gk1(C1284720jXK c1284720jXK) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void LLZZLLIL(C1281010jRL c1281010jRL) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void Qe2(C1700490uLv c1700490uLv) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void VK() {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void W1(String str) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onBrightnessChanged(String str, float f) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onBufferedPercent(String str, long j, int i) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onBufferedTimeMs(String str, long j) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onCompleteLoaded(String str, boolean z) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onCrosstalkHappened(String str, List list) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onDecoderBuffering(String str, boolean z, C1480430ocz c1480430ocz) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onFrameAboutToBeRendered(int i, long j, long j2, Map map) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onLiveRenderFirstFrame(String str, C1480420ocy c1480420ocy) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onLoopPlay(String str, int i) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onMaskInfoCallback(String str, C1480290ocl c1480290ocl) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onPlayCompletedFirstTime(String str, C1480430ocz c1480430ocz) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onPlayPause(String str) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onPlayPrepare(String str) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onPlayPrepared(String str) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onPlayRelease(String str) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onPlayStop(String str, JSONObject jSONObject, C1480430ocz c1480430ocz) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onPlayerInternalEvent(String str, int i, JSONObject jSONObject) {
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnPreRenderListener
            public final /* synthetic */ void onPreRenderReady(String str) {
                C490850JMt.LIZ(this, str);
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onPreRenderSessionMissed(String str) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onPreparePlay(String str, C1480430ocz c1480430ocz) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onResumePlay(String str, C1480430ocz c1480430ocz) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onRetryOnError(String str, C1481290oeN c1481290oeN) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onSeekEnd(String str, boolean z) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onSeekStart(String str, int i, float f) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onSpeedChanged(String str, float f) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onVideoBitrateChanged(String str, EnumC2281141EQm enumC2281141EQm, int i) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onVideoSecondFrame(String str) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onVideoSizeChanged(String str, int i, int i2) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void tc(String str, JSONObject jSONObject) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void uv(JSONObject jSONObject) {
            }

            @Override // X.InterfaceC1482530ogN
            public final void onStopPlay(String str) {
                this.LLILLL.LJ = false;
                C20441214yg.LIZIZ("AutoPostVideoPlayer", "onStopPlay");
            }

            @Override // X.InterfaceC1482530ogN
            public final void onPausePlay(String str, C1480430ocz c1480430ocz) {
                C20441214yg.LIZIZ("AutoPostVideoPlayer", "onPausePlay");
                if (this.LLILLL.LJ) {
                    C500260Jjc.LJIILLIIL(c1835840xsE.LLIZ);
                    C1246020iWu.LIZ(c1835840xsE.LLJ);
                    this.LLILLL.LIZJ = true;
                }
            }

            @Override // X.InterfaceC1482530ogN
            public final void onPlayCompleted(String str, int i) {
                this.LLILLL.LJ = false;
                C20441214yg.LIZIZ("AutoPostVideoPlayer", "onPlayCompleted");
                this.LLILLL.LIZIZ(c1835840xsE, c1808830xAf);
            }

            @Override // X.InterfaceC1482530ogN
            public final void onPlaying(String str, C1480430ocz c1480430ocz) {
                C20441214yg.LIZIZ("AutoPostVideoPlayer", "onPlaying");
                this.LLILLL.LJ = true;
                C500260Jjc.LJIILLIIL(c1835840xsE.LLIZLLLIL);
                C500260Jjc.LJIILLIIL(c1835840xsE.LLIZ);
                C500260Jjc.LJIILLIIL(c1835840xsE.LLILZLL);
                C500260Jjc.LJIILLIIL(c1835840xsE.LLJ);
                this.LLILLL.LIZJ = false;
            }

            @Override // X.InterfaceC1482530ogN
            public final void onRenderFirstFrame(String str, C1480420ocy c1480420ocy) {
                C20441214yg.LIZIZ("AutoPostVideoPlayer", "onRenderFirstFrame");
                C1835760xs6 c1835760xs6 = this.LLILLL;
                C1835840xsE c1835840xsE2 = c1835840xsE;
                c1835760xs6.getClass();
                View childAt = c1835840xsE2.LLILLJJLI.getChildAt(0);
                if (childAt != null) {
                    int width = c1835760xs6.LIZ().LJIIIZ().getWidth();
                    int height = c1835760xs6.LIZ().LJIIIZ().getHeight();
                    int width2 = c1835840xsE2.LLILLJJLI.getWidth();
                    int height2 = c1835840xsE2.LLILLJJLI.getHeight();
                    if (width > 0 && height > 0 && width2 > 0 && height2 > 0) {
                        float f = width / height;
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                        layoutParams.width = -1;
                        layoutParams.height = (int) (width2 / f);
                        layoutParams.gravity = 17;
                        C786410Ut5.W5(childAt, layoutParams);
                    }
                }
                this.LL = 0L;
                c1835840xsE.LLILZIL.setText(C1246020iWu.LIZIZ(0L));
            }

            @Override // X.InterfaceC1482530ogN
            public final void onBuffering(String str, boolean z, C1480430ocz c1480430ocz) {
                C20441214yg.LIZIZ("AutoPostVideoPlayer", "onBuffering");
                if (z) {
                    C1246020iWu.LIZ(c1835840xsE.LLIZLLLIL);
                    this.LLILLJJLI = System.currentTimeMillis();
                } else {
                    C500260Jjc.LJIILLIIL(c1835840xsE.LLIZLLLIL);
                    this.LLILLL.LIZ.vQ2(new C1777300wLo(System.currentTimeMillis() - this.LLILLJJLI, c1808830xAf));
                }
            }

            @Override // X.InterfaceC1482530ogN
            public final void onPlayFailed(String str, C1481290oeN c1481290oeN, C1480430ocz c1480430ocz) {
                C20441214yg.LIZIZ("AutoPostVideoPlayer", "onPlayFailed");
                C1835760xs6 c1835760xs6 = this.LLILLL;
                c1835760xs6.LJ = false;
                c1835760xs6.LIZIZ(c1835840xsE, c1808830xAf);
            }

            @Override // X.InterfaceC1482530ogN
            public final void onPlayProgressChange(String str, long j, long j2) {
                long j3 = j / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
                if (this.LL != j3) {
                    this.LL = j3;
                    c1835840xsE.LLILZIL.setText(C1246020iWu.LIZIZ(j3));
                }
            }
        };
        LIZ().LIZLLL(new InterfaceC1483820oiS() { // from class: X.0xs8
            @Override // X.InterfaceC1483820oiS
            public final /* synthetic */ boolean bn() {
                return true;
            }

            @Override // X.InterfaceC1483820oiS
            public final /* synthetic */ InterfaceC1473950oSX getCustomSurfaceLifecycleListener() {
                return null;
            }

            @Override // X.InterfaceC1483820oiS
            public final /* synthetic */ Surface getSurface() {
                return null;
            }

            @Override // X.InterfaceC1483820oiS
            public final /* synthetic */ void hj() {
            }

            @Override // X.InterfaceC1483820oiS
            public final /* synthetic */ void pe() {
            }

            @Override // X.InterfaceC1483820oiS
            public final HashMap getParams() {
                return new HashMap();
            }

            @Override // X.InterfaceC1483820oiS
            public final FrameLayout getPlayViewContainer() {
                return c1835840xsE.LLILLJJLI;
            }
        });
        LIZ().setSpeed(1.0f);
        C1835750xs5 c1835750xs52 = this.LJII;
        if (c1835750xs52 != null) {
            LIZ().LJIIZILJ(c1835750xs52);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("startPlay, viewHolder: ");
        sbLIZ.append(c1835840xsE);
        C20441214yg.LIZIZ("AutoPostVideoPlayer", C2188811AlT.LIZIZ(sbLIZ));
        C1246020iWu.LIZ(c1835840xsE.LLILLJJLI);
        String strLIZ = C2254508sR.LIZ(String.valueOf(c1808830xAf.LIZLLL));
        C1482580ogS c1482580ogS = new C1482580ogS();
        c1482580ogS.LIZ = strLIZ;
        C1058540deW c1058540deW = new C1058540deW(c1482580ogS);
        c1058540deW.LIZIZ(c1808830xAf.LJII);
        c1058540deW.LIZIZ = strLIZ;
        C1482570ogR c1482570ogRLIZ = c1058540deW.LIZ().LIZ();
        C1479570obb c1479570obb = c1482570ogRLIZ.LIZIZ;
        c1479570obb.LJJIIZ = "mp4";
        c1479570obb.LJIILL = "live_replay";
        c1479570obb.LJIILLIIL = "auto_post_living";
        c1479570obb.LJJ = true;
        C1482580ogS c1482580ogS2 = c1482570ogRLIZ.LIZ;
        c1482580ogS2.LJ = c1482570ogRLIZ;
        LIZ().LJ(new C1484680ojq(c1482580ogS2).LIZ());
    }

    public final void LIZLLL(C1835840xsE c1835840xsE, C1808830xAf c1808830xAf) {
        InterfaceC1484830ok5 interfaceC1484830ok5LIZ;
        C1835840xsE c1835840xsE2;
        if (c1835840xsE == null || c1808830xAf == null) {
            return;
        }
        if (!Intrinsics.LJFF(this.LJFF, c1835840xsE) && (c1835840xsE2 = this.LJFF) != null) {
            LIZIZ(c1835840xsE2, this.LJI);
        }
        C1835750xs5 c1835750xs5 = this.LJII;
        if (c1835750xs5 != null && (interfaceC1484830ok5LIZ = LIZ()) != null) {
            interfaceC1484830ok5LIZ.LJJIIZ(c1835750xs5);
        }
        this.LJFF = c1835840xsE;
        this.LJI = c1808830xAf;
        C500260Jjc.LJLIIIL(500L, c1835840xsE.LLIZ, new AwS606S0100000_27(this, 327));
        C500260Jjc.LJLIIIL(500L, c1835840xsE.LLJ, new AwS606S0100000_27(this, 328));
        C500260Jjc.LJLIIIL(500L, c1835840xsE.LLILZLL, new AwS236S0300000_27(this, c1835840xsE, c1808830xAf, 23));
        c1835840xsE.LLJJ = new C1835820xsC(this, c1835840xsE);
        if (this.LIZLLL && !this.LIZJ) {
            LIZJ(c1835840xsE, c1808830xAf);
        } else {
            C1246020iWu.LIZ(c1835840xsE.LLILZLL);
        }
    }
}
