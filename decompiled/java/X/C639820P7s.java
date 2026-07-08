package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0P7s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C639820P7s implements InterfaceC1618170sD9<C639820P7s> {
    public final String LL;
    public final int LLILLJJLI;
    public final String LLILLL;

    public C639820P7s() {
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
        if (!(obj instanceof C639820P7s)) {
            return false;
        }
        C639820P7s c639820P7s = (C639820P7s) obj;
        return Intrinsics.LJFF(this.LL, c639820P7s.LL) && this.LLILLJJLI == c639820P7s.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c639820P7s.LLILLL);
    }

    public final int hashCode() {
        int iHashCode = ((this.LL.hashCode() * 31) + this.LLILLJJLI) * 31;
        String str = this.LLILLL;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> keyParams() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("impr_id", this.LL);
        linkedHashMap.put("cache_miss", Integer.valueOf(this.LLILLJJLI));
        linkedHashMap.put("local_service_intent", this.LLILLL);
        return linkedHashMap;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchDynamicTabContextState(dynamicImprId=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", isEngineCacheMiss=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", localServiceIntent=");
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

    public /* synthetic */ C639820P7s(int i) {
        this("", 2, null);
    }

    public C639820P7s(String str, int i, String str2) {
        this.LL = str;
        this.LLILLJJLI = i;
        this.LLILLL = str2;
    }
}
