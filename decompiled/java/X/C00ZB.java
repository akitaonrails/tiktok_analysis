package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.00ZB, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00ZB {
    public static final C01GW LIZ = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(321));

    public static final boolean LIZ() {
        Object c098200Yq;
        try {
            c098200Yq = Boolean.valueOf(((Boolean) LIZ.getValue()).booleanValue());
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Boolean bool = Boolean.TRUE;
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = bool;
        }
        return ((Boolean) c098200Yq).booleanValue();
    }
}
