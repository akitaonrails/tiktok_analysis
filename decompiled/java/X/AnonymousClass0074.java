package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0074, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class AnonymousClass0074 implements InterfaceC0241006d {
    public final String LL;
    public final String LLILLJJLI;
    public final String LLILLL;

    public AnonymousClass0074() {
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
        if (!(obj instanceof AnonymousClass0074)) {
            return false;
        }
        AnonymousClass0074 anonymousClass0074 = (AnonymousClass0074) obj;
        return Intrinsics.LJFF(this.LL, anonymousClass0074.LL) && Intrinsics.LJFF(this.LLILLJJLI, anonymousClass0074.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, anonymousClass0074.LLILLL);
    }

    public final int hashCode() {
        String str = this.LL;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LLILLL;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> keyParams() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("element_type", this.LL);
        linkedHashMap.put("original_lang", this.LLILLJJLI);
        linkedHashMap.put("prefetch_lang", this.LLILLL);
        return linkedHashMap;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PerfPrefetchStartParams(elementType=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", originalLang=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", targetLang=");
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

    public AnonymousClass0074(String str, String str2, String str3) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
    }
}
