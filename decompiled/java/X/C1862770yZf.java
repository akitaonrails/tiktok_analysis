package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yZf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1862770yZf {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final String LJI;
    public final String LJII;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1862770yZf)) {
            return false;
        }
        C1862770yZf c1862770yZf = (C1862770yZf) obj;
        return Intrinsics.LJFF(this.LIZ, c1862770yZf.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1862770yZf.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1862770yZf.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1862770yZf.LIZLLL) && Intrinsics.LJFF(this.LJ, c1862770yZf.LJ) && Intrinsics.LJFF(this.LJFF, c1862770yZf.LJFF) && Intrinsics.LJFF(this.LJI, c1862770yZf.LJI) && Intrinsics.LJFF(this.LJII, c1862770yZf.LJII);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31;
        String str = this.LIZLLL;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LJ;
        int iHashCode3 = (((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.LJFF.hashCode()) * 31) + this.LJI.hashCode()) * 31;
        String str3 = this.LJII;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoEnterKeyParamsForDuplicateEntryCheck(enterFrom=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", enterMethod=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", processId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", inputContent=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", autoSendMsgContent=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", searchId=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", gid=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", duplicateEnterId=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1862770yZf() {
        this("", "", "", null, null, "", "", null);
    }

    public C1862770yZf(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = str5;
        this.LJFF = str6;
        this.LJI = str7;
        this.LJII = str8;
    }
}
