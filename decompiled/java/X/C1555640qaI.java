package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qaI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1555640qaI extends C723430SZh {
    public final Class<? extends InterfaceC494301wD> LIZJ;
    public final boolean LIZLLL;
    public final InterfaceC665370Q7z LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1555640qaI)) {
            return false;
        }
        C1555640qaI c1555640qaI = (C1555640qaI) obj;
        return Intrinsics.LJFF(this.LIZJ, c1555640qaI.LIZJ) && this.LIZLLL == c1555640qaI.LIZLLL && Intrinsics.LJFF(this.LJ, c1555640qaI.LJ);
    }

    public final int hashCode() {
        return (((this.LIZJ.hashCode() * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31) + this.LJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GetAbilityPerformanceTrackParams(abilityClass=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", isFoundAbility=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", startScope=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1555640qaI(InterfaceC665370Q7z interfaceC665370Q7z, Class cls, boolean z) {
        this.LIZJ = cls;
        this.LIZLLL = z;
        this.LJ = interfaceC665370Q7z;
    }
}
