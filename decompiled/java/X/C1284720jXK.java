package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0jXK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1284720jXK extends Error {
    public int code;
    public Map info;
    public final boolean playForbidden;
    public long timeStamp;

    public String getInfoJSON() {
        if (this.info == null) {
            this.info = new HashMap();
        }
        JSONObject jSONObject = new JSONObject(this.info);
        try {
            jSONObject.put("timestamp", this.timeStamp);
            jSONObject.put("message", super.toString());
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            C1481110oe5.LIZIZ("Live Error", e.toString());
        }
        return C786410Ut5.J3(jSONObject);
    }

    @Override // java.lang.Throwable
    public String toString() {
        if (this.info == null) {
            this.info = new HashMap();
        }
        JSONObject jSONObject = new JSONObject(this.info);
        try {
            jSONObject.put("message", super.toString());
            jSONObject.put("code", this.code);
            jSONObject.put("timestamp", this.timeStamp);
            jSONObject.put("playForbidden", this.playForbidden);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            C1481110oe5.LIZIZ("Live Error", e.toString());
        }
        return C786410Ut5.J3(jSONObject);
    }

    public C1284720jXK(int i, String str, Map<String, String> map, boolean z) {
        super(str);
        this.code = i;
        this.info = map;
        this.timeStamp = System.currentTimeMillis();
        this.playForbidden = z;
    }
}
