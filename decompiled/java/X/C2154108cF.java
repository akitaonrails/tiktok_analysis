package X;

import com.bytedance.android.live.iap.service.IapService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.08cF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.subscription.payment.v2.PaymentProcessHelper$getPlayStoreCurrencyCode$2", f = "PaymentProcessHelper.kt", l = {}, m = "invokeSuspend")
public final class C2154108cF extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super String>, Object> {
    public C2154108cF(InterfaceC1364105Vn<? super C2154108cF> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2154108cF(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PaymentProcessHelper@d606.getPlayStoreCurrencyCode$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        String currencyCode = ((IapService) C1161920gLG.LIZJ(IapService.class)).getCurrencyCode();
        C1C7U.LIZIZ("PaymentProcessHelper@d606.getPlayStoreCurrencyCode$2");
        return currencyCode;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super String> interfaceC1364105Vn) {
        return new C2154108cF(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
