package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.07OE, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07OE {
    public static final C07OE LIZ = new C07OE();

    public static String LIZ() {
        Object c098200Yq;
        try {
            c098200Yq = C0C64.LJIILLIIL().LJJ(31744, "ec_search_mix_rescan_autoplay_fix", "off", true);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        String str = (String) c098200Yq;
        return str != null ? str : "off";
    }
}
