package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01tf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.livesdk.impl.revenue.strategy.panel.rechargeconsumption.consumption.ConsumptionTaskContainerAssem$initTouchPointLayout$2$1$1", f = "ConsumptionTaskContainerAssem.kt", l = {}, m = "invokeSuspend")
public final class C478501tf extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ ViewOnAttachStateChangeListenerC20604515jv LL;
    public final /* synthetic */ List<InterfaceC1891350zJl> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C478501tf(ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv, List<? extends InterfaceC1891350zJl> list, InterfaceC1364105Vn<? super C478501tf> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = viewOnAttachStateChangeListenerC20604515jv;
        this.LLILLJJLI = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C478501tf(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ConsumptionTaskContainerAssem@9187.initTouchPointLayout$2$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.getState().LJIILL(this.LLILLJJLI, null);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ConsumptionTaskContainerAssem@9187.initTouchPointLayout$2$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
