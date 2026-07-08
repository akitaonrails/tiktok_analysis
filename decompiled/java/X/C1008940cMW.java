package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0cMW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1008940cMW extends AbstractC1009010cMd {
    public final int LIZ;
    public final boolean LIZIZ;
    public final C1009270cN3 LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1008940cMW)) {
            return false;
        }
        C1008940cMW c1008940cMW = (C1008940cMW) obj;
        return this.LIZ == c1008940cMW.LIZ && this.LIZIZ == c1008940cMW.LIZIZ && Intrinsics.LJFF(this.LIZJ, c1008940cMW.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ClickTiles(tilesPosition=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isOpenDetailPage=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", logInfo=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1008940cMW(int i, boolean z, C1009270cN3 c1009270cN3) {
        this.LIZ = i;
        this.LIZIZ = z;
        this.LIZJ = c1009270cN3;
    }
}
