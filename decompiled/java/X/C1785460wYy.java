package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wYy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1785460wYy {
    public final InterfaceC1785620wZE LIZ;
    public final C1785480wZ0 LIZIZ;
    public final C1785470wYz LIZJ;
    public final C861610Xr5 LIZLLL;
    public final C1785320wYk LJ;
    public final C1155370gAh LJFF;

    public C1785460wYy() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1785460wYy)) {
            return false;
        }
        C1785460wYy c1785460wYy = (C1785460wYy) obj;
        return Intrinsics.LJFF(this.LIZ, c1785460wYy.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1785460wYy.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1785460wYy.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1785460wYy.LIZLLL) && Intrinsics.LJFF(this.LJ, c1785460wYy.LJ) && Intrinsics.LJFF(this.LJFF, c1785460wYy.LJFF);
    }

    public final int hashCode() {
        int iHashCode = ((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31;
        C1785320wYk c1785320wYk = this.LJ;
        return ((iHashCode + (c1785320wYk == null ? 0 : c1785320wYk.hashCode())) * 31) + this.LJFF.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CreatorRankingPageUiState(wholePage=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", topBar=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", firstTabPage=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", gate=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", subPage=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", tabMetaRuntime=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1785460wYy(int i) {
        this(new C1785920wZi(new C1785870wZd(EnumC1785890wZf.LOADING, (C1785970wZn) null, (Integer) null, 14)), new C1785480wZ0(0), new C1785470wYz(0), new C861610Xr5(false), null, new C1155370gAh(0));
    }

    public C1785460wYy(InterfaceC1785620wZE interfaceC1785620wZE, C1785480wZ0 c1785480wZ0, C1785470wYz c1785470wYz, C861610Xr5 c861610Xr5, C1785320wYk c1785320wYk, C1155370gAh c1155370gAh) {
        this.LIZ = interfaceC1785620wZE;
        this.LIZIZ = c1785480wZ0;
        this.LIZJ = c1785470wYz;
        this.LIZLLL = c861610Xr5;
        this.LJ = c1785320wYk;
        this.LJFF = c1155370gAh;
    }

    public static C1785460wYy LIZ(C1785460wYy c1785460wYy, InterfaceC1785620wZE interfaceC1785620wZE, C1785480wZ0 c1785480wZ0, C1785470wYz c1785470wYz, C861610Xr5 c861610Xr5, C1785320wYk c1785320wYk, C1155370gAh c1155370gAh, int i) {
        C1155370gAh c1155370gAh2 = c1155370gAh;
        C1785320wYk c1785320wYk2 = c1785320wYk;
        C861610Xr5 c861610Xr52 = c861610Xr5;
        C1785470wYz c1785470wYz2 = c1785470wYz;
        C1785480wZ0 c1785480wZ02 = c1785480wZ0;
        InterfaceC1785620wZE interfaceC1785620wZE2 = interfaceC1785620wZE;
        if ((i & 1) != 0) {
            interfaceC1785620wZE2 = c1785460wYy.LIZ;
        }
        if ((i & 2) != 0) {
            c1785480wZ02 = c1785460wYy.LIZIZ;
        }
        if ((i & 4) != 0) {
            c1785470wYz2 = c1785460wYy.LIZJ;
        }
        if ((i & 8) != 0) {
            c861610Xr52 = c1785460wYy.LIZLLL;
        }
        if ((i & 16) != 0) {
            c1785320wYk2 = c1785460wYy.LJ;
        }
        if ((i & 32) != 0) {
            c1155370gAh2 = c1785460wYy.LJFF;
        }
        c1785460wYy.getClass();
        return new C1785460wYy(interfaceC1785620wZE2, c1785480wZ02, c1785470wYz2, c861610Xr52, c1785320wYk2, c1155370gAh2);
    }
}
