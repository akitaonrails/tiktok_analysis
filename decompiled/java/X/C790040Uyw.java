package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0Uyw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C790040Uyw {
    public static int LIZ = 1;

    public static boolean LJ(long j, long j2) {
        return (j & j2) != 0;
    }

    public static int LIZLLL() {
        boolean zBooleanValue;
        try {
            boolean zBooleanValue2 = ((Boolean) Class.forName("com.ss.android.ugc.aweme.utils.PrivacyPolicyAgreementUtils").getMethod("isUserAgreePrivacyPolicy", new Class[0]).invoke(null, new Object[0])).booleanValue();
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("isUserAgreePrivacyPolicy:");
            sbLIZ.append(zBooleanValue2);
            TTVideoEngineLog.d("TTVideoEngineUtils", C2188811AlT.LIZIZ(sbLIZ));
            if (!zBooleanValue2) {
                return 1;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            int i2 = C2187451AjH.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("get PrivacyPolicy failed:");
            sbLIZ2.append(e.toString());
            C1471660oOq.LIZIZ("TTVideoEngineUtils", C2188811AlT.LIZIZ(sbLIZ2));
        }
        try {
            Class<?> cls = Class.forName("com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider");
            try {
                boolean zBooleanValue3 = ((Boolean) Class.forName("com.ss.android.ugc.aweme.compliance.api.services.teenmode.ITeenModeService").getMethod("isTeenModeON", new Class[0]).invoke(cls.getMethod("teenModeService", new Class[0]).invoke(null, new Object[0]), new Object[0])).booleanValue();
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("isTeenModeOn:");
                sbLIZ3.append(zBooleanValue3);
                TTVideoEngineLog.d("TTVideoEngineUtils", C2188811AlT.LIZIZ(sbLIZ3));
                if (zBooleanValue3) {
                    return 2;
                }
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                int i3 = C2187451AjH.LIZ;
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("get teenModeService failed:");
                sbLIZ4.append(e2.toString());
                C1471660oOq.LIZIZ("TTVideoEngineUtils", C2188811AlT.LIZIZ(sbLIZ4));
            }
            try {
                zBooleanValue = ((Boolean) Class.forName("com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService").getMethod("isGuestMode", new Class[0]).invoke(cls.getMethod("businessService", new Class[0]).invoke(null, new Object[0]), new Object[0])).booleanValue();
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("isGuestMode:");
                sbLIZ5.append(zBooleanValue);
                TTVideoEngineLog.d("TTVideoEngineUtils", C2188811AlT.LIZIZ(sbLIZ5));
            } catch (Exception e3) {
                TryCatchGuardChecker.doCheck(e3);
                int i4 = C2187451AjH.LIZ;
                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                sbLIZ6.append("get businessService failed:");
                sbLIZ6.append(e3.toString());
                C1471660oOq.LIZIZ("TTVideoEngineUtils", C2188811AlT.LIZIZ(sbLIZ6));
            }
            return zBooleanValue ? 3 : -1;
        } catch (Exception e4) {
            TryCatchGuardChecker.doCheck(e4);
            int i5 = C2187451AjH.LIZ;
            StringBuilder sbLIZ7 = C2188811AlT.LIZ();
            sbLIZ7.append("get ComplianceServiceProvider failed:");
            sbLIZ7.append(e4.toString());
            C1471660oOq.LIZIZ("TTVideoEngineUtils", C2188811AlT.LIZIZ(sbLIZ7));
            return -1;
        }
    }

    public static String LIZ(String str) {
        if (LIZ == 1 && !TextUtils.isEmpty(str) && str.startsWith("http://")) {
            int i = C2187451AjH.LIZ;
            C1471660oOq.LIZJ("TTVideoEngineUtils", "fetch api need replace https");
            return str.replaceFirst("http://", "https://");
        }
        return str;
    }

    public static void LIZJ(Object obj, ArrayList arrayList) {
        if (arrayList != null && arrayList.size() < 100) {
            arrayList.add(obj);
        }
    }

    public static void LIZIZ(int i, Object obj, ArrayList arrayList) {
        if (arrayList != null && i >= 0 && arrayList.size() < i) {
            arrayList.add(obj);
        }
    }
}
