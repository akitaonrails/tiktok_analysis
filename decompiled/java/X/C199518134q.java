package X;

import java.lang.ref.WeakReference;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.134q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C199518134q implements InterfaceFutureC1488980oqm {
    public final WeakReference LL;
    public final C199519134r LLILLJJLI = new C134X(this) { // from class: X.134r
        public final /* synthetic */ C199518134q LLIZLLLIL;

        @Override // X.C134X
        public final String LIZ() {
            C199520134s c199520134s = (C199520134s) this.LLIZLLLIL.LL.get();
            if (c199520134s == null) {
                return "Completer object has been garbage collected, future will fail soon";
            }
            String strValueOf = String.valueOf(c199520134s.LIZ);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("tag=[");
            sbLIZ.append(strValueOf);
            sbLIZ.append(e3.f);
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        {
            Objects.requireNonNull(this);
            this.LLIZLLLIL = this;
        }
    };

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.LLILLJJLI.LL instanceof C199517134p;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return isDone();
    }

    public final String toString() {
        return toString();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.134r] */
    public C199518134q(C199520134s c199520134s) {
        this.LL = new WeakReference(c199520134s);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        C199520134s c199520134s = (C199520134s) this.LL.get();
        boolean zCancel = cancel(z);
        if (zCancel && c199520134s != null) {
            c199520134s.LIZ = null;
            c199520134s.LIZIZ = null;
            c199520134s.LIZJ.LJII(null);
            return true;
        }
        return zCancel;
    }

    @Override // X.InterfaceFutureC1488980oqm
    public final void LJFF(Runnable runnable, Executor executor) {
        LJFF(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return get(j, timeUnit);
    }
}
