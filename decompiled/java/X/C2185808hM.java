package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.08hM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2185808hM {
    public final String LIZ;
    public final String LIZIZ;
    public final long LIZJ;
    public final List<Float> LIZLLL;
    public final String LJ;
    public final boolean LJFF;
    public final long LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2185808hM)) {
            return false;
        }
        C2185808hM c2185808hM = (C2185808hM) obj;
        return Intrinsics.LJFF(this.LIZ, c2185808hM.LIZ) && Intrinsics.LJFF(this.LIZIZ, c2185808hM.LIZIZ) && this.LIZJ == c2185808hM.LIZJ && Intrinsics.LJFF(this.LIZLLL, c2185808hM.LIZLLL) && Intrinsics.LJFF(this.LJ, c2185808hM.LJ) && this.LJFF == c2185808hM.LJFF && this.LJI == c2185808hM.LJI;
    }

    public final int hashCode() {
        return (((((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Y2(this.LIZJ)) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31) + C786410Ut5.Z2(this.LJFF)) * 31) + C786410Ut5.Y2(this.LJI);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SendPayload(fakeId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", wavFilePath=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", durationMs=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", waveformData=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", enterMethod=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", hasUsedLocker=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", totalDurationMs=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C2185808hM(long j, long j2, String str, String str2, String str3, List list, boolean z) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = j;
        this.LIZLLL = list;
        this.LJ = str3;
        this.LJFF = z;
        this.LJI = j2;
    }
}
