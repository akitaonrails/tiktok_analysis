package X;

import android.util.Size;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0y7Q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1845260y7Q {
    public final Size LIZ;
    public final EnumC1761210vvr LIZIZ;
    public final List<Integer> LIZJ;
    public final List<Integer> LIZLLL;
    public final int LJ;
    public final boolean LJFF;
    public final boolean LJI;

    public C1845260y7Q() {
        this(null, null, null, null, 127);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1845260y7Q)) {
            return false;
        }
        C1845260y7Q c1845260y7Q = (C1845260y7Q) obj;
        return Intrinsics.LJFF(this.LIZ, c1845260y7Q.LIZ) && this.LIZIZ == c1845260y7Q.LIZIZ && Intrinsics.LJFF(this.LIZJ, c1845260y7Q.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1845260y7Q.LIZLLL) && this.LJ == c1845260y7Q.LJ && this.LJFF == c1845260y7Q.LJFF && this.LJI == c1845260y7Q.LJI;
    }

    public final int hashCode() {
        return (((((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ) * 31) + C786410Ut5.Z2(this.LJFF)) * 31) + C786410Ut5.Z2(this.LJI);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ButtonUIConfig(iconSizeDp=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", position=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", marginDp=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", paddingDp=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", tintColor=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", needShadow=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", showIdleIcon=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1845260y7Q(Size size, EnumC1761210vvr enumC1761210vvr, List list, List list2, int i) {
        boolean z;
        size = (i & 1) != 0 ? new Size(18, 18) : size;
        enumC1761210vvr = (i & 2) != 0 ? EnumC1761210vvr.TOP_END : enumC1761210vvr;
        list = (i & 4) != 0 ? C1697810uHb.LJIIJJI(0, 0, 0, 0) : list;
        list2 = (i & 8) != 0 ? C1697810uHb.LJIIJJI(6, 6, 6, 6) : list2;
        if ((i & 32) != 0) {
            z = true;
        } else {
            z = false;
        }
        boolean z2 = (i & 64) != 0;
        this.LIZ = size;
        this.LIZIZ = enumC1761210vvr;
        this.LIZJ = list;
        this.LIZLLL = list2;
        this.LJ = 0;
        this.LJFF = z;
        this.LJI = z2;
    }
}
