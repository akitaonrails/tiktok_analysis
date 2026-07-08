package X;

import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.aweme.search.performance.core.config.SearchVideoPreRenderConfig;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Mv1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C583770Mv1 {
    public static InterfaceC584630MwP LIZ;
    public static InterfaceC584630MwP LIZIZ;
    public static final boolean LIZJ;
    public static final boolean LIZLLL;
    public static final int LJ;
    public static final C583760Mv0 LJFF;

    /* JADX WARN: Type inference failed for: r0v9, types: [X.0Mv0] */
    static {
        C01GW c01gw = C583780Mv2.LIZIZ;
        SearchVideoPreRenderConfig searchVideoPreRenderConfig = (SearchVideoPreRenderConfig) c01gw.getValue();
        LIZJ = searchVideoPreRenderConfig != null && searchVideoPreRenderConfig.enablePreRenderInBuffered;
        SearchVideoPreRenderConfig searchVideoPreRenderConfig2 = (SearchVideoPreRenderConfig) c01gw.getValue();
        LIZLLL = searchVideoPreRenderConfig2 != null && searchVideoPreRenderConfig2.enablePreRenderInFirstFrame;
        SearchVideoPreRenderConfig searchVideoPreRenderConfig3 = (SearchVideoPreRenderConfig) c01gw.getValue();
        LJ = searchVideoPreRenderConfig3 != null ? searchVideoPreRenderConfig3.bufferedPercent : 0;
        LJFF = new OnUIPlayListener() { // from class: X.0Mv0
            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ OnUIPlayListener getWrapperedListener() {
                return C583620Mum.LIZ(this);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onBrightnessChanged(String str, float f) {
                C583620Mum.LIZIZ(this, str, f);
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
            public final /* synthetic */ void onPlayCompleted(String str) {
                C583620Mum.LJIJI(this, str);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onPlayCompleted(String str, int i) {
                C583620Mum.LJIJJ(this, str, i);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onPlayCompletedFirstTime(String str) {
                C583620Mum.LJIJJLI(this, str);
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
            public final /* synthetic */ void onPlayPrepare(String str) {
                C583620Mum.LJJIII(this, str);
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
            public final /* synthetic */ void onPlayProgressChange(String str, long j, long j2) {
                C583620Mum.LJJIIZ(this, str, j, j2);
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
            public final /* synthetic */ void onPreparePlay(String str) {
                C583620Mum.LJJJ(this, str);
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
            public final /* synthetic */ void onResumePlay(String str) {
                C583620Mum.LJJJJJ(this, str);
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
            public final /* synthetic */ void onSeekEnd(String str, boolean z) {
                C583620Mum.LJJJJLL(this, str, z);
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
                C583770Mv1.LIZ = null;
                C583770Mv1.LIZ(C583770Mv1.LIZIZ);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onPlayStop(String str) {
                C583770Mv1.LIZ = null;
                C583770Mv1.LIZ(C583770Mv1.LIZIZ);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onPlayFailed(String str, C1481290oeN c1481290oeN) {
                C583770Mv1.LIZ = null;
                C583770Mv1.LIZ(C583770Mv1.LIZIZ);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onRenderFirstFrame(String str, C1480420ocy c1480420ocy) {
                String strLIZLLL;
                if (C583770Mv1.LIZLLL) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onRenderFirstFrame callback sourceId ");
                    sbLIZ.append(str);
                    sbLIZ.append(" current prerender: ");
                    InterfaceC584630MwP interfaceC584630MwP = C583770Mv1.LIZ;
                    if (interfaceC584630MwP != null) {
                        strLIZLLL = interfaceC584630MwP.LIZLLL();
                    } else {
                        strLIZLLL = null;
                    }
                    sbLIZ.append(strLIZLLL);
                    C2188811AlT.LIZIZ(sbLIZ);
                    InterfaceC584630MwP interfaceC584630MwP2 = C583770Mv1.LIZ;
                    if (interfaceC584630MwP2 != null) {
                        interfaceC584630MwP2.LIZJ();
                    }
                    C583770Mv1.LIZ = null;
                    C583770Mv1.LIZ(C583770Mv1.LIZIZ);
                }
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onBufferedPercent(String str, long j, int i) {
                String strLIZLLL;
                if (C583770Mv1.LIZJ && i >= C583770Mv1.LJ) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onBuffered callback sourceId ");
                    sbLIZ.append(str);
                    sbLIZ.append(" current prerender: ");
                    InterfaceC584630MwP interfaceC584630MwP = C583770Mv1.LIZ;
                    if (interfaceC584630MwP != null) {
                        strLIZLLL = interfaceC584630MwP.LIZLLL();
                    } else {
                        strLIZLLL = null;
                    }
                    sbLIZ.append(strLIZLLL);
                    C2188811AlT.LIZIZ(sbLIZ);
                    InterfaceC584630MwP interfaceC584630MwP2 = C583770Mv1.LIZ;
                    if (interfaceC584630MwP2 != null) {
                        interfaceC584630MwP2.LIZJ();
                    }
                    C583770Mv1.LIZ = null;
                    C583770Mv1.LIZ(C583770Mv1.LIZIZ);
                }
            }
        };
    }

    public static void LIZ(InterfaceC584630MwP interfaceC584630MwP) {
        String strLIZLLL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("current playing callback unregister：");
        if (interfaceC584630MwP != null) {
            strLIZLLL = interfaceC584630MwP.LIZLLL();
        } else {
            strLIZLLL = null;
        }
        sbLIZ.append(strLIZLLL);
        C2188811AlT.LIZIZ(sbLIZ);
        if (interfaceC584630MwP != null) {
            interfaceC584630MwP.LJFF(LJFF);
        }
    }
}
