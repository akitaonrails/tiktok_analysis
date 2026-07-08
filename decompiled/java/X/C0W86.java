package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.nxreword.manager.NxRewordManager;
import com.tiktok.ef.i18n.service.manager.I18nServiceApi;
import com.tiktok.ef.i18nmanagerapi.service.i18n.I18nManagerServiceApi;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0W86, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0W86 {
    public static final C0W86 LIZ = new C0W86();

    public static String LIZIZ() {
        I18nManagerServiceApi i18nManagerServiceApiLIZ;
        I18nServiceApi i18nServiceApi = (I18nServiceApi) PluggableExtentionKt.pluggableSpi$default(I18nServiceApi.class, false, false, false, 14, null);
        if (i18nServiceApi != null && (i18nManagerServiceApiLIZ = i18nServiceApi.LIZ()) != null) {
            C844470XAv.LIZ.getClass();
            String strLJIILJJIL = i18nManagerServiceApiLIZ.LJIILJJIL(C844470XAv.LIZ());
            if (strLJIILJJIL != null) {
                return strLJIILJJIL;
            }
        }
        return "";
    }

    public static void LIZ(Locale locale, String str, boolean z) {
        if (str != null) {
            try {
                String strLJIIJJI = Intrinsics.LJIIJJI(C818240W7y.LIZ.invoke(locale), C818240W7y.LIZJ);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str);
                sbLIZ.append('/');
                sbLIZ.append(strLJIIJJI);
                sbLIZ.append(".json");
                NxRewordManager.LIZLLL(locale, C2188811AlT.LIZIZ(sbLIZ), z);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }
}
