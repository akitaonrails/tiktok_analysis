package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.protocol.BaseSearchDynamicTabProtocol;

/* JADX INFO: renamed from: X.0PZ9, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PZ9 {
    public static Bundle LIZ(BaseSearchDynamicTabProtocol baseSearchDynamicTabProtocol, SearchResultParam searchResultParam, String str) {
        Bundle bundle = new Bundle();
        C786410Ut5.LJJIZ(bundle, "search_tab_config", baseSearchDynamicTabProtocol.Ij0(str));
        C786410Ut5.LJJIZ(bundle, "search_key", searchResultParam);
        return bundle;
    }
}
