package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.006l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0249006l implements InterfaceC1282004zy {
    public final Integer LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final Integer LLILZ;
    public final String LLILZIL;

    public C0249006l() {
        this(null, null, null, null, null);
    }

    @Override // X.InterfaceC1282004zy
    public final boolean checkExtraParamKey() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0249006l)) {
            return false;
        }
        C0249006l c0249006l = (C0249006l) obj;
        return Intrinsics.LJFF(this.LL, c0249006l.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0249006l.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c0249006l.LLILLL) && Intrinsics.LJFF(this.LLILZ, c0249006l.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c0249006l.LLILZIL);
    }

    public final int hashCode() {
        Integer num = this.LL;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.LLILZ;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str3 = this.LLILZIL;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> keyParams() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("aweme_type", this.LL);
        linkedHashMap.put("author_id", this.LLILLJJLI);
        linkedHashMap.put("group_id", this.LLILLL);
        linkedHashMap.put("follow_status", this.LLILZ);
        linkedHashMap.put("add_yours_from_group_content", this.LLILZIL);
        return linkedHashMap;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EnterAddYoursDetailAwemeGroup(awemeType=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", authorId=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", groupId=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", followStatue=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", addYoursFromGroupContent=");
        sbLIZ.append(this.LLILZIL);
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

    public C0249006l(Integer num, Integer num2, String str, String str2, String str3) {
        this.LL = num;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = num2;
        this.LLILZIL = str3;
    }
}
