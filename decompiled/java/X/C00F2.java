package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00F2, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00F2 implements InterfaceC1282004zy {
    public final String LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final String LLILZIL;

    public C00F2() {
        this(null, null, null, null, 31);
    }

    @Override // X.InterfaceC1282004zy
    public final boolean checkExtraParamKey() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C00F2)) {
            return false;
        }
        C00F2 c00f2 = (C00F2) obj;
        return Intrinsics.LJFF(this.LL, c00f2.LL) && Intrinsics.LJFF(this.LLILLJJLI, c00f2.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c00f2.LLILLL) && Intrinsics.LJFF(this.LLILZ, c00f2.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c00f2.LLILZIL);
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
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> keyParams() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("enter_from", this.LL);
        linkedHashMap.put("enter_method", this.LLILLJJLI);
        linkedHashMap.put("is_success", this.LLILLL);
        linkedHashMap.put("add_yours_id", this.LLILZ);
        linkedHashMap.put("add_yours_title", this.LLILZIL);
        return linkedHashMap;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SendAddYoursInvitationGroup(enterFrom=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", enterMethod=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", isSuccess=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", addYoursId=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", addYoursTitle=");
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

    public C00F2(String str, String str2, String str3, String str4, int i) {
        str = (i & 1) != 0 ? null : str;
        str2 = (i & 2) != 0 ? null : str2;
        str3 = (i & 8) != 0 ? null : str3;
        str4 = (i & 16) != 0 ? null : str4;
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = null;
        this.LLILZ = str3;
        this.LLILZIL = str4;
    }
}
