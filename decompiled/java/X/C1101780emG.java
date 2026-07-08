package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0emG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1101780emG {
    public final String LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final long LJ;
    public final String LJFF;
    public final int LJI;
    public final long LJII;
    public final boolean LJIIIIZZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1101780emG)) {
            return false;
        }
        C1101780emG c1101780emG = (C1101780emG) obj;
        return Intrinsics.LJFF(this.LIZ, c1101780emG.LIZ) && this.LIZIZ == c1101780emG.LIZIZ && this.LIZJ == c1101780emG.LIZJ && this.LIZLLL == c1101780emG.LIZLLL && this.LJ == c1101780emG.LJ && Intrinsics.LJFF(this.LJFF, c1101780emG.LJFF) && this.LJI == c1101780emG.LJI && this.LJII == c1101780emG.LJII && this.LJIIIIZZ == c1101780emG.LJIIIIZZ;
    }

    public final int hashCode() {
        return (((((((((((((((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31) + this.LIZLLL) * 31) + C786410Ut5.Y2(this.LJ)) * 31) + this.LJFF.hashCode()) * 31) + this.LJI) * 31) + C786410Ut5.Y2(this.LJII)) * 31) + C786410Ut5.Z2(this.LJIIIIZZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShortTouchExpandInfo(id=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", component=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", biz=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", scene=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", duration=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", containerId=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", targetWidthDp=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", animateDurationMs=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", forceExpand=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1101780emG(String str, int i, int i2, int i3, String str2, int i4, long j) {
        this(str, i, i2, i3, 0L, str2, i4, j, false);
    }

    public C1101780emG(String str, int i, int i2, int i3, long j, String str2, int i4, long j2, boolean z) {
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = i3;
        this.LJ = j;
        this.LJFF = str2;
        this.LJI = i4;
        this.LJII = j2;
        this.LJIIIIZZ = z;
    }
}
