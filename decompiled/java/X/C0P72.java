package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.viewmodel.SearchRefreshPredictMobCanShowVM;

/* JADX INFO: renamed from: X.0P72, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0P72 {
    public static SearchRefreshPredictMobCanShowVM LIZ(Fragment fragment) {
        if (fragment == null || !C0PPZ.LIZ() || fragment.getActivity() == null) {
            return null;
        }
        return (SearchRefreshPredictMobCanShowVM) new ViewModelProvider(fragment).get(SearchRefreshPredictMobCanShowVM.class);
    }
}
