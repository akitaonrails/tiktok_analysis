package com.appsflyer.internal;

import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes31.dex */
public final class AFh1uSDK {
    public Boolean AFInAppEventParameterName;
    public Boolean AFInAppEventType;
    public String AFKeystoreWrapper;
    public Map<String, Object> AFLogger;
    public String d;
    public Boolean registerClient;
    public Boolean valueOf;
    public Boolean values;

    /* JADX WARN: Multi-variable type inference failed */
    public AFh1uSDK() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 255, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFh1uSDK)) {
            return false;
        }
        AFh1uSDK aFh1uSDK = (AFh1uSDK) obj;
        return Intrinsics.LJFF(this.AFKeystoreWrapper, aFh1uSDK.AFKeystoreWrapper) && Intrinsics.LJFF(this.AFInAppEventParameterName, aFh1uSDK.AFInAppEventParameterName) && Intrinsics.LJFF(this.valueOf, aFh1uSDK.valueOf) && Intrinsics.LJFF(this.AFInAppEventType, aFh1uSDK.AFInAppEventType) && Intrinsics.LJFF(this.values, aFh1uSDK.values) && Intrinsics.LJFF(this.d, aFh1uSDK.d) && Intrinsics.LJFF(this.registerClient, aFh1uSDK.registerClient) && Intrinsics.LJFF(this.AFLogger, aFh1uSDK.AFLogger);
    }

    public final int hashCode() {
        String str = this.AFKeystoreWrapper;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.AFInAppEventParameterName;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.valueOf;
        int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.AFInAppEventType;
        int iHashCode4 = (iHashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.values;
        int iHashCode5 = (iHashCode4 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool5 = this.registerClient;
        return ((iHashCode6 + (bool5 != null ? bool5.hashCode() : 0)) * 31) + this.AFLogger.hashCode();
    }

    public final String toString() {
        return "AFh1uSDK(values=" + this.AFKeystoreWrapper + ", registerClient=" + this.AFInAppEventParameterName + ", AFInAppEventParameterName=" + this.valueOf + ", AFInAppEventType=" + this.AFInAppEventType + ", valueOf=" + this.values + ", AFKeystoreWrapper=" + this.d + ", unregisterClient=" + this.registerClient + ", AFLogger=" + this.AFLogger + ')';
    }

    public AFh1uSDK(String str, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, String str2, Boolean bool5, Map<String, Object> map) {
        this.AFKeystoreWrapper = str;
        this.AFInAppEventParameterName = bool;
        this.valueOf = bool2;
        this.AFInAppEventType = bool3;
        this.values = bool4;
        this.d = str2;
        this.registerClient = bool5;
        this.AFLogger = map;
    }

    public /* synthetic */ AFh1uSDK(String str, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, String str2, Boolean bool5, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : bool2, (i & 8) != 0 ? null : bool3, (i & 16) != 0 ? null : bool4, (i & 32) != 0 ? null : str2, (i & 64) == 0 ? bool5 : null, (i & 128) != 0 ? new HashMap() : map);
    }
}
