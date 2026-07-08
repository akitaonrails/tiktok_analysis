package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.17vp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21187917vp {
    public static final C21187917vp LIZ = new C21187917vp();

    public static void LIZ(C21187917vp c21187917vp, String str, int i) {
        IECommerceHostService iECommerceHostService;
        boolean z;
        String name = null;
        if ((i & 2) != 0) {
            str = null;
        }
        c21187917vp.getClass();
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
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
        }
        if (((IApplicationDependencyService) iECommerceHostService).isLocalTest()) {
            if (C21187717vn.LIZ().debugConfig.enable || C21187817vo.LIZ().debugConfig.enable) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("VmSdk SmartCheck_");
                if (str == null) {
                    str = "";
                }
                sbLIZ.append(str);
                C2188811AlT.LIZIZ(sbLIZ);
            }
        }
    }
}
