package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0VYz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public abstract class AbstractC799790VYz implements InterfaceC800100Va4 {
    @Override // X.InterfaceC800100Va4
    public final InterfaceC800080Va2 LIZIZ(InterfaceC800080Va2 interfaceC800080Va2) {
        return interfaceC800080Va2;
    }

    @Override // X.InterfaceC800100Va4
    public final void LIZJ(InterfaceC800080Va2 interfaceC800080Va2) {
    }

    @Override // X.InterfaceC800100Va4
    public void LJFF() {
    }

    @Override // X.InterfaceC800100Va4
    public void LJI() {
    }

    @Override // X.InterfaceC800100Va4
    public void LIZ(InterfaceC800080Va2 interfaceC800080Va2) {
        C799900VZk.LIZ.getClass();
        C799880VZi c799880VZi = C799900VZk.LIZIZ;
        C0CCZ c0ccz = (C0CCZ) interfaceC800080Va2;
        synchronized (c799880VZi.LIZIZ) {
            try {
                ((List) ((ConcurrentHashMap) c799880VZi.LIZIZ).get(C799750VYv.LIZ(c0ccz))).add(c0ccz);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
