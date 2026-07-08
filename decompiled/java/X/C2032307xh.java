package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.07xh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2032307xh {
    public static final C2032307xh LIZ = new C2032307xh();
    public static WeakReference<C0P0T> LIZIZ;

    public static Keva LIZ() {
        Object c098200Yq;
        try {
            String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
            if (curUserId == null || a0.LJJJIL(curUserId)) {
                return null;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("skylight_first_collapse_guide_");
            sbLIZ.append(curUserId);
            c098200Yq = Keva.getRepo(C2188811AlT.LIZIZ(sbLIZ));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        return (Keva) (C189200o6.m7isFailureimpl(c098200Yq) ? null : c098200Yq);
    }
}
