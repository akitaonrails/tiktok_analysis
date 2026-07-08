package X;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: renamed from: X.094f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C23123094f<T, R> extends AbstractC23130094m<T, R> {
    public final InterfaceC1631620sYq<InterfaceC346701Wf<? super R>, T, InterfaceC1364105Vn<? super Unit>, Object> LLILLJJLI;

    @Override // X.AbstractC23130094m
    public final Object LJ(InterfaceC346701Wf<? super R> interfaceC346701Wf, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        Object objLJ = C2296808zG.LJ(new C23122094e(this, interfaceC346701Wf, null), interfaceC1364105Vn);
        if (objLJ == C099R.LJFF()) {
            return objLJ;
        }
        return Unit.LIZ;
    }

    @Override // X.AbstractC23133094p
    public final AbstractC23133094p<R> create(CoroutineContext coroutineContext, int i, EnumC2252401DDy enumC2252401DDy) {
        return new C23123094f(this.LLILLJJLI, this.LL, coroutineContext, i, enumC2252401DDy);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C23123094f(InterfaceC1631620sYq<? super InterfaceC346701Wf<? super R>, ? super T, ? super InterfaceC1364105Vn<? super Unit>, ? extends Object> interfaceC1631620sYq, InterfaceC346201Wa<? extends T> interfaceC346201Wa, CoroutineContext coroutineContext, int i, EnumC2252401DDy enumC2252401DDy) {
        super(i, coroutineContext, enumC2252401DDy, interfaceC346201Wa);
        this.LLILLJJLI = interfaceC1631620sYq;
    }
}
