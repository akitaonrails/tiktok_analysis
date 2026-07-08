package X;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0JNW, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pcs.course.videoplayerpage.playerview.controller.PcsVideoPlayerViewController$tryStartPlayer$1", f = "PcsVideoPlayerViewController.kt", l = {}, m = "invokeSuspend")
public final class C0JNW extends C09AX implements Function2<C0N0Y, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ C0JO7 LLILLL;
    public final /* synthetic */ SurfaceTexture LLILZ;
    public final /* synthetic */ C490810JMp LLILZIL;
    public final /* synthetic */ Video LLILZLL;
    public final /* synthetic */ boolean LLIZ;
    public final /* synthetic */ int LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0JNW(boolean z, C0JO7 c0jo7, SurfaceTexture surfaceTexture, C490810JMp c490810JMp, Video video, boolean z2, int i, InterfaceC1364105Vn<? super C0JNW> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = z;
        this.LLILLL = c0jo7;
        this.LLILZ = surfaceTexture;
        this.LLILZIL = c490810JMp;
        this.LLILZLL = video;
        this.LLIZ = z2;
        this.LLIZLLLIL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0JNW c0jnw = new C0JNW(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
        c0jnw.LL = obj;
        return c0jnw;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PcsVideoPlayerViewController@65f8.tryStartPlayer$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0N0Y c0n0y = (C0N0Y) this.LL;
        if (this.LLILLJJLI && c0n0y.isPaused()) {
            c0n0y.LJIILLIIL();
            c0n0y.LJJIIZ();
            Iterator it2 = ((ArrayList) this.LLILLL.LLIZLLLIL).iterator();
            while (it2.hasNext()) {
                ((C0JNP) it2.next()).Cq();
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("PcsVideoPlayerViewController@65f8.tryStartPlayer$1");
            return unit;
        }
        c0n0y.setSurface(new Surface(this.LLILZ));
        final C490810JMp c490810JMp = this.LLILZIL;
        final C0JO7 c0jo7 = this.LLILLL;
        c490810JMp.getClass();
        final String currentSourceID = c0jo7.getCurrentSourceID();
        final C013C c013c = new C013C();
        final C118300cf c118300cf = new C118300cf();
        final C013C c013c2 = new C013C();
        final C238400w2 c238400w2 = new C238400w2();
        c238400w2.element = -1L;
        c0n0y.LJJIJ(new OnUIPlayListener() { // from class: X.0JO8
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
            public final /* synthetic */ void onPlayCompleted(String str, int i) {
                C583620Mum.LJIJJ(this, str, i);
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
            public final /* synthetic */ void onPlayProgressChange(float f) {
                C583620Mum.LJJIIJZLJL(this, f);
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
            public final /* synthetic */ void onResumePlay(String str, C1480430ocz c1480430ocz) {
                C583620Mum.LJJJJJL(this, str, c1480430ocz);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onRetryOnError(C1481290oeN c1481290oeN) {
                C583620Mum.LJJJJLI(this, c1481290oeN);
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
                if (!Intrinsics.LJFF(currentSourceID, str)) {
                    return;
                }
                c013c.element = false;
                c238400w2.element = -1L;
                c0jo7.onPausePlay(str);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("PcsVideoPlayerViewController onPausePlay sourceID: ");
                sbLIZ.append(str);
                C20441214yg.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onPlayCompleted(String str) {
                if (!Intrinsics.LJFF(currentSourceID, str)) {
                    return;
                }
                C0N0Y c0n0yLIZLLL = c490810JMp.LIZLLL(str);
                if (c0n0yLIZLLL != null) {
                    C490810JMp c490810JMp2 = c490810JMp;
                    C490750JMj.LJ(c0n0yLIZLLL, c490810JMp2.LLILZ, new C490840JMs(c0jo7, c490810JMp2, null));
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("PcsVideoPlayerViewController onPlayCompleted sourceID: ");
                sbLIZ.append(str);
                C20441214yg.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                c0jo7.onPlayCompleted(str);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onPlayCompletedFirstTime(String str) {
                if (!Intrinsics.LJFF(currentSourceID, str)) {
                    return;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("PcsVideoPlayerViewController onPlayCompletedFirstTime sourceID: ");
                sbLIZ.append(str);
                C20441214yg.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onPlayPrepare(String str) {
                if (!Intrinsics.LJFF(currentSourceID, str)) {
                    return;
                }
                C0JO7 c0jo72 = c0jo7;
                c0jo72.getClass();
                C583620Mum.LJJJ(c0jo72, str);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("PcsVideoPlayerViewController onPlayPrepare sourceID: ");
                sbLIZ.append(str);
                C20441214yg.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onPlayPrepared(String str) {
                if (!Intrinsics.LJFF(currentSourceID, str)) {
                    return;
                }
                C0JO7 c0jo72 = c0jo7;
                c0jo72.getClass();
                C583620Mum.LJJJ(c0jo72, str);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("PcsVideoPlayerViewController onPlayPrepared sourceID: ");
                sbLIZ.append(str);
                C20441214yg.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onResumePlay(String str) {
                if (!Intrinsics.LJFF(currentSourceID, str)) {
                    return;
                }
                c0jo7.onResumePlay(str);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("PcsVideoPlayerViewController onResumePlay sourceID: ");
                sbLIZ.append(str);
                C20441214yg.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onBuffering(String str, boolean z) {
                if (!Intrinsics.LJFF(currentSourceID, str)) {
                    return;
                }
                if (z) {
                    if (!c013c.element) {
                        c0jo7.onBuffering(str, true);
                        c013c.element = true;
                        return;
                    }
                    return;
                }
                if (!c013c.element) {
                    return;
                }
                c0jo7.onBuffering(str, false);
                c013c.element = false;
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onDecoderBuffering(String str, boolean z) {
                if (!Intrinsics.LJFF(currentSourceID, str)) {
                    return;
                }
                if (z) {
                    if (!c013c2.element) {
                        c0jo7.onDecoderBuffering(str, true);
                        c013c2.element = true;
                        return;
                    }
                    return;
                }
                if (!c013c2.element) {
                    return;
                }
                c0jo7.onDecoderBuffering(str, false);
                c013c2.element = false;
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onPlayFailed(String str, C1481290oeN c1481290oeN) {
                if (!Intrinsics.LJFF(currentSourceID, str)) {
                    return;
                }
                c0jo7.onPlayFailed(str, c1481290oeN);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("PcsVideoPlayerViewController onPlayFailed sourceID: ");
                sbLIZ.append(str);
                C20441214yg.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onRenderFirstFrame(String str, C1480420ocy c1480420ocy) {
                if (!Intrinsics.LJFF(currentSourceID, str)) {
                    return;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("PcsVideoPlayerViewController onRenderFirstFrame sourceID: ");
                sbLIZ.append(str);
                C20441214yg.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                C0N0Y c0n0yLIZLLL = c490810JMp.LIZLLL(str);
                if (c0n0yLIZLLL != null) {
                    C490750JMj.LJ(c0n0yLIZLLL, c490810JMp.LLILZ, new C490890JMx(null));
                }
                c0jo7.onRenderFirstFrame(str, c1480420ocy);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onRetryOnError(String str, C1481290oeN c1481290oeN) {
                if (!Intrinsics.LJFF(currentSourceID, str)) {
                    return;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("PcsVideoPlayerViewController onRetryOnError sourceID: ");
                sbLIZ.append(str);
                C20441214yg.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                c0jo7.onRetryOnError(str, c1481290oeN);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onBufferedPercent(String str, long j, int i) {
                if (!Intrinsics.LJFF(currentSourceID, str)) {
                    return;
                }
                c0jo7.onBufferedPercent(str, j, i);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onPlayProgressChange(String str, long j, long j2) {
                c0jo7.onPlayProgressChange(str, j, j2);
                if (c238400w2.element == j) {
                    c118300cf.element++;
                } else {
                    c118300cf.element = 0;
                }
                if (c118300cf.element > 1) {
                    onBuffering(str, true);
                } else {
                    onBuffering(str, false);
                }
                c238400w2.element = j;
            }
        });
        EnumC1479590obd enumC1479590obd = EnumC1479590obd.Normal;
        C1479720obq c1479720obq = new C1479720obq();
        c1479720obq.LIZ.LIZLLL = C1481230oeH.LJI(this.LLILZLL);
        boolean zIsNeedSetCookie = this.LLILZLL.isNeedSetCookie();
        C1479530obX c1479530obX = c1479720obq.LIZ;
        c1479530obX.LJIL = zIsNeedSetCookie;
        c1479530obX.LJJJLL = true;
        c1479530obX.LJIIJ = true;
        c1479530obX.LJJJLZIJ = this.LLIZ;
        c1479530obX.LJIJJLI = enumC1479590obd;
        c1479530obX.LJIILLIIL = false;
        c1479530obX.LJIIJJI = this.LLIZLLLIL;
        c0n0y.LJJZZIII(c1479720obq.LIZ());
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("PcsVideoPlayerViewController@65f8.tryStartPlayer$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C0N0Y c0n0y, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c0n0y, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
