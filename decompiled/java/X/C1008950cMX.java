package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0cMX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1008950cMX extends AbstractC1009010cMd {
    public final int LIZ;
    public final C1009270cN3 LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1008950cMX)) {
            return false;
        }
        C1008950cMX c1008950cMX = (C1008950cMX) obj;
        return this.LIZ == c1008950cMX.LIZ && Intrinsics.LJFF(this.LIZIZ, c1008950cMX.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShowTiles(size=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", logInfo=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1008950cMX(int i, C1009270cN3 c1009270cN3) {
        this.LIZ = i;
        this.LIZIZ = c1009270cN3;
    }
}
