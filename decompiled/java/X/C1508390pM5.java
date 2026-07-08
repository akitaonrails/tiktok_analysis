package X;

import Y.ACallableS0S0203100_23;
import Y.ACallableS251S0200000_23;
import Y.ARunnableS123S0100000_23;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.view.Surface;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
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
import java.util.Set;
import java.util.concurrent.Callable;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS212S0000000_23;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pM5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1508390pM5 implements InterfaceC1765740w3A {
    public final InterfaceC497601wk LIZ;
    public boolean LIZIZ;
    public SurfaceTexture LIZJ;
    public final C01GW LIZLLL;
    public Video LJ;
    public int LJFF;
    public long LJI;
    public InterfaceC1508380pM4 LJII;
    public float LJIIIIZZ;
    public float LJIIIZ;
    public int LJIIJ;
    public boolean LJIIJJI;
    public final C01GW LJIIL;
    public ARunnableS123S0100000_23 LJIILIIL;
    public long LJIILJJIL;
    public boolean LJIILL;
    public EnumC1508950pMz LJIILLIIL;
    public String LJIIZILJ;
    public boolean LJIJ;
    public C09AY LJIJI;
    public C09AY LJIJJ;
    public boolean LJIJJLI;
    public final C1507730pL1 LJIL;
    public boolean LJJ;

    public C1508390pM5() {
        this(0);
    }

    @Override // X.InterfaceC1765740w3A
    public final void LIZ() {
    }

    @Override // X.InterfaceC1765740w3A
    public final void LIZIZ() {
    }

    @Override // X.InterfaceC1765740w3A
    public final void pause() {
        this.LJIIJJI = false;
        this.LJIIIIZZ = -1.0f;
        InterfaceC1508380pM4 interfaceC1508380pM4 = this.LJII;
        if (interfaceC1508380pM4 != null) {
            ((Handler) this.LJIIL.getValue()).removeCallbacksAndMessages(null);
            interfaceC1508380pM4.LIZ();
            interfaceC1508380pM4.LJJIIZI();
        }
    }

    public final long LIZLLL() {
        InterfaceC1508380pM4 interfaceC1508380pM4 = this.LJII;
        if (interfaceC1508380pM4 != null) {
            return interfaceC1508380pM4.getDuration();
        }
        return 0L;
    }

    public final Set<InterfaceC1507740pL2> LJFF() {
        return (Set) this.LIZLLL.getValue();
    }

    public final boolean LJI() {
        InterfaceC1508380pM4 interfaceC1508380pM4 = this.LJII;
        if (interfaceC1508380pM4 != null) {
            return interfaceC1508380pM4.isPlaying();
        }
        return false;
    }

    @Override // X.InterfaceC1765740w3A
    public final void LJIIIIZZ() {
        InterfaceC1508380pM4 interfaceC1508380pM4 = this.LJII;
        if (interfaceC1508380pM4 != null) {
            interfaceC1508380pM4.LJIJJ();
        }
        Iterator<T> it2 = LJFF().iterator();
        while (it2.hasNext()) {
            ((InterfaceC1507740pL2) it2.next()).ik(false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJIIJJI() {
        if (this.LIZJ == null) {
            return;
        }
        this.LJIILL = false;
        this.LJIJ = false;
        InterfaceC1508380pM4 interfaceC1508380pM4 = this.LJII;
        if (interfaceC1508380pM4 != null) {
            LJIIL();
            interfaceC1508380pM4.LJJIJ(this.LJIL);
            if (C07EP.LIZ()) {
                C584150Mvd c584150Mvd = new C584150Mvd(this.LJ, 0, LJ(), 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, 524270);
                c584150Mvd.LJIJJ = true;
                interfaceC1508380pM4.LJJII(c584150Mvd);
            } else {
                interfaceC1508380pM4.LJII(this.LJ);
            }
            interfaceC1508380pM4.LJJIIZ();
        }
    }

    public final void LJIIL() {
        ((Handler) this.LJIIL.getValue()).removeCallbacksAndMessages(null);
        ARunnableS123S0100000_23 aRunnableS123S0100000_23 = new ARunnableS123S0100000_23(this, 116);
        this.LJIILIIL = aRunnableS123S0100000_23;
        C786410Ut5.LJLIIL(1000L, (Handler) this.LJIIL.getValue(), aRunnableS123S0100000_23);
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
        Iterator<T> it2 = LJFF().iterator();
        while (it2.hasNext()) {
            ((InterfaceC1507740pL2) it2.next()).ik(true);
        }
    }

    @Override // X.InterfaceC1765740w3A
    public final void release() {
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

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1765740w3A
    public final void resume() {
        InterfaceC1508380pM4 interfaceC1508380pM4;
        if (this.LIZJ == null || (interfaceC1508380pM4 = this.LJII) == null) {
            return;
        }
        LJIIL();
        interfaceC1508380pM4.LJJIIZ();
        interfaceC1508380pM4.LJJIJ(this.LJIL);
        if (!C07EP.LIZ()) {
            interfaceC1508380pM4.LJIILIIL(this.LJ, this.LJIL);
            return;
        }
        C584150Mvd c584150Mvd = new C584150Mvd(this.LJ, 0, LJ(), 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, 524270);
        c584150Mvd.LJIJJ = true;
        interfaceC1508380pM4.LJJIFFI(c584150Mvd, this.LJIL);
    }

    @Override // X.InterfaceC1765740w3A
    public final void stop() {
        InterfaceC1508380pM4 interfaceC1508380pM4 = this.LJII;
        if (interfaceC1508380pM4 != null) {
            ((Handler) this.LJIIL.getValue()).removeCallbacksAndMessages(null);
            interfaceC1508380pM4.LJJL();
            interfaceC1508380pM4.LJJIIZI();
        }
    }

    public static void LJII() {
        AnonymousClass0317 anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin;
        AnonymousClass0317 anonymousClass0317CreateIPlayerDependencyServicebyMonsterPlugin;
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
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            anonymousClass0317CreateIPlayerDependencyServicebyMonsterPlugin = PlayerDependencyService.createIPlayerDependencyServicebyMonsterPlugin(false);
            C1AQS.LIZJ(jElapsedRealtime2, 1, IPlayerDependencyService.class.getName(), anonymousClass0317CreateIPlayerDependencyServicebyMonsterPlugin != null ? anonymousClass0317CreateIPlayerDependencyServicebyMonsterPlugin.getClass().getName() : null, anonymousClass0317CreateIPlayerDependencyServicebyMonsterPlugin != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIPlayerDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IPlayerDependencyService.class);
        }
        ((IPlayerDependencyService) anonymousClass0317CreateIPlayerDependencyServicebyMonsterPlugin).playingVideoMute();
    }

    public static void LJIILJJIL() {
        AnonymousClass0317 anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin;
        AnonymousClass0317 anonymousClass0317CreateIPlayerDependencyServicebyMonsterPlugin;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin = LiveDependencyService.createILiveDependencyServicebyMonsterPlugin(false);
            C1AQS.LIZJ(jElapsedRealtime, 1, ILiveDependencyService.class.getName(), anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin != null ? anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin.getClass().getName() : null, anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ILiveDependencyService.class);
        }
        ILiveDependencyService iLiveDependencyService = (ILiveDependencyService) anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin;
        iLiveDependencyService.setCurrentPlayerMute(iLiveDependencyService.isInternalWindowMute());
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            anonymousClass0317CreateIPlayerDependencyServicebyMonsterPlugin = PlayerDependencyService.createIPlayerDependencyServicebyMonsterPlugin(false);
            C1AQS.LIZJ(jElapsedRealtime2, 1, IPlayerDependencyService.class.getName(), anonymousClass0317CreateIPlayerDependencyServicebyMonsterPlugin != null ? anonymousClass0317CreateIPlayerDependencyServicebyMonsterPlugin.getClass().getName() : null, anonymousClass0317CreateIPlayerDependencyServicebyMonsterPlugin != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIPlayerDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IPlayerDependencyService.class);
        }
        ((IPlayerDependencyService) anonymousClass0317CreateIPlayerDependencyServicebyMonsterPlugin).playingVideoUnMute();
    }

    public final C581360Mr8 LJ() {
        C581360Mr8 c581360Mr8LIZ = C582060MsG.LIZ();
        c581360Mr8LIZ.LJII = "gec_product_detail";
        if (C770702zh.LIZIZ(this.LJIIZILJ)) {
            Pair[] pairArr = new Pair[1];
            String str = this.LJIIZILJ;
            if (str == null) {
                str = "";
            }
            pairArr[0] = new Pair("gec", str);
            c581360Mr8LIZ.LJIIIZ = C2097608Jq.LJIIJ(pairArr);
        }
        return c581360Mr8LIZ;
    }

    @Override // X.InterfaceC1765740w3A
    public final int getNetworkSpeed() {
        return C1479130oat.LJII();
    }

    @Override // X.InterfaceC1765740w3A
    public final void retry() {
        resume();
    }

    public /* synthetic */ C1508390pM5(int i) {
        this(null, "unknown", false);
    }

    public static final boolean LJIILIIL(SurfaceTexture surfaceTexture) {
        if (surfaceTexture != null && Build.VERSION.SDK_INT >= 26) {
            return surfaceTexture.isReleased();
        }
        return false;
    }

    public final void LIZJ(InterfaceC1507740pL2 interfaceC1507740pL2) {
        if (!LJFF().contains(interfaceC1507740pL2)) {
            LJFF().add(interfaceC1507740pL2);
        }
    }

    public final void LJIIIZ(InterfaceC1507740pL2 interfaceC1507740pL2) {
        if (LJFF().contains(interfaceC1507740pL2)) {
            LJFF().remove(interfaceC1507740pL2);
        }
    }

    @Override // X.InterfaceC1765740w3A
    public final void LJIILL(float f) {
        InterfaceC1508380pM4 interfaceC1508380pM4 = this.LJII;
        if (interfaceC1508380pM4 != null) {
            interfaceC1508380pM4.seek(f);
        }
        this.LJIIIZ = f;
    }

    @Override // X.InterfaceC1765740w3A
    public final void start(int i) {
        if (this.LIZJ == null) {
            return;
        }
        this.LJIILL = false;
        this.LJIJ = false;
        InterfaceC1508380pM4 interfaceC1508380pM4 = this.LJII;
        if (interfaceC1508380pM4 != null) {
            LJIIL();
            interfaceC1508380pM4.LJJIJ(this.LJIL);
            if (!C07EP.LIZ()) {
                interfaceC1508380pM4.LJIJJLI(this.LJ, i);
            } else {
                boolean z = false;
                C584150Mvd c584150Mvd = new C584150Mvd(this.LJ, i, LJ(), z, z, null, 524262);
                c584150Mvd.LJIJJ = true;
                interfaceC1508380pM4.LJJII(c584150Mvd);
            }
            if (interfaceC1508380pM4.isMute()) {
                interfaceC1508380pM4.LJFF();
            }
            interfaceC1508380pM4.LJJIIZ();
        }
    }

    public static void LJIIJ(C1508390pM5 c1508390pM5, Surface surface) {
        InterfaceC497601wk interfaceC497601wk;
        InterfaceC1508380pM4 interfaceC1508380pM4 = c1508390pM5.LJII;
        if (interfaceC1508380pM4 != null) {
            interfaceC1508380pM4.setSurface(surface);
        }
        if (c1508390pM5.LJIILL) {
            if (C04J1.LIZIZ) {
                c1508390pM5.LJIIJJI();
            } else if (C04J1.LIZLLL && (interfaceC497601wk = c1508390pM5.LIZ) != null) {
                C23250099c.LIZLLL(interfaceC497601wk, null, null, new C1508400pM6(c1508390pM5, null), 3);
            }
            c1508390pM5.LJIILL = false;
        }
    }

    /* JADX WARN: Type inference failed for: r0v22, types: [X.0pL1] */
    public C1508390pM5(InterfaceC497601wk interfaceC497601wk, String str, boolean z) {
        AnonymousClass0317 anonymousClass0317CreateIPlayerDependencyServicebyMonsterPlugin;
        AnonymousClass0317 anonymousClass0317CreateIPlayerDependencyServicebyMonsterPlugin2;
        boolean z2;
        boolean z3;
        String name;
        this.LIZ = interfaceC497601wk;
        this.LIZIZ = z;
        this.LIZLLL = C452501pT.LIZIZ(AFwS212S0000000_23.get$arr$(172));
        this.LJIIIIZZ = -1.0f;
        this.LJIIIZ = -1.0f;
        this.LJIIL = C452501pT.LIZIZ(AFwS212S0000000_23.get$arr$(171));
        this.LJIILLIIL = EnumC1508950pMz.PLAYER_IDLE;
        boolean z4 = true;
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
        this.LJII = iPlayerDependencyService.getPlayerManager(((IPlayerDependencyService) anonymousClass0317CreateIPlayerDependencyServicebyMonsterPlugin2).otherSceneFeedUseMediaBoxExp());
        if (!C04J1.LIZIZ && (!C04J1.LIZLLL || !this.LIZIZ || C011O.LIZ.contains(str))) {
            z4 = false;
        }
        this.LJIILL = z4;
        this.LJIJJLI = z4;
        this.LJIL = new OnUIPlayListener() { // from class: X.0pL1
            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ OnUIPlayListener getWrapperedListener() {
                return C583620Mum.LIZ(this);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onBrightnessChanged(String str2, float f) {
                C583620Mum.LIZIZ(this, str2, f);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onBufferedTimeMs(String str2, long j) {
                C583620Mum.LIZLLL(this, str2, j);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onBuffering(String str2, boolean z5) {
                C583620Mum.LJ(this, str2, z5);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onBuffering(String str2, boolean z5, C1480430ocz c1480430ocz) {
                C583620Mum.LJFF(this, str2, z5, c1480430ocz);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onCompleteLoaded(String str2, boolean z5) {
                C583620Mum.LJII(this, str2, z5);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onCrosstalkHappened(String str2) {
                C583620Mum.LJIIIIZZ(this, str2);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onCrosstalkHappened(String str2, List list) {
                C583620Mum.LJIIIZ(this, str2, list);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onDecoderBuffering(String str2, boolean z5) {
                C583620Mum.LJIIJ(this, str2, z5);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onDecoderBuffering(String str2, boolean z5, C1480430ocz c1480430ocz) {
                C583620Mum.LJIIJJI(this, str2, z5, c1480430ocz);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onDecoderBuffering(boolean z5) {
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onFrameAboutToBeRendered(int i, long j, long j2, Map map) {
                C583620Mum.LJIILIIL(this, i, j, j2, map);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onLiveRenderFirstFrame(String str2, C1480420ocy c1480420ocy) {
                C583620Mum.LJIILJJIL(this, str2, c1480420ocy);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onLoopPlay(String str2, int i) {
                C583620Mum.LJIILL(this, str2, i);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onMaskInfoCallback(String str2, C1480290ocl c1480290ocl) {
                C583620Mum.LJIILLIIL(this, str2, c1480290ocl);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onPausePlay(String str2, C1480430ocz c1480430ocz) {
                C583620Mum.LJIJ(this, str2, c1480430ocz);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onPlayCompleted(String str2, int i) {
                C583620Mum.LJIJJ(this, str2, i);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onPlayCompletedFirstTime(String str2) {
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onPlayCompletedFirstTime(String str2, C1480430ocz c1480430ocz) {
                C583620Mum.LJIL(this, str2, c1480430ocz);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onPlayFailed(String str2, C1481290oeN c1481290oeN) {
                C583620Mum.LJJ(this, str2, c1481290oeN);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onPlayFailed(String str2, C1481290oeN c1481290oeN, C1480430ocz c1480430ocz) {
                C583620Mum.LJJI(this, str2, c1481290oeN, c1480430ocz);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onPlayPause(String str2) {
                C583620Mum.LJJII(this, str2);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onPlayPrepare(String str2) {
                C583620Mum.LJJIII(this, str2);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onPlayPrepared(String str2) {
                C583620Mum.LJJIIJ(this, str2);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onPlayProgressChange(String str2, long j, long j2) {
                C583620Mum.LJJIIZ(this, str2, j, j2);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onPlayRelease(String str2) {
                C583620Mum.LJJIIZI(this, str2);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onPlayStop(String str2) {
                C583620Mum.LJJIJ(this, str2);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onPlayStop(String str2, JSONObject jSONObject) {
                C583620Mum.LJJIJIIJI(this, str2, jSONObject);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onPlayStop(String str2, JSONObject jSONObject, C1480430ocz c1480430ocz) {
                C583620Mum.LJJIJIIJIL(this, str2, jSONObject, c1480430ocz);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onPlayStop(String str2, boolean z5) {
                C583620Mum.LJJIJIL(this, str2, z5);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onPlayerInternalEvent(String str2, int i, JSONObject jSONObject) {
                C583620Mum.LJJIJL(this, str2, i, jSONObject);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onPlaying(String str2) {
                C583620Mum.LJJIJLIJ(this, str2);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onPlaying(String str2, C1480430ocz c1480430ocz) {
                C583620Mum.LJJIL(this, str2, c1480430ocz);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onPreRenderSessionMissed(String str2) {
                C583620Mum.LJJIZ(this, str2);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onPreparePlay(String str2, C1480430ocz c1480430ocz) {
                C583620Mum.LJJJI(this, str2, c1480430ocz);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onRenderFirstFrame(String str2, C1480420ocy c1480420ocy) {
                C583620Mum.LJJJIL(this, str2, c1480420ocy);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onRenderFirstFrameFromResume(String str2) {
                C583620Mum.LJJJJI(this, str2);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onRenderReady(C1480430ocz c1480430ocz) {
                C583620Mum.LJJJJIZL(this, c1480430ocz);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onResumePlay(String str2, C1480430ocz c1480430ocz) {
                C583620Mum.LJJJJJL(this, str2, c1480430ocz);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onRetryOnError(String str2, C1481290oeN c1481290oeN) {
                C583620Mum.LJJJJL(this, str2, c1481290oeN);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onSeekEnd(String str2, boolean z5) {
                C583620Mum.LJJJJLL(this, str2, z5);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onSeekStart(String str2, int i, float f) {
                C583620Mum.LJJJJZ(this, str2, i, f);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onSpeedChanged(String str2, float f) {
                C583620Mum.LJJJJZI(this, str2, f);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onStopPlay(String str2) {
                C583620Mum.LJJJLIIL(this, str2);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onVideoBitrateChanged(String str2, EnumC2281141EQm enumC2281141EQm, int i) {
                C583620Mum.LJJJLL(this, str2, enumC2281141EQm, i);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onVideoSecondFrame(String str2) {
                C583620Mum.LJJJLZIJ(this, str2);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onVideoSizeChanged(String str2, int i, int i2) {
                C583620Mum.LJJJZ(this, str2, i, i2);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onBuffering(boolean z5) {
                AnonymousClass0317 anonymousClass0317CreateILogDependencyServicebyMonsterPlugin;
                boolean z6;
                String name3;
                if (z5) {
                    C1508390pM5 c1508390pM5 = this.LL;
                    if (!c1508390pM5.LJIIJJI) {
                        Iterator<T> it2 = c1508390pM5.LJFF().iterator();
                        while (it2.hasNext()) {
                            ((InterfaceC1507740pL2) it2.next()).onBuffering(true);
                        }
                        C1367405Wu.LIZ.getClass();
                        if (C1367405Wu.LIZIZ == -1) {
                            C1367405Wu.LIZIZ = SystemClock.elapsedRealtime();
                        }
                        this.LL.LJIIJJI = true;
                        return;
                    }
                    return;
                }
                C1508390pM5 c1508390pM52 = this.LL;
                if (c1508390pM52.LJIIJJI) {
                    Iterator<T> it3 = c1508390pM52.LJFF().iterator();
                    while (it3.hasNext()) {
                        ((InterfaceC1507740pL2) it3.next()).onBuffering(false);
                    }
                    C1367405Wu.LIZ.getClass();
                    Callable callable = new Callable() { // from class: X.05Wt
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            AnonymousClass0317 anonymousClass0317CreateILogDependencyServicebyMonsterPlugin2;
                            IECommerceHostService iECommerceHostService;
                            C1C7U.LIZ("PdpHeaderPlayerLogHelper@34f1.reportVideoBlock$1");
                            try {
                                long jElapsedRealtime3 = SystemClock.elapsedRealtime();
                                long j = C1367405Wu.LIZIZ;
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
                                C1367405Wu.LIZIZ = -1L;
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
                            C1C7U.LIZIZ("PdpHeaderPlayerLogHelper@34f1.reportVideoBlock$1");
                            return unit;
                        }
                    };
                    if (C034S.LIZ()) {
                        C1120604Zw.LIZ.LIZ();
                        long jElapsedRealtime3 = SystemClock.elapsedRealtime();
                        anonymousClass0317CreateILogDependencyServicebyMonsterPlugin = LogDependencyService.createILogDependencyServicebyMonsterPlugin(false);
                        if (anonymousClass0317CreateILogDependencyServicebyMonsterPlugin != null) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        String name4 = ILogDependencyService.class.getName();
                        if (anonymousClass0317CreateILogDependencyServicebyMonsterPlugin != null) {
                            name3 = anonymousClass0317CreateILogDependencyServicebyMonsterPlugin.getClass().getName();
                        } else {
                            name3 = null;
                        }
                        C1AQS.LIZJ(jElapsedRealtime3, 1, name4, name3, z6);
                    } else {
                        C1120604Zw.LIZ.LIZ();
                        anonymousClass0317CreateILogDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ILogDependencyService.class);
                    }
                    C15O7.LIZIZ(callable, ((ILogDependencyService) anonymousClass0317CreateILogDependencyServicebyMonsterPlugin).getExecutorService(), null);
                    this.LL.LJIIJJI = false;
                }
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onPausePlay(String str2) {
                Iterator<T> it2 = this.LL.LJFF().iterator();
                while (it2.hasNext()) {
                    ((InterfaceC1507740pL2) it2.next()).onPausePlay(str2);
                }
                this.LL.getClass();
                C1508390pM5.LJIILJJIL();
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onPlayCompleted(String str2) {
                Iterator<T> it2 = this.LL.LJFF().iterator();
                while (it2.hasNext()) {
                    ((InterfaceC1507740pL2) it2.next()).onPlayCompleted(str2);
                }
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onPlayFailed(C1481290oeN c1481290oeN) {
                AnonymousClass0317 anonymousClass0317CreateILogDependencyServicebyMonsterPlugin;
                String name3;
                Iterator<T> it2 = this.LL.LJFF().iterator();
                while (it2.hasNext()) {
                    ((InterfaceC1507740pL2) it2.next()).LJLLI(String.valueOf(c1481290oeN));
                }
                C1367405Wu c1367405Wu = C1367405Wu.LIZ;
                Video video = this.LL.LJ;
                c1367405Wu.getClass();
                if (c1481290oeN != null && video != null) {
                    ACallableS251S0200000_23 aCallableS251S0200000_23 = new ACallableS251S0200000_23(video, c1481290oeN, 1);
                    if (C034S.LIZ()) {
                        C1120604Zw.LIZ.LIZ();
                        long jElapsedRealtime3 = SystemClock.elapsedRealtime();
                        boolean z5 = false;
                        anonymousClass0317CreateILogDependencyServicebyMonsterPlugin = LogDependencyService.createILogDependencyServicebyMonsterPlugin(false);
                        if (anonymousClass0317CreateILogDependencyServicebyMonsterPlugin != null) {
                            z5 = true;
                        }
                        String name4 = ILogDependencyService.class.getName();
                        if (anonymousClass0317CreateILogDependencyServicebyMonsterPlugin != null) {
                            name3 = anonymousClass0317CreateILogDependencyServicebyMonsterPlugin.getClass().getName();
                        } else {
                            name3 = null;
                        }
                        C1AQS.LIZJ(jElapsedRealtime3, 1, name4, name3, z5);
                    } else {
                        C1120604Zw.LIZ.LIZ();
                        anonymousClass0317CreateILogDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ILogDependencyService.class);
                    }
                    C15O7.LIZIZ(aCallableS251S0200000_23, ((ILogDependencyService) anonymousClass0317CreateILogDependencyServicebyMonsterPlugin).getExecutorService(), null);
                }
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onPlayProgressChange(float f) {
                Iterator<T> it2 = this.LL.LJFF().iterator();
                while (it2.hasNext()) {
                    ((InterfaceC1507740pL2) it2.next()).onPlayProgressChange(f);
                }
                C1508390pM5 c1508390pM5 = this.LL;
                if (c1508390pM5.LJIIIIZZ == f) {
                    c1508390pM5.LJIIJ++;
                } else {
                    c1508390pM5.LJIIJ = 0;
                }
                if (c1508390pM5.LJIIJ > 1) {
                    onBuffering(true);
                } else {
                    onBuffering(false);
                }
                C1508390pM5 c1508390pM52 = this.LL;
                c1508390pM52.LJIIIIZZ = f;
                c1508390pM52.LJIIIZ = f;
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onPreparePlay(String str2) {
                AnonymousClass0317 anonymousClass0317CreateILogDependencyServicebyMonsterPlugin;
                String name3;
                this.LL.LJI = SystemClock.elapsedRealtime();
                Iterator<T> it2 = this.LL.LJFF().iterator();
                while (it2.hasNext()) {
                    ((InterfaceC1507740pL2) it2.next()).onPreparePlay(str2);
                }
                C1367405Wu.LIZ.getClass();
                Callable callable = new Callable() { // from class: X.05Wr
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        AnonymousClass0317 anonymousClass0317CreateILogDependencyServicebyMonsterPlugin2;
                        IECommerceHostService iECommerceHostService;
                        C1C7U.LIZ("PdpHeaderPlayerLogHelper@34f1.reportVideoRequest$1");
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
                        C1C7U.LIZIZ("PdpHeaderPlayerLogHelper@34f1.reportVideoRequest$1");
                        return unit;
                    }
                };
                if (C034S.LIZ()) {
                    C1120604Zw.LIZ.LIZ();
                    long jElapsedRealtime3 = SystemClock.elapsedRealtime();
                    boolean z5 = false;
                    anonymousClass0317CreateILogDependencyServicebyMonsterPlugin = LogDependencyService.createILogDependencyServicebyMonsterPlugin(false);
                    if (anonymousClass0317CreateILogDependencyServicebyMonsterPlugin != null) {
                        z5 = true;
                    }
                    String name4 = ILogDependencyService.class.getName();
                    if (anonymousClass0317CreateILogDependencyServicebyMonsterPlugin != null) {
                        name3 = anonymousClass0317CreateILogDependencyServicebyMonsterPlugin.getClass().getName();
                    } else {
                        name3 = null;
                    }
                    C1AQS.LIZJ(jElapsedRealtime3, 1, name4, name3, z5);
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
                Iterator<T> it2 = this.LL.LJFF().iterator();
                while (it2.hasNext()) {
                    ((InterfaceC588410N5z) it2.next()).LJII();
                }
                InterfaceC1508380pM4 interfaceC1508380pM4 = this.LL.LJII;
                boolean z5 = false;
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
                    C1508390pM5 c1508390pM5 = this.LL;
                    long j = jElapsedRealtime3 - c1508390pM5.LJI;
                    C1367405Wu c1367405Wu = C1367405Wu.LIZ;
                    Video video = c1508390pM5.LJ;
                    int i = c1508390pM5.LJFF;
                    c1367405Wu.getClass();
                    if (video != null && c1480420ocy != null) {
                        ACallableS0S0203100_23 aCallableS0S0203100_23 = new ACallableS0S0203100_23(i, bitrate, iLIZLLL, j, video, c1480420ocy, 1);
                        if (C034S.LIZ()) {
                            C1120604Zw.LIZ.LIZ();
                            long jElapsedRealtime4 = SystemClock.elapsedRealtime();
                            anonymousClass0317CreateILogDependencyServicebyMonsterPlugin = LogDependencyService.createILogDependencyServicebyMonsterPlugin(false);
                            if (anonymousClass0317CreateILogDependencyServicebyMonsterPlugin != null) {
                                z5 = true;
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
                        C15O7.LIZIZ(aCallableS0S0203100_23, ((ILogDependencyService) anonymousClass0317CreateILogDependencyServicebyMonsterPlugin).getExecutorService(), null);
                    }
                    this.LL.LJI = 0L;
                }
                this.LL.getClass();
                C1508390pM5.LJII();
                Iterator<T> it3 = this.LL.LJFF().iterator();
                while (it3.hasNext()) {
                    ((InterfaceC1507740pL2) it3.next()).i0();
                }
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onResumePlay(String str2) {
                Iterator<T> it2 = this.LL.LJFF().iterator();
                while (it2.hasNext()) {
                    ((InterfaceC1507740pL2) it2.next()).onResumePlay(str2);
                }
                this.LL.getClass();
                C1508390pM5.LJII();
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onRetryOnError(C1481290oeN c1481290oeN) {
                Iterator<T> it2 = this.LL.LJFF().iterator();
                while (it2.hasNext()) {
                    ((InterfaceC1507740pL2) it2.next()).LL(String.valueOf(c1481290oeN));
                }
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onBufferedPercent(String str2, long j, int i) {
                Iterator<T> it2 = this.LL.LJFF().iterator();
                while (it2.hasNext()) {
                    ((InterfaceC1507740pL2) it2.next()).onBufferedPercent(str2, j, i);
                }
            }
        };
    }
}
