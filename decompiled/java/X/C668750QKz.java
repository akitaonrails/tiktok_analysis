package X;

import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.search.middle.SearchResultFragmentNew;
import com.ss.android.ugc.aweme.search.middle.SearchStartViewModel;

/* JADX INFO: renamed from: X.0QKz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C668750QKz implements InterfaceC667070QEn {
    public final /* synthetic */ SearchResultFragmentNew LIZ;

    @Override // X.InterfaceC667070QEn
    public final void LIZIZ() {
        SearchResultFragmentNew searchResultFragmentNew = this.LIZ;
        searchResultFragmentNew.KT();
        searchResultFragmentNew.EU(new C0QL0(searchResultFragmentNew.VR()));
    }

    public C668750QKz(SearchResultFragmentNew searchResultFragmentNew) {
        this.LIZ = searchResultFragmentNew;
    }

    @Override // X.InterfaceC667070QEn
    public final void LIZ(Word word) {
        NextLiveData<Word> nextLiveDataWQ2;
        SearchStartViewModel searchStartViewModel = this.LIZ.LLJLL;
        if (searchStartViewModel != null && (nextLiveDataWQ2 = searchStartViewModel.wQ2()) != null) {
            nextLiveDataWQ2.setValue(word);
        }
    }
}
