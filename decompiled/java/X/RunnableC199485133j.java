package X;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: renamed from: X.133j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class RunnableC199485133j<V> implements Runnable {
    public final AbstractC199488133m<V> LL;
    public final ListenableFuture<? extends V> LLILLJJLI;

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("AbstractFuture$SetFuture@dafd.run");
        try {
            if (this.LL.value == this) {
                if (AbstractC199488133m.LLILLL.LIZIZ(this.LL, this, AbstractC199488133m.LJIIIZ(this.LLILLJJLI))) {
                    AbstractC199488133m.LJ(this.LL);
                }
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AbstractFuture$SetFuture@dafd.run");
    }

    public RunnableC199485133j(AbstractC199488133m<V> abstractC199488133m, ListenableFuture<? extends V> listenableFuture) {
        this.LL = abstractC199488133m;
        this.LLILLJJLI = listenableFuture;
    }
}
