package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hY0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1208260hY0 {
    public final InterfaceC1235640iGA LIZ;
    public final C1208210hXv LIZIZ;
    public final C1798380wto LIZJ;
    public final C1208420hYG LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1208260hY0)) {
            return false;
        }
        C1208260hY0 c1208260hY0 = (C1208260hY0) obj;
        return Intrinsics.LJFF(this.LIZ, c1208260hY0.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1208260hY0.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1208260hY0.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1208260hY0.LIZLLL);
    }

    public final int hashCode() {
        return (((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ControllerState(requester=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", controllerConfig=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", networkManager=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", freqManager=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1208260hY0(InterfaceC1235640iGA interfaceC1235640iGA, C1208210hXv c1208210hXv, C1798380wto c1798380wto, C1208420hYG c1208420hYG) {
        this.LIZ = interfaceC1235640iGA;
        this.LIZIZ = c1208210hXv;
        this.LIZJ = c1798380wto;
        this.LIZLLL = c1208420hYG;
    }
}
