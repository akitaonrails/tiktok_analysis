package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.00Yv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C098700Yv {
    public static final int LIZ() {
        Object c098200Yq;
        try {
            c098200Yq = Integer.valueOf(C0C64.LJIILLIIL().LJIJ(31744, 12, "ec_search_live_tab_size", true));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = 12;
        }
        return ((Number) c098200Yq).intValue();
    }
}
