package X;

import android.os.Bundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: renamed from: X.093c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C23094093c {
    public static final C23094093c LIZ = new C23094093c();
    public static final Map<String, Object> LIZIZ;

    static {
        Object c098200Yq;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("language", C786410Ut5.t2(Locale.getDefault()));
        new Object() { // from class: X.093d
        }.getClass();
        C13DA c13da = new C13DA();
        try {
            C212350188e c212350188eLIZJ = C212350188e.LIZJ();
            C844470XAv.LIZ.getClass();
            C09GA c09gaLIZIZ = c212350188eLIZJ.LIZIZ(C844470XAv.LJIIJ);
            if (c09gaLIZIZ != null) {
                Bundle bundle = new Bundle();
                C1300610jwx c1300610jwx = C1300610jwx.LIZJ;
                C1300610jwx c1300610jwx2 = C1300610jwx.LIZLLL;
                c09gaLIZIZ.LJIILJJIL(new C1300610jwx[]{c1300610jwx, c1300610jwx2}, bundle);
                c13da.put("device_overall_score", Float.valueOf(bundle.getFloat(c1300610jwx.LIZ)));
                c13da.put("device_cpu_score", Float.valueOf(bundle.getFloat(c1300610jwx2.LIZ)));
            }
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C2097608Jq.LJ();
        C189200o6.m7isFailureimpl(c098200Yq);
        linkedHashMap.putAll(c13da.build());
        LIZIZ = linkedHashMap;
    }

    public static boolean LIZ(Map map) {
        Collection collectionValues = ((LinkedHashMap) map).values();
        if ((collectionValues instanceof Collection) && collectionValues.isEmpty()) {
            return true;
        }
        for (Object obj : collectionValues) {
            LIZ.getClass();
            if (!LIZIZ(obj)) {
                return false;
            }
        }
        return true;
    }

    public static boolean LIZIZ(Object obj) {
        if (!(obj instanceof Double) && !(obj instanceof Integer) && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Float)) {
            if (obj instanceof Object[]) {
                for (Object obj2 : (Object[]) obj) {
                    if (obj2 == null) {
                        return false;
                    }
                    LIZ.getClass();
                    if (!LIZIZ(obj2)) {
                        return false;
                    }
                }
            } else if (obj instanceof List) {
                Iterable iterable = (Iterable) obj;
                if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                    for (Object obj3 : iterable) {
                        if (obj3 == null) {
                            return false;
                        }
                        LIZ.getClass();
                        if (!LIZIZ(obj3)) {
                            return false;
                        }
                    }
                }
            } else {
                if (!(obj instanceof Map)) {
                    return false;
                }
                Collection collectionValues = ((Map) obj).values();
                if (!(collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
                    for (Object obj4 : collectionValues) {
                        if (obj4 == null) {
                            return false;
                        }
                        LIZ.getClass();
                        if (!LIZIZ(obj4)) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
}
