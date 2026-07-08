package com.appsflyer.internal;

import X.C2097608Jq;
import X.C786410Ut5;
import com.appsflyer.AFLogger;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes31.dex */
public final class AFc1hSDK implements AFc1kSDK {
    public final AFd1qSDK valueOf;

    @Override // com.appsflyer.internal.AFc1kSDK
    public final Map<String, Object> AFInAppEventParameterName() {
        if (this.valueOf.values("deeplink_data")) {
            try {
                String strAFKeystoreWrapper = this.valueOf.AFKeystoreWrapper("deeplink_data", (String) null);
                return strAFKeystoreWrapper == null ? C2097608Jq.LJ() : AFj1sSDK.values(new JSONObject(strAFKeystoreWrapper));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                AFLogger.afErrorLog("Exception while parsing stored deeplink data", th, true, false);
            }
        }
        return C2097608Jq.LJ();
    }

    @Override // com.appsflyer.internal.AFc1kSDK
    public final void AFInAppEventType() {
        this.valueOf.AFKeystoreWrapper("deeplink_data");
    }

    public AFc1hSDK(AFd1qSDK aFd1qSDK) {
        this.valueOf = aFd1qSDK;
    }

    @Override // com.appsflyer.internal.AFc1kSDK
    public final void values(Map<String, ? extends Object> map) {
        this.valueOf.AFInAppEventParameterName("deeplink_data", C786410Ut5.J3(new JSONObject(map)));
    }
}
