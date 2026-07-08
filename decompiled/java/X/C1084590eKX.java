package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0eKX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1084590eKX {
    public final int LIZ;
    public final String LIZIZ;
    public final boolean LIZJ;
    public final long LIZLLL;
    public final long LJ;
    public final EnumC585020Mx2 LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1084590eKX)) {
            return false;
        }
        C1084590eKX c1084590eKX = (C1084590eKX) obj;
        return this.LIZ == c1084590eKX.LIZ && Intrinsics.LJFF(this.LIZIZ, c1084590eKX.LIZIZ) && this.LIZJ == c1084590eKX.LIZJ && this.LIZLLL == c1084590eKX.LIZLLL && this.LJ == c1084590eKX.LJ && this.LJFF == c1084590eKX.LJFF;
    }

    public final int hashCode() {
        return (((((((((this.LIZ * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + C786410Ut5.Y2(this.LIZLLL)) * 31) + C786410Ut5.Y2(this.LJ)) * 31) + this.LJFF.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InteractionGuideData(guideType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", guideId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", isWeakGuidance=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", roomShowCount=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", dayShowCount=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", frequencyScheme=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1084590eKX(int i, String str, boolean z, long j, long j2, EnumC585020Mx2 enumC585020Mx2) {
        this.LIZ = i;
        this.LIZIZ = str;
        this.LIZJ = z;
        this.LIZLLL = j;
        this.LJ = j2;
        this.LJFF = enumC585020Mx2;
    }
}
