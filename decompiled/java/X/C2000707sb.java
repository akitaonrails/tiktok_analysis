package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ug.settings.UgcPermission;

/* JADX INFO: renamed from: X.07sb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2000707sb {
    public static UgcPermission LIZ() {
        try {
            SettingsManager.LIZLLL().getClass();
            return (UgcPermission) SettingsManager.LJII("ugc_permission_setting", UgcPermission.class);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }
}
