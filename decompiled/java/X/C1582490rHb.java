package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rHb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1582490rHb implements InterfaceC1579050rC3 {
    public final Integer LIZ = null;
    public final Integer LIZIZ = null;
    public final Integer LIZJ = null;
    public final Integer LIZLLL = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1582490rHb)) {
            return false;
        }
        C1582490rHb c1582490rHb = (C1582490rHb) obj;
        return Intrinsics.LJFF(this.LIZ, c1582490rHb.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1582490rHb.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1582490rHb.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1582490rHb.LIZLLL);
    }

    public final int hashCode() {
        Integer num = this.LIZ;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.LIZIZ;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.LIZJ;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.LIZLLL;
        return iHashCode3 + (num4 != null ? num4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MultiSelect(customBackgroundColor=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", customForegroundColor=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", customUnselectedBackgroundColor=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", customUnselectedForegroundColor=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1579050rC3
    public final Integer LIZ() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC1579050rC3
    public final Integer LIZIZ() {
        return this.LIZJ;
    }
}
