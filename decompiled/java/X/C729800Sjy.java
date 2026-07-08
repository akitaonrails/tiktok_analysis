package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0Sjy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C729800Sjy {
    public static final int LIZ() {
        try {
            SettingsManager.LIZLLL().getClass();
            return CastIntegerProtector.parseInt(SettingsManager.LJI("offline_pin_comment", "1"));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return CastIntegerProtector.parseInt("1");
        }
    }
}
