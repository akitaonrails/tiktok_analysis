package X;

import com.bytedance.ies.im.core.bridge.init.queryexp.QueryExpManager;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.service.risky.IDMRiskyKeywordsService;

/* JADX INFO: renamed from: X.0Cuk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class RunnableC328800Cuk implements Runnable {
    public static final RunnableC328800Cuk LL = new RunnableC328800Cuk();

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("ClientWrapperBridgeImpl@2a44.afterSDKLogin$1");
        try {
            QueryExpManager queryExpManager = QueryExpManager.LIZIZ;
            if (C328780Cui.LIZ().enabled) {
                C23250099c.LIZLLL(QueryExpManager.LJFF, null, null, new C328790Cuj(null), 3);
            }
            IDMRiskyKeywordsService iDMRiskyKeywordsService = (IDMRiskyKeywordsService) PluggableExtentionKt.pluggableSpiForReal(IDMRiskyKeywordsService.class);
            if (iDMRiskyKeywordsService != null) {
                iDMRiskyKeywordsService.LJ();
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ClientWrapperBridgeImpl@2a44.afterSDKLogin$1");
    }
}
