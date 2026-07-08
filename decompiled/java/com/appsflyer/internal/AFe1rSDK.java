package com.appsflyer.internal;

import X.C2097608Jq;
import X.C786410Ut5;
import android.text.TextUtils;
import com.appsflyer.AppsFlyerLib;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes31.dex */
public final class AFe1rSDK extends AFe1nSDK {
    public static final AFa1ySDK AFa1ySDK = new AFa1ySDK(null);

    public static final class AFa1ySDK {
        public AFa1ySDK() {
        }

        public /* synthetic */ AFa1ySDK(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static String valueOf(String str, String str2, String str3) {
            return C786410Ut5.j4(AFe1ySDK.AFKeystoreWrapper, new Object[]{AppsFlyerLib.getInstance().getHostPrefix(), AFb1vSDK.AFKeystoreWrapper().getHostName()}) + str + str3 + "?device_id=" + str2;
        }

        public static String AFInAppEventType(String str, String str2, String str3, String str4, String str5) {
            return AFb1lSDK.AFKeystoreWrapper(TextUtils.join("\u2063", new String[]{str5, str3, str + str2}), str4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final AFe1rSDK AFInAppEventParameterName(String str, String str2, String str3, String str4) {
        String strValueOf = AFa1ySDK.valueOf(str, str2, str3);
        String strValueOf2 = String.valueOf(System.currentTimeMillis());
        AFe1rSDK aFe1rSDK = new AFe1rSDK(strValueOf, C2097608Jq.LJIIIIZZ(new Pair("Connection", "close"), new Pair("af_request_epoch_ms", strValueOf2), new Pair("af_sig", AFa1ySDK.AFInAppEventType(str, str3, str2, str4, strValueOf2))), null, 0 == true ? 1 : 0, false, 28, 0 == true ? 1 : 0);
        aFe1rSDK.registerClient = 10000;
        return aFe1rSDK;
    }

    public AFe1rSDK(String str, Map<String, String> map, byte[] bArr, String str2, boolean z) {
        super(str, bArr, str2, map, z);
    }

    public /* synthetic */ AFe1rSDK(String str, Map map, byte[] bArr, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, map, (i & 4) != 0 ? null : bArr, (i & 8) != 0 ? "GET" : str2, (i & 16) != 0 ? false : z);
    }
}
