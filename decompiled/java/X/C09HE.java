package X;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.09HE, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09HE implements Serializable {
    public static final int $stable = 8;
    public final String LL;
    public final String LLILLJJLI;
    public final long LLILLL;
    public final Map<String, Object> LLILZ;

    public final C09HE copy(String str, String str2, long j, Map<String, Object> map) {
        return new C09HE(str, str2, j, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C09HE)) {
            return false;
        }
        C09HE c09he = (C09HE) obj;
        return Intrinsics.LJFF(this.LL, c09he.LL) && Intrinsics.LJFF(this.LLILLJJLI, c09he.LLILLJJLI) && this.LLILLL == c09he.LLILLL && Intrinsics.LJFF(this.LLILZ, c09he.LLILZ);
    }

    public int hashCode() {
        String str = this.LL;
        int iHashCode = (((((str == null ? 0 : str.hashCode()) * 31) + this.LLILLJJLI.hashCode()) * 31) + C786410Ut5.Y2(this.LLILLL)) * 31;
        Map<String, Object> map = this.LLILZ;
        return iHashCode + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("HistoryRecordModel(recordKey=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", imageUrl=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", timeStamp=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", extraParams=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX INFO: renamed from: deepCopy, reason: merged with bridge method [inline-methods] */
    public C09HE m20deepCopy() {
        String str = this.LL;
        String str2 = this.LLILLJJLI;
        long j = this.LLILLL;
        Map<String, Object> map = this.LLILZ;
        return new C09HE(str, str2, j, map != null ? new LinkedHashMap(map) : null);
    }

    public final Map<String, Object> getExtraParams() {
        return this.LLILZ;
    }

    public final String getImageUrl() {
        return this.LLILLJJLI;
    }

    public final String getRecordKey() {
        return this.LL;
    }

    public final long getTimeStamp() {
        return this.LLILLL;
    }

    public final boolean isSameAs(C09HE c09he) {
        if (c09he == null) {
            return false;
        }
        if (!Intrinsics.LJFF(c09he.LLILLJJLI, this.LLILLJJLI) && !Intrinsics.LJFF(this.LL, c09he.LL)) {
            return false;
        }
        return true;
    }

    public C09HE(String str, String str2, long j, Map<String, Object> map) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = j;
        this.LLILZ = map;
    }
}
