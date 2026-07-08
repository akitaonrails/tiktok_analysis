package com.bytedance.android.live.wallet.model;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class DefaultLocationData {

    @C09CT("city")
    public final String city;

    @C09CT("country")
    public final String country;

    @C09CT("county")
    public final String county;

    @C09CT("fallBackLocation")
    public final String fallBackLocation;

    @C09CT("isFallback")
    public final boolean isFallback;

    @C09CT("state")
    public final String state;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DefaultLocationData)) {
            return false;
        }
        DefaultLocationData defaultLocationData = (DefaultLocationData) obj;
        return Intrinsics.LJFF(this.country, defaultLocationData.country) && Intrinsics.LJFF(this.state, defaultLocationData.state) && Intrinsics.LJFF(this.county, defaultLocationData.county) && Intrinsics.LJFF(this.city, defaultLocationData.city) && this.isFallback == defaultLocationData.isFallback && Intrinsics.LJFF(this.fallBackLocation, defaultLocationData.fallBackLocation);
    }

    public final int hashCode() {
        return (((((((((this.country.hashCode() * 31) + this.state.hashCode()) * 31) + this.county.hashCode()) * 31) + this.city.hashCode()) * 31) + C786410Ut5.Z2(this.isFallback)) * 31) + this.fallBackLocation.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DefaultLocationData(country=");
        sbLIZ.append(this.country);
        sbLIZ.append(", state=");
        sbLIZ.append(this.state);
        sbLIZ.append(", county=");
        sbLIZ.append(this.county);
        sbLIZ.append(", city=");
        sbLIZ.append(this.city);
        sbLIZ.append(", isFallback=");
        sbLIZ.append(this.isFallback);
        sbLIZ.append(", fallBackLocation=");
        sbLIZ.append(this.fallBackLocation);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public DefaultLocationData() {
        this("", "", "", "", false, "");
    }

    public DefaultLocationData(String str, String str2, String str3, String str4, boolean z, String str5) {
        this.country = str;
        this.state = str2;
        this.county = str3;
        this.city = str4;
        this.isFallback = z;
        this.fallBackLocation = str5;
    }
}
