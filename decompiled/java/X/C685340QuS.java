package X;

/* JADX INFO: renamed from: X.0QuS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.result.nimble.repo.SearchNimbleCardRepository$operator$1", f = "SearchNimbleCardRepository.kt", l = {49}, m = "loadMore")
public final class C685340QuS extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C685320QuQ LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C685340QuS(C685320QuQ c685320QuQ, InterfaceC1364105Vn<? super C685340QuS> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c685320QuQ;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SearchNimbleCardRepository@8da4.operator$1$loadMore$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objL = this.LLILLJJLI.L(null, null, this);
        C1C7U.LIZIZ("SearchNimbleCardRepository@8da4.operator$1$loadMore$1");
        return objL;
    }
}
