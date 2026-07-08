package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00YV, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00YV implements InterfaceC1282004zy {
    public final String LL;
    public final String LLILLJJLI;

    @Override // X.InterfaceC1282004zy
    public final boolean checkExtraParamKey() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C00YV)) {
            return false;
        }
        C00YV c00yv = (C00YV) obj;
        return Intrinsics.LJFF(this.LL, c00yv.LL) && Intrinsics.LJFF(this.LLILLJJLI, c00yv.LLILLJJLI);
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode();
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> keyParams() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("tab_name", this.LL);
        linkedHashMap.put("tab_key", this.LLILLJJLI);
        return linkedHashMap;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PropTabParamGroup(propTabName=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", propTabKey=");
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

    public C00YV(String str, String str2) {
        this.LL = str;
        this.LLILLJJLI = str2;
    }
}
