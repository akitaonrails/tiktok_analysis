package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.core.ab.PdpLynxPreloadItem;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.04zd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1279904zd {
    public static final n LIZ = new n();

    public static Map LIZ() {
        HashMap map;
        try {
            map = (HashMap) C1280004ze.LIZ(String.valueOf(C0C64.LJIILLIIL().LJJII(n.class, LIZ, "pdp_lynx_config", true)), HashMap.class);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            map = null;
        }
        if (map != null) {
            try {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj : map.keySet()) {
                    Object obj2 = map.get(obj);
                    Map map2 = obj2 instanceof Map ? (Map) obj2 : null;
                    if (map2 != null) {
                        linkedHashMap.put(obj.toString(), C1280004ze.LIZ(map2.toString(), PdpLynxPreloadItem.class));
                    }
                }
                return linkedHashMap;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
        return null;
    }
}
