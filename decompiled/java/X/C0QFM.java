package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: X.0QFM, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QFM {
    public static final C0QFM LIZ = new C0QFM();
    public static final ReentrantLock LIZIZ = new ReentrantLock();
    public static final C01GW LIZJ = C452501pT.LIZIZ(new C0QFP());

    public static C0QFQ LIZ(C0QFL c0qfl) {
        ReentrantLock reentrantLock = LIZIZ;
        reentrantLock.lock();
        try {
            LIZ.getClass();
            C0QFQ c0qfq = (C0QFQ) ((Map) LIZJ.getValue()).get(LIZIZ(c0qfl));
            reentrantLock.unlock();
            return c0qfq;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            reentrantLock.unlock();
            throw th;
        }
    }

    public static String LIZIZ(C0QFL c0qfl) {
        Object objValueOf;
        Object obj;
        WeakReference<?> host = c0qfl.getHost();
        if (host != null && (obj = host.get()) != null) {
            objValueOf = Integer.valueOf(obj.hashCode());
        } else {
            objValueOf = "null";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(objValueOf);
        sbLIZ.append('_');
        sbLIZ.append(c0qfl.getPageInfo().LIZIZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
