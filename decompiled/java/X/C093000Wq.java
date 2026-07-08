package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00Wq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C093000Wq implements InterfaceC1282004zy {
    public final String LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final Map<String, String> LLILZ;

    @Override // X.InterfaceC1282004zy
    public final boolean checkExtraParamKey() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C093000Wq)) {
            return false;
        }
        C093000Wq c093000Wq = (C093000Wq) obj;
        return Intrinsics.LJFF(this.LL, c093000Wq.LL) && Intrinsics.LJFF(this.LLILLJJLI, c093000Wq.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c093000Wq.LLILLL) && Intrinsics.LJFF(this.LLILZ, c093000Wq.LLILZ);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31;
        Map<String, String> map = this.LLILZ;
        return iHashCode + (map == null ? 0 : map.hashCode());
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> keyParams() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("creation_id", this.LL);
        linkedHashMap.put("content_type", this.LLILLJJLI);
        linkedHashMap.put("shoot_way", this.LLILLL);
        return linkedHashMap;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiCreationDataGroup(createId=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", contentType=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", shootWay=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", params=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> getExtraParam() {
        Map<String, String> map = this.LLILZ;
        return map == null ? new LinkedHashMap() : map;
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> filteredParams() {
        return keyParams();
    }

    public C093000Wq(String str, String str2, String str3, Map<String, String> map) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = map;
    }
}
