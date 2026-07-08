package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0V6R, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0V6R extends C0V6S {
    public final JSONArray LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;

    @Override // X.C0VB5
    public final String getLogType() {
        return "tracing";
    }

    @Override // X.C0VB5
    public final boolean isValid() {
        return true;
    }

    @Override // X.C0VB5
    public final JSONObject LIZ() {
        try {
            JSONObject jSONObjectPut = new JSONObject().put("wrapper_array_data", this.LIZIZ);
            jSONObjectPut.put("log_type", "tracing");
            jSONObjectPut.put("wrapper_type_description", 1);
            return jSONObjectPut;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    @Override // X.C0VB5
    public final boolean LIZIZ() {
        return this.LIZJ;
    }

    public C0V6R(JSONObject jSONObject) {
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(jSONObject);
        this.LIZIZ = jSONArray;
    }

    public C0V6R(JSONArray jSONArray) {
        this.LIZIZ = jSONArray;
    }
}
