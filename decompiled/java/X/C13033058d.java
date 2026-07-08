package X;

import com.ss.android.ugc.aweme.ecommerce.ug.pitaya.manager.EcUgPitayaManager;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.058d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.ug.pitaya.manager.EcUgPitayaManager$onMessage$1$1", f = "EcUgPitayaManager.kt", l = {}, m = "invokeSuspend")
public final class C13033058d extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ JSONObject LL;
    public final /* synthetic */ long LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13033058d(JSONObject jSONObject, long j, InterfaceC1364105Vn<? super C13033058d> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = jSONObject;
        this.LLILLJJLI = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C13033058d(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String strOptString;
        C1C7U.LIZ("EcUgPitayaManager@a4f0.onMessage$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        JSONObject jSONObjectOptJSONObject = this.LL.optJSONObject("behavior");
        if (jSONObjectOptJSONObject != null) {
            long j = this.LLILLJJLI;
            String strOptString2 = jSONObjectOptJSONObject.optString("action_id");
            JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("params");
            if (jSONObjectOptJSONObject2 == null || (strOptString = jSONObjectOptJSONObject2.optString("unique_id")) == null) {
                strOptString = "";
            }
            InterfaceC13038058i interfaceC13038058i = EcUgPitayaManager.pitayaMsgObservers.get(new Pair(strOptString2, strOptString));
            if (interfaceC13038058i != null) {
                interfaceC13038058i.N0(strOptString2, j, jSONObjectOptJSONObject2);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EcUgPitayaManager@a4f0.onMessage$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
