package X;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: X.1DEI, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DEI<T> extends C1DEK<T> implements InterfaceC626120Oh8<T>, C11IH<T> {
    public static final AtomicReferenceFieldUpdater LLJILJILJ = AtomicReferenceFieldUpdater.newUpdater(C1DEI.class, Object.class, "_subscription");
    public volatile Object _subscription;

    public C1DEI() {
        super(Integer.MAX_VALUE, null);
    }

    @Override // X.InterfaceC626120Oh8
    public final void onComplete() {
        LJIIJJI(null);
    }

    @Override // X.C1DEK
    public final void LJJIIZ() {
        InterfaceC420801kM interfaceC420801kM = (InterfaceC420801kM) LLJILJILJ.getAndSet(this, null);
        if (interfaceC420801kM != null) {
            interfaceC420801kM.dispose();
        }
    }

    @Override // X.InterfaceC626120Oh8
    public final void onError(Throwable th) {
        LJIIJJI(th);
    }

    @Override // X.InterfaceC626120Oh8
    public final void onNext(T t) {
        LJIIIIZZ(t);
    }

    @Override // X.InterfaceC626120Oh8
    public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
        LLJILJILJ.set(this, interfaceC420801kM);
    }

    @Override // X.C11IH
    public final void onSuccess(T t) {
        LJIIIIZZ(t);
        LJIIJJI(null);
    }
}
