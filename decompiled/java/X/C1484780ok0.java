package X;

import android.view.Surface;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS567S0100000_23;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0ok0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1484780ok0 implements InterfaceC1271360jBm {
    public boolean LL;
    public InterfaceC1271370jBn LLILLJJLI;
    public InterfaceC1484830ok5 LLILLL;
    public Surface LLILZIL;
    public String LLILZLL;
    public final C1484790ok1 LLIZLLLIL;
    public final C1280380jQK LLILZ = new C1280380jQK();
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS567S0100000_23(this, 49));

    @Override // X.InterfaceC1271360jBm
    public final void release() {
        this.LL = false;
        InterfaceC1484830ok5 interfaceC1484830ok5 = this.LLILLL;
        if (interfaceC1484830ok5 != null) {
            interfaceC1484830ok5.LJJIIZ(this.LLIZLLLIL);
        }
        InterfaceC1484830ok5 interfaceC1484830ok52 = this.LLILLL;
        if (interfaceC1484830ok52 != null) {
            interfaceC1484830ok52.stop();
            interfaceC1484830ok52.release();
        }
        this.LLILLL = null;
        this.LLILZIL = null;
        this.LLILLJJLI = null;
    }

    @Override // X.InterfaceC1271360jBm
    public final void stop() {
        InterfaceC1484830ok5 interfaceC1484830ok5 = this.LLILLL;
        if (interfaceC1484830ok5 != null) {
            interfaceC1484830ok5.stop();
        }
        this.LL = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.0ogN, X.0ok1] */
    public C1484780ok0() {
        ?? r2 = new InterfaceC1482530ogN() { // from class: X.0ok1
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
            public final /* synthetic */ void onBuffering(String str, boolean z, C1480430ocz c1480430ocz) {
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
            public final /* synthetic */ void onPausePlay(String str, C1480430ocz c1480430ocz) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onPlayCompletedFirstTime(String str, C1480430ocz c1480430ocz) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onPlayFailed(String str, C1481290oeN c1481290oeN, C1480430ocz c1480430ocz) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onPlayPause(String str) {
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
            public final /* synthetic */ void onRenderFirstFrame(String str, C1480420ocy c1480420ocy) {
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
            public final /* synthetic */ void onStopPlay(String str) {
            }

            @Override // X.InterfaceC1482530ogN
            public final /* synthetic */ void onVideoBitrateChanged(String str, EnumC2281141EQm enumC2281141EQm, int i) {
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
            public final void onPlayPrepare(String str) {
                InterfaceC1271370jBn interfaceC1271370jBn = this.LL.LLILLJJLI;
                if (interfaceC1271370jBn != null) {
                    interfaceC1271370jBn.onPrepared();
                }
            }

            @Override // X.InterfaceC1482530ogN
            public final void onPlayCompleted(String str, int i) {
                InterfaceC1271370jBn interfaceC1271370jBn = this.LL.LLILLJJLI;
                if (interfaceC1271370jBn != null) {
                    interfaceC1271370jBn.onCompletion();
                }
            }

            @Override // X.InterfaceC1482530ogN
            public final void onPlaying(String str, C1480430ocz c1480430ocz) {
                InterfaceC1271370jBn interfaceC1271370jBn = this.LL.LLILLJJLI;
                if (interfaceC1271370jBn != null) {
                    interfaceC1271370jBn.LJJZ();
                }
            }

            @Override // X.InterfaceC1482530ogN
            public final void onPlayProgressChange(String str, long j, long j2) {
                InterfaceC1271370jBn interfaceC1271370jBn = this.LL.LLILLJJLI;
                if (interfaceC1271370jBn != null) {
                    interfaceC1271370jBn.LIZ(j, j2);
                }
            }

            @Override // X.InterfaceC1482530ogN
            public final void onVideoSizeChanged(String str, int i, int i2) {
                InterfaceC1271370jBn interfaceC1271370jBn = this.LL.LLILLJJLI;
                if (interfaceC1271370jBn != null) {
                    interfaceC1271370jBn.onVideoSizeChanged(i, i2);
                }
            }
        };
        this.LLIZLLLIL = r2;
        C1478410oZj c1478410oZj = new C1478410oZj();
        c1478410oZj.LIZIZ = true;
        InterfaceC1484830ok5 interfaceC1484830ok5LIZJ = C582130MsN.LIZ().LIZJ(c1478410oZj);
        if (interfaceC1484830ok5LIZJ != 0) {
            interfaceC1484830ok5LIZJ.LJIIZILJ(r2);
        }
        this.LLILLL = interfaceC1484830ok5LIZJ;
    }

    @Override // X.InterfaceC1271360jBm
    public final void LIZIZ(C1271320jBi c1271320jBi) {
        this.LLILLJJLI = c1271320jBi;
        this.LLILZ.LIZJ = c1271320jBi;
    }

    @Override // X.InterfaceC1271360jBm
    public final void setDataSource(String str) {
        this.LLILZLL = str;
    }

    @Override // X.InterfaceC1271360jBm
    public final void setSurface(Surface surface) {
        this.LLILZIL = surface;
        InterfaceC1484830ok5 interfaceC1484830ok5 = this.LLILLL;
        if (interfaceC1484830ok5 != null) {
            interfaceC1484830ok5.LIZJ((C1484800ok2) this.LLIZ.getValue());
        }
    }

    @Override // X.InterfaceC1271360jBm
    public final void start(int i) {
        if (!this.LL) {
            C1479570obb c1479570obb = new C1479570obb();
            c1479570obb.LJJIIZ = "mp4";
            c1479570obb.LJIL = this.LLILZ;
            c1479570obb.LJIJJLI = true;
            c1479570obb.LJIIIZ = i;
            int iHashCode = 0;
            c1479570obb.LIZIZ = false;
            C1482570ogR c1482570ogR = new C1482570ogR(c1479570obb);
            C1482580ogS c1482580ogS = new C1482580ogS();
            String str = this.LLILZLL;
            if (str != null) {
                iHashCode = str.hashCode();
            }
            c1482580ogS.LIZ = String.valueOf(iHashCode);
            C1058540deW c1058540deW = new C1058540deW(c1482580ogS);
            c1058540deW.LIZLLL = Collections.singletonList(this.LLILZLL);
            c1058540deW.LIZ();
            c1482580ogS.LJ = c1482570ogR;
            C1482560ogQ c1482560ogQLIZ = new C1484680ojq(c1482580ogS).LIZ();
            InterfaceC1484830ok5 interfaceC1484830ok5 = this.LLILLL;
            if (interfaceC1484830ok5 != null) {
                interfaceC1484830ok5.LJ(c1482560ogQLIZ);
            }
            this.LL = true;
        }
    }
}
