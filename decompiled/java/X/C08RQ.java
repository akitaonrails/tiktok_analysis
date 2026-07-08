package X;

import android.net.Uri;
import android.os.Bundle;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;

/* JADX INFO: renamed from: X.08RQ, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08RQ {
    public static final Map<String, Map<String, String>> LIZ = new ConcurrentHashMap();

    public static Map LIZIZ(Uri uri) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        try {
            for (String str : UriProtector.getQueryParameterNames(uri)) {
                String strLIZJ = C1946007jm.LIZJ(uri, str);
                if (strLIZJ != null) {
                    concurrentHashMap.put(str, strLIZJ);
                }
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
            return concurrentHashMap;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return concurrentHashMap;
        }
    }

    public static final Map<String, String> LIZJ(String str) {
        Map<String, String> map = (Map) ((ConcurrentHashMap) LIZ).get(str);
        if (map == null) {
            return new LinkedHashMap();
        }
        return map;
    }

    public static final void LIZLLL(String str, Map<String, String> map) {
        ((ConcurrentHashMap) LIZ).put(str, map);
    }

    public static final Map<String, String> LIZ(Uri uri, Map<String, String> map, Bundle bundle) {
        Uri uri2;
        Object c098200Yq;
        Object obj;
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        if (map != null) {
            concurrentHashMap.putAll(map);
        }
        Unit unit = null;
        if (bundle != null) {
            ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
            for (String str : bundle.keySet()) {
                try {
                    obj = bundle.get(str);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    obj = null;
                } catch (OutOfMemoryError e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    obj = null;
                }
                concurrentHashMap2.put(str, String.valueOf(obj));
            }
            concurrentHashMap.putAll(concurrentHashMap2);
        }
        try {
            String strLIZJ = C1946007jm.LIZJ(uri, "url");
            if (strLIZJ == null) {
                if (bundle == null) {
                    c098200Yq = null;
                } else {
                    try {
                        c098200Yq = bundle.getString("url");
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        c098200Yq = new C098200Yq(th);
                        C189200o6.m2constructorimpl(c098200Yq);
                    }
                }
                C189200o6.m2constructorimpl(c098200Yq);
                if (C189200o6.m7isFailureimpl(c098200Yq)) {
                    c098200Yq = null;
                }
                strLIZJ = (String) c098200Yq;
            }
            if (strLIZJ == null) {
                if (map != null) {
                    strLIZJ = map.get("url");
                } else {
                    strLIZJ = null;
                }
            }
            if (strLIZJ != null && (uri2 = UriProtector.parse(strLIZJ)) != null) {
                concurrentHashMap.putAll(LIZIZ(uri2));
                unit = Unit.LIZ;
            }
            C189200o6.m2constructorimpl(unit);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C189200o6.m2constructorimpl(new C098200Yq(th2));
        }
        concurrentHashMap.putAll(LIZIZ(uri));
        return concurrentHashMap;
    }
}
