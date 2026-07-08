package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.013V, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C013V implements InterfaceC0241006d {
    public final String LL;
    public final Integer LLILLJJLI;
    public final Integer LLILLL;
    public final String LLILZ;
    public final String LLILZIL;
    public final Integer LLILZLL;
    public final Integer LLIZ;

    public C013V() {
        this(null, null, null, null, null, null, null);
    }

    @Override // X.InterfaceC1282004zy
    public final boolean checkExtraParamKey() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C013V)) {
            return false;
        }
        C013V c013v = (C013V) obj;
        return Intrinsics.LJFF(this.LL, c013v.LL) && Intrinsics.LJFF(this.LLILLJJLI, c013v.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c013v.LLILLL) && Intrinsics.LJFF(this.LLILZ, c013v.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c013v.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c013v.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c013v.LLIZ);
    }

    public final int hashCode() {
        String str = this.LL;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.LLILZ;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LLILZIL;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num3 = this.LLILZLL;
        int iHashCode6 = (iHashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.LLIZ;
        return iHashCode6 + (num4 != null ? num4.hashCode() : 0);
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> keyParams() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("prefetch_status", this.LL);
        linkedHashMap.put("duration", this.LLILLJJLI);
        linkedHashMap.put("error_code", this.LLILLL);
        linkedHashMap.put("error_msg", this.LLILZ);
        linkedHashMap.put("hit_cache", this.LLILZIL);
        linkedHashMap.put("server_duration", this.LLILZLL);
        linkedHashMap.put("ailab_duration", this.LLIZ);
        return linkedHashMap;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PerfPrefetchEndParams(status=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", duration=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", errorCode=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", errorMsg=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", hitCacheType=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", serverDuration=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", ailabDuration=");
        sbLIZ.append(this.LLIZ);
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

    public C013V(Integer num, String str, String str2, Integer num2, Integer num3, Integer num4, String str3) {
        this.LL = str;
        this.LLILLJJLI = num;
        this.LLILLL = num2;
        this.LLILZ = str2;
        this.LLILZIL = str3;
        this.LLILZLL = num3;
        this.LLIZ = num4;
    }
}
