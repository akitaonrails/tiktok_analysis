package X;

import kotlin.coroutines.CoroutineContext;

/* JADX INFO: renamed from: X.099Y, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C099Y<T> implements InterfaceC1364105Vn<T>, InterfaceC23256099i {
    public final InterfaceC1364105Vn<T> LL;
    public final CoroutineContext LLILLJJLI;

    @Override // X.InterfaceC23256099i
    public final InterfaceC23256099i getCallerFrame() {
        InterfaceC1364105Vn<T> interfaceC1364105Vn = this.LL;
        if (interfaceC1364105Vn instanceof InterfaceC23256099i) {
            return (InterfaceC23256099i) interfaceC1364105Vn;
        }
        return null;
    }

    @Override // X.InterfaceC1364105Vn
    public final CoroutineContext getContext() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC1364105Vn
    public final void resumeWith(Object obj) {
        this.LL.resumeWith(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C099Y(InterfaceC1364105Vn<? super T> interfaceC1364105Vn, CoroutineContext coroutineContext) {
        this.LL = interfaceC1364105Vn;
        this.LLILLJJLI = coroutineContext;
    }
}
