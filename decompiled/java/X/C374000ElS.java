package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ElS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C374000ElS {
    public final boolean LIZ;
    public final List<C373800El8> LIZIZ;
    public final Pair<Integer, Boolean> LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;

    public C374000ElS() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C374000ElS)) {
            return false;
        }
        C374000ElS c374000ElS = (C374000ElS) obj;
        return this.LIZ == c374000ElS.LIZ && Intrinsics.LJFF(this.LIZIZ, c374000ElS.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c374000ElS.LIZJ) && this.LIZLLL == c374000ElS.LIZLLL && this.LJ == c374000ElS.LJ;
    }

    public final int hashCode() {
        return (((((((C786410Ut5.Z2(this.LIZ) * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31) + C786410Ut5.Z2(this.LJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CutoutBrushState(panelVisible=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", dataSet=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", brushSize=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", enableBrush=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", enableBrushSize=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C374000ElS(int i) {
        this(false, new ArrayList(), new Pair(20, Boolean.FALSE), false, false);
    }

    public C374000ElS(boolean z, List<C373800El8> list, Pair<Integer, Boolean> pair, boolean z2, boolean z3) {
        this.LIZ = z;
        this.LIZIZ = list;
        this.LIZJ = pair;
        this.LIZLLL = z2;
        this.LJ = z3;
    }

    public static C374000ElS LIZ(C374000ElS c374000ElS, boolean z, List list, Pair pair, boolean z2, boolean z3, int i) {
        boolean z4 = z3;
        boolean z5 = z2;
        Pair pair2 = pair;
        List list2 = list;
        boolean z6 = z;
        if ((i & 1) != 0) {
            z6 = c374000ElS.LIZ;
        }
        if ((i & 2) != 0) {
            list2 = c374000ElS.LIZIZ;
        }
        if ((i & 4) != 0) {
            pair2 = c374000ElS.LIZJ;
        }
        if ((i & 8) != 0) {
            z5 = c374000ElS.LIZLLL;
        }
        if ((i & 16) != 0) {
            z4 = c374000ElS.LJ;
        }
        c374000ElS.getClass();
        return new C374000ElS(z6, list2, pair2, z5, z4);
    }
}
