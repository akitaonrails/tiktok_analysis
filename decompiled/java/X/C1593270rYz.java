package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rYz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1593270rYz {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final EnumC1083510eIn LIZLLL;
    public final String LJ;
    public final boolean LJFF;
    public final boolean LJI;
    public final Map<EnumC1593230rYv, C1593240rYw> LJII;
    public final Map<String, Long> LJIIIIZZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1593270rYz)) {
            return false;
        }
        C1593270rYz c1593270rYz = (C1593270rYz) obj;
        return Intrinsics.LJFF(this.LIZ, c1593270rYz.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1593270rYz.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1593270rYz.LIZJ) && this.LIZLLL == c1593270rYz.LIZLLL && Intrinsics.LJFF(this.LJ, c1593270rYz.LJ) && this.LJFF == c1593270rYz.LJFF && this.LJI == c1593270rYz.LJI && Intrinsics.LJFF(this.LJII, c1593270rYz.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c1593270rYz.LJIIIIZZ);
    }

    public final int hashCode() {
        int iHashCode = ((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31;
        String str = this.LJ;
        return ((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + C786410Ut5.Z2(this.LJFF)) * 31) + C786410Ut5.Z2(this.LJI)) * 31) + this.LJII.hashCode()) * 31) + this.LJIIIIZZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TabSwitchReportSnapshot(tabName=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", enterFrom=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", enterMethod=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", location=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", mobLocation=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", isClickEnter=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", isFirstSwitch=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", pointsByType=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", sceneDurationByName=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1593270rYz(String str, String str2, String str3, EnumC1083510eIn enumC1083510eIn, String str4, boolean z, boolean z2, Map<EnumC1593230rYv, C1593240rYw> map, Map<String, Long> map2) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = enumC1083510eIn;
        this.LJ = str4;
        this.LJFF = z;
        this.LJI = z2;
        this.LJII = map;
        this.LJIIIIZZ = map2;
    }
}
