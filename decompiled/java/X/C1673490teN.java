package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0teN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1673490teN {
    public final float LIZ;
    public final C1692150u8T LIZIZ;
    public final long LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1673490teN)) {
            return false;
        }
        C1673490teN c1673490teN = (C1673490teN) obj;
        return Float.compare(this.LIZ, c1673490teN.LIZ) == 0 && Intrinsics.LJFF(this.LIZIZ, c1673490teN.LIZIZ) && C1680770tq7.LIZ(this.LIZJ, c1673490teN.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TuxAlertBadgeMeasureResult(lineHeight=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", result=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", badgeSize=");
        sbLIZ.append((Object) C1680770tq7.LJFF(this.LIZJ));
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return (((Float.floatToIntBits(this.LIZ) * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Y2(this.LIZJ);
    }

    public C1673490teN(float f, C1692150u8T c1692150u8T, long j) {
        this.LIZ = f;
        this.LIZIZ = c1692150u8T;
        this.LIZJ = j;
    }
}
