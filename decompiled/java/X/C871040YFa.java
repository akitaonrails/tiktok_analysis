package X;

import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.AFwS201S0000000_14;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0YFa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C871040YFa {
    public final C0YB1 LIZ;
    public final int LIZIZ;
    public final C0YIK LIZJ;
    public final C0YHO LIZLLL;
    public final boolean LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C871040YFa)) {
            return false;
        }
        C871040YFa c871040YFa = (C871040YFa) obj;
        return Intrinsics.LJFF(this.LIZ, c871040YFa.LIZ) && this.LIZIZ == c871040YFa.LIZIZ && Intrinsics.LJFF(this.LIZJ, c871040YFa.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c871040YFa.LIZLLL) && this.LJ == c871040YFa.LJ;
    }

    public final int hashCode() {
        int iHashCode = ((((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31) + this.LIZJ.hashCode()) * 31;
        C0YHO c0yho = this.LIZLLL;
        return ((iHashCode + (c0yho == null ? 0 : c0yho.hashCode())) * 31) + C786410Ut5.Z2(this.LJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ClientLevelOptions(globalExperimentConfig=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", httpContentType=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", networkRequestConfiguration=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", dynamicNetworkRequestConfiguration=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", enableDynamicNetworkRequestConfig=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C871040YFa() {
        this(new C0YB1(AFwS201S0000000_14.get$arr$(1), new C863770XuZ(false), AFwS201S0000000_14.get$arr$(2), AFwS195S0000000_9.get$arr$(0), false, AFwS201S0000000_14.get$arr$(3)), 0, new C0YIK(0, 0L, 0, 0L, null, 127), null, false);
    }

    public C871040YFa(C0YB1 c0yb1, int i, C0YIK c0yik, C0YHO c0yho, boolean z) {
        this.LIZ = c0yb1;
        this.LIZIZ = i;
        this.LIZJ = c0yik;
        this.LIZLLL = c0yho;
        this.LJ = z;
    }
}
