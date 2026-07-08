package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.1AQz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2179351AQz implements C1ARS, C1AR5 {
    public final CopyOnWriteArrayList<C1AR5> LL = new CopyOnWriteArrayList<>();

    public final void LIZ() {
        this.LL.clear();
    }

    @Override // X.C1AR5
    public final InterfaceC2179131AQd LIZJ(InterfaceC2179131AQd interfaceC2179131AQd) {
        Iterator<C1AR5> it2 = this.LL.iterator();
        while (it2.hasNext()) {
            try {
                interfaceC2179131AQd = it2.next().LIZJ(interfaceC2179131AQd);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C2178901APg.LIZ("MusicPlayerOperationInterceptorDispatcher", e.getMessage());
            }
        }
        return interfaceC2179131AQd;
    }

    @Override // X.C1ARS
    public final void LJIILIIL(C1AR5 c1ar5) {
        if (!this.LL.contains(c1ar5)) {
            this.LL.add(c1ar5);
        }
    }

    @Override // X.C1AR5
    public final C1AQY LJIILL(C1AQY c1aqy) {
        Iterator<C1AR5> it2 = this.LL.iterator();
        while (it2.hasNext()) {
            try {
                c1aqy = it2.next().LJIILL(c1aqy);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C2178901APg.LIZ("MusicPlayerOperationInterceptorDispatcher", e.getMessage());
            }
        }
        return c1aqy;
    }

    @Override // X.C1ARS
    public final void LJIIZILJ(C1AR5 c1ar5) {
        this.LL.remove(c1ar5);
    }

    @Override // X.C1AR5
    public final InterfaceC2179261AQq LIZIZ(InterfaceC2179261AQq interfaceC2179261AQq, C0NIR c0nir) {
        Iterator<C1AR5> it2 = this.LL.iterator();
        while (it2.hasNext()) {
            try {
                interfaceC2179261AQq = it2.next().LIZIZ(interfaceC2179261AQq, c0nir);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C2178901APg.LIZ("MusicPlayerOperationInterceptorDispatcher", e.getMessage());
            }
        }
        return interfaceC2179261AQq;
    }
}
