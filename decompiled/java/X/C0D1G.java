package X;

/* JADX INFO: renamed from: X.0D1G, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.source.product.AcShopCatalogGateway", f = "AcShopCatalogGateway.kt", l = {40}, m = "fetchProduct-BWLJW6A")
public final class C0D1G extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C0D1E LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0D1G(C0D1E c0d1e, InterfaceC1364105Vn<? super C0D1G> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c0d1e;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AcShopCatalogGateway@8a17.fetchProduct$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILLJJLI.LIZIZ(null, null, null, this);
        if (objLIZIZ == C099R.LJFF()) {
            C1C7U.LIZIZ("AcShopCatalogGateway@8a17.fetchProduct$1");
            return objLIZIZ;
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(objLIZIZ);
        C1C7U.LIZIZ("AcShopCatalogGateway@8a17.fetchProduct$1");
        return c189200o6M1boximpl;
    }
}
