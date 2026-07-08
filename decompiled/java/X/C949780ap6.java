package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ap6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C949780ap6 {
    public final EnumC949800ap8 LIZ;
    public final boolean LIZIZ;
    public final String LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;

    public C949780ap6() {
        this(null, false, null, false, false, 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C949780ap6)) {
            return false;
        }
        C949780ap6 c949780ap6 = (C949780ap6) obj;
        return this.LIZ == c949780ap6.LIZ && this.LIZIZ == c949780ap6.LIZIZ && Intrinsics.LJFF(this.LIZJ, c949780ap6.LIZJ) && this.LIZLLL == c949780ap6.LIZLLL && this.LJ == c949780ap6.LJ;
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31;
        String str = this.LIZJ;
        return ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31) + C786410Ut5.Z2(this.LJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LegacyHints(origin=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isRandomMatch=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", originLinkId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", isAdminOutRoomInvite=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", isApplySuspend=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C949780ap6(EnumC949800ap8 enumC949800ap8, boolean z, String str, boolean z2, boolean z3, int i) {
        enumC949800ap8 = (i & 1) != 0 ? EnumC949800ap8.GRANTED : enumC949800ap8;
        z = (i & 2) != 0 ? false : z;
        str = (i & 4) != 0 ? null : str;
        z2 = (i & 8) != 0 ? false : z2;
        z3 = (i & 16) != 0 ? false : z3;
        this.LIZ = enumC949800ap8;
        this.LIZIZ = z;
        this.LIZJ = str;
        this.LIZLLL = z2;
        this.LJ = z3;
    }
}
