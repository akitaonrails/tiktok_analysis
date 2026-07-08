package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1ClJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2239671ClJ {
    public final C2239681ClK LIZ;
    public final C2239661ClI LIZIZ;
    public final C2239691ClL LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public boolean LJFF;
    public boolean LJI;

    public C2239671ClJ() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2239671ClJ)) {
            return false;
        }
        C2239671ClJ c2239671ClJ = (C2239671ClJ) obj;
        return Intrinsics.LJFF(this.LIZ, c2239671ClJ.LIZ) && Intrinsics.LJFF(this.LIZIZ, c2239671ClJ.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c2239671ClJ.LIZJ) && this.LIZLLL == c2239671ClJ.LIZLLL && this.LJ == c2239671ClJ.LJ && this.LJFF == c2239671ClJ.LJFF && this.LJI == c2239671ClJ.LJI;
    }

    public final int hashCode() {
        return (((((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31) + C786410Ut5.Z2(this.LJ)) * 31) + C786410Ut5.Z2(this.LJFF)) * 31) + C786410Ut5.Z2(this.LJI);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RoundE2EState(context=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", cost=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", status=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", posted=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", started=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", pendingPost=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", queryStatusRequiresRender=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C2239671ClJ(int i) {
        C2239681ClK c2239681ClK = new C2239681ClK();
        C2239661ClI c2239661ClI = new C2239661ClI();
        C2239691ClL c2239691ClL = new C2239691ClL();
        this.LIZ = c2239681ClK;
        this.LIZIZ = c2239661ClI;
        this.LIZJ = c2239691ClL;
        this.LIZLLL = false;
        this.LJ = false;
        this.LJFF = false;
        this.LJI = false;
    }
}
