package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0Cy1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C330830Cy1 {
    public static final C330830Cy1 LIZ = new C330830Cy1();

    public static final boolean LIZ() {
        Object c098200Yq;
        if (!C0C64.LJIILLIIL().LJIIIZ(31744, "ai_self_simplify_scanning_face", true, false)) {
            return false;
        }
        LIZ.getClass();
        try {
            c098200Yq = Class.forName("com.ss.android.ugc.aweme.aime.services.AIMEServicesImpl");
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        return (C189200o6.m7isFailureimpl(c098200Yq) || c098200Yq == null) ? false : true;
    }
}
