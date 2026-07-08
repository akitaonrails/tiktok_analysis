package X;

import com.bytedance.android.starship.engine.graph.foundation.Packet;
import com.bytedance.android.starship.engine.graph.foundation.Task;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0k5j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
@C09DV(c = "com.bytedance.android.starship.strategy.graph.StrategyGraphContainer$registerStrategyCallback$job$1$1$2", f = "StrategyGraphContainer.kt", l = {}, m = "invokeSuspend")
public final class C1306050k5j extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Function1<C1306060k5k, Unit> LL;
    public final /* synthetic */ Task.Output LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1306050k5j(Function1<? super C1306060k5k, Unit> function1, Task.Output output, InterfaceC1364105Vn<? super C1306050k5j> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = function1;
        this.LLILLJJLI = output;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1306050k5j(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        C1C7U.LIZ("StrategyGraphContainer@a2bb.registerStrategyCallback$job$1$1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Function1<C1306060k5k, Unit> function1 = this.LL;
        C1306060k5k c1306060k5k = new C1306060k5k();
        Task.Output output = this.LLILLJJLI;
        Packet packet = (Packet) C13LP.LJJJLL(output.packets);
        String message = null;
        if (packet != null) {
            obj2 = packet.data;
        } else {
            obj2 = null;
        }
        c1306060k5k.LIZ = obj2;
        c1306060k5k.LIZJ = output.extra;
        Throwable th = output.LIZ;
        if (th != null) {
            message = th.getMessage();
        }
        c1306060k5k.LIZIZ = message;
        c1306060k5k.LIZLLL = output.deliveryId;
        function1.invoke(c1306060k5k);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StrategyGraphContainer@a2bb.registerStrategyCallback$job$1$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
