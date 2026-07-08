package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04zf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1280104zf {
    public static final C1280104zf LIZ = new C1280104zf();
    public static final ConcurrentHashMap<String, List<String>> LIZIZ = new ConcurrentHashMap<>();

    public static String LIZ(List list, Map map) {
        StringBuilder sb = new StringBuilder();
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                String str = (String) it2.next();
                C1280104zf c1280104zf = LIZ;
                Object objLIZLLL = map.get(str);
                c1280104zf.getClass();
                if (Intrinsics.LJFF(str, "diversion_params") && (objLIZLLL instanceof String)) {
                    try {
                        Map map2 = (Map) C1280004ze.LIZIZ((String) objLIZLLL, new TypeToken<Map<String, ? extends Object>>() { // from class: X.00Wb
                        }.getType());
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (String str2 : C13LP.LJLLJ(map2.keySet())) {
                            Object obj = map2.get(str2);
                            if (obj == null) {
                                obj = "";
                            }
                            linkedHashMap.put(str2, obj);
                        }
                        objLIZLLL = C1280004ze.LIZLLL(linkedHashMap);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
                sb.append(str);
                sb.append(objLIZLLL);
            }
        }
        return C2085508Ez.LIZ(sb.toString());
    }
}
