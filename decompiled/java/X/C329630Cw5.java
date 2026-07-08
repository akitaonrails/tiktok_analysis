package X;

import com.ss.android.ugc.aweme.search.pages.result.topsearch.reviewaggregation.repo.SearchProsConsRepo;

/* JADX INFO: renamed from: X.0Cw5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.result.topsearch.reviewaggregation.repo.SearchProsConsRepo", f = "SearchProsConsRepo.kt", l = {57}, m = "loadMore-gIAlu-s")
public final class C329630Cw5 extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ SearchProsConsRepo LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C329630Cw5(SearchProsConsRepo searchProsConsRepo, InterfaceC1364105Vn<? super C329630Cw5> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = searchProsConsRepo;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("SearchProsConsRepo@66e.loadMore$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLJJLI.LIZ(null, this);
        if (objLIZ == C099R.LJFF()) {
            C1C7U.LIZIZ("SearchProsConsRepo@66e.loadMore$1");
            return objLIZ;
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(objLIZ);
        C1C7U.LIZIZ("SearchProsConsRepo@66e.loadMore$1");
        return c189200o6M1boximpl;
    }
}
