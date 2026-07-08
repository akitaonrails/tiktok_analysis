package X;

import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0ph7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1521430ph7 {
    public final JSONObject LIZ;
    public final JSONObject LIZIZ;
    public final JSONObject LIZJ;
    public final JSONObject LIZLLL;
    public final JSONObject LJ;

    public C1521430ph7(String str) {
        JSONObject jSONObjectLJIILL = C1520640pfq.LJIILL(str);
        this.LIZ = C1520640pfq.LJII("apmReportConfig", jSONObjectLJIILL);
        this.LIZIZ = C1520640pfq.LJII("performanceReportConfig", jSONObjectLJIILL);
        this.LIZJ = C1520640pfq.LJII("errorMsgReportConfig", jSONObjectLJIILL);
        this.LIZLLL = C1520640pfq.LJII("resourceTimingReportConfig", jSONObjectLJIILL);
        this.LJ = C1520640pfq.LJII("commonReportConfig", jSONObjectLJIILL);
    }

    public static void LIZ(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject2 != null) {
            Iterator<String> itKeys = jSONObject2.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                C1520640pfq.LJIILJJIL(jSONObject, next, C1520640pfq.LJIIIIZZ(next, jSONObject2));
            }
        }
    }
}
