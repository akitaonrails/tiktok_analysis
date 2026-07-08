package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.14EQ, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14EQ {
    public static final List<C14EQ> LIZLLL = new ArrayList();
    public Object LIZ;
    public C14EP LIZIZ;
    public C14EQ LIZJ;

    public C14EQ(Object obj, C14EP c14ep) {
        this.LIZ = obj;
        this.LIZIZ = c14ep;
    }

    public static C14EQ LIZ(Object obj, C14EP c14ep) {
        List<C14EQ> list = LIZLLL;
        synchronized (list) {
            try {
                int size = ((ArrayList) list).size();
                if (size > 0) {
                    C14EQ c14eq = (C14EQ) ((ArrayList) list).remove(size - 1);
                    c14eq.LIZ = obj;
                    c14eq.LIZIZ = c14ep;
                    c14eq.LIZJ = null;
                    return c14eq;
                }
                return new C14EQ(obj, c14ep);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
