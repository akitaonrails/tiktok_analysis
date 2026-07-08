package X;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.11Lx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19487111Lx extends AtomicReference<InterfaceC420801kM> implements C11IY, InterfaceC420801kM {
    public static final long serialVersionUID = -7545121636549663526L;

    public boolean hasCustomOnError() {
        return false;
    }

    @Override // X.C11IY
    public void onComplete() {
        lazySet(C11JE.DISPOSED);
    }

    @Override // X.InterfaceC420801kM
    public boolean isDisposed() {
        return get() == C11JE.DISPOSED;
    }

    @Override // X.InterfaceC420801kM
    public void dispose() {
        C11JE.dispose(this);
    }

    @Override // X.C11IY
    public void onError(Throwable th) {
        lazySet(C11JE.DISPOSED);
        C19489211Ms.LIZIZ(new C1324280kZ8(th));
    }

    @Override // X.C11IY
    public void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
        C11JE.setOnce(this, interfaceC420801kM);
    }
}
