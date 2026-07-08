package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ess, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C378600Ess {
    public final List<C378700Et2> LIZ;
    public final C375830EoP<Unit> LIZIZ;
    public final C375830EoP<Unit> LIZJ;
    public final boolean LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final C375830EoP<Unit> LJI;

    public C378600Ess() {
        this(null, null, 127);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C378600Ess)) {
            return false;
        }
        C378600Ess c378600Ess = (C378600Ess) obj;
        return Intrinsics.LJFF(this.LIZ, c378600Ess.LIZ) && Intrinsics.LJFF(this.LIZIZ, c378600Ess.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c378600Ess.LIZJ) && this.LIZLLL == c378600Ess.LIZLLL && Intrinsics.LJFF(this.LJ, c378600Ess.LJ) && Intrinsics.LJFF(this.LJFF, c378600Ess.LJFF) && Intrinsics.LJFF(this.LJI, c378600Ess.LJI);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        C375830EoP<Unit> c375830EoP = this.LIZIZ;
        int iHashCode2 = (iHashCode + (c375830EoP == null ? 0 : c375830EoP.hashCode())) * 31;
        C375830EoP<Unit> c375830EoP2 = this.LIZJ;
        int iHashCode3 = (((iHashCode2 + (c375830EoP2 == null ? 0 : c375830EoP2.hashCode())) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31;
        String str = this.LJ;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LJFF;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        C375830EoP<Unit> c375830EoP3 = this.LJI;
        return iHashCode5 + (c375830EoP3 != null ? c375830EoP3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PromptEditSceneState(promptList=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", onBackEvent=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", scrollToEndEvent=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", isLoading=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", initPrompt=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", editPrompt=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", onDestroyEvent=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C378600Ess(String str, String str2, int i) {
        C13BV c13bv;
        String str3 = str2;
        String str4 = str;
        if ((i & 1) != 0) {
            c13bv = C13BV.INSTANCE;
        } else {
            c13bv = null;
        }
        this(c13bv, null, null, false, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str3, null);
    }

    public C378600Ess(List<C378700Et2> list, C375830EoP<Unit> c375830EoP, C375830EoP<Unit> c375830EoP2, boolean z, String str, String str2, C375830EoP<Unit> c375830EoP3) {
        this.LIZ = list;
        this.LIZIZ = c375830EoP;
        this.LIZJ = c375830EoP2;
        this.LIZLLL = z;
        this.LJ = str;
        this.LJFF = str2;
        this.LJI = c375830EoP3;
    }

    public static C378600Ess LIZ(C378600Ess c378600Ess, List list, C375830EoP c375830EoP, C375830EoP c375830EoP2, boolean z, String str, C375830EoP c375830EoP3, int i) {
        String str2;
        C375830EoP c375830EoP4 = c375830EoP3;
        String str3 = str;
        boolean z2 = z;
        C375830EoP c375830EoP5 = c375830EoP2;
        C375830EoP c375830EoP6 = c375830EoP;
        List list2 = list;
        if ((i & 1) != 0) {
            list2 = c378600Ess.LIZ;
        }
        if ((i & 2) != 0) {
            c375830EoP6 = c378600Ess.LIZIZ;
        }
        if ((i & 4) != 0) {
            c375830EoP5 = c378600Ess.LIZJ;
        }
        if ((i & 8) != 0) {
            z2 = c378600Ess.LIZLLL;
        }
        if ((i & 16) != 0) {
            str2 = c378600Ess.LJ;
        } else {
            str2 = null;
        }
        if ((i & 32) != 0) {
            str3 = c378600Ess.LJFF;
        }
        if ((i & 64) != 0) {
            c375830EoP4 = c378600Ess.LJI;
        }
        c378600Ess.getClass();
        return new C378600Ess(list2, c375830EoP6, c375830EoP5, z2, str2, str3, c375830EoP4);
    }
}
