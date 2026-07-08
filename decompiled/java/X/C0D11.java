package X;

/* JADX INFO: renamed from: X.0D11, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.source.ucp.UcpRealDataSource", f = "UcpRealDataSource.kt", l = {80}, m = "fetchProduct-0E7RQCE")
public final class C0D11 extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C0D12 LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0D11(C0D12 c0d12, InterfaceC1364105Vn<? super C0D11> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c0d12;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("UcpRealDataSource@7c39.fetchProduct$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZLLL = this.LLILLJJLI.LIZLLL(null, null, this);
        if (objLIZLLL == C099R.LJFF()) {
            C1C7U.LIZIZ("UcpRealDataSource@7c39.fetchProduct$1");
            return objLIZLLL;
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(objLIZLLL);
        C1C7U.LIZIZ("UcpRealDataSource@7c39.fetchProduct$1");
        return c189200o6M1boximpl;
    }
}
