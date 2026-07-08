package X;

import com.google.gson.h;
import com.google.gson.k;
import com.google.gson.n;
import com.google.gson.q;

/* JADX INFO: renamed from: X.0hYO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1208500hYO {
    public static final h LIZIZ(n nVar, String str) throws C1210240hbC {
        k kVarLJJIIZ = nVar.LJJIIZ("min_interval");
        if (kVarLJJIIZ != null) {
            if (kVarLJJIIZ instanceof h) {
                return kVarLJJIIZ.LJIIL();
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("min_interval");
            sbLIZ.append(" is not a JsonArray");
            throw new C1210240hbC(C2188811AlT.LIZIZ(sbLIZ), str);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("min_interval");
        sbLIZ2.append(" is null");
        throw new C1210240hbC(C2188811AlT.LIZIZ(sbLIZ2), str);
    }

    public static final n LIZJ(n nVar, String str) throws C1210240hbC {
        k kVarLJJIIZ = nVar.LJJIIZ("key1");
        if (kVarLJJIIZ != null) {
            if (kVarLJJIIZ instanceof n) {
                return kVarLJJIIZ.LJIILIIL();
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("key1");
            sbLIZ.append(" is not a JsonObject");
            throw new C1210240hbC(C2188811AlT.LIZIZ(sbLIZ), str);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("key1");
        sbLIZ2.append(" is null");
        throw new C1210240hbC(C2188811AlT.LIZIZ(sbLIZ2), str);
    }

    public static final Integer LJ(n nVar, String str) {
        k kVarLJJIIZ = nVar.LJJIIZ(str);
        if (kVarLJJIIZ != null && (kVarLJJIIZ instanceof q)) {
            return Integer.valueOf(kVarLJJIIZ.LJIIJJI());
        }
        return null;
    }

    public static final h LJFF(n nVar, String str) {
        k kVarLJJIIZ = nVar.LJJIIZ(str);
        if (kVarLJJIIZ != null && (kVarLJJIIZ instanceof h)) {
            return kVarLJJIIZ.LJIIL();
        }
        return null;
    }

    public static final n LJI(n nVar, String str) {
        k kVarLJJIIZ = nVar.LJJIIZ(str);
        if (kVarLJJIIZ != null && (kVarLJJIIZ instanceof n)) {
            return kVarLJJIIZ.LJIILIIL();
        }
        return null;
    }

    public static final String LJII(n nVar, String str) {
        k kVarLJJIIZ = nVar.LJJIIZ(str);
        if (kVarLJJIIZ != null && (kVarLJJIIZ instanceof q)) {
            return kVarLJJIIZ.LJIL();
        }
        return null;
    }

    public static final int LIZ(n nVar, String str, String str2) throws C1210240hbC {
        k kVarLJJIIZ = nVar.LJJIIZ(str);
        if (kVarLJJIIZ != null) {
            if (kVarLJJIIZ instanceof q) {
                return kVarLJJIIZ.LJIIJJI();
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(" is not a JsonPrimitive");
            throw new C1210240hbC(C2188811AlT.LIZIZ(sbLIZ), str2);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(str);
        sbLIZ2.append(" is null");
        throw new C1210240hbC(C2188811AlT.LIZIZ(sbLIZ2), str2);
    }

    public static final String LIZLLL(n nVar, String str, String str2) throws C1210240hbC {
        String strLJIL;
        if (nVar.LJJIJIIJIL(str)) {
            k kVarLJJIIZ = nVar.LJJIIZ(str);
            if (kVarLJJIIZ != null && (strLJIL = kVarLJJIIZ.LJIL()) != null) {
                return strLJIL;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(" is null");
            throw new C1210240hbC(C2188811AlT.LIZIZ(sbLIZ), str2);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("No ");
        sbLIZ2.append(str);
        sbLIZ2.append(" in ");
        sbLIZ2.append(str2);
        sbLIZ2.append(" config");
        throw new C1210240hbC(C2188811AlT.LIZIZ(sbLIZ2), str2);
    }
}
