package X;

import android.view.Surface;
import com.ss.android.ugc.aweme.player.sdk.api.OnPreRenderListener;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0ogN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public interface InterfaceC1482530ogN extends OnPreRenderListener {
    void Au(Surface surface);

    void Gk1(C1284720jXK c1284720jXK);

    void LLZZLLIL(C1281010jRL c1281010jRL);

    void Qe2(C1700490uLv c1700490uLv);

    void VK();

    void W1(String str);

    void onBrightnessChanged(String str, float f);

    void onBufferedPercent(String str, long j, int i);

    void onBufferedTimeMs(String str, long j);

    void onBuffering(String str, boolean z, C1480430ocz c1480430ocz);

    void onCompleteLoaded(String str, boolean z);

    void onCrosstalkHappened(String str, List<Map<String, Object>> list);

    void onDecoderBuffering(String str, boolean z, C1480430ocz c1480430ocz);

    void onFrameAboutToBeRendered(int i, long j, long j2, Map<Integer, String> map);

    void onLiveRenderFirstFrame(String str, C1480420ocy c1480420ocy);

    void onLoopPlay(String str, int i);

    void onMaskInfoCallback(String str, C1480290ocl c1480290ocl);

    void onPausePlay(String str, C1480430ocz c1480430ocz);

    void onPlayCompleted(String str, int i);

    void onPlayCompletedFirstTime(String str, C1480430ocz c1480430ocz);

    void onPlayFailed(String str, C1481290oeN c1481290oeN, C1480430ocz c1480430ocz);

    void onPlayPause(String str);

    void onPlayPrepare(String str);

    void onPlayPrepared(String str);

    void onPlayProgressChange(String str, long j, long j2);

    void onPlayRelease(String str);

    void onPlayStop(String str, JSONObject jSONObject, C1480430ocz c1480430ocz);

    void onPlayerInternalEvent(String str, int i, JSONObject jSONObject);

    void onPlaying(String str, C1480430ocz c1480430ocz);

    void onPreRenderSessionMissed(String str);

    void onPreparePlay(String str, C1480430ocz c1480430ocz);

    void onRenderFirstFrame(String str, C1480420ocy c1480420ocy);

    void onResumePlay(String str, C1480430ocz c1480430ocz);

    void onRetryOnError(String str, C1481290oeN c1481290oeN);

    void onSeekEnd(String str, boolean z);

    void onSeekStart(String str, int i, float f);

    void onSpeedChanged(String str, float f);

    void onStopPlay(String str);

    void onVideoBitrateChanged(String str, EnumC2281141EQm enumC2281141EQm, int i);

    void onVideoSecondFrame(String str);

    void onVideoSizeChanged(String str, int i, int i2);

    void tc(String str, JSONObject jSONObject);

    void uv(JSONObject jSONObject);
}
