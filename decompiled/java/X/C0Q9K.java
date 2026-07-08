package X;

import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchEntranceData;
import com.ss.android.ugc.aweme.search.middle.SearchResultFragmentNew;
import com.ss.android.ugc.aweme.search.middle.SearchStartViewModel;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.pages.core.ui.fragment.SearchContainerFragment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Q9K, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0Q9K implements InterfaceC664090Q3b {
    public final /* synthetic */ SearchResultFragmentNew LIZ;

    public C0Q9K(SearchResultFragmentNew searchResultFragmentNew) {
        this.LIZ = searchResultFragmentNew;
    }

    @Override // X.InterfaceC664090Q3b
    public final void LIZ(int i) {
        C0QER searchEnterParam;
        NextLiveData<Integer> nextLiveDataYQ2;
        int i2;
        ECSearchEntranceData ecSearchEntranceData;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    this.LIZ.ZT(false);
                    return;
                }
                return;
            }
            this.LIZ.ZT(false);
            return;
        }
        SearchResultFragmentNew searchResultFragmentNew = this.LIZ;
        C0QER c0qer = C640270P9l.LIZ(searchResultFragmentNew, searchResultFragmentNew.getActivity()).LL;
        if (c0qer != null && (ecSearchEntranceData = c0qer.getEcSearchEntranceData()) != null && ecSearchEntranceData.getBooleanStrategy("result_disable_filter")) {
            this.LIZ.ZT(true);
            return;
        }
        if (C285850BIh.LIZ()) {
            SearchResultFragmentNew searchResultFragmentNew2 = this.LIZ;
            if (searchResultFragmentNew2.LLJZIJLIL != null) {
                SearchResultFragmentNew searchResultFragmentNew3 = this.LIZ;
                SearchStartViewModel searchStartViewModel = searchResultFragmentNew3.LLJLL;
                EnumC669620QOi targetTab = null;
                if (searchStartViewModel != null && (nextLiveDataYQ2 = searchStartViewModel.yQ2()) != null && nextLiveDataYQ2.getValue() != null) {
                    SearchContainerFragment searchContainerFragmentKT = searchResultFragmentNew3.KT();
                    if (searchContainerFragmentKT != null) {
                        i2 = searchContainerFragmentKT.LLJJI;
                    } else {
                        i2 = -1;
                    }
                    if (Intrinsics.LJFF(C644560PPy.LJIILIIL(i2), EnumC669620QOi.SHOP.getTabName()) && !searchResultFragmentNew3.NR(searchResultFragmentNew3.LLJZIJLIL).booleanValue()) {
                        searchResultFragmentNew3.ZT(true);
                        return;
                    } else {
                        searchResultFragmentNew3.ZT(true);
                        return;
                    }
                }
                SearchResultParam searchResultParam = searchResultFragmentNew3.LLJZIJLIL;
                if (searchResultParam != null && (searchEnterParam = searchResultParam.getSearchEnterParam()) != null) {
                    targetTab = searchEnterParam.getTargetTab();
                }
                if (targetTab == EnumC669620QOi.SHOP) {
                    searchResultFragmentNew3.ZT(true);
                    return;
                } else {
                    searchResultFragmentNew3.ZT(true);
                    return;
                }
            }
            searchResultFragmentNew2.ZT(true);
            return;
        }
        this.LIZ.ZT(true);
    }
}
