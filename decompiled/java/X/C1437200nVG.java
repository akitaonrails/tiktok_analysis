package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0nVG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1437200nVG {
    public final String LIZ;
    public final int LIZIZ;

    public C1437200nVG() {
        this("", 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1437200nVG)) {
            return false;
        }
        C1437200nVG c1437200nVG = (C1437200nVG) obj;
        return Intrinsics.LJFF(this.LIZ, c1437200nVG.LIZ) && this.LIZIZ == c1437200nVG.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DeviceInfo(region=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", internetSpeed=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1437200nVG(String str, int i) {
        this.LIZ = str;
        this.LIZIZ = i;
    }
}
