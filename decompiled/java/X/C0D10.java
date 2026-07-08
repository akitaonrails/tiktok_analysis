package X;

/* JADX INFO: renamed from: X.0D10, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.source.ucp.UcpRealDataSource", f = "UcpRealDataSource.kt", l = {137}, m = "fetchProductInternal-yxL6bBk")
public final class C0D10 extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C0D12 LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0D10(C0D12 c0d12, InterfaceC1364105Vn<? super C0D10> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c0d12;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("UcpRealDataSource@7c39.fetchProductInternal$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJ = this.LLILLJJLI.LJ(null, null, null, false, this);
        if (objLJ == C099R.LJFF()) {
            C1C7U.LIZIZ("UcpRealDataSource@7c39.fetchProductInternal$1");
            return objLJ;
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(objLJ);
        C1C7U.LIZIZ("UcpRealDataSource@7c39.fetchProductInternal$1");
        return c189200o6M1boximpl;
    }
}
