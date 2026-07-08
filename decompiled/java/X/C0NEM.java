package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0NEM, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NEM {
    public static final C0NEM LIZ = new C0NEM();
    public static final Map<C0N9C, InterfaceC590770NFb> LIZIZ = new LinkedHashMap();

    public final void LIZIZ(InterfaceC590770NFb interfaceC590770NFb) {
        synchronized (this) {
            try {
                Map<C0N9C, InterfaceC590770NFb> map = LIZIZ;
                if (map.containsKey(interfaceC590770NFb.LIZJ())) {
                    return;
                }
                map.put(interfaceC590770NFb.LIZJ(), interfaceC590770NFb);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LIZJ(InterfaceC590770NFb interfaceC590770NFb) {
        synchronized (this) {
            try {
                Map<C0N9C, InterfaceC590770NFb> map = LIZIZ;
                if (!map.containsKey(interfaceC590770NFb.LIZJ())) {
                    return;
                }
                map.remove(interfaceC590770NFb.LIZJ());
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
    
        if (r2 == null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C590760NFa LIZ(X.C0NEN r4, X.C0N9C r5) {
        /*
            r3 = this;
            java.util.Map<X.0N9C, X.0NFb> r0 = X.C0NEM.LIZIZ
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0
            java.lang.Object r2 = r0.get(r5)
            X.0NFb r2 = (X.InterfaceC590770NFb) r2
            if (r2 != 0) goto L34
            X.0N9C r0 = X.C0N9C.GOLDEN_HOUSE
            r1 = 0
            if (r5 != r0) goto L33
            boolean r0 = X.C0NHD.LIZIZ()
            if (r0 == 0) goto L33
            X.0NEN r0 = X.C0NEN.REACH_BOTTOM
            if (r4 == r0) goto L24
            X.0S4J r0 = X.C0NH6.LJIILLIIL
            X.0NH6 r0 = X.C591300NHc.LIZ()
            r0.LJIIL()
        L24:
            X.0S4J r0 = X.C0NH6.LJIILLIIL
            X.0NH6 r0 = X.C591300NHc.LIZ()
            r3.LIZIZ(r0)
            X.0NH6 r2 = X.C591300NHc.LIZ()
            if (r2 != 0) goto L34
        L33:
            return r1
        L34:
            X.0NFa r0 = new X.0NFa
            r0.<init>(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0NEM.LIZ(X.0NEN, X.0N9C):X.0NFa");
    }
}
