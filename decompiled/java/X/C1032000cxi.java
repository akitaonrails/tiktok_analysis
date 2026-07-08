package X;

import android.content.Context;
import android.view.Surface;
import android.widget.FrameLayout;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.RewardAdModel;
import com.ss.android.ugc.aweme.feed.model.Video;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.AwS595S0100000_16;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0cxi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1032000cxi implements InterfaceC1031710cxF, InterfaceC1483820oiS, InterfaceC1482530ogN {
    public final C01GW LL = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(124));
    public FrameLayout LLILLJJLI;
    public InterfaceC1032010cxj LLILLL;
    public InterfaceC1031540cwy LLILZ;

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

    public final C1031990cxh LJ() {
        return (C1031990cxh) this.LL.getValue();
    }

    public final void LJFF() {
        RewardAdModel rewardAdModel;
        Video video;
        InterfaceC1031540cwy interfaceC1031540cwy = this.LLILZ;
        if (interfaceC1031540cwy == null || (rewardAdModel = interfaceC1031540cwy.getRewardAdModel()) == null || (video = rewardAdModel.video) == null) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("videoInfo.width = ");
        sbLIZ.append(video.getWidth());
        sbLIZ.append(",videoInfo.height = ");
        sbLIZ.append(video.getHeight());
        C2188811AlT.LIZIZ(sbLIZ);
        C989530brD.LIZ();
        C692910RFx c692910RFx = new C692910RFx();
        FrameLayout frameLayout = this.LLILLJJLI;
        if (frameLayout == null) {
            frameLayout = null;
        }
        Context context = frameLayout.getContext();
        FrameLayout frameLayout2 = this.LLILLJJLI;
        if (frameLayout2 == null) {
            frameLayout2 = null;
        }
        c692910RFx.LJIIJ(context, null, frameLayout2, video.getWidth(), video.getHeight(), null, null);
    }

    @Override // X.InterfaceC1483820oiS
    public final HashMap getParams() {
        return new HashMap();
    }

    @Override // X.InterfaceC1483820oiS
    public final FrameLayout getPlayViewContainer() {
        FrameLayout frameLayout = this.LLILLJJLI;
        if (frameLayout == null) {
            return null;
        }
        return frameLayout;
    }

    @Override // X.InterfaceC1031710cxF
    public final void LIZ() {
        C1031990cxh c1031990cxhLJ = LJ();
        c1031990cxhLJ.LIZ().stop();
        c1031990cxhLJ.LIZ().release();
    }

    @Override // X.InterfaceC1031710cxF
    public final C1031990cxh LIZIZ() {
        return LJ();
    }

    @Override // X.InterfaceC1031710cxF
    public final void onPause() {
        if (LJ().LIZLLL()) {
            LJ().LJ();
        }
    }

    @Override // X.InterfaceC1031710cxF
    public final void onResume() {
        if (LJ().LIZLLL()) {
            return;
        }
        LJ().LJFF();
    }

    @Override // X.InterfaceC1031710cxF
    public final void LIZJ(InterfaceC1032010cxj interfaceC1032010cxj) {
        this.LLILLL = interfaceC1032010cxj;
        LJ().LIZ().LJIILLIIL(this);
        InterfaceC1031540cwy interfaceC1031540cwy = this.LLILZ;
        AwS595S0100000_16 awS595S0100000_16 = new AwS595S0100000_16(this, 90);
        if (interfaceC1031540cwy != null && interfaceC1031540cwy.getRewardAdModel() != null) {
            RewardAdModel rewardAdModel = interfaceC1031540cwy.getRewardAdModel();
            if (rewardAdModel != null) {
                awS595S0100000_16.invoke(rewardAdModel);
                return;
            }
            return;
        }
        InterfaceC1032010cxj interfaceC1032010cxj2 = this.LLILLL;
        if (interfaceC1032010cxj2 == null) {
            return;
        }
        interfaceC1032010cxj2.LIZJ();
    }

    @Override // X.InterfaceC1031710cxF
    public final void LIZLLL(FrameLayout frameLayout, InterfaceC1031540cwy interfaceC1031540cwy) {
        this.LLILLJJLI = frameLayout;
        this.LLILZ = interfaceC1031540cwy;
        LJ().LIZ().LIZJ(this);
    }

    @Override // X.InterfaceC1482530ogN
    public final void onPausePlay(String str, C1480430ocz c1480430ocz) {
        InterfaceC1032010cxj interfaceC1032010cxj = this.LLILLL;
        if (interfaceC1032010cxj != null) {
            interfaceC1032010cxj.l3();
        }
    }

    @Override // X.InterfaceC1482530ogN
    public final void onPlayCompleted(String str, int i) {
        InterfaceC1032010cxj interfaceC1032010cxj = this.LLILLL;
        if (interfaceC1032010cxj != null) {
            interfaceC1032010cxj.h0();
        }
    }

    @Override // X.InterfaceC1482530ogN
    public final void onRenderFirstFrame(String str, C1480420ocy c1480420ocy) {
        InterfaceC1032010cxj interfaceC1032010cxj = this.LLILLL;
        if (interfaceC1032010cxj != null) {
            interfaceC1032010cxj.N();
        }
        try {
            LJFF();
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    @Override // X.InterfaceC1482530ogN
    public final void onResumePlay(String str, C1480430ocz c1480430ocz) {
        InterfaceC1032010cxj interfaceC1032010cxj;
        if (LJ().LIZLLL() && (interfaceC1032010cxj = this.LLILLL) != null) {
            interfaceC1032010cxj.M();
        }
    }

    @Override // X.InterfaceC1482530ogN
    public final void onPlayFailed(String str, C1481290oeN c1481290oeN, C1480430ocz c1480430ocz) {
        String string;
        InterfaceC1032010cxj interfaceC1032010cxj = this.LLILLL;
        if (interfaceC1032010cxj != null) {
            if (c1481290oeN != null) {
                string = Integer.valueOf(c1481290oeN.LJ).toString();
            } else {
                string = null;
            }
            interfaceC1032010cxj.H2(string);
        }
    }

    @Override // X.InterfaceC1482530ogN
    public final void onPlayProgressChange(String str, long j, long j2) {
        InterfaceC1032010cxj interfaceC1032010cxj = this.LLILLL;
        if (interfaceC1032010cxj != null) {
            interfaceC1032010cxj.onPlayProgressChange(str, j, j2);
        }
    }
}
