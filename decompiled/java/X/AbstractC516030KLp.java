package X;

import java.util.HashMap;

/* JADX INFO: renamed from: X.0KLp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC516030KLp<RESPONSE_TYPE> {
    public static void LIZ(C516120KLy c516120KLy) {
        HashMap map;
        C516010KLn c516010KLn = C516010KLn.LIZ;
        long jCurrentTimeMillis = System.currentTimeMillis() - 0;
        Integer num = c516120KLy.LJI;
        String str = c516120KLy.LIZJ;
        Throwable th = c516120KLy.LJII;
        c516010KLn.getClass();
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_subscription_tpl_fail");
        c474500IjALIZ.LJJII(str, "source");
        c474500IjALIZ.LJJIFFI(Float.valueOf(jCurrentTimeMillis), "duration");
        c474500IjALIZ.LJJII(num, "error_code");
        if (th != null) {
            map = new HashMap();
            map.put("error_code", String.valueOf(C512300K7g.LIZIZ(th)));
            map.put("error_type", C512300K7g.LIZJ(th));
            String strLIZLLL = C512300K7g.LIZLLL(th);
            String str2 = "";
            if (strLIZLLL == null && (strLIZLLL = th.getMessage()) == null) {
                strLIZLLL = "";
            }
            map.put("error_message", strLIZLLL);
            String strLJ = C512300K7g.LJ(th);
            if (strLJ != null) {
                str2 = strLJ;
            }
            map.put("log_id", str2);
        } else {
            map = null;
        }
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LJJII(Long.valueOf(System.currentTimeMillis()), "time_stamp_milli");
        c474500IjALIZ.LJJII(C516010KLn.LIZJ(), "iap_country_code");
        c474500IjALIZ.LIZ();
    }

    public static void LIZIZ(C516120KLy c516120KLy) {
        C516010KLn c516010KLn = C516010KLn.LIZ;
        long j = c516120KLy.LIZ;
        int i = c516120KLy.LIZIZ;
        String str = c516120KLy.LIZLLL;
        String str2 = c516120KLy.LIZJ;
        String str3 = c516120KLy.LJFF;
        boolean z = c516120KLy.LJ;
        c516010KLn.getClass();
        C516010KLn.LJI = str;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_subscription_tpl_success");
        c474500IjALIZ.LJJII(str2, "source");
        c474500IjALIZ.LJJIFFI(Float.valueOf(j), "duration");
        c474500IjALIZ.LJJII(Integer.valueOf(i), "tpl_count");
        c474500IjALIZ.LJJII(Long.valueOf(System.currentTimeMillis()), "time_stamp_milli");
        c474500IjALIZ.LJJII(str3, "log_id");
        c474500IjALIZ.LJJII(C516010KLn.LIZJ(), "iap_country_code");
        c474500IjALIZ.LJJII(Integer.valueOf(z ? 1 : 0), "permission");
        c474500IjALIZ.LIZ();
    }
}
