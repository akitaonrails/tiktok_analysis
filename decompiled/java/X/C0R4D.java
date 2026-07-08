package X;

import android.os.MessageQueue;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.search.middle.DynamicSingleIntermediateFragmentNew;
import com.ss.android.ugc.aweme.search.middle.SearchResultFragmentNew;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.ui.jedi.SearchJediMixFeedFragment;
import java.util.List;

/* JADX INFO: renamed from: X.0R4D, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public class C0R4D implements MessageQueue.IdleHandler {
    public final int $t;
    public Object l0;

    @Override // android.os.MessageQueue.IdleHandler
    public final boolean queueIdle() {
        switch (this.$t) {
            case 0:
                return queueIdle$0(this);
            case 1:
                return queueIdle$1(this);
            case 2:
                return queueIdle$2(this);
            default:
                return false;
        }
    }

    public static final boolean queueIdle$0(C0R4D c0r4d) throws InterruptedException {
        SearchResultFragmentNew searchResultFragmentNew;
        SearchResultParam searchResultParam;
        Fragment parentFragment = ((DynamicSingleIntermediateFragmentNew) c0r4d.l0).getParentFragment();
        if ((parentFragment instanceof SearchResultFragmentNew) && (searchResultFragmentNew = (SearchResultFragmentNew) parentFragment) != null && (searchResultParam = searchResultFragmentNew.LLZLLLL) != null) {
            searchResultFragmentNew.DT(searchResultParam, true);
            return false;
        }
        return false;
    }

    public static final boolean queueIdle$1(C0R4D c0r4d) {
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(((SearchJediMixFeedFragment) c0r4d.l0).getViewLifecycleOwner()), null, null, new C640600PAs((SearchJediMixFeedFragment) c0r4d.l0, null), 3);
        return false;
    }

    public static final boolean queueIdle$2(C0R4D c0r4d) {
        List<SearchMixFeed> items;
        SearchJediMixFeedFragment searchJediMixFeedFragment = (SearchJediMixFeedFragment) c0r4d.l0;
        String str = SearchJediMixFeedFragment._pnsPageId;
        C0PN8 c0pn8HU = searchJediMixFeedFragment.HU(false);
        if (c0pn8HU != null) {
            items = c0pn8HU.getItems();
        } else {
            items = null;
        }
        searchJediMixFeedFragment.oV(items);
        return false;
    }

    public C0R4D(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
