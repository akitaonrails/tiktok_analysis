package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import com.google.gson.n;
import com.google.gson.o;
import com.google.gson.q;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0pZi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1516840pZi {
    public static Object LIZ(n nVar, String str, boolean z) {
        Pair pair;
        final String strLJIL;
        final String strLJIL2;
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("field '");
            sbLIZ.append(str);
            sbLIZ.append('\'');
            int iLIZ = C051C.LIZ(nVar, "i", C2188811AlT.LIZIZ(sbLIZ));
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("field '");
            sbLIZ2.append(str);
            sbLIZ2.append('\'');
            int iLIZ2 = C051C.LIZ(nVar, "t", C2188811AlT.LIZIZ(sbLIZ2));
            k kVarLJJIIZ = nVar.LJJIIZ("r");
            boolean z2 = false;
            if (kVarLJJIIZ != null && (kVarLJJIIZ instanceof q) && (kVarLJJIIZ.LJIILJJIL().LL instanceof Boolean) && kVarLJJIIZ.LJ()) {
                z2 = true;
            }
            String strLIZIZ = null;
            if (iLIZ2 != 20) {
                if (iLIZ2 != 21) {
                    pair = null;
                } else {
                    n nVarLJJIJ = nVar.LJJIJ("k");
                    if (nVarLJJIJ != null) {
                        n nVarLJJIJ2 = nVar.LJJIJ("v");
                        if (nVarLJJIJ2 != null) {
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("map key of '");
                            sbLIZ3.append(str);
                            sbLIZ3.append('\'');
                            final int iLIZ3 = C051C.LIZ(nVarLJJIJ, "t", C2188811AlT.LIZIZ(sbLIZ3));
                            k kVarLJJIIZ2 = nVarLJJIJ.LJJIIZ("fq");
                            if (kVarLJJIIZ2 != null && (kVarLJJIIZ2 instanceof q) && (kVarLJJIIZ2.LJIILJJIL().LL instanceof String)) {
                                strLJIL = kVarLJJIIZ2.LJIL();
                            } else {
                                strLJIL = null;
                            }
                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                            sbLIZ4.append("map value of '");
                            sbLIZ4.append(str);
                            sbLIZ4.append('\'');
                            final int iLIZ4 = C051C.LIZ(nVarLJJIJ2, "t", C2188811AlT.LIZIZ(sbLIZ4));
                            k kVarLJJIIZ3 = nVarLJJIJ2.LJJIIZ("fq");
                            if (kVarLJJIIZ3 != null && (kVarLJJIIZ3 instanceof q) && (kVarLJJIIZ3.LJIILJJIL().LL instanceof String)) {
                                strLJIL2 = kVarLJJIIZ3.LJIL();
                            } else {
                                strLJIL2 = null;
                            }
                            pair = new Pair(new C1516820pZg(iLIZ3, strLJIL) { // from class: X.0pZk
                            }, new C1516820pZg(iLIZ4, strLJIL2) { // from class: X.0pZl
                            });
                        } else {
                            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                            sbLIZ5.append("Missing 'v' for map field '");
                            sbLIZ5.append(str);
                            sbLIZ5.append('\'');
                            throw new o(C2188811AlT.LIZIZ(sbLIZ5));
                        }
                    } else {
                        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                        sbLIZ6.append("Missing 'k' for map field '");
                        sbLIZ6.append(str);
                        sbLIZ6.append('\'');
                        throw new o(C2188811AlT.LIZIZ(sbLIZ6));
                    }
                }
            } else {
                StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                sbLIZ7.append("field '");
                sbLIZ7.append(str);
                sbLIZ7.append("' (T_FQ_NAME)");
                pair = null;
                strLIZIZ = C051C.LIZIZ(nVar, C2188811AlT.LIZIZ(sbLIZ7));
            }
            C1516820pZg c1516820pZg = new C1516820pZg(str, iLIZ, iLIZ2, z2, strLIZIZ, pair, z, 64);
            C189200o6.m2constructorimpl(c1516820pZg);
            return c1516820pZg;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            return c098200Yq;
        }
    }
}
