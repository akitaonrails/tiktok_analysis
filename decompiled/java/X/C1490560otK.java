package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0otK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1490560otK implements InterfaceC800590Var {
    public final /* synthetic */ String LIZ;
    public final /* synthetic */ Set LIZIZ;
    public final /* synthetic */ boolean LIZJ;

    @Override // X.InterfaceC800590Var
    public final Object LIZ() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("$$APP_ID", this.LIZ);
            JSONArray jSONArray = new JSONArray();
            Iterator it2 = this.LIZIZ.iterator();
            while (it2.hasNext()) {
                jSONArray.put(it2.next());
            }
            jSONObject.put("$$EVENT_LOCAL_ID_ARRAY", jSONArray);
            jSONObject.put("$$UPLOAD_STATUS", this.LIZJ ? "success" : "failed");
            return jSONObject;
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            return jSONObject;
        }
    }

    public C1490560otK(String str, Set set, boolean z) {
        this.LIZ = str;
        this.LIZIZ = set;
        this.LIZJ = z;
    }
}
