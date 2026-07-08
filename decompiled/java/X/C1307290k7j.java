package X;

import com.bytedance.android.starship.engine.graph.foundation.Task;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS564S0100000_20;
import njp.a;

/* JADX INFO: renamed from: X.0k7j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
@C09DV(c = "com.bytedance.android.starship.engine.graph.scheduling.SerialScheduler$schedule$1", f = "SerialScheduler.kt", l = {}, m = "invokeSuspend")
public final class C1307290k7j extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Task LL;
    public final /* synthetic */ C1307280k7i LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1307290k7j(Task task, C1307280k7i c1307280k7i, InterfaceC1364105Vn<? super C1307290k7j> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = task;
        this.LLILLJJLI = c1307280k7i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1307290k7j(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SerialScheduler@9e09.schedule$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Task task = this.LL;
        task.LLILLL = EnumC1307350k7p.PENDING;
        this.LLILLJJLI.LJIIIIZZ.add(task);
        this.LLILLJJLI.LJIIIZ.release();
        C1306430k6L.LIZ(new AwS564S0100000_20(this.LL, 41));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SerialScheduler@9e09.schedule$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
