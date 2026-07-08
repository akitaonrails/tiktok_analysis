package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.036F, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C036F {
    public static final C036F LIZ = new C036F();
    public static final Map<String, Integer> LIZIZ = new LinkedHashMap();

    public static int LIZ(String str) {
        IECommerceHostService iECommerceHostService;
        IECommerceHostService iECommerceHostService2;
        boolean z;
        boolean z2;
        String name;
        if (str.length() == 0) {
            return 0;
        }
        Map<String, Integer> map = LIZIZ;
        Integer numValueOf = (Integer) ((LinkedHashMap) map).get(str);
        if (numValueOf == null) {
            String name2 = null;
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
                if (iECommerceHostService != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                String name3 = IApplicationDependencyService.class.getName();
                if (iECommerceHostService != null) {
                    name = iECommerceHostService.getClass().getName();
                } else {
                    name = null;
                }
                C1AQS.LIZJ(jElapsedRealtime, 1, name3, name, z2);
            } else {
                C1120604Zw.LIZ.LIZ();
                iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
            }
            String packageName = ((IApplicationDependencyService) iECommerceHostService).getApplication().getPackageName();
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                iECommerceHostService2 = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
                if (iECommerceHostService2 != null) {
                    z = true;
                } else {
                    z = false;
                }
                String name4 = IApplicationDependencyService.class.getName();
                if (iECommerceHostService2 != null) {
                    name2 = iECommerceHostService2.getClass().getName();
                }
                C1AQS.LIZJ(jElapsedRealtime2, 1, name4, name2, z);
            } else {
                C1120604Zw.LIZ.LIZ();
                iECommerceHostService2 = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
            }
            numValueOf = Integer.valueOf(C786410Ut5.n3(((IApplicationDependencyService) iECommerceHostService2).getResources(), str, "raw", packageName));
            map.put(str, numValueOf);
        }
        return numValueOf.intValue();
    }
}
