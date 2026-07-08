package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0WcS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C827060WcS {
    public static int LIZ;
    public static final ReentrantLock LIZIZ;
    public static final Condition LIZJ;
    public static final List<String> LIZLLL;
    public static volatile boolean LJ;
    public static final C01GW LJFF;

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        LIZIZ = reentrantLock;
        LIZJ = reentrantLock.newCondition();
        LIZLLL = Collections.synchronizedList(new ArrayList());
        LJFF = C452501pT.LIZIZ(new C303640BvG());
    }

    public static void LIZ(String str) {
        List list = (List) LJFF.getValue();
        if (list == null || list.isEmpty() || LJ) {
            return;
        }
        ReentrantLock reentrantLock = LIZIZ;
        reentrantLock.lock();
        while (LIZ < list.size() && !Intrinsics.LJFF(list.get(LIZ), str)) {
            try {
                LIZJ.await();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                reentrantLock.unlock();
                throw th;
            }
        }
        int i = LIZ + 1;
        LIZ = i;
        if (i >= list.size()) {
            LJ = true;
            LIZJ.signalAll();
        }
        reentrantLock.unlock();
    }
}
