package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0V8J, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public class C0V8J {
    public String LIZ;
    public long LIZIZ;
    public float LIZJ;
    public boolean LIZLLL;
    public String LJ = "normal";
    public List<C0V8J> LJFF = new ArrayList();
    public final /* synthetic */ C0V8I LJI;

    public final String LIZ() {
        String str = this.LIZ;
        String strLJII = this.LJI.LJII(str);
        if (strLJII != null) {
            str = strLJII;
        }
        return str.contains(this.LJI.LIZ) ? str.replace(this.LJI.LIZ, "internal") : str.contains(this.LJI.LIZJ) ? str.replace(this.LJI.LIZJ, "external") : str;
    }

    public final JSONObject LIZIZ() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("path", LIZ());
            jSONObject.put("size", this.LIZIZ);
            jSONObject.put("size_rate", this.LIZJ);
            jSONObject.put("is_folder", this.LIZLLL);
            jSONObject.put("report_type", this.LJ);
            if (!this.LJFF.isEmpty()) {
                JSONArray jSONArray = new JSONArray();
                Iterator<C0V8J> it2 = this.LJFF.iterator();
                while (it2.hasNext()) {
                    jSONArray.put(it2.next().LIZIZ());
                }
                jSONObject.put("next_disk", jSONArray);
                return jSONObject;
            }
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return jSONObject;
    }

    public C0V8J(C0V8I c0v8i) {
        this.LJI = c0v8i;
    }
}
