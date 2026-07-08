package X;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.05eA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1401605eA implements InterfaceC1627870sSn {
    public final C1350305Qf LIZIZ;
    public final InterfaceC1664360tPe<InterfaceC1627890sSp> LIZJ;
    public final C05NR<Unit> LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1401605eA)) {
            return false;
        }
        C1401605eA c1401605eA = (C1401605eA) obj;
        return Intrinsics.LJFF(this.LIZIZ, c1401605eA.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1401605eA.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1401605eA.LIZLLL) && this.LJ == c1401605eA.LJ && this.LJFF == c1401605eA.LJFF;
    }

    public final int hashCode() {
        return (((((((this.LIZIZ.hashCode() * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + C786410Ut5.Z2(this.LJ)) * 31) + C786410Ut5.Z2(this.LJFF);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Success(scrollInstructions=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", items=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", effectDownloadResult=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", disableNonCenter=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", isDataFromCache=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1401605eA(C1350305Qf c1350305Qf, InterfaceC1664360tPe<? extends InterfaceC1627890sSp> interfaceC1664360tPe, C05NR<Unit> c05nr, boolean z, boolean z2) {
        this.LIZIZ = c1350305Qf;
        this.LIZJ = interfaceC1664360tPe;
        this.LIZLLL = c05nr;
        this.LJ = z;
        this.LJFF = z2;
    }

    public static C1401605eA LIZ(C1401605eA c1401605eA, C1350305Qf c1350305Qf, InterfaceC1664360tPe interfaceC1664360tPe, C05NR c05nr, boolean z, int i) {
        boolean z2;
        boolean z3 = z;
        C05NR c05nr2 = c05nr;
        InterfaceC1664360tPe interfaceC1664360tPe2 = interfaceC1664360tPe;
        C1350305Qf c1350305Qf2 = c1350305Qf;
        if ((i & 1) != 0) {
            c1350305Qf2 = c1401605eA.LIZIZ;
        }
        if ((i & 2) != 0) {
            interfaceC1664360tPe2 = c1401605eA.LIZJ;
        }
        if ((i & 4) != 0) {
            c05nr2 = c1401605eA.LIZLLL;
        }
        if ((i & 8) != 0) {
            z3 = c1401605eA.LJ;
        }
        if ((i & 16) != 0) {
            z2 = c1401605eA.LJFF;
        } else {
            z2 = false;
        }
        c1401605eA.getClass();
        return new C1401605eA(c1350305Qf2, interfaceC1664360tPe2, c05nr2, z3, z2);
    }
}
