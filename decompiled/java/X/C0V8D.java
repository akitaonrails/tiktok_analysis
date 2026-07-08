package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0V8D, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public class C0V8D {
    public String LIZ;
    public long LIZIZ;
    public float LIZJ;
    public boolean LIZLLL;
    public String LJ = "normal";
    public List<C0V8D> LJFF = new ArrayList();

    public final JSONObject LIZ() {
        JSONObject jSONObject = new JSONObject();
        try {
            String strReplace = this.LIZ;
            if (strReplace != null) {
                if (strReplace.contains(C0V8C.LLJLILLLLZIIL)) {
                    strReplace = strReplace.replace(C0V8C.LLJLILLLLZIIL, "internal");
                } else if (strReplace.contains(C0V8C.LLJLL)) {
                    strReplace = strReplace.replace(C0V8C.LLJLL, "external");
                }
            }
            jSONObject.put("path", strReplace);
            jSONObject.put("size", this.LIZIZ);
            jSONObject.put("size_rate", this.LIZJ);
            jSONObject.put("is_folder", this.LIZLLL);
            jSONObject.put("report_type", this.LJ);
            if (!((ArrayList) this.LJFF).isEmpty()) {
                JSONArray jSONArray = new JSONArray();
                Iterator it2 = ((ArrayList) this.LJFF).iterator();
                while (it2.hasNext()) {
                    jSONArray.put(((C0V8D) it2.next()).LIZ());
                }
                jSONObject.put("next_disk", jSONArray);
                return jSONObject;
            }
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return jSONObject;
    }
}
