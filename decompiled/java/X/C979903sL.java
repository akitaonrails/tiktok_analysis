package X;

import com.ss.android.ugc.aweme.ecommerce.core.services.ECAddressService;

/* JADX INFO: renamed from: X.03sL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.core.services.ECAddressService", f = "ECAddressService.kt", l = {297}, m = "fetchAddressList")
public final class C979903sL extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ ECAddressService LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C979903sL(ECAddressService eCAddressService, InterfaceC1364105Vn<? super C979903sL> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = eCAddressService;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ECAddressService@5f43.fetchAddressList$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJI = this.LLILLJJLI.LJI(this);
        C1C7U.LIZIZ("ECAddressService@5f43.fetchAddressList$1");
        return objLJI;
    }
}
