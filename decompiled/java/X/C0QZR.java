package X;

import com.ss.android.ugc.aweme.config.SearchResultConfig;
import com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchEntranceData;
import kotlin.jvm.internal.AFwS196S0000000_10;

/* JADX INFO: renamed from: X.0QZR, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QZR {
    public static final SearchResultConfig LIZ = new SearchResultConfig();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(449));

    public static String LIZ(ECSearchEntranceData eCSearchEntranceData) {
        SearchResultConfig searchResultConfig;
        String stringOrNullStrategy;
        if (eCSearchEntranceData != null && (stringOrNullStrategy = eCSearchEntranceData.getStringOrNullStrategy("shop_api_version")) != null && C123100dR.LIZ(stringOrNullStrategy)) {
            return stringOrNullStrategy;
        }
        int iLIZ = C650500PfM.LIZ(eCSearchEntranceData);
        if (iLIZ == C0QXR.FASHION.getValue() || iLIZ == C0QXR.FLASH_SALE.getValue() || iLIZ == C0QXR.BRAND_BUDGET.getValue() || (searchResultConfig = (SearchResultConfig) LIZIZ.getValue()) == null) {
            return null;
        }
        return searchResultConfig.verticalApiVersion;
    }
}
