package X;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.ecommerce.dependency.buildconfigdiff.BuildConfigDIffDependencyService;
import com.ss.android.ugc.aweme.ecommerce.dependency.launcher.LauncherDependencyService;
import com.ss.android.ugc.aweme.ecommerce.dependency.location.LocationDependencyService;
import com.ss.android.ugc.aweme.ecommerce.dependency.log.LogDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.buildconfigdiff.IBuildConfigDiffDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.event.ILogDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.launcher.ILauncherDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.location.ILocationDependencyService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.tts.oecverify.BdTuringConfig;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.149p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C202195149p extends C09AY implements Function0<BdTuringConfig> {
    public final /* synthetic */ C149X LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C202195149p(C149X c149x) {
        super(0);
        this.LL = c149x;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ BdTuringConfig invoke() {
        IECommerceHostService iECommerceHostService;
        AnonymousClass0317 anonymousClass0317CreateILauncherDependencyServicebyMonsterPlugin;
        AnonymousClass0317 anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin;
        AnonymousClass0317 anonymousClass0317CreateIBuildConfigDiffDependencyServicebyMonsterPlugin;
        BdTuringConfig.RegionType regionType;
        BdTuringConfig.Builder builder = new BdTuringConfig.Builder();
        builder.injectHeader(false);
        builder.appId(String.valueOf(this.LL.LIZIZ.LIZJ));
        builder.appName(this.LL.LIZIZ.LIZLLL);
        C1120604Zw c1120604Zw = C1120604Zw.LIZ;
        if (C034S.LIZ()) {
            c1120604Zw.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
            C1AQS.LIZJ(jElapsedRealtime, 1, IApplicationDependencyService.class.getName(), iECommerceHostService != null ? iECommerceHostService.getClass().getName() : null, iECommerceHostService != null);
        } else {
            c1120604Zw.LIZ();
            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
        }
        builder.appVersion(((IApplicationDependencyService) iECommerceHostService).getVersionInfo().LIZ);
        builder.language(this.LL.LIZIZ.LIZ);
        builder.channel(this.LL.LIZIZ.LJI);
        builder.deviceId(this.LL.LIZIZ.LJFF);
        builder.installId(this.LL.LIZIZ.LJ);
        builder.userId(this.LL.LIZIZ.LIZIZ);
        builder.maskCancel(true);
        if (C034S.LIZ()) {
            c1120604Zw.LIZ();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            anonymousClass0317CreateILauncherDependencyServicebyMonsterPlugin = LauncherDependencyService.createILauncherDependencyServicebyMonsterPlugin(false);
            C1AQS.LIZJ(jElapsedRealtime2, 1, ILauncherDependencyService.class.getName(), anonymousClass0317CreateILauncherDependencyServicebyMonsterPlugin != null ? anonymousClass0317CreateILauncherDependencyServicebyMonsterPlugin.getClass().getName() : null, anonymousClass0317CreateILauncherDependencyServicebyMonsterPlugin != null);
        } else {
            c1120604Zw.LIZ();
            anonymousClass0317CreateILauncherDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ILauncherDependencyService.class);
        }
        String sessionId = ((ILauncherDependencyService) anonymousClass0317CreateILauncherDependencyServicebyMonsterPlugin).getSessionId();
        if (sessionId == null) {
            sessionId = "";
        }
        builder.sessionId(sessionId);
        builder.delayBackupDuration(this.LL.LIZIZ.LJII);
        builder.ttNetStatus(this.LL.LIZIZ.LJIIIIZZ);
        builder.setSamplingRate(this.LL.LIZIZ.LJIIIZ);
        builder.setExpFeatures(this.LL.LIZIZ.LJIIJ);
        if (C034S.LIZ()) {
            c1120604Zw.LIZ();
            long jElapsedRealtime3 = SystemClock.elapsedRealtime();
            anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin = LocationDependencyService.createILocationDependencyServicebyMonsterPlugin(false);
            C1AQS.LIZJ(jElapsedRealtime3, 1, ILocationDependencyService.class.getName(), anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin != null ? anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin.getClass().getName() : null, anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin != null);
        } else {
            c1120604Zw.LIZ();
            anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ILocationDependencyService.class);
        }
        boolean zIsIndia = ((ILocationDependencyService) anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin).isIndia();
        if (zIsIndia) {
            regionType = BdTuringConfig.RegionType.REGION_INDIA;
        } else {
            if (zIsIndia) {
                throw new C1954807lC();
            }
            if (C034S.LIZ()) {
                c1120604Zw.LIZ();
                long jElapsedRealtime4 = SystemClock.elapsedRealtime();
                anonymousClass0317CreateIBuildConfigDiffDependencyServicebyMonsterPlugin = BuildConfigDIffDependencyService.createIBuildConfigDiffDependencyServicebyMonsterPlugin(false);
                C1AQS.LIZJ(jElapsedRealtime4, 1, IBuildConfigDiffDependencyService.class.getName(), anonymousClass0317CreateIBuildConfigDiffDependencyServicebyMonsterPlugin != null ? anonymousClass0317CreateIBuildConfigDiffDependencyServicebyMonsterPlugin.getClass().getName() : null, anonymousClass0317CreateIBuildConfigDiffDependencyServicebyMonsterPlugin != null);
            } else {
                c1120604Zw.LIZ();
                anonymousClass0317CreateIBuildConfigDiffDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IBuildConfigDiffDependencyService.class);
            }
            boolean secCaptchaRegionType = ((IBuildConfigDiffDependencyService) anonymousClass0317CreateIBuildConfigDiffDependencyServicebyMonsterPlugin).getSecCaptchaRegionType();
            if (secCaptchaRegionType) {
                regionType = BdTuringConfig.RegionType.REGION_USA_EAST;
            } else {
                if (secCaptchaRegionType) {
                    throw new C1954807lC();
                }
                regionType = BdTuringConfig.RegionType.REGION_SINGAPOER;
            }
        }
        builder.regionType(regionType);
        builder.eventClient(new C14A7() { // from class: X.0plX
            @Override // X.C14A7
            public final void onEvent(String str, JSONObject jSONObject) {
                AnonymousClass0317 anonymousClass0317CreateILogDependencyServicebyMonsterPlugin;
                String name;
                if (C034S.LIZ()) {
                    C1120604Zw.LIZ.LIZ();
                    long jElapsedRealtime5 = SystemClock.elapsedRealtime();
                    boolean z = false;
                    anonymousClass0317CreateILogDependencyServicebyMonsterPlugin = LogDependencyService.createILogDependencyServicebyMonsterPlugin(false);
                    if (anonymousClass0317CreateILogDependencyServicebyMonsterPlugin != null) {
                        z = true;
                    }
                    String name2 = ILogDependencyService.class.getName();
                    if (anonymousClass0317CreateILogDependencyServicebyMonsterPlugin != null) {
                        name = anonymousClass0317CreateILogDependencyServicebyMonsterPlugin.getClass().getName();
                    } else {
                        name = null;
                    }
                    C1AQS.LIZJ(jElapsedRealtime5, 1, name2, name, z);
                } else {
                    C1120604Zw.LIZ.LIZ();
                    anonymousClass0317CreateILogDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ILogDependencyService.class);
                }
                ((ILogDependencyService) anonymousClass0317CreateILogDependencyServicebyMonsterPlugin).onEventV3(str, jSONObject);
            }
        });
        builder.bdTuringDepend(new InterfaceC1524180plY() { // from class: X.0plW
            @Override // X.InterfaceC1524180plY
            public final Activity getActivity() {
                IECommerceHostService iECommerceHostService2;
                C928103jz top;
                Context context;
                if (C034S.LIZ()) {
                    C1120604Zw.LIZ.LIZ();
                    long jElapsedRealtime5 = SystemClock.elapsedRealtime();
                    iECommerceHostService2 = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
                    C1AQS.LIZJ(jElapsedRealtime5, 1, IApplicationDependencyService.class.getName(), iECommerceHostService2 != null ? iECommerceHostService2.getClass().getName() : null, iECommerceHostService2 != null);
                } else {
                    C1120604Zw.LIZ.LIZ();
                    iECommerceHostService2 = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
                }
                InterfaceC911603hK rootPageMonitor = ((IApplicationDependencyService) iECommerceHostService2).getRootPageMonitor();
                if (rootPageMonitor == null || (top = rootPageMonitor.getTop()) == null || (context = top.LIZ) == null) {
                    return null;
                }
                return C1388190mED.LIZ(context);
            }
        });
        return builder.build(C786410Ut5.N3(this.LL.LIZ));
    }
}
