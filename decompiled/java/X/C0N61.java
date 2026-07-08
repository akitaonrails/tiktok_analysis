package X;

import Y.ARunnableS107S0100000_7;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Handler;
import android.view.Surface;
import android.view.TextureView;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS193S0000000_7;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0N61, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0N61 implements InterfaceC470090Ic3 {
    public final TextureView LIZ;
    public boolean LIZIZ;
    public SurfaceTexture LIZJ;
    public Surface LIZLLL;
    public Video LJFF;
    public boolean LJII;
    public int LJIIIZ;
    public boolean LJIIJ;
    public ARunnableS107S0100000_7 LJIIL;
    public final C0N60 LJIILIIL;
    public final C01GW LJ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(390));
    public float LJIIIIZZ = -1.0f;
    public final C01GW LJIIJJI = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(242));
    public C1483410ohn LJI = new C1483410ohn();

    @Override // X.InterfaceC470090Ic3
    public final void pause() {
        this.LJIIJ = false;
        this.LJIIIIZZ = -1.0f;
        this.LJII = false;
        C1483410ohn c1483410ohn = this.LJI;
        if (c1483410ohn != null) {
            ((Handler) this.LJIIJJI.getValue()).removeCallbacksAndMessages(null);
            c1483410ohn.LJJLI(false);
            c1483410ohn.LJJIIZI();
        }
    }

    @Override // X.InterfaceC470090Ic3
    public final void release() {
        this.LIZIZ = false;
        Surface surface = this.LIZLLL;
        if (surface != null) {
            surface.release();
        }
        SurfaceTexture surfaceTexture = this.LIZJ;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        this.LIZJ = null;
        this.LIZLLL = null;
        LIZ().clear();
        this.LIZ.setSurfaceTextureListener(null);
        C1483410ohn c1483410ohn = this.LJI;
        if (c1483410ohn != null) {
            ((Handler) this.LJIIJJI.getValue()).removeCallbacksAndMessages(null);
            c1483410ohn.LJJL();
            c1483410ohn.LJJIJ(null);
            c1483410ohn.LJJIIJZLJL();
            c1483410ohn.release();
        }
        this.LJI = null;
    }

    public final List<InterfaceC588410N5z> LIZ() {
        return (List) this.LJ.getValue();
    }

    @Override // X.InterfaceC470090Ic3
    public final boolean isPlaying() {
        C1483410ohn c1483410ohn = this.LJI;
        if (c1483410ohn != null) {
            return c1483410ohn.isPlaying();
        }
        return false;
    }

    @Override // X.InterfaceC470090Ic3
    public final void resume() {
        C1483410ohn c1483410ohn;
        if (this.LIZIZ && (c1483410ohn = this.LJI) != null) {
            ((Handler) this.LJIIJJI.getValue()).removeCallbacksAndMessages(null);
            ARunnableS107S0100000_7 aRunnableS107S0100000_7 = new ARunnableS107S0100000_7(this, 162);
            this.LJIIL = aRunnableS107S0100000_7;
            C786410Ut5.LJLIIL(1000L, (Handler) this.LJIIJJI.getValue(), aRunnableS107S0100000_7);
            c1483410ohn.LJJIIZ();
            c1483410ohn.LJJIJ(this.LJIILIIL);
            c1483410ohn.LJIILIIL(this.LJFF, this.LJIILIIL);
        }
    }

    @Override // X.InterfaceC470090Ic3
    public final void start() {
        if (!this.LIZIZ) {
            this.LJII = true;
            return;
        }
        this.LJII = false;
        C1483410ohn c1483410ohn = this.LJI;
        if (c1483410ohn != null) {
            ((Handler) this.LJIIJJI.getValue()).removeCallbacksAndMessages(null);
            ARunnableS107S0100000_7 aRunnableS107S0100000_7 = new ARunnableS107S0100000_7(this, 162);
            this.LJIIL = aRunnableS107S0100000_7;
            C786410Ut5.LJLIIL(1000L, (Handler) this.LJIIJJI.getValue(), aRunnableS107S0100000_7);
            c1483410ohn.LJJIJ(this.LJIILIIL);
            c1483410ohn.LJL(this.LJFF, true);
            c1483410ohn.LJJIIZ();
            Surface surface = this.LIZLLL;
            if (surface != null) {
                c1483410ohn.setSurface(surface);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [X.0N60] */
    public C0N61(TextureView textureView) {
        this.LIZ = textureView;
        textureView.setSurfaceTextureListener(new TextureView.SurfaceTextureListener() { // from class: X.0N62
            @Override // android.view.TextureView.SurfaceTextureListener
            public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                SurfaceTexture surfaceTexture2 = this.LL.LIZJ;
                if (surfaceTexture2 != null && (Build.VERSION.SDK_INT < 26 || !surfaceTexture2.isReleased())) {
                    return false;
                }
                return true;
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
                SurfaceTexture surfaceTexture2 = this.LL.LIZJ;
                if (surfaceTexture2 == null || (Build.VERSION.SDK_INT >= 26 && surfaceTexture2.isReleased())) {
                    C0N61 c0n61 = this.LL;
                    c0n61.LIZJ = surfaceTexture;
                    c0n61.LIZLLL = new Surface(this.LL.LIZJ);
                    C0N61 c0n612 = this.LL;
                    C1483410ohn c1483410ohn = c0n612.LJI;
                    if (c1483410ohn != null) {
                        c1483410ohn.setSurface(c0n612.LIZLLL);
                    }
                } else {
                    C0N61 c0n613 = this.LL;
                    SurfaceTexture surfaceTexture3 = c0n613.LIZJ;
                    if (surfaceTexture3 != null && !Intrinsics.LJFF(surfaceTexture3, c0n613.LIZ.getSurfaceTexture())) {
                        c0n613.LIZ.setSurfaceTexture(surfaceTexture3);
                        c0n613.LIZLLL = new Surface(surfaceTexture3);
                    }
                }
                C0N61 c0n614 = this.LL;
                c0n614.LIZIZ = true;
                if (c0n614.LJII) {
                    c0n614.start();
                }
            }
        });
        this.LJIILIIL = new OnUIPlayListener() { // from class: X.0N60
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
                    C0N61 c0n61 = this.LL;
                    if (!c0n61.LJIIJ) {
                        Iterator<InterfaceC588410N5z> it2 = c0n61.LIZ().iterator();
                        while (it2.hasNext()) {
                            it2.next().onBuffering(true);
                        }
                        this.LL.LJIIJ = true;
                        return;
                    }
                    return;
                }
                C0N61 c0n612 = this.LL;
                if (c0n612.LJIIJ) {
                    Iterator<InterfaceC588410N5z> it3 = c0n612.LIZ().iterator();
                    while (it3.hasNext()) {
                        it3.next().onBuffering(false);
                    }
                    this.LL.LJIIJ = false;
                }
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onPausePlay(String str) {
                Iterator<InterfaceC588410N5z> it2 = this.LL.LIZ().iterator();
                while (it2.hasNext()) {
                    it2.next().onPausePlay(str);
                }
                this.LL.getClass();
                ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).w4().setCurrentPlayerMute(false);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onPlayCompleted(String str) {
                Iterator<InterfaceC588410N5z> it2 = this.LL.LIZ().iterator();
                while (it2.hasNext()) {
                    it2.next().onPlayCompleted(str);
                }
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onPlayFailed(C1481290oeN c1481290oeN) {
                Iterator<InterfaceC588410N5z> it2 = this.LL.LIZ().iterator();
                while (it2.hasNext()) {
                    it2.next().LJLLI(String.valueOf(c1481290oeN));
                }
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onPlayProgressChange(float f) {
                Iterator<InterfaceC588410N5z> it2 = this.LL.LIZ().iterator();
                while (it2.hasNext()) {
                    it2.next().onPlayProgressChange(f);
                }
                C0N61 c0n61 = this.LL;
                if (c0n61.LJIIIIZZ == f) {
                    c0n61.LJIIIZ++;
                } else {
                    c0n61.LJIIIZ = 0;
                }
                if (c0n61.LJIIIZ > 1) {
                    onBuffering(true);
                } else {
                    onBuffering(false);
                }
                this.LL.LJIIIIZZ = f;
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onPreparePlay(String str) {
                Iterator<InterfaceC588410N5z> it2 = this.LL.LIZ().iterator();
                while (it2.hasNext()) {
                    it2.next().onPreparePlay(str);
                }
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onRenderFirstFrame(C1480420ocy c1480420ocy) {
                Iterator<InterfaceC588410N5z> it2 = this.LL.LIZ().iterator();
                while (it2.hasNext()) {
                    it2.next().LJII();
                }
                this.LL.getClass();
                ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).w4().setCurrentPlayerMute(true);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onResumePlay(String str) {
                Iterator<InterfaceC588410N5z> it2 = this.LL.LIZ().iterator();
                while (it2.hasNext()) {
                    it2.next().onResumePlay(str);
                }
                this.LL.getClass();
                ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).w4().setCurrentPlayerMute(true);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onRetryOnError(C1481290oeN c1481290oeN) {
                Iterator<InterfaceC588410N5z> it2 = this.LL.LIZ().iterator();
                while (it2.hasNext()) {
                    it2.next().LL(String.valueOf(c1481290oeN));
                }
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onBufferedPercent(String str, long j, int i) {
                Iterator<InterfaceC588410N5z> it2 = this.LL.LIZ().iterator();
                while (it2.hasNext()) {
                    it2.next().onBufferedPercent(str, j, i);
                }
            }
        };
    }

    @Override // X.InterfaceC470090Ic3
    public final void LJIILL(float f) {
        C1483410ohn c1483410ohn = this.LJI;
        if (c1483410ohn != null) {
            c1483410ohn.seek(f);
        }
    }
}
