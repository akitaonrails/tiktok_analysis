package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0f8m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1115740f8m {
    public final JSONObject LIZ = new JSONObject();
    public final JSONObject LIZIZ = new JSONObject();

    public final void LIZ(Object obj, String str) {
        try {
            this.LIZIZ.put(str, obj);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
