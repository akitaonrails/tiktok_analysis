package X;

/* JADX INFO: renamed from: X.062n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ucp.impl.data.network.UcpApiCache", f = "UcpApiCache.kt", l = {44}, m = "getOrFetch-yxL6bBk")
public final class C15435062n<T> extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C15433062l LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15435062n(C15433062l c15433062l, InterfaceC1364105Vn<? super C15435062n> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c15433062l;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("UcpApiCache@c9da.getOrFetch$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZLLL = this.LLILLJJLI.LIZLLL(null, null, 0L, null, this);
        if (objLIZLLL == C099R.LJFF()) {
            C1C7U.LIZIZ("UcpApiCache@c9da.getOrFetch$1");
            return objLIZLLL;
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(objLIZLLL);
        C1C7U.LIZIZ("UcpApiCache@c9da.getOrFetch$1");
        return c189200o6M1boximpl;
    }
}
