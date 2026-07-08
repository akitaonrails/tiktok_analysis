package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rCl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1579490rCl implements InterfaceC1580030rDd {
    public final int LIZ;
    public final EnumC1579420rCe LIZIZ;
    public final long LIZJ;
    public final long LIZLLL;
    public final boolean LJ;
    public final String LJFF;
    public final String LJI;
    public final String LJII;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1579490rCl)) {
            return false;
        }
        C1579490rCl c1579490rCl = (C1579490rCl) obj;
        return this.LIZ == c1579490rCl.LIZ && this.LIZIZ == c1579490rCl.LIZIZ && this.LIZJ == c1579490rCl.LIZJ && this.LIZLLL == c1579490rCl.LIZLLL && this.LJ == c1579490rCl.LJ && Intrinsics.LJFF(this.LJFF, c1579490rCl.LJFF) && Intrinsics.LJFF(this.LJI, c1579490rCl.LJI) && Intrinsics.LJFF(this.LJII, c1579490rCl.LJII);
    }

    public final int hashCode() {
        int iHashCode = ((((((((this.LIZ * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Y2(this.LIZJ)) * 31) + C786410Ut5.Y2(this.LIZLLL)) * 31) + C786410Ut5.Z2(this.LJ)) * 31;
        String str = this.LJFF;
        return ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.LJI.hashCode()) * 31) + this.LJII.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ItemInfo(cardIndex=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", cardType=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", collectionId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", categoryId=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", isLimitedFree=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", coverUrl=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", title=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", subTitle=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1579490rCl(int i, EnumC1579420rCe enumC1579420rCe, long j, long j2, boolean z, String str, String str2, String str3) {
        this.LIZ = i;
        this.LIZIZ = enumC1579420rCe;
        this.LIZJ = j;
        this.LIZLLL = j2;
        this.LJ = z;
        this.LJFF = str;
        this.LJI = str2;
        this.LJII = str3;
    }
}
