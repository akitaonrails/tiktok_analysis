package X;

/* JADX INFO: renamed from: X.03rI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.address.repository.AddressRepository", f = "AddressRepository.kt", l = {257}, m = "fetchBuyerHasAddressForce")
public final class C973403rI extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C973303rH LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C973403rI(C973303rH c973303rH, InterfaceC1364105Vn<? super C973403rI> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c973303rH;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AddressRepository@114.fetchBuyerHasAddressForce$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZLLL = this.LLILLJJLI.LIZLLL(this);
        C1C7U.LIZIZ("AddressRepository@114.fetchBuyerHasAddressForce$1");
        return objLIZLLL;
    }
}
