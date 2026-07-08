package X;

import kotlin.coroutines.CoroutineContext;

/* JADX INFO: renamed from: X.128a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C197058128a implements AutoCloseable, InterfaceC497601wk {
    public final CoroutineContext LL;

    @Override // java.lang.AutoCloseable
    public final void close() {
        C23118094a.LIZJ(this.LL, null);
    }

    @Override // X.InterfaceC497601wk
    public final CoroutineContext getCoroutineContext() {
        return this.LL;
    }

    public C197058128a(CoroutineContext coroutineContext) {
        this.LL = coroutineContext;
    }
}
