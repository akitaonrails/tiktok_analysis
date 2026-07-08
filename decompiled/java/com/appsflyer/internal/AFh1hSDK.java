package com.appsflyer.internal;

import X.C786410Ut5;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes31.dex */
public final class AFh1hSDK {
    public final String AFInAppEventParameterName;
    public final int AFInAppEventType;
    public List<String> AFKeystoreWrapper;
    public final String AFLogger;
    public long valueOf;
    public final float values;

    public final boolean AFInAppEventParameterName() {
        return TimeUnit.SECONDS.toMillis(this.valueOf) > AFb1vSDK.AFKeystoreWrapper().AFInAppEventParameterName().e().AFInAppEventType();
    }

    public final int hashCode() {
        return (((((((((C786410Ut5.Y2(this.valueOf) * 31) + Float.floatToIntBits(this.values)) * 31) + this.AFKeystoreWrapper.hashCode()) * 31) + this.AFInAppEventType) * 31) + this.AFInAppEventParameterName.hashCode()) * 31) + this.AFLogger.hashCode();
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
        if (!Intrinsics.LJFF(AFh1hSDK.class, cls)) {
            return false;
        }
        if (obj != null) {
            AFh1hSDK aFh1hSDK = (AFh1hSDK) obj;
            if (this.valueOf == aFh1hSDK.valueOf && this.values == aFh1hSDK.values && Intrinsics.LJFF(this.AFKeystoreWrapper, aFh1hSDK.AFKeystoreWrapper) && this.AFInAppEventType == aFh1hSDK.AFInAppEventType && Intrinsics.LJFF(this.AFInAppEventParameterName, aFh1hSDK.AFInAppEventParameterName) && Intrinsics.LJFF(this.AFLogger, aFh1hSDK.AFLogger)) {
                return true;
            }
            return false;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.appsflyer.internal.model.rc.RDConfiguration");
    }

    public AFh1hSDK(long j, float f, List<String> list, int i, String str, String str2) {
        this.valueOf = j;
        this.values = f;
        this.AFKeystoreWrapper = list;
        this.AFInAppEventType = i;
        this.AFInAppEventParameterName = str;
        this.AFLogger = str2;
    }
}
