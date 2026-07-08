package X;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: renamed from: X.134O, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C134O<V> implements Runnable {
    public final C134M<V> LL;
    public final ListenableFuture<? extends V> LLILLJJLI;

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        try {
            if (this.LL.LL == this) {
                if (C134M.LLILZLL.LIZIZ(this.LL, this, C134M.LJ(this.LLILLJJLI))) {
                    C134M.LIZIZ(this.LL);
                }
            }
        } finally {
            if (!zLIZ) {
            }
        }
    }

    public C134O(C134M<V> c134m, ListenableFuture<? extends V> listenableFuture) {
        this.LL = c134m;
        this.LLILLJJLI = listenableFuture;
    }
}
