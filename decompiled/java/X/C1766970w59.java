package X;

import com.bytedance.android.bcm.api.model.BcmParams;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0w59, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1766970w59 {
    public static C1766960w58 LIZ(C1766940w56 c1766940w56) {
        BcmParams bcmParams;
        Map<String, Object> map;
        BcmParams bcmParams2;
        Map<String, Object> map2;
        try {
            C1766960w58 c1766960w58 = new C1766960w58(c1766940w56);
            C1766990w5B c1766990w5B = c1766940w56.LJIIIZ;
            if (c1766990w5B != null && (bcmParams2 = c1766990w5B.LIZ) != null && (map2 = bcmParams2.toMap()) != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry<String, Object> entry : map2.entrySet()) {
                    if (!Intrinsics.LJFF(entry.getKey(), "local_service_pass_through_params")) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                if (!linkedHashMap.isEmpty()) {
                    c1766960w58.LJIIJ = C051S.LIZ(linkedHashMap);
                }
            }
            C1766990w5B c1766990w5B2 = c1766940w56.LJIIIZ;
            if (c1766990w5B2 != null && (bcmParams = c1766990w5B2.LIZIZ) != null && (map = bcmParams.toMap()) != null) {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry<String, Object> entry2 : map.entrySet()) {
                    if (!Intrinsics.LJFF(entry2.getKey(), "local_service_pass_through_params")) {
                        linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                    }
                }
                if (!linkedHashMap2.isEmpty()) {
                    c1766960w58.LJIIJJI = C051S.LIZ(linkedHashMap2);
                }
            }
            return c1766960w58;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return new C1766960w58(c1766940w56);
        }
    }
}
