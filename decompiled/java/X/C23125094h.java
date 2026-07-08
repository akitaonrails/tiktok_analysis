package X;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: renamed from: X.094h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C23125094h<T> extends AbstractC23130094m<T, T> {
    @Override // X.AbstractC23133094p
    public final InterfaceC346201Wa<T> dropChannelOperators() {
        return (InterfaceC346201Wa<T>) this.LL;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // X.AbstractC23130094m
    public final Object LJ(InterfaceC346701Wf<? super T> interfaceC346701Wf, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        Object objCollect = this.LL.collect((InterfaceC346701Wf<? super S>) interfaceC346701Wf, interfaceC1364105Vn);
        if (objCollect == C099R.LJFF()) {
            return objCollect;
        }
        return Unit.LIZ;
    }

    @Override // X.AbstractC23133094p
    public final AbstractC23133094p<T> create(CoroutineContext coroutineContext, int i, EnumC2252401DDy enumC2252401DDy) {
        return new C23125094h(i, coroutineContext, enumC2252401DDy, this.LL);
    }

    public C23125094h(int i, CoroutineContext coroutineContext, EnumC2252401DDy enumC2252401DDy, InterfaceC346201Wa interfaceC346201Wa) {
        super(i, coroutineContext, enumC2252401DDy, interfaceC346201Wa);
    }

    public C23125094h(InterfaceC346201Wa interfaceC346201Wa, AbstractC2252651DEx abstractC2252651DEx, int i, EnumC2252401DDy enumC2252401DDy, int i2) {
        super((i2 & 4) != 0 ? -3 : i, (i2 & 2) != 0 ? C23271099x.INSTANCE : abstractC2252651DEx, (i2 & 8) != 0 ? EnumC2252401DDy.SUSPEND : enumC2252401DDy, interfaceC346201Wa);
    }
}
