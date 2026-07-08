package com.appsflyer.internal;

import X.C0WZX;
import X.C2204961BRm;
import android.graphics.Color;
import android.net.Uri;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes31.dex */
public final class AFf1hSDK extends AFf1nSDK<Map<String, String>> {
    public final UUID afErrorLog;
    public String afInfoLog;
    public final AFe1ySDK force;
    public final boolean i;
    public AFa1uSDK unregisterClient;
    public String v;
    public String w;

    public interface AFa1uSDK {
        void AFKeystoreWrapper(String str);

        void valueOf(Map<String, String> map);
    }

    @Override // com.appsflyer.internal.AFf1nSDK, com.appsflyer.internal.AFe1dSDK
    public final long AFInAppEventParameterName() {
        return 3000L;
    }

    @Override // com.appsflyer.internal.AFf1nSDK
    public final boolean a_() {
        return false;
    }

    @Override // com.appsflyer.internal.AFf1nSDK
    public final AppsFlyerRequestListener e() {
        return null;
    }

    @Override // com.appsflyer.internal.AFf1nSDK
    public final boolean i() {
        return false;
    }

    @Override // com.appsflyer.internal.AFf1nSDK, com.appsflyer.internal.AFe1dSDK
    public final boolean valueOf() {
        return false;
    }

    public final boolean v() {
        return (TextUtils.isEmpty(this.afInfoLog) || TextUtils.isEmpty(this.v) || this.afInfoLog.equals("app")) ? false : true;
    }

    @Override // com.appsflyer.internal.AFf1nSDK, com.appsflyer.internal.AFe1dSDK
    public final void AFInAppEventType() {
        ResponseNetwork responseNetwork;
        super.AFInAppEventType();
        AFa1uSDK aFa1uSDK = this.unregisterClient;
        if (aFa1uSDK != null) {
            if (this.values == AFe1bSDK.SUCCESS && (responseNetwork = ((AFf1nSDK) this).registerClient) != null) {
                aFa1uSDK.valueOf((Map) responseNetwork.getBody());
                return;
            }
            Throwable thUnregisterClient = unregisterClient();
            if (!(thUnregisterClient instanceof ParsingException)) {
                String str = this.w;
                aFa1uSDK.AFKeystoreWrapper(str != null ? str : "Can't get OneLink data");
            } else if (((ParsingException) thUnregisterClient).getRawResponse().isSuccessful()) {
                aFa1uSDK.AFKeystoreWrapper("Can't parse one link data");
            } else {
                String str2 = this.w;
                aFa1uSDK.AFKeystoreWrapper(str2 != null ? str2 : "Can't get OneLink data");
            }
        }
    }

    public final boolean afInfoLog() {
        return this.i;
    }

    @Override // com.appsflyer.internal.AFf1nSDK
    public final AFe1sSDK<Map<String, String>> AFKeystoreWrapper(String str) {
        return this.force.AFKeystoreWrapper(this.afInfoLog, this.v, this.afErrorLog, str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFf1hSDK(AFd1kSDK aFd1kSDK, UUID uuid, Uri uri) throws Throwable {
        super(AFf1zSDK.ONELINK, new AFf1zSDK[]{AFf1zSDK.RC_CDN}, aFd1kSDK, uuid.toString());
        boolean zBooleanValue = false;
        this.force = aFd1kSDK.AFInAppEventParameterName();
        this.afErrorLog = uuid;
        try {
            if (!AFc1tSDK.values(uri.getHost()) && !AFc1tSDK.values(uri.getPath())) {
                try {
                    Object[] objArr = {uri, aFd1kSDK.afRDLog()};
                    Map<Integer, Object> map = AFc1fSDK.afDebugLog;
                    Object declaredConstructor = map.get(-1014334364);
                    if (declaredConstructor == null) {
                        declaredConstructor = ((Class) AFc1fSDK.valueOf(36 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (-1) - TextUtils.lastIndexOf("", '0', 0, 0), (char) TextUtils.indexOf("", "", 0, 0))).getDeclaredConstructor(Uri.class, AFc1vSDK.class);
                        map.put(-1014334364, declaredConstructor);
                    }
                    Object objNewInstance = ((Constructor) declaredConstructor).newInstance(objArr);
                    try {
                        Object method = map.get(-1905680101);
                        if (method == null) {
                            method = ((Class) AFc1fSDK.valueOf(37 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), ViewConfiguration.getMaximumFlingVelocity() >> 16, (char) (ViewConfiguration.getEdgeSlop() >> 16))).getMethod("AFInAppEventType", null);
                            map.put(-1905680101, method);
                        }
                        Object objA0 = C2204961BRm.a0((Method) method, objNewInstance, null, new C0WZX("dzBzEgMqT9naWU4kV1yNaEAr35CqUcZV5bNsYOleyw==", new String[]{"01c45"}));
                        try {
                            Object method2 = map.get(611290704);
                            if (method2 == null) {
                                method2 = ((Class) AFc1fSDK.valueOf(52 - Color.blue(0), (ViewConfiguration.getPressedStateDuration() >> 16) + 37, (char) (3794 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))))).getMethod("AFInAppEventParameterName", null);
                                map.put(611290704, method2);
                            }
                            boolean zBooleanValue2 = ((Boolean) C2204961BRm.a0((Method) method2, objA0, null, new C0WZX("dzBzEgMqT9naWU4kV1yNaEAr35CqUcZV5bNsYOleyw==", new String[]{"01c45"}))).booleanValue();
                            try {
                                Object method3 = map.get(574725959);
                                if (method3 == null) {
                                    method3 = ((Class) AFc1fSDK.valueOf((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 51, AndroidCharacter.getMirror('0') - 11, (char) (3794 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))))).getMethod("values", null);
                                    map.put(574725959, method3);
                                }
                                zBooleanValue = ((Boolean) C2204961BRm.a0((Method) method3, objA0, null, new C0WZX("dzBzEgMqT9naWU4kV1yNaEAr35CqUcZV5bNsYOleyw==", new String[]{"01c45"}))).booleanValue();
                                String[] strArrSplit = uri.getPath().split("/");
                                if (zBooleanValue2 && strArrSplit.length == 3) {
                                    this.afInfoLog = strArrSplit[1];
                                    this.v = strArrSplit[2];
                                    this.w = uri.toString();
                                }
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                Throwable cause = th.getCause();
                                if (cause != null) {
                                    throw cause;
                                }
                                throw th;
                            }
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
                        Throwable cause3 = th3.getCause();
                        if (cause3 != null) {
                            throw cause3;
                        }
                        throw th3;
                    }
                } catch (Throwable th4) {
                    TryCatchGuardChecker.doCheck(th4);
                    Throwable cause4 = th4.getCause();
                    if (cause4 != null) {
                        throw cause4;
                    }
                    throw th4;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            AFLogger.afErrorLogForExcManagerOnly("OneLinkValidator: reflection init failed", e);
        }
        this.i = zBooleanValue;
    }
}
