package com.appsflyer.internal;

import X.C786410Ut5;
import android.content.Context;
import com.appsflyer.AppsFlyerLib;

/* JADX INFO: loaded from: classes31.dex */
public final class AFg1iSDK extends AFa1qSDK {
    @Override // com.appsflyer.internal.AFa1qSDK
    public final boolean d() {
        return false;
    }

    @Override // com.appsflyer.internal.AFa1qSDK
    public final AFf1zSDK values() {
        return AFf1zSDK.REGISTER;
    }

    public AFg1iSDK(Context context) {
        super("Register", C786410Ut5.j4(AFg1nSDK.valueOf, new Object[]{AppsFlyerLib.getInstance().getHostPrefix(), AFb1vSDK.AFKeystoreWrapper().getHostName()}) + context.getPackageName(), Boolean.FALSE);
    }
}
