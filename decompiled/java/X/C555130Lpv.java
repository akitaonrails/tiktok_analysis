package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Lpv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C555130Lpv {
    public final C0LCS<Boolean> LIZ;
    public final List<C555070Lpp> LIZIZ;
    public final AbstractC329610Cw3<?> LIZJ;
    public final int LIZLLL;
    public final String LJ;
    public final boolean LJFF;
    public final boolean LJI;
    public final String LJII;
    public final Integer LJIIIIZZ;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public C555130Lpv() {
        boolean z = false;
        this(null, z, z, 0 == true ? 1 : 0, 511);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C555130Lpv)) {
            return false;
        }
        C555130Lpv c555130Lpv = (C555130Lpv) obj;
        return Intrinsics.LJFF(this.LIZ, c555130Lpv.LIZ) && Intrinsics.LJFF(this.LIZIZ, c555130Lpv.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c555130Lpv.LIZJ) && this.LIZLLL == c555130Lpv.LIZLLL && Intrinsics.LJFF(this.LJ, c555130Lpv.LJ) && this.LJFF == c555130Lpv.LJFF && this.LJI == c555130Lpv.LJI && Intrinsics.LJFF(this.LJII, c555130Lpv.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c555130Lpv.LJIIIIZZ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        List<C555070Lpp> list = this.LIZIZ;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        AbstractC329610Cw3<?> abstractC329610Cw3 = this.LIZJ;
        int iHashCode3 = (((iHashCode2 + (abstractC329610Cw3 == null ? 0 : abstractC329610Cw3.hashCode())) * 31) + this.LIZLLL) * 31;
        String str = this.LJ;
        int iHashCode4 = (((((iHashCode3 + (str == null ? 0 : str.hashCode())) * 31) + C786410Ut5.Z2(this.LJFF)) * 31) + C786410Ut5.Z2(this.LJI)) * 31;
        String str2 = this.LJII;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.LJIIIIZZ;
        return iHashCode5 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InputMentionPanelStates(showOrHide=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", initialList=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", config=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", panelMaxHeight=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", errorText=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", enableMentionPanelBlur=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", enableMyselfRefreshInSearchState=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", keyword=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", panelTopPos=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C555130Lpv(String str, boolean z, boolean z2, Integer num, int i) {
        C0LCS c0lcs;
        int iLIZIZ;
        Integer num2 = num;
        boolean z3 = z2;
        boolean z4 = z;
        String str2 = str;
        if ((i & 1) != 0) {
            c0lcs = new C0LCS(Boolean.FALSE);
        } else {
            c0lcs = null;
        }
        if ((i & 8) != 0) {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(259));
        } else {
            iLIZIZ = 0;
        }
        this(c0lcs, null, null, iLIZIZ, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? true : z4, (i & 64) != 0 ? false : z3, null, (i & 256) != 0 ? null : num2);
    }

    public static C555130Lpv LIZ(C555130Lpv c555130Lpv, C0LCS c0lcs, List list, AbstractC329610Cw3 abstractC329610Cw3, int i, String str, Integer num, int i2) {
        String str2;
        boolean z;
        boolean z2;
        Integer num2 = num;
        int i3 = i;
        String str3 = str;
        AbstractC329610Cw3 abstractC329610Cw32 = abstractC329610Cw3;
        List list2 = list;
        C0LCS c0lcs2 = c0lcs;
        if ((i2 & 1) != 0) {
            c0lcs2 = c555130Lpv.LIZ;
        }
        if ((i2 & 2) != 0) {
            list2 = c555130Lpv.LIZIZ;
        }
        if ((i2 & 4) != 0) {
            abstractC329610Cw32 = c555130Lpv.LIZJ;
        }
        if ((i2 & 8) != 0) {
            i3 = c555130Lpv.LIZLLL;
        }
        if ((i2 & 16) != 0) {
            str2 = c555130Lpv.LJ;
        } else {
            str2 = null;
        }
        if ((i2 & 32) != 0) {
            z = c555130Lpv.LJFF;
        } else {
            z = false;
        }
        if ((i2 & 64) != 0) {
            z2 = c555130Lpv.LJI;
        } else {
            z2 = false;
        }
        if ((i2 & 128) != 0) {
            str3 = c555130Lpv.LJII;
        }
        if ((i2 & 256) != 0) {
            num2 = c555130Lpv.LJIIIIZZ;
        }
        c555130Lpv.getClass();
        return new C555130Lpv(c0lcs2, list2, abstractC329610Cw32, i3, str2, z, z2, str3, num2);
    }

    public C555130Lpv(C0LCS<Boolean> c0lcs, List<C555070Lpp> list, AbstractC329610Cw3<?> abstractC329610Cw3, int i, String str, boolean z, boolean z2, String str2, Integer num) {
        this.LIZ = c0lcs;
        this.LIZIZ = list;
        this.LIZJ = abstractC329610Cw3;
        this.LIZLLL = i;
        this.LJ = str;
        this.LJFF = z;
        this.LJI = z2;
        this.LJII = str2;
        this.LJIIIIZZ = num;
    }
}
