package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0x5F, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1805470x5F implements InterfaceC0148002o {
    public final C1556220qbE LL;
    public final C1805210x4p LLILLJJLI;
    public final C291001Au<InterfaceC1868207Tk> LLILLL;
    public final C1804840x4E LLILZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1805470x5F)) {
            return false;
        }
        C1805470x5F c1805470x5F = (C1805470x5F) obj;
        return Intrinsics.LJFF(this.LL, c1805470x5F.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1805470x5F.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1805470x5F.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1805470x5F.LLILZ);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31;
        C1804840x4E c1804840x4E = this.LLILZ;
        return iHashCode + (c1804840x4E == null ? 0 : c1804840x4E.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("WalletRechargePanelBodyState(walletRechargeListUI=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", internalState=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", rechargeEvent=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", diamondQueryData=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1805470x5F(C1556220qbE c1556220qbE, C1805210x4p c1805210x4p, C291001Au<? extends InterfaceC1868207Tk> c291001Au, C1804840x4E c1804840x4E) {
        this.LL = c1556220qbE;
        this.LLILLJJLI = c1805210x4p;
        this.LLILLL = c291001Au;
        this.LLILZ = c1804840x4E;
    }

    public static C1805470x5F LIZ(C1805470x5F c1805470x5F, C1556220qbE c1556220qbE, C1805210x4p c1805210x4p, C291001Au c291001Au, C1804840x4E c1804840x4E, int i) {
        if ((i & 1) != 0) {
            c1556220qbE = c1805470x5F.LL;
        }
        if ((i & 2) != 0) {
            c1805210x4p = c1805470x5F.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            c291001Au = c1805470x5F.LLILLL;
        }
        if ((i & 8) != 0) {
            c1804840x4E = c1805470x5F.LLILZ;
        }
        c1805470x5F.getClass();
        return new C1805470x5F(c1556220qbE, c1805210x4p, c291001Au, c1804840x4E);
    }
}
