package X;

import com.bytedance.android.livesdk.livesetting.other.LiveMonitorSampleSetting;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0JfQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C497660JfQ {
    public static long LIZ;
    public static final /* synthetic */ int LIZIZ = 0;

    static {
        new LinkedHashMap();
        LIZ = -1L;
    }

    public static void LIZ(int i, String str, Map map) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("livesdk_banner_");
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        C501590Jll.LIZLLL(map);
        if (!C2093608Ic.LIZJ(str, "show") && !C2093608Ic.LIZJ(str, "req_success")) {
            if (!C2093608Ic.LIZJ("livesdk_banner_req_success", strLIZIZ) || LiveMonitorSampleSetting.INSTANCE.isReportDolphin("ttlive_livesdk_banner_req_success", 0.0d)) {
                C1CC2.LJII(i, strLIZIZ, map);
            }
        } else {
            C1CC2.LJIILJJIL(i, 1, strLIZIZ, map);
        }
        map.put("event_name", strLIZIZ);
        if (i == 0) {
            C1143300frE.LJIIJJI().LJII("ttlive_banner", map);
        } else {
            C1143300frE.LJIIJJI().LJ("ttlive_banner", map);
        }
    }
}
