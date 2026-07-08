package X;

import android.app.Application;
import android.os.SystemClock;
import com.bytedance.forest.Forest;
import com.ss.android.ugc.aweme.ecommerce.ab.EcVmSdkConfigSettings;
import com.ss.android.ugc.aweme.ecommerce.dependency.HybridDependencyService;
import com.ss.android.ugc.aweme.ecommerce.dependency.account.AccountDependencyService;
import com.ss.android.ugc.aweme.ecommerce.dependency.location.LocationDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.account.IAccountDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.hybrid.IHybridDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.location.ILocationDependencyService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.14Al, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20221714Al {
    public static final C20221714Al LIZ = new C20221714Al();
    public static final Forest LIZIZ;

    static {
        IECommerceHostService iECommerceHostService;
        IECommerceHostService iECommerceHostService2;
        IECommerceHostService iECommerceHostService3;
        IECommerceHostService iECommerceHostService4;
        IECommerceHostService iECommerceHostService5;
        String strLIZ = LIZ();
        Forest forest = null;
        if (strLIZ != null) {
            C1120604Zw c1120604Zw = C1120604Zw.LIZ;
            Application applicationLIZ = C7879035x.LIZ();
            if (C034S.LIZ()) {
                c1120604Zw.LIZ();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                IHybridDependencyService iHybridDependencyServiceCreateIHybridDependencyServicebyMonsterPlugin = HybridDependencyService.createIHybridDependencyServicebyMonsterPlugin(false);
                C1AQS.LIZJ(jElapsedRealtime, 1, IHybridDependencyService.class.getName(), iHybridDependencyServiceCreateIHybridDependencyServicebyMonsterPlugin != null ? iHybridDependencyServiceCreateIHybridDependencyServicebyMonsterPlugin.getClass().getName() : null, iHybridDependencyServiceCreateIHybridDependencyServicebyMonsterPlugin != null);
                iECommerceHostService = iHybridDependencyServiceCreateIHybridDependencyServicebyMonsterPlugin;
            } else {
                c1120604Zw.LIZ();
                iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IHybridDependencyService.class);
            }
            String geckoHost = ((IHybridDependencyService) iECommerceHostService).getGeckoHost();
            if (C034S.LIZ()) {
                c1120604Zw.LIZ();
                long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                iECommerceHostService2 = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
                C1AQS.LIZJ(jElapsedRealtime2, 1, IApplicationDependencyService.class.getName(), iECommerceHostService2 != null ? iECommerceHostService2.getClass().getName() : null, iECommerceHostService2 != null);
            } else {
                c1120604Zw.LIZ();
                iECommerceHostService2 = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
            }
            Long lValueOf = Long.valueOf(((IApplicationDependencyService) iECommerceHostService2).getAppId());
            if (C034S.LIZ()) {
                c1120604Zw.LIZ();
                long jElapsedRealtime3 = SystemClock.elapsedRealtime();
                iECommerceHostService3 = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
                C1AQS.LIZJ(jElapsedRealtime3, 1, IApplicationDependencyService.class.getName(), iECommerceHostService3 != null ? iECommerceHostService3.getClass().getName() : null, iECommerceHostService3 != null);
            } else {
                c1120604Zw.LIZ();
                iECommerceHostService3 = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
            }
            String strValueOf = String.valueOf(((IApplicationDependencyService) iECommerceHostService3).getVersionInfo().LIZIZ);
            if (C034S.LIZ()) {
                c1120604Zw.LIZ();
                long jElapsedRealtime4 = SystemClock.elapsedRealtime();
                IAccountDependencyService iAccountDependencyServiceCreateIAccountDependencyServicebyMonsterPlugin = AccountDependencyService.createIAccountDependencyServicebyMonsterPlugin(false);
                C1AQS.LIZJ(jElapsedRealtime4, 1, IAccountDependencyService.class.getName(), iAccountDependencyServiceCreateIAccountDependencyServicebyMonsterPlugin != null ? iAccountDependencyServiceCreateIAccountDependencyServicebyMonsterPlugin.getClass().getName() : null, iAccountDependencyServiceCreateIAccountDependencyServicebyMonsterPlugin != null);
                iECommerceHostService4 = iAccountDependencyServiceCreateIAccountDependencyServicebyMonsterPlugin;
            } else {
                c1120604Zw.LIZ();
                iECommerceHostService4 = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IAccountDependencyService.class);
            }
            String deviceId = ((IAccountDependencyService) iECommerceHostService4).getDeviceId();
            if (deviceId == null) {
                deviceId = "";
            }
            if (C034S.LIZ()) {
                c1120604Zw.LIZ();
                long jElapsedRealtime5 = SystemClock.elapsedRealtime();
                ILocationDependencyService iLocationDependencyServiceCreateILocationDependencyServicebyMonsterPlugin = LocationDependencyService.createILocationDependencyServicebyMonsterPlugin(false);
                C1AQS.LIZJ(jElapsedRealtime5, 1, ILocationDependencyService.class.getName(), iLocationDependencyServiceCreateILocationDependencyServicebyMonsterPlugin != null ? iLocationDependencyServiceCreateILocationDependencyServicebyMonsterPlugin.getClass().getName() : null, iLocationDependencyServiceCreateILocationDependencyServicebyMonsterPlugin != null);
                iECommerceHostService5 = iLocationDependencyServiceCreateILocationDependencyServicebyMonsterPlugin;
            } else {
                c1120604Zw.LIZ();
                iECommerceHostService5 = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ILocationDependencyService.class);
            }
            C1533560q0g c1533560q0g = new C1533560q0g(geckoHost, new C1533570q0h(strLIZ, "offlineX", lValueOf, strValueOf, deviceId, ((ILocationDependencyService) iECommerceHostService5).getCurrentRegionCode(), false, 192), 4);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ECForest-");
            sbLIZ.append(strLIZ);
            c1533560q0g.LJFF = C2188811AlT.LIZIZ(sbLIZ);
            forest = new Forest(applicationLIZ, c1533560q0g);
        }
        LIZIZ = forest;
    }

    public static String LIZ() {
        return (C7879035x.LIZJ() && Intrinsics.LJFF(C7879035x.LIZIZ(), "local_test")) ? C21187817vo.LIZ().switchConfig.masterSwitch ? C21187817vo.LIZ().vmsdkConfig.accessKeyPPE : EcVmSdkConfigSettings.LIZ().accessKeyPPE : C21187817vo.LIZ().switchConfig.masterSwitch ? C21187817vo.LIZ().vmsdkConfig.accessKeyOnline : EcVmSdkConfigSettings.LIZ().accessKeyOnline;
    }
}
