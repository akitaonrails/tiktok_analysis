package X;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: X.0WcN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C827010WcN {
    public static boolean LIZ;
    public static final Lock LIZIZ;
    public static final Condition LIZJ;
    public static Integer LIZLLL;

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        LIZIZ = reentrantLock;
        LIZJ = reentrantLock.newCondition();
    }

    public static int LIZ() {
        if (LIZLLL == null) {
            LIZLLL = Integer.valueOf(C0C64.LJIILLIIL().LJIJ(31744, -1, "optimize_commonparams", true));
        }
        return LIZLLL.intValue();
    }
}
