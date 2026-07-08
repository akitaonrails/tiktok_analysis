package X;

import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: X.0oaO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1478820oaO implements InterfaceC1479150oav {
    public static final Lock LJIIIIZZ = new ReentrantLock();
    public C1478850oaR LJ;
    public InterfaceC1478880oaU LJI;
    public final C1478840oaQ LJII;
    public double LIZ = -1.0d;
    public double LIZIZ = -1.0d;
    public Queue<C1478850oaR> LIZJ = new ArrayBlockingQueue(C1479130oat.LIZJ);
    public C1478850oaR[] LIZLLL = new C1478850oaR[C1479130oat.LIZJ];
    public final List<InterfaceC1478780oaK> LJFF = new ArrayList();

    @Override // X.InterfaceC1479150oav
    public final double LIZ() {
        double dLIZIZ;
        ((ReentrantLock) LJIIIIZZ).lock();
        try {
            dLIZIZ = this.LJI.LIZIZ(this.LIZJ, this.LIZLLL);
        } catch (Throwable th) {
            try {
                TryCatchGuardChecker.doCheck(th);
                dLIZIZ = -1.0d;
            } catch (Throwable th2) {
                th = th2;
                dLIZIZ = -1.0d;
                try {
                    TryCatchGuardChecker.doCheck(th);
                    ((ReentrantLock) LJIIIIZZ).unlock();
                    return dLIZIZ;
                } catch (Throwable th3) {
                    TryCatchGuardChecker.doCheck(th3);
                    ((ReentrantLock) LJIIIIZZ).unlock();
                    throw th3;
                }
            }
        }
        if (-1.0d == dLIZIZ) {
            try {
                C1478840oaQ c1478840oaQ = this.LJII;
                if (c1478840oaQ != this.LJI) {
                    dLIZIZ = c1478840oaQ.LIZIZ(this.LIZJ, this.LIZLLL);
                }
            } catch (Throwable th4) {
                th = th4;
                TryCatchGuardChecker.doCheck(th);
            }
        }
        ((ReentrantLock) LJIIIIZZ).unlock();
        return dLIZIZ;
    }

    @Override // X.InterfaceC1479150oav
    public final void LIZIZ() {
        this.LIZ = -1.0d;
        synchronized (this.LJFF) {
            try {
                Iterator it2 = ((ArrayList) this.LJFF).iterator();
                while (it2.hasNext()) {
                    ((InterfaceC1478780oaK) it2.next()).LIZIZ();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.InterfaceC1479150oav
    public final C1478850oaR[] LJFF() {
        Lock lock = LJIIIIZZ;
        ((ReentrantLock) lock).lock();
        try {
            Queue<C1478850oaR> queue = this.LIZJ;
            if (queue == null) {
                ((ReentrantLock) lock).unlock();
                return null;
            }
            C1478850oaR[] c1478850oaRArr = new C1478850oaR[queue.size()];
            int i = 0;
            for (C1478850oaR c1478850oaR : this.LIZJ) {
                c1478850oaRArr[i] = new C1478850oaR(c1478850oaR.LL, c1478850oaR.LLILLJJLI, c1478850oaR.LLILLL, c1478850oaR.LLILZ);
                i++;
            }
            ((ReentrantLock) LJIIIIZZ).unlock();
            return c1478850oaRArr;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            ((ReentrantLock) LJIIIIZZ).unlock();
            throw th;
        }
    }

    @Override // X.InterfaceC1479160oaw
    public final double getSpeed() {
        C1478840oaQ c1478840oaQ;
        double dLIZ = this.LIZ;
        if (dLIZ == -1.0d) {
            ReentrantLock reentrantLock = (ReentrantLock) LJIIIIZZ;
            reentrantLock.lock();
            try {
                dLIZ = this.LIZ;
                if (dLIZ == -1.0d) {
                    dLIZ = this.LJI.LIZ(this.LIZJ, this.LIZLLL);
                    if (dLIZ == -1.0d && (c1478840oaQ = this.LJII) != this.LJI) {
                        dLIZ = c1478840oaQ.LIZIZ(this.LIZJ, this.LIZLLL);
                    }
                    this.LIZ = dLIZ;
                }
                reentrantLock.unlock();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                ((ReentrantLock) LJIIIIZZ).unlock();
                throw th;
            }
        }
        if (dLIZ <= 0.001d) {
            double d = this.LIZIZ;
            if (d > 0.001d) {
                return d;
            }
        }
        return dLIZ;
    }

    public C1478820oaO() {
        C1478840oaQ c1478840oaQ = new C1478840oaQ();
        this.LJII = c1478840oaQ;
        this.LJI = c1478840oaQ;
    }

    @Override // X.InterfaceC1479150oav
    public final void LIZJ(int i) {
        if (i >= 1 && i != this.LIZJ.size()) {
            Lock lock = LJIIIIZZ;
            ((ReentrantLock) lock).lock();
            try {
                try {
                    ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i);
                    arrayBlockingQueue.addAll(this.LIZJ);
                    this.LIZLLL = new C1478850oaR[i];
                    this.LIZJ = arrayBlockingQueue;
                    ((ReentrantLock) lock).unlock();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    ((ReentrantLock) LJIIIIZZ).unlock();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                ((ReentrantLock) LJIIIIZZ).unlock();
                throw th;
            }
        }
    }

    @Override // X.InterfaceC1479150oav
    public final void LIZLLL(double d) {
        this.LIZIZ = d;
    }

    @Override // X.InterfaceC1479150oav
    public final void LJI(InterfaceC1478780oaK interfaceC1478780oaK) {
        synchronized (this.LJFF) {
            try {
                ((ArrayList) this.LJFF).add(interfaceC1478780oaK);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.InterfaceC1479150oav
    public final void LJ(double d, double d2, long j) {
        ReentrantLock reentrantLock = (ReentrantLock) LJIIIIZZ;
        reentrantLock.lock();
        try {
            C1478850oaR c1478850oaR = this.LJ;
            if (c1478850oaR != null) {
                c1478850oaR.LL = d;
                c1478850oaR.LLILLJJLI = d2;
                c1478850oaR.LLILLL = j;
                c1478850oaR.LLILZ = SystemClock.elapsedRealtime();
            } else {
                c1478850oaR = new C1478850oaR(d, d2, j, SystemClock.elapsedRealtime());
            }
            if (!((ArrayBlockingQueue) this.LIZJ).offer(c1478850oaR)) {
                this.LJ = (C1478850oaR) ((ArrayBlockingQueue) this.LIZJ).poll();
                ((ArrayBlockingQueue) this.LIZJ).offer(c1478850oaR);
            }
            LIZIZ();
            reentrantLock.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LIZIZ();
            ((ReentrantLock) LJIIIIZZ).unlock();
            throw th;
        }
    }
}
