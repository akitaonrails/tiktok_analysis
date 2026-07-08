package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.014E, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C014E implements InterfaceC0241006d {
    public String LL;
    public String LLILLJJLI;
    public Long LLILLL;

    public C014E() {
        this(0);
    }

    @Override // X.InterfaceC1282004zy
    public final boolean checkExtraParamKey() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C014E)) {
            return false;
        }
        C014E c014e = (C014E) obj;
        return Intrinsics.LJFF(this.LL, c014e.LL) && Intrinsics.LJFF(this.LLILLJJLI, c014e.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c014e.LLILLL);
    }

    public final int hashCode() {
        String str = this.LL;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.LLILLL;
        return iHashCode2 + (l != null ? l.hashCode() : 0);
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> keyParams() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("title_not_translated_reason", this.LL);
        linkedHashMap.put("translate_title_status", this.LLILLJJLI);
        linkedHashMap.put("desc_prefetch_advanced_by_ms", this.LLILLL);
        return linkedHashMap;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VideoPlayTitleExtraParams(titleNotTranslatedReason=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", translateTitleStatus=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", descPrefetchAdvancedByMs=");
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

    public C014E(int i) {
        this.LL = null;
        this.LLILLJJLI = null;
        this.LLILLL = null;
    }
}
