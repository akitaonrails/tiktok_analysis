package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hHT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1198010hHT implements InterfaceC2753014t {
    public final String LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final String LLILZIL;
    public final Integer LLILZLL;
    public final String LLIZ;
    public final EnumC1198680hIY LLIZLLLIL;
    public final Map<String, String> LLJ;

    public C1198010hHT() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1198010hHT)) {
            return false;
        }
        C1198010hHT c1198010hHT = (C1198010hHT) obj;
        return Intrinsics.LJFF(this.LL, c1198010hHT.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1198010hHT.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1198010hHT.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1198010hHT.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1198010hHT.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1198010hHT.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c1198010hHT.LLIZ) && this.LLIZLLLIL == c1198010hHT.LLIZLLLIL && Intrinsics.LJFF(this.LLJ, c1198010hHT.LLJ);
    }

    public final int hashCode() {
        String str = this.LL;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LLILZ;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.LLILZIL;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.LLILZLL;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        String str6 = this.LLIZ;
        int iHashCode7 = (((iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31) + this.LLIZLLLIL.hashCode()) * 31;
        Map<String, String> map = this.LLJ;
        return iHashCode7 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiSearchSourceData(createId=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", contentType=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", shootWay=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", enterMethod=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", enterFrom=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", awemeType=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", searchId=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", pageScene=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(", params=");
        sbLIZ.append(this.LLJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1198010hHT(String str, String str2, String str3, String str4, String str5, Integer num, String str6, Map map) {
        EnumC1198680hIY enumC1198680hIY = EnumC1198680hIY.ADD_LOCATION;
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = str4;
        this.LLILZIL = str5;
        this.LLILZLL = num;
        this.LLIZ = str6;
        this.LLIZLLLIL = enumC1198680hIY;
        this.LLJ = map;
    }
}
