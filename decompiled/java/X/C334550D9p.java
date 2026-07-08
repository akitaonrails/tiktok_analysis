package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0D9p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C334550D9p {
    public final long LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final C0D9J LIZLLL;
    public final C0D93 LJ;
    public final C0D9M LJFF;
    public final String LJI;
    public final String LJII;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C334550D9p)) {
            return false;
        }
        C334550D9p c334550D9p = (C334550D9p) obj;
        return this.LIZ == c334550D9p.LIZ && Intrinsics.LJFF(this.LIZIZ, c334550D9p.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c334550D9p.LIZJ) && this.LIZLLL == c334550D9p.LIZLLL && this.LJ == c334550D9p.LJ && Intrinsics.LJFF(this.LJFF, c334550D9p.LJFF) && Intrinsics.LJFF(this.LJI, c334550D9p.LJI) && Intrinsics.LJFF(this.LJII, c334550D9p.LJII);
    }

    public final int hashCode() {
        int iY2 = C786410Ut5.Y2(this.LIZ) * 31;
        String str = this.LIZIZ;
        int iHashCode = (((((((((iY2 + (str == null ? 0 : str.hashCode())) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31) + this.LJFF.hashCode()) * 31;
        String str2 = this.LJI;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LJII;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CheckoutNotice(id=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", title=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", message=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", source=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", presentation=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", positiveAction=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", positiveText=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", negativeText=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C334550D9p(long j, String str, String str2, C0D9J c0d9j, C0D93 c0d93, C0D9M c0d9m, String str3, String str4) {
        this.LIZ = j;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = c0d9j;
        this.LJ = c0d93;
        this.LJFF = c0d9m;
        this.LJI = str3;
        this.LJII = str4;
    }
}
