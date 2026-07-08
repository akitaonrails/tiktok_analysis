package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;

/* JADX INFO: renamed from: X.01Dj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C297701Dj {
    public static final Map<String, Object> LIZ(Object obj) {
        Map map;
        Set<Map.Entry> setEntrySet;
        if ((obj instanceof Map) && (map = (Map) obj) != null && (setEntrySet = map.entrySet()) != null) {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : setEntrySet) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                if ((key instanceof String) && key != null) {
                    arrayList.add(new Pair(key, value));
                }
            }
            Map<String, Object> mapLJIILLIIL = C2097608Jq.LJIILLIIL(arrayList);
            if (mapLJIILLIIL != null) {
                return mapLJIILLIIL;
            }
        }
        return C2097608Jq.LJ();
    }

    public static final String LIZIZ(String str) {
        Object c098200Yq;
        try {
            c098200Yq = URLDecoder.decode(str, StandardCharsets.UTF_8.name());
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        return (String) c098200Yq;
    }

    public static final Long LIZJ(Map map) {
        Long lLJIILIIL;
        Object obj = map.get("tiktok_order_id");
        if (obj instanceof Number) {
            Long lValueOf = Long.valueOf(((Number) obj).longValue());
            if (lValueOf.longValue() > 0) {
                return lValueOf;
            }
            return null;
        }
        if ((obj instanceof String) && (lLJIILIIL = C2095008Iq.LJIILIIL((String) obj)) != null && lLJIILIIL.longValue() > 0) {
            return lLJIILIIL;
        }
        return null;
    }
}
