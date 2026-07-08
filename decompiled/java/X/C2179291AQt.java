package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.1AQt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2179291AQt implements C1ARR, InterfaceC2179311AQv {
    public final CopyOnWriteArrayList<InterfaceC2179311AQv> LL = new CopyOnWriteArrayList<>();

    @Override // X.InterfaceC2179311AQv
    public final boolean LIZ() {
        boolean zLIZ = false;
        for (InterfaceC2179311AQv interfaceC2179311AQv : this.LL) {
            try {
                if (!zLIZ) {
                    zLIZ = interfaceC2179311AQv.LIZ();
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C2178901APg.LIZ("MusicPlayerOperationInterceptorDispatcher", e.getMessage());
            }
        }
        return zLIZ;
    }

    public final void LIZIZ() {
        this.LL.clear();
    }

    @Override // X.InterfaceC2179311AQv
    public final boolean LIZLLL(C0NIR c0nir) {
        boolean zLIZLLL = false;
        for (InterfaceC2179311AQv interfaceC2179311AQv : this.LL) {
            try {
                if (!zLIZLLL) {
                    zLIZLLL = interfaceC2179311AQv.LIZLLL(c0nir);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C2178901APg.LIZ("MusicPlayerOperationInterceptorDispatcher", e.getMessage());
            }
        }
        return zLIZLLL;
    }

    @Override // X.InterfaceC2179311AQv
    public final boolean LJII(C0NIR c0nir) {
        boolean zLJII = false;
        for (InterfaceC2179311AQv interfaceC2179311AQv : this.LL) {
            try {
                if (!zLJII) {
                    zLJII = interfaceC2179311AQv.LJII(c0nir);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C2178901APg.LIZ("MusicPlayerOperationInterceptorDispatcher", e.getMessage());
            }
        }
        return zLJII;
    }

    @Override // X.InterfaceC2179311AQv
    public final boolean LJIIIIZZ(C0NIR c0nir) {
        boolean zLJIIIIZZ = false;
        for (InterfaceC2179311AQv interfaceC2179311AQv : this.LL) {
            try {
                if (!zLJIIIIZZ) {
                    zLJIIIIZZ = interfaceC2179311AQv.LJIIIIZZ(c0nir);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C2178901APg.LIZ("MusicPlayerOperationInterceptorDispatcher", e.getMessage());
            }
        }
        return zLJIIIIZZ;
    }

    @Override // X.InterfaceC2179311AQv
    public final boolean LJIIJ(C0NIR c0nir) {
        boolean zLJIIJ = false;
        for (InterfaceC2179311AQv interfaceC2179311AQv : this.LL) {
            try {
                if (!zLJIIJ) {
                    zLJIIJ = interfaceC2179311AQv.LJIIJ(c0nir);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C2178901APg.LIZ("MusicPlayerOperationInterceptorDispatcher", e.getMessage());
            }
        }
        return zLJIIJ;
    }

    @Override // X.C1ARR
    public final void LJIIJJI(InterfaceC2179311AQv interfaceC2179311AQv) {
        if (!this.LL.contains(interfaceC2179311AQv)) {
            this.LL.add(interfaceC2179311AQv);
        }
    }

    @Override // X.C1ARR
    public final void LJIILLIIL(InterfaceC2179311AQv interfaceC2179311AQv) {
        this.LL.remove(interfaceC2179311AQv);
    }

    @Override // X.InterfaceC2179311AQv
    public final C2179231AQn LJIJJ(C2179231AQn c2179231AQn) {
        Iterator<InterfaceC2179311AQv> it2 = this.LL.iterator();
        while (it2.hasNext()) {
            try {
                c2179231AQn = it2.next().LJIJJ(c2179231AQn);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C2178901APg.LIZ("MusicPlayerOperationInterceptorDispatcher", e.getMessage());
            }
        }
        return c2179231AQn;
    }
}
