package com.appsflyer.internal;

import X.C786410Ut5;
import com.appsflyer.AppsFlyerLib;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes31.dex */
public final class AFd1aSDK extends AFd1mSDK {
    public final AFe1uSDK AFInAppEventType;
    public static final AFa1uSDK AFa1uSDK = new AFa1uSDK(null);
    public static String AFKeystoreWrapper = "https://%smonitorsdk.%s/remote-debug/exception-manager";

    public static final class AFa1uSDK {
        public AFa1uSDK() {
        }

        public /* synthetic */ AFa1uSDK(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.appsflyer.internal.AFd1mSDK
    public final String AFInAppEventParameterName() {
        return C786410Ut5.j4(AFKeystoreWrapper, new Object[]{AppsFlyerLib.getInstance().getHostPrefix(), AFb1vSDK.AFKeystoreWrapper().getHostName()});
    }

    @Override // com.appsflyer.internal.AFd1mSDK
    public final AFe1uSDK values() {
        return this.AFInAppEventType;
    }

    @Override // com.appsflyer.internal.AFd1mSDK
    public final String AFInAppEventType(String str) {
        return "[Exception Manager]: ".concat(String.valueOf(str));
    }

    public AFd1aSDK(byte[] bArr, Map<String, String> map, int i) {
        super(bArr, map, i);
        this.AFInAppEventType = AFe1uSDK.JSON;
    }
}
