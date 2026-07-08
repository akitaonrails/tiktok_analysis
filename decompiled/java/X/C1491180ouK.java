package X;

import android.view.Surface;
import com.ss.android.ugc.aweme.music.service.IMediaPlayerManagerService;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS212S0000000_23;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0ouK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1491180ouK implements InterfaceC572870MdR {
    public final String LIZ;
    public final Function2<String, String, Unit> LIZIZ;
    public String LJFF;
    public boolean LJIIIIZZ;
    public final C01GW LIZJ = C452501pT.LIZIZ(AFwS212S0000000_23.get$arr$(155));
    public String LIZLLL = "";
    public String LJ = "";
    public float LJI = 1.0f;
    public final C01GW LJII = C452501pT.LIZIZ(AFwS212S0000000_23.get$arr$(156));

    public final InterfaceC1484830ok5 LIZ() {
        return (InterfaceC1484830ok5) this.LIZJ.getValue();
    }

    @Override // X.InterfaceC572870MdR
    public final void resume() {
        if (this.LJIIIIZZ && C0C64.LJIILLIIL().LJIIIZ(31744, "image_music_stop_resume_opt", true, true)) {
            return;
        }
        LIZ().resume();
    }

    @Override // X.InterfaceC572870MdR
    public final boolean LJII() {
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "image_music_pause_error_switch", true, true)) {
            InterfaceC1483850oiV playState = LIZ().getPlayState();
            if (playState == null || playState.getState() != 7) {
                return false;
            }
        } else if (!LIZ().getPlayState().LJJIJIIJIL()) {
            InterfaceC1483850oiV playState2 = LIZ().getPlayState();
            if (playState2 != null && playState2.getState() == 7) {
                return true;
            }
            InterfaceC1483850oiV playState3 = LIZ().getPlayState();
            return playState3 != null && playState3.getState() == 0;
        }
        return true;
    }

    @Override // X.InterfaceC572870MdR
    public final int getCurrentPosition() {
        return (int) LIZ().LJIIIZ().getCurrentPosition();
    }

    @Override // X.InterfaceC572870MdR
    public final void pause() {
        LIZ().pause();
    }

    @Override // X.InterfaceC572870MdR
    public final void release() {
        LIZ().release();
    }

    @Override // X.InterfaceC572870MdR
    public final void stop() {
        LIZ().stop();
        this.LJIIIIZZ = true;
    }

    public final void LIZIZ(C1491200ouM c1491200ouM) {
        this.LIZLLL = c1491200ouM.LIZ;
        this.LJ = c1491200ouM.LIZLLL;
        this.LJFF = c1491200ouM.LJ;
        C1482580ogS c1482580ogS = new C1482580ogS();
        String str = c1491200ouM.LIZLLL;
        if (str == null) {
            str = this.LIZ;
        }
        c1482580ogS.LIZ = str;
        C1058540deW c1058540deW = new C1058540deW(c1482580ogS);
        c1058540deW.LIZIZ = c1491200ouM.LIZLLL;
        c1058540deW.LIZIZ(c1491200ouM.LIZ);
        C1482570ogR c1482570ogRLIZ = c1058540deW.LIZ().LIZ();
        C1479570obb c1479570obb = c1482570ogRLIZ.LIZIZ;
        c1479570obb.LJJIIZ = "mp3";
        c1479570obb.LIZIZ = true;
        Integer num = c1491200ouM.LIZIZ;
        if (num != null) {
            int iIntValue = num.intValue();
            C1479570obb c1479570obb2 = c1482570ogRLIZ.LIZIZ;
            c1479570obb2.LJIIIZ = iIntValue;
            c1479570obb2.LJIIJ = iIntValue;
        }
        Integer num2 = c1491200ouM.LIZJ;
        if (num2 != null) {
            c1482570ogRLIZ.LIZIZ.LJIIJJI = num2.intValue();
        }
        C1482580ogS c1482580ogS2 = c1482570ogRLIZ.LIZ;
        c1482580ogS2.LJ = c1482570ogRLIZ;
        LIZ().LJ(new C1484680ojq(c1482580ogS2).LIZ());
        this.LJIIIIZZ = false;
    }

    @Override // X.InterfaceC572870MdR
    public final void setVolume(float f) {
        this.LJI = f;
        LIZ().LJIILIIL().LJIILLIIL(f, f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1491180ouK(String str, Function2<? super String, ? super String, Unit> function2) {
        this.LIZ = str;
        this.LIZIZ = function2;
        LIZ().LJIIZILJ(new InterfaceC1482530ogN() { // from class: X.0ouL
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
            public final /* synthetic */ void W1(String str2) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onBrightnessChanged(String str2, float f) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onBufferedPercent(String str2, long j, int i) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onBufferedTimeMs(String str2, long j) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onBuffering(String str2, boolean z, C1480430ocz c1480430ocz) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onCrosstalkHappened(String str2, List list) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onDecoderBuffering(String str2, boolean z, C1480430ocz c1480430ocz) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onFrameAboutToBeRendered(int i, long j, long j2, Map map) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onLiveRenderFirstFrame(String str2, C1480420ocy c1480420ocy) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onLoopPlay(String str2, int i) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onMaskInfoCallback(String str2, C1480290ocl c1480290ocl) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onPausePlay(String str2, C1480430ocz c1480430ocz) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onPlayCompleted(String str2, int i) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onPlayCompletedFirstTime(String str2, C1480430ocz c1480430ocz) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onPlayPause(String str2) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onPlayPrepare(String str2) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onPlayPrepared(String str2) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onPlayProgressChange(String str2, long j, long j2) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onPlayRelease(String str2) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onPlayStop(String str2, JSONObject jSONObject, C1480430ocz c1480430ocz) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onPlayerInternalEvent(String str2, int i, JSONObject jSONObject) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onPlaying(String str2, C1480430ocz c1480430ocz) {
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnPreRenderListener
            public final /* synthetic */ void onPreRenderReady(String str2) {
                C490850JMt.LIZ(this, str2);
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onPreRenderSessionMissed(String str2) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onPreparePlay(String str2, C1480430ocz c1480430ocz) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onResumePlay(String str2, C1480430ocz c1480430ocz) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onRetryOnError(String str2, C1481290oeN c1481290oeN) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onSeekEnd(String str2, boolean z) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onSeekStart(String str2, int i, float f) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onSpeedChanged(String str2, float f) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onStopPlay(String str2) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onVideoBitrateChanged(String str2, EnumC2281141EQm enumC2281141EQm, int i) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onVideoSecondFrame(String str2) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onVideoSizeChanged(String str2, int i, int i2) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void tc(String str2, JSONObject jSONObject) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void uv(JSONObject jSONObject) {
            }

            @Override // X.InterfaceC1482530ogN
            public final void onCompleteLoaded(String str2, boolean z) {
                if ((C298220BmW.LIZ() || C298120BmM.LIZ()) && str2 != null) {
                    C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1499950p8T(this.LL, str2, null), 3);
                }
            }

            @Override // X.InterfaceC1482530ogN
            public final void onRenderFirstFrame(String str2, C1480420ocy c1480420ocy) {
                C2258708t7.LIZ(EnumC1987507qT.SUCCESS_PLAY, 0, "");
                if ((C298220BmW.LIZ() || C298120BmM.LIZ()) && str2 != null) {
                    C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1499940p8S(this.LL, str2, null), 3);
                }
            }

            @Override // X.InterfaceC1482530ogN
            public final void onPlayFailed(String str2, C1481290oeN c1481290oeN, C1480430ocz c1480430ocz) {
                int i;
                String string;
                EnumC1987507qT enumC1987507qT = EnumC1987507qT.FAIL_PLAY;
                if (c1481290oeN != null) {
                    i = c1481290oeN.LJ;
                    string = c1481290oeN.toString();
                    if (string == null) {
                    }
                    C2258708t7.LIZ(enumC1987507qT, i, string);
                }
                i = 0;
                string = "";
                C2258708t7.LIZ(enumC1987507qT, i, string);
            }
        });
    }

    @Override // X.InterfaceC572870MdR
    public final void LJIIIZ(int i, int i2) {
        if (this.LIZLLL.length() == 0) {
            return;
        }
        LJIIIIZZ(this.LJI, Integer.valueOf(i), Integer.valueOf(i2), this.LJ, this.LIZLLL, this.LJFF);
    }

    public final void LIZJ(String str, float f, Integer num, Integer num2) {
        this.LJI = f;
        LIZIZ(new C1491200ouM(num, num2, str, null, null));
    }

    @Override // X.InterfaceC572870MdR
    public final void LJIIIIZZ(float f, Integer num, Integer num2, String str, String str2, String str3) {
        IMediaPlayerManagerService iMediaPlayerManagerService;
        if (str == null) {
            LIZJ(str2, f, num, num2);
            return;
        }
        C1491200ouM c1491200ouM = new C1491200ouM(num, num2, str2, str, str3);
        if (C298220BmW.LIZ() || C298120BmM.LIZ()) {
            C141Q.LIZ.getClass();
            if (C141Q.LJII(str2) && (iMediaPlayerManagerService = (IMediaPlayerManagerService) this.LJII.getValue()) != null) {
                iMediaPlayerManagerService.LIZJ(str, str2, str3);
            }
        }
        LIZIZ(c1491200ouM);
    }
}
