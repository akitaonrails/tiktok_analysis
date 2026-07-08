package X;

import Y.ARunnableS103S0100000_3;
import android.content.Context;
import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.nxreword.manager.NxRewordManager;
import com.tiktok.ef.i18n.service.manager.I18nServiceApi;
import com.tiktok.ef.i18nmanagerapi.service.i18n.I18nManagerServiceApi;
import java.util.Locale;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0W87, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0W87 {
    public static final C0W87 LIZ = new C0W87();
    public static volatile boolean LIZIZ;

    /* JADX WARN: Type inference failed for: r8v0, types: [X.08g9] */
    public static void LIZ(Context context) {
        Locale localeLJIJJLI;
        I18nManagerServiceApi i18nManagerServiceApiLIZ;
        if (!LIZIZ) {
            LIZIZ = true;
            I18nServiceApi i18nServiceApi = (I18nServiceApi) PluggableExtentionKt.pluggableSpi$default(I18nServiceApi.class, false, false, false, 14, null);
            if (i18nServiceApi == null || (i18nManagerServiceApiLIZ = i18nServiceApi.LIZ()) == null || (localeLJIJJLI = i18nManagerServiceApiLIZ.LJIJJLI(context)) == null) {
                localeLJIJJLI = context.getResources().getConfiguration().locale;
            }
            C818200W7u c818200W7u = new C818200W7u(100000, 100000, 100000);
            C844470XAv.LIZ.getClass();
            String str = C844470XAv.LJII;
            if (str == null) {
                str = null;
            }
            ((Boolean) C285490BGx.LIZ.getValue()).booleanValue();
            NxRewordManager.LIZ.LIZJ(context, new C818150W7p(localeLJIJJLI, str, true, "starling_patch_tiktok_hot_strings_", new C823730WTb(C0W86.LIZ), new C0W82() { // from class: X.08g9
                @Override // X.C0W82
                public final void LIZ(JSONObject jSONObject) {
                    long j = C2178408gA.LIZ;
                    if (j != -1) {
                        C0CN5.LIZIZ(Long.valueOf(j), new ARunnableS103S0100000_3(jSONObject, 128));
                    } else {
                        AppLogNewUtils.onEventV3("nx_reword", jSONObject);
                    }
                }
            }, c818200W7u, 64), new C0W88(context));
        }
    }
}
