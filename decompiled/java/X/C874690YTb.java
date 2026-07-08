package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.saas.host.api.debug.IMSaasHostOfflineDebugService;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0YTb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C874690YTb implements C0YKM {
    @Override // X.C0YKM
    public final boolean LIZ() {
        IMSaasHostOfflineDebugService iMSaasHostOfflineDebugService;
        C0I0B.LJFF.LIZJ();
        return C894660Z7w.LIZJ() && (iMSaasHostOfflineDebugService = (IMSaasHostOfflineDebugService) PluggableExtentionKt.pluggableSpiForReal(IMSaasHostOfflineDebugService.class)) != null && iMSaasHostOfflineDebugService.LIZ();
    }

    @Override // X.C0YKM
    public final Pair<Boolean, Integer> LIZIZ() {
        Pair<Boolean, Integer> pairLIZLLL;
        IMSaasHostOfflineDebugService iMSaasHostOfflineDebugService = (IMSaasHostOfflineDebugService) PluggableExtentionKt.pluggableSpiForReal(IMSaasHostOfflineDebugService.class);
        return (iMSaasHostOfflineDebugService == null || (pairLIZLLL = iMSaasHostOfflineDebugService.LIZLLL()) == null) ? new Pair<>(Boolean.FALSE, 0) : pairLIZLLL;
    }

    @Override // X.C0YKM
    public final boolean LIZJ() {
        IMSaasHostOfflineDebugService iMSaasHostOfflineDebugService = (IMSaasHostOfflineDebugService) PluggableExtentionKt.pluggableSpiForReal(IMSaasHostOfflineDebugService.class);
        if (iMSaasHostOfflineDebugService != null) {
            return iMSaasHostOfflineDebugService.LJFF();
        }
        return false;
    }
}
