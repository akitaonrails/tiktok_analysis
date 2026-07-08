package X;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0VCL, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VCL {
    public long LIZ;
    public final Map<C0VCN, C122100dH> LIZIZ = new HashMap();

    public static C0VCL LIZ(JSONObject jSONObject) {
        C0VCL c0vcl = new C0VCL();
        long jOptLong = jSONObject.optLong("duration", 0L);
        long jOptLong2 = jSONObject.optLong("expire_time", 0L);
        if (jOptLong2 > 0) {
            c0vcl.LIZ = jOptLong2;
        } else {
            c0vcl.LIZ = System.currentTimeMillis() + (jOptLong * 1000);
        }
        C0VCN c0vcn = C0VCN.OTHER_LOG_TYPE;
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(c0vcn.logType);
        if (jSONObjectOptJSONObject != null) {
            ((HashMap) c0vcl.LIZIZ).put(c0vcn, C122100dH.LIZ(jSONObjectOptJSONObject));
        }
        C0VCN c0vcn2 = C0VCN.SERVICE_MONITOR;
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject(c0vcn2.logType);
        if (jSONObjectOptJSONObject2 != null) {
            ((HashMap) c0vcl.LIZIZ).put(c0vcn2, C122100dH.LIZ(jSONObjectOptJSONObject2));
        }
        return c0vcl;
    }
}
