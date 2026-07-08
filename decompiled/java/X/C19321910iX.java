package X;

import android.app.Activity;
import android.app.Application;
import android.text.TextUtils;
import com.bytedance.appuse.AppUseBootstrap;
import com.bytedance.pumbaa.hybrid.rasp.api.IRaspService;
import com.bytedance.router.IRouterInjectInitializer;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.RouteManager;
import com.bytedance.router.annotation.Version;
import com.bytedance.router.listener.IRouteIntentInterceptor;
import com.bytedance.router.monitor.RouterMonitorListener;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.DetailFeedService;
import com.ss.android.ugc.aweme.challenge.service.IChallengeService;
import com.ss.android.ugc.aweme.compliance.api.services.consent.IPNSDeviceConsentService;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.offline.nxroute.INxRouteService;
import com.ss.android.ugc.aweme.router.RouterOpen;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.IMainService;
import com.ss.android.ugc.aweme.tools.detail.IPropReuseService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.10iX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19321910iX extends C09AY implements Function0<C19321610iU> {
    public C19321910iX() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.10iU] */
    @Override // kotlin.jvm.functions.Function0
    public final C19321610iU invoke() {
        return new AbstractC21507919Fd() { // from class: X.10iU
            public final String LIZIZ = "snssdk1233";
            public final String[] LIZJ = {"aweme", "sslocal"};
            public final C01GW LIZLLL = C452501pT.LIZIZ(new C19321710iV());
            public final C01GW LJ = C452501pT.LIZIZ(new C19321810iW());

            @Override // X.AbstractC21507919Fd
            public final RouterMonitorListener LIZ() {
                return (RouterMonitorListener) this.LJ.getValue();
            }

            @Override // X.AbstractC21507919Fd
            public final IRouterInjectInitializer LIZJ() {
                return (IRouterInjectInitializer) this.LIZLLL.getValue();
            }

            @Override // X.AbstractC21507919Fd
            public final void LJ() {
                boolean z = Math.random() < ((double) C2508909sN.LIZ) && ((IPNSDeviceConsentService) ServiceManager.get().getService(IPNSDeviceConsentService.class)).LJII(null);
                RouterPageMonitor.INSTANCE.initConfig(new C2262381Dgq(z));
                if (z && C0C64.LJIILLIIL().LJIIIZ(31744, "router_ev_track_pref_opt", true, false)) {
                    C823050WQl.LIZJ().execute(new Runnable() { // from class: X.0uNG
                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("RouteInitalizerKt@f224.routerInitializer$2$1$onInitialize$2");
                            try {
                                RouterPageMonitor.INSTANCE.getDispatcher();
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("RouteInitalizerKt@f224.routerInitializer$2$1$onInitialize$2");
                        }
                    });
                }
                C19724912Fj.LIZLLL.add(new InterfaceC196850120a() { // from class: X.120Z
                    @Override // X.InterfaceC196850120a
                    public final void initialize() {
                        C19724912Fj.LJII = true;
                        C19724912Fj.LIZ(((IMainService) ServiceManager.get().getService(IMainService.class)).getSplashActivityClass(), "aweme://main");
                        C19724912Fj.LIZ(C2277881EDy.LIZIZ.profileActivityClz(), "aweme://profile_edit");
                        C19724912Fj.LIZ(((IExternalService) ServiceManager.get().getService(IExternalService.class)).classnameService().getDraftBoxActivity(), "aweme://draft_box");
                        C19724912Fj.LIZ(((IChallengeService) ServiceManager.get().getService(IChallengeService.class)).LIZLLL(), "aweme://challenge/detail/:id");
                        Class<? extends Activity> clsLJIJJLI = ((DetailFeedService) ServiceManager.get().getService(DetailFeedService.class)).LJIJJLI();
                        C19724912Fj.LIZ(clsLJIJJLI, "aweme://aweme/detail/:id");
                        C19724912Fj.LIZ(clsLJIJJLI, "aweme://aweme/detaillist/:ids");
                        C19724912Fj.LIZ(clsLJIJJLI, "aweme://story/detail");
                        C19724912Fj.LIZ(CrossPlatformActivity.class, "aweme://webview/");
                        C19724912Fj.LIZ(CrossPlatformActivity.class, "aweme://webview/");
                        C19724912Fj c19724912FjLIZLLL = C19724912Fj.LIZLLL();
                        InterfaceC19725812Fs interfaceC19725812Fs = new InterfaceC19725812Fs() { // from class: X.0mY0
                            public static final String LIZIZ(String str) {
                                if (str == null) {
                                    return null;
                                }
                                return C1400450mXz.LL.LIZ(str);
                            }

                            @Override // X.InterfaceC19725812Fs
                            public final boolean open(String str) {
                                String strLIZIZ = LIZIZ(str);
                                if (strLIZIZ == null || strLIZIZ.length() == 0) {
                                    return false;
                                }
                                return C19724912Fj.LIZLLL().LJII(strLIZIZ);
                            }

                            @Override // X.InterfaceC19725812Fs
                            public final boolean LIZ(Activity activity, String str) {
                                String strLIZIZ = LIZIZ(str);
                                if (strLIZIZ == null || strLIZIZ.length() == 0) {
                                    return false;
                                }
                                return C19724912Fj.LIZLLL().LJI(activity, strLIZIZ);
                            }
                        };
                        c19724912FjLIZLLL.getClass();
                        C19724912Fj.LIZJ.put("aweme://aweme/challenge/detail/", interfaceC19725812Fs);
                        C19724912Fj.LIZ(((IExternalService) ServiceManager.get().getService(IExternalService.class)).classnameService().getVideoRecordPermissionActivityClass(), "aweme://studio/create");
                        C19724912Fj.LIZ(((IPropReuseService) ServiceManager.get().getService(IPropReuseService.class)).LJI(), "aweme://stickers/detail/:id");
                    }
                });
                Application applicationLIZ = C1BWL.LIZ();
                if (C19724912Fj.LJI == null) {
                    synchronized (C19724912Fj.class) {
                        try {
                            if (C19724912Fj.LJI == null) {
                                C19724912Fj.LJI = new C19724912Fj(applicationLIZ);
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                }
                C19724912Fj c19724912FjLIZLLL = C19724912Fj.LIZLLL();
                RouterOpen routerOpen = new RouterOpen();
                c19724912FjLIZLLL.getClass();
                C19724912Fj.LJ = routerOpen;
                RouteManager.getInstance().setRouteIntentInterceptor(new IRouteIntentInterceptor() { // from class: X.10ZK
                    @Override // com.bytedance.router.listener.IRouteIntentInterceptor
                    public final boolean onIntercept(RouteIntent routeIntent) {
                        Version routeVersion;
                        Boolean boolLIZIZ;
                        boolean zIsEmpty = false;
                        try {
                            IRaspService iRaspService = (IRaspService) ServiceManager.get().getService(IRaspService.class);
                            if ((iRaspService == null || (boolLIZIZ = iRaspService.LIZIZ(routeIntent.getUrl(), "router")) == null || !(zIsEmpty = boolLIZIZ.booleanValue())) && ((Boolean) C0AMC.LIZ.getValue()).booleanValue() && (routeVersion = RouteManager.getInstance().getRouteVersion(routeIntent)) != null && routeVersion.getVersionCode() > Version.V0.getVersionCode()) {
                                zIsEmpty = TextUtils.isEmpty(routeIntent.getCaller());
                            }
                            C189200o6.m2constructorimpl(Unit.LIZ);
                            return zIsEmpty;
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                            C189200o6.m2constructorimpl(new C098200Yq(th2));
                            return zIsEmpty;
                        }
                    }
                });
                INxRouteService iNxRouteService = (INxRouteService) PluggableExtentionKt.pluggableSpi$default(INxRouteService.class, false, false, false, 14, null);
                if (iNxRouteService != null) {
                    C2213981Bky.LIZIZ.getApplicationContext();
                    iNxRouteService.LIZ();
                }
                AppUseBootstrap appUseBootstrap = (AppUseBootstrap) PluggableExtentionKt.pluggableSpi$default(AppUseBootstrap.class, false, false, false, 14, null);
                if (appUseBootstrap != null) {
                    appUseBootstrap.install(C2213981Bky.LIZIZ.getApplicationContext());
                }
            }

            @Override // X.AbstractC21507919Fd
            public final String[] LIZIZ() {
                return this.LIZJ;
            }

            @Override // X.AbstractC21507919Fd
            public final String LIZLLL() {
                return this.LIZIZ;
            }
        };
    }
}
