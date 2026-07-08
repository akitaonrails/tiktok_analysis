package X;

import android.content.Context;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.tiktok.ef.i18n.service.manager.I18nServiceApi;
import jv6.a;

/* JADX INFO: renamed from: X.1476, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public class AnonymousClass1476 extends C19GS {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiY5PRAmIRHELIOSolJD8/ZgctOioQPTEfKCI2CSY4IDk6PDw=";

    @Override // X.C19GS, X.C19FO, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        I18nServiceApi i18nServiceApi = (I18nServiceApi) PluggableExtentionKt.pluggableSpi(I18nServiceApi.class);
        if (i18nServiceApi != null && i18nServiceApi.LIZ() != null) {
            context = i18nServiceApi.LIZ().LIZJ(context);
        }
        a.install(context);
        super.attachBaseContext(context);
    }
}
