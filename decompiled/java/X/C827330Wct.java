package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Wct, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C827330Wct {
    public final int LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final long LIZLLL;
    public final long LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C827330Wct)) {
            return false;
        }
        C827330Wct c827330Wct = (C827330Wct) obj;
        return this.LIZ == c827330Wct.LIZ && Intrinsics.LJFF(this.LIZIZ, c827330Wct.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c827330Wct.LIZJ) && this.LIZLLL == c827330Wct.LIZLLL && this.LJ == c827330Wct.LJ;
    }

    public final int hashCode() {
        return (((((((this.LIZ * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + C786410Ut5.Y2(this.LIZLLL)) * 31) + C786410Ut5.Y2(this.LJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LogEntry(priority=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", tag=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", msg=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", tid=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", ts=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C827330Wct(int i, long j, long j2, String str, String str2) {
        this.LIZ = i;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = j;
        this.LJ = j2;
    }
}
