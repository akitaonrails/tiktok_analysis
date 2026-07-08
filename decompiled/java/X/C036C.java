package X;

import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.ab.EcPayResultPreloadSetting;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: renamed from: X.036C, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C036C {
    public static final C036C LIZ = new C036C();

    public static void LIZ(String str) {
        IECommerceHostService iECommerceHostService;
        boolean z;
        String name;
        if (!EcPayResultPreloadSetting.LIZ.cacheEnable) {
            return;
        }
        try {
            String strLJIIIIZZ = C1741890vQh.LJIIIIZZ(C2097608Jq.LJIIIIZZ(new Pair("schema", str), new Pair("timestamp", Long.valueOf(System.currentTimeMillis()))));
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                Object service = ServiceManager.get().getService(IApplicationDependencyService.class);
                IECommerceHostService iECommerceHostService2 = (IECommerceHostService) service;
                if (iECommerceHostService2 != null) {
                    z = true;
                } else {
                    z = false;
                }
                String name2 = IApplicationDependencyService.class.getName();
                if (iECommerceHostService2 != null) {
                    name = iECommerceHostService2.getClass().getName();
                } else {
                    name = null;
                }
                C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
                iECommerceHostService = (IECommerceHostService) service;
            } else {
                C1120604Zw.LIZ.LIZ();
                iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
            }
            C1323720kYE.LIZ(((IApplicationDependencyService) iECommerceHostService).getApplicationContext()).LJIIIIZZ(strLJIIIIZZ, "payment_result_cache_spark_schema");
            ((IEventCenter) ServiceManager.get().getService(IEventCenter.class)).LIZ("ec_payment_result_schema_event", strLJIIIIZZ);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }
}
