package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: renamed from: X.0pGs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1505160pGs extends AbstractC1505170pGt {
    public static final /* synthetic */ int LJIIIIZZ = 0;
    public boolean LIZJ;
    public final ArrayList<AbstractC1505150pGr> LIZLLL = new ArrayList<>();
    public final ReentrantReadWriteLock LJ = new ReentrantReadWriteLock();
    public final ArrayList<InterfaceC2029707xH> LJFF = new ArrayList<>();
    public final ReentrantReadWriteLock LJI = new ReentrantReadWriteLock();
    public final ConcurrentHashMap<String, List<String>> LJII = new ConcurrentHashMap<>();

    @Override // X.AbstractC1505150pGr
    public final ConcurrentHashMap<String, String> LJI() {
        ConcurrentHashMap concurrentHashMapLJIIIIZZ = null;
        if (!this.LIZLLL.isEmpty()) {
            this.LJ.readLock().lock();
            try {
                Iterator<AbstractC1505150pGr> it2 = this.LIZLLL.iterator();
                while (it2.hasNext()) {
                    concurrentHashMapLJIIIIZZ = LJIIIIZZ(it2.next().LJI(), concurrentHashMapLJIIIIZZ);
                }
                this.LJ.readLock().unlock();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                this.LJ.readLock().unlock();
                throw th;
            }
        }
        return LJIIIIZZ(C1505260pH2.LIZ().LJI(), LJIIIIZZ(C1505230pGz.LIZ().LJI(), concurrentHashMapLJIIIIZZ));
    }

    @Override // X.AbstractC1505150pGr
    public final boolean LIZ(String str) {
        if (str != null) {
            if (C1505260pH2.LIZ().LIZ(str) || C1505230pGz.LIZ().LIZ(str)) {
                return true;
            }
            if (!this.LIZLLL.isEmpty()) {
                this.LJ.readLock().lock();
                try {
                    Iterator<AbstractC1505150pGr> it2 = this.LIZLLL.iterator();
                    while (it2.hasNext()) {
                        if (it2.next().LIZ(str)) {
                            this.LJ.readLock().unlock();
                            return true;
                        }
                    }
                    this.LJ.readLock().unlock();
                    return false;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    this.LJ.readLock().unlock();
                    throw th;
                }
            }
            return false;
        }
        return false;
    }

    @Override // X.AbstractC1505150pGr
    public final String LIZJ(String str) {
        if (str != null) {
            if (C1505260pH2.LIZ().LIZ(str)) {
                return C1505260pH2.LIZ().LIZJ(str);
            }
            if (C1505230pGz.LIZ().LIZ(str)) {
                return C1505230pGz.LIZ().LIZJ(str);
            }
            if (!this.LIZLLL.isEmpty()) {
                this.LJ.readLock().lock();
                try {
                    for (AbstractC1505150pGr abstractC1505150pGr : this.LIZLLL) {
                        if (abstractC1505150pGr.LIZ(str)) {
                            String strLIZJ = abstractC1505150pGr.LIZJ(str);
                            this.LJ.readLock().unlock();
                            return strLIZJ;
                        }
                    }
                    this.LJ.readLock().unlock();
                    return null;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    this.LJ.readLock().unlock();
                    throw th;
                }
            }
            return null;
        }
        return null;
    }

    public final void LJIIIZ(AbstractC1505210pGx abstractC1505210pGx) {
        if (abstractC1505210pGx != null) {
            this.LJ.writeLock().lock();
            try {
                if (!this.LIZLLL.contains(abstractC1505210pGx)) {
                    this.LIZLLL.add(abstractC1505210pGx);
                }
                this.LJ.writeLock().unlock();
                synchronized (abstractC1505210pGx) {
                    if (!abstractC1505210pGx.LIZ) {
                        abstractC1505210pGx.LIZ = true;
                        abstractC1505210pGx.LIZIZ();
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                this.LJ.writeLock().unlock();
                throw th;
            }
        }
    }

    public static ConcurrentHashMap LJIIIIZZ(ConcurrentHashMap concurrentHashMap, ConcurrentHashMap concurrentHashMap2) {
        if (concurrentHashMap != null && (!concurrentHashMap.isEmpty())) {
            if (concurrentHashMap2 == null) {
                concurrentHashMap2 = new ConcurrentHashMap();
            }
            concurrentHashMap2.putAll(concurrentHashMap);
        }
        return concurrentHashMap2;
    }

    public final void LJIIJ(Context context, ScheduledExecutorService scheduledExecutorService) {
        Context contextN3;
        if (this.LIZJ) {
            return;
        }
        this.LIZJ = true;
        if (context != null) {
            contextN3 = C786410Ut5.N3(context);
        } else {
            contextN3 = null;
        }
        C1505180pGu.LIZIZ = contextN3;
        if (scheduledExecutorService != null) {
            C1505180pGu.LIZJ = scheduledExecutorService;
        }
        if (C1505180pGu.LIZJ == null) {
            C1505180pGu.LIZJ = C807400Vlq.LJ();
        }
        ScheduledExecutorService scheduledExecutorService2 = C1505180pGu.LIZJ;
        if (scheduledExecutorService2 != null) {
            scheduledExecutorService2.execute(new Runnable() { // from class: X.0pGq
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("PortraitCenterServiceImpl@3303.setup$1");
                    try {
                        AbstractC1505150pGr abstractC1505150pGrLIZ = C1505260pH2.LIZ();
                        synchronized (abstractC1505150pGrLIZ) {
                            if (!abstractC1505150pGrLIZ.LIZ) {
                                abstractC1505150pGrLIZ.LIZ = true;
                                abstractC1505150pGrLIZ.LIZIZ();
                            }
                        }
                        C1505230pGz.LIZ().LJII();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("PortraitCenterServiceImpl@3303.setup$1");
                }
            });
        }
    }
}
