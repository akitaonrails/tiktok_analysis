package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS225S0000000_34;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.050d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C12825050d {
    public static final C12825050d LIZ = new C12825050d();
    public static final ConcurrentHashMap<String, String> LIZIZ = new ConcurrentHashMap<>();
    public static boolean LIZJ = true;
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(272));

    public static final JSONObject LIZ() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (LIZJ) {
                LIZJ = false;
                ConcurrentHashMap<String, String> concurrentHashMap = LIZIZ;
                concurrentHashMap.clear();
                Map<? extends String, ? extends String> mapLJI = ((AbstractC1505170pGt) LIZLLL.getValue()).LJI();
                if (mapLJI == null) {
                    mapLJI = C2097608Jq.LJ();
                }
                concurrentHashMap.putAll(mapLJI);
            }
            Iterator<T> it2 = LIZIZ.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                jSONObject.putOpt((String) entry.getKey(), entry.getValue());
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
            return jSONObject;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return jSONObject;
        }
    }
}
