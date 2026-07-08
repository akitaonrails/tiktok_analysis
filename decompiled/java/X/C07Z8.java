package X;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07Z8, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07Z8 {
    public final EnumC1799930wwJ LIZ;
    public final boolean LIZIZ;
    public final Set<String> LIZJ;
    public final Set<String> LIZLLL;
    public final int LJ;
    public final C07Z4 LJFF;

    public C07Z8() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C07Z8)) {
            return false;
        }
        C07Z8 c07z8 = (C07Z8) obj;
        return this.LIZ == c07z8.LIZ && this.LIZIZ == c07z8.LIZIZ && Intrinsics.LJFF(this.LIZJ, c07z8.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c07z8.LIZLLL) && this.LJ == c07z8.LJ && Intrinsics.LJFF(null, null) && Intrinsics.LJFF(this.LJFF, c07z8.LJFF);
    }

    public final int hashCode() {
        return (((((((((this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ) * 31 * 31) + this.LJFF.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MinisRevisitMissionConfig(type=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", enable=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", allowedRegions=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", blockedRegions=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", cooldownDays=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", reward=");
        sbLIZ.append((Object) null);
        sbLIZ.append(", cta=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C07Z8(EnumC1799930wwJ enumC1799930wwJ, boolean z, Set set, Set set2, int i, int i2) {
        C07Z4 c07z4;
        z = (i2 & 2) != 0 ? false : z;
        set = (i2 & 4) != 0 ? C08CX.INSTANCE : set;
        set2 = (i2 & 8) != 0 ? C08CX.INSTANCE : set2;
        i = (i2 & 16) != 0 ? 14 : i;
        if ((i2 & 64) != 0) {
            c07z4 = new C07Z4(enumC1799930wwJ);
        } else {
            c07z4 = null;
        }
        this.LIZ = enumC1799930wwJ;
        this.LIZIZ = z;
        this.LIZJ = set;
        this.LIZLLL = set2;
        this.LJ = i;
        this.LJFF = c07z4;
    }
}
