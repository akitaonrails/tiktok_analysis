package X;

import Y.ACallableS0S0203100_23;
import Y.ACallableS251S0200000_23;
import Y.ARunnableS123S0100000_23;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.view.Surface;
import android.view.TextureView;
import androidx.fragment.app.Fragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.pictureinpicture.PiPManager;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.PdpFragment;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.dependency.live.LiveDependencyService;
import com.ss.android.ugc.aweme.ecommerce.dependency.log.LogDependencyService;
import com.ss.android.ugc.aweme.ecommerce.dependency.player.PlayerDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.event.ILogDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.live.ILiveDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.player.IPlayerDependencyService;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS212S0000000_23;
import kotlin.jvm.internal.AwS567S0100000_23;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pM2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1508360pM2 implements InterfaceC1765740w3A {
    public final C1765720w38 LIZ;
    public boolean LIZIZ;
    public SurfaceTexture LIZJ;
    public Video LJ;
    public int LJFF;
    public long LJI;
    public InterfaceC1508380pM4 LJII;
    public boolean LJIIIIZZ;
    public int LJIIJ;
    public boolean LJIIJJI;
    public ARunnableS123S0100000_23 LJIILIIL;
    public long LJIILJJIL;
    public String LJIILLIIL;
    public String LJIIZILJ;
    public SeaPdpViewModel LJIJ;
    public final C1507720pL0 LJIJI;
    public final C01GW LIZLLL = C452501pT.LIZIZ(AFwS212S0000000_23.get$arr$(5));
    public float LJIIIZ = -1.0f;
    public final C01GW LJIIL = C452501pT.LIZIZ(AFwS212S0000000_23.get$arr$(4));
    public final C01GW LJIILL = C452501pT.LIZIZ(new AwS567S0100000_23(this, 40));

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
        InterfaceC1508380pM4 interfaceC1508380pM4 = this.LJII;
        if (interfaceC1508380pM4 != null) {
            ((Handler) this.LJIIL.getValue()).removeCallbacksAndMessages(null);
            interfaceC1508380pM4.LIZ();
            interfaceC1508380pM4.LJJIIZI();
        }
    }

    @Override // X.InterfaceC1765740w3A
    public final void release() {
        this.LIZIZ = false;
        SurfaceTexture surfaceTexture = this.LIZJ;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        this.LIZJ = null;
        InterfaceC1508380pM4 interfaceC1508380pM4 = this.LJII;
        if (interfaceC1508380pM4 != null) {
            this.LJIILJJIL = 0L;
            ((Handler) this.LJIIL.getValue()).removeCallbacksAndMessages(null);
            interfaceC1508380pM4.LJJL();
            interfaceC1508380pM4.LJJIJ(null);
            interfaceC1508380pM4.LJJIIJZLJL();
            interfaceC1508380pM4.release();
        }
        this.LJII = null;
    }

    @Override // X.InterfaceC1765740w3A
    public final void stop() {
    }

    public final List<InterfaceC588410N5z> LIZLLL() {
        return (List) this.LIZLLL.getValue();
    }

    public final void LJI() {
        ((Handler) this.LJIIL.getValue()).removeCallbacksAndMessages(null);
        ARunnableS123S0100000_23 aRunnableS123S0100000_23 = new ARunnableS123S0100000_23(this, 2);
        this.LJIILIIL = aRunnableS123S0100000_23;
        C786410Ut5.LJLIIL(1000L, (Handler) this.LJIIL.getValue(), aRunnableS123S0100000_23);
    }

    @Override // X.InterfaceC1765740w3A
    public final void LJIIIIZZ() {
        InterfaceC1508380pM4 interfaceC1508380pM4 = this.LJII;
        if (interfaceC1508380pM4 != null) {
            interfaceC1508380pM4.LJIJJ();
        }
    }

    @Override // X.InterfaceC1765740w3A
    public final boolean isMute() {
        InterfaceC1508380pM4 interfaceC1508380pM4 = this.LJII;
        if (interfaceC1508380pM4 != null) {
            return interfaceC1508380pM4.isMute();
        }
        return false;
    }

    @Override // X.InterfaceC1765740w3A
    public final void mute() {
        InterfaceC1508380pM4 interfaceC1508380pM4 = this.LJII;
        if (interfaceC1508380pM4 != null) {
            interfaceC1508380pM4.LJFF();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1765740w3A
    public final void resume() {
        InterfaceC1508380pM4 interfaceC1508380pM4;
        if (this.LIZIZ && (interfaceC1508380pM4 = this.LJII) != null) {
            LJI();
            interfaceC1508380pM4.LJJIIZ();
            interfaceC1508380pM4.LJJIJ(this.LJIJI);
            if (!C07EP.LIZ()) {
                interfaceC1508380pM4.LJIILIIL(this.LJ, this.LJIJI);
                return;
            }
            Video video = this.LJ;
            int i = 0;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            C581360Mr8 c581360Mr8LIZ = C582060MsG.LIZ();
            c581360Mr8LIZ.LJII = this.LJIILLIIL;
            Pair[] pairArr = new Pair[1];
            String str = this.LJIIZILJ;
            if (str == null) {
                str = "";
            }
            pairArr[0] = new Pair("gec", str);
            c581360Mr8LIZ.LJIIIZ = C2097608Jq.LJIIJ(pairArr);
            interfaceC1508380pM4.LJJIFFI(new C584150Mvd(video, i, c581360Mr8LIZ, objArr2 == true ? 1 : 0, objArr == true ? 1 : 0, null, 524270), this.LJIJI);
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

    @Override // X.InterfaceC1765740w3A
    public final int getNetworkSpeed() {
        return C1479130oat.LJII();
    }

    @Override // X.InterfaceC1765740w3A
    public final void retry() {
        resume();
    }

    /* JADX WARN: Type inference failed for: r0v20, types: [X.0pL0] */
    public C1508360pM2(C1765720w38 c1765720w38) {
        AnonymousClass0317 anonymousClass0317CreateIPlayerDependencyServicebyMonsterPlugin;
        AnonymousClass0317 anonymousClass0317CreateIPlayerDependencyServicebyMonsterPlugin2;
        boolean z;
        boolean z2;
        String name;
        this.LIZ = c1765720w38;
        final float elevation = c1765720w38.getElevation();
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateIPlayerDependencyServicebyMonsterPlugin = PlayerDependencyService.createIPlayerDependencyServicebyMonsterPlugin(false);
            if (anonymousClass0317CreateIPlayerDependencyServicebyMonsterPlugin != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            String name2 = IPlayerDependencyService.class.getName();
            if (anonymousClass0317CreateIPlayerDependencyServicebyMonsterPlugin != null) {
                name = anonymousClass0317CreateIPlayerDependencyServicebyMonsterPlugin.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z2);
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
                z = true;
            } else {
                z = false;
            }
            C1AQS.LIZJ(jElapsedRealtime2, 1, IPlayerDependencyService.class.getName(), anonymousClass0317CreateIPlayerDependencyServicebyMonsterPlugin2 != null ? anonymousClass0317CreateIPlayerDependencyServicebyMonsterPlugin2.getClass().getName() : null, z);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIPlayerDependencyServicebyMonsterPlugin2 = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IPlayerDependencyService.class);
        }
        this.LJII = iPlayerDependencyService.getPlayerManager(((IPlayerDependencyService) anonymousClass0317CreateIPlayerDependencyServicebyMonsterPlugin2).otherSceneFeedUseMediaBoxExp());
        if (!LIZLLL().contains(c1765720w38)) {
            LIZLLL().add(c1765720w38);
        }
        c1765720w38.m68getVideoView().setSurfaceTextureListener(new TextureView.SurfaceTextureListener() { // from class: X.0pM3
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
                    C1508360pM2 c1508360pM2 = this.LL;
                    c1508360pM2.LIZJ = surfaceTexture;
                    InterfaceC1508380pM4 interfaceC1508380pM4 = c1508360pM2.LJII;
                    if (interfaceC1508380pM4 != null) {
                        interfaceC1508380pM4.setSurface(new Surface(this.LL.LIZJ));
                    }
                } else {
                    C1508360pM2 c1508360pM22 = this.LL;
                    SurfaceTexture surfaceTexture3 = c1508360pM22.LIZJ;
                    if (surfaceTexture3 != null && !Intrinsics.LJFF(surfaceTexture3, c1508360pM22.LIZ.m68getVideoView().getSurfaceTexture())) {
                        c1508360pM22.LIZ.m68getVideoView().setSurfaceTexture(surfaceTexture3);
                    }
                }
                C1508360pM2 c1508360pM23 = this.LL;
                c1508360pM23.LIZIZ = true;
                if (c1508360pM23.LJIIIIZZ) {
                    c1508360pM23.LJIIIIZZ = false;
                    InterfaceC1508380pM4 interfaceC1508380pM42 = c1508360pM23.LJII;
                    if (interfaceC1508380pM42 != null) {
                        c1508360pM23.LJI();
                        interfaceC1508380pM42.LJJIJ(c1508360pM23.LJIJI);
                        if (!C07EP.LIZ()) {
                            interfaceC1508380pM42.LJII(c1508360pM23.LJ);
                        } else {
                            Video video = c1508360pM23.LJ;
                            C581360Mr8 c581360Mr8LIZ = C582060MsG.LIZ();
                            c581360Mr8LIZ.LJII = c1508360pM23.LJIILLIIL;
                            Pair[] pairArr = new Pair[1];
                            String str = c1508360pM23.LJIIZILJ;
                            if (str == null) {
                                str = "";
                            }
                            pairArr[0] = new Pair("gec", str);
                            c581360Mr8LIZ.LJIIIZ = C2097608Jq.LJIIJ(pairArr);
                            interfaceC1508380pM42.LJJII(new C584150Mvd(video, 0, c581360Mr8LIZ, false, false, null, 524270));
                        }
                        interfaceC1508380pM42.LJJIIZ();
                    }
                }
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
                if (C300210Bpj.LIZ() && C1507750pL3.LIZIZ == EnumC1508450pMB.PREVIEW) {
                    this.LL.LIZ.setElevation(elevation);
                } else {
                    if (!C300210Bpj.LIZ()) {
                        return;
                    }
                    if (C1507750pL3.LIZIZ != EnumC1508450pMB.PORTRAIT && C1507750pL3.LIZIZ != EnumC1508450pMB.HORIZONTAL) {
                        return;
                    }
                    this.LL.LIZ.setElevation(((Number) C304860BxE.LIZ.getValue()).floatValue());
                }
            }
        });
        this.LJIJI = new OnUIPlayListener() { // from class: X.0pL0
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
            public final /* synthetic */ void onBuffering(String str, boolean z3) {
                C583620Mum.LJ(this, str, z3);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onBuffering(String str, boolean z3, C1480430ocz c1480430ocz) {
                C583620Mum.LJFF(this, str, z3, c1480430ocz);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onCompleteLoaded(String str, boolean z3) {
                C583620Mum.LJII(this, str, z3);
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
            public final /* synthetic */ void onDecoderBuffering(String str, boolean z3) {
                C583620Mum.LJIIJ(this, str, z3);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onDecoderBuffering(String str, boolean z3, C1480430ocz c1480430ocz) {
                C583620Mum.LJIIJJI(this, str, z3, c1480430ocz);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onDecoderBuffering(boolean z3) {
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
            public final /* synthetic */ void onPlayStop(String str, boolean z3) {
                C583620Mum.LJJIJIL(this, str, z3);
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
            public final /* synthetic */ void onSeekEnd(String str, boolean z3) {
                C583620Mum.LJJJJLL(this, str, z3);
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
            public final void onBuffering(boolean z3) {
                AnonymousClass0317 anonymousClass0317CreateILogDependencyServicebyMonsterPlugin;
                boolean z4;
                String name3;
                if (z3) {
                    C1508360pM2 c1508360pM2 = this.LL;
                    if (!c1508360pM2.LJIIJJI) {
                        Iterator<InterfaceC588410N5z> it2 = c1508360pM2.LIZLLL().iterator();
                        while (it2.hasNext()) {
                            it2.next().onBuffering(true);
                        }
                        C1124304aX.LIZ.getClass();
                        if (C1124304aX.LIZIZ == -1) {
                            C1124304aX.LIZIZ = SystemClock.elapsedRealtime();
                        }
                        this.LL.LJIIJJI = true;
                        return;
                    }
                    return;
                }
                C1508360pM2 c1508360pM22 = this.LL;
                if (c1508360pM22.LJIIJJI) {
                    Iterator<InterfaceC588410N5z> it3 = c1508360pM22.LIZLLL().iterator();
                    while (it3.hasNext()) {
                        it3.next().onBuffering(false);
                    }
                    C1124304aX.LIZ.getClass();
                    Callable callable = new Callable() { // from class: X.05Wq
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            AnonymousClass0317 anonymousClass0317CreateILogDependencyServicebyMonsterPlugin2;
                            IECommerceHostService iECommerceHostService;
                            C1C7U.LIZ("EcommercePlayerLogHelper@30bf.reportVideoBlock$1");
                            try {
                                long jElapsedRealtime3 = SystemClock.elapsedRealtime();
                                long j = C1124304aX.LIZIZ;
                                long j2 = jElapsedRealtime3 - j;
                                if (j != -1 && j2 > 80) {
                                    JSONObject jSONObject = new JSONObject();
                                    jSONObject.put("duration", j2);
                                    jSONObject.put("enter_from", "TEMAI");
                                    if (C034S.LIZ()) {
                                        C1120604Zw.LIZ.LIZ();
                                        long jElapsedRealtime4 = SystemClock.elapsedRealtime();
                                        Object service = ServiceManager.get().getService(IApplicationDependencyService.class);
                                        IECommerceHostService iECommerceHostService2 = (IECommerceHostService) service;
                                        C1AQS.LIZJ(jElapsedRealtime4, 1, IApplicationDependencyService.class.getName(), iECommerceHostService2 != null ? iECommerceHostService2.getClass().getName() : null, iECommerceHostService2 != null);
                                        iECommerceHostService = (IECommerceHostService) service;
                                    } else {
                                        C1120604Zw.LIZ.LIZ();
                                        iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
                                    }
                                    jSONObject.put("is_cold_start_first_launch", ((IApplicationDependencyService) iECommerceHostService).isFirstInstallAndFirstLaunch() ? 1 : 0);
                                    C1507790pL7.LIZ.getClass();
                                    C1507790pL7.LIZLLL("video_block", jSONObject);
                                }
                                C1124304aX.LIZIZ = -1L;
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                                if (C034S.LIZ()) {
                                    C1120604Zw.LIZ.LIZ();
                                    long jElapsedRealtime5 = SystemClock.elapsedRealtime();
                                    anonymousClass0317CreateILogDependencyServicebyMonsterPlugin2 = LogDependencyService.createILogDependencyServicebyMonsterPlugin(false);
                                    C1AQS.LIZJ(jElapsedRealtime5, 1, ILogDependencyService.class.getName(), anonymousClass0317CreateILogDependencyServicebyMonsterPlugin2 != null ? anonymousClass0317CreateILogDependencyServicebyMonsterPlugin2.getClass().getName() : null, anonymousClass0317CreateILogDependencyServicebyMonsterPlugin2 != null);
                                } else {
                                    C1120604Zw.LIZ.LIZ();
                                    anonymousClass0317CreateILogDependencyServicebyMonsterPlugin2 = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ILogDependencyService.class);
                                }
                                ((ILogDependencyService) anonymousClass0317CreateILogDependencyServicebyMonsterPlugin2).crashlyticsWrapperCatchException(e);
                            }
                            Unit unit = Unit.LIZ;
                            C1C7U.LIZIZ("EcommercePlayerLogHelper@30bf.reportVideoBlock$1");
                            return unit;
                        }
                    };
                    if (C034S.LIZ()) {
                        C1120604Zw.LIZ.LIZ();
                        long jElapsedRealtime3 = SystemClock.elapsedRealtime();
                        anonymousClass0317CreateILogDependencyServicebyMonsterPlugin = LogDependencyService.createILogDependencyServicebyMonsterPlugin(false);
                        if (anonymousClass0317CreateILogDependencyServicebyMonsterPlugin != null) {
                            z4 = true;
                        } else {
                            z4 = false;
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
                    C15O7.LIZIZ(callable, ((ILogDependencyService) anonymousClass0317CreateILogDependencyServicebyMonsterPlugin).getExecutorService(), null);
                    this.LL.LJIIJJI = false;
                }
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onPausePlay(String str) {
                Fragment fragment;
                AnonymousClass0317 anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin;
                boolean z3;
                AnonymousClass0317 anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin2;
                AnonymousClass0317 anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin3;
                boolean z4;
                String name3;
                boolean z5;
                String name4;
                SeaPdpViewModel seaPdpViewModel = this.LL.LJIJ;
                if (seaPdpViewModel != null) {
                    seaPdpViewModel.oR2();
                }
                String name5 = null;
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
                        String name6 = ILiveDependencyService.class.getName();
                        if (anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin2 != null) {
                            name4 = anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin2.getClass().getName();
                        } else {
                            name4 = null;
                        }
                        C1AQS.LIZJ(jElapsedRealtime3, 1, name6, name4, z5);
                    } else {
                        C1120604Zw.LIZ.LIZ();
                        anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin2 = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ILiveDependencyService.class);
                    }
                    if (!((ILiveDependencyService) anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin2).isInternalWindowUserManualMute()) {
                        this.LL.getClass();
                        if (C034S.LIZ()) {
                            C1120604Zw.LIZ.LIZ();
                            long jElapsedRealtime4 = SystemClock.elapsedRealtime();
                            anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin3 = LiveDependencyService.createILiveDependencyServicebyMonsterPlugin(false);
                            if (anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin3 != null) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            String name7 = ILiveDependencyService.class.getName();
                            if (anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin3 != null) {
                                name3 = anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin3.getClass().getName();
                            } else {
                                name3 = null;
                            }
                            C1AQS.LIZJ(jElapsedRealtime4, 1, name7, name3, z4);
                        } else {
                            C1120604Zw.LIZ.LIZ();
                            anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin3 = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ILiveDependencyService.class);
                        }
                        ((ILiveDependencyService) anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin3).muteInternalWindow(false);
                    }
                } else if (C1507750pL3.LIZIZ == EnumC1508450pMB.PREVIEW && C1507750pL3.LIZ != EnumC1508940pMy.PLAYER_START && (fragment = (Fragment) this.LL.LJIILL.getValue()) != null && fragment.isResumed()) {
                    this.LL.LIZJ(EnumC1486170omF.PLAY.getValue());
                }
                Iterator<InterfaceC588410N5z> it2 = this.LL.LIZLLL().iterator();
                while (it2.hasNext()) {
                    it2.next().onPausePlay(str);
                }
                if (!C300210Bpj.LIZ()) {
                    this.LL.getClass();
                    if (C034S.LIZ()) {
                        C1120604Zw.LIZ.LIZ();
                        long jElapsedRealtime5 = SystemClock.elapsedRealtime();
                        anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin = LiveDependencyService.createILiveDependencyServicebyMonsterPlugin(false);
                        if (anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin != null) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        String name8 = ILiveDependencyService.class.getName();
                        if (anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin != null) {
                            name5 = anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin.getClass().getName();
                        }
                        C1AQS.LIZJ(jElapsedRealtime5, 1, name8, name5, z3);
                    } else {
                        C1120604Zw.LIZ.LIZ();
                        anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ILiveDependencyService.class);
                    }
                    ((ILiveDependencyService) anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin).setCurrentPlayerMute(false);
                }
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onPlayCompleted(String str) {
                SeaPdpViewModel seaPdpViewModel = this.LL.LJIJ;
                if (seaPdpViewModel != null) {
                    seaPdpViewModel.oR2();
                }
                Iterator<InterfaceC588410N5z> it2 = this.LL.LIZLLL().iterator();
                while (it2.hasNext()) {
                    it2.next().onPlayCompleted(str);
                }
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onPlayCompletedFirstTime(String str) {
                Fragment fragment;
                SeaPdpViewModel seaPdpViewModel = this.LL.LJIJ;
                if (seaPdpViewModel != null) {
                    seaPdpViewModel.oR2();
                }
                if (C1507750pL3.LIZIZ == EnumC1508450pMB.PREVIEW && (fragment = (Fragment) this.LL.LJIILL.getValue()) != null && fragment.isResumed() && !C300210Bpj.LIZ()) {
                    this.LL.LIZJ(EnumC1486170omF.PLAY.getValue());
                }
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onPlayFailed(C1481290oeN c1481290oeN) {
                AnonymousClass0317 anonymousClass0317CreateILogDependencyServicebyMonsterPlugin;
                String name3;
                Iterator<InterfaceC588410N5z> it2 = this.LL.LIZLLL().iterator();
                while (it2.hasNext()) {
                    it2.next().LJLLI(String.valueOf(c1481290oeN));
                }
                C1124304aX c1124304aX = C1124304aX.LIZ;
                Video video = this.LL.LJ;
                c1124304aX.getClass();
                if (c1481290oeN != null && video != null) {
                    ACallableS251S0200000_23 aCallableS251S0200000_23 = new ACallableS251S0200000_23(video, c1481290oeN, 0);
                    if (C034S.LIZ()) {
                        C1120604Zw.LIZ.LIZ();
                        long jElapsedRealtime3 = SystemClock.elapsedRealtime();
                        boolean z3 = false;
                        anonymousClass0317CreateILogDependencyServicebyMonsterPlugin = LogDependencyService.createILogDependencyServicebyMonsterPlugin(false);
                        if (anonymousClass0317CreateILogDependencyServicebyMonsterPlugin != null) {
                            z3 = true;
                        }
                        String name4 = ILogDependencyService.class.getName();
                        if (anonymousClass0317CreateILogDependencyServicebyMonsterPlugin != null) {
                            name3 = anonymousClass0317CreateILogDependencyServicebyMonsterPlugin.getClass().getName();
                        } else {
                            name3 = null;
                        }
                        C1AQS.LIZJ(jElapsedRealtime3, 1, name4, name3, z3);
                    } else {
                        C1120604Zw.LIZ.LIZ();
                        anonymousClass0317CreateILogDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ILogDependencyService.class);
                    }
                    C15O7.LIZIZ(aCallableS251S0200000_23, ((ILogDependencyService) anonymousClass0317CreateILogDependencyServicebyMonsterPlugin).getExecutorService(), null);
                }
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onPlayProgressChange(float f) {
                Iterator<InterfaceC588410N5z> it2 = this.LL.LIZLLL().iterator();
                while (it2.hasNext()) {
                    it2.next().onPlayProgressChange(f);
                }
                C1508360pM2 c1508360pM2 = this.LL;
                if (c1508360pM2.LJIIIZ == f) {
                    c1508360pM2.LJIIJ++;
                } else {
                    c1508360pM2.LJIIJ = 0;
                }
                if (c1508360pM2.LJIIJ > 1) {
                    onBuffering(true);
                } else {
                    onBuffering(false);
                }
                this.LL.LJIIIZ = f;
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onPreparePlay(String str) {
                AnonymousClass0317 anonymousClass0317CreateILogDependencyServicebyMonsterPlugin;
                String name3;
                this.LL.LJI = SystemClock.elapsedRealtime();
                Iterator<InterfaceC588410N5z> it2 = this.LL.LIZLLL().iterator();
                while (it2.hasNext()) {
                    it2.next().onPreparePlay(str);
                }
                C1124304aX.LIZ.getClass();
                Callable callable = new Callable() { // from class: X.05Ws
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        AnonymousClass0317 anonymousClass0317CreateILogDependencyServicebyMonsterPlugin2;
                        IECommerceHostService iECommerceHostService;
                        C1C7U.LIZ("EcommercePlayerLogHelper@30bf.reportVideoRequest$1");
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("enter_from", "TEMAI");
                            if (C034S.LIZ()) {
                                C1120604Zw.LIZ.LIZ();
                                long jElapsedRealtime3 = SystemClock.elapsedRealtime();
                                Object service = ServiceManager.get().getService(IApplicationDependencyService.class);
                                IECommerceHostService iECommerceHostService2 = (IECommerceHostService) service;
                                C1AQS.LIZJ(jElapsedRealtime3, 1, IApplicationDependencyService.class.getName(), iECommerceHostService2 != null ? iECommerceHostService2.getClass().getName() : null, iECommerceHostService2 != null);
                                iECommerceHostService = (IECommerceHostService) service;
                            } else {
                                C1120604Zw.LIZ.LIZ();
                                iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
                            }
                            jSONObject.put("is_cold_start_first_launch", ((IApplicationDependencyService) iECommerceHostService).isFirstInstallAndFirstLaunch() ? 1 : 0);
                            C1507790pL7.LIZ.getClass();
                            C1507790pL7.LIZLLL("video_request", jSONObject);
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            if (C034S.LIZ()) {
                                C1120604Zw.LIZ.LIZ();
                                long jElapsedRealtime4 = SystemClock.elapsedRealtime();
                                anonymousClass0317CreateILogDependencyServicebyMonsterPlugin2 = LogDependencyService.createILogDependencyServicebyMonsterPlugin(false);
                                C1AQS.LIZJ(jElapsedRealtime4, 1, ILogDependencyService.class.getName(), anonymousClass0317CreateILogDependencyServicebyMonsterPlugin2 != null ? anonymousClass0317CreateILogDependencyServicebyMonsterPlugin2.getClass().getName() : null, anonymousClass0317CreateILogDependencyServicebyMonsterPlugin2 != null);
                            } else {
                                C1120604Zw.LIZ.LIZ();
                                anonymousClass0317CreateILogDependencyServicebyMonsterPlugin2 = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ILogDependencyService.class);
                            }
                            ((ILogDependencyService) anonymousClass0317CreateILogDependencyServicebyMonsterPlugin2).crashlyticsWrapperCatchException(e);
                        }
                        Unit unit = Unit.LIZ;
                        C1C7U.LIZIZ("EcommercePlayerLogHelper@30bf.reportVideoRequest$1");
                        return unit;
                    }
                };
                if (C034S.LIZ()) {
                    C1120604Zw.LIZ.LIZ();
                    long jElapsedRealtime3 = SystemClock.elapsedRealtime();
                    boolean z3 = false;
                    anonymousClass0317CreateILogDependencyServicebyMonsterPlugin = LogDependencyService.createILogDependencyServicebyMonsterPlugin(false);
                    if (anonymousClass0317CreateILogDependencyServicebyMonsterPlugin != null) {
                        z3 = true;
                    }
                    String name4 = ILogDependencyService.class.getName();
                    if (anonymousClass0317CreateILogDependencyServicebyMonsterPlugin != null) {
                        name3 = anonymousClass0317CreateILogDependencyServicebyMonsterPlugin.getClass().getName();
                    } else {
                        name3 = null;
                    }
                    C1AQS.LIZJ(jElapsedRealtime3, 1, name4, name3, z3);
                } else {
                    C1120604Zw.LIZ.LIZ();
                    anonymousClass0317CreateILogDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ILogDependencyService.class);
                }
                C15O7.LIZIZ(callable, ((ILogDependencyService) anonymousClass0317CreateILogDependencyServicebyMonsterPlugin).getExecutorService(), null);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onRenderFirstFrame(C1480420ocy c1480420ocy) {
                int bitrate;
                int iLIZLLL;
                AnonymousClass0317 anonymousClass0317CreateILogDependencyServicebyMonsterPlugin;
                String name3;
                SeaPdpViewModel seaPdpViewModel = this.LL.LJIJ;
                if (seaPdpViewModel != null) {
                    seaPdpViewModel.dS2();
                }
                if (C300210Bpj.LIZ()) {
                    C1508360pM2.LJ();
                } else if (C1507750pL3.LIZIZ == EnumC1508450pMB.PREVIEW && this.LL.LJIILL.getValue() != null) {
                    this.LL.LIZJ(EnumC1486170omF.PAUSE.getValue());
                }
                Iterator<InterfaceC588410N5z> it2 = this.LL.LIZLLL().iterator();
                while (it2.hasNext()) {
                    it2.next().LJII();
                }
                InterfaceC1508380pM4 interfaceC1508380pM4 = this.LL.LJII;
                boolean z3 = false;
                if (interfaceC1508380pM4 != null) {
                    bitrate = (int) interfaceC1508380pM4.getBitrate();
                } else {
                    bitrate = 0;
                }
                InterfaceC1508380pM4 interfaceC1508380pM42 = this.LL.LJII;
                if (interfaceC1508380pM42 != null) {
                    iLIZLLL = interfaceC1508380pM42.LIZLLL();
                } else {
                    iLIZLLL = 0;
                }
                if (this.LL.LJI != 0) {
                    long jElapsedRealtime3 = SystemClock.elapsedRealtime();
                    C1508360pM2 c1508360pM2 = this.LL;
                    long j = jElapsedRealtime3 - c1508360pM2.LJI;
                    C1124304aX c1124304aX = C1124304aX.LIZ;
                    Video video = c1508360pM2.LJ;
                    int i = c1508360pM2.LJFF;
                    c1124304aX.getClass();
                    if (video != null && c1480420ocy != null) {
                        ACallableS0S0203100_23 aCallableS0S0203100_23 = new ACallableS0S0203100_23(i, bitrate, iLIZLLL, j, video, c1480420ocy, 0);
                        if (C034S.LIZ()) {
                            C1120604Zw.LIZ.LIZ();
                            long jElapsedRealtime4 = SystemClock.elapsedRealtime();
                            anonymousClass0317CreateILogDependencyServicebyMonsterPlugin = LogDependencyService.createILogDependencyServicebyMonsterPlugin(false);
                            if (anonymousClass0317CreateILogDependencyServicebyMonsterPlugin != null) {
                                z3 = true;
                            }
                            String name4 = ILogDependencyService.class.getName();
                            if (anonymousClass0317CreateILogDependencyServicebyMonsterPlugin != null) {
                                name3 = anonymousClass0317CreateILogDependencyServicebyMonsterPlugin.getClass().getName();
                            } else {
                                name3 = null;
                            }
                            C1AQS.LIZJ(jElapsedRealtime4, 1, name4, name3, z3);
                        } else {
                            C1120604Zw.LIZ.LIZ();
                            anonymousClass0317CreateILogDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ILogDependencyService.class);
                        }
                        C15O7.LIZIZ(aCallableS0S0203100_23, ((ILogDependencyService) anonymousClass0317CreateILogDependencyServicebyMonsterPlugin).getExecutorService(), null);
                    }
                    this.LL.LJI = 0L;
                }
                C1508360pM2.LJFF();
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onResumePlay(String str) {
                SeaPdpViewModel seaPdpViewModel = this.LL.LJIJ;
                if (seaPdpViewModel != null) {
                    seaPdpViewModel.dS2();
                }
                if (C300210Bpj.LIZ()) {
                    C1508360pM2.LJ();
                } else if (C1507750pL3.LIZIZ == EnumC1508450pMB.PREVIEW && this.LL.LJIILL.getValue() != null) {
                    this.LL.LIZJ(EnumC1486170omF.PAUSE.getValue());
                }
                Iterator<InterfaceC588410N5z> it2 = this.LL.LIZLLL().iterator();
                while (it2.hasNext()) {
                    it2.next().onResumePlay(str);
                }
                C1508360pM2.LJFF();
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onRetryOnError(C1481290oeN c1481290oeN) {
                Iterator<InterfaceC588410N5z> it2 = this.LL.LIZLLL().iterator();
                while (it2.hasNext()) {
                    it2.next().LL(String.valueOf(c1481290oeN));
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

    public final void LIZJ(int i) {
        boolean z;
        PdpFragment pdpFragment;
        PdpViewModel pdpViewModelJS;
        if (i == EnumC1486170omF.PAUSE.getValue()) {
            z = true;
        } else {
            z = false;
        }
        Fragment fragment = (Fragment) this.LJIILL.getValue();
        if ((fragment instanceof PdpFragment) && (pdpFragment = (PdpFragment) fragment) != null && (pdpViewModelJS = pdpFragment.JS()) != null) {
            EnumC1508600pMQ enumC1508600pMQ = EnumC1508600pMQ.DESC_VIDEO;
            PiPManager piPManager = pdpViewModelJS.w;
            if (piPManager != null) {
                piPManager.OM2(enumC1508600pMQ, z);
            }
        }
    }

    @Override // X.InterfaceC1765740w3A
    public final void LJIILL(float f) {
        InterfaceC1508380pM4 interfaceC1508380pM4 = this.LJII;
        if (interfaceC1508380pM4 != null) {
            interfaceC1508380pM4.seek(f);
        }
    }

    @Override // X.InterfaceC1765740w3A
    public final void start(int i) {
        if (this.LIZIZ) {
            this.LJIIIIZZ = false;
            InterfaceC1508380pM4 interfaceC1508380pM4 = this.LJII;
            if (interfaceC1508380pM4 != null) {
                LJI();
                interfaceC1508380pM4.LJJIJ(this.LJIJI);
                if (!C07EP.LIZ()) {
                    interfaceC1508380pM4.LJIJJLI(this.LJ, i);
                } else {
                    Video video = this.LJ;
                    C581360Mr8 c581360Mr8LIZ = C582060MsG.LIZ();
                    c581360Mr8LIZ.LJII = this.LJIILLIIL;
                    Pair[] pairArr = new Pair[1];
                    String str = this.LJIIZILJ;
                    if (str == null) {
                        str = "";
                    }
                    pairArr[0] = new Pair("gec", str);
                    c581360Mr8LIZ.LJIIIZ = C2097608Jq.LJIIJ(pairArr);
                    boolean z = false;
                    interfaceC1508380pM4.LJJII(new C584150Mvd(video, i, c581360Mr8LIZ, z, z, null, 524262));
                }
                interfaceC1508380pM4.LJJIIZ();
                return;
            }
            return;
        }
        this.LJIIIIZZ = true;
    }
}
