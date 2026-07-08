package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.00Yy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C099000Yy {
    public static final C099000Yy LIZ = new C099000Yy();

    public static boolean LIZ() {
        Object c098200Yq;
        try {
            SettingsManager.LIZLLL().getClass();
            c098200Yq = Boolean.valueOf(SettingsManager.LIZ("music_panel_music_rank_logic_change", true));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Boolean bool = (Boolean) c098200Yq;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }
}
