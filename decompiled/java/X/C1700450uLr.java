package X;

import android.view.Surface;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0uLr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1700450uLr extends C1700460uLs implements InterfaceC1482530ogN {
    public InterfaceC1699420uKC LLILZLL;

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
    public final /* synthetic */ void onPlayPrepare(String str) {
    }

    @Override // X.InterfaceC1482530ogN
    public final /* synthetic */ void onPlayProgressChange(String str, long j, long j2) {
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

    @Override // X.InterfaceC1482530ogN
    public final /* synthetic */ void onPlaying(String str, C1480430ocz c1480430ocz) {
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
    public final /* synthetic */ void onStopPlay(String str) {
    }

    @Override // X.InterfaceC1482530ogN
    public final /* synthetic */ void onVideoBitrateChanged(String str, EnumC2281141EQm enumC2281141EQm, int i) {
    }

    @Override // X.InterfaceC1482530ogN
    public final /* synthetic */ void onVideoSecondFrame(String str) {
    }

    @Override // X.InterfaceC1482530ogN
    public final void VK() {
        InterfaceC1700400uLm interfaceC1700400uLm = this.LLILLJJLI;
        if (interfaceC1700400uLm != null) {
            ((C1APH) interfaceC1700400uLm).LJJLIIIJJIZ();
        }
    }

    public C1700450uLr(InterfaceC1491060ou8 interfaceC1491060ou8) {
        super(interfaceC1491060ou8);
    }

    @Override // X.InterfaceC1482530ogN
    public final void Au(Surface surface) {
        LJIIIIZZ(surface);
    }

    @Override // X.InterfaceC1482530ogN
    public final void Gk1(C1284720jXK c1284720jXK) {
        LIZJ(c1284720jXK.code, c1284720jXK.playForbidden, c1284720jXK.info);
    }

    @Override // X.InterfaceC1482530ogN
    public final void LLZZLLIL(C1281010jRL c1281010jRL) {
        C1700410uLn c1700410uLn = this.LL;
        if (c1700410uLn != null) {
            c1700410uLn.LJIILJJIL(EnumC1700470uLt.NETWORK_STATE_CHANGED, 0, c1281010jRL);
        }
    }

    @Override // X.InterfaceC1482530ogN
    public final void Qe2(C1700490uLv c1700490uLv) {
        int i = c1700490uLv.LIZ;
        boolean z = true;
        if (1 == i) {
            LIZ(EnumC1700470uLt.ABR_NEW_RESOLUTION, 0, c1700490uLv.LIZIZ);
            return;
        }
        if (2 == i) {
            LIZ(EnumC1700470uLt.RESOLUTION_DEGRADE, 0, c1700490uLv.LIZIZ);
            return;
        }
        if (3 != i) {
            return;
        }
        InterfaceC1699420uKC interfaceC1699420uKC = this.LLILZLL;
        if (interfaceC1699420uKC != null) {
            if (c1700490uLv.LIZIZ == null) {
                z = false;
            }
            interfaceC1699420uKC.LIZ(z);
        }
        this.LLILZLL = null;
    }

    @Override // X.InterfaceC1482530ogN
    public final void W1(String str) {
        LIZ(EnumC1700470uLt.SEI_UPDATE, 0, str);
    }

    @Override // X.InterfaceC1482530ogN
    public final void onPlayPrepared(String str) {
        LIZ(EnumC1700470uLt.PREPARED, 0, "player is prepared");
    }

    @Override // X.InterfaceC1482530ogN
    public final void uv(JSONObject jSONObject) {
        C1700410uLn c1700410uLn = this.LL;
        if (c1700410uLn != null) {
            c1700410uLn.LJIILJJIL(EnumC1700470uLt.SEI_UPDATE, 0, jSONObject);
        }
    }

    @Override // X.InterfaceC1482530ogN
    public final void onPlayCompleted(String str, int i) {
        LIZ(EnumC1700470uLt.PLAY_COMPLETED, 0, "play complete");
    }

    @Override // X.InterfaceC1482530ogN
    public final void onRenderFirstFrame(String str, C1480420ocy c1480420ocy) {
        if (c1480420ocy != null && c1480420ocy.isFirstFrame()) {
            LJFF(true);
        } else {
            LJFF(false);
        }
    }

    @Override // X.InterfaceC1482530ogN
    public final void tc(String str, JSONObject jSONObject) {
        String strOptString;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onMonitorLogV3: event key = ");
        if (jSONObject != null) {
            strOptString = jSONObject.optString("event_key");
        } else {
            strOptString = null;
        }
        sbLIZ.append(strOptString);
        sbLIZ.append(", tag = ");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        LJII(str, jSONObject);
    }

    @Override // X.InterfaceC1482530ogN
    public final void onBuffering(String str, boolean z, C1480430ocz c1480430ocz) {
        if (z) {
            LIZ(EnumC1700470uLt.BUFFERING_START, 0, "player start buffer");
        } else {
            LIZ(EnumC1700470uLt.BUFFERING_END, 0, "player end buffer");
        }
    }

    @Override // X.InterfaceC1482530ogN
    public final void onVideoSizeChanged(String str, int i, int i2) {
        LJIIIZ(i, i2);
    }
}
