package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Set;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0xob, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1833590xob {
    public int LIZIZ;
    public String LIZ = "";
    public Set<String> LIZJ = C08CX.INSTANCE;

    public final String LIZ() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("date", this.LIZ);
        jSONObject.put("show_times", this.LIZIZ);
        jSONObject.put("type_list", C13LP.LJJLIIIJ(this.LIZJ, ",", null, null, 0, null, null, 62));
        return C786410Ut5.J3(jSONObject);
    }

    public static C1833590xob LIZIZ(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            Set<String> setLLIIJI = C13LP.LLIIJI(a0.LJJLIIIJILLIZJL(jSONObject.optString("type_list"), new String[]{","}, 0, 6));
            C1833590xob c1833590xob = new C1833590xob();
            c1833590xob.LIZ = jSONObject.optString("date");
            c1833590xob.LIZIZ = jSONObject.optInt("show_times");
            c1833590xob.LIZJ = setLLIIJI;
            return c1833590xob;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }
}
