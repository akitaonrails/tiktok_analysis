package X;

import android.view.Surface;
import android.widget.FrameLayout;
import com.bytedance.ies.ugc.aweme.rich.model.feed.model.Video;
import com.bytedance.ies.ugc.aweme.rich.model.feed.model.VideoUrlModel;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS204S0000000_16;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0cxp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1032070cxp implements InterfaceC1032290cyB, InterfaceC1483820oiS, InterfaceC1482530ogN {
    public InterfaceC1032090cxr LL;
    public InterfaceC1032080cxq LLILLJJLI;
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(24));

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

    @Override // X.InterfaceC1483820oiS
    public final /* synthetic */ boolean bn() {
        return true;
    }

    @Override // X.InterfaceC1032290cyB
    public final void destroy() {
        this.LL = null;
        this.LLILLJJLI = null;
        LJI().stop();
        LJI().release();
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

    @Override // X.InterfaceC1483820oiS
    public final /* synthetic */ void pe() {
    }

    @Override // X.InterfaceC1482530ogN
    public final /* synthetic */ void tc(String str, JSONObject jSONObject) {
    }

    @Override // X.InterfaceC1482530ogN
    public final /* synthetic */ void uv(JSONObject jSONObject) {
    }

    public final InterfaceC1484830ok5 LJI() {
        return (InterfaceC1484830ok5) this.LLILLL.getValue();
    }

    @Override // X.InterfaceC1483820oiS
    public final HashMap getParams() {
        return new HashMap();
    }

    @Override // X.InterfaceC1483820oiS
    public final FrameLayout getPlayViewContainer() {
        InterfaceC1032090cxr interfaceC1032090cxr = this.LL;
        if (interfaceC1032090cxr != null) {
            return interfaceC1032090cxr.getPlayViewContainer();
        }
        return null;
    }

    @Override // X.InterfaceC1032290cyB
    public final void LJ() {
        LJI().LJIIJJI(this);
    }

    @Override // X.InterfaceC1032290cyB
    public final void LJIILLIIL() {
        LJI().resume();
    }

    @Override // X.InterfaceC1032290cyB
    public final long getCurrentPosition() {
        return LJI().LJIIIZ().getCurrentPosition();
    }

    @Override // X.InterfaceC1032290cyB
    public final long getDuration() {
        return LJI().LJIIIZ().getDuration();
    }

    @Override // X.InterfaceC1032290cyB
    public final boolean isPlaying() {
        return LJI().getPlayState().isPlaying();
    }

    @Override // X.InterfaceC1032290cyB
    public final void pausePlay() {
        LJI().pause();
    }

    @Override // X.InterfaceC1032290cyB
    public final void LIZ(InterfaceC1032090cxr interfaceC1032090cxr) {
        this.LL = interfaceC1032090cxr;
        LJI().LIZJ(this);
    }

    @Override // X.InterfaceC1032290cyB
    public final void LIZJ(InterfaceC1032080cxq interfaceC1032080cxq) {
        this.LLILLJJLI = interfaceC1032080cxq;
        LJI().LJIILLIIL(this);
    }

    public static C1482560ogQ LJFF(String str, Video video) {
        VideoUrlModel playAddr;
        C1482580ogS c1482580ogS = new C1482580ogS();
        if (str == null) {
            str = "";
        }
        c1482580ogS.LIZ = str;
        if (video != null && (playAddr = video.getPlayAddr()) != null) {
            boolean zIsBytevc1 = playAddr.isBytevc1();
            C1058540deW c1058540deW = new C1058540deW(c1482580ogS);
            c1058540deW.LIZJ = zIsBytevc1 ? 1 : 0;
            c1058540deW.LJ = playAddr.getSize();
            c1058540deW.LIZIZ = playAddr.getUrlKey();
            c1058540deW.LIZLLL = playAddr.getUrlList();
            c1482580ogS = c1058540deW.LIZ();
        }
        c1482580ogS.getClass();
        return new C1484680ojq(c1482580ogS).LIZ();
    }

    @Override // X.InterfaceC1032290cyB
    public final void LIZIZ(String str, Video video) {
        LJI().LJ(LJFF(str, video));
    }

    @Override // X.InterfaceC1482530ogN
    public final void onPausePlay(String str, C1480430ocz c1480430ocz) {
        InterfaceC1032080cxq interfaceC1032080cxq = this.LLILLJJLI;
        if (interfaceC1032080cxq != null) {
            interfaceC1032080cxq.LLIIII();
        }
    }

    @Override // X.InterfaceC1482530ogN
    public final void onPlayCompleted(String str, int i) {
        InterfaceC1032080cxq interfaceC1032080cxq = this.LLILLJJLI;
        if (interfaceC1032080cxq != null) {
            interfaceC1032080cxq.onPlayCompleted(str, i);
        }
    }

    @Override // X.InterfaceC1482530ogN
    public final void onRenderFirstFrame(String str, C1480420ocy c1480420ocy) {
        InterfaceC1032080cxq interfaceC1032080cxq = this.LLILLJJLI;
        if (interfaceC1032080cxq != null) {
            interfaceC1032080cxq.LJII();
        }
    }

    @Override // X.InterfaceC1482530ogN
    public final void onResumePlay(String str, C1480430ocz c1480430ocz) {
        InterfaceC1032080cxq interfaceC1032080cxq = this.LLILLJJLI;
        if (interfaceC1032080cxq != null) {
            interfaceC1032080cxq.LJJJJJL();
        }
    }

    @Override // X.InterfaceC1032290cyB
    public final void LIZLLL(String str, Video video, int i) {
        C1482560ogQ c1482560ogQLJFF = LJFF(str, video);
        C582130MsN.LIZ().LJ().getClass();
        C1014030cUj.LIZ.LJIILLIIL(i, Collections.singletonList(c1482560ogQLJFF));
    }

    @Override // X.InterfaceC1482530ogN
    public final void onPlayFailed(String str, C1481290oeN c1481290oeN, C1480430ocz c1480430ocz) {
        String string;
        InterfaceC1032080cxq interfaceC1032080cxq = this.LLILLJJLI;
        if (interfaceC1032080cxq != null) {
            if (c1481290oeN != null) {
                string = Integer.valueOf(c1481290oeN.LJ).toString();
            } else {
                string = null;
            }
            interfaceC1032080cxq.LJLLI(string);
        }
    }

    @Override // X.InterfaceC1482530ogN
    public final void onPlayProgressChange(String str, long j, long j2) {
        InterfaceC1032080cxq interfaceC1032080cxq = this.LLILLJJLI;
        if (interfaceC1032080cxq != null) {
            interfaceC1032080cxq.onPlayProgressChange(str, j, j2);
        }
    }
}
