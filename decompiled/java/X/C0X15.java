package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.net.settings.PayLoadControl;

/* JADX INFO: renamed from: X.0X15, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0X15 {
    public static final PayLoadControl LIZ = new PayLoadControl(false, false, 0, 0, 0, 0, 0, 0, 0, null, 0, null, null, 8191, null);
    public static PayLoadControl LIZIZ;

    public static PayLoadControl LIZ() {
        try {
            if (LIZIZ == null) {
                LIZIZ = (PayLoadControl) SettingsManager.LIZLLL().LJIIIIZZ("payload_control_settings", PayLoadControl.class, LIZ);
            }
            PayLoadControl payLoadControl = LIZIZ;
            return payLoadControl == null ? LIZ : payLoadControl;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            PayLoadControl payLoadControl2 = LIZIZ;
            return payLoadControl2 == null ? LIZ : payLoadControl2;
        }
    }
}
