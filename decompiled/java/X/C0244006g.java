package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.006g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0244006g implements InterfaceC1282004zy {
    public final String LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;

    public C0244006g() {
        this(null, null, null, null);
    }

    @Override // X.InterfaceC1282004zy
    public final boolean checkExtraParamKey() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0244006g)) {
            return false;
        }
        C0244006g c0244006g = (C0244006g) obj;
        return Intrinsics.LJFF(this.LL, c0244006g.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0244006g.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c0244006g.LLILLL) && Intrinsics.LJFF(this.LLILZ, c0244006g.LLILZ);
    }

    public final int hashCode() {
        String str = this.LL;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LLILZ;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> keyParams() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("enter_from", this.LL);
        linkedHashMap.put("enter_method", this.LLILLJJLI);
        linkedHashMap.put("added_topic_cnt", this.LLILLL);
        linkedHashMap.put("to_add_topic_cnt", this.LLILZ);
        return linkedHashMap;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EnterAddYoursTopicListGroup(enterFrom=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", enterMethod=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", addedTopicCnt=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", toAddTopicCnt=");
        sbLIZ.append(this.LLILZ);
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

    public C0244006g(String str, String str2, String str3, String str4) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = str4;
    }
}
