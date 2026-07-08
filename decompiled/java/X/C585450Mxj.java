package X;

import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Mxj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C585450Mxj implements InterfaceC585510Mxp, OnUIPlayListener {
    public static final C585450Mxj LL = new C585450Mxj();
    public static final List<OnUIPlayListener> LLILLJJLI;

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onBuffering(boolean z) {
        C583620Mum.LJI(this, z);
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
    public final /* synthetic */ void onDecoderBuffering(boolean z) {
        C583620Mum.LJIIL(this, z);
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
    public final /* synthetic */ void onPlayFailed(C1481290oeN c1481290oeN) {
        C583620Mum.LJJIFFI(this, c1481290oeN);
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
    public final /* synthetic */ void onPreparePlay(String str) {
        C583620Mum.LJJJ(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onRenderFirstFrame(C1480420ocy c1480420ocy) {
        C583620Mum.LJJJJ(this, c1480420ocy);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onRenderReady(C1480430ocz c1480430ocz) {
        C583620Mum.LJJJJIZL(this, c1480430ocz);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onRetryOnError(C1481290oeN c1481290oeN) {
        C583620Mum.LJJJJLI(this, c1481290oeN);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onVideoSecondFrame(String str) {
        C583620Mum.LJJJLZIJ(this, str);
    }

    static {
        LLILLJJLI = ((Boolean) C1474810oTv.LJIJJLI.getValue()).booleanValue() ? new CopyOnWriteArrayList<>() : new ArrayList<>();
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final OnUIPlayListener getWrapperedListener() {
        throw new RuntimeException("Illegal call");
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPausePlay(String str) {
        Iterator<OnUIPlayListener> it2 = LLILLJJLI.iterator();
        while (it2.hasNext()) {
            it2.next().onPausePlay(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompleted(String str) {
        Iterator<OnUIPlayListener> it2 = LLILLJJLI.iterator();
        while (it2.hasNext()) {
            it2.next().onPlayCompleted(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompletedFirstTime(String str) {
        Iterator<OnUIPlayListener> it2 = LLILLJJLI.iterator();
        while (it2.hasNext()) {
            it2.next().onPlayCompletedFirstTime(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayPause(String str) {
        Iterator<OnUIPlayListener> it2 = LLILLJJLI.iterator();
        while (it2.hasNext()) {
            it2.next().onPlayPause(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayPrepare(String str) {
        Iterator<OnUIPlayListener> it2 = LLILLJJLI.iterator();
        while (it2.hasNext()) {
            it2.next().onPlayPrepare(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayRelease(String str) {
        Iterator<OnUIPlayListener> it2 = LLILLJJLI.iterator();
        while (it2.hasNext()) {
            it2.next().onPlayRelease(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayStop(String str) {
        Iterator<OnUIPlayListener> it2 = LLILLJJLI.iterator();
        while (it2.hasNext()) {
            it2.next().onPlayStop(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlaying(String str) {
        Iterator<OnUIPlayListener> it2 = LLILLJJLI.iterator();
        while (it2.hasNext()) {
            it2.next().onPlaying(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPreRenderSessionMissed(String str) {
        Iterator<OnUIPlayListener> it2 = LLILLJJLI.iterator();
        while (it2.hasNext()) {
            it2.next().onPreRenderSessionMissed(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrameFromResume(String str) {
        Iterator<OnUIPlayListener> it2 = LLILLJJLI.iterator();
        while (it2.hasNext()) {
            it2.next().onRenderFirstFrameFromResume(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onResumePlay(String str) {
        Iterator<OnUIPlayListener> it2 = LLILLJJLI.iterator();
        while (it2.hasNext()) {
            it2.next().onResumePlay(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onStopPlay(String str) {
        Iterator<OnUIPlayListener> it2 = LLILLJJLI.iterator();
        while (it2.hasNext()) {
            it2.next().onStopPlay(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBrightnessChanged(String str, float f) {
        Iterator<OnUIPlayListener> it2 = LLILLJJLI.iterator();
        while (it2.hasNext()) {
            it2.next().onBrightnessChanged(str, f);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBufferedTimeMs(String str, long j) {
        Iterator<OnUIPlayListener> it2 = LLILLJJLI.iterator();
        while (it2.hasNext()) {
            it2.next().onBufferedTimeMs(str, j);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBuffering(String str, boolean z) {
        Iterator<OnUIPlayListener> it2 = LLILLJJLI.iterator();
        while (it2.hasNext()) {
            it2.next().onBuffering(str, z);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onCompleteLoaded(String str, boolean z) {
        boolean zLJI = MethodIDManager.LJI(72095);
        Iterator<OnUIPlayListener> it2 = LLILLJJLI.iterator();
        while (it2.hasNext()) {
            it2.next().onCompleteLoaded(str, z);
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onDecoderBuffering(String str, boolean z) {
        Iterator<OnUIPlayListener> it2 = LLILLJJLI.iterator();
        while (it2.hasNext()) {
            it2.next().onDecoderBuffering(str, z);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onMaskInfoCallback(String str, C1480290ocl c1480290ocl) {
        Iterator<OnUIPlayListener> it2 = LLILLJJLI.iterator();
        while (it2.hasNext()) {
            it2.next().onMaskInfoCallback(str, c1480290ocl);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPausePlay(String str, C1480430ocz c1480430ocz) {
        Iterator<OnUIPlayListener> it2 = LLILLJJLI.iterator();
        while (it2.hasNext()) {
            it2.next().onPausePlay(str, c1480430ocz);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompleted(String str, int i) {
        Iterator<OnUIPlayListener> it2 = LLILLJJLI.iterator();
        while (it2.hasNext()) {
            it2.next().onPlayCompleted(str, i);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompletedFirstTime(String str, C1480430ocz c1480430ocz) {
        Iterator<OnUIPlayListener> it2 = LLILLJJLI.iterator();
        while (it2.hasNext()) {
            it2.next().onPlayCompletedFirstTime(str, c1480430ocz);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayFailed(String str, C1481290oeN c1481290oeN) {
        Iterator<OnUIPlayListener> it2 = LLILLJJLI.iterator();
        while (it2.hasNext()) {
            it2.next().onPlayFailed(str, c1481290oeN);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayStop(String str, JSONObject jSONObject) {
        Iterator<OnUIPlayListener> it2 = LLILLJJLI.iterator();
        while (it2.hasNext()) {
            it2.next().onPlayStop(str, jSONObject);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlaying(String str, C1480430ocz c1480430ocz) {
        Iterator<OnUIPlayListener> it2 = LLILLJJLI.iterator();
        while (it2.hasNext()) {
            it2.next().onPlaying(str, c1480430ocz);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPreparePlay(String str, C1480430ocz c1480430ocz) {
        Iterator<OnUIPlayListener> it2 = LLILLJJLI.iterator();
        while (it2.hasNext()) {
            it2.next().onPreparePlay(str, c1480430ocz);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrame(String str, C1480420ocy c1480420ocy) {
        Iterator<OnUIPlayListener> it2 = LLILLJJLI.iterator();
        while (it2.hasNext()) {
            it2.next().onRenderFirstFrame(str, c1480420ocy);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onResumePlay(String str, C1480430ocz c1480430ocz) {
        Iterator<OnUIPlayListener> it2 = LLILLJJLI.iterator();
        while (it2.hasNext()) {
            it2.next().onResumePlay(str, c1480430ocz);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRetryOnError(String str, C1481290oeN c1481290oeN) {
        Iterator<OnUIPlayListener> it2 = LLILLJJLI.iterator();
        while (it2.hasNext()) {
            it2.next().onRetryOnError(str, c1481290oeN);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onSeekEnd(String str, boolean z) {
        Iterator<OnUIPlayListener> it2 = LLILLJJLI.iterator();
        while (it2.hasNext()) {
            it2.next().onSeekEnd(str, z);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onSpeedChanged(String str, float f) {
        Iterator<OnUIPlayListener> it2 = LLILLJJLI.iterator();
        while (it2.hasNext()) {
            it2.next().onSpeedChanged(str, f);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayStop(String str, boolean z) {
        Iterator<OnUIPlayListener> it2 = LLILLJJLI.iterator();
        while (it2.hasNext()) {
            it2.next().onPlayStop(str, z);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBufferedPercent(String str, long j, int i) {
        Iterator<OnUIPlayListener> it2 = LLILLJJLI.iterator();
        while (it2.hasNext()) {
            it2.next().onBufferedPercent(str, j, i);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBuffering(String str, boolean z, C1480430ocz c1480430ocz) {
        Iterator<OnUIPlayListener> it2 = LLILLJJLI.iterator();
        while (it2.hasNext()) {
            it2.next().onBuffering(str, z, c1480430ocz);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onDecoderBuffering(String str, boolean z, C1480430ocz c1480430ocz) {
        Iterator<OnUIPlayListener> it2 = LLILLJJLI.iterator();
        while (it2.hasNext()) {
            it2.next().onDecoderBuffering(str, z, c1480430ocz);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayFailed(String str, C1481290oeN c1481290oeN, C1480430ocz c1480430ocz) {
        Iterator<OnUIPlayListener> it2 = LLILLJJLI.iterator();
        while (it2.hasNext()) {
            it2.next().onPlayFailed(str, c1481290oeN, c1480430ocz);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayProgressChange(String str, long j, long j2) {
        Iterator<OnUIPlayListener> it2 = LLILLJJLI.iterator();
        while (it2.hasNext()) {
            it2.next().onPlayProgressChange(str, j, j2);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayStop(String str, JSONObject jSONObject, C1480430ocz c1480430ocz) {
        Iterator<OnUIPlayListener> it2 = LLILLJJLI.iterator();
        while (it2.hasNext()) {
            it2.next().onPlayStop(str, jSONObject, c1480430ocz);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayerInternalEvent(String str, int i, JSONObject jSONObject) {
        Iterator<OnUIPlayListener> it2 = LLILLJJLI.iterator();
        while (it2.hasNext()) {
            it2.next().onPlayerInternalEvent(str, i, jSONObject);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onSeekStart(String str, int i, float f) {
        Iterator<OnUIPlayListener> it2 = LLILLJJLI.iterator();
        while (it2.hasNext()) {
            it2.next().onSeekStart(str, i, f);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onVideoBitrateChanged(String str, EnumC2281141EQm enumC2281141EQm, int i) {
        Iterator<OnUIPlayListener> it2 = LLILLJJLI.iterator();
        while (it2.hasNext()) {
            it2.next().onVideoBitrateChanged(str, enumC2281141EQm, i);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onVideoSizeChanged(String str, int i, int i2) {
        Iterator<OnUIPlayListener> it2 = LLILLJJLI.iterator();
        while (it2.hasNext()) {
            it2.next().onVideoSizeChanged(str, i, i2);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onFrameAboutToBeRendered(int i, long j, long j2, Map<Integer, String> map) {
        Iterator<OnUIPlayListener> it2 = LLILLJJLI.iterator();
        while (it2.hasNext()) {
            it2.next().onFrameAboutToBeRendered(i, j, j2, map);
        }
    }
}
