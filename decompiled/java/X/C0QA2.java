package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.SharedViewModelProvider;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeedList;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.reviewaggregation.repo.ImageLoadMoreData;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.visualinspiration.model.ImageCollectionCardData;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.visualinspiration.vm.SearchVisualInspirationSharedVM;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0QA2, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QA2 {
    public static void LIZIZ(SearchMixFeedList searchMixFeedList) {
        List<SearchMixFeed> list;
        SearchMixFeed next;
        ImageCollectionCardData imageLoadMoreData;
        ImageLoadMoreData imageLoadMoreData2;
        if (C1839407Ii.LIZ() && searchMixFeedList != null && (list = searchMixFeedList.mItems) != null) {
            Iterator<SearchMixFeed> it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (next.getImageLoadMoreData() != null) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            SearchMixFeed searchMixFeed = next;
            if (searchMixFeed != null && (imageLoadMoreData = searchMixFeed.getImageLoadMoreData()) != null && (imageLoadMoreData2 = imageLoadMoreData.items) != null) {
                imageLoadMoreData2.initProcessImageList();
            }
        }
    }

    public static SearchVisualInspirationSharedVM LIZ(Fragment fragment, String str) {
        final SearchVisualInspirationSharedVM searchVisualInspirationSharedVM = (SearchVisualInspirationSharedVM) new SharedViewModelProvider(new ViewModelProvider.NewInstanceFactory()).get(fragment.getLifecycle(), str, SearchVisualInspirationSharedVM.class);
        if (!searchVisualInspirationSharedVM._initialized) {
            searchVisualInspirationSharedVM.AQ2(fragment);
            Context context = fragment.getContext();
            if (context != null) {
                ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = new ViewOnAttachStateChangeListenerC20604515jv(context, null);
                C20603715jn c20603715jn = new C20603715jn();
                c20603715jn.LIZJ = false;
                c20603715jn.LJIIJ = false;
                c20603715jn.LIZ = 0;
                viewOnAttachStateChangeListenerC20604515jv.setListConfig(c20603715jn);
                searchVisualInspirationSharedVM.setListState(viewOnAttachStateChangeListenerC20604515jv.getState());
                viewOnAttachStateChangeListenerC20604515jv.LJIIL((AbstractC329610Cw3) new C2217401BqU(searchVisualInspirationSharedVM) { // from class: X.0QA3
                    @Override // X.C2217401BqU, X.AbstractC2217341BqO, X.InterfaceC2217311BqL
                    public final Object get() {
                        return ((AssemListViewModel) this.receiver).getConfig();
                    }
                }.get());
            }
        }
        return searchVisualInspirationSharedVM;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ(androidx.fragment.app.Fragment r10, com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeedList r11) {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0QA2.LIZJ(androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeedList):void");
    }
}
