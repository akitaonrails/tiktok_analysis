package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.079p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C18167079p {
    public static final int LIZ() {
        int iLJ = 1;
        try {
            SettingsManager.LIZLLL().getClass();
            iLJ = SettingsManager.LJ("email_popup_collection", 1);
            return iLJ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
            return iLJ;
        }
    }
}
