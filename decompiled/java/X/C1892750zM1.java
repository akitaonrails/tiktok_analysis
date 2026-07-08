package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0zM1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1892750zM1 {
    public final String LIZ;
    public final EnumC756810TmR LIZIZ;
    public final boolean LIZJ;
    public final int LIZLLL;
    public final long LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1892750zM1)) {
            return false;
        }
        C1892750zM1 c1892750zM1 = (C1892750zM1) obj;
        return Intrinsics.LJFF(this.LIZ, c1892750zM1.LIZ) && this.LIZIZ == c1892750zM1.LIZIZ && this.LIZJ == c1892750zM1.LIZJ && this.LIZLLL == c1892750zM1.LIZLLL && this.LJ == c1892750zM1.LJ;
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        EnumC756810TmR enumC756810TmR = this.LIZIZ;
        return ((((((iHashCode + (enumC756810TmR == null ? 0 : enumC756810TmR.hashCode())) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + this.LIZLLL) * 31) + C786410Ut5.Y2(this.LJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LiveShopBagManagedState(bizType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", slotId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", visible=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", productCount=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", timestamp=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1892750zM1(String str, EnumC756810TmR enumC756810TmR, boolean z) {
        this(str, enumC756810TmR, z, 0, 0L);
    }

    public C1892750zM1(String str, EnumC756810TmR enumC756810TmR, boolean z, int i, long j) {
        this.LIZ = str;
        this.LIZIZ = enumC756810TmR;
        this.LIZJ = z;
        this.LIZLLL = i;
        this.LJ = j;
    }
}
