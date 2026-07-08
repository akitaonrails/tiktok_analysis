package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.004a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0186004a implements InterfaceC0241006d {
    public final Integer LL;
    public final String LLILLJJLI;
    public final Integer LLILLL;

    public C0186004a() {
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
        if (!(obj instanceof C0186004a)) {
            return false;
        }
        C0186004a c0186004a = (C0186004a) obj;
        return Intrinsics.LJFF(this.LL, c0186004a.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0186004a.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c0186004a.LLILLL);
    }

    public final int hashCode() {
        Integer num = this.LL;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.LLILLL;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> keyParams() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("duration", this.LL);
        linkedHashMap.put("fail_reason", this.LLILLJJLI);
        linkedHashMap.put("result_code", this.LLILLL);
        return linkedHashMap;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PerfDescFirstRealDisplayParams(duration=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", failReason=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", resultCode=");
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

    public C0186004a(Integer num, String str, Integer num2) {
        this.LL = num;
        this.LLILLJJLI = str;
        this.LLILLL = num2;
    }
}
