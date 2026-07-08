package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.08I3, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08I3 {
    public final Map<String, Set<String>> LIZ;
    public final Integer LIZIZ;
    public final String LIZJ;
    public final Integer LIZLLL;
    public final Set<String> LJ;

    public C08I3(JSONObject jSONObject) {
        Object c098200Yq;
        String strOptString;
        int iValueOf;
        try {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("issues_pickup");
            this.LIZ = new LinkedHashMap();
            Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Map<String, Set<String>> map = this.LIZ;
                if (map != null) {
                    List<Object> listLIZLLL = C08HX.LIZLLL(jSONObjectOptJSONObject.optJSONArray(next));
                    ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLIZLLL, 10));
                    Iterator<Object> it2 = listLIZLLL.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(String.valueOf(it2.next()));
                    }
                    map.put(next, C13LP.LLIIJI(arrayList));
                }
            }
            this.LIZIZ = Integer.valueOf(jSONObject.optInt("max_field_length"));
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("report_condition");
            if (jSONObjectOptJSONObject2 != null) {
                strOptString = jSONObjectOptJSONObject2.optString("level_config");
            } else {
                strOptString = null;
            }
            this.LIZJ = strOptString;
            JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("report_condition");
            if (jSONObjectOptJSONObject3 != null) {
                iValueOf = Integer.valueOf(jSONObjectOptJSONObject3.optInt("minimum_level", 7));
            } else {
                iValueOf = 7;
            }
            this.LIZLLL = iValueOf;
            JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("timeline_pickup");
            List<Object> listLIZLLL2 = C08HX.LIZLLL(jSONObjectOptJSONObject4 != null ? jSONObjectOptJSONObject4.optJSONArray("deny_space") : null);
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(listLIZLLL2, 10));
            Iterator<Object> it3 = listLIZLLL2.iterator();
            while (it3.hasNext()) {
                arrayList2.add(String.valueOf(it3.next()));
            }
            this.LJ = C13LP.LLIIJI(arrayList2);
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
