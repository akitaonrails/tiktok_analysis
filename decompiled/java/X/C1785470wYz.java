package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wYz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1785470wYz {
    public final List<C1779500wPM> LIZ;
    public final int LIZIZ;
    public final String LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public final String LJFF;
    public final boolean LJI;
    public final EnumC1778950wOT LJII;
    public final String LJIIIIZZ;

    public C1785470wYz() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1785470wYz)) {
            return false;
        }
        C1785470wYz c1785470wYz = (C1785470wYz) obj;
        return Intrinsics.LJFF(this.LIZ, c1785470wYz.LIZ) && this.LIZIZ == c1785470wYz.LIZIZ && Intrinsics.LJFF(this.LIZJ, c1785470wYz.LIZJ) && this.LIZLLL == c1785470wYz.LIZLLL && this.LJ == c1785470wYz.LJ && Intrinsics.LJFF(this.LJFF, c1785470wYz.LJFF) && this.LJI == c1785470wYz.LJI && this.LJII == c1785470wYz.LJII && Intrinsics.LJFF(this.LJIIIIZZ, c1785470wYz.LJIIIIZZ);
    }

    public final int hashCode() {
        return (((((((((((((((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31) + this.LIZJ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31) + C786410Ut5.Z2(this.LJ)) * 31) + this.LJFF.hashCode()) * 31) + C786410Ut5.Z2(this.LJI)) * 31) + this.LJII.hashCode()) * 31) + this.LJIIIIZZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FirstTabPageState(subTabs=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", selectedSubIndex=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", subTitleText=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", isSubTabBarVisible=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", showSubCountdown=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", subCountdownText=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", showSubNavContainer=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", mode=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", historySubTitle=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1785470wYz(int i) {
        this(C13BV.INSTANCE, 0, "", false, false, "", true, EnumC1778950wOT.CURRENT_PERIOD, "");
    }

    public C1785470wYz(List<C1779500wPM> list, int i, String str, boolean z, boolean z2, String str2, boolean z3, EnumC1778950wOT enumC1778950wOT, String str3) {
        this.LIZ = list;
        this.LIZIZ = i;
        this.LIZJ = str;
        this.LIZLLL = z;
        this.LJ = z2;
        this.LJFF = str2;
        this.LJI = z3;
        this.LJII = enumC1778950wOT;
        this.LJIIIIZZ = str3;
    }

    public static C1785470wYz LIZ(C1785470wYz c1785470wYz, List list, int i, String str, boolean z, boolean z2, String str2, boolean z3, EnumC1778950wOT enumC1778950wOT, String str3, int i2) {
        String str4 = str3;
        EnumC1778950wOT enumC1778950wOT2 = enumC1778950wOT;
        boolean z4 = z3;
        String str5 = str2;
        boolean z5 = z2;
        boolean z6 = z;
        String str6 = str;
        int i3 = i;
        List list2 = list;
        if ((i2 & 1) != 0) {
            list2 = c1785470wYz.LIZ;
        }
        if ((i2 & 2) != 0) {
            i3 = c1785470wYz.LIZIZ;
        }
        if ((i2 & 4) != 0) {
            str6 = c1785470wYz.LIZJ;
        }
        if ((i2 & 8) != 0) {
            z6 = c1785470wYz.LIZLLL;
        }
        if ((i2 & 16) != 0) {
            z5 = c1785470wYz.LJ;
        }
        if ((i2 & 32) != 0) {
            str5 = c1785470wYz.LJFF;
        }
        if ((i2 & 64) != 0) {
            z4 = c1785470wYz.LJI;
        }
        if ((i2 & 128) != 0) {
            enumC1778950wOT2 = c1785470wYz.LJII;
        }
        if ((i2 & 256) != 0) {
            str4 = c1785470wYz.LJIIIIZZ;
        }
        c1785470wYz.getClass();
        return new C1785470wYz(list2, i3, str6, z6, z5, str5, z4, enumC1778950wOT2, str4);
    }
}
