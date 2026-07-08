package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.079g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C18158079g {
    public static final C18158079g LIZ = new C18158079g();
    public static final boolean LIZIZ = true;

    public static boolean LIZ() {
        Object c098200Yq;
        try {
            SettingsManager.LIZLLL().getClass();
            c098200Yq = Boolean.valueOf(SettingsManager.LIZ("skylight_story_negative_feedback_track", true));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Boolean boolValueOf = Boolean.valueOf(LIZIZ);
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = boolValueOf;
        }
        return ((Boolean) c098200Yq).booleanValue();
    }
}
