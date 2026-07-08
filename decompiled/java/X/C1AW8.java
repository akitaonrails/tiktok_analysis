package X;

import X.InterfaceC647710Par;
import com.lynx.tasm.base.TraceEvent;

/* JADX INFO: renamed from: X.1AW8, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public abstract class C1AW8<T extends InterfaceC647710Par> implements Runnable {
    public T LL;

    public abstract boolean LIZ();

    public abstract void LIZIZ(T t);

    public abstract void LIZJ();

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("LynxAsyncManager$LynxAsyncLoadRunnable@ae12.run");
        try {
            TraceEvent.LIZIZ("LynxAsyncLoadRunnable.run");
            LIZIZ(this.LL);
            TraceEvent.LJII("LynxAsyncLoadRunnable.run");
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LynxAsyncManager$LynxAsyncLoadRunnable@ae12.run");
    }
}
