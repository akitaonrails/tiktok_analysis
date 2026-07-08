package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0K1a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C510680K1a {
    public static final C510680K1a LIZ = new C510680K1a();

    public static Integer LIZ(String str) {
        Object c098200Yq;
        try {
            if (str.length() == 9) {
                C0K1Z.LIZ.getClass();
                str = C0K1Z.LJ(str);
            }
            C0K1Z.LIZ.getClass();
            c098200Yq = Integer.valueOf(C0K1Z.LIZLLL(str));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        return (Integer) c098200Yq;
    }
}
