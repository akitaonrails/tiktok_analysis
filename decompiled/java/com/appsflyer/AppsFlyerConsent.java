package com.appsflyer;

import X.C0WZX;
import X.C2204961BRm;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class AppsFlyerConsent {
    public static final Companion Companion = new Companion(null);
    public final boolean AFInAppEventType;
    public final Boolean AFKeystoreWrapper;
    public final Boolean values;

    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final AppsFlyerConsent forNonGDPRUser() {
            return new AppsFlyerConsent(false, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0);
        }

        public final AppsFlyerConsent forGDPRUser(boolean z, boolean z2) {
            return new AppsFlyerConsent(true, Boolean.valueOf(z), Boolean.valueOf(z2), null);
        }
    }

    public /* synthetic */ AppsFlyerConsent(boolean z, Boolean bool, Boolean bool2, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, bool, bool2);
    }

    public static final AppsFlyerConsent forGDPRUser(boolean z, boolean z2) {
        return C2204961BRm.LLJLLL(Companion, z, z2, new C0WZX("dzBzEgMqT9naWU4kV1yldouT5s/2+QyHOByJuCuc", new String[]{"01c45"}));
    }

    public static final AppsFlyerConsent forNonGDPRUser() {
        return Companion.forNonGDPRUser();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsFlyerConsent)) {
            return false;
        }
        AppsFlyerConsent appsFlyerConsent = (AppsFlyerConsent) obj;
        return this.AFInAppEventType == appsFlyerConsent.AFInAppEventType && Intrinsics.LJFF(this.values, appsFlyerConsent.values) && Intrinsics.LJFF(this.AFKeystoreWrapper, appsFlyerConsent.AFKeystoreWrapper);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    public final int hashCode() {
        boolean z = this.AFInAppEventType;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        Boolean bool = this.values;
        int iHashCode = (i + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.AFKeystoreWrapper;
        return iHashCode + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        return "AppsFlyerConsent(isUserSubjectToGDPR=" + this.AFInAppEventType + ", hasConsentForDataUsage=" + this.values + ", hasConsentForAdsPersonalization=" + this.AFKeystoreWrapper + ')';
    }

    public final Boolean getHasConsentForAdsPersonalization() {
        return this.AFKeystoreWrapper;
    }

    public final Boolean getHasConsentForDataUsage() {
        return this.values;
    }

    public final boolean isUserSubjectToGDPR() {
        return this.AFInAppEventType;
    }

    public AppsFlyerConsent(boolean z, Boolean bool, Boolean bool2) {
        this.AFInAppEventType = z;
        this.values = bool;
        this.AFKeystoreWrapper = bool2;
    }
}
