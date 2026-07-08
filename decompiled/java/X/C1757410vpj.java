package X;

import android.content.Context;
import android.graphics.Matrix;
import android.os.SystemClock;
import android.view.Surface;
import android.view.TextureView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.libra.EcSeaPdpShortVideoWindowOptExperiment;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.page.window.manager.SeaPdpShortVideoWindowManager$detailFragmentLifecycleObserver$1;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.page.window.manager.SeaPdpShortVideoWindowManager$seaPdpFragmentLifecycleObserver$1;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.player.ISeaPdpMediaControlService;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.ui.SeaPdpFragment;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.dependency.commonfeed.CommonFeedDependService;
import com.ss.android.ugc.aweme.ecommerce.dependency.player.PlayerDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.commonfeed.ICommonFeedDependService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.player.IPlayerDependencyService;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceFYPPlayerService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AwS164S0101000_26;
import kotlin.jvm.internal.AwS570S0100000_26;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0vpj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1757410vpj {
    public final Context LIZ;
    public final InterfaceC665370Q7z LIZIZ;
    public final SeaPdpFragment LIZJ;
    public final SeaPdpViewModel LIZLLL;
    public final int LJ;
    public C1757630vq5 LJI;
    public TextureView LJII;
    public Surface LJIIIIZZ;
    public boolean LJIIJ;
    public final Pair<Integer, Integer> LJIIJJI;
    public final String LJIIL;
    public boolean LJIILIIL;
    public final C1757430vpl LJIILJJIL;
    public final C583670Mur LJIILL;
    public final C1757440vpm LJIILLIIL;
    public final C01GW LJFF = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1276));
    public boolean LJIIIZ = true;

    public final ISeaPdpMediaControlService LIZ() {
        return (ISeaPdpMediaControlService) this.LJFF.getValue();
    }

    public final void LIZLLL() {
        C19EG activity;
        AnonymousClass0317 anonymousClass0317CreateICommonFeedDependServicebyMonsterPlugin;
        if (!EcSeaPdpShortVideoWindowOptExperiment.LIZJ) {
            IECommerceFYPPlayerService iECommerceFYPPlayerService = (IECommerceFYPPlayerService) C13LP.LJJJLIIL(ServiceManager.get().getServices(IECommerceFYPPlayerService.class));
            if (iECommerceFYPPlayerService != null) {
                iECommerceFYPPlayerService.LJ();
                return;
            }
            return;
        }
        SeaPdpFragment seaPdpFragment = this.LIZJ;
        if (seaPdpFragment == null || (activity = seaPdpFragment.getActivity()) == null) {
            return;
        }
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateICommonFeedDependServicebyMonsterPlugin = CommonFeedDependService.createICommonFeedDependServicebyMonsterPlugin(false);
            C1AQS.LIZJ(jElapsedRealtime, 1, ICommonFeedDependService.class.getName(), anonymousClass0317CreateICommonFeedDependServicebyMonsterPlugin != null ? anonymousClass0317CreateICommonFeedDependServicebyMonsterPlugin.getClass().getName() : null, anonymousClass0317CreateICommonFeedDependServicebyMonsterPlugin != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateICommonFeedDependServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ICommonFeedDependService.class);
        }
        InterfaceC1756810vol feedPlayerAbility = ((ICommonFeedDependService) anonymousClass0317CreateICommonFeedDependServicebyMonsterPlugin).getFeedPlayerAbility(activity);
        if (feedPlayerAbility != null) {
            feedPlayerAbility.LIZ();
        }
    }

    public static InterfaceC1508380pM4 LIZIZ() {
        AnonymousClass0317 anonymousClass0317CreateIPlayerDependencyServicebyMonsterPlugin;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateIPlayerDependencyServicebyMonsterPlugin = PlayerDependencyService.createIPlayerDependencyServicebyMonsterPlugin(false);
            C1AQS.LIZJ(jElapsedRealtime, 1, IPlayerDependencyService.class.getName(), anonymousClass0317CreateIPlayerDependencyServicebyMonsterPlugin != null ? anonymousClass0317CreateIPlayerDependencyServicebyMonsterPlugin.getClass().getName() : null, anonymousClass0317CreateIPlayerDependencyServicebyMonsterPlugin != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIPlayerDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IPlayerDependencyService.class);
        }
        return ((IPlayerDependencyService) anonymousClass0317CreateIPlayerDependencyServicebyMonsterPlugin).getSharedPlayerManager();
    }

    public final void LIZJ(C1757630vq5 c1757630vq5, boolean z, boolean z2) {
        int i;
        Object c098200Yq;
        if (z2) {
            i = -80;
        } else if (z) {
            i = -90;
        } else {
            i = -132;
        }
        if (c1757630vq5 != null) {
            try {
                c1757630vq5.setInitialPosition(new AwS164S0101000_26(i, this, 1));
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            C189200o6.m1boximpl(c098200Yq);
        }
    }

    public static void LJ(int i, int i2, int i3, int i4, TextureView textureView) {
        float f;
        if (textureView != null && i2 > 0 && i > 0 && i3 > 0 && i4 > 0) {
            float f2 = i2 / i;
            float f3 = i4 / i3;
            float f4 = 1.0f;
            if (f2 > f3) {
                float f5 = f2 / f3;
                f = 1.0f;
                f4 = f5;
            } else {
                f = f3 / f2;
            }
            Matrix matrix = new Matrix();
            matrix.setScale(f4, f, textureView.getWidth() >> 1, textureView.getHeight() >> 1);
            textureView.setTransform(matrix);
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0vpl] */
    /* JADX WARN: Type inference failed for: r0v5, types: [X.0Mur] */
    /* JADX WARN: Type inference failed for: r0v6, types: [X.0vpm] */
    public C1757410vpj(Context context, InterfaceC665370Q7z interfaceC665370Q7z, SeaPdpFragment seaPdpFragment, SeaPdpViewModel seaPdpViewModel, int i, final AwS570S0100000_26 awS570S0100000_26) {
        AnonymousClass0317 anonymousClass0317CreateICommonFeedDependServicebyMonsterPlugin;
        C19EG activity;
        AnonymousClass0317 anonymousClass0317CreateICommonFeedDependServicebyMonsterPlugin2;
        C19EG activity2;
        AnonymousClass0317 anonymousClass0317CreateICommonFeedDependServicebyMonsterPlugin3;
        C19EG activity3;
        Lifecycle lifecycle;
        boolean z;
        String name;
        boolean z2;
        String name2;
        boolean z3;
        String name3;
        this.LIZ = context;
        this.LIZIZ = interfaceC665370Q7z;
        this.LIZJ = seaPdpFragment;
        this.LIZLLL = seaPdpViewModel;
        this.LJ = i;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateICommonFeedDependServicebyMonsterPlugin = CommonFeedDependService.createICommonFeedDependServicebyMonsterPlugin(false);
            if (anonymousClass0317CreateICommonFeedDependServicebyMonsterPlugin != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            String name4 = ICommonFeedDependService.class.getName();
            if (anonymousClass0317CreateICommonFeedDependServicebyMonsterPlugin != null) {
                name3 = anonymousClass0317CreateICommonFeedDependServicebyMonsterPlugin.getClass().getName();
            } else {
                name3 = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name4, name3, z3);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateICommonFeedDependServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ICommonFeedDependService.class);
        }
        ICommonFeedDependService iCommonFeedDependService = (ICommonFeedDependService) anonymousClass0317CreateICommonFeedDependServicebyMonsterPlugin;
        if (seaPdpFragment != null) {
            activity = seaPdpFragment.getActivity();
        } else {
            activity = null;
        }
        this.LJIIJJI = iCommonFeedDependService.getCurrentVideoWidthAndHeight(activity);
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            anonymousClass0317CreateICommonFeedDependServicebyMonsterPlugin2 = CommonFeedDependService.createICommonFeedDependServicebyMonsterPlugin(false);
            if (anonymousClass0317CreateICommonFeedDependServicebyMonsterPlugin2 != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            String name5 = ICommonFeedDependService.class.getName();
            if (anonymousClass0317CreateICommonFeedDependServicebyMonsterPlugin2 != null) {
                name2 = anonymousClass0317CreateICommonFeedDependServicebyMonsterPlugin2.getClass().getName();
            } else {
                name2 = null;
            }
            C1AQS.LIZJ(jElapsedRealtime2, 1, name5, name2, z2);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateICommonFeedDependServicebyMonsterPlugin2 = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ICommonFeedDependService.class);
        }
        ICommonFeedDependService iCommonFeedDependService2 = (ICommonFeedDependService) anonymousClass0317CreateICommonFeedDependServicebyMonsterPlugin2;
        if (seaPdpFragment != null) {
            activity2 = seaPdpFragment.getActivity();
        } else {
            activity2 = null;
        }
        this.LJIIL = iCommonFeedDependService2.getCurrentVideoId(activity2);
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime3 = SystemClock.elapsedRealtime();
            anonymousClass0317CreateICommonFeedDependServicebyMonsterPlugin3 = CommonFeedDependService.createICommonFeedDependServicebyMonsterPlugin(false);
            if (anonymousClass0317CreateICommonFeedDependServicebyMonsterPlugin3 != null) {
                z = true;
            } else {
                z = false;
            }
            String name6 = ICommonFeedDependService.class.getName();
            if (anonymousClass0317CreateICommonFeedDependServicebyMonsterPlugin3 != null) {
                name = anonymousClass0317CreateICommonFeedDependServicebyMonsterPlugin3.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime3, 1, name6, name, z);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateICommonFeedDependServicebyMonsterPlugin3 = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ICommonFeedDependService.class);
        }
        ICommonFeedDependService iCommonFeedDependService3 = (ICommonFeedDependService) anonymousClass0317CreateICommonFeedDependServicebyMonsterPlugin3;
        if (seaPdpFragment != null) {
            activity3 = seaPdpFragment.getActivity();
        } else {
            activity3 = null;
        }
        Fragment currentFragmnet = iCommonFeedDependService3.getCurrentFragmnet(activity3);
        Lifecycle lifecycle2 = currentFragmnet != null ? currentFragmnet.getLifecycle() : null;
        SeaPdpShortVideoWindowManager$detailFragmentLifecycleObserver$1 seaPdpShortVideoWindowManager$detailFragmentLifecycleObserver$1 = new SeaPdpShortVideoWindowManager$detailFragmentLifecycleObserver$1(this, lifecycle2);
        if (lifecycle2 != null) {
            lifecycle2.addObserver(seaPdpShortVideoWindowManager$detailFragmentLifecycleObserver$1);
        }
        SeaPdpShortVideoWindowManager$seaPdpFragmentLifecycleObserver$1 seaPdpShortVideoWindowManager$seaPdpFragmentLifecycleObserver$1 = new SeaPdpShortVideoWindowManager$seaPdpFragmentLifecycleObserver$1(this, lifecycle2, seaPdpShortVideoWindowManager$detailFragmentLifecycleObserver$1);
        if (seaPdpFragment != null && (lifecycle = seaPdpFragment.getLifecycle()) != null) {
            lifecycle.addObserver(seaPdpShortVideoWindowManager$seaPdpFragmentLifecycleObserver$1);
        }
        this.LJIILJJIL = new InterfaceC1757740vqG() { // from class: X.0vpl
            @Override // X.InterfaceC1757740vqG
            public final void LIZJ() {
            }

            @Override // X.InterfaceC1757740vqG
            public final void LJ() {
            }

            @Override // X.InterfaceC1757740vqG
            public final void LIZ() {
                this.LIZ.LIZLLL.LLJJJIL = true;
                InterfaceC1508380pM4 interfaceC1508380pM4LIZIZ = C1757410vpj.LIZIZ();
                if (interfaceC1508380pM4LIZIZ != null) {
                    interfaceC1508380pM4LIZIZ.LIZ();
                }
                this.LIZ.LJI = null;
            }

            @Override // X.InterfaceC1757740vqG
            public final void LIZIZ() {
                InterfaceC1508380pM4 interfaceC1508380pM4LIZIZ;
                ISeaPdpMediaControlService iSeaPdpMediaControlServiceLIZ = this.LIZ.LIZ();
                if (iSeaPdpMediaControlServiceLIZ != null) {
                    iSeaPdpMediaControlServiceLIZ.oI(true);
                }
                this.LIZ.getClass();
                Surface surface = this.LIZ.LJIIIIZZ;
                if (surface != null && (interfaceC1508380pM4LIZIZ = C1757410vpj.LIZIZ()) != null) {
                    interfaceC1508380pM4LIZIZ.LJJIL(surface);
                }
                if (this.LIZ.LJIIJ) {
                    InterfaceC1508380pM4 interfaceC1508380pM4LIZIZ2 = C1757410vpj.LIZIZ();
                    if (interfaceC1508380pM4LIZIZ2 != null) {
                        interfaceC1508380pM4LIZIZ2.LJFF();
                    }
                    C1757630vq5 c1757630vq5 = this.LIZ.LJI;
                    if (c1757630vq5 != null) {
                        c1757630vq5.LJIIL(true);
                    }
                }
                C1757410vpj c1757410vpj = this.LIZ;
                if (c1757410vpj.LJIIIZ) {
                    ISeaPdpMediaControlService iSeaPdpMediaControlServiceLIZ2 = c1757410vpj.LIZ();
                    if (iSeaPdpMediaControlServiceLIZ2 != null) {
                        iSeaPdpMediaControlServiceLIZ2.MC2(this.LIZ.LJIILLIIL, true, null);
                        return;
                    }
                    return;
                }
                ISeaPdpMediaControlService iSeaPdpMediaControlServiceLIZ3 = c1757410vpj.LIZ();
                if (iSeaPdpMediaControlServiceLIZ3 != null) {
                    iSeaPdpMediaControlServiceLIZ3.MC2(this.LIZ.LJIILLIIL, false, null);
                }
            }

            @Override // X.InterfaceC1757740vqG
            public final void LIZLLL() {
                awS570S0100000_26.invoke();
            }

            @Override // X.InterfaceC1757740vqG
            public final void LJI() {
                ISeaPdpMediaControlService iSeaPdpMediaControlServiceLIZ = this.LIZ.LIZ();
                if (iSeaPdpMediaControlServiceLIZ != null) {
                    iSeaPdpMediaControlServiceLIZ.oI(false);
                }
                this.LIZ.getClass();
                C1757410vpj c1757410vpj = this.LIZ;
                if (c1757410vpj.LJIIIZ) {
                    c1757410vpj.LIZLLL();
                    ISeaPdpMediaControlService iSeaPdpMediaControlServiceLIZ2 = this.LIZ.LIZ();
                    if (iSeaPdpMediaControlServiceLIZ2 != null) {
                        iSeaPdpMediaControlServiceLIZ2.MC2(this.LIZ.LJIILLIIL, false, EnumC1308950kAP.PASSIVE);
                    }
                }
            }

            @Override // X.InterfaceC1757740vqG
            public final boolean isMuted() {
                this.LIZ.getClass();
                InterfaceC1508380pM4 interfaceC1508380pM4LIZIZ = C1757410vpj.LIZIZ();
                return interfaceC1508380pM4LIZIZ != null && interfaceC1508380pM4LIZIZ.isMute();
            }

            @Override // X.InterfaceC1757740vqG
            public final void LJFF(boolean z4) {
                ISeaPdpMediaControlService iSeaPdpMediaControlServiceLIZ = this.LIZ.LIZ();
                if (iSeaPdpMediaControlServiceLIZ != null) {
                    iSeaPdpMediaControlServiceLIZ.Zk1(this.LIZ.LJIILLIIL, z4, EnumC1308950kAP.ACTIVE);
                }
                if (z4) {
                    this.LIZ.getClass();
                    InterfaceC1508380pM4 interfaceC1508380pM4LIZIZ = C1757410vpj.LIZIZ();
                    if (interfaceC1508380pM4LIZIZ != null) {
                        interfaceC1508380pM4LIZIZ.LJFF();
                    }
                    this.LIZ.LJIIJ = true;
                    return;
                }
                this.LIZ.getClass();
                InterfaceC1508380pM4 interfaceC1508380pM4LIZIZ2 = C1757410vpj.LIZIZ();
                if (interfaceC1508380pM4LIZIZ2 != null) {
                    interfaceC1508380pM4LIZIZ2.LJIJJ();
                }
                this.LIZ.LJIIJ = false;
            }
        };
        this.LJIILL = new OnUIPlayListener() { // from class: X.0Mur
            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ OnUIPlayListener getWrapperedListener() {
                return C583620Mum.LIZ(this);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onBrightnessChanged(String str, float f) {
                C583620Mum.LIZIZ(this, str, f);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onBufferedPercent(String str, long j, int i2) {
                C583620Mum.LIZJ(this, str, j, i2);
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
            public final /* synthetic */ void onBuffering(boolean z4) {
                C583620Mum.LJI(this, z4);
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
            public final /* synthetic */ void onDecoderBuffering(boolean z4) {
                C583620Mum.LJIIL(this, z4);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onFrameAboutToBeRendered(int i2, long j, long j2, Map map) {
                C583620Mum.LJIILIIL(this, i2, j, j2, map);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onLiveRenderFirstFrame(String str, C1480420ocy c1480420ocy) {
                C583620Mum.LJIILJJIL(this, str, c1480420ocy);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onLoopPlay(String str, int i2) {
                C583620Mum.LJIILL(this, str, i2);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onMaskInfoCallback(String str, C1480290ocl c1480290ocl) {
                C583620Mum.LJIILLIIL(this, str, c1480290ocl);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onPausePlay(String str) {
                C583620Mum.LJIIZILJ(this, str);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onPausePlay(String str, C1480430ocz c1480430ocz) {
                C583620Mum.LJIJ(this, str, c1480430ocz);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onPlayCompleted(String str) {
                C583620Mum.LJIJI(this, str);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onPlayCompleted(String str, int i2) {
                C583620Mum.LJIJJ(this, str, i2);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onPlayCompletedFirstTime(String str) {
                C583620Mum.LJIJJLI(this, str);
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
            public final /* synthetic */ void onPlayProgressChange(float f) {
                C583620Mum.LJJIIJZLJL(this, f);
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
            public final /* synthetic */ void onPlayerInternalEvent(String str, int i2, JSONObject jSONObject) {
                C583620Mum.LJJIJL(this, str, i2, jSONObject);
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
            public final /* synthetic */ void onResumePlay(String str) {
                C583620Mum.LJJJJJ(this, str);
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
            public final /* synthetic */ void onRetryOnError(String str, C1481290oeN c1481290oeN) {
                C583620Mum.LJJJJL(this, str, c1481290oeN);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onSeekEnd(String str, boolean z4) {
                C583620Mum.LJJJJLL(this, str, z4);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onSeekStart(String str, int i2, float f) {
                C583620Mum.LJJJJZ(this, str, i2, f);
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
            public final /* synthetic */ void onVideoBitrateChanged(String str, EnumC2281141EQm enumC2281141EQm, int i2) {
                C583620Mum.LJJJLL(this, str, enumC2281141EQm, i2);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final /* synthetic */ void onVideoSecondFrame(String str) {
                C583620Mum.LJJJLZIJ(this, str);
            }

            @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
            public final void onVideoSizeChanged(String str, int i2, int i3) {
                C583620Mum.LJJJZ(this, str, i2, i3);
                C1757630vq5 c1757630vq5 = this.LL.LJI;
                if (c1757630vq5 != null) {
                    c1757630vq5.LIZLLL(i2, i3);
                }
            }
        };
        this.LJIILLIIL = new InterfaceC1508310pLx() { // from class: X.0vpm
            @Override // X.InterfaceC1508310pLx
            public final boolean LLLLZLLIL() {
                this.LL.getClass();
                InterfaceC1508380pM4 interfaceC1508380pM4LIZIZ = C1757410vpj.LIZIZ();
                return interfaceC1508380pM4LIZIZ != null && interfaceC1508380pM4LIZIZ.isMute();
            }

            @Override // X.InterfaceC1508310pLx
            public final void w4(boolean z4) {
                C1757630vq5 c1757630vq5 = this.LL.LJI;
                if (c1757630vq5 != null) {
                    c1757630vq5.LJIIL(z4);
                }
                if (z4) {
                    this.LL.getClass();
                    InterfaceC1508380pM4 interfaceC1508380pM4LIZIZ = C1757410vpj.LIZIZ();
                    if (interfaceC1508380pM4LIZIZ != null) {
                        interfaceC1508380pM4LIZIZ.LJFF();
                        return;
                    }
                    return;
                }
                this.LL.getClass();
                InterfaceC1508380pM4 interfaceC1508380pM4LIZIZ2 = C1757410vpj.LIZIZ();
                if (interfaceC1508380pM4LIZIZ2 == null) {
                    return;
                }
                interfaceC1508380pM4LIZIZ2.LJIJJ();
            }
        };
    }
}
