package X;

import android.content.Context;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.tiktok.ef.i18n.service.manager.I18nServiceApi;

/* JADX INFO: renamed from: X.0JBU, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JBU {
    public static void LIZ() {
        I18nServiceApi i18nServiceApi;
        C844470XAv.LIZ.getClass();
        Context contextLIZ = C844470XAv.LIZ();
        if (contextLIZ == null || (i18nServiceApi = (I18nServiceApi) PluggableExtentionKt.pluggableSpi(I18nServiceApi.class)) == null || i18nServiceApi.LIZ() == null) {
            return;
        }
        i18nServiceApi.LIZ().LIZIZ(contextLIZ);
    }
}
