package X;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.11Md, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19487711Md extends AtomicReference<Throwable> {
    public static final long serialVersionUID = 3949248817947090603L;

    public Throwable terminate() {
        C11NG c11ng = C11QG.LIZ;
        Throwable th = get();
        C11NG c11ng2 = C11QG.LIZ;
        return th != c11ng2 ? getAndSet(c11ng2) : th;
    }

    public boolean isTerminated() {
        return get() == C11QG.LIZ;
    }

    public boolean addThrowable(Throwable th) {
        Throwable c0vya;
        C11NG c11ng = C11QG.LIZ;
        while (true) {
            Throwable th2 = get();
            if (th2 == C11QG.LIZ) {
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
