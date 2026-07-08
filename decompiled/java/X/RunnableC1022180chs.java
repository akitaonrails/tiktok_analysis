package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;

/* JADX INFO: renamed from: X.0chs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class RunnableC1022180chs implements Runnable {
    public static final RunnableC1022180chs LL = new RunnableC1022180chs();

    public static void LIZ() {
        int iIntValue;
        C1020810cff.LIZ.getClass();
        String string = C1020810cff.LIZIZ().getString("profile_my_aweme_info_statistics", "");
        String string2 = C1020810cff.LIZIZ().getString("profile_my_aweme_slide_back_info_statistics", "");
        int iIntValue2 = 0;
        if ((string == null || string.length() == 0) && (string2 == null || string2.length() == 0)) {
            return;
        }
        try {
            Map map = (Map) C2292508yZ.LIZIZ().LJIIIIZZ(string, Map.class);
            Map map2 = (Map) C2292508yZ.LIZIZ().LJIIIIZZ(string2, Map.class);
            C2344009Gk c2344009Gk = new C2344009Gk();
            if (map != null) {
                iIntValue = 0;
                for (Map.Entry entry : map.entrySet()) {
                    c2344009Gk.LIZJ(((Number) entry.getValue()).intValue(), (String) entry.getKey());
                    iIntValue += ((Number) entry.getValue()).intValue();
                }
            } else {
                iIntValue = 0;
            }
            if (map2 != null) {
                for (Map.Entry entry2 : map2.entrySet()) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append((String) entry2.getKey());
                    sbLIZ.append("_back_slide");
                    c2344009Gk.LIZJ(((Number) entry2.getValue()).intValue(), C2188811AlT.LIZIZ(sbLIZ));
                    iIntValue2 += ((Number) entry2.getValue()).intValue();
                }
            }
            c2344009Gk.LIZJ(iIntValue, "my_load_all_size");
            c2344009Gk.LIZJ(iIntValue2, "my_slide_back_all_size");
            c2344009Gk.LJ(Boolean.TRUE, "is_my_profile");
            C1250680ieQ c1250680ieQ = C1250680ieQ.LIZ;
            Map<String, String> map3 = c2344009Gk.LIZ;
            c1250680ieQ.getClass();
            C20684815ws.LJIILLIIL("profile_aweme_statistic_info", map3);
            C1020810cff.LIZ.getClass();
            C1020810cff.LIZIZ().erase("profile_my_aweme_info_statistics");
            C1020810cff.LIZIZ().erase("profile_my_aweme_slide_back_info_statistics");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("reportMyProfile exception: ");
            sbLIZ2.append(e.getMessage());
            sbLIZ2.append(", cause: ");
            sbLIZ2.append(e.getCause());
            C1720106oR.LIZ("Profile_ProfileAwemeInfoStatistics", C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("ProfileAwemeInfoStatistics@1930.reportMyProfile$1");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ProfileAwemeInfoStatistics@1930.reportMyProfile$1");
    }
}
