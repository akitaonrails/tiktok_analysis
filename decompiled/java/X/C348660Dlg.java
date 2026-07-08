package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Dlg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C348660Dlg {
    public final long LIZ;
    public final long LIZIZ;
    public final String LIZJ;
    public final long LIZLLL;
    public final long LJ;
    public final float LJFF;
    public final boolean LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C348660Dlg)) {
            return false;
        }
        C348660Dlg c348660Dlg = (C348660Dlg) obj;
        return this.LIZ == c348660Dlg.LIZ && this.LIZIZ == c348660Dlg.LIZIZ && Intrinsics.LJFF(this.LIZJ, c348660Dlg.LIZJ) && this.LIZLLL == c348660Dlg.LIZLLL && this.LJ == c348660Dlg.LJ && Float.compare(this.LJFF, c348660Dlg.LJFF) == 0 && this.LJI == c348660Dlg.LJI;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SlotDetail(startTime=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", endTime=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", resPath=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", resStartTime=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", resEndTime=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", volume=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", isMute=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return (((((((((((C786410Ut5.Y2(this.LIZ) * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + this.LIZJ.hashCode()) * 31) + C786410Ut5.Y2(this.LIZLLL)) * 31) + C786410Ut5.Y2(this.LJ)) * 31) + Float.floatToIntBits(this.LJFF)) * 31) + C786410Ut5.Z2(this.LJI);
    }

    public C348660Dlg(long j, long j2, String str, long j3, long j4, float f, boolean z) {
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = str;
        this.LIZLLL = j3;
        this.LJ = j4;
        this.LJFF = f;
        this.LJI = z;
    }
}
