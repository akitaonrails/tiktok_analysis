package X;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0rkq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1600620rkq implements InterfaceC1848620yCq {
    public static final C1600620rkq LL = new C1600620rkq();
    public static final Set<String> LLILLJJLI = Collections.newSetFromMap(new ConcurrentHashMap());

    @Override // X.InterfaceC1848620yCq
    public final String getEventName() {
        return "perf_explore_preload_trigger_monitor";
    }

    public static void LIZ(String str, String str2, String str3, Long l, Long l2, int i) throws JSONException {
        String strLIZIZ;
        C1600620rkq c1600620rkq = LL;
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        if ((i & 8) != 0) {
            l = null;
        }
        if ((i & 16) != 0) {
            l2 = null;
        }
        if (str2 != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append('|');
            sbLIZ.append(str2);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        } else {
            strLIZIZ = str;
        }
        if (LLILLJJLI.add(strLIZIZ)) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("trigger_type", str);
            jSONObject.putOpt("enter_from", str2);
            jSONObject.putOpt("enter_method", str3);
            jSONObject.putOpt("delay_ms", l);
            jSONObject.putOpt("head_start_ms", l2);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("perf_explore_preload_trigger_monitor");
            sbLIZ2.append(' ');
            sbLIZ2.append(jSONObject);
            C1848630yCr.LIZIZ(c1600620rkq, C2188811AlT.LIZIZ(sbLIZ2));
            C1848630yCr.LIZ(c1600620rkq, jSONObject);
        }
    }
}
