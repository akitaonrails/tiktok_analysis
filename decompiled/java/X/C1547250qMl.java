package X;

import android.os.SystemClock;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.ecommerce.IECommerceHybridService;
import com.ss.android.ugc.aweme.ecommerce.monitor.IECSDKMonitorService;
import com.ss.android.ugc.aweme.ecommerce.router.ISparkRouterInterceptor;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0qMl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1547250qMl {
    public static final C1547250qMl LIZ = new C1547250qMl();

    public static void LIZ(SparkContext sparkContext) {
        IECSDKMonitorService iECSDKMonitorService = (IECSDKMonitorService) PluggableExtentionKt.pluggableSpi$default(IECSDKMonitorService.class, false, false, false, 14, null);
        String str = "";
        if (iECSDKMonitorService != null) {
            String strLJIJI = sparkContext.LJIJI();
            String strLIZIZ = C1547280qMo.LIZIZ(sparkContext);
            if (strLIZIZ == null) {
                strLIZIZ = "";
            }
            iECSDKMonitorService.LIZLLL(strLJIJI, "ecom", strLIZIZ);
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        String strLJIJI2 = sparkContext.LJIJI();
        sparkContext.LJJLIIJ(C1943307jL.LIZ(UriProtector.parse(sparkContext.LJIJI()), "aweme").toString());
        List listLJLIL = C13LP.LJLIL(((IECommerceHybridService) ServiceManager.get().getService(IECommerceHybridService.class)).LIZJ(sparkContext.LJIJI()), Collections.singletonList(C1769860w9o.LL));
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        for (ISparkRouterInterceptor iSparkRouterInterceptor : (ArrayList) listLJLIL) {
            if (iSparkRouterInterceptor.matchInterceptRules(sparkContext.LJIJI())) {
                i++;
                arrayList.addAll(iSparkRouterInterceptor.provideSparkInterceptActivityCallbacks());
                if (!C2190461Ao8.LIZIZ()) {
                    arrayList2.addAll(iSparkRouterInterceptor.provideSparkInterceptSAFCallbacks());
                }
                iSparkRouterInterceptor.handleSparkContext(sparkContext, sparkContext.LJIJI());
            }
        }
        for (ISparkRouterInterceptor iSparkRouterInterceptor2 : ((IECommerceHybridService) ServiceManager.get().getService(IECommerceHybridService.class)).LIZLLL()) {
            if (iSparkRouterInterceptor2.matchInterceptRules(strLJIJI2)) {
                i++;
                arrayList.addAll(iSparkRouterInterceptor2.provideSparkInterceptActivityCallbacks());
                if (!C2190461Ao8.LIZIZ()) {
                    arrayList2.addAll(iSparkRouterInterceptor2.provideSparkInterceptSAFCallbacks());
                }
                iSparkRouterInterceptor2.handleSparkContext(sparkContext, strLJIJI2);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            sparkContext.LJJLIIIJJI((InterfaceC2217701Bqy) it2.next());
        }
        if (!C2190461Ao8.LIZIZ()) {
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                sparkContext.LJJLIIIJL((InterfaceC2217711Bqz) it3.next());
            }
        }
        IECSDKMonitorService iECSDKMonitorService2 = (IECSDKMonitorService) PluggableExtentionKt.pluggableSpi$default(IECSDKMonitorService.class, false, false, false, 14, null);
        if (iECSDKMonitorService2 != null) {
            String strLJIJI3 = sparkContext.LJIJI();
            String strLIZIZ2 = C1547280qMo.LIZIZ(sparkContext);
            if (strLIZIZ2 != null) {
                str = strLIZIZ2;
            }
            iECSDKMonitorService2.LIZJ(strLJIJI3, "ecom", str, SystemClock.elapsedRealtime() - jElapsedRealtime, i);
        }
    }
}
