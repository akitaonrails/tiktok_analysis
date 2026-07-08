package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lHC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1351600lHC {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1351600lHC)) {
            return false;
        }
        C1351600lHC c1351600lHC = (C1351600lHC) obj;
        return Intrinsics.LJFF(this.LIZ, c1351600lHC.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1351600lHC.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1351600lHC.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1351600lHC.LIZLLL);
    }

    public final int hashCode() {
        return (((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SchemaContext(sourceGroupId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", seriesEnterEntrance=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", enterFrom=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", outreachContent=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1351600lHC(String str, String str2, String str3, String str4) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
    }
}
