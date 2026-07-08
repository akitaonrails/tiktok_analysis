package X;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05C7, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.bytedance.ies.im.core.core.GlobalMsgObserverDispatcher$notifyObservers$1", f = "GlobalMsgObserverDispatcher.kt", l = {}, m = "invokeSuspend")
public final class C05C7 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1DW5 LL;
    public final /* synthetic */ Function1<C1DW6, Unit> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C05C7(C1DW5 c1dw5, Function1<? super C1DW6, Unit> function1, InterfaceC1364105Vn<? super C05C7> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1dw5;
        this.LLILLJJLI = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05C7(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GlobalMsgObserverDispatcher@cfc6.notifyObservers$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) this.LL.LLILLJJLI.getValue();
        Function1<C1DW6, Unit> function1 = this.LLILLJJLI;
        Iterator it2 = copyOnWriteArraySet.iterator();
        while (it2.hasNext()) {
            function1.invoke((C1DW6) it2.next());
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("GlobalMsgObserverDispatcher@cfc6.notifyObservers$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
