package X;

import android.telephony.TelephonyManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.0kRs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1319780kRs {
    public static String LIZIZ() {
        String strLJ = "";
        try {
            TelephonyManager telephonyManager = (TelephonyManager) C786410Ut5.H2(C1948707kD.LIZ().getApplicationContext(), "phone");
            if (telephonyManager == null) {
                return "";
            }
            AtomicBoolean atomicBoolean = C794320VDy.LIZ;
            strLJ = C1300840jxK.LJ(telephonyManager);
            return strLJ;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return strLJ;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int LIZ(android.content.Context r1) {
        /*
            if (r1 == 0) goto L17
            java.lang.String r0 = "phone"
            java.lang.Object r1 = X.C786410Ut5.H2(r1, r0)     // Catch: java.lang.Exception -> L13
            android.telephony.TelephonyManager r1 = (android.telephony.TelephonyManager) r1     // Catch: java.lang.Exception -> L13
            if (r1 == 0) goto L17
            java.util.concurrent.atomic.AtomicBoolean r0 = X.C794320VDy.LIZ     // Catch: java.lang.Exception -> L13
            java.lang.String r1 = X.C1300840jxK.LJIIJ(r1)     // Catch: java.lang.Exception -> L13
            goto L19
        L13:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L17:
            java.lang.String r1 = "-1"
        L19:
            java.lang.String r0 = "46000"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L67
            java.lang.String r0 = "46002"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L67
            java.lang.String r0 = "46007"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L67
            java.lang.String r0 = "46001"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L65
            java.lang.String r0 = "46006"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L65
            java.lang.String r0 = "46009"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L65
            java.lang.String r0 = "46003"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L63
            java.lang.String r0 = "46005"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L63
            java.lang.String r0 = "46011"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L63
            r0 = 0
            return r0
        L63:
            r0 = 1
            return r0
        L65:
            r0 = 2
            return r0
        L67:
            r0 = 3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1319780kRs.LIZ(android.content.Context):int");
    }
}
