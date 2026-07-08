package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZOV, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZOV {
    public final InterfaceC1673306gt LIZ;
    public final InterfaceC1673306gt LIZIZ;
    public final C898860ZOa LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0ZOV)) {
            return false;
        }
        C0ZOV c0zov = (C0ZOV) obj;
        return Intrinsics.LJFF(this.LIZ, c0zov.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0zov.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0zov.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IMSkeletonLayoutPowerCellData(paddingTop=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", paddingBottom=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", contentGestureConfig=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static C0ZOV LIZ(C0ZOV c0zov, C898860ZOa c898860ZOa) {
        InterfaceC1673306gt interfaceC1673306gt = c0zov.LIZ;
        InterfaceC1673306gt interfaceC1673306gt2 = c0zov.LIZIZ;
        c0zov.getClass();
        return new C0ZOV(interfaceC1673306gt, interfaceC1673306gt2, c898860ZOa);
    }

    public C0ZOV(InterfaceC1673306gt interfaceC1673306gt, InterfaceC1673306gt interfaceC1673306gt2, C898860ZOa c898860ZOa) {
        this.LIZ = interfaceC1673306gt;
        this.LIZIZ = interfaceC1673306gt2;
        this.LIZJ = c898860ZOa;
    }
}
