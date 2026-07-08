package X;

/* JADX INFO: renamed from: X.0D0K, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.source.product.UCPProductGateway", f = "UCPProductGateway.kt", l = {42}, m = "fetchGlobalProduct-BWLJW6A")
public final class C0D0K extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C0D0J LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0D0K(C0D0J c0d0j, InterfaceC1364105Vn<? super C0D0K> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c0d0j;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("UCPProductGateway@2a5f.fetchGlobalProduct$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLJJLI.LIZ(null, null, null, this);
        if (objLIZ == C099R.LJFF()) {
            C1C7U.LIZIZ("UCPProductGateway@2a5f.fetchGlobalProduct$1");
            return objLIZ;
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(objLIZ);
        C1C7U.LIZIZ("UCPProductGateway@2a5f.fetchGlobalProduct$1");
        return c189200o6M1boximpl;
    }
}
