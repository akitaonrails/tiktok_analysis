package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0LXg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C544540LXg {
    public final Float LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final Integer LIZLLL;

    public C544540LXg() {
        this(null, null, null, 15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C544540LXg)) {
            return false;
        }
        C544540LXg c544540LXg = (C544540LXg) obj;
        return Intrinsics.LJFF(this.LIZ, c544540LXg.LIZ) && Intrinsics.LJFF(this.LIZIZ, c544540LXg.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c544540LXg.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c544540LXg.LIZLLL);
    }

    public final int hashCode() {
        Float f = this.LIZ;
        int iHashCode = (f == null ? 0 : f.hashCode()) * 31;
        String str = this.LIZIZ;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LIZJ;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.LIZLLL;
        return iHashCode3 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIGCWorkflowLegacyImageInfo(gender=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", skinColor=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", extra=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", imageType=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C544540LXg(Float f, String str, Integer num, int i) {
        f = (i & 1) != 0 ? null : f;
        str = (i & 2) != 0 ? null : str;
        num = (i & 8) != 0 ? null : num;
        this.LIZ = f;
        this.LIZIZ = str;
        this.LIZJ = null;
        this.LIZLLL = num;
    }
}
