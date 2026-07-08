package X;

import com.bytedance.ies.abmock.ConfigItem;
import com.google.gson.k;
import com.google.gson.m;
import com.google.gson.n;
import com.google.gson.q;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.0C7O, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0C7O {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZIZ() {
        Map<String, ConfigItem> map = C2502809rO.LIZ;
        n nVar = new n();
        for (Map.Entry entry : ((HashMap) map).entrySet()) {
            LIZLLL(nVar, LIZ((String) entry.getKey()), (String) entry.getKey());
        }
        Map<String, Object> map2 = C2281541ESa.LIZ;
        if (map2 != null) {
            for (Map.Entry entry2 : ((HashMap) map2).entrySet()) {
                LIZLLL(nVar, entry2.getValue(), (String) entry2.getKey());
            }
        }
        Set<String> setLIZIZ = C0C54.LIZJ.LIZIZ();
        if (setLIZIZ != null) {
            for (String str : setLIZIZ) {
                LIZLLL(nVar, C0C54.LIZJ.LIZLLL(str, false), str);
            }
        }
        return nVar.toString();
    }

    public static Map LIZJ() {
        Map<String, ConfigItem> map = C2502809rO.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : ((HashMap) map).entrySet()) {
            linkedHashMap.put(entry.getKey(), LIZ((String) entry.getKey()));
        }
        Map<String, Object> map2 = C2281541ESa.LIZ;
        if (map2 != null) {
            for (Map.Entry entry2 : ((HashMap) map2).entrySet()) {
                linkedHashMap.put(entry2.getKey(), entry2.getValue());
            }
        }
        Set<String> setLIZIZ = C0C54.LIZJ.LIZIZ();
        if (setLIZIZ != null) {
            for (String str : setLIZIZ) {
                linkedHashMap.put(str, C0C54.LIZJ.LIZLLL(str, false));
            }
        }
        return linkedHashMap;
    }

    public static Object LIZ(String str) {
        return C0C59.LJ().LJIIJJI(str, false);
    }

    public static void LIZLLL(n nVar, Object obj, String str) {
        k qVar;
        if (obj instanceof Number) {
            nVar.LJJIII((Number) obj, str);
            return;
        }
        if (obj instanceof Boolean) {
            nVar.LJJII((Boolean) obj, str);
            return;
        }
        if (obj instanceof String) {
            nVar.LJJIIJ(str, (String) obj);
            return;
        }
        if (obj instanceof Character) {
            if (obj == null) {
                qVar = m.LL;
            } else {
                qVar = new q(obj);
            }
            nVar.LJJIFFI(str, qVar);
            return;
        }
        if (obj instanceof k) {
            nVar.LJJIFFI(str, (k) obj);
        } else {
            if (obj != null) {
                return;
            }
            nVar.LJJIFFI(str, null);
        }
    }
}
