package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.common.applog.AppLog;

/* JADX INFO: renamed from: X.0X9z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C844250X9z {
    public static long LIZ;
    public static String LIZIZ;

    public static C0XI4 LIZ(String str) {
        String strAddCommonParams;
        boolean z;
        C0XI4 c0xi4 = new C0XI4(str);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (((Boolean) C07FG.LJIIIZ.getValue()).booleanValue()) {
            if (jCurrentTimeMillis - LIZ > 3000) {
                LIZIZ = AppLog.addCommonParams("https://temp?", true).substring(13);
                LIZ = jCurrentTimeMillis;
                z = false;
            } else {
                z = true;
            }
            StringBuilder sb = new StringBuilder(c0xi4.LJFF());
            if (str.indexOf(63) < 0) {
                sb.append("?");
            } else {
                sb.append("&");
            }
            sb.append(LIZIZ);
            strAddCommonParams = sb.toString();
            if (z) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("_rticket=");
                sbLIZ.append(jCurrentTimeMillis);
                strAddCommonParams = strAddCommonParams.replaceFirst("_rticket=[^&]*", C2188811AlT.LIZIZ(sbLIZ));
            }
        } else {
            strAddCommonParams = AppLog.addCommonParams(c0xi4.LJFF(), true);
        }
        C0XI4 c0xi42 = new C0XI4(strAddCommonParams);
        try {
            if (C10EU.LJIIIIZZ() && (strAddCommonParams.contains("openudid") || strAddCommonParams.contains("uoo"))) {
                String[] strArrSplit = strAddCommonParams.substring(strAddCommonParams.indexOf("?") + 1).split("&");
                for (String str2 : strArrSplit) {
                    if (!str2.contains("openudid") && !str2.contains("uoo") && str2.contains("=") && !str.contains(str2.substring(0, str2.indexOf("=")))) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append(str);
                        sbLIZ2.append("&");
                        sbLIZ2.append(str2);
                        str = C2188811AlT.LIZIZ(sbLIZ2);
                    }
                }
                return new C0XI4(str);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return c0xi42;
    }
}
