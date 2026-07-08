package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.google.gson.p;
import java.util.concurrent.CancellationException;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0CUj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C314470CUj {
    public static final /* synthetic */ int LIZ = 0;

    public static n LIZJ(String str) {
        boolean z;
        Object c098200Yq;
        if (str != null && !a0.LJJJIL(str)) {
            z = false;
        } else {
            z = true;
        }
        Object obj = null;
        if (z) {
            return null;
        }
        try {
            new p();
            c098200Yq = p.LIZJ(str).LJIILIIL();
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        return (n) obj;
    }

    public static String LIZLLL(Object obj) {
        Object c098200Yq;
        try {
            c098200Yq = C08JS.LIZLLL(obj);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        return (String) c098200Yq;
    }

    public static Object LIZ(n nVar, Class cls) {
        Object c098200Yq;
        if (nVar == null) {
            return null;
        }
        try {
            c098200Yq = C08JS.LIZIZ().LIZJ(nVar, cls);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            return null;
        }
        return c098200Yq;
    }

    public static Object LIZIZ(Class cls, String str) {
        boolean z;
        Object c098200Yq;
        if (str != null && !a0.LJJJIL(str)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return null;
        }
        try {
            c098200Yq = C08JS.LIZ(str, cls);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            return null;
        }
        return c098200Yq;
    }
}
