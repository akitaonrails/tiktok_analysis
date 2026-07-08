package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qcs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1557240qcs implements InterfaceC1785530wZ5 {
    public final C1557250qct LIZ;
    public final boolean LIZIZ = true;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1557240qcs)) {
            return false;
        }
        C1557240qcs c1557240qcs = (C1557240qcs) obj;
        return Intrinsics.LJFF(this.LIZ, c1557240qcs.LIZ) && this.LIZIZ == c1557240qcs.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OpenLiveMatch(payload=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", dismissPage=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1557240qcs(C1557250qct c1557250qct) {
        this.LIZ = c1557250qct;
    }
}
