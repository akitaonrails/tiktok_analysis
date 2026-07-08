package X;

import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.hub.core.model.SearchHubEntityCard;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PA4, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PA4 {
    public SearchHubEntityCard LIZ;

    public final void LIZ(SearchResultParam searchResultParam) {
        String enterMethod;
        if (searchResultParam != null) {
            enterMethod = searchResultParam.getEnterMethod();
        } else {
            enterMethod = null;
        }
        if (!Intrinsics.LJFF(enterMethod, "entity_switch") || searchResultParam.getFilterOption() != null) {
            this.LIZ = null;
        }
    }
}
