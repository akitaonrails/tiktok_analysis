package X;

import Y.AgS72S0400000_3;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.094i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C23126094i<T> extends AbstractC23133094p<T> {
    public final InterfaceC346201Wa<InterfaceC346201Wa<T>> LL;
    public final int LLILLJJLI;

    @Override // X.AbstractC23133094p
    public final String additionalToStringProps() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("concurrency=");
        sbLIZ.append(this.LLILLJJLI);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

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
        C1DEU c1deuLIZ = C2252461DEe.LIZ(this.LLILLJJLI);
        C094X c094x = new C094X(c094d);
        Object objCollect = this.LL.collect(new AgS72S0400000_3((C09AE) interfaceC1364105Vn.getContext().get(C09AE.LJJLJ), c1deuLIZ, c094d, c094x, 1), interfaceC1364105Vn);
        if (objCollect == C099R.LJFF()) {
            return objCollect;
        }
        return Unit.LIZ;
    }

    @Override // X.AbstractC23133094p
    public final AbstractC23133094p<T> create(CoroutineContext coroutineContext, int i, EnumC2252401DDy enumC2252401DDy) {
        return new C23126094i(this.LL, this.LLILLJJLI, coroutineContext, i, enumC2252401DDy);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C23126094i(InterfaceC346201Wa<? extends InterfaceC346201Wa<? extends T>> interfaceC346201Wa, int i, CoroutineContext coroutineContext, int i2, EnumC2252401DDy enumC2252401DDy) {
        super(coroutineContext, i2, enumC2252401DDy);
        this.LL = interfaceC346201Wa;
        this.LLILLJJLI = i;
    }
}
