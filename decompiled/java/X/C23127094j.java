package X;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.094j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C23127094j<T> extends AbstractC23133094p<T> {
    public final Iterable<InterfaceC346201Wa<T>> LL;

    @Override // X.AbstractC23133094p
    public final AnonymousClass0954<T> produceImpl(InterfaceC497601wk interfaceC497601wk) {
        CoroutineContext coroutineContext = this.context;
        int i = this.capacity;
        Function2<C094D<? super T>, InterfaceC1364105Vn<? super Unit>, Object> collectToFun$kotlinx_coroutines_core = getCollectToFun$kotlinx_coroutines_core();
        EnumC2252401DDy enumC2252401DDy = EnumC2252401DDy.SUSPEND;
        C099V c099v = C099V.DEFAULT;
        AnonymousClass0952 anonymousClass0952 = new AnonymousClass0952(C23252099e.LIZIZ(interfaceC497601wk, coroutineContext), C095G.LIZ(i, enumC2252401DDy, 4));
        c099v.invoke(collectToFun$kotlinx_coroutines_core, anonymousClass0952, anonymousClass0952);
        return anonymousClass0952;
    }

    @Override // X.AbstractC23133094p
    public final Object collectTo(C094D<? super T> c094d, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        C094X c094x = new C094X(c094d);
        Iterator<InterfaceC346201Wa<T>> it2 = this.LL.iterator();
        while (it2.hasNext()) {
            C23250099c.LIZLLL(c094d, null, null, new C415201jS(it2.next(), c094x, null), 3);
        }
        return Unit.LIZ;
    }

    @Override // X.AbstractC23133094p
    public final AbstractC23133094p<T> create(CoroutineContext coroutineContext, int i, EnumC2252401DDy enumC2252401DDy) {
        return new C23127094j(this.LL, coroutineContext, i, enumC2252401DDy);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C23127094j(Iterable<? extends InterfaceC346201Wa<? extends T>> iterable, CoroutineContext coroutineContext, int i, EnumC2252401DDy enumC2252401DDy) {
        super(coroutineContext, i, enumC2252401DDy);
        this.LL = iterable;
    }
}
