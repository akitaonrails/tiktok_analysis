package X;

import android.view.View;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.0Ql0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C679480Ql0 {
    public static void LIZ(List list, View view, int i) {
        SearchMixFeed searchMixFeed;
        if (list != null && (searchMixFeed = (SearchMixFeed) C13LP.LJJJLZIJ(i, list)) != null) {
            view.setTag(R.id.u7x, searchMixFeed);
            if (searchMixFeed.getSearchCardUiInfo() == null && searchMixFeed.getFeedType() == 65280) {
                searchMixFeed.setSearchCardUiInfo(new C679490Ql1(null, new C679900Qlg(null, null, null, null, null, C1308910kAL.LIZJ(R.attr.a1f, view.getContext()), EnumC586020Mye.AREA_DECORATION_WITH_PARENT_WIDTH)));
            }
        }
    }
}
