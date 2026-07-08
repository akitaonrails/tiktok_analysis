package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.ss.android.ugc.aweme.discover.model.SearchApiResult;
import com.ss.android.ugc.aweme.search.pages.result.common.statusview.viewmodel.SearchStatusViewVM;

/* JADX INFO: renamed from: X.0PQK, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PQK {
    public static SearchStatusViewVM LIZIZ(Fragment fragment) {
        if (fragment == null) {
            return null;
        }
        return (SearchStatusViewVM) new ViewModelProvider(fragment).get(SearchStatusViewVM.class);
    }

    public static boolean LIZ(SearchApiResult searchApiResult, Exception exc, int i) {
        if ((i & 1) != 0) {
            searchApiResult = null;
        }
        if ((i & 2) != 0) {
            exc = null;
        }
        int i2 = C0PQM.LIZ[C0PQL.LIZ(searchApiResult, exc).ordinal()];
        if (i2 == 1 || i2 == 2 || i2 == 3) {
            return true;
        }
        if (i2 != 4 && i2 != 5) {
            throw new C1954807lC();
        }
        return false;
    }
}
