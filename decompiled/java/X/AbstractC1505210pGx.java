package X;

import Y.ARunnableS103S0100000_3;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: renamed from: X.0pGx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public abstract class AbstractC1505210pGx extends AbstractC1505150pGr {
    public final C01GW LIZIZ = C452501pT.LIZIZ(new C1505220pGy(this));

    public final C1505420pHI LJIIIIZZ() {
        return (C1505420pHI) this.LIZIZ.getValue();
    }

    @Override // X.AbstractC1505150pGr
    public boolean LIZ(String str) {
        C1505420pHI c1505420pHILJIIIIZZ = LJIIIIZZ();
        if (str == null) {
            c1505420pHILJIIIIZZ.getClass();
            return false;
        }
        if (!c1505420pHILJIIIIZZ.LIZ.containsKey(str) && !c1505420pHILJIIIIZZ.LIZIZ.containsKey(str)) {
            return false;
        }
        return true;
    }

    public void LJIIJ(ConcurrentHashMap<String, String> concurrentHashMap) {
        for (Map.Entry<String, String> entry : concurrentHashMap.entrySet()) {
            LJIIIZ(entry.getKey(), entry.getValue());
        }
    }

    public void LJIIIZ(String str, String str2) {
        if (str != null && LJIIIIZZ().LJ(str, str2)) {
            C1505160pGs c1505160pGsLIZ = C1510700pPo.LIZ();
            c1505160pGsLIZ.getClass();
            if (!c1505160pGsLIZ.LJFF.isEmpty()) {
                c1505160pGsLIZ.LJI.readLock().lock();
                try {
                    ArrayList arrayList = null;
                    for (InterfaceC2029707xH interfaceC2029707xH : c1505160pGsLIZ.LJFF) {
                        if (interfaceC2029707xH.LIZ()) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(interfaceC2029707xH);
                        }
                    }
                    c1505160pGsLIZ.LJI.readLock().unlock();
                    if (arrayList != null) {
                        if (C1505180pGu.LIZJ == null) {
                            C1505180pGu.LIZJ = C807400Vlq.LJ();
                        }
                        ScheduledExecutorService scheduledExecutorService = C1505180pGu.LIZJ;
                        if (scheduledExecutorService != null) {
                            scheduledExecutorService.execute(new ARunnableS103S0100000_3(str, arrayList, 110));
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c1505160pGsLIZ.LJI.readLock().unlock();
                    throw th;
                }
            }
        }
    }
}
