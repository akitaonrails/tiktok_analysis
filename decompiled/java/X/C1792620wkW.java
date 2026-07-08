package X;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0wkW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public class C1792620wkW {
    public final List LIZ;

    public C1792620wkW(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null) {
                    arrayList.add(new C1792600wkU(jSONObjectOptJSONObject));
                }
            }
        }
        this.LIZ = arrayList;
    }
}
