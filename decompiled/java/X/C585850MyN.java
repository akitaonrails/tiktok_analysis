package X;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.0MyN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C585850MyN {
    public static final long LIZ = System.currentTimeMillis();
    public static final AtomicBoolean LIZIZ = new AtomicBoolean(false);

    public static boolean LIZ() {
        AtomicBoolean atomicBoolean = LIZIZ;
        if (!atomicBoolean.get()) {
            atomicBoolean.set(C0CN5.LJII() || System.currentTimeMillis() - LIZ > 8000);
            if (!atomicBoolean.get()) {
                return false;
            }
        }
        return true;
    }
}
