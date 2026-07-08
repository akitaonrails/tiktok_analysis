package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0qFk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1542900qFk {
    public static InterfaceC1542880qFi LJFF;
    public static final ConcurrentHashMap<String, C1542910qFl> LIZ = new ConcurrentHashMap<>();
    public static final CopyOnWriteArraySet<String> LIZIZ = new CopyOnWriteArraySet<>();
    public static final CopyOnWriteArraySet<String> LIZJ = new CopyOnWriteArraySet<>();
    public static boolean LIZLLL = true;
    public static final AtomicBoolean LJ = new AtomicBoolean(false);
    public static final C1238404sw LJI = new C1238404sw();

    public static void LIZIZ(String str, C1238404sw c1238404sw) {
        Set setKeySet;
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, C1542910qFl> entry : LIZ.entrySet()) {
            String key = entry.getKey();
            C1542910qFl value = entry.getValue();
            if (value.LJFF) {
                setKeySet = C15442062u.LJIIIZ(value.LIZJ.keySet(), ((LinkedHashMap) value.LIZIZ).keySet());
            } else {
                setKeySet = ((LinkedHashMap) value.LIZIZ).keySet();
            }
            jSONObject.put(key, setKeySet);
        }
        c1238404sw.LIZ(str, new JSONObject().put("config_host_list", jSONObject));
    }

    public static void LIZJ(String str, JSONObject jSONObject) {
        C1238404sw c1238404sw = LJI;
        synchronized (c1238404sw) {
            try {
                c1238404sw.LIZ(str, jSONObject);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static void LIZ(String str, String str2, JSONObject jSONObject) {
        ConcurrentHashMap<String, C1542910qFl> concurrentHashMap = LIZ;
        C1542910qFl c1542910qFl = concurrentHashMap.get(str);
        if (c1542910qFl == null) {
            concurrentHashMap.put(str, new C1542910qFl(str, jSONObject));
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("create_config_");
            sbLIZ.append(str2);
            LIZIZ(C2188811AlT.LIZIZ(sbLIZ), LJI);
            int i = C2187451AjH.LIZ;
            InterfaceC1297560js2 interfaceC1297560js2 = C1543410qGZ.LJIIIZ;
            return;
        }
        c1542910qFl.LIZJ(jSONObject);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("update_config_");
        sbLIZ2.append(str2);
        LIZIZ(C2188811AlT.LIZIZ(sbLIZ2), LJI);
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("update PermissionConfigNamespace for ");
        sbLIZ3.append(str);
        C2188811AlT.LIZIZ(sbLIZ3);
        InterfaceC1297560js2 interfaceC1297560js22 = C1543410qGZ.LJIIIZ;
    }
}
