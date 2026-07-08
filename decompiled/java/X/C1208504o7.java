package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.04o7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1208504o7 {
    public static final int LIZ;

    static {
        Object c098200Yq;
        try {
            c098200Yq = Integer.valueOf(C0C64.LJIILLIIL().LJIJ(31744, 8000, "ec_shop_result_preload_over_time", true));
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
        LIZ = num != null ? num.intValue() : 8000;
    }
}
