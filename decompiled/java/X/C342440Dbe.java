package X;

import android.content.Context;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.tiktok.pns.privacy.setting.base.api.IAgeGradService;
import com.tiktok.ef.i18n.service.manager.I18nServiceApi;
import com.tiktok.ef.i18nmanagerapi.service.i18n.I18nManagerServiceApi;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Dbe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C342440Dbe {
    public static final C342440Dbe LIZ = new C342440Dbe();
    public static final String LIZIZ;
    public static final Map<String, Boolean> LIZJ;
    public static String LIZLLL;

    static {
        String strLJIILJJIL;
        I18nManagerServiceApi i18nManagerServiceApiLIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("https://www.tiktok.com/safety/");
        I18nServiceApi i18nServiceApi = (I18nServiceApi) PluggableExtentionKt.pluggableSpi$default(I18nServiceApi.class, false, false, false, 14, null);
        if (i18nServiceApi == null || (i18nManagerServiceApiLIZ = i18nServiceApi.LIZ()) == null || (strLJIILJJIL = i18nManagerServiceApiLIZ.LJIILJJIL(C2213981Bky.LIZIZ.getApplicationContext())) == null) {
            strLJIILJJIL = "en";
        }
        sbLIZ.append(strLJIILJJIL);
        LIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        LIZJ = new LinkedHashMap();
        LIZLLL = C461720I8s.LIZIZ();
    }

    public static boolean LIZIZ() {
        if (!C287790BPt.LIZ()) {
            return false;
        }
        String strLIZIZ = C461720I8s.LIZIZ();
        if (!Intrinsics.LJFF(strLIZIZ, LIZLLL)) {
            LIZJ.put(LIZLLL, Boolean.FALSE);
        }
        LIZLLL = strLIZIZ;
        Map<String, Boolean> map = LIZJ;
        Boolean bool = (Boolean) ((LinkedHashMap) map).get(strLIZIZ);
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z = ((IAgeGradService) ServiceManager.get().getService(IAgeGradService.class)).LIZIZ("dm") == 1;
        map.put(strLIZIZ, Boolean.valueOf(z));
        return z;
    }

    public static void LIZ(Context context) {
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//webview/");
        smartRouteBuildRoute.withParam("url", LIZIZ);
        smartRouteBuildRoute.open();
    }
}
