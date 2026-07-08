package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.006u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0258006u implements InterfaceC0241006d {
    public final String LL = "personal_homepage";
    public final String LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final String LLILZIL;

    @Override // X.InterfaceC1282004zy
    public final boolean checkExtraParamKey() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0258006u)) {
            return false;
        }
        C0258006u c0258006u = (C0258006u) obj;
        return Intrinsics.LJFF(this.LL, c0258006u.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0258006u.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c0258006u.LLILLL) && Intrinsics.LJFF(this.LLILZ, c0258006u.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c0258006u.LLILZIL);
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
        linkedHashMap.put("click_type", this.LLILLJJLI);
        linkedHashMap.put("action_type", this.LLILLL);
        linkedHashMap.put("group_id", this.LLILZ);
        linkedHashMap.put("page_type", this.LLILZIL);
        return linkedHashMap;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DubbingAuthorizationOperationParam(enterFrom=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", clickType=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", actionType=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", groupId=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", pageType=");
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

    public C0258006u(String str, String str2, String str3, String str4) {
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = str4;
    }
}
