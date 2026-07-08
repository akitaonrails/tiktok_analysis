package X;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.11Ow, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19494811Ow<U> extends AtomicReference<InterfaceC420801kM> implements InterfaceC626120Oh8<U> {
    public static final long serialVersionUID = -7449079488798789337L;
    public final InterfaceC626120Oh8<? super U> LL;
    public final C19494511Ot<?, ?> LLILLJJLI;

    @Override // X.InterfaceC626120Oh8
    public final void onComplete() {
        C19494511Ot<?, ?> c19494511Ot = this.LLILLJJLI;
        c19494511Ot.LLIZ = false;
        c19494511Ot.LIZ();
    }

    @Override // X.InterfaceC626120Oh8
    public final void onError(Throwable th) {
        this.LLILLJJLI.dispose();
        this.LL.onError(th);
    }

    @Override // X.InterfaceC626120Oh8
    public final void onNext(U u) {
        this.LL.onNext(u);
    }

    @Override // X.InterfaceC626120Oh8
    public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
        C11JE.replace(this, interfaceC420801kM);
    }

    public C19494811Ow(C11PI c11pi, C19494511Ot c19494511Ot) {
        this.LL = c11pi;
        this.LLILLJJLI = c19494511Ot;
    }
}
