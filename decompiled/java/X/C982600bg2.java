package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0bg2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C982600bg2 extends AbstractC982860bgS {
    public static final /* synthetic */ int LJI = 0;
    public final List<C982390bfh> LJ;
    public final EnumC982500bfs LJFF;

    public C982600bg2() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C982600bg2)) {
            return false;
        }
        C982600bg2 c982600bg2 = (C982600bg2) obj;
        return Intrinsics.LJFF(this.LJ, c982600bg2.LJ) && this.LJFF == c982600bg2.LJFF;
    }

    public final int hashCode() {
        return (this.LJ.hashCode() * 31) + this.LJFF.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CompetitionLeaveResult(teamScores=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", result=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C982600bg2(C983260bh6 c983260bh6) {
        List<C982390bfh> list = c983260bh6.LJ;
        EnumC982500bfs enumC982500bfs = c983260bh6.LJFF;
        this.LJ = list;
        this.LJFF = enumC982500bfs;
    }
}
