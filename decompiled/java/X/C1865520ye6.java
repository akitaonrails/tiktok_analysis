package X;

import com.ss.android.ugc.aweme.ecommercelive.common.infra.popcard.settings.ECReportRdStepEventConfig;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.popcard.settings.ECReportRdStepEventMap;
import java.util.Map;
import kotlin.jvm.internal.AFwS217S0000000_28;

/* JADX INFO: renamed from: X.0ye6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1865520ye6 {
    public static final ECReportRdStepEventConfig LIZ = new ECReportRdStepEventConfig(C2097608Jq.LJ());
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(662));

    public static Boolean LIZ(String str) {
        ECReportRdStepEventMap eCReportRdStepEventMap;
        Map<String, ECReportRdStepEventMap> map = ((ECReportRdStepEventConfig) LIZIZ.getValue()).eventMap;
        if (map != null && (eCReportRdStepEventMap = map.get(str)) != null) {
            return eCReportRdStepEventMap.enable;
        }
        return null;
    }
}
