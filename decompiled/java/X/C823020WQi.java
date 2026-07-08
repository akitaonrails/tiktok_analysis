package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0WQi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C823020WQi {
    public static int LIZ;
    public static volatile boolean LIZIZ;
    public static final ThreadLocal<Integer> LIZJ;

    static {
        ThreadLocal<Integer> threadLocal = new ThreadLocal<>();
        LIZJ = threadLocal;
        threadLocal.set(0);
    }

    public static void LIZ() {
        if (!LIZIZ) {
            LIZJ.set(num);
            return;
        }
        try {
            ThreadLocal<Integer> threadLocal = LIZJ;
            Integer num = threadLocal.get();
            num = num != null ? num : 0;
            if (num.intValue() < 10) {
                Thread.sleep(300L);
            } else {
                LIZIZ = false;
            }
            num.intValue();
            threadLocal.set(num);
        } catch (InterruptedException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
