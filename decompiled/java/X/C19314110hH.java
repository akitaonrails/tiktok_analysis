package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.k;
import com.google.gson.n;
import com.ss.android.ugc.aweme.account.loginplatform.ConfirmConfig;
import com.ss.android.ugc.aweme.account.loginplatform.PlatformConfig;
import com.ss.android.ugc.aweme.account.loginplatform.ThirdPartyLoginResponse;
import com.ss.android.ugc.aweme.account.network.NetworkProxyAccount;
import com.ss.android.ugc.aweme.loginplatform.LoginMethodConfig;
import com.ss.android.ugc.aweme.loginplatform.LoginMethodConfirmConfig;
import com.ss.android.ugc.aweme.loginplatform.LoginPlatformConfig;
import com.ss.android.ugc.aweme.loginplatform.LoginSignupConfig;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: renamed from: X.10hH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19314110hH {
    public static final C19314110hH LIZ = new C19314110hH();

    public static LoginPlatformConfig LIZ() {
        C1869230yk5 c1869230yk5 = C1869230yk5.LIZ;
        ThirdPartyLoginResponse thirdPartyLoginResponseLIZ = C19314210hI.LIZ();
        c1869230yk5.getClass();
        if (thirdPartyLoginResponseLIZ.showNum == null && thirdPartyLoginResponseLIZ.signUpOrder == null && thirdPartyLoginResponseLIZ.loginOrder == null && thirdPartyLoginResponseLIZ.recoverAccountUrl == null && thirdPartyLoginResponseLIZ.platformConfigs == null) {
            return new LoginPlatformConfig(null, null, null);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Map map = (Map) GsonProtectorUtils.fromJson(NetworkProxyAccount.LIZ.LJII(), (k) thirdPartyLoginResponseLIZ.platformConfigs, (Type) Map.class);
        for (String str : map == null ? C08CX.INSTANCE : map.keySet()) {
            C1869230yk5.LIZ.getClass();
            Gson gsonLJII = NetworkProxyAccount.LIZ.LJII();
            n nVar = thirdPartyLoginResponseLIZ.platformConfigs;
            PlatformConfig platformConfig = (PlatformConfig) GsonProtectorUtils.fromJson(gsonLJII, nVar != null ? nVar.LJJIIZ(str.toUpperCase(Locale.ENGLISH)) : null, PlatformConfig.class);
            if (platformConfig != null) {
                ConfirmConfig confirmConfig = platformConfig.confirmConfig;
                LoginMethodConfirmConfig loginMethodConfirmConfig = confirmConfig != null ? new LoginMethodConfirmConfig(confirmConfig.title, confirmConfig.body, confirmConfig.okBtnText, confirmConfig.cancelBtnText) : null;
                LoginMethodConfig loginMethodConfig = new LoginMethodConfig(str, platformConfig.needConfirm, platformConfig.loginFallBackUrl, loginMethodConfirmConfig);
                LoginMethodConfig loginMethodConfig2 = new LoginMethodConfig(str, platformConfig.needConfirm, platformConfig.signUpFallBackUrl, loginMethodConfirmConfig);
                arrayList.add(loginMethodConfig);
                arrayList2.add(loginMethodConfig2);
            }
        }
        return new LoginPlatformConfig(new LoginSignupConfig(thirdPartyLoginResponseLIZ.showNum, thirdPartyLoginResponseLIZ.LIZ(false), arrayList), new LoginSignupConfig(thirdPartyLoginResponseLIZ.showNum, thirdPartyLoginResponseLIZ.LIZ(true), arrayList2), thirdPartyLoginResponseLIZ.recoverAccountUrl);
    }

    public static boolean LIZIZ(EnumC1239210iLv enumC1239210iLv) {
        if (enumC1239210iLv != EnumC1239210iLv.GOOGLE) {
            return true;
        }
        try {
            C1AWO c1awoLIZ = C1ATR.LIZIZ().LIZ("google_web");
            if (c1awoLIZ != null && c1awoLIZ.isAvailable()) {
                return true;
            }
            C1AWO c1awoLIZ2 = C1ATR.LIZIZ().LIZ("google");
            if (c1awoLIZ2 != null) {
                if (c1awoLIZ2.isAvailable()) {
                    return true;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return false;
    }
}
