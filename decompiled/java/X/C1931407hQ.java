package X;

import com.google.gson.h;
import com.google.gson.k;
import com.google.gson.m;
import com.google.gson.n;
import com.google.gson.q;
import kotlin.jvm.internal.AFwS189S0000000_3;

/* JADX INFO: renamed from: X.07hQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1931407hQ {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(335));

    public static final Object LIZ(k kVar) {
        if (kVar instanceof m) {
            return null;
        }
        if (kVar instanceof n) {
            return new C1920707fh((n) kVar);
        }
        if (kVar instanceof h) {
            return new C1934307ht((h) kVar);
        }
        if (kVar instanceof q) {
            q qVar = (q) kVar;
            Object obj = qVar.LL;
            if (obj instanceof Number) {
                return qVar.LJIJ();
            }
            if (obj instanceof String) {
                return qVar.LJIL();
            }
            if (obj instanceof Boolean) {
                return Boolean.valueOf(qVar.LJ());
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Unknown JsonPrimitive type: ");
            sbLIZ.append(kVar.getClass().getCanonicalName());
            throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("Unknown JsonElement type: ");
        sbLIZ2.append(kVar.getClass().getCanonicalName());
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ2));
    }
}
