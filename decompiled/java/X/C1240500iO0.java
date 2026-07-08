package X;

/* JADX INFO: renamed from: X.0iO0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.searchengine.accounts.AccountsSearchEngine", f = "AccountsSearchEngine.kt", l = {86}, m = "getSearchResult")
public final class C1240500iO0 extends AbstractC23140094w {
    public long LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1240470iNx LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1240500iO0(C1240470iNx c1240470iNx, InterfaceC1364105Vn<? super C1240500iO0> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c1240470iNx;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AccountsSearchEngine@d281.getSearchResult$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZJ = this.LLILLL.LIZJ(null, this);
        C1C7U.LIZIZ("AccountsSearchEngine@d281.getSearchResult$1");
        return objLIZJ;
    }
}
