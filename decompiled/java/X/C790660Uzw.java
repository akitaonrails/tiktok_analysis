package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Uzw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C790660Uzw {
    public final String[] LIZ;
    public final String LIZIZ;
    public final long LIZJ;

    public final JSONObject LIZ() {
        try {
            if (TextUtils.isEmpty(this.LIZIZ)) {
                return null;
            }
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            for (String str : this.LIZ) {
                jSONArray.put(str);
            }
            jSONObject.put("urls", jSONArray);
            jSONObject.put("key", this.LIZIZ);
            if (!TextUtils.isEmpty(null)) {
                jSONObject.put("custom_path", (Object) null);
            }
            if (!TextUtils.isEmpty(null)) {
                jSONObject.put("context", (Object) null);
            }
            jSONObject.put("preload_size", this.LIZJ);
            return jSONObject;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public C790660Uzw(long j, String str, String[] strArr) {
        this.LIZIZ = str;
        this.LIZJ = j;
        this.LIZ = strArr;
    }
}
