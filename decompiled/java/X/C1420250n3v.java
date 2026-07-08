package X;

import com.bytedance.keva.Keva;
import com.ss.android.common.applog.AppLog;
import java.util.TimeZone;
import kotlin.jvm.internal.AFwS210S0000000_22;

/* JADX INFO: renamed from: X.0n3v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1420250n3v {
    public static final C1420250n3v LIZ = new C1420250n3v();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(18));

    public static Keva LIZIZ() {
        return (Keva) LIZIZ.getValue();
    }

    public static long LIZ(C1420250n3v c1420250n3v) {
        Long lLJIILIIL;
        long jCurrentTimeMillis = System.currentTimeMillis();
        c1420250n3v.getClass();
        long offset = jCurrentTimeMillis + ((long) TimeZone.getDefault().getOffset(jCurrentTimeMillis));
        int iIntValue = ((Number) C283430B8z.LIZ.getValue()).intValue();
        long jLongValue = 0;
        if (iIntValue > 0) {
            C0CHQ.LIZ().getApplicationService().getClass();
            String strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId = AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId();
            if (strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId != null && (lLJIILIIL = C2095008Iq.LJIILIIL(strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId)) != null) {
                jLongValue = lLJIILIIL.longValue();
            }
            long j = iIntValue;
            int i = (((int) (jLongValue % j)) + iIntValue) % iIntValue;
            long j2 = 86400000 / j;
            if (j2 < 1) {
                j2 = 1;
            }
            jLongValue = ((long) i) * j2;
        }
        return (offset - jLongValue) / 86400000;
    }

    public static void LIZLLL(String str) {
        boolean z;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            LIZIZ().erase("shot_landing_tab");
        } else {
            LIZIZ().storeString("shot_landing_tab", str);
        }
    }

    public final void LIZJ(String str) {
        Keva kevaLIZIZ = LIZIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append("_last_fetch_day_utc0");
        kevaLIZIZ.storeString(C2188811AlT.LIZIZ(sbLIZ), String.valueOf(LIZ(this)));
    }
}
