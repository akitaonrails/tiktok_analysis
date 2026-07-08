package com.appsflyer.internal;

import com.appsflyer.deeplink.DeepLink;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class AFc1pSDK {
    public final DeepLink AFInAppEventType;
    public final boolean values;

    /* JADX WARN: Multi-variable type inference failed */
    public AFc1pSDK() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFc1pSDK)) {
            return false;
        }
        AFc1pSDK aFc1pSDK = (AFc1pSDK) obj;
        return this.values == aFc1pSDK.values && Intrinsics.LJFF(this.AFInAppEventType, aFc1pSDK.AFInAppEventType);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public final int hashCode() {
        boolean z = this.values;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        DeepLink deepLink = this.AFInAppEventType;
        return i + (deepLink == null ? 0 : deepLink.hashCode());
    }

    public final String toString() {
        return "AFc1pSDK(AFInAppEventType=" + this.values + ", values=" + this.AFInAppEventType + ')';
    }

    public final boolean valueOf() {
        return this.values;
    }

    public AFc1pSDK(boolean z, DeepLink deepLink) {
        this.values = z;
        this.AFInAppEventType = deepLink;
    }

    public /* synthetic */ AFc1pSDK(boolean z, DeepLink deepLink, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? null : deepLink);
    }
}
