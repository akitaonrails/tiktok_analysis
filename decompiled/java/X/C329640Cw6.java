package X;

import com.ss.android.ugc.aweme.search.pages.result.topsearch.reviewaggregation.repo.SearchProsConsRepo;

/* JADX INFO: renamed from: X.0Cw6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.result.topsearch.reviewaggregation.repo.SearchProsConsRepo", f = "SearchProsConsRepo.kt", l = {52}, m = "refresh-gIAlu-s")
public final class C329640Cw6 extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ SearchProsConsRepo LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C329640Cw6(SearchProsConsRepo searchProsConsRepo, InterfaceC1364105Vn<? super C329640Cw6> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = searchProsConsRepo;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("SearchProsConsRepo@66e.refresh$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILLJJLI.LIZIZ(null, this);
        if (objLIZIZ == C099R.LJFF()) {
            C1C7U.LIZIZ("SearchProsConsRepo@66e.refresh$1");
            return objLIZIZ;
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(objLIZIZ);
        C1C7U.LIZIZ("SearchProsConsRepo@66e.refresh$1");
        return c189200o6M1boximpl;
    }
}
