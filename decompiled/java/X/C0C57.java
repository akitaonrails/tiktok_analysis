package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import com.google.gson.m;
import com.google.gson.n;
import com.google.gson.q;

/* JADX INFO: renamed from: X.0C57, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0C57 {
    public static n LIZ(String str) {
        n nVarLJJIJ;
        k kVarLIZ = C0C54.LIZJ.LIZ(str);
        if (kVarLIZ != null && !(kVarLIZ instanceof m)) {
            if (kVarLIZ instanceof n) {
                n nVar = (n) kVarLIZ;
                if (nVar.LJJIJIIJIL("val") && (nVarLJJIJ = nVar.LJJIJ("val")) != null) {
                    return nVarLJJIJ;
                }
                return nVar;
            }
            if ((kVarLIZ instanceof q) && (((q) kVarLIZ).LL instanceof String)) {
                try {
                    return (n) C0C4Y.LIZJ.LJIIJ().LJII(((q) kVarLIZ).LJIL(), n.class);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    return null;
                }
            }
            return null;
        }
        return null;
    }

    public static boolean LIZIZ(String str) {
        k kVarLIZ = C0C54.LIZJ.LIZ(str);
        if (kVarLIZ != null && !(kVarLIZ instanceof m)) {
            try {
                if (kVarLIZ instanceof n) {
                    return C1925307gR.LIZ((n) kVarLIZ, "val");
                }
                if ((kVarLIZ instanceof q) && (((q) kVarLIZ).LL instanceof Boolean)) {
                    return ((q) kVarLIZ).LJ();
                }
                return false;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return false;
            }
        }
        return false;
    }
}
