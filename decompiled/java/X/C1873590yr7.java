package X;

import android.content.Context;
import android.provider.Settings;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0yr7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1873590yr7 {
    public static final boolean LIZ(Context context) {
        try {
            return Settings.canDrawOverlays(context);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    public static final void LIZIZ(C19EG c19eg, Function0 function0) {
        C19514711Wn.LIZIZ.LIZIZ(c19eg, TokenCert.Companion.with("bpea-request_alertwindow_permission_in_setting")).LIZIZ("android.permission.SYSTEM_ALERT_WINDOW").LIZJ(new C19334910kd(function0, 3));
    }
}
