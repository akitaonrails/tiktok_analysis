package X;

import com.bytedance.push.settings.LocalSettings;
import com.bytedance.push.settings.PushOnlineSettings;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.pushmanager.setting.PushMultiProcessSharedProvider;

/* JADX INFO: renamed from: X.0VoL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C808950VoL {
    public static C808950VoL LIZ;

    public static C808950VoL LIZIZ() {
        if (LIZ == null) {
            synchronized (C808950VoL.class) {
                try {
                    if (LIZ == null) {
                        LIZ = new C808950VoL();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZ;
    }

    public static LocalSettings LIZJ() {
        return (LocalSettings) C0WFE.LIZ(C809360Vp0.LIZ, LocalSettings.class);
    }

    public static PushOnlineSettings LIZLLL() {
        return (PushOnlineSettings) C0WFE.LIZ(C809360Vp0.LIZ, PushOnlineSettings.class);
    }

    public C808950VoL() {
        PushMultiProcessSharedProvider.LJ(C809360Vp0.LIZ);
    }

    public static boolean LIZ() {
        return LIZLLL().LJIILJJIL().LIZ;
    }

    public static boolean LJ() {
        return LIZJ().LJI() && LIZLLL().LJI();
    }
}
