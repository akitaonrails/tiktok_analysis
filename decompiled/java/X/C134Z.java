package X;

import com.google.common.util.concurrent.ListenableFuture;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.134Z, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C134Z<T> implements ListenableFuture<T> {
    public final WeakReference<C199502134a<T>> LL;
    public final C199505134d LLILLJJLI = new C134Y<T>() { // from class: X.134d
        @Override // X.C134Y
        public final String LJI() {
            C199502134a<T> c199502134a = this.LLIZLLLIL.LL.get();
            if (c199502134a == null) {
                return "Completer object has been garbage collected, future will fail soon";
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("tag=[");
            sbLIZ.append(c199502134a.LIZ);
            sbLIZ.append(e3.f);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
    };

    @Override // java.util.concurrent.Future
    public final T get() {
        return get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.LLILLJJLI.LL instanceof C199516134o;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return isDone();
    }

    public final String toString() {
        return toString();
    }

    public C134Z(C199502134a<T> c199502134a) {
        this.LL = new WeakReference<>(c199502134a);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        C199502134a<T> c199502134a = this.LL.get();
        boolean zCancel = cancel(z);
        if (zCancel && c199502134a != null) {
            c199502134a.LIZ = null;
            c199502134a.LIZIZ = null;
            c199502134a.LIZJ.LJIIIIZZ(null);
        }
        return zCancel;
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void LJIIJJI(Runnable runnable, Executor executor) {
        LJIIJJI(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final T get(long j, TimeUnit timeUnit) {
        return get(j, timeUnit);
    }
}
