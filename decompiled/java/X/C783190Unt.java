package X;

import android.os.SystemClock;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0Unt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C783190Unt {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(long j, Map map, Map map2) {
        long jLIZ = C770580UKq.LIZ("param_live_slot_start_time_long", map2);
        long jLIZ2 = C770580UKq.LIZ("param_live_slot_api_end_time_long", map2);
        long jLIZ3 = C770580UKq.LIZ("param_live_slot_prepare_to_show", map2);
        long jLIZ4 = C770580UKq.LIZ("PARAM_LIVE_SLOT_ON_CREATE", map2);
        if (jLIZ > 0) {
            if (jLIZ2 > 0) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(jLIZ2 - jLIZ);
                sbLIZ.append("");
                ((HashMap) map).put("request_time", C2188811AlT.LIZIZ(sbLIZ));
            }
            if (jLIZ3 > 0) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(jLIZ3 - jLIZ);
                sbLIZ2.append("");
                ((HashMap) map).put("prepare_to_show_time", C2188811AlT.LIZIZ(sbLIZ2));
            }
            if (j > 0) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(j - jLIZ);
                sbLIZ3.append("");
                ((HashMap) map).put("on_load_start_time", C2188811AlT.LIZIZ(sbLIZ3));
            }
            if (jLIZ4 > 0) {
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append(jLIZ4 - jLIZ);
                sbLIZ4.append("");
                ((HashMap) map).put("slot_on_create_time", C2188811AlT.LIZIZ(sbLIZ4));
            }
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append(SystemClock.uptimeMillis() - jLIZ);
            sbLIZ5.append("");
            ((HashMap) map).put("all_time", C2188811AlT.LIZIZ(sbLIZ5));
        }
    }
}
