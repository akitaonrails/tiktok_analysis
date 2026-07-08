package X;

import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.discover.model.SearchApiResult;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.multiapp.ISearchExService;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.pages.result.common.filter.core.model.OptionConfigParams;
import java.util.List;

/* JADX INFO: renamed from: X.0Q8u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C665580Q8u implements ISearchExService {
    public static final C665580Q8u LIZIZ = new C665580Q8u();
    public final /* synthetic */ ISearchExService LIZ;

    @Override // com.ss.android.ugc.aweme.multiapp.ISearchExService
    public final void LIZ(Object obj) {
        this.LIZ.LIZ(obj);
    }

    @Override // com.ss.android.ugc.aweme.multiapp.ISearchExService
    public final boolean LIZIZ() {
        return this.LIZ.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.multiapp.ISearchExService
    public final void LIZJ(C653660PkS c653660PkS) {
        this.LIZ.LIZJ(c653660PkS);
    }

    @Override // com.ss.android.ugc.aweme.multiapp.ISearchExService
    public final void LIZLLL(String str, C666520QCk c666520QCk, int i) {
        this.LIZ.LIZLLL(str, c666520QCk, i);
    }

    @Override // com.ss.android.ugc.aweme.multiapp.ISearchExService
    public final C15O7 LJ(Object obj, String str) {
        return this.LIZ.LJ(obj, str);
    }

    @Override // com.ss.android.ugc.aweme.multiapp.ISearchExService
    public final void LJFF(C19EG c19eg) {
        this.LIZ.LJFF(c19eg);
    }

    @Override // com.ss.android.ugc.aweme.multiapp.ISearchExService
    public final boolean LJI() {
        return this.LIZ.LJI();
    }

    @Override // com.ss.android.ugc.aweme.multiapp.ISearchExService
    public final List<String> LJII() {
        return this.LIZ.LJII();
    }

    @Override // com.ss.android.ugc.aweme.multiapp.ISearchExService
    public final void LJIIIIZZ(Aweme aweme, C653660PkS c653660PkS, String str) {
        this.LIZ.LJIIIIZZ(aweme, c653660PkS, str);
    }

    @Override // com.ss.android.ugc.aweme.multiapp.ISearchExService
    public final void LJIIIZ(C653660PkS c653660PkS) {
        this.LIZ.LJIIIZ(c653660PkS);
    }

    @Override // com.ss.android.ugc.aweme.multiapp.ISearchExService
    public final void LJIIJ(String str, SearchApiResult searchApiResult, C15O7<BaseResponse> c15o7, boolean z) {
        this.LIZ.LJIIJ(str, searchApiResult, c15o7, z);
    }

    @Override // com.ss.android.ugc.aweme.multiapp.ISearchExService
    public final boolean LJIIJJI() {
        return this.LIZ.LJIIJJI();
    }

    @Override // com.ss.android.ugc.aweme.multiapp.ISearchExService
    public final void LJIIL(boolean z) {
        this.LIZ.LJIIL(z);
    }

    @Override // com.ss.android.ugc.aweme.multiapp.ISearchExService
    public final void LJIILIIL(SearchResultParam searchResultParam) {
        this.LIZ.LJIILIIL(searchResultParam);
    }

    @Override // com.ss.android.ugc.aweme.multiapp.ISearchExService
    public final void LJIILJJIL(OptionConfigParams optionConfigParams) {
        this.LIZ.LJIILJJIL(optionConfigParams);
    }

    @Override // com.ss.android.ugc.aweme.multiapp.ISearchExService
    public final boolean LJIILL() {
        return this.LIZ.LJIILL();
    }

    @Override // com.ss.android.ugc.aweme.multiapp.ISearchExService
    public final void LJIILLIIL() {
        this.LIZ.LJIILLIIL();
    }

    public C665580Q8u() {
        ISearchExService iSearchExService = (ISearchExService) PluggableExtentionKt.pluggableSpi$default(ISearchExService.class, false, false, false, 14, null);
        if (iSearchExService != null) {
            this.LIZ = iSearchExService;
        } else {
            "no implementation ISearchExService".toString();
            throw new IllegalStateException("no implementation ISearchExService");
        }
    }
}
