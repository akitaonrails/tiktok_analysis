package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0pPo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1510700pPo {
    public static C1505160pGs LIZ() {
        C1505160pGs c1505160pGs = C1505190pGv.LIZ;
        InterfaceC1510780pPw.LIZ.getClass();
        if (C1510710pPp.LIZJ) {
            return c1505160pGs;
        }
        C1510710pPp.LIZJ = true;
        synchronized (Boolean.valueOf(C1510710pPp.LIZIZ)) {
            try {
                InterfaceC1510780pPw interfaceC1510780pPw = C1510710pPp.LIZ;
                if (interfaceC1510780pPw != null) {
                    C1510710pPp.LIZIZ = true;
                    interfaceC1510780pPw.tryInit();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return c1505160pGs;
    }
}
