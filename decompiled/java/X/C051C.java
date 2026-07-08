package X;

import com.google.gson.k;
import com.google.gson.n;
import com.google.gson.o;
import com.google.gson.q;

/* JADX INFO: renamed from: X.051C, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C051C {
    public static final String LIZIZ(n nVar, String str) {
        k kVarLJJIIZ = nVar.LJJIIZ("fq");
        if (kVarLJJIIZ != null) {
            if ((kVarLJJIIZ instanceof q) && (kVarLJJIIZ.LJIILJJIL().LL instanceof String)) {
                return kVarLJJIIZ.LJIL();
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Expected string for '");
            sbLIZ.append("fq");
            sbLIZ.append("' in ");
            sbLIZ.append(str);
            sbLIZ.append(", but got: ");
            String string = kVarLJJIIZ.toString();
            if (string == null) {
                string = "null";
            }
            sbLIZ.append(string);
            throw new o(C2188811AlT.LIZIZ(sbLIZ));
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("Missing required string '");
        sbLIZ2.append("fq");
        sbLIZ2.append("' in ");
        sbLIZ2.append(str);
        throw new o(C2188811AlT.LIZIZ(sbLIZ2));
    }

    public static final int LIZ(n nVar, String str, String str2) {
        k kVarLJJIIZ = nVar.LJJIIZ(str);
        if (kVarLJJIIZ != null) {
            if ((kVarLJJIIZ instanceof q) && (kVarLJJIIZ.LJIILJJIL().LL instanceof Number)) {
                return kVarLJJIIZ.LJIIJJI();
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Expected int for '");
            sbLIZ.append(str);
            sbLIZ.append("' in ");
            sbLIZ.append(str2);
            sbLIZ.append(", but got: ");
            String string = kVarLJJIIZ.toString();
            if (string == null) {
                string = "null";
            }
            sbLIZ.append(string);
            throw new o(C2188811AlT.LIZIZ(sbLIZ));
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("Missing required int '");
        sbLIZ2.append(str);
        sbLIZ2.append("' in ");
        sbLIZ2.append(str2);
        throw new o(C2188811AlT.LIZIZ(sbLIZ2));
    }
}
