package X;

/* JADX INFO: renamed from: X.0D3f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.pdp.PdpSkuCoordinator", f = "PdpSkuCoordinator.kt", l = {170}, m = "fetchGlobalProduct-0E7RQCE")
public final class C332890D3f extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C0D3P LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C332890D3f(C0D3P c0d3p, InterfaceC1364105Vn<? super C332890D3f> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c0d3p;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("PdpSkuCoordinator@f3df.fetchGlobalProduct$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJFF = this.LLILLJJLI.LJFF(null, null, this);
        if (objLJFF == C099R.LJFF()) {
            C1C7U.LIZIZ("PdpSkuCoordinator@f3df.fetchGlobalProduct$1");
            return objLJFF;
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(objLJFF);
        C1C7U.LIZIZ("PdpSkuCoordinator@f3df.fetchGlobalProduct$1");
        return c189200o6M1boximpl;
    }
}
