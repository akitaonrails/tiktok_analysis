package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.08AB, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08AB {
    public final int LIZ;
    public final String LIZIZ;
    public final ArrayList<C443120HZe<String, Long, Integer>> LIZJ;
    public JSONObject LIZLLL;

    public C08AB() {
        ArrayList<C443120HZe<String, Long, Integer>> arrayList = new ArrayList<>();
        this.LIZ = 1;
        this.LIZIZ = "";
        this.LIZJ = arrayList;
    }

    public final void LIZLLL() {
        try {
            C189200o6.m2constructorimpl(Boolean.valueOf(this.LIZJ.add(new C443120HZe<>("_pending", Long.valueOf(System.currentTimeMillis()), Integer.valueOf(this.LIZ)))));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public final void LIZ() {
        try {
            C189200o6.m2constructorimpl(Boolean.valueOf(this.LIZJ.add(new C443120HZe<>(this.LIZIZ, Long.valueOf(System.currentTimeMillis()), Integer.valueOf(-this.LIZ)))));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public static JSONObject LIZIZ(C08AB c08ab) throws JSONException {
        JSONObject jSONObject = c08ab.LIZLLL;
        if (jSONObject == null) {
            Map mapLIZ = C08AA.LIZ(c08ab, null);
            jSONObject = new JSONObject();
            for (Map.Entry entry : ((LinkedHashMap) mapLIZ).entrySet()) {
                jSONObject.put((String) entry.getKey(), ((Number) entry.getValue()).longValue());
            }
            c08ab.LIZLLL = jSONObject;
        }
        return jSONObject;
    }

    public final void LIZJ(String str) {
        LJ(System.currentTimeMillis(), str);
    }

    public final void LJ(long j, String str) {
        try {
            C189200o6.m2constructorimpl(Boolean.valueOf(this.LIZJ.add(new C443120HZe<>(str, Long.valueOf(j), Integer.valueOf(this.LIZ + 1)))));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }
}
