package X;

import android.view.Surface;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.highlight.viewmodel.LiveHighlightViewModel;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import webcast.data.MusicSong;

/* JADX INFO: renamed from: X.0opF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1488030opF {
    public static final /* synthetic */ int LJIIIIZZ = 0;
    public InterfaceC1484830ok5 LIZ;
    public MusicSong LIZIZ;
    public Long LIZJ;
    public String LIZLLL;
    public long LJ;
    public LiveHighlightViewModel LJI;
    public EnumC1487720ook LJFF = EnumC1487720ook.IDLE;
    public final C1484810ok3 LJII = new InterfaceC1482530ogN() { // from class: X.0ok3
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
        public final /* synthetic */ void onPlayCompleted(String str, int i) {
        }

        @Override // X.InterfaceC1482530ogN
        public final /* synthetic */ void onPlayCompletedFirstTime(String str, C1480430ocz c1480430ocz) {
        }

        @Override // X.InterfaceC1482530ogN
        public final /* synthetic */ void onPlayFailed(String str, C1481290oeN c1481290oeN, C1480430ocz c1480430ocz) {
        }

        @Override // X.InterfaceC1482530ogN
        public final /* synthetic */ void onPlayPrepare(String str) {
        }

        @Override // X.InterfaceC1482530ogN
        public final /* synthetic */ void onPlayPrepared(String str) {
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
        public final /* synthetic */ void onRenderFirstFrame(String str, C1480420ocy c1480420ocy) {
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
        public final /* synthetic */ void onStopPlay(String str) {
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
        public final void onPlayPause(String str) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("listener onPlayPause: ");
            sbLIZ.append(str);
            sbLIZ.append(", ");
            C20441214yg.LIZIZ("LiveHighlightMusicPlayerController", C2188811AlT.LIZIZ(sbLIZ));
        }

        @Override // X.InterfaceC1482530ogN
        public final void onPlayRelease(String str) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("listener onPlayRelease: ");
            sbLIZ.append(str);
            sbLIZ.append(',');
            C20441214yg.LIZIZ("LiveHighlightMusicPlayerController", C2188811AlT.LIZIZ(sbLIZ));
        }

        @Override // X.InterfaceC1482530ogN
        public final void onPausePlay(String str, C1480430ocz c1480430ocz) {
            Long lValueOf;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("listener onPausePlay: ");
            sbLIZ.append(str);
            sbLIZ.append(", playerEvent?.currentPosition: ");
            Long lValueOf2 = null;
            if (c1480430ocz != null) {
                lValueOf = Long.valueOf(c1480430ocz.LJIILL);
            } else {
                lValueOf = null;
            }
            sbLIZ.append(lValueOf);
            sbLIZ.append(", playerEvent?.currentTimeMillis: ");
            if (c1480430ocz != null) {
                lValueOf2 = Long.valueOf(c1480430ocz.LJFF);
            }
            sbLIZ.append(lValueOf2);
            C20441214yg.LIZIZ("LiveHighlightMusicPlayerController", C2188811AlT.LIZIZ(sbLIZ));
        }

        @Override // X.InterfaceC1482530ogN
        public final void onPlaying(String str, C1480430ocz c1480430ocz) {
            Long lValueOf;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("listener onPlaying: ");
            sbLIZ.append(str);
            sbLIZ.append(", playerEvent?.currentPosition: ");
            Long lValueOf2 = null;
            if (c1480430ocz != null) {
                lValueOf = Long.valueOf(c1480430ocz.LJIILL);
            } else {
                lValueOf = null;
            }
            sbLIZ.append(lValueOf);
            sbLIZ.append(", playerEvent?.currentTimeMillis: ");
            if (c1480430ocz != null) {
                lValueOf2 = Long.valueOf(c1480430ocz.LJFF);
            }
            sbLIZ.append(lValueOf2);
            C20441214yg.LIZIZ("LiveHighlightMusicPlayerController", C2188811AlT.LIZIZ(sbLIZ));
        }

        @Override // X.InterfaceC1482530ogN
        public final void onResumePlay(String str, C1480430ocz c1480430ocz) {
            Long lValueOf;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("listener onResumePlay: ");
            sbLIZ.append(str);
            sbLIZ.append(", playerEvent?.currentPosition: ");
            Long lValueOf2 = null;
            if (c1480430ocz != null) {
                lValueOf = Long.valueOf(c1480430ocz.LJIILL);
            } else {
                lValueOf = null;
            }
            sbLIZ.append(lValueOf);
            sbLIZ.append(", playerEvent?.currentTimeMillis: ");
            if (c1480430ocz != null) {
                lValueOf2 = Long.valueOf(c1480430ocz.LJFF);
            }
            sbLIZ.append(lValueOf2);
            C20441214yg.LIZIZ("LiveHighlightMusicPlayerController", C2188811AlT.LIZIZ(sbLIZ));
        }

        @Override // X.InterfaceC1482530ogN
        public final void onBuffering(String str, boolean z, C1480430ocz c1480430ocz) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("listener onBuffering: ");
            sbLIZ.append(str);
            sbLIZ.append(", start: ");
            sbLIZ.append(z);
            C20441214yg.LIZIZ("LiveHighlightMusicPlayerController", C2188811AlT.LIZIZ(sbLIZ));
        }

        @Override // X.InterfaceC1482530ogN
        public final void onPlayProgressChange(String str, long j, long j2) {
            this.LL.getClass();
        }

        @Override // X.InterfaceC1482530ogN
        public final void onPlayStop(String str, JSONObject jSONObject, C1480430ocz c1480430ocz) {
            Long lValueOf;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(", listener onPlayStop: ");
            sbLIZ.append(str);
            sbLIZ.append(", playerEvent?.currentPosition: ");
            Long lValueOf2 = null;
            if (c1480430ocz != null) {
                lValueOf = Long.valueOf(c1480430ocz.LJIILL);
            } else {
                lValueOf = null;
            }
            sbLIZ.append(lValueOf);
            sbLIZ.append(", playerEvent?.currentTimeMillis: ");
            if (c1480430ocz != null) {
                lValueOf2 = Long.valueOf(c1480430ocz.LJFF);
            }
            sbLIZ.append(lValueOf2);
            C20441214yg.LIZIZ("LiveHighlightMusicPlayerController", C2188811AlT.LIZIZ(sbLIZ));
        }
    };

    public final void LIZ() {
        C1834780xqW state;
        C291001Au<Integer> c291001Au;
        InterfaceC1488100opM interfaceC1488100opMLJIILIIL;
        LiveHighlightViewModel liveHighlightViewModel = this.LJI;
        if (liveHighlightViewModel == null || (state = liveHighlightViewModel.getState()) == null || (c291001Au = state.LLJJIJI) == null) {
            return;
        }
        float fIntValue = c291001Au.LIZ.intValue() / 100.0f;
        InterfaceC1484830ok5 interfaceC1484830ok5 = this.LIZ;
        if (interfaceC1484830ok5 == null || (interfaceC1488100opMLJIILIIL = interfaceC1484830ok5.LJIILIIL()) == null) {
            return;
        }
        interfaceC1488100opMLJIILIIL.LJIILLIIL(fIntValue, fIntValue);
    }

    public final boolean LIZIZ() {
        return this.LIZJ == null || this.LIZIZ == null || this.LIZLLL == null;
    }

    public static void LJIIIZ(C1488030opF c1488030opF) {
        InterfaceC1484830ok5 interfaceC1484830ok5 = c1488030opF.LIZ;
        if (interfaceC1484830ok5 != null) {
            interfaceC1484830ok5.stop();
        }
        c1488030opF.LIZLLL = null;
        c1488030opF.LIZIZ = null;
        c1488030opF.LJFF = EnumC1487720ook.IDLE;
    }

    public final void LJ(int i) {
        Long lValueOf;
        String str;
        Long l;
        if (LIZIZ()) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("play rePlay, song id: ");
        MusicSong musicSong = this.LIZIZ;
        Integer numValueOf = null;
        if (musicSong != null) {
            lValueOf = Long.valueOf(musicSong.id);
        } else {
            lValueOf = null;
        }
        sbLIZ.append(lValueOf);
        sbLIZ.append(", initialStartTime: ");
        sbLIZ.append(i);
        sbLIZ.append(", song duration: ");
        MusicSong musicSong2 = this.LIZIZ;
        if (musicSong2 != null) {
            numValueOf = Integer.valueOf(musicSong2.duration);
        }
        sbLIZ.append(numValueOf);
        C20441214yg.LIZIZ("LiveHighlightMusicPlayerController", C2188811AlT.LIZIZ(sbLIZ));
        MusicSong musicSong3 = this.LIZIZ;
        if (musicSong3 != null && (str = this.LIZLLL) != null && (l = this.LIZJ) != null) {
            long jLongValue = l.longValue();
            int i2 = musicSong3.duration;
            if (i > i2) {
                i = i2;
            }
            LIZLLL(jLongValue, musicSong3, str, Math.max(i - 1, 0));
        }
    }

    public final void LJFF(float f) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("realSeekWithProgress: ");
        sbLIZ.append(f);
        C20441214yg.LIZIZ("LiveHighlightMusicPlayerController", C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC1484830ok5 interfaceC1484830ok5 = this.LIZ;
        if (interfaceC1484830ok5 != null) {
            float fLIZLLL = 0.0f;
            if (!Float.isNaN(f)) {
                fLIZLLL = C13LZ.LIZLLL(f, 0.0f, 100.0f);
            }
            interfaceC1484830ok5.seek(fLIZLLL);
        }
    }

    public final void LJI(int i) {
        Integer numValueOf;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("realSeekWithTime: ");
        sbLIZ.append(i);
        sbLIZ.append(", duration: ");
        MusicSong musicSong = this.LIZIZ;
        if (musicSong != null) {
            numValueOf = Integer.valueOf(musicSong.duration);
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        C20441214yg.LIZIZ("LiveHighlightMusicPlayerController", C2188811AlT.LIZIZ(sbLIZ));
        if (this.LIZIZ != null) {
            LJFF((i / r0.duration) * 100);
        }
    }

    public final void LJII(String str) {
        InterfaceC1483850oiV playState;
        InterfaceC1483850oiV playState2;
        if (LIZIZ()) {
            return;
        }
        EnumC1487720ook enumC1487720ook = this.LJFF;
        EnumC1487720ook enumC1487720ook2 = EnumC1487720ook.RESUME;
        if (enumC1487720ook == enumC1487720ook2) {
            C20441214yg.LIZIZ("LiveHighlightMusicPlayerController", "Ignore resume, play resume repeat set.");
            return;
        }
        this.LJFF = enumC1487720ook2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("play resume reason: ");
        sbLIZ.append(str);
        sbLIZ.append(", state: ");
        InterfaceC1484830ok5 interfaceC1484830ok5 = this.LIZ;
        if (interfaceC1484830ok5 != null) {
            playState = interfaceC1484830ok5.getPlayState();
        } else {
            playState = null;
        }
        sbLIZ.append(playState);
        C20441214yg.LIZIZ("LiveHighlightMusicPlayerController", C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC1484830ok5 interfaceC1484830ok52 = this.LIZ;
        if (interfaceC1484830ok52 != null && (playState2 = interfaceC1484830ok52.getPlayState()) != null && playState2.LJJIJIIJIL()) {
            LJ((int) this.LJ);
        } else {
            InterfaceC1484830ok5 interfaceC1484830ok53 = this.LIZ;
            if (interfaceC1484830ok53 != null) {
                interfaceC1484830ok53.resume();
            }
            LIZ();
        }
        long j = this.LJ;
        if (j > 0) {
            LJI((int) j);
            this.LJ = 0L;
        }
    }

    public final void LIZJ(String str, boolean z) {
        EnumC1487720ook enumC1487720ook = this.LJFF;
        EnumC1487720ook enumC1487720ook2 = EnumC1487720ook.PAUSE;
        if (enumC1487720ook == enumC1487720ook2 && !z) {
            C20441214yg.LIZIZ("LiveHighlightMusicPlayerController", "Ignore pause, play pause repeat set.");
            return;
        }
        this.LJFF = enumC1487720ook2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("play pause reason: ");
        sbLIZ.append(str);
        sbLIZ.append(", force: ");
        sbLIZ.append(z);
        C20441214yg.LIZIZ("LiveHighlightMusicPlayerController", C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC1484830ok5 interfaceC1484830ok5 = this.LIZ;
        if (interfaceC1484830ok5 != null) {
            interfaceC1484830ok5.pause();
        }
    }

    public final void LJIIIIZZ(int i, String str) {
        Integer numValueOf;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("seek scene: ");
        sbLIZ.append(str);
        sbLIZ.append(", time: ");
        sbLIZ.append(i);
        sbLIZ.append(", duration: ");
        MusicSong musicSong = this.LIZIZ;
        InterfaceC1483850oiV playState = null;
        if (musicSong != null) {
            numValueOf = Integer.valueOf(musicSong.duration);
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        C20441214yg.LIZIZ("LiveHighlightMusicPlayerController", C2188811AlT.LIZIZ(sbLIZ));
        MusicSong musicSong2 = this.LIZIZ;
        if (musicSong2 != null) {
            int i2 = musicSong2.duration;
            float f = (i / i2) * 100;
            if (i <= i2) {
                i2 = i;
            }
            this.LJ = i2;
            if (f >= 100.0f) {
                LJFF(f);
                return;
            }
            InterfaceC1484830ok5 interfaceC1484830ok5 = this.LIZ;
            if (interfaceC1484830ok5 != null) {
                playState = interfaceC1484830ok5.getPlayState();
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("play playStart state: ");
            sbLIZ2.append(playState);
            C20441214yg.LIZIZ("LiveHighlightMusicPlayerController", C2188811AlT.LIZIZ(sbLIZ2));
            if (playState != null) {
                if (playState.isPlaying()) {
                    LJFF(f);
                    return;
                } else if (playState.LJJIJIIJIL()) {
                    LJ(i);
                    return;
                } else if (playState.isPaused()) {
                    LJII("");
                    LJFF(f);
                    return;
                }
            }
            LJ(i);
        }
    }

    public final void LIZLLL(long j, MusicSong musicSong, String str, int i) {
        this.LIZJ = Long.valueOf(j);
        this.LIZIZ = musicSong;
        this.LIZLLL = str;
        int i2 = musicSong.duration;
        if (i <= i2) {
            i2 = i;
        }
        int iMax = Math.max(i2 - 1, 0);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("play, music: ");
        sbLIZ.append(musicSong);
        sbLIZ.append(", musicPath: ");
        sbLIZ.append(str);
        sbLIZ.append(", initialStartTime: ");
        sbLIZ.append(i);
        sbLIZ.append(", realInitialStartTime: ");
        sbLIZ.append(iMax);
        C20441214yg.LIZIZ("LiveHighlightMusicPlayerController", C2188811AlT.LIZIZ(sbLIZ));
        C1482580ogS c1482580ogS = new C1482580ogS();
        c1482580ogS.LIZ = String.valueOf(musicSong.id);
        C1058540deW c1058540deW = new C1058540deW(c1482580ogS);
        c1058540deW.LIZIZ(str);
        c1058540deW.LIZIZ = String.valueOf(musicSong.id);
        C1482570ogR c1482570ogRLIZ = c1058540deW.LIZ().LIZ();
        c1482570ogRLIZ.LIZJ = musicSong.duration;
        C1479570obb c1479570obb = c1482570ogRLIZ.LIZIZ;
        c1479570obb.LJIIIZ = i;
        c1479570obb.LIZIZ = false;
        c1479570obb.LJJIIZ = "mp3";
        c1479570obb.LJI = true;
        C1482580ogS c1482580ogS2 = c1482570ogRLIZ.LIZ;
        c1482580ogS2.LJ = c1482570ogRLIZ;
        C1482560ogQ c1482560ogQLIZ = new C1484680ojq(c1482580ogS2).LIZ();
        InterfaceC1484830ok5 interfaceC1484830ok5 = this.LIZ;
        if (interfaceC1484830ok5 != null) {
            interfaceC1484830ok5.LJ(c1482560ogQLIZ);
        }
        LIZ();
        this.LJFF = EnumC1487720ook.IDLE;
    }
}
