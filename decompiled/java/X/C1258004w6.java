package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.04w6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1258004w6 {
    public static final C1258004w6 LIZ = new C1258004w6();

    public static int LIZ() {
        Object c098200Yq;
        try {
            c098200Yq = Integer.valueOf(C0C64.LJIILLIIL().LJIJ(31744, 0, "privacy_checkup_entrance", false));
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
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }
}
