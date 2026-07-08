package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0FDc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C386420FDc {
    public final int LIZ;
    public final List<C0FDZ> LIZIZ;
    public final EnumC386410FDb LIZJ;
    public final C375830EoP<Boolean> LIZLLL;
    public final C375830EoP<Unit> LJ;
    public final C375830EoP<Unit> LJFF;
    public final C375830EoP<Unit> LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C386420FDc)) {
            return false;
        }
        C386420FDc c386420FDc = (C386420FDc) obj;
        return this.LIZ == c386420FDc.LIZ && Intrinsics.LJFF(this.LIZIZ, c386420FDc.LIZIZ) && this.LIZJ == c386420FDc.LIZJ && Intrinsics.LJFF(this.LIZLLL, c386420FDc.LIZLLL) && Intrinsics.LJFF(this.LJ, c386420FDc.LJ) && Intrinsics.LJFF(this.LJFF, c386420FDc.LJFF) && Intrinsics.LJFF(this.LJI, c386420FDc.LJI);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LIZ * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31;
        C375830EoP<Boolean> c375830EoP = this.LIZLLL;
        int iHashCode2 = (iHashCode + (c375830EoP == null ? 0 : c375830EoP.hashCode())) * 31;
        C375830EoP<Unit> c375830EoP2 = this.LJ;
        int iHashCode3 = (iHashCode2 + (c375830EoP2 == null ? 0 : c375830EoP2.hashCode())) * 31;
        C375830EoP<Unit> c375830EoP3 = this.LJFF;
        int iHashCode4 = (iHashCode3 + (c375830EoP3 == null ? 0 : c375830EoP3.hashCode())) * 31;
        C375830EoP<Unit> c375830EoP4 = this.LJI;
        return iHashCode4 + (c375830EoP4 != null ? c375830EoP4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CaptionTemplateListStates(itemHeight=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", templateList=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", loadingState=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", scrollToSelectedItem=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", resetMobState=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", callItemShow=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", customTemplateEditDone=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C386420FDc(int i, List<C0FDZ> list, EnumC386410FDb enumC386410FDb, C375830EoP<Boolean> c375830EoP, C375830EoP<Unit> c375830EoP2, C375830EoP<Unit> c375830EoP3, C375830EoP<Unit> c375830EoP4) {
        this.LIZ = i;
        this.LIZIZ = list;
        this.LIZJ = enumC386410FDb;
        this.LIZLLL = c375830EoP;
        this.LJ = c375830EoP2;
        this.LJFF = c375830EoP3;
        this.LJI = c375830EoP4;
    }

    public static C386420FDc LIZ(C386420FDc c386420FDc, List list, EnumC386410FDb enumC386410FDb, C375830EoP c375830EoP, C375830EoP c375830EoP2, C375830EoP c375830EoP3, int i) {
        int i2;
        C375830EoP<Unit> c375830EoP4;
        C375830EoP c375830EoP5 = c375830EoP3;
        C375830EoP c375830EoP6 = c375830EoP2;
        C375830EoP c375830EoP7 = c375830EoP;
        EnumC386410FDb enumC386410FDb2 = enumC386410FDb;
        List list2 = list;
        if ((i & 1) != 0) {
            i2 = c386420FDc.LIZ;
        } else {
            i2 = 0;
        }
        if ((i & 2) != 0) {
            list2 = c386420FDc.LIZIZ;
        }
        if ((i & 4) != 0) {
            enumC386410FDb2 = c386420FDc.LIZJ;
        }
        if ((i & 8) != 0) {
            c375830EoP7 = c386420FDc.LIZLLL;
        }
        if ((i & 16) != 0) {
            c375830EoP4 = c386420FDc.LJ;
        } else {
            c375830EoP4 = null;
        }
        if ((i & 32) != 0) {
            c375830EoP6 = c386420FDc.LJFF;
        }
        if ((i & 64) != 0) {
            c375830EoP5 = c386420FDc.LJI;
        }
        c386420FDc.getClass();
        return new C386420FDc(i2, list2, enumC386410FDb2, c375830EoP7, c375830EoP4, c375830EoP6, c375830EoP5);
    }
}
