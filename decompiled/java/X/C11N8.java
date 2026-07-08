package X;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.11N8, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11N8 extends AtomicReference<Throwable> {
    public static final long serialVersionUID = 3949248817947090603L;

    public final Throwable LIZIZ() {
        C11NF c11nf = C11NH.LIZ;
        Throwable th = get();
        C11NF c11nf2 = C11NH.LIZ;
        return th != c11nf2 ? getAndSet(c11nf2) : th;
    }

    public final boolean LIZ(Throwable th) {
        Throwable c0vya;
        C11NF c11nf = C11NH.LIZ;
        while (true) {
            Throwable th2 = get();
            if (th2 == C11NH.LIZ) {
                return false;
            }
            if (th2 == null) {
                c0vya = th;
            } else {
                c0vya = new C0VYA(th2, th);
            }
            while (!compareAndSet(th2, c0vya)) {
                if (get() != th2) {
                    break;
                }
            }
            return true;
        }
    }
}
