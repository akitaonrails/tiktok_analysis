package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.04oC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1209004oC {
    public static final int LIZ;

    static {
        Object c098200Yq;
        try {
            c098200Yq = Integer.valueOf(C0C64.LJIILLIIL().LJIJ(31744, 0, "setting_order_adjustment", true));
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
        LIZ = num != null ? num.intValue() : 0;
    }

    public static boolean LIZ() {
        int i = LIZ;
        return i == 1 || i == 2;
    }
}
