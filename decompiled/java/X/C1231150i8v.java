package X;

import java.io.Serializable;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0i8v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1231150i8v implements Serializable, InterfaceC111300bX {
    public final String LL;
    public final long LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final Map<String, String> LLILZIL;
    public final Map<String, String> LLILZLL;
    public final EnumC1230500i7s LLIZ;
    public final String LLIZLLLIL;

    public final C1231150i8v copy(String str, long j, String str2, String str3, Map<String, String> map, Map<String, String> map2, EnumC1230500i7s enumC1230500i7s, String str4) {
        return new C1231150i8v(str, j, str2, str3, map, map2, enumC1230500i7s, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1231150i8v)) {
            return false;
        }
        C1231150i8v c1231150i8v = (C1231150i8v) obj;
        return Intrinsics.LJFF(this.LL, c1231150i8v.LL) && this.LLILLJJLI == c1231150i8v.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c1231150i8v.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1231150i8v.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1231150i8v.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1231150i8v.LLILZLL) && this.LLIZ == c1231150i8v.LLIZ && Intrinsics.LJFF(this.LLIZLLLIL, c1231150i8v.LLIZLLLIL);
    }

    public int hashCode() {
        int iHashCode = ((this.LL.hashCode() * 31) + C786410Ut5.Y2(this.LLILLJJLI)) * 31;
        String str = this.LLILLL;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LLILZ;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Map<String, String> map = this.LLILZIL;
        int iHashCode4 = (iHashCode3 + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, String> map2 = this.LLILZLL;
        int iHashCode5 = (iHashCode4 + (map2 == null ? 0 : map2.hashCode())) * 31;
        EnumC1230500i7s enumC1230500i7s = this.LLIZ;
        int iHashCode6 = (iHashCode5 + (enumC1230500i7s == null ? 0 : enumC1230500i7s.hashCode())) * 31;
        String str3 = this.LLIZLLLIL;
        return iHashCode6 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FanGroupJoinPanelParams(conversationId=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", convShortId=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", etGroupType=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", enterMethod=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", extraMap=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", followLogParams=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", joinGroupSource=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", enterFrom=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final long getConvShortId() {
        return this.LLILLJJLI;
    }

    public final String getConversationId() {
        return this.LL;
    }

    public final String getEnterFrom() {
        return this.LLIZLLLIL;
    }

    public final String getEnterMethod() {
        return this.LLILZ;
    }

    public final String getEtGroupType() {
        return this.LLILLL;
    }

    public final Map<String, String> getExtraMap() {
        return this.LLILZIL;
    }

    public final Map<String, String> getFollowLogParams() {
        return this.LLILZLL;
    }

    public final EnumC1230500i7s getJoinGroupSource() {
        return this.LLIZ;
    }

    public C1231150i8v(String str, long j, String str2, String str3, Map<String, String> map, Map<String, String> map2, EnumC1230500i7s enumC1230500i7s, String str4) {
        this.LL = str;
        this.LLILLJJLI = j;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = map;
        this.LLILZLL = map2;
        this.LLIZ = enumC1230500i7s;
        this.LLIZLLLIL = str4;
    }
}
