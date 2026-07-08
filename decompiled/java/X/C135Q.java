package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: renamed from: X.135Q, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C135Q<V> implements Runnable {
    public final Future<V> LL;
    public final C11U6<? super V> LLILLJJLI;

    public final void LIZ() {
        Throwable thLIZ;
        Future<V> future = this.LL;
        if ((future instanceof AnonymousClass1343) && (thLIZ = ((AnonymousClass1343) future).LIZ()) != null) {
            this.LLILLJJLI.onFailure(thLIZ);
            return;
        }
        try {
            Future<V> future2 = this.LL;
            C19864312np.LJIIL(future2, "Future was expected to be done: %s", future2.isDone());
            this.LLILLJJLI.onSuccess(C23184096o.LIZ(future2));
        } catch (Error e) {
            e = e;
            TryCatchGuardChecker.doCheck(e);
            this.LLILLJJLI.onFailure(e);
        } catch (RuntimeException e2) {
            e = e2;
            TryCatchGuardChecker.doCheck(e);
            this.LLILLJJLI.onFailure(e);
        } catch (ExecutionException e3) {
            TryCatchGuardChecker.doCheck(e3);
            this.LLILLJJLI.onFailure(e3.getCause());
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("Futures$CallbackListener@60d0.run");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("Futures$CallbackListener@60d0.run");
    }

    public final String toString() {
        C135T c135tLIZIZ = C135U.LIZIZ(this);
        C11U6<? super V> c11u6 = this.LLILLJJLI;
        C135R c135r = new C135R();
        c135tLIZIZ.LIZJ.LIZJ = c135r;
        c135tLIZIZ.LIZJ = c135r;
        c135r.LIZIZ = c11u6;
        return c135tLIZIZ.toString();
    }

    public C135Q(Future<V> future, C11U6<? super V> c11u6) {
        this.LL = future;
        this.LLILLJJLI = c11u6;
    }
}
