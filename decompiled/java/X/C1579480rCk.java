package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rCk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1579480rCk implements InterfaceC1580030rDd {
    public final int LIZ;
    public final EnumC1579420rCe LIZIZ;
    public final long LIZJ;
    public final long LIZLLL;
    public final boolean LJ;
    public final String LJFF;
    public final String LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1579480rCk)) {
            return false;
        }
        C1579480rCk c1579480rCk = (C1579480rCk) obj;
        return this.LIZ == c1579480rCk.LIZ && this.LIZIZ == c1579480rCk.LIZIZ && this.LIZJ == c1579480rCk.LIZJ && this.LIZLLL == c1579480rCk.LIZLLL && this.LJ == c1579480rCk.LJ && Intrinsics.LJFF(this.LJFF, c1579480rCk.LJFF) && Intrinsics.LJFF(this.LJI, c1579480rCk.LJI);
    }

    public final int hashCode() {
        int iHashCode = ((((((((this.LIZ * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Y2(this.LIZJ)) * 31) + C786410Ut5.Y2(this.LIZLLL)) * 31) + C786410Ut5.Z2(this.LJ)) * 31;
        String str = this.LJFF;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.LJI.hashCode();
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
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1579480rCk(int i, EnumC1579420rCe enumC1579420rCe, long j, long j2, boolean z, String str, String str2) {
        this.LIZ = i;
        this.LIZIZ = enumC1579420rCe;
        this.LIZJ = j;
        this.LIZLLL = j2;
        this.LJ = z;
        this.LJFF = str;
        this.LJI = str2;
    }
}
