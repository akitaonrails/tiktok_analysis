package X;

import com.bytedance.android.live.iap.service.IapServiceClass;

/* JADX INFO: renamed from: X.0wgs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.bytedance.android.live.iap.service.IapServiceClass", f = "IapServiceClass.kt", l = {747}, m = "checkExternalPaymentEligibility$suspendImpl")
public final class C1790360wgs extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ IapServiceClass LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1790360wgs(IapServiceClass iapServiceClass, InterfaceC1364105Vn<? super C1790360wgs> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = iapServiceClass;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IapServiceClass@66cd.checkExternalPaymentEligibility$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJIILLIIL = IapServiceClass.LJIILLIIL(this.LLILLJJLI, null, null, this);
        C1C7U.LIZIZ("IapServiceClass@66cd.checkExternalPaymentEligibility$1");
        return objLJIILLIIL;
    }
}
