package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01SU, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.performance.mob.TakoMethodCostTracker$flush$1", f = "TakoMethodCostTracker.kt", l = {}, m = "invokeSuspend")
public final class C01SU extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ LinkedHashMap<String, Long> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01SU(LinkedHashMap<String, Long> linkedHashMap, InterfaceC1364105Vn<? super C01SU> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = linkedHashMap;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C01SU(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TakoMethodCostTracker@88bc.flush$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C2344009Gk c2344009Gk = new C2344009Gk();
        for (Map.Entry<String, Long> entry : this.LL.entrySet()) {
            c2344009Gk.LIZLLL(entry.getValue().longValue(), entry.getKey());
        }
        C20684815ws.LJIILLIIL("tako_method_cost", c2344009Gk.LIZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TakoMethodCostTracker@88bc.flush$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
