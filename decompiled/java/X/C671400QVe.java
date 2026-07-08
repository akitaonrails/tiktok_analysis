package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.ecommerce.search.utils.EcIntermediatePreload;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;

/* JADX INFO: renamed from: X.0QVe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C671400QVe {
    public static void LIZ(SearchResultParam searchResultParam, C669560QOc c669560QOc) {
        if (EcIntermediatePreload.hasPreloading) {
            return;
        }
        EcIntermediatePreload.hasPreloading = true;
        Bundle bundle = new Bundle();
        C786410Ut5.LJJIZ(bundle, "search_enter_param", searchResultParam);
        if (C1202604nA.LIZ() && c669560QOc != null) {
            C786410Ut5.LJJIZ(bundle, "search_ecommerce_model", c669560QOc);
        }
        C1524605y0.LIZ().LIZLLL(bundle, EcIntermediatePreload.class);
    }
}
