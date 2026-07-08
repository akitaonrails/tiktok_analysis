package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ewa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C380900Ewa {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final List<C380780EwO> LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;
    public final C375830EoP<Unit> LJI;

    public C380900Ewa() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C380900Ewa)) {
            return false;
        }
        C380900Ewa c380900Ewa = (C380900Ewa) obj;
        return this.LIZ == c380900Ewa.LIZ && this.LIZIZ == c380900Ewa.LIZIZ && this.LIZJ == c380900Ewa.LIZJ && Intrinsics.LJFF(this.LIZLLL, c380900Ewa.LIZLLL) && this.LJ == c380900Ewa.LJ && this.LJFF == c380900Ewa.LJFF && Intrinsics.LJFF(this.LJI, c380900Ewa.LJI);
    }

    public final int hashCode() {
        int iZ2 = ((((((((((C786410Ut5.Z2(this.LIZ) * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + this.LIZLLL.hashCode()) * 31) + C786410Ut5.Z2(this.LJ)) * 31) + C786410Ut5.Z2(this.LJFF)) * 31;
        C375830EoP<Unit> c375830EoP = this.LJI;
        return iZ2 + (c375830EoP == null ? 0 : c375830EoP.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CutoutStrokeState(panelVisible=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", showTips=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", isTopPanel=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", strokeList=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", loadingViewVisible=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", errorViewVisible=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", scrollToSelectedItem=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C380900Ewa(int i) {
        this(false, false, true, new ArrayList(), false, false, null);
    }

    public C380900Ewa(boolean z, boolean z2, boolean z3, List<C380780EwO> list, boolean z4, boolean z5, C375830EoP<Unit> c375830EoP) {
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = z3;
        this.LIZLLL = list;
        this.LJ = z4;
        this.LJFF = z5;
        this.LJI = c375830EoP;
    }

    public static C380900Ewa LIZ(C380900Ewa c380900Ewa, boolean z, boolean z2, boolean z3, List list, boolean z4, boolean z5, C375830EoP c375830EoP, int i) {
        C375830EoP c375830EoP2 = c375830EoP;
        boolean z6 = z5;
        boolean z7 = z4;
        List list2 = list;
        boolean z8 = z3;
        boolean z9 = z2;
        boolean z10 = z;
        if ((i & 1) != 0) {
            z10 = c380900Ewa.LIZ;
        }
        if ((i & 2) != 0) {
            z9 = c380900Ewa.LIZIZ;
        }
        if ((i & 4) != 0) {
            z8 = c380900Ewa.LIZJ;
        }
        if ((i & 8) != 0) {
            list2 = c380900Ewa.LIZLLL;
        }
        if ((i & 16) != 0) {
            z7 = c380900Ewa.LJ;
        }
        if ((i & 32) != 0) {
            z6 = c380900Ewa.LJFF;
        }
        if ((i & 64) != 0) {
            c375830EoP2 = c380900Ewa.LJI;
        }
        c380900Ewa.getClass();
        return new C380900Ewa(z10, z9, z8, list2, z7, z6, c375830EoP2);
    }
}
