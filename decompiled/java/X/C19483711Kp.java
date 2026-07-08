package X;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.11Kp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19483711Kp<T> extends AtomicReference<InterfaceC420801kM> implements C11IH<T>, InterfaceC420801kM {
    public static final long serialVersionUID = 8571289934935992137L;
    public final C19484811La LL = new C19484811La();
    public final C11IH<? super T> LLILLJJLI;

    @Override // X.C11IH
    public final void onComplete() {
        this.LLILLJJLI.onComplete();
    }

    @Override // X.InterfaceC420801kM
    public final void dispose() {
        C11JE.dispose(this);
        this.LL.dispose();
    }

    @Override // X.InterfaceC420801kM
    public final boolean isDisposed() {
        return C11JE.isDisposed(get());
    }

    public C19483711Kp(C11IH<? super T> c11ih) {
        this.LLILLJJLI = c11ih;
    }

    @Override // X.C11IH
    public final void onError(Throwable th) {
        this.LLILLJJLI.onError(th);
    }

    @Override // X.C11IH
    public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
        C11JE.setOnce(this, interfaceC420801kM);
    }

    @Override // X.C11IH
    public final void onSuccess(T t) {
        this.LLILLJJLI.onSuccess(t);
    }
}
