package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.052C, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C052C {
    public static final C052C LIZ = new C052C();

    public static int LIZ() {
        Object c098200Yq;
        try {
            c098200Yq = Integer.valueOf(C1514430pVp.LIZLLL().booleanValue() ? 1 : 0);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = 0;
        }
        return ((Number) c098200Yq).intValue();
    }
}
