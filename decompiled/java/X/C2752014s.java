package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.014s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2752014s implements InterfaceC1282004zy, InterfaceC2753014t {
    public final String LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final String LLILZIL;

    public C2752014s() {
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
        if (!(obj instanceof C2752014s)) {
            return false;
        }
        C2752014s c2752014s = (C2752014s) obj;
        return Intrinsics.LJFF(this.LL, c2752014s.LL) && Intrinsics.LJFF(this.LLILLJJLI, c2752014s.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c2752014s.LLILLL) && Intrinsics.LJFF(this.LLILZ, c2752014s.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c2752014s.LLILZIL);
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
        linkedHashMap.put("previous_page", this.LLILLL);
        linkedHashMap.put("add_yours_id", this.LLILZ);
        linkedHashMap.put("add_yours_title", this.LLILZIL);
        return linkedHashMap;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EnterAddYoursInviteParamGroup(enterFrom=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", enterMethod=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", previousPage=");
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

    public C2752014s(String str, String str2, String str3, String str4, String str5) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = str4;
        this.LLILZIL = str5;
    }
}
