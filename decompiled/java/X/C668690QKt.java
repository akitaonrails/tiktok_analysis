package X;

import android.text.TextUtils;
import com.bytedance.ies.ugc.aweme.commercialize.search.service.ISearchAdMainService;
import com.ss.android.ugc.aweme.discover.model.SearchStateViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.search.middle.SearchResultFragmentNew;
import com.ss.android.ugc.aweme.search.middle.SearchStartViewModel;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0QKt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C668690QKt implements C0QJ5 {
    public final /* synthetic */ SearchResultFragmentNew LIZ;

    @Override // X.C0QJ5
    public final boolean LIZIZ() {
        SearchStartViewModel searchStartViewModel = this.LIZ.LLJLL;
        if (searchStartViewModel != null) {
            return searchStartViewModel.LLIZ;
        }
        return false;
    }

    @Override // X.C0QJ5
    public final HashMap<String, Long> LIZJ() {
        HashMap<String, Long> map;
        SearchStartViewModel searchStartViewModel = this.LIZ.LLJLL;
        return (searchStartViewModel == null || (map = searchStartViewModel.LLJLIL) == null) ? new HashMap<>() : map;
    }

    @Override // X.C0QJ5
    public final void LIZLLL() {
        SearchStartViewModel searchStartViewModel = this.LIZ.LLJLL;
        if (searchStartViewModel != null) {
            searchStartViewModel.LLILZLL = true;
        }
    }

    public C668690QKt(SearchResultFragmentNew searchResultFragmentNew) {
        this.LIZ = searchResultFragmentNew;
    }

    @Override // X.C0QJ5
    public final void LIZ(SearchResultParam searchResultParam) {
        ISearchAdMainService iSearchAdMainService;
        if (SearchStateViewModel.isSearchIntermediate(this.LIZ.UR()) && !TextUtils.isEmpty(searchResultParam.getKeyword())) {
            if (this.LIZ.NR(searchResultParam).booleanValue()) {
                this.LIZ.sT();
            }
            C644060POa.LIZ.getClass();
            C644060POa.LJIIIZ(0, searchResultParam);
            SearchStartViewModel searchStartViewModel = this.LIZ.LLJLL;
            if (searchStartViewModel != null) {
                searchStartViewModel.LLJJLIIIJLLLLLLLZ = searchResultParam;
            }
            this.LIZ.hT(searchResultParam, false);
            Aweme awemeLJIIIIZZ = this.LIZ.LJIIIIZZ();
            if (awemeLJIIIIZZ != null && awemeLJIIIIZZ.isAd() && (iSearchAdMainService = (ISearchAdMainService) PluggableExtentionKt.pluggableSpi$default(ISearchAdMainService.class, false, false, false, 14, null)) != null) {
                iSearchAdMainService.LJIJ(awemeLJIIIIZZ, searchResultParam.getKeyword());
            }
        }
    }
}
