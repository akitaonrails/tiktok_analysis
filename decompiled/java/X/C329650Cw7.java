package X;

import com.ss.android.ugc.aweme.search.pages.result.topsearch.reviewaggregation.repo.SearchProsConsRepo;

/* JADX INFO: renamed from: X.0Cw7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.result.topsearch.reviewaggregation.repo.SearchProsConsRepo", f = "SearchProsConsRepo.kt", l = {79, 83}, m = "request-0E7RQCE")
public final class C329650Cw7 extends AbstractC23140094w {
    public C329660Cw8 LL;
    public SearchProsConsRepo LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ SearchProsConsRepo LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C329650Cw7(SearchProsConsRepo searchProsConsRepo, InterfaceC1364105Vn<? super C329650Cw7> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = searchProsConsRepo;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("SearchProsConsRepo@66e.request$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLIZJ = this.LLILZ.LIZJ(null, 0, this);
        if (objLIZJ == C099R.LJFF()) {
            C1C7U.LIZIZ("SearchProsConsRepo@66e.request$1");
            return objLIZJ;
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(objLIZJ);
        C1C7U.LIZIZ("SearchProsConsRepo@66e.request$1");
        return c189200o6M1boximpl;
    }
}
