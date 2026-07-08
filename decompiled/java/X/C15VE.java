package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleCoroutineScope;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.ttnet.TTNetInit;
import com.ss.android.ugc.aweme.explore.experiment.ExploreLowNetworkOptConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: X.15VE, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15VE {
    public Fragment LIZIZ;
    public LifecycleCoroutineScope LIZJ;
    public InterfaceC497601wk LIZLLL;
    public AnonymousClass0956 LJ;
    public AnonymousClass0956 LJFF;
    public int LJIIJ;
    public final C20531115Vl LIZ = new AbstractC1604130rqV() { // from class: X.15Vl
    };
    public final List<C20530015Va> LJI = Collections.synchronizedList(new ArrayList());
    public final List<C20530915Vj> LJII = Collections.synchronizedList(new ArrayList());
    public final Object LJIIIIZZ = new Object();
    public volatile int LJIIIZ = -1;

    public final void LIZIZ() {
        AnonymousClass0956 anonymousClass0956 = this.LJ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        AnonymousClass0956 anonymousClass09562 = this.LJFF;
        if (anonymousClass09562 != null) {
            anonymousClass09562.LIZIZ(null);
        }
        synchronized (this.LJIIIIZZ) {
            try {
                try {
                    for (C20530915Vj c20530915Vj : this.LJII) {
                        LJIIIZ("Cancel preload task");
                        InterfaceC469401sC interfaceC469401sC = c20530915Vj.LIZIZ;
                        if (interfaceC469401sC != null) {
                            interfaceC469401sC.cancel();
                        }
                    }
                    for (C20530015Va c20530015Va : this.LJI) {
                        if (c20530015Va.LIZLLL == C15VQ.START) {
                            c20530015Va.LIZLLL = C15VQ.IDLE;
                        }
                    }
                } catch (ConcurrentModificationException e) {
                    TryCatchGuardChecker.doCheck(e);
                    C1AF0.LJ(e);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static int LIZJ() {
        int effectiveConnectionType = TTNetInit.getEffectiveConnectionType();
        C01GW c01gw = C12829050h.LIZIZ;
        if (((ExploreLowNetworkOptConfig) c01gw.getValue()).isEnable()) {
            ExploreLowNetworkOptConfig exploreLowNetworkOptConfig = (ExploreLowNetworkOptConfig) c01gw.getValue();
            if (effectiveConnectionType <= exploreLowNetworkOptConfig.lowNetworkQuality) {
                return exploreLowNetworkOptConfig.lowNetworkLoadCnt;
            }
        }
        return (C20530215Vc.LIZ().isEnable() && C20530215Vc.LIZ().preloadWithoutConsideringNetworkQuality) ? C20530215Vc.LIZ().preloadImageCount : effectiveConnectionType >= 6 ? 6 : 2;
    }

    public final void LIZLLL() {
        LIZIZ();
        this.LIZIZ = null;
        this.LIZJ = null;
        this.LIZLLL = null;
        synchronized (this.LJIIIIZZ) {
            try {
                this.LJII.clear();
                this.LJI.clear();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        C15VC.LIZ.clear();
        C15VC.LIZIZ.clear();
    }

    public final void LJ(int i) {
        if (this.LJIIIZ != i && i >= 0) {
            this.LJIIIZ = i;
            LJI(-1);
            if (C20530315Vd.LIZ().enable && C20530315Vd.LIZ().enable && C20530315Vd.LIZ().enableSlidePreload) {
                InterfaceC497601wk interfaceC497601wk = this.LIZJ;
                if (interfaceC497601wk == null && (interfaceC497601wk = this.LIZLLL) == null) {
                    return;
                }
                AnonymousClass0956 anonymousClass0956 = this.LJFF;
                if (anonymousClass0956 != null) {
                    anonymousClass0956.LIZIZ(null);
                }
                this.LJFF = C23250099c.LIZLLL(interfaceC497601wk, C0PEM.LIZJ, null, new C15VF(this, null), 2);
            }
        }
    }

    public final void LJFF(List<C20530015Va> list) {
        synchronized (this.LJIIIIZZ) {
            try {
                this.LJI.clear();
                this.LJI.addAll(list);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJI(int i) {
        AnonymousClass0956 anonymousClass0956 = this.LJ;
        AnonymousClass0956 anonymousClass0956LIZLLL = null;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        InterfaceC497601wk interfaceC497601wk = this.LIZJ;
        if (interfaceC497601wk != null || (interfaceC497601wk = this.LIZLLL) != null) {
            anonymousClass0956LIZLLL = C23250099c.LIZLLL(interfaceC497601wk, C0PEM.LIZJ, null, new C15VH(this, i, null), 2);
        }
        this.LJ = anonymousClass0956LIZLLL;
    }

    public final void LIZ(List<C20530015Va> list, boolean z) {
        int size = this.LJI.size();
        synchronized (this.LJIIIIZZ) {
            try {
                try {
                    if (z) {
                        List<C20530015Va> list2 = this.LJI;
                        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
                        Iterator<C20530015Va> it2 = list2.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(it2.next().LIZ);
                        }
                        Set setLLIIJI = C13LP.LLIIJI(arrayList);
                        ArrayList arrayList2 = new ArrayList();
                        for (C20530015Va c20530015Va : list) {
                            if (!setLLIIJI.contains(c20530015Va.LIZ)) {
                                arrayList2.add(c20530015Va);
                            }
                        }
                        this.LJI.addAll(arrayList2);
                    } else {
                        this.LJI.addAll(list);
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    LJI("setImagePreloadData error", e);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        LJI(size);
    }
}
