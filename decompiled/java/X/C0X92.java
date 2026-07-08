package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0X92, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0X92 {
    public final JSONObject LIZ;
    public final List<String> LIZIZ = new ArrayList();
    public final List<C0X91> LIZJ = new ArrayList();
    public final long LIZLLL;

    public final void LIZ(JSONObject jSONObject) {
        JSONArray jSONArrayNames;
        if (jSONObject != null && (jSONArrayNames = jSONObject.names()) != null && jSONArrayNames.length() > 0) {
            int length = jSONArrayNames.length();
            for (int i = 0; i < length; i++) {
                String strOptString = jSONArrayNames.optString(i);
                if (!TextUtils.isEmpty(strOptString)) {
                    this.LIZIZ.add(strOptString);
                    JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(strOptString);
                    if (jSONObjectOptJSONObject != null) {
                        this.LIZJ.add(new C0X91(strOptString, jSONObjectOptJSONObject));
                    }
                }
            }
        }
    }

    public C0X92(String str, Long l) {
        this.LIZLLL = -1L;
        if (l != null) {
            this.LIZLLL = l.longValue();
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                this.LIZ = jSONObject;
                LIZ(jSONObject);
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public C0X92(Long l, JSONObject jSONObject) {
        this.LIZLLL = -1L;
        if (l != null) {
            this.LIZLLL = l.longValue();
        }
        this.LIZ = jSONObject;
        LIZ(jSONObject);
    }
}
