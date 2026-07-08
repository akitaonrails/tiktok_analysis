package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wMs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1777960wMs {
    public final int LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1777960wMs)) {
            return false;
        }
        C1777960wMs c1777960wMs = (C1777960wMs) obj;
        return this.LIZ == c1777960wMs.LIZ && Intrinsics.LJFF(this.LIZIZ, c1777960wMs.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1777960wMs.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1777960wMs.LIZLLL);
    }

    public final int hashCode() {
        int i = this.LIZ * 31;
        String str = this.LIZIZ;
        int iHashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LIZJ;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LIZLLL;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RankBottomButton(action=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", schemaUrl=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", text=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", buttonType=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1777960wMs(int i, String str, String str2, String str3) {
        this.LIZ = i;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str3;
    }
}
