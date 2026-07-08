package X;

import com.ss.android.common.lib.AppLogNewUtils;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0yJp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1852950yJp {
    public static final C1852950yJp LIZ = new C1852950yJp();
    public static final C1852940yJo LIZIZ = new C1852940yJo();

    public static void LIZ() {
        C1852940yJo c1852940yJo = LIZIZ;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = c1852940yJo.LIZ;
        if (j >= 0) {
            long j2 = c1852940yJo.LIZIZ;
            if (j2 >= 0) {
                long j3 = c1852940yJo.LIZJ;
                if (j3 >= 0 && jCurrentTimeMillis >= 0) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("load_time", jCurrentTimeMillis - j3);
                    jSONObject.put("view_created_time", j2 - j);
                    jSONObject.put("total_time", jCurrentTimeMillis - j);
                    jSONObject.put("granted_status", c1852940yJo.LIZLLL);
                    AppLogNewUtils.onEventV3("tako_multi_template_monitor", jSONObject);
                }
            }
        }
        c1852940yJo.LIZ = -1L;
        c1852940yJo.LIZIZ = -1L;
        c1852940yJo.LIZJ = -1L;
        c1852940yJo.LIZLLL = -1;
    }
}
