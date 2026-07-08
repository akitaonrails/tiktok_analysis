package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00A3, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00A3 {
    public final String LIZ;
    public final String LIZIZ;
    public final C00A2 LIZJ;
    public final String LIZLLL;
    public final C118900cl LJ;
    public final boolean LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C00A3)) {
            return false;
        }
        C00A3 c00a3 = (C00A3) obj;
        return Intrinsics.LJFF(this.LIZ, c00a3.LIZ) && Intrinsics.LJFF(this.LIZIZ, c00a3.LIZIZ) && this.LIZJ == c00a3.LIZJ && Intrinsics.LJFF(this.LIZLLL, c00a3.LIZLLL) && Intrinsics.LJFF(this.LJ, c00a3.LJ) && this.LJFF == c00a3.LJFF;
    }

    public final int hashCode() {
        int iHashCode = ((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31;
        C118900cl c118900cl = this.LJ;
        return ((iHashCode + (c118900cl == null ? 0 : c118900cl.hashCode())) * 31) + C786410Ut5.Z2(this.LJFF);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ClusterTheme(themeId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", themeName=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", themeType=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", description=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", coverAsset=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", serverGenerated=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C00A3(String str, String str2, C00A2 c00a2, String str3) {
        this(str, str2, c00a2, str3, null, false);
    }

    public C00A3(String str, String str2, C00A2 c00a2, String str3, C118900cl c118900cl, boolean z) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = c00a2;
        this.LIZLLL = str3;
        this.LJ = c118900cl;
        this.LJFF = z;
    }
}
