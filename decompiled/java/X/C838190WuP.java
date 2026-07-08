package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: X.0WuP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C838190WuP<TResult> {
    public static final ExecutorService LJFF;
    public static final ExecutorC838210WuR LJI;
    public final ReentrantLock LIZ;
    public final Condition LIZIZ;
    public boolean LIZJ;
    public TResult LIZLLL;
    public List<InterfaceC838240WuU<TResult, Void>> LJ;

    static {
        new Object() { // from class: X.0WuW
        };
        C838200WuQ c838200WuQ = C838200WuQ.LIZLLL;
        LJFF = c838200WuQ.LIZ;
        LJI = c838200WuQ.LIZJ;
        new C838190WuP((Object) null);
        new C838190WuP(Boolean.TRUE);
        new C838190WuP(Boolean.FALSE);
        new C838190WuP(0);
    }

    public final void LIZ() {
        ReentrantLock reentrantLock = this.LIZ;
        reentrantLock.lock();
        try {
            List<InterfaceC838240WuU<TResult, Void>> list = this.LJ;
            if (list != null) {
                Iterator it2 = ((ArrayList) list).iterator();
                while (it2.hasNext()) {
                    try {
                        try {
                            ((InterfaceC838240WuU) it2.next()).LIZ(this);
                        } catch (RuntimeException e) {
                            TryCatchGuardChecker.doCheck(e);
                            throw e;
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw new RuntimeException(th);
                    }
                }
            }
            this.LJ = null;
            reentrantLock.unlock();
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final boolean LIZIZ() {
        ReentrantLock reentrantLock = this.LIZ;
        reentrantLock.lock();
        try {
            if (this.LIZJ) {
                reentrantLock.unlock();
                return false;
            }
            this.LIZJ = true;
            this.LIZIZ.signalAll();
            LIZ();
            reentrantLock.unlock();
            return true;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            reentrantLock.unlock();
            throw th;
        }
    }

    public C838190WuP() {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.LIZ = reentrantLock;
        this.LIZIZ = reentrantLock.newCondition();
        this.LJ = new ArrayList();
    }

    public C838190WuP(int i) {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.LIZ = reentrantLock;
        this.LIZIZ = reentrantLock.newCondition();
        this.LJ = new ArrayList();
        LIZIZ();
    }

    public final boolean LIZJ(TResult tresult) {
        ReentrantLock reentrantLock = this.LIZ;
        reentrantLock.lock();
        try {
            if (this.LIZJ) {
                reentrantLock.unlock();
                return false;
            }
            this.LIZJ = true;
            this.LIZLLL = tresult;
            this.LIZIZ.signalAll();
            LIZ();
            reentrantLock.unlock();
            return true;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            reentrantLock.unlock();
            throw th;
        }
    }

    public C838190WuP(TResult tresult) {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.LIZ = reentrantLock;
        this.LIZIZ = reentrantLock.newCondition();
        this.LJ = new ArrayList();
        LIZJ(tresult);
    }
}
