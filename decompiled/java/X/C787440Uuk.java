package X;

import android.os.Build;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;

/* JADX INFO: renamed from: X.0Uuk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C787440Uuk {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0034, code lost:
    
        if (r2.getActiveModemCount() > 1) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C787450Uul LIZ(android.content.Context r5) {
        /*
            java.lang.String r2 = "phone"
            r4 = 1
            com.bytedance.ies.abmock.SettingsManager r1 = com.bytedance.ies.abmock.SettingsManager.LIZLLL()     // Catch: java.lang.Exception -> L15
            java.lang.String r0 = "enable_sim_utils"
            r1.getClass()     // Catch: java.lang.Exception -> L15
            boolean r0 = com.bytedance.ies.abmock.SettingsManager.LIZ(r0, r4)     // Catch: java.lang.Exception -> L15
            if (r0 != 0) goto L19
            X.0Uul r0 = X.C787450Uul.LIZLLL
            return r0
        L15:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L19:
            if (r5 != 0) goto L1e
            X.0Uul r0 = X.C787450Uul.LIZLLL
            return r0
        L1e:
            java.lang.Object r3 = X.C786410Ut5.H2(r5, r2)     // Catch: java.lang.Exception -> L50
            android.telephony.TelephonyManager r3 = (android.telephony.TelephonyManager) r3     // Catch: java.lang.Exception -> L50
            java.lang.Object r2 = X.C786410Ut5.H2(r5, r2)     // Catch: java.lang.Exception -> L50
            android.telephony.TelephonyManager r2 = (android.telephony.TelephonyManager) r2     // Catch: java.lang.Exception -> L50
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L50
            r0 = 30
            if (r1 < r0) goto L3b
            int r0 = r2.getActiveModemCount()     // Catch: java.lang.Exception -> L50
            if (r0 <= r4) goto L47
        L36:
            X.0Uul r0 = LIZIZ(r3)     // Catch: java.lang.Exception -> L50
            return r0
        L3b:
            int r0 = r2.getPhoneCount()     // Catch: java.lang.Exception -> L50
            if (r0 > r4) goto L36
            r0 = 24
            if (r1 >= r0) goto L47
            r0 = -1
            goto L4b
        L47:
            int r0 = android.telephony.SubscriptionManager.getDefaultDataSubscriptionId()     // Catch: java.lang.Exception -> L50
        L4b:
            X.0Uul r0 = LIZJ(r3, r0)     // Catch: java.lang.Exception -> L50
            return r0
        L50:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.0Uul r0 = X.C787450Uul.LIZLLL
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C787440Uuk.LIZ(android.content.Context):X.0Uul");
    }

    public static C787450Uul LIZIZ(TelephonyManager telephonyManager) {
        String strLLILII;
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            int activeDataSubscriptionId = SubscriptionManager.getActiveDataSubscriptionId();
            TelephonyManager telephonyManagerCreateForSubscriptionId = telephonyManager.createForSubscriptionId(activeDataSubscriptionId);
            if ((telephonyManagerCreateForSubscriptionId == null || (strLLILII = C2204961BRm.LLILII(telephonyManagerCreateForSubscriptionId, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOurYJDb0ibEEOp7phYk8YpKs4s/HbQ=", null))) == null || strLLILII.length() == 0) && (telephonyManagerCreateForSubscriptionId = telephonyManager.createForSubscriptionId((activeDataSubscriptionId = SubscriptionManager.getDefaultDataSubscriptionId()))) == null) {
                return C787450Uul.LIZLLL;
            }
            return LIZJ(telephonyManagerCreateForSubscriptionId, activeDataSubscriptionId);
        }
        if (i >= 24) {
            int defaultDataSubscriptionId = SubscriptionManager.getDefaultDataSubscriptionId();
            TelephonyManager telephonyManagerCreateForSubscriptionId2 = telephonyManager.createForSubscriptionId(defaultDataSubscriptionId);
            if (telephonyManagerCreateForSubscriptionId2 != null) {
                return LIZJ(telephonyManagerCreateForSubscriptionId2, defaultDataSubscriptionId);
            }
            return C787450Uul.LIZLLL;
        }
        return C787450Uul.LIZLLL;
    }

    public static C787450Uul LIZJ(TelephonyManager telephonyManager, int i) throws Throwable {
        String strLLIIZ = C2204961BRm.LLIIZ(telephonyManager, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOurYJDb0ibEEOp7phYk8YpKs4s/HbQ=", null));
        String str = "";
        if (strLLIIZ == null) {
            strLLIIZ = "";
        }
        String strLLILII = C2204961BRm.LLILII(telephonyManager, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOurYJDb0ibEEOp7phYk8YpKs4s/HbQ=", null));
        if (strLLILII != null) {
            str = strLLILII;
        }
        return new C787450Uul(i, strLLIIZ, str);
    }
}
