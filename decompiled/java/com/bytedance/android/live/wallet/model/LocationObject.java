package com.bytedance.android.live.wallet.model;

import X.C09CT;
import X.C2188811AlT;
import java.util.List;
import java.util.Locale;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes29.dex */
public final class LocationObject {
    public final LocationObject LIZ;

    @C09CT("asciName")
    public String asciName;

    @C09CT("code")
    public String code;

    @C09CT("description")
    public String description;

    @C09CT("geonameid")
    public int geonameId;

    @C09CT("name")
    public String name;

    @C09CT("subRegion")
    public List<LocationObject> subRegion;

    public final String LIZ() {
        String str = this.name;
        Locale locale = Locale.ROOT;
        int iLJJJ = a0.LJJJ(str.toLowerCase(locale), this.description.toLowerCase(locale), 0, false, 6);
        return (iLJJJ == -1 || this.description.length() + iLJJJ != this.name.length()) ? this.name : this.name.substring(0, iLJJJ);
    }

    public final String LIZIZ() {
        return this.name.length() == 0 ? "" : String.valueOf(this.name.charAt(0));
    }

    public LocationObject() {
        this.name = "";
        this.code = "";
        this.asciName = "";
        this.description = "";
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LocationObject(name='");
        sbLIZ.append(this.name);
        sbLIZ.append("', code='");
        sbLIZ.append(this.code);
        sbLIZ.append("', asciName='");
        sbLIZ.append(this.asciName);
        sbLIZ.append("')");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public LocationObject(LocationObject locationObject, String str, String str2, String str3, int i, String str4) {
        this();
        this.LIZ = locationObject;
        this.name = str;
        this.code = str2;
        this.asciName = str3;
        this.geonameId = i;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(' ');
        sbLIZ.append(str4);
        this.description = C2188811AlT.LIZIZ(sbLIZ);
    }
}
