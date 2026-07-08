package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IAccountUserService;

/* JADX INFO: renamed from: X.01js, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C417801js {
    public static final C417801js LIZ = new C417801js();

    public static IAccountUserService LIZ() {
        Object c098200Yq;
        try {
            c098200Yq = C0XQ7.LJFF();
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("get userService failed: ");
            sbLIZ.append(thM5exceptionOrNullimpl.getMessage());
            C211000rc.LIZIZ("[DynamicText]", C2188811AlT.LIZIZ(sbLIZ));
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        return (IAccountUserService) c098200Yq;
    }
}
