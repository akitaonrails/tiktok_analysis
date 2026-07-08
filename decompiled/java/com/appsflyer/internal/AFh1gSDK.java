package com.appsflyer.internal;

import X.C098200Yq;
import X.C13BV;
import X.C189200o6;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes31.dex */
public final class AFh1gSDK {
    public AFh1hSDK AFInAppEventType;
    public final AFh1eSDK AFKeystoreWrapper;
    public final AFh1fSDK valueOf;

    public final int hashCode() {
        AFh1fSDK aFh1fSDK = this.valueOf;
        int iHashCode = (aFh1fSDK != null ? aFh1fSDK.hashCode() : 0) * 31;
        AFh1eSDK aFh1eSDK = this.AFKeystoreWrapper;
        int iHashCode2 = (iHashCode + (aFh1eSDK != null ? aFh1eSDK.hashCode() : 0)) * 31;
        AFh1hSDK aFh1hSDK = this.AFInAppEventType;
        return iHashCode2 + (aFh1hSDK != null ? aFh1hSDK.hashCode() : 0);
    }

    public AFh1gSDK(JSONObject jSONObject) {
        this.AFInAppEventType = AFKeystoreWrapper(jSONObject);
        this.valueOf = valueOf(jSONObject);
        this.AFKeystoreWrapper = AFInAppEventType(jSONObject);
    }

    public static AFh1eSDK AFInAppEventType(JSONObject jSONObject) {
        Object c098200Yq;
        Object obj = null;
        try {
            JSONObject jSONObjectAFKeystoreWrapper = AFKeystoreWrapper(jSONObject, "meta_data");
            if (jSONObjectAFKeystoreWrapper != null) {
                c098200Yq = new AFh1eSDK(jSONObjectAFKeystoreWrapper.optDouble("send_rate", 1.0d));
            } else {
                c098200Yq = null;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        return (AFh1eSDK) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.util.ArrayList] */
    public static AFh1hSDK AFKeystoreWrapper(JSONObject jSONObject) {
        Object c098200Yq;
        ?? arrayList;
        Object obj = null;
        try {
            JSONObject jSONObjectAFKeystoreWrapper = AFKeystoreWrapper(jSONObject, "r_debugger");
            if (jSONObjectAFKeystoreWrapper != null) {
                long j = JSONObjectProtectorUtils.getLong(jSONObjectAFKeystoreWrapper, "ttl");
                int i = JSONObjectProtectorUtils.getInt(jSONObjectAFKeystoreWrapper, "counter");
                String strOptString = jSONObjectAFKeystoreWrapper.optString("app_ver", "");
                String strOptString2 = jSONObjectAFKeystoreWrapper.optString("sdk_ver", "");
                float fOptDouble = (float) jSONObjectAFKeystoreWrapper.optDouble("ratio", 1.0d);
                JSONArray jSONArrayOptJSONArray = jSONObjectAFKeystoreWrapper.optJSONArray("tags");
                if (jSONArrayOptJSONArray != null) {
                    arrayList = new ArrayList();
                    int length = jSONArrayOptJSONArray.length();
                    for (int i2 = 0; i2 < length; i2++) {
                        arrayList.add(JSONArrayProtectorUtils.getString(jSONArrayOptJSONArray, i2));
                    }
                } else {
                    arrayList = C13BV.INSTANCE;
                }
                c098200Yq = new AFh1hSDK(j, fOptDouble, arrayList, i, strOptString, strOptString2);
            } else {
                c098200Yq = null;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        return (AFh1hSDK) obj;
    }

    public static AFh1fSDK valueOf(JSONObject jSONObject) {
        Object c098200Yq;
        Object obj = null;
        try {
            JSONObject jSONObjectAFKeystoreWrapper = AFKeystoreWrapper(jSONObject, "exc_mngr");
            if (jSONObjectAFKeystoreWrapper != null) {
                c098200Yq = new AFh1fSDK(JSONObjectProtectorUtils.getString(jSONObjectAFKeystoreWrapper, "sdk_ver"), jSONObjectAFKeystoreWrapper.optInt("min", -1), jSONObjectAFKeystoreWrapper.optInt("expire", -1), jSONObjectAFKeystoreWrapper.optLong("ttl", -1L));
            } else {
                c098200Yq = null;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        return (AFh1fSDK) obj;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!Intrinsics.LJFF(AFh1gSDK.class, cls)) {
            return false;
        }
        if (obj != null) {
            AFh1gSDK aFh1gSDK = (AFh1gSDK) obj;
            if (Intrinsics.LJFF(this.valueOf, aFh1gSDK.valueOf) && Intrinsics.LJFF(this.AFKeystoreWrapper, aFh1gSDK.AFKeystoreWrapper) && Intrinsics.LJFF(this.AFInAppEventType, aFh1gSDK.AFInAppEventType)) {
                return true;
            }
            return false;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.appsflyer.internal.model.rc.Features");
    }

    public static JSONObject AFKeystoreWrapper(JSONObject jSONObject, String str) {
        JSONObject jSONObjectOptJSONObject;
        if (!jSONObject.has(str) || (jSONObjectOptJSONObject = JSONObjectProtectorUtils.getJSONArray(jSONObject, str).optJSONObject(0).optJSONObject("data")) == null) {
            return null;
        }
        return jSONObjectOptJSONObject.optJSONObject("v1");
    }
}
