package X;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.horizontal.core.viewmodel.SearchLynxAwemeListRepoViewModel;

/* JADX INFO: renamed from: X.0PK2, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PK2 {
    public static SearchLynxAwemeListRepoViewModel LIZ() {
        LifecycleOwner lifecycleOwnerLIZLLL;
        ViewModelProvider viewModelProviderLIZJ;
        if (!(((Number) C07C7.LIZ.getValue()).intValue() == 1) || (lifecycleOwnerLIZLLL = C651290Pgd.LIZLLL()) == null || (viewModelProviderLIZJ = C679340Qkm.LIZJ(lifecycleOwnerLIZLLL)) == null) {
            return null;
        }
        return (SearchLynxAwemeListRepoViewModel) viewModelProviderLIZJ.get(SearchLynxAwemeListRepoViewModel.class);
    }
}
