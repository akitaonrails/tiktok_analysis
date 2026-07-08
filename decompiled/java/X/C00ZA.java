package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.00ZA, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00ZA {
    public static final C00ZA LIZ = new C00ZA();
    public static final int LIZIZ = 1;

    public static boolean LIZ() {
        Object c098200Yq;
        try {
            c098200Yq = Integer.valueOf(C0C64.LJIILLIIL().LJIJ(31744, 0, "sport_detail_page_saf", true));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Integer num = (Integer) c098200Yq;
        return (num != null ? num.intValue() : 0) == LIZIZ;
    }
}
