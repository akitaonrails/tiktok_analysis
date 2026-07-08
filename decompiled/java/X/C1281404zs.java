package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04zs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1281404zs {
    public final boolean LIZ;
    public final long LIZIZ;
    public final long LIZJ;
    public final String LIZLLL;
    public final String LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1281404zs)) {
            return false;
        }
        C1281404zs c1281404zs = (C1281404zs) obj;
        return this.LIZ == c1281404zs.LIZ && this.LIZIZ == c1281404zs.LIZIZ && this.LIZJ == c1281404zs.LIZJ && Intrinsics.LJFF(this.LIZLLL, c1281404zs.LIZLLL) && Intrinsics.LJFF(this.LJ, c1281404zs.LJ);
    }

    public final int hashCode() {
        return (((((((C786410Ut5.Z2(this.LIZ) * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + C786410Ut5.Y2(this.LIZJ)) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ConsumeDecision(shouldSeek=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", seekPositionMs=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", clampedOffsetMs=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", result=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", reason=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1281404zs(long j, long j2, boolean z, String str, String str2) {
        this.LIZ = z;
        this.LIZIZ = j;
        this.LIZJ = j2;
        this.LIZLLL = str;
        this.LJ = str2;
    }
}
