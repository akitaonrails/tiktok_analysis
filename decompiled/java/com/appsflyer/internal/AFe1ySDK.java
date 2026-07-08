package com.appsflyer.internal;

import X.C0WZX;
import X.C2204961BRm;
import X.C786410Ut5;
import android.content.Context;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.common.ConnectionResult;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes31.dex */
public final class AFe1ySDK {
    public static int $10 = 0;
    public static int $11 = 1;
    public static String AFInAppEventParameterName = null;
    public static String AFKeystoreWrapper = null;
    public static int AFLogger = 0;
    public static long d = 0;
    public static int i = 1;
    public static int registerClient;
    public static char unregisterClient;
    public final AFd1sSDK AFInAppEventType;
    public final AFe1gSDK e;
    public final AFe1xSDK valueOf;
    public final AppsFlyerProperties values;

    public static void AFInAppEventParameterName() {
        registerClient = 680283152;
        unregisterClient = (char) 54699;
        d = -2499805256334160880L;
    }

    private boolean AFInAppEventType() {
        if (this.values.getBoolean("http_cache", true) && 97 != 71) {
            i = (AFLogger + 83) % 128;
            return false;
        }
        int i2 = i + 85;
        AFLogger = i2 % 128;
        return i2 % 2 == 0;
    }

    private Map<String, Object> valueOf() {
        HashMap map = new HashMap();
        map.put("build_number", "6.14.0");
        map.put("counter", Integer.valueOf(this.AFInAppEventType.AFKeystoreWrapper.valueOf("appsFlyerCount", 0)));
        map.put("model", Build.MODEL);
        Object[] objArr = new Object[1];
        a(1190071419 - View.resolveSizeAndState(0, 0, 0), (char) (TextUtils.lastIndexOf("", '0') + 54887), "Ǌ䴭ᘙᙛ鄏", "\u0000\u0000\u0000\u0000", "筢\uef0c晆ᯖ", objArr);
        map.put(((String) objArr[0]).intern(), Build.BRAND);
        map.put("sdk", Integer.toString(Build.VERSION.SDK_INT));
        Context context = this.AFInAppEventType.valueOf.AFKeystoreWrapper;
        map.put("app_version_name", AFb1uSDK.AFInAppEventType(context, context.getPackageName()));
        map.put("app_id", this.AFInAppEventType.valueOf.AFKeystoreWrapper.getPackageName());
        map.put("platformextension", new AFb1hSDK().valueOf());
        int i2 = AFLogger + 19;
        i = i2 % 128;
        if ((i2 % 2 == 0 ? (char) 1 : '/') != 1) {
            return map;
        }
        try {
            throw null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            throw th;
        }
    }

    static {
        AFInAppEventParameterName();
        AFKeystoreWrapper = "https://%sgcdsdk.%s/install_data/v5.0/";
        AFInAppEventParameterName = "https://%sonelink.%s/shortlink-sdk/v2";
        AFLogger = (i + 43) % 128;
    }

    public final AFe1sSDK<String> AFInAppEventType(AFh1qSDK aFh1qSDK) {
        AFe1sSDK<String> aFe1sSDKAFKeystoreWrapper = AFKeystoreWrapper(new AFe1nSDK(aFh1qSDK.registerClient, aFh1qSDK.AFKeystoreWrapper(), "POST", Collections.emptyMap(), true), new AFe1pSDK());
        AFLogger = (i + 9) % 128;
        return aFe1sSDKAFKeystoreWrapper;
    }

    public final AFe1sSDK<AFc1pSDK> AFKeystoreWrapper(AFc1jSDK aFc1jSDK) {
        AFe1sSDK<AFc1pSDK> aFe1sSDKAFKeystoreWrapper = AFKeystoreWrapper(new AFe1nSDK(aFc1jSDK.registerClient, C786410Ut5.J3(AFa1oSDK.AFInAppEventType((Map<String, ?>) aFc1jSDK.AFInAppEventParameterName())).getBytes(Charset.defaultCharset()), "POST", Collections.emptyMap(), aFc1jSDK.valueOf()), new AFc1qSDK());
        int i2 = i + 79;
        AFLogger = i2 % 128;
        if (i2 % 2 != 0) {
            try {
                throw null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return aFe1sSDKAFKeystoreWrapper;
    }

    public final AFe1sSDK<String> AFKeystoreWrapper(String str) {
        AFe1nSDK aFe1nSDK = new AFe1nSDK(str, null, "GET", Collections.emptyMap(), false);
        aFe1nSDK.registerClient = 10000;
        aFe1nSDK.AFKeystoreWrapper = false;
        AFe1sSDK<String> aFe1sSDKAFKeystoreWrapper = AFKeystoreWrapper(aFe1nSDK, new AFe1pSDK());
        AFLogger = (i + 57) % 128;
        return aFe1sSDKAFKeystoreWrapper;
    }

    public final AFe1wSDK AFKeystoreWrapper(Map<String, Object> map, String str) throws Throwable {
        i = (AFLogger + 55) % 128;
        try {
            try {
                Object[] objArr = {map, str};
                Map<Integer, Object> map2 = AFa1uSDK.afRDLog;
                Object method = map2.get(-1459762567);
                if (method == null) {
                    method = ((Class) AFa1uSDK.values((char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 28425), View.resolveSizeAndState(0, 0, 0) + 36, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 73)).getMethod("AFKeystoreWrapper", Map.class, String.class);
                    map2.put(-1459762567, method);
                }
                byte[] bArr = (byte[]) C2204961BRm.a0((Method) method, null, objArr, new C0WZX("dzBzEgMqT9naWU4kV1yNaEAr35CqUcZV5bBsceleyw==", new String[]{"01c45"}));
                if (bArr == null) {
                    AFLogger.afErrorLogForExcManagerOnly("AFFinalizer: failed to create bytes", new IllegalArgumentException("failed to create bytes from proxyData"));
                    return null;
                }
                AFe1wSDK aFe1wSDK = new AFe1wSDK(this.AFInAppEventType, bArr);
                int i2 = i + 19;
                AFLogger = i2 % 128;
                if (i2 % 2 != 0) {
                    try {
                        throw null;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
                return aFe1wSDK;
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                Throwable cause = th2.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th2;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            AFLogger.afErrorLogForExcManagerOnly("AFFinalizer: reflection init failed", e);
            return null;
        }
    }

    public final AFe1sSDK<String> valueOf(Map<String, Object> map, String str) {
        boolean z;
        int i2 = i + 117;
        AFLogger = i2 % 128;
        if (i2 % 2 != 0) {
            z = true;
        } else {
            z = false;
        }
        try {
            if (!z) {
                try {
                    Object[] objArr = {map, str};
                    Map<Integer, Object> map2 = AFa1uSDK.afRDLog;
                    Object method = map2.get(-1459762567);
                    if (method == null) {
                        method = ((Class) AFa1uSDK.values((char) (28425 - TextUtils.indexOf("", "", 0)), 36 - View.MeasureSpec.makeMeasureSpec(0, 0), 73 - (ViewConfiguration.getDoubleTapTimeout() >> 16))).getMethod("AFKeystoreWrapper", Map.class, String.class);
                        map2.put(-1459762567, method);
                    }
                    byte[] bArr = (byte[]) C2204961BRm.a0((Method) method, null, objArr, new C0WZX("dzBzEgMqT9naWU4kV1yNaEAr35CqUcZV5bBsceleyw==", new String[]{"01c45"}));
                    AFj1xSDK aFj1xSDK = new AFj1xSDK(this.AFInAppEventType);
                    AFe1sSDK<String> aFe1sSDKAFKeystoreWrapper = AFKeystoreWrapper(new AFe1nSDK(aFj1xSDK.AFKeystoreWrapper.AFInAppEventParameterName("https://%svalidate-and-log.%s/api/v1.0/android/validateAndLog?app_id=") + aFj1xSDK.AFInAppEventType.valueOf.AFKeystoreWrapper.getPackageName(), bArr, "POST", Collections.emptyMap(), true), new AFe1pSDK());
                    int i3 = i + 47;
                    AFLogger = i3 % 128;
                    if (i3 % 2 != 0) {
                        return aFe1sSDKAFKeystoreWrapper;
                    }
                    return aFe1sSDKAFKeystoreWrapper;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
            try {
                Object[] objArr2 = {map, str};
                Map<Integer, Object> map3 = AFa1uSDK.afRDLog;
                Object method2 = map3.get(-1459762567);
                if (method2 == null) {
                    method2 = ((Class) AFa1uSDK.values((char) (28424 - MotionEvent.axisFromString("")), View.resolveSizeAndState(0, 0, 0) + 36, 73 - (ViewConfiguration.getWindowTouchSlop() >> 8))).getMethod("AFKeystoreWrapper", Map.class, String.class);
                    map3.put(-1459762567, method2);
                }
                throw null;
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                Throwable cause2 = th2.getCause();
                if (cause2 != null) {
                    throw cause2;
                }
                throw th2;
            }
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
            AFLogger.INSTANCE.e(AFg1aSDK.PURCHASE_VALIDATION, "AFFinalizer: reflection init failed", th3, false, false);
            return null;
        }
        TryCatchGuardChecker.doCheck(th3);
        AFLogger.INSTANCE.e(AFg1aSDK.PURCHASE_VALIDATION, "AFFinalizer: reflection init failed", th3, false, false);
        return null;
    }

    public final AFe1sSDK<Map<String, Object>> AFKeystoreWrapper(String str, String str2) {
        String packageName = this.AFInAppEventType.valueOf.AFKeystoreWrapper.getPackageName();
        AFd1sSDK aFd1sSDK = this.AFInAppEventType;
        AFe1sSDK<Map<String, Object>> aFe1sSDKAFKeystoreWrapper = AFKeystoreWrapper(AFe1rSDK.AFInAppEventParameterName(packageName, AFb1kSDK.valueOf(aFd1sSDK.valueOf, aFd1sSDK.AFKeystoreWrapper), str, str2), new AFe1tSDK());
        i = (AFLogger + 67) % 128;
        return aFe1sSDKAFKeystoreWrapper;
    }

    private <T> AFe1sSDK<T> AFKeystoreWrapper(AFe1nSDK aFe1nSDK, AFe1iSDK<T> aFe1iSDK) {
        AFLogger = (i + 103) % 128;
        AFe1sSDK<T> aFe1sSDKValues = values(aFe1nSDK, aFe1iSDK, AFInAppEventType());
        int i2 = AFLogger + 15;
        i = i2 % 128;
        if (i2 % 2 == 0) {
            try {
                throw null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return aFe1sSDKValues;
    }

    public static String AFInAppEventParameterName(String str, String str2, String... strArr) {
        char c;
        ArrayList arrayList = new ArrayList(Arrays.asList(strArr));
        ListProtector.add(arrayList, 1, "v2");
        String strAFKeystoreWrapper = AFb1lSDK.AFKeystoreWrapper(TextUtils.join("\u2063", arrayList.toArray(new String[0])), str + str2 + "v2");
        int i2 = AFLogger + 121;
        i = i2 % 128;
        if (i2 % 2 == 0) {
            c = '\r';
        } else {
            c = '$';
        }
        if (c != '\r') {
            return strAFKeystoreWrapper;
        }
        try {
            throw null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            throw th;
        }
    }

    public final AFe1sSDK<String> AFInAppEventType(Map<String, Object> map, String str, String str2) throws Throwable {
        boolean z;
        String strAFInAppEventParameterName;
        int i2 = i + 117;
        AFLogger = i2 % 128;
        if (i2 % 2 != 0) {
            z = true;
        } else {
            z = false;
        }
        try {
            if (!z) {
                try {
                    Object[] objArr = {map, str};
                    Map<Integer, Object> map2 = AFa1uSDK.afRDLog;
                    Object method = map2.get(-1459762567);
                    if (method == null) {
                        method = ((Class) AFa1uSDK.values((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 28426), 36 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 72)).getMethod("AFKeystoreWrapper", Map.class, String.class);
                        map2.put(-1459762567, method);
                    }
                    byte[] bArr = (byte[]) C2204961BRm.a0((Method) method, null, objArr, new C0WZX("dzBzEgMqT9naWU4kV1yNaEAr35CqUcZV5bBsceleyw==", new String[]{"01c45"}));
                    AFj1xSDK aFj1xSDK = new AFj1xSDK(this.AFInAppEventType);
                    if (str2 != null && str2.length() != 0 && !new Regex("4.?(\\d+)?.?(\\d+)").matches(str2) && !new Regex("3.?(\\d+)?.?(\\d+)").matches(str2)) {
                        strAFInAppEventParameterName = aFj1xSDK.AFKeystoreWrapper.AFInAppEventParameterName("https://%sviap.%s/api/v1/android/validate_purchase_v2?app_id=");
                    } else {
                        i = (AFLogger + 95) % 128;
                        i = (AFLogger + 103) % 128;
                        strAFInAppEventParameterName = aFj1xSDK.AFKeystoreWrapper.AFInAppEventParameterName("https://%sviap.%s/api/v1/android/validate_purchase?app_id=");
                        i = (AFLogger + 77) % 128;
                    }
                    return AFKeystoreWrapper(new AFe1nSDK(aFj1xSDK.valueOf(strAFInAppEventParameterName + aFj1xSDK.AFInAppEventType.valueOf.AFKeystoreWrapper.getPackageName()), bArr, "POST", Collections.emptyMap(), true), new AFe1pSDK());
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
            try {
                Object[] objArr2 = {map, str};
                Map<Integer, Object> map3 = AFa1uSDK.afRDLog;
                Object method2 = map3.get(-1459762567);
                if (method2 == null) {
                    method2 = ((Class) AFa1uSDK.values((char) (28425 - View.resolveSize(0, 0)), TextUtils.indexOf("", "", 0, 0) + 36, 73 - KeyEvent.getDeadChar(0, 0))).getMethod("AFKeystoreWrapper", Map.class, String.class);
                    map3.put(-1459762567, method2);
                }
                try {
                    throw null;
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    throw th2;
                }
            } catch (Throwable th3) {
                TryCatchGuardChecker.doCheck(th3);
                Throwable cause2 = th3.getCause();
                if (cause2 != null) {
                    throw cause2;
                }
                throw th3;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            AFLogger.afErrorLogForExcManagerOnly("AFFinalizer: reflection init failed", e);
            return null;
        }
        TryCatchGuardChecker.doCheck(e);
        AFLogger.afErrorLogForExcManagerOnly("AFFinalizer: reflection init failed", e);
        return null;
    }

    public final AFe1sSDK<String> AFKeystoreWrapper(AFa1qSDK aFa1qSDK, String str, AFd1lSDK aFd1lSDK) {
        i = (AFLogger + 9) % 128;
        try {
            Object[] objArr = {aFa1qSDK, str, aFd1lSDK};
            Map<Integer, Object> map = AFa1uSDK.afRDLog;
            Object method = map.get(943641481);
            if (method == null) {
                method = ((Class) AFa1uSDK.values((char) (28426 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 36, 73 - ExpandableListView.getPackedPositionType(0L))).getMethod("AFInAppEventType", AFa1qSDK.class, String.class, AFd1lSDK.class);
                map.put(943641481, method);
            }
            AFe1sSDK<String> aFe1sSDKAFKeystoreWrapper = AFKeystoreWrapper(new AFe1nSDK(aFa1qSDK.registerClient, (byte[]) C2204961BRm.a0((Method) method, null, objArr, new C0WZX("dzBzEgMqT9naWU4kV1yNaEAr35CqUcZV5bBsceleyw==", new String[]{"01c45"})), "POST", Collections.emptyMap(), aFa1qSDK.valueOf()), new AFe1pSDK());
            int i2 = i + 119;
            AFLogger = i2 % 128;
            if (i2 % 2 != 0) {
                return aFe1sSDKAFKeystoreWrapper;
            }
            return aFe1sSDKAFKeystoreWrapper;
        } catch (Throwable th) {
            try {
                TryCatchGuardChecker.doCheck(th);
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                AFLogger.afErrorLogForExcManagerOnly("AFFinalizer: reflection init failed", th2);
                return null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x013f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.appsflyer.internal.AFe1sSDK<java.lang.String> values(java.util.Map<java.lang.String, java.lang.Object> r15, java.lang.String r16, java.lang.String r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFe1ySDK.values(java.util.Map, java.lang.String, java.lang.String):com.appsflyer.internal.AFe1sSDK");
    }

    private <T> AFe1sSDK<T> values(AFe1nSDK aFe1nSDK, AFe1iSDK<T> aFe1iSDK, boolean z) {
        aFe1nSDK.AFInAppEventParameterName = z;
        AFe1xSDK aFe1xSDK = this.valueOf;
        AFe1sSDK<T> aFe1sSDK = new AFe1sSDK<>(aFe1nSDK, aFe1xSDK.AFInAppEventParameterName, aFe1xSDK.AFInAppEventType, aFe1iSDK);
        AFLogger = (i + 23) % 128;
        return aFe1sSDK;
    }

    public AFe1ySDK(AFe1xSDK aFe1xSDK, AFd1sSDK aFd1sSDK, AppsFlyerProperties appsFlyerProperties, AFe1gSDK aFe1gSDK) {
        this.valueOf = aFe1xSDK;
        this.AFInAppEventType = aFd1sSDK;
        this.values = appsFlyerProperties;
        this.e = aFe1gSDK;
    }

    public final AFe1sSDK<AFi1zSDK> AFInAppEventType(boolean z, boolean z2, String str, int i2) {
        String str2;
        String str3;
        AFLogger = (i + 91) % 128;
        AFe1gSDK aFe1gSDK = this.e;
        if (z) {
            str2 = AFe1gSDK.AFInAppEventParameterName;
        } else {
            str2 = AFe1gSDK.AFInAppEventType;
        }
        Object value = "";
        if (z2) {
            i = (AFLogger + 71) % 128;
            str3 = "stg";
        } else {
            i = (AFLogger + 71) % 128;
            str3 = "";
        }
        Object[] objArr = new Object[4];
        if (AFe1gSDK.valueOf()) {
            int i3 = AFLogger + 73;
            i = i3 % 128;
            if (i3 % 2 == 0) {
                aFe1gSDK.AFKeystoreWrapper.getValue();
                try {
                    throw null;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            value = aFe1gSDK.AFKeystoreWrapper.getValue();
            i = (AFLogger + 57) % 128;
        }
        objArr[0] = value;
        objArr[1] = str3;
        objArr[2] = aFe1gSDK.AFInAppEventParameterName();
        objArr[3] = str;
        AFe1nSDK aFe1nSDK = new AFe1nSDK(C786410Ut5.j4(str2, Arrays.copyOf(objArr, 4)), "GET");
        aFe1nSDK.registerClient = ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED;
        return AFKeystoreWrapper(aFe1nSDK, new AFe1oSDK());
    }

    public final AFe1sSDK<Map<String, String>> AFKeystoreWrapper(String str, String str2, UUID uuid, String str3) {
        String string = uuid.toString();
        String str4 = C786410Ut5.j4(AFInAppEventParameterName, new Object[]{AppsFlyerLib.getInstance().getHostPrefix(), AFb1vSDK.AFKeystoreWrapper().getHostName()}) + "/" + str + "?id=" + str2;
        Map<String, Object> mapValueOf = valueOf();
        String strValueOf = String.valueOf(mapValueOf.get("build_number"));
        HashMap map = new HashMap();
        map.put("Af-UUID", uuid.toString());
        map.put("Af-Meta-Sdk-Ver", strValueOf);
        map.put("Af-Meta-Counter", String.valueOf(mapValueOf.get("counter")));
        map.put("Af-Meta-Model", String.valueOf(mapValueOf.get("model")));
        map.put("Af-Meta-Platform", String.valueOf(mapValueOf.get("platformextension")));
        map.put("Af-Meta-System-Version", String.valueOf(mapValueOf.get("sdk")));
        Object[] objArr = new Object[1];
        a(Gravity.getAbsoluteGravity(0, 0), (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), "㰯䃧럯僄蘿侇ᾟ\uf303\ue862腉\ud833凟", "\u0000\u0000\u0000\u0000", "왘됽䆵晻", objArr);
        map.put(((String) objArr[0]).intern(), AFInAppEventParameterName(str3, string, "GET", string, str, str2, strValueOf));
        AFe1sSDK<Map<String, String>> aFe1sSDKAFKeystoreWrapper = AFKeystoreWrapper(new AFe1nSDK(str4, null, "GET", map, false), new AFe1lSDK());
        int i2 = AFLogger + 9;
        i = i2 % 128;
        if (i2 % 2 == 0) {
            return aFe1sSDKAFKeystoreWrapper;
        }
        return aFe1sSDKAFKeystoreWrapper;
    }

    public final AFe1sSDK<String> AFInAppEventParameterName(String str, Map<String, String> map, String str2, UUID uuid, String str3) {
        char c;
        String string = uuid.toString();
        HashMap map2 = new HashMap();
        map2.put("ttl", "-1");
        map2.put("uuid", string);
        map2.put("data", map);
        map2.put("meta", valueOf());
        if (str2 != null) {
            c = 'U';
        } else {
            c = 18;
        }
        if (c != 18) {
            int i2 = i + 117;
            AFLogger = i2 % 128;
            if (i2 % 2 != 0) {
                map2.put("brand_domain", str2);
            } else {
                map2.put("brand_domain", str2);
            }
            i = (AFLogger + 65) % 128;
        }
        String strJ3 = C786410Ut5.J3(AFa1oSDK.AFInAppEventType((Map<String, ?>) map2));
        HashMap map3 = new HashMap();
        Object[] objArr = new Object[1];
        a((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) (Process.myTid() >> 22), "㰯䃧럯僄蘿侇ᾟ\uf303\ue862腉\ud833凟", "\u0000\u0000\u0000\u0000", "왘됽䆵晻", objArr);
        map3.put(((String) objArr[0]).intern(), AFInAppEventParameterName(str3, string, "POST", strJ3));
        return values(new AFe1nSDK(C786410Ut5.j4(AFInAppEventParameterName, new Object[]{AppsFlyerLib.getInstance().getHostPrefix(), AFb1vSDK.AFKeystoreWrapper().getHostName()}) + "/" + str, strJ3.getBytes(Charset.defaultCharset()), "POST", map3, false), (AFe1iSDK) new AFe1pSDK(), true);
    }

    public static void a(int i2, char c, String str, String str2, String str3, Object[] objArr) {
        boolean z;
        String str4 = str3;
        if (str4 != null) {
            z = false;
        } else {
            z = true;
        }
        Object charArray = str4;
        if (!z) {
            int i3 = $11 + 37;
            $10 = i3 % 128;
            if (i3 % 2 != 0) {
                charArray = str4.toCharArray();
            } else {
                charArray = str4.toCharArray();
            }
        }
        char[] cArr = (char[]) charArray;
        Object charArray2 = str2;
        if (str2 != null) {
            $11 = ($10 + 9) % 128;
            charArray2 = str2.toCharArray();
        }
        char[] cArr2 = (char[]) charArray2;
        Object charArray3 = str;
        if (str != null) {
            $11 = ($10 + 5) % 128;
            charArray3 = str.toCharArray();
        }
        AFj1eSDK aFj1eSDK = new AFj1eSDK();
        int length = cArr.length;
        char[] cArr3 = new char[length];
        int length2 = cArr2.length;
        char[] cArr4 = new char[length2];
        System.arraycopy(cArr, 0, cArr3, 0, length);
        System.arraycopy(cArr2, 0, cArr4, 0, length2);
        cArr3[0] = (char) (cArr3[0] ^ c);
        cArr4[2] = (char) (cArr4[2] + ((char) i2));
        int length3 = ((char[]) charArray3).length;
        char[] cArr5 = new char[length3];
        aFj1eSDK.valueOf = 0;
        while (true) {
            int i4 = aFj1eSDK.valueOf;
            if (i4 < length3) {
                $11 = ($10 + 29) % 128;
                int i5 = (i4 + 3) % 4;
                int i6 = cArr3[i4 % 4] * 32718;
                char c2 = cArr4[(i4 + 2) % 4];
                char c3 = (char) ((i6 + c2) % 65535);
                aFj1eSDK.AFKeystoreWrapper = c3;
                cArr4[i5] = (char) (((cArr3[i5] * 32718) + c2) / 65535);
                cArr3[i5] = c3;
                cArr5[i4] = (char) (((((long) (r14[i4] ^ c3)) ^ (d ^ (-2499805256334160880L))) ^ ((long) ((int) (((long) registerClient) ^ (-2499805256334160880L))))) ^ ((long) ((char) (((long) unregisterClient) ^ (-2499805256334160880L)))));
                aFj1eSDK.valueOf = i4 + 1;
            } else {
                objArr[0] = new String(cArr5);
                return;
            }
        }
    }
}
