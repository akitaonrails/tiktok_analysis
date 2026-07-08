package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00F1, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00F1 implements InterfaceC1282004zy {
    public final String LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final String LLILZIL;
    public final String LLILZLL;
    public final String LLIZ;
    public final String LLIZLLLIL;

    public C00F1() {
        this(null, null, null, null, null, null, null, 255);
    }

    @Override // X.InterfaceC1282004zy
    public final boolean checkExtraParamKey() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C00F1)) {
            return false;
        }
        C00F1 c00f1 = (C00F1) obj;
        return Intrinsics.LJFF(this.LL, c00f1.LL) && Intrinsics.LJFF(this.LLILLJJLI, c00f1.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c00f1.LLILLL) && Intrinsics.LJFF(this.LLILZ, c00f1.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c00f1.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c00f1.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c00f1.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c00f1.LLIZLLLIL);
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
        String str6 = this.LLILZLL;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.LLIZ;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.LLIZLLLIL;
        return iHashCode7 + (str8 != null ? str8.hashCode() : 0);
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> keyParams() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("add_yours_id", this.LL);
        linkedHashMap.put("add_yours_title", this.LLILLJJLI);
        linkedHashMap.put("is_operation_set", this.LLILLL);
        linkedHashMap.put("author_id", this.LLILZ);
        linkedHashMap.put("aweme_type", this.LLILZIL);
        linkedHashMap.put("follow_status", this.LLILZLL);
        linkedHashMap.put("group_id", this.LLIZ);
        linkedHashMap.put("enter_from", this.LLIZLLLIL);
        return linkedHashMap;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AddYoursBottomButtonShowGroup(addYoursId=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", addYoursTitle=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", isOperationSet=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", authorId=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", awemeType=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", followStatus=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", groupId=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", enterFrom=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> filteredParams() {
        return keyParams();
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> getExtraParam() {
        return C2097608Jq.LJ();
    }

    public C00F1(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i) {
        str = (i & 1) != 0 ? null : str;
        str2 = (i & 2) != 0 ? null : str2;
        str3 = (i & 4) != 0 ? null : str3;
        str4 = (i & 16) != 0 ? null : str4;
        str5 = (i & 32) != 0 ? null : str5;
        str6 = (i & 64) != 0 ? null : str6;
        str7 = (i & 128) != 0 ? null : str7;
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = null;
        this.LLILZIL = str4;
        this.LLILZLL = str5;
        this.LLIZ = str6;
        this.LLIZLLLIL = str7;
    }
}
