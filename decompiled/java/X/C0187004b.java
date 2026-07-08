package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.004b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0187004b implements InterfaceC0241006d {
    public final Long LL;
    public final Integer LLILLJJLI;
    public final String LLILLL;
    public final Integer LLILZ;
    public final String LLILZIL;

    /* JADX WARN: Multi-variable type inference failed */
    public C0187004b() {
        this((Integer) null, (Integer) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), 31);
    }

    @Override // X.InterfaceC1282004zy
    public final boolean checkExtraParamKey() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0187004b)) {
            return false;
        }
        C0187004b c0187004b = (C0187004b) obj;
        return Intrinsics.LJFF(this.LL, c0187004b.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0187004b.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c0187004b.LLILLL) && Intrinsics.LJFF(this.LLILZ, c0187004b.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c0187004b.LLILZIL);
    }

    public final int hashCode() {
        Long l = this.LL;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Integer num = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.LLILZ;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.LLILZIL;
        return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> keyParams() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("swipe_pts", this.LL);
        linkedHashMap.put("duration", this.LLILLJJLI);
        linkedHashMap.put("fail_reason", this.LLILLL);
        linkedHashMap.put("result_code", this.LLILZ);
        linkedHashMap.put("prefetch_status", this.LLILZIL);
        return linkedHashMap;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PerfCaptionFirstRealDisplayParams(swipePts=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", duration=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", failReason=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", resultCode=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", prefetchStatus=");
        sbLIZ.append(this.LLILZIL);
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

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C0187004b(Integer num, Integer num2, String str, String str2, int i) {
        String str3 = str2;
        Integer num3 = num2;
        String str4 = str;
        this((i & 2) != 0 ? null : num, (i & 8) != 0 ? null : num3, (i & 4) != 0 ? null : str4, (i & 16) != 0 ? null : str3, (Long) null);
    }

    public C0187004b(Integer num, Integer num2, String str, String str2, Long l) {
        this.LL = l;
        this.LLILLJJLI = num;
        this.LLILLL = str;
        this.LLILZ = num2;
        this.LLILZIL = str2;
    }
}
