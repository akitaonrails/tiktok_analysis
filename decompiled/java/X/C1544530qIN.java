package X;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0qIN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1544530qIN {
    public String LIZ;
    public ArrayList<C1544540qIO> LIZIZ;

    public final JSONObject LIZ() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("source", this.LIZ);
        JSONArray jSONArray = new JSONArray();
        ArrayList<C1544540qIO> arrayList = this.LIZIZ;
        if (arrayList != null) {
            int i = 0;
            for (C1544540qIO c1544540qIO : arrayList) {
                int i2 = i + 1;
                if (i < 0) {
                    C1697810uHb.LJIJI();
                    throw null;
                }
                C1544540qIO c1544540qIO2 = c1544540qIO;
                c1544540qIO2.getClass();
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("channel", c1544540qIO2.LIZ);
                jSONObject2.put("version", c1544540qIO2.LIZIZ);
                jSONArray.put(jSONObject2);
                i = i2;
            }
        }
        jSONObject.put("packages", jSONArray);
        return jSONObject;
    }
}
