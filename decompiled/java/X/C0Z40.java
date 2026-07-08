package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.saas.host.api.debug.IMSaasHostOfflineDebugService;

/* JADX INFO: renamed from: X.0Z40, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Z40 {
    public static final /* synthetic */ C0Z40 LIZ = new C0Z40();
    public static final C01GW<IMSaasHostOfflineDebugService> LIZIZ = C452501pT.LIZIZ(new C0Z41());

    public static IMSaasHostOfflineDebugService LIZIZ() {
        return LIZIZ.getValue();
    }

    public static boolean LIZ(EnumC900880ZVu enumC900880ZVu) {
        IMSaasHostOfflineDebugService iMSaasHostOfflineDebugService = (IMSaasHostOfflineDebugService) PluggableExtentionKt.pluggableSpiForReal(IMSaasHostOfflineDebugService.class);
        if (iMSaasHostOfflineDebugService != null) {
            return iMSaasHostOfflineDebugService.LJIJI(enumC900880ZVu);
        }
        return false;
    }
}
