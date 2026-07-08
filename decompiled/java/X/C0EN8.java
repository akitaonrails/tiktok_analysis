package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EN8, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EN8 {
    public final String LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final String LIZLLL;
    public final boolean LJ;
    public final String LJFF;
    public final String LJI;
    public final EnumC1641380soa LJII;
    public final int LJIIIIZZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0EN8)) {
            return false;
        }
        C0EN8 c0en8 = (C0EN8) obj;
        return Intrinsics.LJFF(this.LIZ, c0en8.LIZ) && this.LIZIZ == c0en8.LIZIZ && this.LIZJ == c0en8.LIZJ && Intrinsics.LJFF(this.LIZLLL, c0en8.LIZLLL) && this.LJ == c0en8.LJ && Intrinsics.LJFF(this.LJFF, c0en8.LJFF) && Intrinsics.LJFF(this.LJI, c0en8.LJI) && this.LJII == c0en8.LJII && this.LJIIIIZZ == c0en8.LJIIIIZZ;
    }

    public final int hashCode() {
        int iHashCode = ((((((((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31) + this.LIZLLL.hashCode()) * 31) + C786410Ut5.Z2(this.LJ)) * 31;
        String str = this.LJFF;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LJI;
        return ((((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.LJII.hashCode()) * 31) + this.LJIIIIZZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MaskItemData(type=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", iconResId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", nameResId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", maskResId=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", isSelect=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", maskResPath=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", effectSdkExtra=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", downloadStatus=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", downloadProgress=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C0EN8(String str, int i, int i2, String str2) {
        this(str, i, i2, str2, false, null, null, EnumC1641380soa.PENDING, -1);
    }

    public static C0EN8 LIZ(C0EN8 c0en8, boolean z, String str, String str2, EnumC1641380soa enumC1641380soa, int i, int i2) {
        String str3;
        int i3;
        int i4;
        int i5 = i;
        EnumC1641380soa enumC1641380soa2 = enumC1641380soa;
        String str4 = str2;
        String str5 = str;
        boolean z2 = z;
        String str6 = null;
        if ((i2 & 1) != 0) {
            str3 = c0en8.LIZ;
        } else {
            str3 = null;
        }
        if ((i2 & 2) != 0) {
            i3 = c0en8.LIZIZ;
        } else {
            i3 = 0;
        }
        if ((i2 & 4) != 0) {
            i4 = c0en8.LIZJ;
        } else {
            i4 = 0;
        }
        if ((i2 & 8) != 0) {
            str6 = c0en8.LIZLLL;
        }
        if ((i2 & 16) != 0) {
            z2 = c0en8.LJ;
        }
        if ((i2 & 32) != 0) {
            str5 = c0en8.LJFF;
        }
        if ((i2 & 64) != 0) {
            str4 = c0en8.LJI;
        }
        if ((i2 & 128) != 0) {
            enumC1641380soa2 = c0en8.LJII;
        }
        if ((i2 & 256) != 0) {
            i5 = c0en8.LJIIIIZZ;
        }
        c0en8.getClass();
        return new C0EN8(str3, i3, i4, str6, z2, str5, str4, enumC1641380soa2, i5);
    }

    public C0EN8(String str, int i, int i2, String str2, boolean z, String str3, String str4, EnumC1641380soa enumC1641380soa, int i3) {
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = str2;
        this.LJ = z;
        this.LJFF = str3;
        this.LJI = str4;
        this.LJII = enumC1641380soa;
        this.LJIIIIZZ = i3;
    }
}
