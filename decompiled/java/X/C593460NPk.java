package X;

import com.ss.android.ugc.aweme.plugin.realtimedecision.RealtimeDecisionInterceptor;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NPk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.plugin.realtimedecision.RealtimeDecisionInterceptor$reportTask$1$run$1", f = "RealtimeDecisionInterceptor.kt", l = {}, m = "invokeSuspend")
public final class C593460NPk extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ RealtimeDecisionInterceptor LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C593460NPk(RealtimeDecisionInterceptor realtimeDecisionInterceptor, InterfaceC1364105Vn<? super C593460NPk> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = realtimeDecisionInterceptor;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C593460NPk(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RealtimeDecisionInterceptor@7dd8.reportTask$1$run$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL.LIZJ.isEmpty()) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("RealtimeDecisionInterceptor@7dd8.reportTask$1$run$1");
            return unit;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.LL.LIZJ);
        this.LL.LIZJ(new RealtimeDecisionInterceptor.NewUserEvents.NewUserEventsRequest(C2286608xc.LJ(((Number) this.LL.LIZIZ.getValue()).intValue()), arrayList));
        this.LL.LIZJ.clear();
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("RealtimeDecisionInterceptor@7dd8.reportTask$1$run$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
