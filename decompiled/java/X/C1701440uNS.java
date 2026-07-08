package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.ecommerce.ab.EcVmSdkConfigSettings;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.0uNS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1701440uNS {
    public static final C1701440uNS LIZ = new C1701440uNS();

    public static void LIZ(C1701440uNS c1701440uNS) {
        IECommerceHostService iECommerceHostService;
        boolean z;
        String name;
        c1701440uNS.getClass();
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
            if (iECommerceHostService != null) {
                z = true;
            } else {
                z = false;
            }
            String name2 = IApplicationDependencyService.class.getName();
            if (iECommerceHostService != null) {
                name = iECommerceHostService.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
        }
        if (((IApplicationDependencyService) iECommerceHostService).isLocalTest() && EcVmSdkConfigSettings.LIZ().enable) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("VmSdkService_");
            sbLIZ.append("");
            C2188811AlT.LIZIZ(sbLIZ);
        }
    }
}
