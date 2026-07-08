package X;

import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.search.middle.SearchResultFragmentNew;
import com.ss.android.ugc.aweme.search.middle.SearchStartViewModel;

/* JADX INFO: renamed from: X.0Q8j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C665470Q8j implements InterfaceC669910QPl {
    public final /* synthetic */ SearchResultFragmentNew LIZ;

    @Override // X.InterfaceC669910QPl
    public final NextLiveData<Integer> F6() {
        SearchStartViewModel searchStartViewModel = this.LIZ.LLJLL;
        if (searchStartViewModel != null) {
            return (NextLiveData) searchStartViewModel.LLJJI.getValue();
        }
        return null;
    }

    @Override // X.InterfaceC669910QPl
    public final NextLiveData<Integer> LIZIZ() {
        SearchStartViewModel searchStartViewModel = this.LIZ.LLJLL;
        if (searchStartViewModel != null) {
            return searchStartViewModel.yQ2();
        }
        return null;
    }

    @Override // X.InterfaceC669910QPl
    public final int getTabIndex() {
        NextLiveData<Integer> nextLiveDataYQ2;
        Integer value;
        SearchStartViewModel searchStartViewModel = this.LIZ.LLJLL;
        if (searchStartViewModel == null || (nextLiveDataYQ2 = searchStartViewModel.yQ2()) == null || (value = nextLiveDataYQ2.getValue()) == null) {
            return -1;
        }
        return value.intValue();
    }

    public C665470Q8j(SearchResultFragmentNew searchResultFragmentNew) {
        this.LIZ = searchResultFragmentNew;
    }

    @Override // X.InterfaceC669910QPl
    public final String LIZ(int i) {
        return C644560PPy.LJIILIIL(i);
    }
}
