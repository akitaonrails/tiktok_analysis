package X;

import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentCacheHelper;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.03MS, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentCacheHelper$fetchRegion$1", f = "PaymentCacheHelper.kt", l = {84}, m = "invokeSuspend")
public final class C03MS extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;

    public C03MS(InterfaceC1364105Vn<? super C03MS> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C03MS(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PaymentCacheHelper@550e.fetchRegion$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            PaymentCacheHelper paymentCacheHelper = PaymentCacheHelper.LIZ;
            Region region = PaymentCacheHelper.LJ;
            this.LL = 1;
            obj = paymentCacheHelper.LIZLLL(region, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("PaymentCacheHelper@550e.fetchRegion$1");
                return objLJFF;
            }
        }
        PaymentCacheHelper.LJ = (Region) obj;
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PaymentCacheHelper@550e.fetchRegion$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C03MS(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
