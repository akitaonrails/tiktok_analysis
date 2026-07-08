package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0bfh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C982390bfh {
    public final long LIZ;
    public final long LIZIZ;
    public final long LIZJ;
    public final long LIZLLL;
    public final EnumC982500bfs LJ;
    public final List<C01BH> LJFF;
    public final List<C982710bgD> LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C982390bfh)) {
            return false;
        }
        C982390bfh c982390bfh = (C982390bfh) obj;
        return this.LIZ == c982390bfh.LIZ && this.LIZIZ == c982390bfh.LIZIZ && this.LIZJ == c982390bfh.LIZJ && this.LIZLLL == c982390bfh.LIZLLL && this.LJ == c982390bfh.LJ && Intrinsics.LJFF(this.LJFF, c982390bfh.LJFF) && Intrinsics.LJFF(this.LJI, c982390bfh.LJI);
    }

    public final int hashCode() {
        int iY2 = ((((((C786410Ut5.Y2(this.LIZ) * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + C786410Ut5.Y2(this.LIZJ)) * 31) + C786410Ut5.Y2(this.LIZLLL)) * 31;
        EnumC982500bfs enumC982500bfs = this.LJ;
        return ((((iY2 + (enumC982500bfs == null ? 0 : enumC982500bfs.hashCode())) * 31) + this.LJFF.hashCode()) * 31) + this.LJI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CompetitionTeamScoreInfo(teamId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", score=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", rank=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", version=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", result=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", contributors=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", members=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C982390bfh(long j, long j2, long j3, long j4, EnumC982500bfs enumC982500bfs, List<C01BH> list, List<C982710bgD> list2) {
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = j3;
        this.LIZLLL = j4;
        this.LJ = enumC982500bfs;
        this.LJFF = list;
        this.LJI = list2;
    }
}
