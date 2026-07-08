package X;

import com.google.gson.k;
import com.google.gson.q;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0D1Q, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0D1Q {
    public static final C0D1Q LIZ = new C0D1Q();

    public static q LIZ(String str) {
        Object objLIZLLL = C0C54.LIZJ.LIZLLL(str, false);
        if (objLIZLLL instanceof q) {
            return (q) objLIZLLL;
        }
        return null;
    }

    public static Object LIZIZ(k kVar) {
        long jLongValue;
        if (kVar instanceof q) {
            q qVar = (q) kVar;
            Object obj = qVar.LL;
            if (obj instanceof Boolean) {
                return Boolean.valueOf(qVar.LJ());
            }
            if (obj instanceof Number) {
                String string = a0.LJLIIIL(qVar.LJIL()).toString();
                if (a0.LJJIZ(string, '.', 0, false, 6) < 0 && a0.LJJIZ(string, 'e', 0, true, 2) < 0) {
                    Long lLJIILIIL = C2095008Iq.LJIILIIL(string);
                    if (lLJIILIIL != null) {
                        jLongValue = lLJIILIIL.longValue();
                        if (-2147483648L > jLongValue || jLongValue >= 2147483648L) {
                            return Long.valueOf(jLongValue);
                        }
                    } else {
                        jLongValue = 0;
                    }
                    return Integer.valueOf((int) jLongValue);
                }
                Double dLJII = C2327809Ae.LJII(string);
                if (dLJII != null) {
                    return dLJII;
                }
                return Double.valueOf(0.0d);
            }
            if (obj instanceof String) {
                return qVar.LJIL();
            }
            return kVar.toString();
        }
        return kVar;
    }
}
