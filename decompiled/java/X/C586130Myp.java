package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Myp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C586130Myp {
    public final String LIZ;
    public final String LIZIZ;
    public final Boolean LIZJ;
    public final Integer LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C586130Myp)) {
            return false;
        }
        C586130Myp c586130Myp = (C586130Myp) obj;
        return Intrinsics.LJFF(this.LIZ, c586130Myp.LIZ) && Intrinsics.LJFF(this.LIZIZ, c586130Myp.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c586130Myp.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c586130Myp.LIZLLL);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        String str = this.LIZIZ;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.LIZJ;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.LIZLLL;
        return iHashCode3 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BrightnessInputArg(aid=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", jsonString=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", bizOpen=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", videoDuration=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C586130Myp(Boolean bool, Integer num, String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = bool;
        this.LIZLLL = num;
    }
}
