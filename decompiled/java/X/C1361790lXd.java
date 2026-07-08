package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lXd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1361790lXd implements InterfaceC1365770le3 {
    public final C1389920mH0 LIZ;

    public C1361790lXd() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1361790lXd) && Intrinsics.LJFF(this.LIZ, ((C1361790lXd) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TuxCenterToastBundle(baseBundle=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1365770le3
    public final C1389920mH0 LIZ() {
        return this.LIZ;
    }

    public /* synthetic */ C1361790lXd(int i) {
        this(new C1389920mH0(null, null, null, 8191));
    }

    public C1361790lXd(C1389920mH0 c1389920mH0) {
        this.LIZ = c1389920mH0;
    }
}
