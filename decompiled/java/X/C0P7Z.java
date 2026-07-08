package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.ss.android.ugc.aweme.search.pages.result.common.statusview.viewmodel.SearchNetworkStandardStatusVM;

/* JADX INFO: renamed from: X.0P7Z, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0P7Z {
    public static SearchNetworkStandardStatusVM LIZ(Fragment fragment) {
        if (fragment == null) {
            return null;
        }
        return (SearchNetworkStandardStatusVM) new ViewModelProvider(fragment).get(SearchNetworkStandardStatusVM.class);
    }
}
