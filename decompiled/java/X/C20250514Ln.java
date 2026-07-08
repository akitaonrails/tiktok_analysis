package X;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.offline.ttmock.ITtmockService;
import java.util.Locale;

/* JADX INFO: renamed from: X.14Ln, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20250514Ln {
    public static final C20250514Ln LIZ = new C20250514Ln();

    /* JADX WARN: Removed duplicated region for block: B:21:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Locale LIZ(android.content.Context r7) {
        /*
            r3 = 0
            java.lang.String r6 = "key_language_sp_key"
            android.content.SharedPreferences r2 = X.C810670Vr7.LIZJ(r7, r3, r6)
            java.lang.String r0 = "key_current_locale"
            java.lang.String r1 = ""
            java.lang.String r5 = r2.getString(r0, r1)
            r4 = 1
            if (r5 == 0) goto L66
            int r0 = r5.length()
            if (r0 == 0) goto L66
            java.lang.String r0 = "zh-Hans"
            boolean r2 = kotlin.text.u.LJJIIJZLJL(r5, r0, r3)
            java.lang.String r0 = "zh"
            if (r2 != 0) goto L63
            java.lang.String r2 = "zh-Hant"
            boolean r2 = kotlin.text.u.LJJIIJZLJL(r5, r2, r3)
            if (r2 == 0) goto L32
            java.lang.String r1 = "TW"
        L2c:
            java.util.Locale r2 = new java.util.Locale
            r2.<init>(r0, r1)
            return r2
        L32:
            boolean r2 = kotlin.text.u.LJJIIJZLJL(r5, r0, r3)
            if (r2 != 0) goto L63
            java.lang.String r0 = "-"
            java.lang.String[] r2 = new java.lang.String[]{r0}
            r0 = 6
            java.util.List r2 = kotlin.text.a0.LJJLIIIJILLIZJL(r5, r2, r3, r0)
            int r0 = r2.size()
            if (r0 <= r4) goto L56
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r2, r3)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r1 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r2, r4)
            java.lang.String r1 = (java.lang.String) r1
            goto L2c
        L56:
            int r0 = r2.size()
            if (r0 != r4) goto L88
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r2, r3)
            java.lang.String r0 = (java.lang.String) r0
            goto L2c
        L63:
            java.lang.String r1 = "CN"
            goto L2c
        L66:
            android.content.SharedPreferences r2 = X.C810670Vr7.LIZJ(r7, r3, r6)
            java.lang.String r0 = "pref_language_key"
            java.lang.String r0 = r2.getString(r0, r1)
            if (r0 != 0) goto L73
            r0 = r1
        L73:
            android.content.SharedPreferences r3 = X.C810670Vr7.LIZJ(r7, r3, r6)
            java.lang.String r2 = "key_current_region"
            java.lang.String r2 = r3.getString(r2, r1)
            if (r2 == 0) goto L80
            r1 = r2
        L80:
            int r2 = r0.length()
            if (r2 != 0) goto L2c
            r0 = 0
            return r0
        L88:
            java.util.Locale r0 = java.util.Locale.getDefault()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20250514Ln.LIZ(android.content.Context):java.util.Locale");
    }

    public static void LIZIZ(Context context) {
        String mockLanguage;
        try {
            ITtmockService iTtmockService = (ITtmockService) ServiceManager.get().getService(ITtmockService.class, false, false);
            if (iTtmockService != null && (mockLanguage = iTtmockService.getMockLanguage()) != null && mockLanguage.length() != 0) {
                C810670Vr7.LIZJ(context, 0, "key_language_sp_key").edit().putString("key_current_locale", mockLanguage).apply();
            }
            Locale localeLIZ = LIZ(context);
            if (localeLIZ == null) {
                return;
            }
            Resources resources = context.getResources();
            Configuration configuration = resources.getConfiguration();
            configuration.setLocale(localeLIZ);
            resources.updateConfiguration(configuration, resources.getDisplayMetrics());
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("updateLocale error:");
            sbLIZ.append(C13SZ.LIZIZ(th));
            C2188811AlT.LIZIZ(sbLIZ);
        }
    }
}
