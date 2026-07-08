package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07TS, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07TS implements InterfaceC1282004zy {
    public static final C07TT LLILLL = new Object() { // from class: X.07TT
    };
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
        if (!(obj instanceof C07TS)) {
            return false;
        }
        C07TS c07ts = (C07TS) obj;
        return Intrinsics.LJFF(this.LL, c07ts.LL) && Intrinsics.LJFF(this.LLILLJJLI, c07ts.LLILLJJLI);
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode();
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> keyParams() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("prop_id", this.LL);
        linkedHashMap.put("prop_resource_id", this.LLILLJJLI);
        return linkedHashMap;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PropIdParamGroup(propId=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", resourceId=");
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

    public C07TS(String str, String str2) {
        this.LL = str;
        this.LLILLJJLI = str2;
    }
}
