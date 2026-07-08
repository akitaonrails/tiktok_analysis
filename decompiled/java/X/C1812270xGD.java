package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0xGD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1812270xGD extends AbstractC1812500xGa {
    public final C1812850xH9 LIZ;
    public final int LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1812270xGD)) {
            return false;
        }
        C1812270xGD c1812270xGD = (C1812270xGD) obj;
        return Intrinsics.LJFF(this.LIZ, c1812270xGD.LIZ) && this.LIZIZ == c1812270xGD.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OpenBigImagePanel(item=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", entrance=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1812270xGD(C1812850xH9 c1812850xH9, int i) {
        this.LIZ = c1812850xH9;
        this.LIZIZ = i;
    }
}
