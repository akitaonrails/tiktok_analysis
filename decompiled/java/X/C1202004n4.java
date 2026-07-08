package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.04n4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1202004n4 {
    public static final String LIZ() {
        Object c098200Yq;
        try {
            SettingsManager.LIZLLL().getClass();
            c098200Yq = SettingsManager.LJI("promote_web_creation_h5_url", "");
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
        return str == null || str.length() == 0 ? "" : str;
    }
}
