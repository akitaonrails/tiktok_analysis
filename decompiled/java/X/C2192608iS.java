package X;

import java.io.Closeable;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: renamed from: X.08iS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2192608iS implements Closeable, InterfaceC497601wk {
    public final CoroutineContext LL;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C23118094a.LIZJ(this.LL, null);
    }

    @Override // X.InterfaceC497601wk
    public final CoroutineContext getCoroutineContext() {
        return this.LL;
    }

    public C2192608iS(CoroutineContext coroutineContext) {
        this.LL = coroutineContext;
    }
}
