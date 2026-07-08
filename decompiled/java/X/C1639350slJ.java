package X;

import Y.AfS194S0100000_25;
import Y.AkS486S0100000_25;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.AwS569S0100000_25;

/* JADX INFO: renamed from: X.0slJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1639350slJ implements InterfaceC1639320slG {
    public final InterfaceC1639450slT LIZ;
    public final InterfaceC1639300slE LIZIZ;
    public final InterfaceC1456340o08<AbstractC1524320plm> LIZJ;
    public InterfaceC1635100seS LJI;
    public final C11PR<C1639340slI> LIZLLL = new C11RK().LJLLLL();
    public final ConcurrentHashMap<String, RunnableC1639360slK> LJ = new ConcurrentHashMap<>();
    public final AtomicInteger LJFF = new AtomicInteger(0);
    public final C01GW LJII = C452501pT.LIZIZ(new AwS569S0100000_25(this, 794));

    public final C19475711Hn LJ() {
        C11PR<C1639340slI> c11pr = this.LIZLLL;
        c11pr.getClass();
        return new C19475711Hn(c11pr);
    }

    @Override // X.InterfaceC1639320slG
    public final void cancelAllDownload() {
        List<RunnableC1639360slK> listLLIIII;
        synchronized (this.LJ) {
            try {
                listLLIIII = C13LP.LLIIII(this.LJ.values());
                this.LJ.clear();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        for (RunnableC1639360slK runnableC1639360slK : listLLIIII) {
            runnableC1639360slK.LLILZ.onNext(new C1639340slI(EnumC1641430sof.FAILED, runnableC1639360slK.LL, null));
            runnableC1639360slK.LLILZ.onComplete();
            Future<?> future = runnableC1639360slK.LLILZLL;
            if (future != null) {
                future.cancel(true);
            }
        }
    }

    @Override // X.InterfaceC1639320slG
    public final C11PQ LIZ(C1639670slp c1639670slp) {
        return LIZLLL(c1639670slp, false);
    }

    @Override // X.InterfaceC1639320slG
    public final C11PQ LIZIZ(C1639670slp c1639670slp) {
        boolean zLJI = MethodIDManager.LJI(138018);
        C11PQ c11pqLIZLLL = LIZLLL(c1639670slp, true);
        if (zLJI) {
            MethodIDManager.LJ();
        }
        return c11pqLIZLLL;
    }

    @Override // X.InterfaceC1639320slG
    public final EnumC1641430sof LIZJ(C1639670slp c1639670slp) {
        C11PQ<C1639340slI> c11pq;
        C1639340slI c1639340slILJLZ;
        RunnableC1639360slK runnableC1639360slK = this.LJ.get(c1639670slp.LIZ);
        if (runnableC1639360slK != null && (c11pq = runnableC1639360slK.LLILZ) != null && (c1639340slILJLZ = c11pq.LJLZ()) != null) {
            return c1639340slILJLZ.LIZ;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final C11PQ LIZLLL(C1639670slp c1639670slp, boolean z) {
        boolean z2;
        T t;
        C1639340slI c1639340slI;
        boolean zLJI = MethodIDManager.LJI(138019);
        C259800zU c259800zU = new C259800zU();
        synchronized (this.LJ) {
            try {
                ConcurrentHashMap<String, RunnableC1639360slK> concurrentHashMap = this.LJ;
                String str = c1639670slp.LIZ;
                RunnableC1639360slK runnableC1639360slK = concurrentHashMap.get(str);
                if (runnableC1639360slK == null) {
                    RunnableC1639360slK runnableC1639360slK2 = new RunnableC1639360slK(c1639670slp, this.LJFF.getAndIncrement(), new AkS486S0100000_25(this, 16), new C11PQ(), z);
                    RunnableC1639360slK runnableC1639360slKPutIfAbsent = concurrentHashMap.putIfAbsent(str, runnableC1639360slK2);
                    RunnableC1639360slK runnableC1639360slK3 = runnableC1639360slK2;
                    if (runnableC1639360slKPutIfAbsent != null) {
                        runnableC1639360slK3 = runnableC1639360slKPutIfAbsent;
                    }
                    z2 = true;
                    t = runnableC1639360slK3;
                } else {
                    z2 = false;
                    t = runnableC1639360slK;
                }
                c259800zU.element = t;
                c1639340slI = null;
                if ((z2 || ((RunnableC1639360slK) t).LLILZ.LJLZ() == null) && z) {
                    ((RunnableC1639360slK) c259800zU.element).LLILZIL = z;
                    c1639340slI = new C1639340slI(EnumC1641430sof.PENDING, c1639670slp, null);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                if (zLJI) {
                    MethodIDManager.LJ();
                }
                throw th;
            }
        }
        if (c1639340slI != null) {
            ((RunnableC1639360slK) c259800zU.element).LLILZ.onNext(c1639340slI);
        }
        if (z2) {
            RunnableC1639360slK runnableC1639360slK4 = (RunnableC1639360slK) c259800zU.element;
            runnableC1639360slK4.LLILZ.LJJJLZIJ(C11S5.LIZ()).LJJLL(new AfS194S0100000_25(this, 128), C09HN.LIZ);
            runnableC1639360slK4.LLILZLL = ((ExecutorService) this.LJII.getValue()).submit(runnableC1639360slK4);
        }
        C11PQ<C1639340slI> c11pq = ((RunnableC1639360slK) c259800zU.element).LLILZ;
        if (zLJI) {
            MethodIDManager.LJ();
        }
        return c11pq;
    }

    public C1639350slJ(InterfaceC1639450slT interfaceC1639450slT, InterfaceC1639300slE interfaceC1639300slE, InterfaceC1456340o08 interfaceC1456340o08) {
        this.LIZ = interfaceC1639450slT;
        this.LIZIZ = interfaceC1639300slE;
        this.LIZJ = interfaceC1456340o08;
    }
}
