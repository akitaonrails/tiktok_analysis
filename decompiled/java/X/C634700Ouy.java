package X;

import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Ouy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C634700Ouy implements InterfaceC487810JBb {
    public InterfaceC583690Mut LIZ;
    public String LIZIZ = "";
    public List<String> LIZJ = C13BV.INSTANCE;
    public C1483410ohn LIZLLL;

    public final C0N0Y LIZJ() {
        if (this.LIZLLL == null) {
            C1483410ohn c1483410ohn = new C1483410ohn();
            c1483410ohn.LJJIJ(new OnUIPlayListener() { // from class: X.0Mus
                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final /* synthetic */ OnUIPlayListener getWrapperedListener() {
                    return C583620Mum.LIZ(this);
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final /* synthetic */ void onBrightnessChanged(String str, float f) {
                    C583620Mum.LIZIZ(this, str, f);
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final void onBufferedPercent(String str, long j, int i) {
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final /* synthetic */ void onBufferedTimeMs(String str, long j) {
                    C583620Mum.LIZLLL(this, str, j);
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final /* synthetic */ void onBuffering(String str, boolean z) {
                    C583620Mum.LJ(this, str, z);
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final /* synthetic */ void onBuffering(String str, boolean z, C1480430ocz c1480430ocz) {
                    C583620Mum.LJFF(this, str, z, c1480430ocz);
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final /* synthetic */ void onBuffering(boolean z) {
                    C583620Mum.LJI(this, z);
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final /* synthetic */ void onCompleteLoaded(String str, boolean z) {
                    C583620Mum.LJII(this, str, z);
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final /* synthetic */ void onCrosstalkHappened(String str) {
                    C583620Mum.LJIIIIZZ(this, str);
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final /* synthetic */ void onCrosstalkHappened(String str, List list) {
                    C583620Mum.LJIIIZ(this, str, list);
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final /* synthetic */ void onDecoderBuffering(String str, boolean z) {
                    C583620Mum.LJIIJ(this, str, z);
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final /* synthetic */ void onDecoderBuffering(String str, boolean z, C1480430ocz c1480430ocz) {
                    C583620Mum.LJIIJJI(this, str, z, c1480430ocz);
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final /* synthetic */ void onDecoderBuffering(boolean z) {
                    C583620Mum.LJIIL(this, z);
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final /* synthetic */ void onFrameAboutToBeRendered(int i, long j, long j2, Map map) {
                    C583620Mum.LJIILIIL(this, i, j, j2, map);
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final /* synthetic */ void onLiveRenderFirstFrame(String str, C1480420ocy c1480420ocy) {
                    C583620Mum.LJIILJJIL(this, str, c1480420ocy);
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final /* synthetic */ void onLoopPlay(String str, int i) {
                    C583620Mum.LJIILL(this, str, i);
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final /* synthetic */ void onMaskInfoCallback(String str, C1480290ocl c1480290ocl) {
                    C583620Mum.LJIILLIIL(this, str, c1480290ocl);
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final /* synthetic */ void onPausePlay(String str, C1480430ocz c1480430ocz) {
                    C583620Mum.LJIJ(this, str, c1480430ocz);
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final void onPlayCompleted(String str, int i) {
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final void onPlayCompletedFirstTime(String str) {
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final /* synthetic */ void onPlayCompletedFirstTime(String str, C1480430ocz c1480430ocz) {
                    C583620Mum.LJIL(this, str, c1480430ocz);
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final /* synthetic */ void onPlayFailed(C1481290oeN c1481290oeN) {
                    C583620Mum.LJJIFFI(this, c1481290oeN);
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final /* synthetic */ void onPlayFailed(String str, C1481290oeN c1481290oeN, C1480430ocz c1480430ocz) {
                    C583620Mum.LJJI(this, str, c1481290oeN, c1480430ocz);
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final /* synthetic */ void onPlayPause(String str) {
                    C583620Mum.LJJII(this, str);
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final void onPlayPrepare(String str) {
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final /* synthetic */ void onPlayPrepared(String str) {
                    C583620Mum.LJJIIJ(this, str);
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final /* synthetic */ void onPlayProgressChange(float f) {
                    C583620Mum.LJJIIJZLJL(this, f);
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final void onPlayProgressChange(String str, long j, long j2) {
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final /* synthetic */ void onPlayRelease(String str) {
                    C583620Mum.LJJIIZI(this, str);
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final /* synthetic */ void onPlayStop(String str, JSONObject jSONObject) {
                    C583620Mum.LJJIJIIJI(this, str, jSONObject);
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final /* synthetic */ void onPlayStop(String str, JSONObject jSONObject, C1480430ocz c1480430ocz) {
                    C583620Mum.LJJIJIIJIL(this, str, jSONObject, c1480430ocz);
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final /* synthetic */ void onPlayStop(String str, boolean z) {
                    C583620Mum.LJJIJIL(this, str, z);
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final /* synthetic */ void onPlayerInternalEvent(String str, int i, JSONObject jSONObject) {
                    C583620Mum.LJJIJL(this, str, i, jSONObject);
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final /* synthetic */ void onPlaying(String str) {
                    C583620Mum.LJJIJLIJ(this, str);
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final /* synthetic */ void onPlaying(String str, C1480430ocz c1480430ocz) {
                    C583620Mum.LJJIL(this, str, c1480430ocz);
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final /* synthetic */ void onPreRenderSessionMissed(String str) {
                    C583620Mum.LJJIZ(this, str);
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final void onPreparePlay(String str) {
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final /* synthetic */ void onPreparePlay(String str, C1480430ocz c1480430ocz) {
                    C583620Mum.LJJJI(this, str, c1480430ocz);
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final /* synthetic */ void onRenderFirstFrame(C1480420ocy c1480420ocy) {
                    C583620Mum.LJJJJ(this, c1480420ocy);
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final /* synthetic */ void onRenderFirstFrameFromResume(String str) {
                    C583620Mum.LJJJJI(this, str);
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final /* synthetic */ void onRenderReady(C1480430ocz c1480430ocz) {
                    C583620Mum.LJJJJIZL(this, c1480430ocz);
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final void onResumePlay(String str) {
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final /* synthetic */ void onResumePlay(String str, C1480430ocz c1480430ocz) {
                    C583620Mum.LJJJJJL(this, str, c1480430ocz);
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final /* synthetic */ void onRetryOnError(C1481290oeN c1481290oeN) {
                    C583620Mum.LJJJJLI(this, c1481290oeN);
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final /* synthetic */ void onRetryOnError(String str, C1481290oeN c1481290oeN) {
                    C583620Mum.LJJJJL(this, str, c1481290oeN);
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final void onSeekEnd(String str, boolean z) {
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final /* synthetic */ void onSeekStart(String str, int i, float f) {
                    C583620Mum.LJJJJZ(this, str, i, f);
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final /* synthetic */ void onSpeedChanged(String str, float f) {
                    C583620Mum.LJJJJZI(this, str, f);
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final /* synthetic */ void onStopPlay(String str) {
                    C583620Mum.LJJJLIIL(this, str);
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final /* synthetic */ void onVideoBitrateChanged(String str, EnumC2281141EQm enumC2281141EQm, int i) {
                    C583620Mum.LJJJLL(this, str, enumC2281141EQm, i);
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final /* synthetic */ void onVideoSecondFrame(String str) {
                    C583620Mum.LJJJLZIJ(this, str);
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final /* synthetic */ void onVideoSizeChanged(String str, int i, int i2) {
                    C583620Mum.LJJJZ(this, str, i, i2);
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final void onPausePlay(String str) {
                    InterfaceC583690Mut interfaceC583690Mut = this.LL.LIZ;
                    if (interfaceC583690Mut != null) {
                        interfaceC583690Mut.Od0();
                    }
                    C0N0Y c0n0yLIZJ = this.LL.LIZJ();
                    if (c0n0yLIZJ != null) {
                        c0n0yLIZJ.LJJIIZI();
                    }
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final void onPlayCompleted(String str) {
                    InterfaceC583690Mut interfaceC583690Mut = this.LL.LIZ;
                    if (interfaceC583690Mut != null) {
                        interfaceC583690Mut.Od0();
                    }
                    C0N0Y c0n0yLIZJ = this.LL.LIZJ();
                    if (c0n0yLIZJ != null) {
                        c0n0yLIZJ.LJJIIZI();
                    }
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final void onPlayStop(String str) {
                    InterfaceC583690Mut interfaceC583690Mut = this.LL.LIZ;
                    if (interfaceC583690Mut != null) {
                        interfaceC583690Mut.Od0();
                    }
                    C0N0Y c0n0yLIZJ = this.LL.LIZJ();
                    if (c0n0yLIZJ != null) {
                        c0n0yLIZJ.LJJIIZI();
                    }
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final void onPlayFailed(String str, C1481290oeN c1481290oeN) {
                    InterfaceC583690Mut interfaceC583690Mut = this.LL.LIZ;
                    if (interfaceC583690Mut != null) {
                        interfaceC583690Mut.Z7();
                    }
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final void onRenderFirstFrame(String str, C1480420ocy c1480420ocy) {
                    C583620Mum.LJJJIL(this, str, c1480420ocy);
                    InterfaceC583690Mut interfaceC583690Mut = this.LL.LIZ;
                    if (interfaceC583690Mut != null) {
                        interfaceC583690Mut.LJLIIIL();
                    }
                    C0N0Y c0n0yLIZJ = this.LL.LIZJ();
                    if (c0n0yLIZJ != null) {
                        c0n0yLIZJ.LJJIJIIJI(60);
                    }
                }
            });
            this.LIZLLL = c1483410ohn;
        }
        return this.LIZLLL;
    }

    @Override // X.InterfaceC487810JBb
    public final void play() {
        SimVideoUrlModel simVideoUrlModel = new SimVideoUrlModel();
        VideoUrlModel videoUrlModel = new VideoUrlModel();
        videoUrlModel.setUrlKey(this.LIZIZ);
        videoUrlModel.setSourceId(this.LIZIZ);
        videoUrlModel.setUrlList(this.LIZJ);
        simVideoUrlModel.origin = videoUrlModel;
        simVideoUrlModel.setUrlKey(this.LIZIZ);
        simVideoUrlModel.setSourceId(this.LIZIZ);
        simVideoUrlModel.setUrlList(this.LIZJ);
        C1479530obX c1479530obX = new C1479530obX();
        c1479530obX.LJII = simVideoUrlModel;
        c1479530obX.LJJJLL = false;
        c1479530obX.LJIILLIIL = false;
        c1479530obX.LJIL = false;
        C0N0Y c0n0yLIZJ = LIZJ();
        if (c0n0yLIZJ != null) {
            ((C1483410ohn) c0n0yLIZJ).LJJZZIII(c1479530obX);
        }
    }

    @Override // X.InterfaceC487810JBb
    public final boolean isPlaying() {
        C0N0Y c0n0yLIZJ = LIZJ();
        if (c0n0yLIZJ != null) {
            return ((C1483410ohn) c0n0yLIZJ).isPlaying();
        }
        return false;
    }

    @Override // X.InterfaceC487810JBb
    public final void pause() {
        C0N0Y c0n0yLIZJ = LIZJ();
        if (c0n0yLIZJ != null) {
            ((C1483410ohn) c0n0yLIZJ).LJJLI(false);
        }
    }

    @Override // X.InterfaceC487810JBb
    public final void release() {
        C0N0Y c0n0yLIZJ = LIZJ();
        if (c0n0yLIZJ != null) {
            ((C1483410ohn) c0n0yLIZJ).release();
        }
        this.LIZ = null;
    }

    @Override // X.InterfaceC487810JBb
    public final void LIZIZ(InterfaceC583690Mut interfaceC583690Mut) {
        this.LIZ = interfaceC583690Mut;
    }

    @Override // X.InterfaceC487810JBb
    public final void LIZ(String str, List<String> list) {
        this.LIZIZ = str;
        this.LIZJ = list;
    }
}
