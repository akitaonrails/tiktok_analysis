package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0e3P, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1073970e3P {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;

    /* JADX WARN: Illegal instructions before constructor call */
    public C1073970e3P() {
        String str = null;
        this(str, str, str, str, 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1073970e3P)) {
            return false;
        }
        C1073970e3P c1073970e3P = (C1073970e3P) obj;
        return Intrinsics.LJFF(this.LIZ, c1073970e3P.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1073970e3P.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1073970e3P.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1073970e3P.LIZLLL) && Intrinsics.LJFF(this.LJ, c1073970e3P.LJ);
    }

    public final int hashCode() {
        return (((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TrackInfo(enterFrom=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", enterMethod=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", previousPage=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", position=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", previousPosition=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1073970e3P(String str, String str2, String str3, String str4, int i) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) == 0 ? null : "");
    }

    public C1073970e3P(String str, String str2, String str3, String str4, String str5) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = str5;
    }
}
