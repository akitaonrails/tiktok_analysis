package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.h;
import com.google.gson.k;
import com.google.gson.m;
import com.google.gson.n;
import com.google.gson.q;
import java.util.NoSuchElementException;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.07hP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1931307hP {
    public static final h LIZ(n nVar) {
        k kVarLJJIIZ = nVar.LJJIIZ("elements");
        if (kVarLJJIIZ != null) {
            return kVarLJJIIZ.LJIIL();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Missing required JsonArray for key='");
        sbLIZ.append("elements");
        sbLIZ.append('\'');
        throw new NoSuchElementException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final Object LJI(k kVar) {
        if (!(kVar instanceof m)) {
            kVar.getClass();
            if (kVar instanceof n) {
                return kVar.LJIILIIL();
            }
            if (kVar instanceof h) {
                return kVar.LJIIL();
            }
            if (kVar instanceof q) {
                q qVarLJIILJJIL = kVar.LJIILJJIL();
                Object obj = qVarLJIILJJIL.LL;
                if (obj instanceof Boolean) {
                    return Boolean.valueOf(qVarLJIILJJIL.LJ());
                }
                if (obj instanceof Number) {
                    Number numberLJIJ = qVarLJIILJJIL.LJIJ();
                    if (a0.LJJIJ(numberLJIJ.toString(), '.')) {
                        return Double.valueOf(numberLJIJ.doubleValue());
                    }
                    long jLongValue = numberLJIJ.longValue();
                    if (jLongValue >= -2147483648L && jLongValue <= 2147483647L) {
                        return Integer.valueOf((int) jLongValue);
                    }
                    return Long.valueOf(jLongValue);
                }
                return qVarLJIILJJIL.LJIL();
            }
            return null;
        }
        return null;
    }

    public static final n LIZIZ(n nVar, String str) {
        k kVarLJJIIZ = nVar.LJJIIZ(str);
        if (kVarLJJIIZ != null) {
            return kVarLJJIIZ.LJIILIIL();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Missing required JsonObject for key='");
        sbLIZ.append(str);
        sbLIZ.append('\'');
        throw new NoSuchElementException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final Object LIZJ(n nVar, String str) {
        Object c098200Yq;
        try {
            k kVarLJJIIZ = nVar.LJJIIZ(str);
            if (kVarLJJIIZ == null) {
                return null;
            }
            c098200Yq = LJI(kVarLJJIIZ);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            return null;
        }
        return c098200Yq;
    }

    public static final n LIZLLL(n nVar, String str) {
        Object c098200Yq;
        Object obj = null;
        try {
            k kVarLJJIIZ = nVar.LJJIIZ(str);
            if (kVarLJJIIZ != null && (kVarLJJIIZ instanceof n)) {
                c098200Yq = kVarLJJIIZ.LJIILIIL();
            } else {
                c098200Yq = null;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        return (n) obj;
    }

    public static final String LJ(n nVar, String str) {
        return LJFF(nVar, str, "");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String LJFF(com.google.gson.n r0, java.lang.String r1, java.lang.String r2) {
        /*
            com.google.gson.k r1 = r0.LJJIIZ(r1)     // Catch: java.lang.Throwable -> L22
            if (r1 == 0) goto L1d
            boolean r0 = r1 instanceof com.google.gson.m     // Catch: java.lang.Throwable -> L22
            if (r0 != 0) goto Lf
            boolean r0 = r1 instanceof com.google.gson.q     // Catch: java.lang.Throwable -> L22
            if (r0 == 0) goto Lf
            goto L11
        Lf:
            r0 = 0
            goto L12
        L11:
            r0 = 1
        L12:
            if (r0 != 0) goto L15
            r1 = 0
        L15:
            if (r1 == 0) goto L1d
            java.lang.String r1 = r1.LJIL()     // Catch: java.lang.Throwable -> L22
            if (r1 != 0) goto L1e
        L1d:
            r1 = r2
        L1e:
            X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> L22
            goto L2e
        L22:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r1 = new X.00Yq
            r1.<init>(r0)
            X.C189200o6.m2constructorimpl(r1)
        L2e:
            boolean r0 = X.C189200o6.m7isFailureimpl(r1)
            if (r0 != 0) goto L35
            r2 = r1
        L35:
            java.lang.String r2 = (java.lang.String) r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1931307hP.LJFF(com.google.gson.n, java.lang.String, java.lang.String):java.lang.String");
    }
}
