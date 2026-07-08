package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0T3y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C740760T3y {
    public static final String LIZ(int i) {
        String strLIZLLL = LIZLLL(i);
        if (strLIZLLL != null) {
            return strLIZLLL;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Cannot get name of layout : ");
        sbLIZ.append(i);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        strLIZIZ.toString();
        throw new IllegalArgumentException(strLIZIZ);
    }

    public static final InterfaceC21138317np LIZIZ(int i) {
        Object c098200Yq;
        try {
            c098200Yq = C740770T3z.LIZ(i);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        return (InterfaceC21138317np) c098200Yq;
    }

    public static final Integer LIZJ(String str) {
        Object c098200Yq;
        try {
            c098200Yq = C740680T3q.LIZ(str);
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

    public static final String LIZLLL(int i) {
        Object c098200Yq;
        try {
            c098200Yq = C740680T3q.LIZIZ(i);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        return (String) c098200Yq;
    }
}
