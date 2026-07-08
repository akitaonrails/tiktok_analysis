package X;

import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchTopBarStruct;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.TopBarDisplay;

/* JADX INFO: renamed from: X.0PFY, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PFY {
    public static final SearchTopBarStruct LIZ(SearchTopBarStruct searchTopBarStruct, int i, boolean z) {
        TopBarDisplay topBarDisplay;
        TopBarDisplay topBarDisplay2 = searchTopBarStruct.topBarDisplay;
        if (topBarDisplay2 != null) {
            topBarDisplay = new TopBarDisplay(Integer.valueOf(i), topBarDisplay2.totalHeight, topBarDisplay2.scrollAnimationType);
        } else if (z) {
            topBarDisplay = new TopBarDisplay(Integer.valueOf(i), null, null);
        } else {
            topBarDisplay = null;
        }
        return SearchTopBarStruct.LIZ(searchTopBarStruct, null, topBarDisplay, 47);
    }
}
