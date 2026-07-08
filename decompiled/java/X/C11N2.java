package X;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.11N2, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public abstract class C11N2<T> implements InterfaceC626120Oh8<T>, InterfaceC420801kM {
    public final AtomicReference<InterfaceC420801kM> LL = new AtomicReference<>();

    @Override // X.InterfaceC420801kM
    public final void dispose() {
        C11JE.dispose(this.LL);
    }

    @Override // X.InterfaceC420801kM
    public final boolean isDisposed() {
        return this.LL.get() == C11JE.DISPOSED;
    }

    @Override // X.InterfaceC626120Oh8
    public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
        C19489611Mw.LIZIZ(this.LL, interfaceC420801kM, getClass());
    }
}
