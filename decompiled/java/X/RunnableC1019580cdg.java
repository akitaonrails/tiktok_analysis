package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ad.feed.experiment.VSAProductIdRecordSetting;
import com.ss.android.ugc.aweme.ad.feed.model.OleDeliveryInfo;
import com.ss.android.ugc.aweme.commercialize.service.IFeedAppDetectService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0cdg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class RunnableC1019580cdg implements Runnable {
    public static final RunnableC1019580cdg LL = new RunnableC1019580cdg();

    public static void LIZ() {
        IFeedAppDetectService iFeedAppDetectService = (IFeedAppDetectService) PluggableExtentionKt.pluggableSpi$default(IFeedAppDetectService.class, false, false, false, 14, null);
        if (iFeedAppDetectService != null) {
            iFeedAppDetectService.LJ();
        }
        C1048110dNh.LIZLLL.getClass();
        C1019570cdf c1019570cdfLJ = C1048110dNh.LJ();
        if (((VSAProductIdRecordSetting.VSAProductIdRecordParam) VSAProductIdRecordSetting.LIZIZ.getValue()).enable) {
            try {
                String string = ((Keva) c1019570cdfLJ.LIZ.getValue()).getString("ole_delivery_info", "");
                c1019570cdfLJ.LIZJ = string;
                if (C703302op.LIZ(string)) {
                    C1227904rF c1227904rF = C1227904rF.LIZ;
                    String str = c1019570cdfLJ.LIZJ;
                    c1227904rF.getClass();
                    c1019570cdfLJ.LIZIZ = (OleDeliveryInfo) C1227904rF.LIZIZ(str, OleDeliveryInfo.class);
                }
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("LeadAdsDetectAppTask@f752.detectApp$1");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LeadAdsDetectAppTask@f752.detectApp$1");
    }
}
