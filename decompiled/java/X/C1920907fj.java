package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.ab.EcMobSpliceCheckNetworkInterceptConfigV2;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.07fj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1920907fj extends C09AY implements Function0<Map<String, ? extends EcMobSpliceCheckNetworkInterceptConfigV2.InterceptConfig>> {
    public C1920907fj() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Map<String, ? extends EcMobSpliceCheckNetworkInterceptConfigV2.InterceptConfig> invoke() {
        Object c098200Yq;
        Map map = (Map) C0C64.LJIILLIIL().LJJII(Map.class, EcMobSpliceCheckNetworkInterceptConfigV2.LIZ, "ecom_splice_check_network_intercept_config_v2", true);
        if (map == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(C2097908Jt.LIZIZ(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            try {
                Object objLIZ = C20485080t.LIZ(C20485080t.LIZIZ(entry.getValue()), EcMobSpliceCheckNetworkInterceptConfigV2.InterceptConfig.class);
                ((EcMobSpliceCheckNetworkInterceptConfigV2.InterceptConfig) objLIZ).path = (String) entry.getKey();
                c098200Yq = (EcMobSpliceCheckNetworkInterceptConfigV2.InterceptConfig) objLIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            linkedHashMap.put(key, c098200Yq);
        }
        return linkedHashMap;
    }
}
