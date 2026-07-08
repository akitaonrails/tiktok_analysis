package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0oKj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1469110oKj implements InterfaceC1467990oIv {
    public final ArrayList<InterfaceC1469140oKm> LIZ = new ArrayList<>();

    public final String toString() {
        if (this.LIZ.size() <= 0) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < this.LIZ.size(); i++) {
            JSONObject jSONObjectLJLIIIL = ((InterfaceC1469140oKm) ListProtector.get(this.LIZ, i)).LJLIIIL();
            if (jSONObjectLJLIIIL != null && jSONObjectLJLIIIL.has("url") && jSONObjectLJLIIIL.has("language_id") && jSONObjectLJLIIIL.has("format") && jSONObjectLJLIIIL.has("sub_id")) {
                jSONArray.put(jSONObjectLJLIIIL);
            }
        }
        try {
            jSONObject.putOpt("list", jSONArray);
            return C786410Ut5.J3(jSONObject);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            int i2 = C2187451AjH.LIZ;
            TTVideoEngineLog.d(e);
            return null;
        }
    }

    public C1469110oKj(JSONObject jSONObject) {
        JSONArray jSONArrayOptJSONArray;
        if (!jSONObject.has("list") || (jSONArrayOptJSONArray = jSONObject.optJSONArray("list")) == null) {
            return;
        }
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.has("language_id") && jSONObjectOptJSONObject.has("format") && jSONObjectOptJSONObject.has("url") && jSONObjectOptJSONObject.has("sub_id")) {
                this.LIZ.add(new C1469120oKk(jSONObjectOptJSONObject));
            }
        }
    }

    public final String LIZ(int i) {
        ArrayList<InterfaceC1469140oKm> arrayList = this.LIZ;
        String strOptString = null;
        if (arrayList != null && arrayList.size() > 0) {
            Iterator<InterfaceC1469140oKm> it2 = this.LIZ.iterator();
            while (it2.hasNext()) {
                JSONObject jSONObjectLJLIIIL = it2.next().LJLIIIL();
                if (jSONObjectLJLIIIL.optInt("sub_id") == i) {
                    strOptString = jSONObjectLJLIIIL.optString("url");
                }
            }
        }
        return strOptString;
    }
}
