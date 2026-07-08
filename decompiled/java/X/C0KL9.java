package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0KL9, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.subscription.pgc.payment.v2.PaymentProcessHelper$getPlayStoreCurrencyCode$2", f = "PaymentProcessHelper.kt", l = {}, m = "invokeSuspend")
public final class C0KL9 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super String>, Object> {
    public C0KL9(InterfaceC1364105Vn<? super C0KL9> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0KL9(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PaymentProcessHelper@367d.getPlayStoreCurrencyCode$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0KLU.LIZ.getClass();
        C0KNH c0knhLJI = C515950KLh.LJI();
        if (c0knhLJI != null) {
            c0knhLJI.LJII();
        }
        C1C7U.LIZIZ("PaymentProcessHelper@367d.getPlayStoreCurrencyCode$2");
        return "";
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super String> interfaceC1364105Vn) {
        return new C0KL9(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
