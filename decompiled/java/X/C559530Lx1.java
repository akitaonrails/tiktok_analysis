package X;

import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Lx1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C559530Lx1 {
    public final int LIZ;
    public final Pair<Long, String> LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public final C0MXX LJFF;
    public final List<String> LJI;
    public final List<String> LJII;

    public C559530Lx1() {
        this(0, new Pair(-1L, null), true, true, true, new C0MXX(), C13BV.INSTANCE, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C559530Lx1)) {
            return false;
        }
        C559530Lx1 c559530Lx1 = (C559530Lx1) obj;
        return this.LIZ == c559530Lx1.LIZ && Intrinsics.LJFF(this.LIZIZ, c559530Lx1.LIZIZ) && this.LIZJ == c559530Lx1.LIZJ && this.LIZLLL == c559530Lx1.LIZLLL && this.LJ == c559530Lx1.LJ && Intrinsics.LJFF(this.LJFF, c559530Lx1.LJFF) && Intrinsics.LJFF(this.LJI, c559530Lx1.LJI) && Intrinsics.LJFF(this.LJII, c559530Lx1.LJII);
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((this.LIZ * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31) + C786410Ut5.Z2(this.LJ)) * 31) + this.LJFF.hashCode()) * 31) + this.LJI.hashCode()) * 31;
        List<String> list = this.LJII;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GenerationLoadingState(progress=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", remainTime=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", showRedDot=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", showAvatarAnimation=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", showTextRotation=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", avatarHollowChainConfig=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", usernames=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", textRotationActions=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static C559530Lx1 LIZ(C559530Lx1 c559530Lx1, int i, Pair pair, int i2) {
        boolean z;
        boolean z2;
        boolean z3;
        C0MXX c0mxx;
        List<String> list;
        Pair pair2 = pair;
        int i3 = i;
        if ((i2 & 1) != 0) {
            i3 = c559530Lx1.LIZ;
        }
        if ((i2 & 2) != 0) {
            pair2 = c559530Lx1.LIZIZ;
        }
        if ((i2 & 4) != 0) {
            z = c559530Lx1.LIZJ;
        } else {
            z = false;
        }
        if ((i2 & 8) != 0) {
            z2 = c559530Lx1.LIZLLL;
        } else {
            z2 = false;
        }
        if ((i2 & 16) != 0) {
            z3 = c559530Lx1.LJ;
        } else {
            z3 = false;
        }
        List<String> list2 = null;
        if ((i2 & 32) != 0) {
            c0mxx = c559530Lx1.LJFF;
        } else {
            c0mxx = null;
        }
        if ((i2 & 64) != 0) {
            list = c559530Lx1.LJI;
        } else {
            list = null;
        }
        if ((i2 & 128) != 0) {
            list2 = c559530Lx1.LJII;
        }
        c559530Lx1.getClass();
        return new C559530Lx1(i3, pair2, z, z2, z3, c0mxx, list, list2);
    }

    public C559530Lx1(int i, Pair<Long, String> pair, boolean z, boolean z2, boolean z3, C0MXX c0mxx, List<String> list, List<String> list2) {
        this.LIZ = i;
        this.LIZIZ = pair;
        this.LIZJ = z;
        this.LIZLLL = z2;
        this.LJ = z3;
        this.LJFF = c0mxx;
        this.LJI = list;
        this.LJII = list2;
    }
}
