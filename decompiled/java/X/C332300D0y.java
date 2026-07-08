package X;

/* JADX INFO: renamed from: X.0D0y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.source.ucp.UcpRealDataSource", f = "UcpRealDataSource.kt", l = {96}, m = "fetchGlobalProduct-BWLJW6A")
public final class C332300D0y extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C0D12 LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C332300D0y(C0D12 c0d12, InterfaceC1364105Vn<? super C332300D0y> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c0d12;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("UcpRealDataSource@7c39.fetchGlobalProduct$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLJJLI.LIZ(null, null, null, this);
        if (objLIZ == C099R.LJFF()) {
            C1C7U.LIZIZ("UcpRealDataSource@7c39.fetchGlobalProduct$1");
            return objLIZ;
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(objLIZ);
        C1C7U.LIZIZ("UcpRealDataSource@7c39.fetchGlobalProduct$1");
        return c189200o6M1boximpl;
    }
}
