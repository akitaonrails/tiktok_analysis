package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.017B, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C017B implements InterfaceC0241006d {
    public final String LL;
    public final String LLILLJJLI;
    public final String LLILLL;

    @Override // X.InterfaceC1282004zy
    public final boolean checkExtraParamKey() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C017B)) {
            return false;
        }
        C017B c017b = (C017B) obj;
        return Intrinsics.LJFF(this.LL, c017b.LL) && Intrinsics.LJFF(this.LLILLJJLI, c017b.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c017b.LLILLL);
    }

    public final int hashCode() {
        return (((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode();
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> keyParams() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("search_keyword", this.LL);
        linkedHashMap.put("search_id", this.LLILLJJLI);
        linkedHashMap.put("search_type", this.LLILLL);
        return linkedHashMap;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchCLACommonParams(searchKeyword=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", searchId=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", searchType=");
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

    public C017B(String str, String str2, String str3) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
    }
}
