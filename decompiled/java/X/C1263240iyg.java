package X;

/* JADX INFO: renamed from: X.0iyg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.usercard.source.MafUserPagingSource", f = "MafUserPagingSource.kt", l = {208}, m = "loadFromStorage")
public final class C1263240iyg extends AbstractC23140094w {
    public C1263330iyp LL;
    public Object LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C1263110iyT LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1263240iyg(C1263110iyT c1263110iyT, InterfaceC1364105Vn<? super C1263240iyg> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = c1263110iyT;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MafUserPagingSource@b859.loadFromStorage$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLIZLLL = this.LLILZ.LIZLLL(null, null, this);
        C1C7U.LIZIZ("MafUserPagingSource@b859.loadFromStorage$1");
        return objLIZLLL;
    }
}
