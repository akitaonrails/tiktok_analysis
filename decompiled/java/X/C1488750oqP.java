package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.Surface;
import android.widget.FrameLayout;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.lynxecomvideo.model.VideoInfo;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.player.sdk.api.OnPreRenderListener;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS44S0200100_23;
import kotlin.jvm.internal.AwS567S0100000_23;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0oqP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1488750oqP extends FrameLayout {
    public static final /* synthetic */ int LLJJJ = 0;
    public final C587000N0o LL;
    public final C01GW<InterfaceC1484830ok5> LLILLJJLI;
    public final C01GW LLILLL;
    public boolean LLILZ;
    public int LLILZIL;
    public int LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public final C1488760oqQ LLJ;
    public String LLJI;
    public boolean LLJIJIL;
    public boolean LLJILJIL;
    public InterfaceC1479620obg LLJILJILJ;
    public InterfaceC1488770oqR LLJILLL;
    public String LLJJ;
    public String LLJJI;
    public String LLJJIII;
    public long LLJJIJI;
    public float LLJJIJIIJIL;
    public String LLJJIJIL;

    public C1488750oqP(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public final void LIZIZ() {
        this.LLJILLL = null;
        getPlayer().stop();
        if (this.LLIZLLLIL) {
            getPlayer().LJJIIZ(this.LLJ);
            this.LLIZLLLIL = false;
        }
        getPlayer().LJIILIIL().LJIL(this.LL);
        if (this.LLIZ) {
            getPlayer().LJIIJJI(getPlayerHost());
            this.LLIZ = false;
        }
        getPlayer().release();
    }

    private final InterfaceC1483820oiS getPlayerHost() {
        return (InterfaceC1483820oiS) this.LLILLL.getValue();
    }

    public final void LIZLLL() {
        if (!this.LLIZ) {
            getPlayer().LIZJ(getPlayerHost());
            this.LLIZ = true;
        }
        if (this.LLIZLLLIL) {
            return;
        }
        getPlayer().LJIIZILJ(this.LLJ);
        this.LLIZLLLIL = true;
    }

    public final InterfaceC1484830ok5 getPlayer() {
        return this.LLILLJJLI.getValue();
    }

    public final void LJ() {
        getPlayer().pause();
    }

    public final void LJIIIZ() {
        InterfaceC1479620obg interfaceC1479620obg;
        if (getPlayer().getPlayState().isPaused()) {
            getPlayer().resume();
            return;
        }
        InterfaceC1483850oiV playState = getPlayer().getPlayState();
        if ((playState == null || !playState.isPlaying()) && (interfaceC1479620obg = this.LLJILJILJ) != null) {
            LJI(interfaceC1479620obg);
        }
    }

    public final void LIZJ(String str) {
        InterfaceC1488770oqR interfaceC1488770oqR = this.LLJILLL;
        if (interfaceC1488770oqR != null) {
            interfaceC1488770oqR.LIZIZ(str);
        }
    }

    public final void LJI(InterfaceC1479620obg interfaceC1479620obg) {
        LIZLLL();
        getPlayer().LJ(interfaceC1479620obg);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("current_video_id: ");
        sbLIZ.append(this.LLJJIJIL);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        String str = this.LLJJ;
        if (str == null) {
            str = "";
        }
        String str2 = this.LLJJIII;
        if (str2 == null) {
            str2 = "";
        }
        C1488800oqU.LIZ("play_real", strLIZIZ, null, str, str2, 4);
    }

    public final void setEnterFrom(String str) {
        this.LLJJI = str;
    }

    public final void setLoop(boolean z) {
        this.LLJILJIL = z;
    }

    public final void setMuted(boolean z) {
        C1479570obb c1479570obbLIZLLL;
        this.LLJIJIL = z;
        InterfaceC1479620obg interfaceC1479620obg = this.LLJILJILJ;
        if (interfaceC1479620obg != null && (c1479570obbLIZLLL = interfaceC1479620obg.LIZLLL()) != null) {
            c1479570obbLIZLLL.LJJ = z;
        }
        if (z) {
            getPlayer().LJIILIIL().mute();
        } else {
            getPlayer().LJIILIIL().unmute();
        }
    }

    public final void setObjectFit(String str) {
        this.LLJI = str;
    }

    public final void setStartTimeMs(long j) {
        this.LLJJIJI = j;
    }

    public final void setStatusChangeListener(InterfaceC1488770oqR interfaceC1488770oqR) {
        this.LLJILLL = interfaceC1488770oqR;
    }

    public final void setTag(String str) {
        this.LLJJ = str;
    }

    public final void setUseTextureViewDirectly(boolean z) {
        this.LLILZ = z;
    }

    public final void setVodSceneTag(String str) {
        this.LLJJIII = str;
    }

    public final void LJFF(VideoInfo videoInfo, boolean z) {
        Integer numValueOf;
        Integer numValueOf2;
        long j = this.LLJJIJI;
        this.LLJJIJI = 0L;
        String str = videoInfo.videoId;
        Video video = videoInfo.video;
        Integer numValueOf3 = null;
        if (video != null) {
            numValueOf = Integer.valueOf(video.getDuration());
        } else {
            numValueOf = null;
        }
        Video video2 = videoInfo.video;
        if (video2 != null) {
            numValueOf2 = Integer.valueOf(video2.getWidth());
        } else {
            numValueOf2 = null;
        }
        Video video3 = videoInfo.video;
        if (video3 != null) {
            numValueOf3 = Integer.valueOf(video3.getHeight());
        }
        LJII(str, numValueOf, numValueOf2, numValueOf3, z, new AwS44S0200100_23(this, videoInfo, j, 1));
    }

    public final void LJIIIIZZ(int i, int i2) {
        if (i != 0 && i2 != 0) {
            if (Intrinsics.LJFF(this.LLJI, "cover")) {
                C425050Glb.LJ(getContext(), this, i, i2, 3);
            } else {
                C425050Glb.LJ(getContext(), this, i, i2, 2);
            }
        }
    }

    public final void LJIIJ(int i, int i2) {
        if (i != this.LLILZIL && i > 0) {
            this.LLILZIL = i;
        }
        if (i2 != this.LLILZLL && i2 > 0) {
            this.LLILZLL = i2;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0N0o] */
    /* JADX WARN: Type inference failed for: r0v8, types: [X.0oqQ] */
    public C1488750oqP(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        this.LL = new InterfaceC585470Mxl() { // from class: X.0N0o
            @Override // X.InterfaceC585470Mxl
            public final boolean LIZ() {
                return true;
            }

            @Override // X.InterfaceC585470Mxl
            public final boolean LIZIZ() {
                return true;
            }

            @Override // X.InterfaceC585470Mxl
            public final boolean LIZJ() {
                return true;
            }

            @Override // X.InterfaceC585470Mxl
            public final /* synthetic */ HashMap LJ(String str) {
                return null;
            }

            @Override // X.InterfaceC585470Mxl
            public final /* synthetic */ HashMap LJFF(String str) {
                return null;
            }

            @Override // X.InterfaceC585470Mxl
            public final boolean LJI() {
                return true;
            }

            @Override // X.InterfaceC585470Mxl
            public final boolean LJII() {
                return true;
            }

            @Override // X.InterfaceC585470Mxl
            public final boolean LJIIIIZZ() {
                return true;
            }

            @Override // X.InterfaceC585470Mxl
            public final boolean LJIIIZ() {
                return true;
            }

            @Override // X.InterfaceC585470Mxl
            public final /* synthetic */ HashMap LJIIJ(String str, boolean z) {
                return null;
            }

            @Override // X.InterfaceC585470Mxl
            public final /* synthetic */ HashMap LJIIL(String str, JSONObject jSONObject) {
                return null;
            }

            @Override // X.InterfaceC585470Mxl
            public final boolean LJIILIIL() {
                return true;
            }

            @Override // X.InterfaceC585470Mxl
            public final boolean LJIILJJIL() {
                return true;
            }

            @Override // X.InterfaceC585470Mxl
            public final /* synthetic */ HashMap LJIILL(String str) {
                return null;
            }

            @Override // X.InterfaceC585470Mxl
            public final boolean LJIILLIIL() {
                return true;
            }

            @Override // X.InterfaceC585470Mxl
            public final /* synthetic */ HashMap LJIIZILJ(String str, boolean z) {
                return null;
            }

            @Override // X.InterfaceC585470Mxl
            public final EnumC585580Mxw LIZLLL() {
                return EnumC585580Mxw.DEFAULT;
            }

            @Override // X.InterfaceC585470Mxl
            public final EnumC1987207qQ LJIIJJI() {
                return EnumC1987207qQ.VIDEO;
            }
        };
        this.LLILLJJLI = C452501pT.LIZIZ(new AwS567S0100000_23(this, 87));
        this.LLILLL = C452501pT.LIZIZ(new AwS567S0100000_23(this, 86));
        this.LLILZ = true;
        this.LLJ = new InterfaceC1482530ogN() { // from class: X.0oqQ
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
            public final /* synthetic */ void onBufferedPercent(String str, long j, int i2) {
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
            public final /* synthetic */ void onFrameAboutToBeRendered(int i2, long j, long j2, Map map) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onLiveRenderFirstFrame(String str, C1480420ocy c1480420ocy) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onLoopPlay(String str, int i2) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onMaskInfoCallback(String str, C1480290ocl c1480290ocl) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onPausePlay(String str, C1480430ocz c1480430ocz) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onPlayCompletedFirstTime(String str, C1480430ocz c1480430ocz) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onPlayPrepare(String str) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onPlayRelease(String str) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onPlayerInternalEvent(String str, int i2, JSONObject jSONObject) {
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
            public final /* synthetic */ void onRetryOnError(String str, C1481290oeN c1481290oeN) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onSeekEnd(String str, boolean z) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onSeekStart(String str, int i2, float f) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onSpeedChanged(String str, float f) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onStopPlay(String str) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onVideoBitrateChanged(String str, EnumC2281141EQm enumC2281141EQm, int i2) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onVideoSecondFrame(String str) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void tc(String str, JSONObject jSONObject) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void uv(JSONObject jSONObject) {
            }

            @Override // X.InterfaceC1482530ogN
            public final void onPlayPause(String str) {
                this.LL.LIZJ("pause");
            }

            @Override // X.InterfaceC1482530ogN
            public final void onPlayPrepared(String str) {
                this.LL.LIZJ("prepared");
            }

            @Override // X.InterfaceC1482530ogN
            public final void onPlayCompleted(String str, int i2) {
                this.LL.LIZJ("ended");
            }

            @Override // X.InterfaceC1482530ogN
            public final void onPlaying(String str, C1480430ocz c1480430ocz) {
                this.LL.LIZJ("play");
            }

            @Override // X.InterfaceC1482530ogN
            public final void onRenderFirstFrame(String str, C1480420ocy c1480420ocy) {
                C1488750oqP c1488750oqP = this.LL;
                c1488750oqP.LJIIIIZZ(c1488750oqP.LLILZIL, c1488750oqP.LLILZLL);
                C1488750oqP c1488750oqP2 = this.LL;
                if (c1488750oqP2.LLJIJIL) {
                    c1488750oqP2.getPlayer().LJIILIIL().mute();
                } else {
                    c1488750oqP2.getPlayer().LJIILIIL().unmute();
                }
                this.LL.LIZJ("first_frame");
            }

            @Override // X.InterfaceC1482530ogN
            public final void onResumePlay(String str, C1480430ocz c1480430ocz) {
                this.LL.LIZJ("resume");
            }

            @Override // X.InterfaceC1482530ogN
            public final void onBuffering(String str, boolean z, C1480430ocz c1480430ocz) {
                String str2;
                C1488750oqP c1488750oqP = this.LL;
                if (z) {
                    str2 = "loading_start";
                } else {
                    str2 = "loading_end";
                }
                c1488750oqP.LIZJ(str2);
            }

            @Override // X.InterfaceC1482530ogN
            public final void onPlayFailed(String str, C1481290oeN c1481290oeN, C1480430ocz c1480430ocz) {
                String strLJIIIIZZ;
                C1488750oqP c1488750oqP = this.LL;
                if (c1481290oeN == null || (strLJIIIIZZ = C1741890vQh.LJIIIIZZ(c1481290oeN)) == null) {
                    strLJIIIIZZ = "unknown_error";
                }
                InterfaceC1488770oqR interfaceC1488770oqR = c1488750oqP.LLJILLL;
                if (interfaceC1488770oqR != null) {
                    interfaceC1488770oqR.onError(strLJIIIIZZ);
                }
            }

            @Override // X.InterfaceC1482530ogN
            public final void onPlayProgressChange(String str, long j, long j2) {
                InterfaceC1488770oqR interfaceC1488770oqR = this.LL.LLJILLL;
                if (interfaceC1488770oqR != null) {
                    interfaceC1488770oqR.LIZ(j / 1000.0f);
                }
            }

            @Override // X.InterfaceC1482530ogN
            public final void onPlayStop(String str, JSONObject jSONObject, C1480430ocz c1480430ocz) {
                this.LL.LIZJ("stop");
            }

            @Override // X.InterfaceC1482530ogN
            public final void onVideoSizeChanged(String str, int i2, int i3) {
                this.LL.LJIIJ(i2, i3);
                C1488750oqP c1488750oqP = this.LL;
                c1488750oqP.LJIIIIZZ(c1488750oqP.LLILZIL, c1488750oqP.LLILZLL);
            }
        };
        this.LLJI = "contain";
    }

    public final C1482560ogQ LIZ(VideoInfo videoInfo, long j, OnPreRenderListener onPreRenderListener) {
        try {
            return C1484730ojv.LIZ(videoInfo, this.LLJIJIL, this.LLJILJIL, this.LLJJ, this.LLJJI, this.LLJJIII, j, onPreRenderListener);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("current_video_id: ");
            sbLIZ.append(this.LLJJIJIL);
            sbLIZ.append(", error:");
            sbLIZ.append(Unit.LIZ);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            String str = this.LLJJ;
            String str2 = "";
            if (str == null) {
                str = "";
            }
            String str3 = this.LLJJIII;
            if (str3 != null) {
                str2 = str3;
            }
            C1488800oqU.LIZ("play_request_create_failed", strLIZIZ, null, str, str2, 4);
            return null;
        }
    }

    public final void LJII(String str, Integer num, Integer num2, Integer num3, boolean z, Function0<? extends InterfaceC1479620obg> function0) {
        float fIntValue;
        int iIntValue;
        if (Intrinsics.LJFF(this.LLJJIJIL, str) && !z) {
            LJIIIZ();
            return;
        }
        if (num != null) {
            fIntValue = num.intValue();
        } else {
            fIntValue = 0.0f;
        }
        this.LLJJIJIIJIL = fIntValue / 1000.0f;
        this.LLJJIJIL = str;
        InterfaceC1479620obg interfaceC1479620obgInvoke = function0.invoke();
        this.LLJILJILJ = interfaceC1479620obgInvoke;
        if (interfaceC1479620obgInvoke == null) {
            return;
        }
        int iIntValue2 = 0;
        if (num2 != null) {
            iIntValue = num2.intValue();
        } else {
            iIntValue = 0;
        }
        if (num3 != null) {
            iIntValue2 = num3.intValue();
        }
        LJIIJ(iIntValue, iIntValue2);
        LJI(interfaceC1479620obgInvoke);
    }
}
