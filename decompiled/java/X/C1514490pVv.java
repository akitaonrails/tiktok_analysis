package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pVv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1514490pVv {
    public static final Set<String> LJFF = new LinkedHashSet();
    public final boolean LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final boolean LIZLLL;
    public final Map<String, List<C443120HZe<String, String, String>>> LJ = new LinkedHashMap();

    public C1514490pVv(JSONObject jSONObject) {
        Object c098200Yq;
        boolean z;
        this.LIZ = true;
        this.LIZIZ = 64;
        this.LIZJ = 12;
        this.LIZLLL = true;
        try {
            LJFF.clear();
            if (jSONObject.optInt("is_enable") == 1) {
                z = true;
            } else {
                z = false;
            }
            this.LIZ = z;
            jSONObject.optInt("config_ver");
            this.LIZIZ = jSONObject.optInt("issueid_limit");
            this.LIZJ = jSONObject.optInt("bizsteps_limit");
            this.LIZLLL = jSONObject.optInt("info_into_context") == 1;
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("checkpoints");
            if (jSONObjectOptJSONObject != null) {
                Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    ArrayList arrayList = new ArrayList();
                    JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray(next);
                    if (jSONArrayOptJSONArray != null) {
                        int length = jSONArrayOptJSONArray.length();
                        for (int i = 0; i < length; i++) {
                            JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i);
                            if (jSONObjectOptJSONObject2 != null) {
                                String strOptString = jSONObjectOptJSONObject2.optString("point");
                                arrayList.add(new C443120HZe(strOptString, jSONObjectOptJSONObject2.optString("alias"), jSONObjectOptJSONObject2.optString("value")));
                                LJFF.add(strOptString);
                            }
                        }
                    }
                    this.LJ.put(next, arrayList);
                }
            }
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C1520960pgM.LIZIZ(thM5exceptionOrNullimpl);
        }
    }
}
