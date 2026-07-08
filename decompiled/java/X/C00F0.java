package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00F0, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00F0 implements InterfaceC1282004zy {
    public final Long LL;
    public final String LLILLJJLI;
    public final String LLILLL;

    public C00F0() {
        this(null, null, null);
    }

    @Override // X.InterfaceC1282004zy
    public final boolean checkExtraParamKey() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C00F0)) {
            return false;
        }
        C00F0 c00f0 = (C00F0) obj;
        return Intrinsics.LJFF(this.LL, c00f0.LL) && Intrinsics.LJFF(this.LLILLJJLI, c00f0.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c00f0.LLILLL);
    }

    public final int hashCode() {
        Long l = this.LL;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LLILLL;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> keyParams() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("add_yours_id", this.LL);
        linkedHashMap.put("add_yours_title", this.LLILLJJLI);
        linkedHashMap.put("enter_from", this.LLILLL);
        return linkedHashMap;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FavouriteAddYoursGroup(addYoursId=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", addYoursTitle=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", enterFrom=");
        sbLIZ.append(this.LLILLL);
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

    public C00F0(Long l, String str, String str2) {
        this.LL = l;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
    }
}
