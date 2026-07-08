package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0VMR, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VMR {
    public final long LIZ;
    public final String LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final String LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0VMR)) {
            return false;
        }
        C0VMR c0vmr = (C0VMR) obj;
        return this.LIZ == c0vmr.LIZ && Intrinsics.LJFF(this.LIZIZ, c0vmr.LIZIZ) && this.LIZJ == c0vmr.LIZJ && this.LIZLLL == c0vmr.LIZLLL && Intrinsics.LJFF(this.LJ, c0vmr.LJ) && Intrinsics.LJFF(this.LJFF, c0vmr.LJFF) && Intrinsics.LJFF(this.LJI, c0vmr.LJI);
    }

    public final int hashCode() {
        return (((((((((((C786410Ut5.Y2(this.LIZ) * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ) * 31) + this.LIZLLL) * 31) + this.LJ.hashCode()) * 31) + this.LJFF.hashCode()) * 31) + this.LJI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StrategyEntity(id=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", strategyKey=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", engineType=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", optType=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", md5=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", packageName=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", extraJson=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0VMR(String str, int i, long j, String str2, String str3, int i2, String str4) {
        this.LIZ = j;
        this.LIZIZ = str;
        this.LIZJ = i;
        this.LIZLLL = i2;
        this.LJ = str2;
        this.LJFF = str3;
        this.LJI = str4;
    }
}
