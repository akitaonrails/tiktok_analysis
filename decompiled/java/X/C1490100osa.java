package X;

import android.os.SystemClock;
import com.bytedance.common.utility.Logger;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.security.SecureRandom;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: renamed from: X.0osa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1490100osa implements InterfaceC1489890osF {
    public static volatile C1490100osa LJIILIIL;
    public final AtomicBoolean LIZ = new AtomicBoolean(false);
    public final Map<String, C1490110osb> LIZIZ = new ConcurrentHashMap();
    public volatile C1490110osb LIZJ = new C1490110osb();
    public final Lock LIZLLL;
    public final Lock LJ;
    public final Set<Request> LJFF;
    public final Set<Request> LJI;
    public final AtomicLong LJII;
    public final Set<Request> LJIIIIZZ;
    public final Map<Runnable, Executor> LJIIIZ;
    public final Lock LJIIJ;
    public final Lock LJIIJJI;
    public final Condition LJIIL;

    @Override // X.InterfaceC1489890osF
    public final Request LIZ(Request request) {
        return request;
    }

    public static C1490100osa LJFF() {
        if (LJIILIIL == null) {
            synchronized (C1490100osa.class) {
                try {
                    if (LJIILIIL == null) {
                        LJIILIIL = new C1490100osa();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LJIILIIL;
    }

    public C1490100osa() {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.LIZLLL = reentrantReadWriteLock.readLock();
        this.LJ = reentrantReadWriteLock.writeLock();
        this.LJFF = new CopyOnWriteArraySet();
        this.LJI = new CopyOnWriteArraySet();
        this.LJII = new AtomicLong(0L);
        this.LJIIIIZZ = new CopyOnWriteArraySet();
        this.LJIIIZ = new ConcurrentHashMap();
        this.LJIIJ = new ReentrantReadWriteLock().writeLock();
        ReentrantLock reentrantLock = new ReentrantLock();
        this.LJIIJJI = reentrantLock;
        this.LJIIL = reentrantLock.newCondition();
    }

    public final boolean LJIIIZ() {
        return System.currentTimeMillis() - this.LJII.get() > ((long) this.LIZJ.LJIILIIL) || ((CopyOnWriteArraySet) this.LJIIIIZZ).size() <= 0;
    }

    public final void LJIIJ() {
        Logger.debug();
        ((ReentrantLock) this.LJIIJJI).lock();
        try {
            this.LJIIL.signalAll();
            ((ReentrantLock) this.LJIIJJI).unlock();
            this.LIZLLL.lock();
            try {
                int i = this.LIZJ.LJIILLIIL;
                int i2 = this.LIZJ.LJIILL;
                this.LIZLLL.unlock();
                this.LJIIJ.lock();
                try {
                    for (Map.Entry entry : ((ConcurrentHashMap) this.LJIIIZ).entrySet()) {
                        final Runnable runnable = (Runnable) entry.getKey();
                        final Executor executor = (Executor) entry.getValue();
                        final int iLJII = LJII(i, i2, true);
                        final long j = iLJII;
                        C1490010osR.LIZ(EnumC1490030osT.NETWORK).LIZIZ(new AbstractRunnableC1490020osS(j) { // from class: X.0osY
                            public final void LIZ() {
                                this.LLILZ.LJIIJ.lock();
                                try {
                                    if (((ConcurrentHashMap) this.LLILZ.LJIIIZ).containsKey(runnable)) {
                                        Runnable runnable2 = runnable;
                                        if (runnable2 instanceof InterfaceRunnableC1490390ot3) {
                                            C1494570ozn c1494570oznLJJJZ = ((InterfaceRunnableC1490390ot3) runnable2).LJJJZ();
                                            c1494570oznLJJJZ.LJJII = System.currentTimeMillis() - c1494570oznLJJJZ.LJJIIJZLJL;
                                            c1494570oznLJJJZ.LJJIIZ = iLJII;
                                        }
                                        Logger.debug();
                                        executor.execute(runnable);
                                        ((ConcurrentHashMap) this.LLILZ.LJIIIZ).remove(runnable);
                                    }
                                    this.LLILZ.LJIIJ.unlock();
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    this.LLILZ.LJIIJ.unlock();
                                    throw th;
                                }
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean zLIZ;
                                C1C7U.LIZ("TTHttpCallThrottleControl@a0ad.releaseAllP1Request$1");
                                try {
                                    LIZ();
                                } finally {
                                    if (!zLIZ) {
                                    }
                                }
                                C1C7U.LIZIZ("TTHttpCallThrottleControl@a0ad.releaseAllP1Request$1");
                            }
                        });
                    }
                    this.LJIIJ.unlock();
                    ((CopyOnWriteArraySet) this.LJFF).clear();
                    ((CopyOnWriteArraySet) this.LJI).clear();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    this.LJIIJ.unlock();
                    throw th;
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                this.LIZLLL.unlock();
                throw th2;
            }
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
            ((ReentrantLock) this.LJIIJJI).unlock();
            throw th3;
        }
    }

    @Override // X.InterfaceC1489890osF
    public final void LIZJ(Request request) {
        if (this.LIZ.get() && request != null && request.getPath() != null && request.getMetrics() != null) {
            this.LIZLLL.lock();
            try {
                try {
                    int iLJI = LJI(false, this.LIZJ, request);
                    Logger.debug();
                    this.LIZLLL.unlock();
                    if (iLJI > 0) {
                        ((CopyOnWriteArraySet) this.LJI).add(request);
                        request.getMetrics().LJJIIJZLJL = System.currentTimeMillis();
                        request.getMetrics().LJJIFFI = true;
                        try {
                            try {
                                Thread.sleep(iLJI);
                                request.getMetrics().LJJII = System.currentTimeMillis() - request.getMetrics().LJJIIJZLJL;
                                return;
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                request.getMetrics().LJJII = System.currentTimeMillis() - request.getMetrics().LJJIIJZLJL;
                                throw th;
                            }
                        } catch (InterruptedException e) {
                            TryCatchGuardChecker.doCheck(e);
                            throw new RuntimeException(e);
                        }
                    }
                    if (iLJI == 0) {
                        return;
                    }
                    this.LIZLLL.lock();
                    int i = this.LIZJ.LJIILLIIL;
                    int i2 = this.LIZJ.LJIILL;
                    int i3 = this.LIZJ.LJIILJJIL;
                    try {
                        try {
                            if (this.LIZJ.LIZ == EnumC1490130osd.RUNTIME && LJ(this.LIZJ, request)) {
                                if (!LJIIIZ()) {
                                    this.LIZLLL.unlock();
                                    ((ReentrantLock) this.LJIIJJI).lock();
                                    try {
                                        try {
                                            request.getMetrics().LJJIIJZLJL = SystemClock.uptimeMillis();
                                            ((CopyOnWriteArraySet) this.LJI).add(request);
                                            Logger.debug();
                                            this.LJIIL.await(i3, TimeUnit.MILLISECONDS);
                                            int iLJII = LJII(i, i2, false);
                                            long j = iLJII;
                                            request.getMetrics().LJJIIZ = j;
                                            if (iLJII > 0) {
                                                Thread.sleep(j);
                                            }
                                            Logger.debug();
                                            request.getMetrics().LJJII = SystemClock.uptimeMillis() - request.getMetrics().LJJIIJZLJL;
                                            request.getMetrics().LJJIFFI = true;
                                        } catch (Throwable th2) {
                                            TryCatchGuardChecker.doCheck(th2);
                                            ((ReentrantLock) this.LJIIJJI).unlock();
                                            throw th2;
                                        }
                                    } catch (Exception e2) {
                                        TryCatchGuardChecker.doCheck(e2);
                                    }
                                    ((ReentrantLock) this.LJIIJJI).unlock();
                                    return;
                                }
                            }
                            this.LIZLLL.unlock();
                        } catch (Exception e3) {
                            TryCatchGuardChecker.doCheck(e3);
                            throw e3;
                        }
                    } finally {
                    }
                } finally {
                }
            } catch (Exception e4) {
                TryCatchGuardChecker.doCheck(e4);
                throw e4;
            }
        }
    }

    @Override // X.InterfaceC1489890osF
    public final void LIZLLL(final Request request) {
        if ((!this.LIZ.get() && ((CopyOnWriteArraySet) this.LJIIIIZZ).size() <= 0) || request == null) {
            return;
        }
        C1490010osR.LIZ(EnumC1490030osT.NETWORK).LIZIZ(new AbstractRunnableC1490020osS() { // from class: X.0osZ
            public final void LIZ() {
                boolean zRemove = ((CopyOnWriteArraySet) this.LLILLJJLI.LJIIIIZZ).remove(request);
                if (Logger.debug()) {
                    request.getMetrics();
                }
                ((CopyOnWriteArraySet) this.LLILLJJLI.LJFF).remove(request);
                ((CopyOnWriteArraySet) this.LLILLJJLI.LJI).remove(request);
                if (zRemove && ((CopyOnWriteArraySet) this.LLILLJJLI.LJIIIIZZ).size() == 0) {
                    Logger.debug();
                    this.LLILLJJLI.LJIIJ();
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("TTHttpCallThrottleControl@a0ad.notifyRequestCompleted$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("TTHttpCallThrottleControl@a0ad.notifyRequestCompleted$1");
            }
        });
    }

    public final void LJIIJJI(String str) {
        LJIIJ();
        C1490110osb c1490110osb = (C1490110osb) ((ConcurrentHashMap) this.LIZIZ).get(str);
        this.LJ.lock();
        try {
            Logger.debug();
            if (c1490110osb != this.LIZJ) {
                if (c1490110osb == null) {
                    c1490110osb = new C1490110osb();
                }
                this.LIZJ = c1490110osb;
                if (this.LIZJ.LIZ != EnumC1490130osd.NO_DELAY) {
                    C1490010osR c1490010osRLIZ = C1490010osR.LIZ(EnumC1490030osT.NETWORK);
                    final long j = this.LIZJ.LIZLLL;
                    c1490010osRLIZ.LIZIZ(new AbstractRunnableC1490020osS(j) { // from class: X.0osI
                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("TTHttpCallThrottleControl@a0ad.setAppState$2");
                            try {
                                this.LL.LJIIJJI("");
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("TTHttpCallThrottleControl@a0ad.setAppState$2");
                        }
                    });
                }
            }
            this.LJ.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LJ.unlock();
            throw th;
        }
    }

    public static boolean LJIIIIZZ(String str, Set set) {
        if (str == null) {
            return false;
        }
        Iterator it2 = ((CopyOnWriteArraySet) set).iterator();
        while (it2.hasNext()) {
            if (str.startsWith((String) it2.next())) {
                return true;
            }
        }
        return false;
    }

    public final boolean LJ(C1490110osb c1490110osb, Request request) {
        if (LJIIIIZZ(request.getPath(), c1490110osb.LJIIJ)) {
            this.LJII.set(System.currentTimeMillis());
            ((CopyOnWriteArraySet) this.LJIIIIZZ).add(request);
            Logger.debug();
            return false;
        }
        if (((CopyOnWriteArraySet) c1490110osb.LJIIJJI).size() > 0) {
            return LJIIIIZZ(request.getPath(), c1490110osb.LJIIJJI);
        }
        if (((CopyOnWriteArraySet) c1490110osb.LJIIL).size() <= 0) {
            return true;
        }
        return !LJIIIIZZ(request.getPath(), c1490110osb.LJIIL);
    }

    @Override // X.InterfaceC1489890osF
    public final boolean LIZIZ(final Request request, final Executor executor, final C1494560ozm c1494560ozm) {
        if (!this.LIZ.get() || request == null || request.getPath() == null || request.getMetrics() == null) {
            return false;
        }
        this.LIZLLL.lock();
        int i = this.LIZJ.LJIILJJIL;
        try {
            try {
                int iLJI = LJI(true, this.LIZJ, request);
                Logger.debug();
                if (iLJI > 0) {
                    LJIIL(iLJI, executor, c1494560ozm, request);
                    this.LIZLLL.unlock();
                    return true;
                }
                if (iLJI != 0 && this.LIZJ.LIZ == EnumC1490130osd.RUNTIME && LJ(this.LIZJ, request) && !LJIIIZ()) {
                    this.LIZLLL.unlock();
                    this.LJIIJ.lock();
                    try {
                        ((CopyOnWriteArraySet) this.LJFF).add(request);
                        Logger.debug();
                        request.getMetrics().LJJIIJZLJL = System.currentTimeMillis();
                        ((ConcurrentHashMap) this.LJIIIZ).put(c1494560ozm, executor);
                        request.getMetrics().LJJIFFI = true;
                        final long j = i;
                        C1490010osR.LIZ(EnumC1490030osT.NETWORK).LIZIZ(new AbstractRunnableC1490020osS(j) { // from class: X.0osX
                            public final void LIZ() {
                                this.LLILZ.LJIIJ.lock();
                                try {
                                    if (((ConcurrentHashMap) this.LLILZ.LJIIIZ).containsKey(c1494560ozm)) {
                                        Logger.debug();
                                        request.getMetrics().LJJII = System.currentTimeMillis() - request.getMetrics().LJJIIJZLJL;
                                        executor.execute(c1494560ozm);
                                        ((ConcurrentHashMap) this.LLILZ.LJIIIZ).remove(c1494560ozm);
                                    }
                                    this.LLILZ.LJIIJ.unlock();
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    this.LLILZ.LJIIJ.unlock();
                                    throw th;
                                }
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean zLIZ;
                                C1C7U.LIZ("TTHttpCallThrottleControl@a0ad.maybeDropRequestOrAsyncDelay$1");
                                try {
                                    LIZ();
                                } finally {
                                    if (!zLIZ) {
                                    }
                                }
                                C1C7U.LIZIZ("TTHttpCallThrottleControl@a0ad.maybeDropRequestOrAsyncDelay$1");
                            }
                        });
                        this.LJIIJ.unlock();
                        return true;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        this.LJIIJ.unlock();
                        throw th;
                    }
                }
                this.LIZLLL.unlock();
                return false;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                throw e;
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            this.LIZLLL.unlock();
            throw th2;
        }
    }

    public final int LJI(boolean z, C1490110osb c1490110osb, Request request) throws C1489960osM {
        request.getMetrics().LJJ = c1490110osb.LIZIZ;
        request.getMetrics().LJJIII = ((CopyOnWriteArraySet) this.LJI).size();
        request.getMetrics().LJJIIJ = ((CopyOnWriteArraySet) this.LJFF).size();
        if (!LJIIIIZZ(request.getPath(), c1490110osb.LJI)) {
            if (z) {
                if (((CopyOnWriteArraySet) this.LJFF).size() >= c1490110osb.LJFF) {
                    return 0;
                }
            } else if (((CopyOnWriteArraySet) this.LJI).size() >= c1490110osb.LJ) {
                return 0;
            }
            EnumC1490130osd enumC1490130osd = c1490110osb.LIZ;
            if (enumC1490130osd == EnumC1490130osd.BLACK_LIST) {
                Map<String, Integer> map = c1490110osb.LJII;
                String path = request.getPath();
                if (path == null) {
                    return 0;
                }
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) map;
                for (String str : concurrentHashMap.keySet()) {
                    if (path.startsWith(str)) {
                        Integer num = (Integer) concurrentHashMap.get(str);
                        if (num == null) {
                            return 0;
                        }
                        return num.intValue();
                    }
                }
                return 0;
            }
            if (enumC1490130osd == EnumC1490130osd.WHITE_LIST) {
                if (LJIIIIZZ(request.getPath(), c1490110osb.LJIIIIZZ)) {
                    return 0;
                }
                return c1490110osb.LJIIIZ;
            }
            return -1;
        }
        throw new C1489960osM();
    }

    public final int LJII(int i, int i2, boolean z) {
        if (z) {
            if (((CopyOnWriteArraySet) this.LJFF).size() <= 5) {
                return 0;
            }
        } else if (((CopyOnWriteArraySet) this.LJI).size() <= 5) {
            return 0;
        }
        return new SecureRandom().nextInt((i2 - i) + 1) + i;
    }

    public final void LJIIL(final int i, final Executor executor, final C1494560ozm c1494560ozm, final Request request) {
        if (i <= 0) {
            return;
        }
        request.getMetrics().LJJIIJZLJL = System.currentTimeMillis();
        request.getMetrics().LJJIFFI = true;
        InterfaceRunnableC1490390ot3 interfaceRunnableC1490390ot3 = new InterfaceRunnableC1490390ot3() { // from class: X.0osc
            @Override // X.InterfaceRunnableC1490390ot3
            public final boolean LJIILLIIL() {
                return request.isResponseStreaming();
            }

            @Override // X.InterfaceRunnableC1490390ot3
            public final C1494570ozn LJJJZ() {
                return request.getMetrics();
            }

            @Override // X.InterfaceRunnableC1490390ot3
            public final int priority() {
                return request.getPriorityLevel();
            }

            @Override // java.lang.Runnable
            public final void run() {
                C1C7U.LIZ("TTHttpCallThrottleControl@a0ad.statePostDelay$1");
                request.getMetrics().LJJII = System.currentTimeMillis() - request.getMetrics().LJJIIJZLJL;
                executor.execute(c1494560ozm);
                C1C7U.LIZIZ("TTHttpCallThrottleControl@a0ad.statePostDelay$1");
            }

            @Override // X.InterfaceRunnableC1490390ot3
            public final int LLI() {
                return i;
            }
        };
        ((CopyOnWriteArraySet) this.LJFF).add(request);
        executor.execute(interfaceRunnableC1490390ot3);
    }
}
