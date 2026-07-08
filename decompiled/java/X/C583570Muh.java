package X;

import android.util.LruCache;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Muh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C583570Muh implements OnUIPlayListener, InterfaceC582390Msn {
    public static WeakReference<InterfaceC582390Msn> LLIZLLLIL;
    public final OnUIPlayListener LL;
    public final InterfaceC582440Mss LLILLJJLI;
    public Aweme LLILLL;
    public final List<Video> LLILZ = new ArrayList();
    public int LLILZIL;
    public int LLILZLL;
    public boolean LLIZ;

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ OnUIPlayListener getWrapperedListener() {
        return C583620Mum.LIZ(this);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBrightnessChanged(String str, float f) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onBufferedPercent(String str, long j, int i) {
        C583620Mum.LIZJ(this, str, j, i);
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
    public final /* synthetic */ void onPlayCompleted(String str, int i) {
        C583620Mum.LJIJJ(this, str, i);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompletedFirstTime(String str) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayCompletedFirstTime(String str, C1480430ocz c1480430ocz) {
        C583620Mum.LJIL(this, str, c1480430ocz);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayFailed(String str, C1481290oeN c1481290oeN) {
        C583620Mum.LJJ(this, str, c1481290oeN);
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
    public final /* synthetic */ void onPlayProgressChange(String str, long j, long j2) {
        C583620Mum.LJJIIZ(this, str, j, j2);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayRelease(String str) {
        C583620Mum.LJJIIZI(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onPlayStop(String str) {
        C583620Mum.LJJIJ(this, str);
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
    public final /* synthetic */ void onPreparePlay(String str, C1480430ocz c1480430ocz) {
        C583620Mum.LJJJI(this, str, c1480430ocz);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onRenderFirstFrame(String str, C1480420ocy c1480420ocy) {
        C583620Mum.LJJJIL(this, str, c1480420ocy);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onRenderFirstFrameFromResume(String str) {
        C583620Mum.LJJJJI(this, str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final /* synthetic */ void onResumePlay(String str, C1480430ocz c1480430ocz) {
        C583620Mum.LJJJJJL(this, str, c1480430ocz);
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

    public final Video LIZ() {
        List<Video> list = this.LLILZ;
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (Video) ListProtector.get(this.LLILZ, this.LLILZIL);
    }

    public final String LIZIZ() {
        String aid;
        Aweme aweme = this.LLILLL;
        if (aweme == null || (aid = aweme.getAid()) == null) {
            aid = "";
        }
        if (this.LLILZIL == 0) {
            return aid;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(aid);
        sbLIZ.append(this.LLILZIL);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC582390Msn
    public final long getCurrentPosition() {
        List<Video> list = this.LLILZ;
        if (list == null || list.isEmpty()) {
            return 0L;
        }
        Iterator<Integer> it2 = C13LZ.LJIILJJIL(0, this.LLILZIL).iterator();
        long duration = 0;
        while (it2.hasNext()) {
            duration += (long) ((Video) ListProtector.get(this.LLILZ, ((AbstractC2098408Jy) it2).nextInt())).getDuration();
        }
        long currentPosition = duration + ((C581440MrG) this.LLILLJJLI).LIZ.getPlayerManager().getCurrentPosition();
        if (currentPosition >= 0) {
            return currentPosition;
        }
        return 0L;
    }

    @Override // X.InterfaceC582390Msn
    public final long getDuration() {
        List<Video> list = this.LLILZ;
        if (list == null || list.isEmpty()) {
            return 0L;
        }
        Iterator<Video> it2 = this.LLILZ.iterator();
        long duration = 0;
        while (it2.hasNext()) {
            duration += (long) it2.next().getDuration();
        }
        if (duration > 0) {
            return duration;
        }
        long duration2 = ((C581440MrG) this.LLILLJJLI).LIZ.getPlayerManager().getDuration();
        if (duration2 > 0) {
            return duration2;
        }
        return -1L;
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBuffering(boolean z) {
        this.LL.onBuffering(z);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onDecoderBuffering(boolean z) {
        this.LL.onDecoderBuffering(z);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPausePlay(String str) {
        ((C581440MrG) this.LLILLJJLI).LIZ.W(2);
        if (this.LLIZ) {
            this.LLIZ = false;
        } else {
            this.LL.onPausePlay(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompleted(String str) {
        List<Video> list = this.LLILZ;
        if (list != null && !list.isEmpty()) {
            this.LLILZIL = (this.LLILZIL + 1) % ((ArrayList) this.LLILZ).size();
            Video videoLIZ = LIZ();
            if (videoLIZ != null) {
                this.LLIZ = true;
                ((C581440MrG) this.LLILLJJLI).LIZ(videoLIZ);
            }
            if (this.LLILZIL == 0) {
                if (this.LLILZLL == 0) {
                    this.LL.onPlayCompletedFirstTime(str);
                }
                this.LL.onPlayCompleted(str);
                this.LLILZLL++;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayFailed(C1481290oeN c1481290oeN) {
        this.LL.onPlayFailed(c1481290oeN);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayProgressChange(float f) {
        this.LL.onPlayProgressChange(f);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPreparePlay(String str) {
        ((C581440MrG) this.LLILLJJLI).LIZ.W(0);
        if (this.LLILZIL == 0 && this.LLILZLL == 0) {
            this.LL.onPreparePlay(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrame(C1480420ocy c1480420ocy) {
        if (this.LLILZIL == 0 && this.LLILZLL == 0) {
            this.LL.onRenderFirstFrame(c1480420ocy);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderReady(C1480430ocz c1480430ocz) {
        List<Video> list;
        VideoUrlModel playAddr;
        this.LLIZ = false;
        ((C581440MrG) this.LLILLJJLI).LIZ.W(1);
        if (this.LLILZIL == 0 && this.LLILZLL == 0) {
            this.LL.onRenderReady(c1480430ocz);
        }
        if (this.LLILZLL == 0 && (list = this.LLILZ) != null && !((ArrayList) list).isEmpty() && this.LLILZIL + 1 < ((ArrayList) this.LLILZ).size() && (playAddr = ((Video) ListProtector.get(this.LLILZ, this.LLILZIL + 1)).getPlayAddr()) != null) {
            this.LLILLJJLI.getClass();
            LruCache<String, SimVideoUrlModel> lruCache = C1483340ohg.LIZ;
            C1478160oZK.LIZ().LJJLIIIJLLLLLLLZ(C1481230oeH.LJII(playAddr));
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onResumePlay(String str) {
        ((C581440MrG) this.LLILLJJLI).LIZ.W(1);
        this.LL.onResumePlay(str);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRetryOnError(C1481290oeN c1481290oeN) {
        this.LL.onRetryOnError(c1481290oeN);
    }

    public C583570Muh(OnUIPlayListener onUIPlayListener, C581440MrG c581440MrG) {
        this.LL = onUIPlayListener;
        this.LLILLJJLI = c581440MrG;
    }
}
