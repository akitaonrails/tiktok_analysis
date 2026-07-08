package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.h;
import com.google.gson.n;

/* JADX INFO: renamed from: X.07iQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1937607iQ {
    public static AbstractC1938007iU LIZ(h hVar, EnumC1980507pL enumC1980507pL) {
        Object c098200Yq;
        if (hVar.size() == 0) {
            return null;
        }
        try {
            c098200Yq = hVar.LJJIIJZLJL(0).LJIILIIL();
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        n nVar = (n) c098200Yq;
        if (nVar == null) {
            return null;
        }
        int i = C1937807iS.LIZ[enumC1980507pL.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return new C1937407iO(hVar, nVar, 0);
                }
                throw new C1954807lC();
            }
            return new C1937707iR(hVar, nVar, 0);
        }
        return new C1937507iP(hVar, nVar, 0);
    }
}
