package X;

import Y.ARunnableS113S0100000_13;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.view.Surface;
import android.view.TextureView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.dependency.live.LiveDependencyService;
import com.ss.android.ugc.aweme.ecommerce.dependency.log.LogDependencyService;
import com.ss.android.ugc.aweme.ecommerce.dependency.player.PlayerDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.event.ILogDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.live.ILiveDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.player.IPlayerDependencyService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS212S0000000_23;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pLz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1508330pLz implements InterfaceC1765740w3A {
    public final C1765720w38 LIZ;
    public final boolean LIZIZ;
    public boolean LIZJ;
    public SurfaceTexture LIZLLL;
    public Video LJFF;
    public int LJI;
    public long LJII;
    public InterfaceC1508380pM4 LJIIIIZZ;
    public boolean LJIIIZ;
    public int LJIIJJI;
    public boolean LJIIL;
    public ARunnableS113S0100000_13 LJIILJJIL;
    public final C1507700pKy LJIILL;
    public final C01GW LJ = C452501pT.LIZIZ(AFwS212S0000000_23.get$arr$(251));
    public float LJIIJ = -1.0f;
    public final C01GW LJIILIIL = C452501pT.LIZIZ(AFwS212S0000000_23.get$arr$(250));

    @Override // X.InterfaceC1765740w3A
    public final void LIZ() {
    }

    @Override // X.InterfaceC1765740w3A
    public final void LIZIZ() {
    }

    @Override // X.InterfaceC1765740w3A
    public final void pause() {
        this.LJIIL = false;
        this.LJIIJ = -1.0f;
        InterfaceC1508380pM4 interfaceC1508380pM4 = this.LJIIIIZZ;
        if (interfaceC1508380pM4 != null) {
            ((Handler) this.LJIILIIL.getValue()).removeCallbacksAndMessages(null);
            interfaceC1508380pM4.LIZ();
            interfaceC1508380pM4.LJJIIZI();
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
        InterfaceC1508380pM4 interfaceC1508380pM4 = this.LJIIIIZZ;
        if (interfaceC1508380pM4 != null) {
            ((Handler) this.LJIILIIL.getValue()).removeCallbacksAndMessages(null);
            interfaceC1508380pM4.LJJL();
            interfaceC1508380pM4.LJJIJ(null);
            interfaceC1508380pM4.LJJIIJZLJL();
            interfaceC1508380pM4.release();
        }
        this.LJIIIIZZ = null;
    }

    @Override // X.InterfaceC1765740w3A
    public final void stop() {
    }

    public final long LIZJ() {
        InterfaceC1508380pM4 interfaceC1508380pM4 = this.LJIIIIZZ;
        if (interfaceC1508380pM4 != null) {
            return interfaceC1508380pM4.getDuration();
        }
        return 0L;
    }

    public final List<InterfaceC588410N5z> LIZLLL() {
        return (List) this.LJ.getValue();
    }

    public final void LJI() {
        if (!this.LIZJ) {
            this.LJIIIZ = true;
            return;
        }
        this.LJIIIZ = false;
        InterfaceC1508380pM4 interfaceC1508380pM4 = this.LJIIIIZZ;
        if (interfaceC1508380pM4 != null) {
            LJII();
            interfaceC1508380pM4.LJJIJ(this.LJIILL);
            interfaceC1508380pM4.LJII(this.LJFF);
            interfaceC1508380pM4.LJJIIZ();
        }
    }

    public final void LJII() {
        ((Handler) this.LJIILIIL.getValue()).removeCallbacksAndMessages(null);
        ARunnableS113S0100000_13 aRunnableS113S0100000_13 = new ARunnableS113S0100000_13(this, 259);
        this.LJIILJJIL = aRunnableS113S0100000_13;
        C786410Ut5.LJLIIL(1000L, (Handler) this.LJIILIIL.getValue(), aRunnableS113S0100000_13);
    }

    @Override // X.InterfaceC1765740w3A
    public final void LJIIIIZZ() {
        InterfaceC1508380pM4 interfaceC1508380pM4 = this.LJIIIIZZ;
        if (interfaceC1508380pM4 != null) {
            interfaceC1508380pM4.LJIJJ();
        }
    }

    @Override // X.InterfaceC1765740w3A
    public final boolean isMute() {
        InterfaceC1508380pM4 interfaceC1508380pM4 = this.LJIIIIZZ;
        if (interfaceC1508380pM4 != null) {
            return interfaceC1508380pM4.isMute();
        }
        return false;
    }

    @Override // X.InterfaceC1765740w3A
    public final void mute() {
        InterfaceC1508380pM4 interfaceC1508380pM4 = this.LJIIIIZZ;
        if (interfaceC1508380pM4 != null) {
            interfaceC1508380pM4.LJFF();
        }
    }

    @Override // X.InterfaceC1765740w3A
    public final void resume() {
        InterfaceC1508380pM4 interfaceC1508380pM4;
        if (this.LIZJ && (interfaceC1508380pM4 = this.LJIIIIZZ) != null) {
            LJII();
            interfaceC1508380pM4.LJJIIZ();
            interfaceC1508380pM4.LJJIJ(this.LJIILL);
            interfaceC1508380pM4.LJIILIIL(this.LJFF, this.LJIILL);
        }
    }

    public static final void LJ() {
        AnonymousClass0317 anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin = LiveDependencyService.createILiveDependencyServicebyMonsterPlugin(false);
            C1AQS.LIZJ(jElapsedRealtime, 1, ILiveDependencyService.class.getName(), anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin != null ? anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin.getClass().getName() : null, anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ILiveDependencyService.class);
        }
        ((ILiveDependencyService) anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin).muteInternalWindow(true);
    }

    public static final void LJFF() {
        AnonymousClass0317 anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin = LiveDependencyService.createILiveDependencyServicebyMonsterPlugin(false);
            C1AQS.LIZJ(jElapsedRealtime, 1, ILiveDependencyService.class.getName(), anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin != null ? anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin.getClass().getName() : null, anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ILiveDependencyService.class);
        }
        ((ILiveDependencyService) anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin).setCurrentPlayerMute(true);
    }

    public static final void LJIIIZ() {
        AnonymousClass0317 anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin = LiveDependencyService.createILiveDependencyServicebyMonsterPlugin(false);
            C1AQS.LIZJ(jElapsedRealtime, 1, ILiveDependencyService.class.getName(), anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin != null ? anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin.getClass().getName() : null, anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ILiveDependencyService.class);
        }
        ((ILiveDependencyService) anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin).muteInternalWindow(false);
    }

    @Override // X.InterfaceC1765740w3A
    public final int getNetworkSpeed() {
        return C1479130oat.LJII();
    }

    @Override // X.InterfaceC1765740w3A
    public final void retry() {
        resume();
    }

    @Override // X.InterfaceC1765740w3A
    public final void LJIILL(float f) {
        InterfaceC1508380pM4 interfaceC1508380pM4 = this.LJIIIIZZ;
        if (interfaceC1508380pM4 != null) {
            interfaceC1508380pM4.seek(f);
        }
    }

    @Override // X.InterfaceC1765740w3A
    public final void start(int i) {
        if (this.LIZJ) {
            this.LJIIIZ = false;
            InterfaceC1508380pM4 interfaceC1508380pM4 = this.LJIIIIZZ;
            if (interfaceC1508380pM4 != null) {
                LJII();
                interfaceC1508380pM4.LJJIJ(this.LJIILL);
                interfaceC1508380pM4.LJIJJLI(this.LJFF, i);
                interfaceC1508380pM4.LJJIIZ();
                return;
            }
            return;
        }
        this.LJIIIZ = true;
    }

    /* JADX WARN: Type inference failed for: r0v21, types: [X.0pKy] */
    public C1508330pLz(C1765720w38 c1765720w38, boolean z) {
        AnonymousClass0317 anonymousClass0317CreateIPlayerDependencyServicebyMonsterPlugin;
        AnonymousClass0317 anonymousClass0317CreateIPlayerDependencyServicebyMonsterPlugin2;
        boolean z2;
        boolean z3;
        String name;
        this.LIZ = c1765720w38;
        this.LIZIZ = z;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateIPlayerDependencyServicebyMonsterPlugin = PlayerDependencyService.createIPlayerDependencyServicebyMonsterPlugin(false);
            if (anonymousClass0317CreateIPlayerDependencyServicebyMonsterPlugin != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            String name2 = IPlayerDependencyService.class.getName();
            if (anonymousClass0317CreateIPlayerDependencyServicebyMonsterPlugin != null) {
                name = anonymousClass0317CreateIPlayerDependencyServicebyMonsterPlugin.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z3);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIPlayerDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IPlayerDependencyService.class);
        }
        IPlayerDependencyService iPlayerDependencyService = (IPlayerDependencyService) anonymousClass0317CreateIPlayerDependencyServicebyMonsterPlugin;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            anonymousClass0317CreateIPlayerDependencyServicebyMonsterPlugin2 = PlayerDependencyService.createIPlayerDependencyServicebyMonsterPlugin(false);
            if (anonymousClass0317CreateIPlayerDependencyServicebyMonsterPlugin2 != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            C1AQS.LIZJ(jElapsedRealtime2, 1, IPlayerDependencyService.class.getName(), anonymousClass0317CreateIPlayerDependencyServicebyMonsterPlugin2 != null ? anonymousClass0317CreateIPlayerDependencyServicebyMonsterPlugin2.getClass().getName() : null, z2);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIPlayerDependencyServicebyMonsterPlugin2 = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IPlayerDependencyService.class);
        }
        this.LJIIIIZZ = iPlayerDependencyService.getPlayerManager(((IPlayerDependencyService) anonymousClass0317CreateIPlayerDependencyServicebyMonsterPlugin2).otherSceneFeedUseMediaBoxExp2());
        LIZLLL().add(c1765720w38);
        c1765720w38.m68getVideoView().setSurfaceTextureListener(new TextureView.SurfaceTextureListener() { // from class: X.0pM0
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
                InterfaceC1508380pM4 interfaceC1508380pM4;
                SurfaceTexture surfaceTexture2 = this.LL.LIZLLL;
                if (surfaceTexture2 == null || (Build.VERSION.SDK_INT >= 26 && surfaceTexture2.isReleased())) {
                    C1508330pLz c1508330pLz = this.LL;
                    c1508330pLz.LIZLLL = surfaceTexture;
                    InterfaceC1508380pM4 interfaceC1508380pM42 = c1508330pLz.LJIIIIZZ;
                    if (interfaceC1508380pM42 != null) {
                        interfaceC1508380pM42.setSurface(new Surface(this.LL.LIZLLL));
                    }
                } else {
                    C1508330pLz c1508330pLz2 = this.LL;
                    SurfaceTexture surfaceTexture3 = c1508330pLz2.LIZLLL;
                    if (surfaceTexture3 != null && !Intrinsics.LJFF(surfaceTexture3, c1508330pLz2.LIZ.m68getVideoView().getSurfaceTexture())) {
                        c1508330pLz2.LIZ.m68getVideoView().setSurfaceTexture(surfaceTexture3);
                    }
                    C1508330pLz c1508330pLz3 = this.LL;
                    if (c1508330pLz3.LIZIZ && (interfaceC1508380pM4 = c1508330pLz3.LJIIIIZZ) != null) {
                        interfaceC1508380pM4.setSurface(new Surface(this.LL.LIZLLL));
                    }
                }
                C1508330pLz c1508330pLz4 = this.LL;
                c1508330pLz4.LIZJ = true;
                if (c1508330pLz4.LJIIIZ) {
                    c1508330pLz4.LJI();
                }
            }
        });
        this.LJIILL = new OnUIPlayListener() { // from class: X.0pKy
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
            public final /* synthetic */ void onBuffering(String str, boolean z4) {
                C583620Mum.LJ(this, str, z4);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onBuffering(String str, boolean z4, C1480430ocz c1480430ocz) {
                C583620Mum.LJFF(this, str, z4, c1480430ocz);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onCompleteLoaded(String str, boolean z4) {
                C583620Mum.LJII(this, str, z4);
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
            public final /* synthetic */ void onDecoderBuffering(String str, boolean z4) {
                C583620Mum.LJIIJ(this, str, z4);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onDecoderBuffering(String str, boolean z4, C1480430ocz c1480430ocz) {
                C583620Mum.LJIIJJI(this, str, z4, c1480430ocz);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onDecoderBuffering(boolean z4) {
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
            public final /* synthetic */ void onPlayStop(String str, boolean z4) {
                C583620Mum.LJJIJIL(this, str, z4);
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
            public final /* synthetic */ void onSeekEnd(String str, boolean z4) {
                C583620Mum.LJJJJLL(this, str, z4);
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
            public final void onBuffering(boolean z4) {
                AnonymousClass0317 anonymousClass0317CreateILogDependencyServicebyMonsterPlugin;
                boolean z5;
                String name3;
                if (z4) {
                    C1508330pLz c1508330pLz = this.LL;
                    if (!c1508330pLz.LJIIL) {
                        Iterator<InterfaceC588410N5z> it2 = c1508330pLz.LIZLLL().iterator();
                        while (it2.hasNext()) {
                            it2.next().onBuffering(true);
                        }
                        C1507710pKz.LIZ.getClass();
                        if (C1507710pKz.LIZIZ == -1) {
                            C1507710pKz.LIZIZ = SystemClock.elapsedRealtime();
                        }
                        this.LL.LJIIL = true;
                        return;
                    }
                    return;
                }
                C1508330pLz c1508330pLz2 = this.LL;
                if (c1508330pLz2.LJIIL) {
                    Iterator<InterfaceC588410N5z> it3 = c1508330pLz2.LIZLLL().iterator();
                    while (it3.hasNext()) {
                        it3.next().onBuffering(false);
                    }
                    C1507710pKz.LIZ.getClass();
                    try {
                        long jElapsedRealtime3 = SystemClock.elapsedRealtime();
                        long j = C1507710pKz.LIZIZ;
                        long j2 = jElapsedRealtime3 - j;
                        if (j != -1 && j2 > 80) {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("duration", j2);
                            jSONObject.put("enter_from", "TEMAI");
                        }
                        C1507710pKz.LIZIZ = -1L;
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        if (C034S.LIZ()) {
                            C1120604Zw.LIZ.LIZ();
                            long jElapsedRealtime4 = SystemClock.elapsedRealtime();
                            anonymousClass0317CreateILogDependencyServicebyMonsterPlugin = LogDependencyService.createILogDependencyServicebyMonsterPlugin(false);
                            if (anonymousClass0317CreateILogDependencyServicebyMonsterPlugin != null) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            String name4 = ILogDependencyService.class.getName();
                            if (anonymousClass0317CreateILogDependencyServicebyMonsterPlugin != null) {
                                name3 = anonymousClass0317CreateILogDependencyServicebyMonsterPlugin.getClass().getName();
                            } else {
                                name3 = null;
                            }
                            C1AQS.LIZJ(jElapsedRealtime4, 1, name4, name3, z5);
                        } else {
                            C1120604Zw.LIZ.LIZ();
                            anonymousClass0317CreateILogDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ILogDependencyService.class);
                        }
                        ((ILogDependencyService) anonymousClass0317CreateILogDependencyServicebyMonsterPlugin).crashlyticsWrapperCatchException(e);
                    }
                    this.LL.LJIIL = false;
                }
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onPausePlay(String str) {
                AnonymousClass0317 anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin;
                boolean z4;
                AnonymousClass0317 anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin2;
                boolean z5;
                Iterator<InterfaceC588410N5z> it2 = this.LL.LIZLLL().iterator();
                while (it2.hasNext()) {
                    it2.next().onPausePlay(str);
                }
                String name3 = null;
                if (C300210Bpj.LIZ()) {
                    if (C034S.LIZ()) {
                        C1120604Zw.LIZ.LIZ();
                        long jElapsedRealtime3 = SystemClock.elapsedRealtime();
                        anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin2 = LiveDependencyService.createILiveDependencyServicebyMonsterPlugin(false);
                        if (anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin2 != null) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        String name4 = ILiveDependencyService.class.getName();
                        if (anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin2 != null) {
                            name3 = anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin2.getClass().getName();
                        }
                        C1AQS.LIZJ(jElapsedRealtime3, 1, name4, name3, z5);
                    } else {
                        C1120604Zw.LIZ.LIZ();
                        anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin2 = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ILiveDependencyService.class);
                    }
                    if (!((ILiveDependencyService) anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin2).isInternalWindowUserManualMute()) {
                        C1508330pLz.LJIIIZ();
                        return;
                    }
                    return;
                }
                this.LL.getClass();
                if (C034S.LIZ()) {
                    C1120604Zw.LIZ.LIZ();
                    long jElapsedRealtime4 = SystemClock.elapsedRealtime();
                    anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin = LiveDependencyService.createILiveDependencyServicebyMonsterPlugin(false);
                    if (anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin != null) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    String name5 = ILiveDependencyService.class.getName();
                    if (anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin != null) {
                        name3 = anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin.getClass().getName();
                    }
                    C1AQS.LIZJ(jElapsedRealtime4, 1, name5, name3, z4);
                } else {
                    C1120604Zw.LIZ.LIZ();
                    anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ILiveDependencyService.class);
                }
                ((ILiveDependencyService) anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin).setCurrentPlayerMute(false);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onPlayCompleted(String str) {
                Iterator<InterfaceC588410N5z> it2 = this.LL.LIZLLL().iterator();
                while (it2.hasNext()) {
                    it2.next().onPlayCompleted(str);
                }
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onPlayCompletedFirstTime(String str) {
                if (C300210Bpj.LIZ()) {
                    C1508330pLz.LJIIIZ();
                }
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onPlayFailed(C1481290oeN c1481290oeN) {
                AnonymousClass0317 anonymousClass0317CreateILogDependencyServicebyMonsterPlugin;
                boolean z4;
                int i;
                int i2;
                AnonymousClass0317 anonymousClass0317CreateIPlayerDependencyServicebyMonsterPlugin3;
                AnonymousClass0317 anonymousClass0317CreateIPlayerDependencyServicebyMonsterPlugin4;
                String string;
                boolean z5;
                String name3;
                boolean z6;
                String name4;
                Iterator<InterfaceC588410N5z> it2 = this.LL.LIZLLL().iterator();
                while (it2.hasNext()) {
                    it2.next().LJLLI(String.valueOf(c1481290oeN));
                }
                C1507710pKz c1507710pKz = C1507710pKz.LIZ;
                Video video = this.LL.LJFF;
                c1507710pKz.getClass();
                if (c1481290oeN != null && video != null) {
                    String name5 = null;
                    try {
                        int videoLength = video.getVideoLength();
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("error_code", String.valueOf(c1481290oeN.LJ));
                        jSONObject.put("error_internal_code", String.valueOf(c1481290oeN.LJFF));
                        jSONObject.put("error_info", c1481290oeN.LJI.toString());
                        if (c1481290oeN.LIZIZ) {
                            i = 1;
                        } else {
                            i = 0;
                        }
                        jSONObject.put("is_bytevc1", String.valueOf(i));
                        if (c1481290oeN.LIZLLL) {
                            i2 = 1;
                        } else {
                            i2 = 0;
                        }
                        jSONObject.put("is_dash", String.valueOf(i2));
                        jSONObject.put("is_ad", CardStruct.IStatusCode.DEFAULT);
                        jSONObject.put("vduration", ((long) videoLength) * 1000);
                        jSONObject.put("internet_speed", String.valueOf(C1479130oat.LJII()));
                        if (C034S.LIZ()) {
                            C1120604Zw.LIZ.LIZ();
                            long jElapsedRealtime3 = SystemClock.elapsedRealtime();
                            anonymousClass0317CreateIPlayerDependencyServicebyMonsterPlugin3 = PlayerDependencyService.createIPlayerDependencyServicebyMonsterPlugin(false);
                            if (anonymousClass0317CreateIPlayerDependencyServicebyMonsterPlugin3 != null) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            String name6 = IPlayerDependencyService.class.getName();
                            if (anonymousClass0317CreateIPlayerDependencyServicebyMonsterPlugin3 != null) {
                                name4 = anonymousClass0317CreateIPlayerDependencyServicebyMonsterPlugin3.getClass().getName();
                            } else {
                                name4 = null;
                            }
                            C1AQS.LIZJ(jElapsedRealtime3, 1, name6, name4, z6);
                        } else {
                            C1120604Zw.LIZ.LIZ();
                            anonymousClass0317CreateIPlayerDependencyServicebyMonsterPlugin3 = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IPlayerDependencyService.class);
                        }
                        jSONObject.put("cache_size", String.valueOf(((IPlayerDependencyService) anonymousClass0317CreateIPlayerDependencyServicebyMonsterPlugin3).getHitCacheSize(video.getPlayAddr())));
                        if (C034S.LIZ()) {
                            C1120604Zw.LIZ.LIZ();
                            long jElapsedRealtime4 = SystemClock.elapsedRealtime();
                            anonymousClass0317CreateIPlayerDependencyServicebyMonsterPlugin4 = PlayerDependencyService.createIPlayerDependencyServicebyMonsterPlugin(false);
                            if (anonymousClass0317CreateIPlayerDependencyServicebyMonsterPlugin4 != null) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            String name7 = IPlayerDependencyService.class.getName();
                            if (anonymousClass0317CreateIPlayerDependencyServicebyMonsterPlugin4 != null) {
                                name3 = anonymousClass0317CreateIPlayerDependencyServicebyMonsterPlugin4.getClass().getName();
                            } else {
                                name3 = null;
                            }
                            C1AQS.LIZJ(jElapsedRealtime4, 1, name7, name3, z5);
                        } else {
                            C1120604Zw.LIZ.LIZ();
                            anonymousClass0317CreateIPlayerDependencyServicebyMonsterPlugin4 = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IPlayerDependencyService.class);
                        }
                        jSONObject.put("video_size", String.valueOf(((IPlayerDependencyService) anonymousClass0317CreateIPlayerDependencyServicebyMonsterPlugin4).getVideoSize(video.getPlayAddr())));
                        if (video.getPlayAddr() == null) {
                            string = "null";
                        } else {
                            string = video.getPlayAddr().toString();
                        }
                        jSONObject.put("play_url", string);
                        jSONObject.put("is_from_feed_cache", CardStruct.IStatusCode.DEFAULT);
                        jSONObject.put("enter_from", "TEMAI");
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        if (C034S.LIZ()) {
                            C1120604Zw.LIZ.LIZ();
                            long jElapsedRealtime5 = SystemClock.elapsedRealtime();
                            anonymousClass0317CreateILogDependencyServicebyMonsterPlugin = LogDependencyService.createILogDependencyServicebyMonsterPlugin(false);
                            if (anonymousClass0317CreateILogDependencyServicebyMonsterPlugin != null) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            String name8 = ILogDependencyService.class.getName();
                            if (anonymousClass0317CreateILogDependencyServicebyMonsterPlugin != null) {
                                name5 = anonymousClass0317CreateILogDependencyServicebyMonsterPlugin.getClass().getName();
                            }
                            C1AQS.LIZJ(jElapsedRealtime5, 1, name8, name5, z4);
                        } else {
                            C1120604Zw.LIZ.LIZ();
                            anonymousClass0317CreateILogDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ILogDependencyService.class);
                        }
                        ((ILogDependencyService) anonymousClass0317CreateILogDependencyServicebyMonsterPlugin).crashlyticsWrapperCatchException(e);
                    }
                }
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onPlayProgressChange(float f) {
                Iterator<InterfaceC588410N5z> it2 = this.LL.LIZLLL().iterator();
                while (it2.hasNext()) {
                    it2.next().onPlayProgressChange(f);
                }
                C1508330pLz c1508330pLz = this.LL;
                if (c1508330pLz.LJIIJ == f) {
                    c1508330pLz.LJIIJJI++;
                } else {
                    c1508330pLz.LJIIJJI = 0;
                }
                if (c1508330pLz.LJIIJJI > 1) {
                    onBuffering(true);
                } else {
                    onBuffering(false);
                }
                this.LL.LJIIJ = f;
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onPreparePlay(String str) {
                AnonymousClass0317 anonymousClass0317CreateILogDependencyServicebyMonsterPlugin;
                String name3;
                this.LL.LJII = SystemClock.elapsedRealtime();
                Iterator<InterfaceC588410N5z> it2 = this.LL.LIZLLL().iterator();
                while (it2.hasNext()) {
                    it2.next().onPreparePlay(str);
                }
                C1507710pKz.LIZ.getClass();
                try {
                    new JSONObject().put("enter_from", "TEMAI");
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    if (C034S.LIZ()) {
                        C1120604Zw.LIZ.LIZ();
                        long jElapsedRealtime3 = SystemClock.elapsedRealtime();
                        boolean z4 = false;
                        anonymousClass0317CreateILogDependencyServicebyMonsterPlugin = LogDependencyService.createILogDependencyServicebyMonsterPlugin(false);
                        if (anonymousClass0317CreateILogDependencyServicebyMonsterPlugin != null) {
                            z4 = true;
                        }
                        String name4 = ILogDependencyService.class.getName();
                        if (anonymousClass0317CreateILogDependencyServicebyMonsterPlugin != null) {
                            name3 = anonymousClass0317CreateILogDependencyServicebyMonsterPlugin.getClass().getName();
                        } else {
                            name3 = null;
                        }
                        C1AQS.LIZJ(jElapsedRealtime3, 1, name4, name3, z4);
                    } else {
                        C1120604Zw.LIZ.LIZ();
                        anonymousClass0317CreateILogDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ILogDependencyService.class);
                    }
                    ((ILogDependencyService) anonymousClass0317CreateILogDependencyServicebyMonsterPlugin).crashlyticsWrapperCatchException(e);
                }
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onRenderFirstFrame(C1480420ocy c1480420ocy) {
                int bitrate;
                int iLIZLLL;
                AnonymousClass0317 anonymousClass0317CreateILogDependencyServicebyMonsterPlugin;
                boolean z4;
                String name3;
                AnonymousClass0317 anonymousClass0317CreateIPlayerDependencyServicebyMonsterPlugin3;
                boolean z5;
                String name4;
                Iterator<InterfaceC588410N5z> it2 = this.LL.LIZLLL().iterator();
                while (it2.hasNext()) {
                    it2.next().LJII();
                }
                InterfaceC1508380pM4 interfaceC1508380pM4 = this.LL.LJIIIIZZ;
                if (interfaceC1508380pM4 != null) {
                    bitrate = (int) interfaceC1508380pM4.getBitrate();
                } else {
                    bitrate = 0;
                }
                InterfaceC1508380pM4 interfaceC1508380pM42 = this.LL.LJIIIIZZ;
                if (interfaceC1508380pM42 != null) {
                    iLIZLLL = interfaceC1508380pM42.LIZLLL();
                } else {
                    iLIZLLL = 0;
                }
                if (this.LL.LJII != 0) {
                    long jElapsedRealtime3 = SystemClock.elapsedRealtime();
                    C1508330pLz c1508330pLz = this.LL;
                    long j = jElapsedRealtime3 - c1508330pLz.LJII;
                    C1507710pKz c1507710pKz = C1507710pKz.LIZ;
                    Video video = c1508330pLz.LJFF;
                    int i = c1508330pLz.LJI;
                    c1507710pKz.getClass();
                    if (video != null && c1480420ocy != null) {
                        try {
                            VideoUrlModel playAddr = video.getPlayAddr();
                            int videoLength = video.getVideoLength();
                            int iLIZ = C584720MwY.LIZ(playAddr);
                            int iLJII = C1479130oat.LJII();
                            if (C034S.LIZ()) {
                                C1120604Zw.LIZ.LIZ();
                                long jElapsedRealtime4 = SystemClock.elapsedRealtime();
                                anonymousClass0317CreateIPlayerDependencyServicebyMonsterPlugin3 = PlayerDependencyService.createIPlayerDependencyServicebyMonsterPlugin(false);
                                if (anonymousClass0317CreateIPlayerDependencyServicebyMonsterPlugin3 != null) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                String name5 = IPlayerDependencyService.class.getName();
                                if (anonymousClass0317CreateIPlayerDependencyServicebyMonsterPlugin3 != null) {
                                    name4 = anonymousClass0317CreateIPlayerDependencyServicebyMonsterPlugin3.getClass().getName();
                                } else {
                                    name4 = null;
                                }
                                C1AQS.LIZJ(jElapsedRealtime4, 1, name5, name4, z5);
                            } else {
                                C1120604Zw.LIZ.LIZ();
                                anonymousClass0317CreateIPlayerDependencyServicebyMonsterPlugin3 = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IPlayerDependencyService.class);
                            }
                            long hitCacheSize = ((IPlayerDependencyService) anonymousClass0317CreateIPlayerDependencyServicebyMonsterPlugin3).getHitCacheSize(video.getPlayAddr()) / ((long) 1024);
                            boolean zIsBytevc1 = c1480420ocy.isBytevc1();
                            int i2 = C08Y7.LIZIZ;
                            if (i2 == null) {
                                i2 = -1;
                            }
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("duration", j);
                            jSONObject.put("vduration", ((long) videoLength) * 1000);
                            jSONObject.put("video_quality", iLIZ);
                            jSONObject.put("internet_speed", iLJII);
                            jSONObject.put("pre_cache_size", hitCacheSize);
                            jSONObject.put("video_bitrate", i);
                            jSONObject.put("play_bitrate", bitrate);
                            jSONObject.put("is_bytevc1", zIsBytevc1);
                            jSONObject.put("codec_name", iLIZLLL);
                            jSONObject.put("cpu_rate", i2);
                            jSONObject.put("enter_from", "TEMAI");
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            if (C034S.LIZ()) {
                                C1120604Zw.LIZ.LIZ();
                                long jElapsedRealtime5 = SystemClock.elapsedRealtime();
                                anonymousClass0317CreateILogDependencyServicebyMonsterPlugin = LogDependencyService.createILogDependencyServicebyMonsterPlugin(false);
                                if (anonymousClass0317CreateILogDependencyServicebyMonsterPlugin != null) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                String name6 = ILogDependencyService.class.getName();
                                if (anonymousClass0317CreateILogDependencyServicebyMonsterPlugin != null) {
                                    name3 = anonymousClass0317CreateILogDependencyServicebyMonsterPlugin.getClass().getName();
                                } else {
                                    name3 = null;
                                }
                                C1AQS.LIZJ(jElapsedRealtime5, 1, name6, name3, z4);
                            } else {
                                C1120604Zw.LIZ.LIZ();
                                anonymousClass0317CreateILogDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ILogDependencyService.class);
                            }
                            ((ILogDependencyService) anonymousClass0317CreateILogDependencyServicebyMonsterPlugin).crashlyticsWrapperCatchException(e);
                        }
                    }
                    this.LL.LJII = 0L;
                }
                if (C300210Bpj.LIZ()) {
                    C1508330pLz.LJ();
                } else {
                    C1508330pLz.LJFF();
                }
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onResumePlay(String str) {
                Iterator<InterfaceC588410N5z> it2 = this.LL.LIZLLL().iterator();
                while (it2.hasNext()) {
                    it2.next().onResumePlay(str);
                }
                if (C300210Bpj.LIZ()) {
                    C1508330pLz.LJ();
                } else {
                    C1508330pLz.LJFF();
                }
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onRetryOnError(C1481290oeN c1481290oeN) {
                Iterator<InterfaceC588410N5z> it2 = this.LL.LIZLLL().iterator();
                while (it2.hasNext()) {
                    it2.next().LL(String.valueOf(c1481290oeN));
                }
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onPlayCompleted(String str, int i) {
                Iterator<InterfaceC588410N5z> it2 = this.LL.LIZLLL().iterator();
                while (it2.hasNext()) {
                    it2.next().onPlayCompleted(str);
                }
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onBufferedPercent(String str, long j, int i) {
                Iterator<InterfaceC588410N5z> it2 = this.LL.LIZLLL().iterator();
                while (it2.hasNext()) {
                    it2.next().onBufferedPercent(str, j, i);
                }
            }
        };
    }
}
