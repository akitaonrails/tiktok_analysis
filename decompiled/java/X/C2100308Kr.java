package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.08Kr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2100308Kr {
    public final String LIZ;
    public final String LIZIZ;
    public final long LIZJ;
    public final long LIZLLL;
    public final long LJ;
    public final int LJFF;
    public final List<C1969707nb> LJI;
    public final List<C1969607na> LJII;
    public final int LJIIIIZZ;
    public final long LJIIIZ;
    public final List<C2100508Kt> LJIIJ;
    public final List<C2100508Kt> LJIIJJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2100308Kr)) {
            return false;
        }
        C2100308Kr c2100308Kr = (C2100308Kr) obj;
        return Intrinsics.LJFF(this.LIZ, c2100308Kr.LIZ) && Intrinsics.LJFF(this.LIZIZ, c2100308Kr.LIZIZ) && this.LIZJ == c2100308Kr.LIZJ && this.LIZLLL == c2100308Kr.LIZLLL && this.LJ == c2100308Kr.LJ && this.LJFF == c2100308Kr.LJFF && Intrinsics.LJFF(this.LJI, c2100308Kr.LJI) && Intrinsics.LJFF(this.LJII, c2100308Kr.LJII) && this.LJIIIIZZ == c2100308Kr.LJIIIIZZ && this.LJIIIZ == c2100308Kr.LJIIIZ && Intrinsics.LJFF(this.LJIIJ, c2100308Kr.LJIIJ) && Intrinsics.LJFF(this.LJIIJJI, c2100308Kr.LJIIJJI);
    }

    public final int hashCode() {
        return (((((((((((((((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Y2(this.LIZJ)) * 31) + C786410Ut5.Y2(this.LIZLLL)) * 31) + C786410Ut5.Y2(this.LJ)) * 31) + this.LJFF) * 31) + this.LJI.hashCode()) * 31) + this.LJII.hashCode()) * 31) + this.LJIIIIZZ) * 31) + C786410Ut5.Y2(this.LJIIIZ)) * 31) + this.LJIIJ.hashCode()) * 31) + this.LJIIJJI.hashCode();
    }

    public final String toString() {
        return "MonitorReport(sessionId=" + this.LIZ + ", endReason=" + this.LIZIZ + ", totalDurationMs=" + this.LIZJ + ", busyDurationMs=" + this.LIZLLL + ", idleDurationMs=" + this.LJ + ", totalMessageCount=" + this.LJFF + ", phaseDetails=" + this.LJI + ", otherGroups=" + this.LJII + ", otherMessageCount=" + this.LJIIIIZZ + ", otherTotalMs=" + this.LJIIIZ + ", topSlowMessages=" + this.LJIIJ + ", allSlowMessages=" + this.LJIIJJI + ')';
    }

    public C2100308Kr(String str, String str2, long j, long j2, long j3, int i, List<C1969707nb> list, List<C1969607na> list2, int i2, long j4, List<C2100508Kt> list3, List<C2100508Kt> list4) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = j;
        this.LIZLLL = j2;
        this.LJ = j3;
        this.LJFF = i;
        this.LJI = list;
        this.LJII = list2;
        this.LJIIIIZZ = i2;
        this.LJIIIZ = j4;
        this.LJIIJ = list3;
        this.LJIIJJI = list4;
    }
}
