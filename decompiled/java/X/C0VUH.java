package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0VUH, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VUH {
    public final String LIZ;
    public final long LIZIZ;
    public final long LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final int LJFF;
    public final int LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0VUH)) {
            return false;
        }
        C0VUH c0vuh = (C0VUH) obj;
        return Intrinsics.LJFF(this.LIZ, c0vuh.LIZ) && this.LIZIZ == c0vuh.LIZIZ && this.LIZJ == c0vuh.LIZJ && this.LIZLLL == c0vuh.LIZLLL && this.LJ == c0vuh.LJ && this.LJFF == c0vuh.LJFF && this.LJI == c0vuh.LJI;
    }

    public final int hashCode() {
        String str = this.LIZ;
        return ((((((((((((str == null ? 0 : str.hashCode()) * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + C786410Ut5.Y2(this.LIZJ)) * 31) + this.LIZLLL) * 31) + this.LJ) * 31) + this.LJFF) * 31) + this.LJI;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("db=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(" pageSize=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append("KB dbSize=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append("KB lookaside=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(" cacheHits=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(" cacheMisses=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(" cacheSize=");
        sbLIZ.append(this.LJI);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0VUH(String str, long j, long j2, int i, int i2, int i3, int i4) {
        this.LIZ = str;
        this.LIZIZ = j;
        this.LIZJ = j2;
        this.LIZLLL = i;
        this.LJ = i2;
        this.LJFF = i3;
        this.LJI = i4;
    }
}
