package X;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.0NUx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C594890NUx {
    public final AtomicReference<C594900NUy> LIZ = new AtomicReference<>(null);
    public final C1DEV LIZIZ = C2191201ApK.LIZ();

    public static final void LIZ(C594890NUx c594890NUx, C594900NUy c594900NUy) {
        while (true) {
            C594900NUy c594900NUy2 = c594890NUx.LIZ.get();
            if (c594900NUy2 != null && c594900NUy.LIZ.compareTo(c594900NUy2.LIZ) < 0) {
                throw new CancellationException("Current mutation had a higher priority");
            }
            AtomicReference<C594900NUy> atomicReference = c594890NUx.LIZ;
            while (!atomicReference.compareAndSet(c594900NUy2, c594900NUy)) {
                if (atomicReference.get() != c594900NUy2) {
                    break;
                }
            }
            if (c594900NUy2 != null) {
                c594900NUy2.LIZIZ.LIZIZ(new CancellationException() { // from class: X.05bP
                    public static final int $stable = 0;

                    @Override // java.lang.Throwable
                    public Throwable fillInStackTrace() {
                        setStackTrace(new StackTraceElement[0]);
                        return this;
                    }
                });
                return;
            }
            return;
        }
    }
}
