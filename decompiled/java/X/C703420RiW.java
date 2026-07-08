package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0RiW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C703420RiW {
    public final C703160Ri6 LIZ;
    public final String LIZIZ;
    public final long LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C703420RiW)) {
            return false;
        }
        C703420RiW c703420RiW = (C703420RiW) obj;
        return Intrinsics.LJFF(this.LIZ, c703420RiW.LIZ) && Intrinsics.LJFF(this.LIZIZ, c703420RiW.LIZIZ) && this.LIZJ == c703420RiW.LIZJ;
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        String str = this.LIZIZ;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + C786410Ut5.Y2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MatchedRulePlan(rule=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", matchedTimingKey=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", effectiveDelayMs=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C703420RiW(C703160Ri6 c703160Ri6, String str, long j) {
        this.LIZ = c703160Ri6;
        this.LIZIZ = str;
        this.LIZJ = j;
    }
}
