package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.134b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C199503134b {
    public static C134Z LIZ(C134L c134l) {
        C199502134a c199502134a = new C199502134a();
        C134Z<T> c134z = new C134Z<>(c199502134a);
        c199502134a.LIZIZ = c134z;
        c199502134a.LIZ = c134l.getClass();
        try {
            Object objLIZ = c134l.LIZ(c199502134a);
            if (objLIZ != null) {
                c199502134a.LIZ = objLIZ;
                return c134z;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C199505134d c199505134d = c134z.LLILLJJLI;
            c199505134d.getClass();
            if (C134Y.LLILZLL.LIZIZ(c199505134d, null, new C199524134w(e))) {
                C134Y.LIZIZ(c199505134d);
            }
        }
        return c134z;
    }
}
