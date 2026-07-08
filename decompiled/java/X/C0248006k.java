package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.006k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0248006k implements InterfaceC1282004zy {
    public final String LL;
    public final Integer LLILLJJLI;

    public C0248006k() {
        this(null, null);
    }

    @Override // X.InterfaceC1282004zy
    public final boolean checkExtraParamKey() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0248006k)) {
            return false;
        }
        C0248006k c0248006k = (C0248006k) obj;
        return Intrinsics.LJFF(this.LL, c0248006k.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0248006k.LLILLJJLI);
    }

    public final int hashCode() {
        String str = this.LL;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.LLILLJJLI;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> keyParams() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("enter_from", this.LL);
        linkedHashMap.put("aweme_type", this.LLILLJJLI);
        return linkedHashMap;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiSearchMobDataGroup(enterFrom=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", awemeType=");
        sbLIZ.append(this.LLILLJJLI);
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

    public C0248006k(String str, Integer num) {
        this.LL = str;
        this.LLILLJJLI = num;
    }
}
