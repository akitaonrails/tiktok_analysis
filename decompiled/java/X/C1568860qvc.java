package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0qvc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.bytedance.android.live.walletclean.domain.usecase.preload.FECashierPreloadJSTriggerUseCase$execute$2", f = "FECashierPreloadJSTriggerUseCase.kt", l = {}, m = "invokeSuspend")
public final class C1568860qvc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1568850qvb LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1568860qvc(C1568850qvb c1568850qvb, InterfaceC1364105Vn<? super C1568860qvc> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1568850qvb;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1568860qvc(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        C1C7U.LIZ("FECashierPreloadJSTriggerUseCase@270d.execute$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        JSONObject jSONObject = new JSONObject();
        C1568850qvb c1568850qvb = this.LL;
        jSONObject.put("original_local_price", c1568850qvb.LIZ);
        jSONObject.put("currency", c1568850qvb.LIZIZ);
        jSONObject.put("start_create_order_timestamp", c1568850qvb.LIZJ);
        C389001fE.LIZ("live_recharge_v3_will_place_order", jSONObject, System.currentTimeMillis(), false);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FECashierPreloadJSTriggerUseCase@270d.execute$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
