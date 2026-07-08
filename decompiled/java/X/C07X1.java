package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07X1, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07X1 {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C07X1)) {
            return false;
        }
        C07X1 c07x1 = (C07X1) obj;
        return Intrinsics.LJFF(this.LIZ, c07x1.LIZ) && Intrinsics.LJFF(this.LIZIZ, c07x1.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c07x1.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c07x1.LIZLLL) && Intrinsics.LJFF(this.LJ, c07x1.LJ);
    }

    public final int hashCode() {
        return (((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MusicConfig(aid=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", host=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", language=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", regionKey=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", musicDir=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C07X1() {
        this("1233", "", "", "", "");
    }

    public C07X1(String str, String str2, String str3, String str4, String str5) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = str5;
    }
}
