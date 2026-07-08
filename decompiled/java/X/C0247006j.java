package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.006j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0247006j implements InterfaceC1282004zy {
    public final Integer LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;

    public C0247006j() {
        this(null, null, null, null);
    }

    @Override // X.InterfaceC1282004zy
    public final boolean checkExtraParamKey() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0247006j)) {
            return false;
        }
        C0247006j c0247006j = (C0247006j) obj;
        return Intrinsics.LJFF(this.LL, c0247006j.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0247006j.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c0247006j.LLILLL) && Intrinsics.LJFF(this.LLILZ, c0247006j.LLILZ);
    }

    public final int hashCode() {
        Integer num = this.LL;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LLILZ;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> keyParams() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("aweme_type", this.LL);
        linkedHashMap.put("author_id", this.LLILLJJLI);
        linkedHashMap.put("group_id", this.LLILLL);
        linkedHashMap.put("label", this.LLILZ);
        return linkedHashMap;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AddYoursClientShowAwemeGroup(awemeType=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", authorId=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", groupId=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", label=");
        sbLIZ.append(this.LLILZ);
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

    public C0247006j(Integer num, String str, String str2, String str3) {
        this.LL = num;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = str3;
    }
}
