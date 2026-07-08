package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00F3, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00F3 implements InterfaceC1282004zy {
    public final Long LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;

    public C00F3() {
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
        if (!(obj instanceof C00F3)) {
            return false;
        }
        C00F3 c00f3 = (C00F3) obj;
        return Intrinsics.LJFF(this.LL, c00f3.LL) && Intrinsics.LJFF(this.LLILLJJLI, c00f3.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c00f3.LLILLL) && Intrinsics.LJFF(this.LLILZ, c00f3.LLILZ);
    }

    public final int hashCode() {
        Long l = this.LL;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
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
        linkedHashMap.put("add_yours_id", this.LL);
        linkedHashMap.put("add_yours_title", this.LLILLJJLI);
        linkedHashMap.put("add_yours_initiator_uid", this.LLILLL);
        linkedHashMap.put("is_invited", this.LLILZ);
        return linkedHashMap;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EnterAddYoursDetailTopicGroup(addYoursId=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", addYoursTitle=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", addYoursInitiatorUid=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", isInvited=");
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

    public C00F3(Long l, String str, String str2, String str3) {
        this.LL = l;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = str3;
    }
}
