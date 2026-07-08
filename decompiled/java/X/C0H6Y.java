package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0H6Y, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0H6Y {
    public final C1320770kTT<C1331070kk5> LIZ;
    public final float LIZIZ;
    public final float LIZJ;
    public final int LIZLLL;
    public final float LJ;
    public final String LJFF;
    public final boolean LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0H6Y)) {
            return false;
        }
        C0H6Y c0h6y = (C0H6Y) obj;
        return Intrinsics.LJFF(this.LIZ, c0h6y.LIZ) && Float.compare(this.LIZIZ, c0h6y.LIZIZ) == 0 && Float.compare(this.LIZJ, c0h6y.LIZJ) == 0 && this.LIZLLL == c0h6y.LIZLLL && Float.compare(this.LJ, c0h6y.LJ) == 0 && Intrinsics.LJFF(this.LJFF, c0h6y.LJFF) && this.LJI == c0h6y.LJI;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AvatarState(holder=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", x=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", y=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", size=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", rotation=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", overlayText=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", isCounter=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        int iHashCode = ((((((((this.LIZ.hashCode() * 31) + Float.floatToIntBits(this.LIZIZ)) * 31) + Float.floatToIntBits(this.LIZJ)) * 31) + this.LIZLLL) * 31) + Float.floatToIntBits(this.LJ)) * 31;
        String str = this.LJFF;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + C786410Ut5.Z2(this.LJI);
    }

    public C0H6Y(C1320770kTT<C1331070kk5> c1320770kTT, float f, float f2, int i, float f3, String str, boolean z) {
        this.LIZ = c1320770kTT;
        this.LIZIZ = f;
        this.LIZJ = f2;
        this.LIZLLL = i;
        this.LJ = f3;
        this.LJFF = str;
        this.LJI = z;
    }
}
