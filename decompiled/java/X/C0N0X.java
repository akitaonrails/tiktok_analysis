package X;

import Y.ACallableS62S1100000_9;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.CaptionItemModel;
import com.ss.android.ugc.aweme.feed.model.CaptionLanguage;
import com.ss.android.ugc.aweme.feed.model.CaptionModel;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0N0X, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0N0X implements InterfaceC1765740w3A {
    public final C610310Nwj LIZ;
    public final C1765720w38 LIZIZ;
    public final C0N0Y LIZJ;
    public Video LIZLLL;
    public SurfaceTexture LJ;
    public boolean LJFF;
    public boolean LJI;
    public boolean LJII;
    public String LJIIIIZZ = "";
    public final C0N0O LJIIIZ;
    public final C0N0P LJIIJ;

    @Override // X.InterfaceC1765740w3A
    public final void LIZ() {
    }

    @Override // X.InterfaceC1765740w3A
    public final void LIZIZ() {
    }

    @Override // X.InterfaceC1765740w3A
    public final int getNetworkSpeed() {
        return 0;
    }

    @Override // X.InterfaceC1765740w3A
    public final void retry() {
        start(0);
    }

    @Override // X.InterfaceC1765740w3A
    public final void stop() {
    }

    @Override // X.InterfaceC1765740w3A
    public final void LJIIIIZZ() {
        this.LIZJ.LJIJJ();
    }

    @Override // X.InterfaceC1765740w3A
    public final boolean isMute() {
        return this.LIZJ.isMute();
    }

    @Override // X.InterfaceC1765740w3A
    public final void mute() {
        this.LIZJ.LJFF();
    }

    @Override // X.InterfaceC1765740w3A
    public final void pause() {
        this.LIZJ.LIZ();
    }

    @Override // X.InterfaceC1765740w3A
    public final void release() {
        C0N0Y c0n0y = this.LIZJ;
        c0n0y.LJJL();
        c0n0y.LJJIJ(null);
        c0n0y.LJJIIJZLJL();
        c0n0y.release();
    }

    @Override // X.InterfaceC1765740w3A
    public final void resume() {
        if (this.LJFF) {
            C0N0Y c0n0y = this.LIZJ;
            c0n0y.LJJIIZ();
            c0n0y.LJJIJ(this.LJIIIZ);
            c0n0y.LJJLL(this.LIZLLL, this.LJIIIZ);
        }
    }

    @Override // X.InterfaceC1765740w3A
    public final void LJIILL(float f) {
        this.LIZJ.seek(f);
    }

    @Override // X.InterfaceC1765740w3A
    public final void start(int i) {
        int i2;
        CaptionLanguage captionLanguage;
        List<CaptionItemModel> list;
        if (this.LIZLLL == null) {
            return;
        }
        if (this.LJFF) {
            this.LJI = false;
            C0N0Y c0n0y = this.LIZJ;
            c0n0y.LJJIJ(this.LJIIIZ);
            Video video = this.LIZLLL;
            Long l = ((C1752020vh2) this.LIZ.getBindingAdapter()).LLILLL;
            C581750Mrl c581750Mrl = null;
            if (video != null && video.getCaptionModel() != null) {
                CaptionModel captionModel = video.getCaptionModel();
                if (captionModel != null && (captionLanguage = captionModel.originalCaptionLanguage) != null && (list = captionModel.captionList) != null && !list.isEmpty()) {
                    if (captionModel.captionList.size() == 1) {
                        i2 = ((CaptionItemModel) ListProtector.get(captionModel.captionList, 0)).subId;
                    } else {
                        for (CaptionItemModel captionItemModel : captionModel.captionList) {
                            if (l != null) {
                                if (captionItemModel.languageId == l.longValue()) {
                                    i2 = captionItemModel.subId;
                                    break;
                                }
                            } else if (captionItemModel.languageId == captionLanguage.languageId) {
                                i2 = captionItemModel.subId;
                                break;
                            }
                        }
                        i2 = -1;
                    }
                    c581750Mrl = new C581750Mrl(true, i2, false, video.getCaptionModel(), 28);
                } else {
                    i2 = -1;
                    c581750Mrl = new C581750Mrl(true, i2, false, video.getCaptionModel(), 28);
                }
            }
            c0n0y.LJLI(video, i, c581750Mrl);
            c0n0y.LJJIIZ();
            return;
        }
        this.LJI = true;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0N0O] */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.0N0P] */
    public C0N0X(C610310Nwj c610310Nwj, C1765720w38 c1765720w38, C0N0Y c0n0y) {
        this.LIZ = c610310Nwj;
        this.LIZIZ = c1765720w38;
        this.LIZJ = c0n0y;
        c1765720w38.m68getVideoView().setSurfaceTextureListener(new TextureView.SurfaceTextureListener() { // from class: X.0N0W
            @Override // android.view.TextureView.SurfaceTextureListener
            public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                C0N0X c0n0x = this.LL;
                c0n0x.LJFF = false;
                c0n0x.LJ = null;
                return true;
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
                C0N0X c0n0x = this.LL;
                SurfaceTexture surfaceTexture2 = c0n0x.LJ;
                if (surfaceTexture2 == null) {
                    c0n0x.LJ = surfaceTexture;
                    c0n0x.LIZJ.setSurface(new Surface(surfaceTexture));
                } else if (!Intrinsics.LJFF(surfaceTexture2, c0n0x.LIZIZ.m68getVideoView().getSurfaceTexture())) {
                    c0n0x.LIZIZ.m68getVideoView().setSurfaceTexture(surfaceTexture2);
                }
                C0N0X c0n0x2 = this.LL;
                c0n0x2.LJFF = true;
                if (c0n0x2.LJI) {
                    c0n0x2.start(0);
                }
            }
        });
        this.LJIIIZ = new OnUIPlayListener() { // from class: X.0N0O
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
            public final void onPlayCompleted(String str) {
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
                this.LL.LIZIZ.onPausePlay(str);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onPlayProgressChange(float f) {
                this.LL.LIZIZ.onPlayProgressChange(f);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onPreparePlay(String str) {
                this.LL.LIZIZ.getClass();
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onResumePlay(String str) {
                this.LL.LIZIZ.onResumePlay(str);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onBuffering(String str, boolean z) {
                this.LL.LIZIZ.onBuffering(z);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onPlayFailed(String str, C1481290oeN c1481290oeN) {
                this.LL.LIZIZ.LJLLI(String.valueOf(c1481290oeN));
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onRenderFirstFrame(String str, C1480420ocy c1480420ocy) {
                this.LL.LIZIZ.LJII();
                this.LL.LIZJ.LJIILL().LJJIJL(this.LL.LJIIJ);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onRetryOnError(String str, C1481290oeN c1481290oeN) {
                this.LL.LIZIZ.LL(String.valueOf(c1481290oeN));
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onBufferedPercent(String str, long j, int i) {
                this.LL.LIZIZ.onBufferedPercent(str, j, i);
            }
        };
        this.LJIIJ = new InterfaceC1472010oPP() { // from class: X.0N0P
            @Override // X.InterfaceC1472010oPP
            public final /* synthetic */ String LIZ(String str) {
                return "";
            }

            @Override // X.InterfaceC1472010oPP
            public final void LIZIZ(int i, String str, String str2) {
            }

            @Override // X.InterfaceC1472010oPP
            public final void LIZLLL(int i, String str, String str2) {
            }

            @Override // X.InterfaceC1472010oPP
            public final void LIZJ(String str, int i, int i2, int i3, int i4, String str2, boolean z, boolean z2, long j, long j2, long j3, int i5) {
                String str3;
                if (this.LIZ.LJII && ((str2 == null || str2.length() == 0) && ((str3 = this.LIZ.LJIIIIZZ) == null || str3.length() == 0))) {
                    return;
                }
                C0N0X c0n0x = this.LIZ;
                c0n0x.LJII = true;
                c0n0x.LJIIIIZZ = str2;
                C15O7.LIZIZ(new ACallableS62S1100000_9(c0n0x, str2, 0), C15O7.LJIIIIZZ, null);
            }
        };
    }
}
