package X;

import Y.ARunnableS120S0100000_20;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;

/* JADX INFO: renamed from: X.0jj7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1292030jj7<T> {
    public static final Executor LJ = C807400Vlq.LIZ();
    public final Set<InterfaceC1292040jj8<T>> LIZ;
    public final Set<InterfaceC1292040jj8<Throwable>> LIZIZ;
    public final BPEAHandler LIZJ;
    public volatile C1292000jj4<T> LIZLLL;

    public C1292030jj7() {
        throw null;
    }

    public final synchronized void LJFF(Object obj) {
        LJ(this, obj);
    }

    public final synchronized void LIZ(InterfaceC1292040jj8 interfaceC1292040jj8) {
        Throwable th;
        C1292000jj4<T> c1292000jj4 = this.LIZLLL;
        if (c1292000jj4 != null && (th = c1292000jj4.LIZIZ) != null) {
            interfaceC1292040jj8.onResult(th);
        }
        this.LIZIZ.add(interfaceC1292040jj8);
    }

    public final synchronized void LIZIZ(InterfaceC1292040jj8 interfaceC1292040jj8) {
        T t;
        C1292000jj4<T> c1292000jj4 = this.LIZLLL;
        if (c1292000jj4 != null && (t = c1292000jj4.LIZ) != null) {
            interfaceC1292040jj8.onResult(t);
        }
        this.LIZ.add(interfaceC1292040jj8);
    }

    public final synchronized void LIZJ(Throwable th) {
        ArrayList arrayList = new ArrayList(this.LIZIZ);
        if (arrayList.isEmpty()) {
            C1292050jj9.LIZJ("Lottie encountered an error but no failure listener was added:", th);
            return;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((InterfaceC1292040jj8) it2.next()).onResult(th);
        }
    }

    public final synchronized void LIZLLL(T t) {
        Iterator it2 = new ArrayList(this.LIZ).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1292040jj8) it2.next()).onResult(t);
        }
    }

    public final synchronized void LJI(InterfaceC1292040jj8 interfaceC1292040jj8) {
        this.LIZIZ.remove(interfaceC1292040jj8);
    }

    public final synchronized void LJII(InterfaceC1292040jj8 interfaceC1292040jj8) {
        this.LIZ.remove(interfaceC1292040jj8);
    }

    public final void LJIIIIZZ(C1292000jj4<T> c1292000jj4) {
        if (this.LIZLLL == null) {
            this.LIZLLL = c1292000jj4;
            C786410Ut5.LJJZZIII(this.LIZJ, new ARunnableS120S0100000_20(this, 24));
            return;
        }
        throw new IllegalStateException("A task may only be set once.");
    }

    public C1292030jj7(final Callable<C1292000jj4<T>> callable, boolean z) {
        this.LIZ = new LinkedHashSet(1);
        this.LIZIZ = new LinkedHashSet(1);
        this.LIZJ = new BPEAHandler(Looper.getMainLooper());
        this.LIZLLL = null;
        if (z) {
            try {
                LJIIIIZZ(callable.call());
                return;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                LJIIIIZZ(new C1292000jj4<>(th));
                return;
            }
        }
        LJ.execute(new FutureTask<C1292000jj4<T>>(callable) { // from class: X.0jj6
            @Override // java.util.concurrent.FutureTask
            public final void done() {
                if (isCancelled()) {
                    return;
                }
                try {
                    this.LL.LJIIIIZZ(get());
                } catch (InterruptedException | ExecutionException e) {
                    TryCatchGuardChecker.doCheck(e);
                    this.LL.LJIIIIZZ(new C1292000jj4<>(e));
                }
            }
        });
    }

    public static void LJ(C1292030jj7 c1292030jj7, Object obj) {
        synchronized (c1292030jj7) {
            try {
                c1292030jj7.LIZLLL(obj);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
