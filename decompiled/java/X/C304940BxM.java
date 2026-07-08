package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.specialplus.SpecialPlusConfig;

/* JADX INFO: renamed from: X.0BxM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C304940BxM {
    public static final SpecialPlusConfig LIZ() {
        try {
            SettingsManager.LIZLLL().getClass();
            return (SpecialPlusConfig) SettingsManager.LJII("special_plus_conf", SpecialPlusConfig.class);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }
}
