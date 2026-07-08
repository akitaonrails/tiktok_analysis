package com.appsflyer.internal;

import X.C0WZX;
import X.C10EU;
import X.C20123713oZ;
import X.C2204961BRm;
import android.content.ContentResolver;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import com.appsflyer.AppsFlyerProperties;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes31.dex */
public final class AFb1rSDK {
    public static Boolean AFInAppEventType;
    public static String values;

    public static boolean values() {
        Boolean bool = AFInAppEventType;
        return bool == null || bool.booleanValue();
    }

    public static AFb1zSDK AFInAppEventParameterName(ContentResolver contentResolver) {
        String strINVOKESTATIC_com_appsflyer_internal_AFb1rSDK_com_ss_android_ugc_aweme_lancet_process_AnndroidIdSecureLancet_getString;
        if (!values() || contentResolver == null || AppsFlyerProperties.getInstance().getString("amazon_aid") != null || !"Amazon".equals(Build.MANUFACTURER)) {
            return null;
        }
        int i = Settings.Secure.getInt(contentResolver, "limit_ad_tracking", 2);
        if (i == 0) {
            return new AFb1zSDK(INVOKESTATIC_com_appsflyer_internal_AFb1rSDK_com_ss_android_ugc_aweme_lancet_process_AnndroidIdSecureLancet_getString(contentResolver, "advertising_id"), Boolean.FALSE);
        }
        if (i == 2) {
            return null;
        }
        try {
            strINVOKESTATIC_com_appsflyer_internal_AFb1rSDK_com_ss_android_ugc_aweme_lancet_process_AnndroidIdSecureLancet_getString = INVOKESTATIC_com_appsflyer_internal_AFb1rSDK_com_ss_android_ugc_aweme_lancet_process_AnndroidIdSecureLancet_getString(contentResolver, "advertising_id");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            strINVOKESTATIC_com_appsflyer_internal_AFb1rSDK_com_ss_android_ugc_aweme_lancet_process_AnndroidIdSecureLancet_getString = "";
        }
        return new AFb1zSDK(strINVOKESTATIC_com_appsflyer_internal_AFb1rSDK_com_ss_android_ugc_aweme_lancet_process_AnndroidIdSecureLancet_getString, Boolean.TRUE);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.appsflyer.internal.AFb1zSDK AFInAppEventType(android.content.Context r6) {
        /*
            com.appsflyer.AppsFlyerProperties r5 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r1 = com.appsflyer.internal.AFb1rSDK.values
            r4 = 1
            if (r1 == 0) goto L24
            r3 = 1
        La:
            r2 = 0
            if (r3 != 0) goto L48
            java.lang.Boolean r0 = com.appsflyer.internal.AFb1rSDK.AFInAppEventType
            if (r0 == 0) goto L17
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L26
        L17:
            java.lang.Boolean r0 = com.appsflyer.internal.AFb1rSDK.AFInAppEventType
            if (r0 != 0) goto L57
            java.lang.String r0 = "collectOAID"
            boolean r0 = r5.getBoolean(r0, r4)
            if (r0 == 0) goto L57
            goto L26
        L24:
            r3 = 0
            goto La
        L26:
            com.appsflyer.oaid.OaidClient r1 = new com.appsflyer.oaid.OaidClient     // Catch: java.lang.Throwable -> L41
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L41
            boolean r0 = r5.isEnableLog()     // Catch: java.lang.Throwable -> L41
            r1.setLogging(r0)     // Catch: java.lang.Throwable -> L41
            com.appsflyer.oaid.OaidClient$Info r0 = r1.fetch()     // Catch: java.lang.Throwable -> L41
            if (r0 == 0) goto L57
            java.lang.String r1 = r0.getId()     // Catch: java.lang.Throwable -> L41
            java.lang.Boolean r0 = r0.getLat()     // Catch: java.lang.Throwable -> L44
            goto L49
        L41:
            r0 = move-exception
            r1 = r2
            goto L45
        L44:
            r0 = move-exception
        L45:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L48:
            r0 = r2
        L49:
            if (r1 == 0) goto L57
            com.appsflyer.internal.AFb1zSDK r2 = new com.appsflyer.internal.AFb1zSDK
            r2.<init>(r1, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            r2.values = r0
            return r2
        L57:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1rSDK.AFInAppEventType(android.content.Context):com.appsflyer.internal.AFb1zSDK");
    }

    public static String INVOKESTATIC_com_appsflyer_internal_AFb1rSDK_com_ss_android_ugc_aweme_lancet_process_AnndroidIdSecureLancet_getString(ContentResolver contentResolver, String str) {
        if (TextUtils.equals(str, "android_id")) {
            if (C10EU.LJIILIIL() && C20123713oZ.LIZ()) {
                return "";
            }
            if (TextUtils.isEmpty(C20123713oZ.LIZ)) {
                C20123713oZ.LIZ = C2204961BRm.LLIIIL(contentResolver, str, new C0WZX("dzBzEgMqT9naWU4kV1yNaEAr35CqUcZV5bdseuleyw==", new String[]{"01c45"}));
            }
            return C20123713oZ.LIZ;
        }
        return C2204961BRm.LLIIIL(contentResolver, str, new C0WZX("dzBzEgMqT9naWU4kV1yNaEAr35CqUcZV5bdseuleyw==", new String[]{"01c45"}));
    }
}
