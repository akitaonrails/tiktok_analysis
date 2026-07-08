package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.03ll, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentSdkProcess$initRiskInfo$1", f = "PaymentSdkProcess.kt", l = {}, m = "invokeSuspend")
public final class C939103ll extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C939103ll(InterfaceC1364105Vn<? super C939103ll> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C939103ll(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PaymentSdkProcess@9b34.initRiskInfo$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1724230uyD c1724230uyD = C1724230uyD.LIZ;
        JSONObject jSONObject = new JSONObject();
        c1724230uyD.getClass();
        C1724230uyD.LIZIZ = jSONObject;
        C1724230uyD.LIZJ.set(false);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PaymentSdkProcess@9b34.initRiskInfo$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C939103ll(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
