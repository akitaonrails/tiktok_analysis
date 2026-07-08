package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.00el, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C131300el {
    public static final boolean LIZ;

    static {
        Object c098200Yq;
        try {
            c098200Yq = Boolean.valueOf(C0C64.LJIILLIIL().LJIIIZ(31744, "setting_page_hide_offline_videos_entry", true, false));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Boolean bool = Boolean.FALSE;
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = bool;
        }
        LIZ = ((Boolean) c098200Yq).booleanValue();
    }
}
