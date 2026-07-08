package X;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0VBH, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VBH {
    public long LIZ;
    public final Map<C0VBI, C122000dG> LIZIZ = new HashMap();

    public static C0VBH LIZ(JSONObject jSONObject) {
        if (C792190V5t.LIZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("DowngradeRule=");
            sbLIZ.append(C786410Ut5.J3(jSONObject));
            C792910V8n.LIZLLL("APM-Slardar", C2188811AlT.LIZIZ(sbLIZ));
        }
        C0VBH c0vbh = new C0VBH();
        long jOptLong = jSONObject.optLong("duration", 0L);
        long jOptLong2 = jSONObject.optLong("expire_time", 0L);
        if (jOptLong2 > 0) {
            c0vbh.LIZ = jOptLong2;
        } else {
            c0vbh.LIZ = System.currentTimeMillis() + (jOptLong * 1000);
        }
        C0VBI c0vbi = C0VBI.OTHER_LOG_TYPE;
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(c0vbi.logType);
        if (jSONObjectOptJSONObject != null) {
            ((HashMap) c0vbh.LIZIZ).put(c0vbi, C122000dG.LIZ(jSONObjectOptJSONObject));
        }
        C0VBI c0vbi2 = C0VBI.SERVICE_MONITOR;
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject(c0vbi2.logType);
        if (jSONObjectOptJSONObject2 != null) {
            ((HashMap) c0vbh.LIZIZ).put(c0vbi2, C122000dG.LIZ(jSONObjectOptJSONObject2));
        }
        return c0vbh;
    }
}
