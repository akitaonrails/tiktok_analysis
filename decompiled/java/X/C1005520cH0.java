package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0cH0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.bytedance.android.live.walletclean.presentation.assem.body.viewmodel.RechargePanelBodyViewModel$onBindRechargePackageItem$1", f = "RechargePanelBodyViewModel.kt", l = {}, m = "invokeSuspend")
public final class C1005520cH0 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ InterfaceC1806790x7N LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1005520cH0(int i, InterfaceC1806790x7N interfaceC1806790x7N, InterfaceC1364105Vn<? super C1005520cH0> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = i;
        this.LLILLJJLI = interfaceC1806790x7N;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1005520cH0(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        String simpleName;
        C1C7U.LIZ("RechargePanelBodyViewModel@d42d.onBindRechargePackageItem$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        JSONObject jSONObject = new JSONObject();
        int i = this.LL;
        InterfaceC1806790x7N interfaceC1806790x7N = this.LLILLJJLI;
        jSONObject.put("position", i);
        if (interfaceC1806790x7N != null) {
            simpleName = interfaceC1806790x7N.getClass().getSimpleName();
        } else {
            simpleName = null;
        }
        jSONObject.put("data_type_name", simpleName);
        C1807660x8m.LIZIZ("livesdk_recharge_panel_item_bind", jSONObject, new JSONObject(), new JSONObject());
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("RechargePanelBodyViewModel@d42d.onBindRechargePackageItem$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
