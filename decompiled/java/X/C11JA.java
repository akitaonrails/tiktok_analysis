package X;

import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.11JA, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11JA<T, U> extends AtomicReference<InterfaceC420801kM> implements C11IH<Object> {
    public static final long serialVersionUID = 8663801314800248617L;
    public final C11J9<T, U> LL;

    @Override // X.C11IH
    public final void onComplete() {
        C11J9<T, U> c11j9 = this.LL;
        c11j9.getClass();
        if (C11JE.dispose(c11j9)) {
            C11ID<? extends T> c11id = c11j9.LLILLL;
            if (c11id == null) {
                c11j9.LL.onError(new TimeoutException());
            } else {
                c11id.LIZ(c11j9.LLILZ);
            }
        }
    }

    public C11JA(C11J9<T, U> c11j9) {
        this.LL = c11j9;
    }

    @Override // X.C11IH
    public final void onError(Throwable th) {
        C11J9<T, U> c11j9 = this.LL;
        c11j9.getClass();
        if (C11JE.dispose(c11j9)) {
            c11j9.LL.onError(th);
        } else {
            C19489211Ms.LIZIZ(th);
        }
    }

    @Override // X.C11IH
    public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
        C11JE.setOnce(this, interfaceC420801kM);
    }

    @Override // X.C11IH
    public final void onSuccess(Object obj) {
        C11J9<T, U> c11j9 = this.LL;
        c11j9.getClass();
        if (C11JE.dispose(c11j9)) {
            C11ID<? extends T> c11id = c11j9.LLILLL;
            if (c11id == null) {
                c11j9.LL.onError(new TimeoutException());
            } else {
                c11id.LIZ(c11j9.LLILZ);
            }
        }
    }
}
