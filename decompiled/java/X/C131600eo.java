package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.00eo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C131600eo {
    public static boolean LIZ() {
        Object c098200Yq;
        try {
            c098200Yq = Boolean.valueOf(C0C64.LJIILLIIL().LJIIIZ(31744, "us_pdp_search_icon", true, false));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Boolean bool = (Boolean) c098200Yq;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }
}
