package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.account.loginplatform.ThirdPartyLoginResponse;

/* JADX INFO: renamed from: X.10hI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19314210hI {
    public static ThirdPartyLoginResponse LIZ() {
        try {
            SettingsManager.LIZLLL().getClass();
            ThirdPartyLoginResponse thirdPartyLoginResponse = (ThirdPartyLoginResponse) SettingsManager.LJII("user_login_window", ThirdPartyLoginResponse.class);
            return thirdPartyLoginResponse == null ? new ThirdPartyLoginResponse() : thirdPartyLoginResponse;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return new ThirdPartyLoginResponse();
        }
    }
}
