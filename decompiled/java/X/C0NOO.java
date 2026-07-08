package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0NOO, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.bytedance.android.starship.strategy.trace.TraceManager$uploadApiMonitor$1", f = "TraceManager.kt", l = {}, m = "invokeSuspend")
public final class C0NOO extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0NON LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NOO(C0NON c0non, InterfaceC1364105Vn<? super C0NOO> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0non;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0NOO(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TraceManager@b3cb.uploadApiMonitor$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            C0NOP c0nop = this.LL.LIZIZ.get("init_trace_span_fetch");
            if (c0nop != null) {
                JSONObject jSONObject = new JSONObject();
                Object obj2 = c0nop.LIZ.get("error_code");
                if (obj2 != null) {
                    jSONObject.put("error_code", obj2);
                }
                Object obj3 = c0nop.LIZ.get("logid");
                if (obj3 != null) {
                    jSONObject.put("logid", obj3);
                }
                JSONObject jSONObject2 = new JSONObject();
                Object obj4 = c0nop.LIZ.get("total_time");
                if (obj4 != null) {
                    jSONObject2.put("total_time", obj4);
                }
                C793770VBv.LJII("starship_strategy_api_monitor", jSONObject, jSONObject2, null);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TraceManager@b3cb.uploadApiMonitor$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
