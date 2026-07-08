package X;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.11Ma, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19487411Ma extends AtomicReference<InterfaceC420801kM> implements C11IY, InterfaceC420801kM {
    public static final long serialVersionUID = 8606673141535671828L;
    public final /* synthetic */ C11MY LL;

    @Override // X.C11IY
    public final void onComplete() {
        C11MY c11my = this.LL;
        c11my.LLILZIL.LIZIZ(this);
        c11my.onComplete();
    }

    @Override // X.InterfaceC420801kM
    public final boolean isDisposed() {
        return C11JE.isDisposed(get());
    }

    @Override // X.InterfaceC420801kM
    public final void dispose() {
        C11JE.dispose(this);
    }

    public C19487411Ma(C11MY c11my) {
        this.LL = c11my;
    }

    @Override // X.C11IY
    public final void onError(Throwable th) {
        C11MY c11my = this.LL;
        c11my.LLILZIL.LIZIZ(this);
        c11my.onError(th);
    }

    @Override // X.C11IY
    public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
        C11JE.setOnce(this, interfaceC420801kM);
    }
}
