package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pW5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1514590pW5 {
    public final String LIZ;
    public final Integer LIZIZ;
    public final JSONObject LIZJ;
    public final JSONObject LIZLLL;
    public final Set<String> LJ;
    public final Boolean LJFF;
    public final C1514640pWA LJI;
    public final Boolean LJII;
    public final Set<String> LJIIIIZZ;
    public final C1514640pWA LJIIIZ;

    public C1514590pW5(JSONObject jSONObject) {
        Object c098200Yq;
        try {
            this.LIZJ = jSONObject.optJSONObject("key_points");
            this.LIZLLL = jSONObject.optJSONObject("key_commons");
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("issue_config");
            this.LIZ = jSONObjectOptJSONObject.optString("level_config");
            this.LIZIZ = Integer.valueOf(jSONObjectOptJSONObject.optInt("error_log_min_level"));
            List<Object> listLIZLLL = C08HX.LIZLLL(jSONObject.optJSONObject("full_picture").optJSONArray("deny_space"));
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLIZLLL, 10));
            Iterator<Object> it2 = listLIZLLL.iterator();
            while (it2.hasNext()) {
                arrayList.add(String.valueOf(it2.next()));
            }
            this.LJ = C13LP.LLIIJI(arrayList);
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("custom_logs");
            this.LJII = Boolean.valueOf(jSONObjectOptJSONObject2.optBoolean("is_enable", true));
            this.LJIIIZ = new C1514640pWA(jSONObjectOptJSONObject2);
            List<Object> listLIZLLL2 = C08HX.LIZLLL(jSONObjectOptJSONObject2.optJSONArray("event_deny_list"));
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(listLIZLLL2, 10));
            Iterator<Object> it3 = listLIZLLL2.iterator();
            while (it3.hasNext()) {
                arrayList2.add(String.valueOf(it3.next()));
            }
            this.LJIIIIZZ = C13LP.LLIIJI(arrayList2);
            JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("user_mark_logs");
            this.LJFF = Boolean.valueOf(jSONObjectOptJSONObject3.optBoolean("is_enable", true));
            this.LJI = new C1514640pWA(jSONObjectOptJSONObject3);
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
