package com.bytedance.android.live.wallet.model;

import X.C09CT;
import X.C2188811AlT;
import java.util.Map;

/* JADX INFO: loaded from: classes18.dex */
public final class LocationAddress {

    @C09CT("city")
    public LocationObject city;

    @C09CT("county")
    public LocationObject county;

    @C09CT("province")
    public LocationObject province;

    @C09CT("region")
    public LocationObject region;

    @C09CT("state")
    public LocationObject state;

    public final String LIZ() {
        String str;
        LocationObject locationObject = this.region;
        return (locationObject == null || (str = locationObject.code) == null) ? "" : str;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LocationObject(region='");
        sbLIZ.append(this.region);
        sbLIZ.append("', state='");
        sbLIZ.append(this.state);
        sbLIZ.append("', county='");
        sbLIZ.append(this.county);
        sbLIZ.append("', city='");
        sbLIZ.append(this.city);
        sbLIZ.append("', province='");
        sbLIZ.append(this.province);
        sbLIZ.append("')");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public LocationAddress(Map<String, LocationObject> map) {
        if (map.containsKey("region")) {
            this.region = map.get("region");
        }
        if (map.containsKey("state")) {
            this.state = map.get("state");
        }
        if (map.containsKey("county")) {
            this.county = map.get("county");
        }
        if (map.containsKey("city")) {
            this.city = map.get("city");
        }
        if (map.containsKey("province")) {
            this.province = map.get("province");
        }
    }
}
