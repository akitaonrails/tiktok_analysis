package com.appsflyer.internal;

import X.C786410Ut5;
import com.appsflyer.AppsFlyerLib;

/* JADX INFO: loaded from: classes31.dex */
public final class AFj1tSDK implements AFj1uSDK {
    @Override // com.appsflyer.internal.AFj1uSDK
    public final String AFInAppEventParameterName(String str) {
        return C786410Ut5.j4(str, new Object[]{AppsFlyerLib.getInstance().getHostPrefix(), AFb1vSDK.AFKeystoreWrapper().getHostName()});
    }
}
