package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.05lY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1447405lY {
    public final List<String> LIZ;
    public final List<String> LIZIZ;
    public final List<String> LIZJ;
    public final List<String> LIZLLL;
    public final List<String> LJ;

    public C1447405lY() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1447405lY)) {
            return false;
        }
        C1447405lY c1447405lY = (C1447405lY) obj;
        return Intrinsics.LJFF(this.LIZ, c1447405lY.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1447405lY.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1447405lY.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1447405lY.LIZLLL) && Intrinsics.LJFF(this.LJ, c1447405lY.LJ);
    }

    public final int hashCode() {
        return (((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FcpSlotState(normalComponents=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", standardComponents=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", requestSlotComponents=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", occupiedSlotComponents=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", requestDisplayedComponents=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1447405lY(int i) {
        C13BV c13bv = C13BV.INSTANCE;
        this(c13bv, c13bv, c13bv, c13bv, c13bv);
    }

    public C1447405lY(List<String> list, List<String> list2, List<String> list3, List<String> list4, List<String> list5) {
        this.LIZ = list;
        this.LIZIZ = list2;
        this.LIZJ = list3;
        this.LIZLLL = list4;
        this.LJ = list5;
    }

    public static C1447405lY LIZ(C1447405lY c1447405lY, List list, List list2, List list3, List list4, List list5, int i) {
        List list6 = list5;
        List list7 = list4;
        List list8 = list3;
        List list9 = list2;
        List list10 = list;
        if ((i & 1) != 0) {
            list10 = c1447405lY.LIZ;
        }
        if ((i & 2) != 0) {
            list9 = c1447405lY.LIZIZ;
        }
        if ((i & 4) != 0) {
            list8 = c1447405lY.LIZJ;
        }
        if ((i & 8) != 0) {
            list7 = c1447405lY.LIZLLL;
        }
        if ((i & 16) != 0) {
            list6 = c1447405lY.LJ;
        }
        c1447405lY.getClass();
        return new C1447405lY(list10, list9, list8, list7, list6);
    }
}
