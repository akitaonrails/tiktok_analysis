package X;

import java.io.Serializable;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gxH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1185490gxH implements Serializable, InterfaceC2753014t {
    public static final C1188730h2V Companion = new C1188730h2V();
    public final Integer LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final String LLILZIL;
    public final Map<String, Object> LLILZLL;

    public C1185490gxH() {
        this(null, null, null, null, null, null);
    }

    public final C1185490gxH copy(Integer num, String str, String str2, String str3, String str4, Map<String, ? extends Object> map) {
        return new C1185490gxH(num, str, str2, str3, str4, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1185490gxH)) {
            return false;
        }
        C1185490gxH c1185490gxH = (C1185490gxH) obj;
        return Intrinsics.LJFF(this.LL, c1185490gxH.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1185490gxH.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1185490gxH.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1185490gxH.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1185490gxH.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1185490gxH.LLILZLL);
    }

    public String getSourceId() {
        return "PoiAnchorMobData";
    }

    public int hashCode() {
        Integer num = this.LL;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LLILZ;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LLILZIL;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Map<String, Object> map = this.LLILZLL;
        return iHashCode5 + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiAnchorMobData(multiAnchor=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", groupId=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", authorId=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", musicId=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", logPb=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", extraParam=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String getAuthorId() {
        return this.LLILLL;
    }

    public final Map<String, Object> getExtraParam() {
        return this.LLILZLL;
    }

    public final String getGroupId() {
        return this.LLILLJJLI;
    }

    public final String getLogPb() {
        return this.LLILZIL;
    }

    public final Integer getMultiAnchor() {
        return this.LL;
    }

    public final String getMusicId() {
        return this.LLILZ;
    }

    public C1185490gxH(Integer num, String str, String str2, String str3, String str4, Map<String, ? extends Object> map) {
        this.LL = num;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = str4;
        this.LLILZLL = map;
    }
}
