package X;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wMJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1777610wMJ {
    public final int LIZ;
    public final long LIZIZ;
    public final long LIZJ;
    public final long LIZLLL;
    public final long LJ;
    public final long LJFF;
    public final ArrayList<Long> LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1777610wMJ)) {
            return false;
        }
        C1777610wMJ c1777610wMJ = (C1777610wMJ) obj;
        return this.LIZ == c1777610wMJ.LIZ && this.LIZIZ == c1777610wMJ.LIZIZ && this.LIZJ == c1777610wMJ.LIZJ && this.LIZLLL == c1777610wMJ.LIZLLL && this.LJ == c1777610wMJ.LJ && this.LJFF == c1777610wMJ.LJFF && Intrinsics.LJFF(this.LJI, c1777610wMJ.LJI);
    }

    public final int hashCode() {
        return (((((((((((this.LIZ * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + C786410Ut5.Y2(this.LIZJ)) * 31) + C786410Ut5.Y2(this.LIZLLL)) * 31) + C786410Ut5.Y2(this.LJ)) * 31) + C786410Ut5.Y2(this.LJFF)) * 31) + this.LJI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("JavaStackInfo(type=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", startWallTime=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", endWallTime=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", startCpuTime=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", endCpuTime=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", memorySize=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", methodIndex=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1777610wMJ(int i, long j, long j2, long j3, long j4, long j5, ArrayList<Long> arrayList) {
        this.LIZ = i;
        this.LIZIZ = j;
        this.LIZJ = j2;
        this.LIZLLL = j3;
        this.LJ = j4;
        this.LJFF = j5;
        this.LJI = arrayList;
    }
}
