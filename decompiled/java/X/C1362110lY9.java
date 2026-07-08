package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lY9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1362110lY9 {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final int LIZLLL;
    public final boolean LJ;
    public final EnumC1364050lbH LJFF;
    public final boolean LJI;
    public final EnumC994650bzT LJII;
    public final boolean LJIIIIZZ;
    public final C1362230lYL LJIIIZ;

    public C1362110lY9() {
        this(null, 1023);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1362110lY9)) {
            return false;
        }
        C1362110lY9 c1362110lY9 = (C1362110lY9) obj;
        return this.LIZ == c1362110lY9.LIZ && this.LIZIZ == c1362110lY9.LIZIZ && this.LIZJ == c1362110lY9.LIZJ && this.LIZLLL == c1362110lY9.LIZLLL && this.LJ == c1362110lY9.LJ && this.LJFF == c1362110lY9.LJFF && this.LJI == c1362110lY9.LJI && this.LJII == c1362110lY9.LJII && this.LJIIIIZZ == c1362110lY9.LJIIIIZZ && Intrinsics.LJFF(this.LJIIIZ, c1362110lY9.LJIIIZ);
    }

    public final int hashCode() {
        int iZ2 = ((((((((((((((((C786410Ut5.Z2(this.LIZ) * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + this.LIZLLL) * 31) + C786410Ut5.Z2(this.LJ)) * 31) + this.LJFF.hashCode()) * 31) + C786410Ut5.Z2(this.LJI)) * 31) + this.LJII.hashCode()) * 31) + C786410Ut5.Z2(this.LJIIIIZZ)) * 31;
        C1362230lYL c1362230lYL = this.LJIIIZ;
        return iZ2 + (c1362230lYL == null ? 0 : c1362230lYL.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShareContactListUIConfig(isUnifyingPanelStyle=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isLargerAvatar=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", isSmallerIcon=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", maxNameLines=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", isShowDMIcon=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", selectedStyle=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", showActiveBadge=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", iconStyle=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", forbidAggregation=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(", imUIConfig=");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1362110lY9(C1362230lYL c1362230lYL, int i) {
        boolean z;
        int i2;
        EnumC1364050lbH enumC1364050lbH;
        EnumC994650bzT enumC994650bzT;
        if ((i & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        if ((i & 8) != 0) {
            i2 = 2;
        } else {
            i2 = 0;
        }
        if ((i & 32) != 0) {
            enumC1364050lbH = EnumC1364050lbH.MASK_WITH_CHECK_MARK;
        } else {
            enumC1364050lbH = null;
        }
        boolean z2 = (i & 64) != 0;
        if ((i & 128) != 0) {
            enumC994650bzT = EnumC994650bzT.NORMAL;
        } else {
            enumC994650bzT = null;
        }
        c1362230lYL = (i & 512) != 0 ? null : c1362230lYL;
        this.LIZ = z;
        this.LIZIZ = false;
        this.LIZJ = false;
        this.LIZLLL = i2;
        this.LJ = false;
        this.LJFF = enumC1364050lbH;
        this.LJI = z2;
        this.LJII = enumC994650bzT;
        this.LJIIIIZZ = false;
        this.LJIIIZ = c1362230lYL;
    }
}
