package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.locks.LockSupport;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.134F, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C134F<V> extends AbstractC199492133q<V> implements RunnableFuture<V> {
    public volatile C134H LLILZLL;

    @Override // X.AbstractC199488133m
    public final void LIZJ() {
        C134H c134h;
        Object obj = this.value;
        if ((obj instanceof C199496133u) && ((C199496133u) obj).LIZ && (c134h = this.LLILZLL) != null) {
            C134J c134j = C134G.LLILLJJLI;
            C134J c134j2 = C134G.LL;
            Runnable runnable = (Runnable) c134h.get();
            if (runnable instanceof Thread) {
                C134I c134i = new C134I(c134h);
                c134i.LIZ(C786410Ut5.u3());
                if (c134h.compareAndSet(runnable, c134i)) {
                    try {
                        ((Thread) runnable).interrupt();
                        if (c134h.getAndSet(c134j2) == c134j) {
                            LockSupport.unpark((Thread) runnable);
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        if (c134h.getAndSet(c134j2) == c134j) {
                            LockSupport.unpark((Thread) runnable);
                        }
                        throw th;
                    }
                }
            }
        }
        this.LLILZLL = null;
    }

    @Override // X.AbstractC199488133m
    public final String LJIILIIL() {
        C134H c134h = this.LLILZLL;
        if (c134h == null) {
            return super.LJIILIIL();
        }
        String strValueOf = String.valueOf(c134h);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 7);
        sb.append("task=[");
        sb.append(strValueOf);
        sb.append(e3.f);
        return sb.toString();
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        C1C7U.LIZ("TrustedListenableFutureTask@4cad.run");
        C134H c134h = this.LLILZLL;
        if (c134h != null) {
            c134h.run();
        }
        this.LLILZLL = null;
        C1C7U.LIZIZ("TrustedListenableFutureTask@4cad.run");
    }

    public C134F(final Callable<V> callable) {
        this.LLILZLL = new C134G<V>(callable) { // from class: X.134H
            public final Callable<V> LLILLL;

            @Override // X.C134G
            public final boolean LIZJ() {
                return this.LLILZ.isDone();
            }

            @Override // X.C134G
            public final V LIZLLL() {
                return this.LLILLL.call();
            }

            @Override // X.C134G
            public final String LJ() {
                return this.LLILLL.toString();
            }

            @Override // X.C134G
            public final void LIZ(Throwable th) {
                this.LLILZ.LJIJ(th);
            }

            @Override // X.C134G
            public final void LIZIZ(V v) {
                this.LLILZ.LJIIZILJ(v);
            }

            {
                callable.getClass();
                this.LLILLL = callable;
            }
        };
    }
}
