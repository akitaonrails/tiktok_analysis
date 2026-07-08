package X;

import Y.ARunnableS109S0100000_9;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0N0S, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0N0S implements InterfaceC1765740w3A {
    public final C1765720w38 LIZ;
    public final C19736512Jv LIZIZ;
    public boolean LIZJ;
    public SurfaceTexture LIZLLL;
    public final C1765720w38 LJ;
    public Video LJFF;
    public long LJI;
    public boolean LJIIIIZZ;
    public int LJIIJ;
    public boolean LJIIJJI;
    public int LJIIL;
    public boolean LJIILIIL;
    public boolean LJIILJJIL;
    public ARunnableS109S0100000_9 LJIILLIIL;
    public C0N0R LJIIZILJ;
    public final C0N0Q LJIJ;
    public boolean LJIJI;
    public float LJIIIZ = -1.0f;
    public final C01GW LJIILL = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(367));
    public C1483410ohn LJII = new C1483410ohn();

    @Override // X.InterfaceC1765740w3A
    public final void LIZ() {
    }

    @Override // X.InterfaceC1765740w3A
    public final void LIZIZ() {
    }

    @Override // X.InterfaceC1765740w3A
    public final void pause() {
        this.LJIIJJI = false;
        this.LJIIIZ = -1.0f;
        C1483410ohn c1483410ohn = this.LJII;
        if (c1483410ohn != null) {
            ((Handler) this.LJIILL.getValue()).removeCallbacksAndMessages(null);
            c1483410ohn.LJJLI(false);
            c1483410ohn.LJJIIZI();
        }
        C19736512Jv c19736512Jv = this.LIZIZ;
        if (c19736512Jv != null) {
            C786410Ut5.LLLLLLLLL(c19736512Jv, 0);
        }
    }

    @Override // X.InterfaceC1765740w3A
    public final void release() {
        this.LIZJ = false;
        SurfaceTexture surfaceTexture = this.LIZLLL;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        this.LIZLLL = null;
        C1483410ohn c1483410ohn = this.LJII;
        if (c1483410ohn != null) {
            ((Handler) this.LJIILL.getValue()).removeCallbacksAndMessages(null);
            c1483410ohn.LJJL();
            c1483410ohn.LJJIJ(null);
            c1483410ohn.LJJIIJZLJL();
            c1483410ohn.release();
        }
        this.LJII = null;
    }

    @Override // X.InterfaceC1765740w3A
    public final void stop() {
    }

    @Override // X.InterfaceC1765740w3A
    public final void LJIIIIZZ() {
        C1483410ohn c1483410ohn = this.LJII;
        if (c1483410ohn != null) {
            c1483410ohn.LJIJJ();
        }
        this.LJIJI = false;
    }

    @Override // X.InterfaceC1765740w3A
    public final void mute() {
        C1483410ohn c1483410ohn = this.LJII;
        if (c1483410ohn != null) {
            c1483410ohn.LJFF();
        }
        this.LJIJI = true;
    }

    @Override // X.InterfaceC1765740w3A
    public final void resume() {
        if (this.LIZJ) {
            C1483410ohn c1483410ohn = this.LJII;
            if (c1483410ohn != null) {
                ((Handler) this.LJIILL.getValue()).removeCallbacksAndMessages(null);
                ARunnableS109S0100000_9 aRunnableS109S0100000_9 = new ARunnableS109S0100000_9(this, 129);
                this.LJIILLIIL = aRunnableS109S0100000_9;
                C786410Ut5.LJLIIL(1000L, (Handler) this.LJIILL.getValue(), aRunnableS109S0100000_9);
                c1483410ohn.LJJIIZ();
                c1483410ohn.LJJIJ(this.LJIJ);
                c1483410ohn.LJIILIIL(this.LJFF, this.LJIJ);
            }
            C19736512Jv c19736512Jv = this.LIZIZ;
            if (c19736512Jv != null) {
                C786410Ut5.LLLLLLLLL(c19736512Jv, 0);
            }
        }
    }

    @Override // X.InterfaceC1765740w3A
    public final int getNetworkSpeed() {
        return C1479130oat.LJII();
    }

    @Override // X.InterfaceC1765740w3A
    public final boolean isMute() {
        return this.LJIJI;
    }

    @Override // X.InterfaceC1765740w3A
    public final void retry() {
        resume();
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [X.0N0Q] */
    public C0N0S(C1765720w38 c1765720w38) {
        View viewFindViewById;
        this.LIZ = c1765720w38;
        this.LJ = c1765720w38;
        C19736512Jv c19736512Jv = null;
        if (c1765720w38 != null && (viewFindViewById = c1765720w38.findViewById(R.id.qtg)) != null) {
            c19736512Jv = (C19736512Jv) viewFindViewById.findViewById(R.id.qmi);
        }
        this.LIZIZ = c19736512Jv;
        c1765720w38.m68getVideoView().setSurfaceTextureListener(new TextureView.SurfaceTextureListener() { // from class: X.0N0T
            @Override // android.view.TextureView.SurfaceTextureListener
            public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                SurfaceTexture surfaceTexture2 = this.LL.LIZLLL;
                if (surfaceTexture2 != null && (Build.VERSION.SDK_INT < 26 || !surfaceTexture2.isReleased())) {
                    return false;
                }
                return true;
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
                SurfaceTexture surfaceTexture2 = this.LL.LIZLLL;
                if (surfaceTexture2 == null || (Build.VERSION.SDK_INT >= 26 && surfaceTexture2.isReleased())) {
                    C0N0S c0n0s = this.LL;
                    c0n0s.LIZLLL = surfaceTexture;
                    C1483410ohn c1483410ohn = c0n0s.LJII;
                    if (c1483410ohn != null) {
                        c1483410ohn.setSurface(new Surface(this.LL.LIZLLL));
                    }
                } else {
                    C0N0S c0n0s2 = this.LL;
                    SurfaceTexture surfaceTexture3 = c0n0s2.LIZLLL;
                    if (surfaceTexture3 != null && !Intrinsics.LJFF(surfaceTexture3, c0n0s2.LIZ.m68getVideoView().getSurfaceTexture())) {
                        c0n0s2.LIZ.m68getVideoView().setSurfaceTexture(surfaceTexture3);
                    }
                }
                C0N0S c0n0s3 = this.LL;
                c0n0s3.LIZJ = true;
                if (c0n0s3.LJIIIIZZ) {
                    c0n0s3.start(c0n0s3.LJIIL);
                    this.LL.LJIIL = 0;
                }
            }
        });
        this.LJIJ = new OnUIPlayListener() { // from class: X.0N0Q
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
            public final void onDecoderBuffering(boolean z) {
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
            public final /* synthetic */ void onRenderReady(C1480430ocz c1480430ocz) {
                C583620Mum.LJJJJIZL(this, c1480430ocz);
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

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onBuffering(boolean z) {
                if (z) {
                    C0N0S c0n0s = this.LL;
                    if (!c0n0s.LJIIJJI) {
                        C1765720w38 c1765720w382 = c0n0s.LJ;
                        if (c1765720w382 != null) {
                            c1765720w382.onBuffering(true);
                        }
                        this.LL.LJIIJJI = true;
                        return;
                    }
                    return;
                }
                C0N0S c0n0s2 = this.LL;
                if (!c0n0s2.LJIIJJI) {
                    return;
                }
                C1765720w38 c1765720w383 = c0n0s2.LJ;
                if (c1765720w383 != null) {
                    c1765720w383.onBuffering(false);
                }
                this.LL.LJIIJJI = false;
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onPausePlay(String str) {
                C1765720w38 c1765720w382 = this.LL.LJ;
                if (c1765720w382 != null) {
                    c1765720w382.onPausePlay(str);
                }
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onPlayCompleted(String str) {
                C0N0R c0n0r = this.LL.LJIIZILJ;
                if (c0n0r != null) {
                    c0n0r.onComplete();
                }
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onPlayFailed(C1481290oeN c1481290oeN) {
                C1765720w38 c1765720w382 = this.LL.LJ;
                if (c1765720w382 != null) {
                    c1765720w382.LJLLI(String.valueOf(c1481290oeN));
                }
                C0N0R c0n0r = this.LL.LJIIZILJ;
                if (c0n0r != null) {
                    c0n0r.onFailed();
                }
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onPlayProgressChange(float f) {
                float videoLength;
                try {
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (this.LL.LJFF != null) {
                    videoLength = (r1.LJIIL / r0.getVideoLength()) / 10.0f;
                } else {
                    videoLength = 0.0f;
                }
                C0N0S c0n0s = this.LL;
                if (c0n0s.LJIILIIL && f > videoLength) {
                    c0n0s.LIZ.LJIIIZ();
                    this.LL.LJIILIIL = false;
                }
                C0N0S c0n0s2 = this.LL;
                if (c0n0s2.LJIILJJIL) {
                    c0n0s2.mute();
                    this.LL.LJIILJJIL = false;
                }
                C1765720w38 c1765720w382 = this.LL.LJ;
                if (c1765720w382 != null) {
                    c1765720w382.onPlayProgressChange(f);
                }
                C0N0S c0n0s3 = this.LL;
                if (c0n0s3.LJIIIZ == f) {
                    c0n0s3.LJIIJ++;
                } else {
                    c0n0s3.LJIIJ = 0;
                }
                if (c0n0s3.LJIIJ > 1) {
                    onBuffering(true);
                } else {
                    onBuffering(false);
                }
                this.LL.LJIIIZ = f;
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onPreparePlay(String str) {
                this.LL.LJI = SystemClock.elapsedRealtime();
                C0N0S c0n0s = this.LL;
                if (c0n0s.LJIILJJIL) {
                    c0n0s.mute();
                    this.LL.LJIILJJIL = false;
                }
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onRenderFirstFrame(C1480420ocy c1480420ocy) {
                C1765720w38 c1765720w382 = this.LL.LJ;
                if (c1765720w382 != null) {
                    c1765720w382.LJII();
                }
                C0N0S c0n0s = this.LL;
                if (c0n0s.LJI != 0) {
                    c0n0s.LJI = 0L;
                }
                if (c0n0s.LJIILJJIL) {
                    c0n0s.mute();
                    this.LL.LJIILJJIL = false;
                }
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onResumePlay(String str) {
                C1765720w38 c1765720w382 = this.LL.LJ;
                if (c1765720w382 != null) {
                    c1765720w382.onResumePlay(str);
                }
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onRetryOnError(C1481290oeN c1481290oeN) {
                C1765720w38 c1765720w382 = this.LL.LJ;
                if (c1765720w382 != null) {
                    c1765720w382.LL(String.valueOf(c1481290oeN));
                }
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onBufferedPercent(String str, long j, int i) {
                C1765720w38 c1765720w382 = this.LL.LJ;
                if (c1765720w382 != null) {
                    c1765720w382.onBufferedPercent(str, j, i);
                }
            }
        };
    }

    @Override // X.InterfaceC1765740w3A
    public final void LJIILL(float f) {
        C1483410ohn c1483410ohn = this.LJII;
        if (c1483410ohn != null) {
            c1483410ohn.seek(f);
        }
        C19736512Jv c19736512Jv = this.LIZIZ;
        if (c19736512Jv != null) {
            C786410Ut5.LLLLLLLLL(c19736512Jv, 0);
        }
    }

    @Override // X.InterfaceC1765740w3A
    public final void start(int i) {
        if (this.LIZJ) {
            this.LJIIIIZZ = false;
            C1483410ohn c1483410ohn = this.LJII;
            if (c1483410ohn != null) {
                ((Handler) this.LJIILL.getValue()).removeCallbacksAndMessages(null);
                ARunnableS109S0100000_9 aRunnableS109S0100000_9 = new ARunnableS109S0100000_9(this, 129);
                this.LJIILLIIL = aRunnableS109S0100000_9;
                C786410Ut5.LJLIIL(1000L, (Handler) this.LJIILL.getValue(), aRunnableS109S0100000_9);
                c1483410ohn.LJJIJ(this.LJIJ);
                c1483410ohn.LJIJJLI(this.LJFF, i);
                c1483410ohn.LJJIIZ();
            }
        } else {
            this.LJIIIIZZ = true;
            this.LJIIL = i;
        }
        C19736512Jv c19736512Jv = this.LIZIZ;
        if (c19736512Jv != null) {
            C786410Ut5.LLLLLLLLL(c19736512Jv, 0);
        }
    }
}
