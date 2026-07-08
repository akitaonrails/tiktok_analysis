package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import com.google.gson.m;
import com.google.gson.p;
import com.google.gson.q;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0CCl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C309810CCl {
    public static final k LIZ(k kVar) {
        Object c098200Yq;
        Object obj = null;
        if (kVar == null || (kVar instanceof m)) {
            return null;
        }
        if ((kVar instanceof q) && (kVar.LJIILJJIL().LL instanceof String)) {
            String strLJIL = kVar.LJIL();
            if (a0.LJJJIL(strLJIL)) {
                return null;
            }
            try {
                new p();
                c098200Yq = p.LIZJ(strLJIL);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (!C189200o6.m7isFailureimpl(c098200Yq)) {
                obj = c098200Yq;
            }
            return (k) obj;
        }
        return kVar;
    }

    public static final boolean LIZIZ(k kVar) {
        if (kVar == null || (kVar instanceof m) || !(kVar instanceof q)) {
            return false;
        }
        q qVarLJIILJJIL = kVar.LJIILJJIL();
        Object obj = qVarLJIILJJIL.LL;
        if (obj instanceof Boolean) {
            return qVarLJIILJJIL.LJ();
        }
        if (!(obj instanceof String)) {
            return false;
        }
        return u.LJIJI(qVarLJIILJJIL.LJIL(), "true", true);
    }

    public static final <T> T LIZJ(k kVar, Class<T> cls) {
        T t;
        k kVarLIZ = LIZ(kVar);
        if (kVarLIZ == null) {
            return null;
        }
        try {
            t = (T) C309820CCm.LIZ.LIZJ(kVarLIZ, cls);
            C189200o6.m2constructorimpl(t);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            t = (T) new C098200Yq(th);
            C189200o6.m2constructorimpl(t);
        }
        if (C189200o6.m7isFailureimpl(t)) {
            return null;
        }
        return t;
    }
}
