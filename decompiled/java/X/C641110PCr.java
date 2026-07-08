package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.pages.result.core.model.SearchResultParamProvider;

/* JADX INFO: renamed from: X.0PCr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C641110PCr {
    public static SearchResultParam LIZ(Context context, Fragment fragment) {
        C19EG c19eg = (C19EG) C1388190mED.LIZ(context);
        if (fragment == null) {
            SAFHelper.LIZ.getClass();
            fragment = SAFHelper.LJJIJ(null, c19eg);
        }
        SearchResultParam searchResultParam = ((SearchResultParamProvider) C679340Qkm.LIZIZ(fragment, c19eg).get(SearchResultParamProvider.class)).LL;
        if (searchResultParam == null) {
            return new SearchResultParam();
        }
        return searchResultParam;
    }

    public static void LIZIZ(Context context, Fragment fragment, SearchResultParam searchResultParam) {
        ((SearchResultParamProvider) C679340Qkm.LIZIZ(fragment, (C19EG) C1388190mED.LIZ(context)).get(SearchResultParamProvider.class)).LL = searchResultParam;
    }
}
