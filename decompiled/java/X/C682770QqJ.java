package X;

import com.ss.android.ugc.aweme.search.pages.result.topsearch.minis.core.SearchMinisAllResultsActivity;

/* JADX INFO: renamed from: X.0QqJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.result.topsearch.minis.core.SearchMinisAllResultsActivity", f = "SearchMinisAllResultsActivity.kt", l = {208}, m = "fetchMore")
public final class C682770QqJ extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ SearchMinisAllResultsActivity LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C682770QqJ(SearchMinisAllResultsActivity searchMinisAllResultsActivity, InterfaceC1364105Vn<? super C682770QqJ> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = searchMinisAllResultsActivity;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SearchMinisAllResultsActivity@ae04.fetchMore$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLLLLLZL = this.LLILLJJLI.LLLLLZL(0, this);
        C1C7U.LIZIZ("SearchMinisAllResultsActivity@ae04.fetchMore$1");
        return objLLLLLZL;
    }
}
