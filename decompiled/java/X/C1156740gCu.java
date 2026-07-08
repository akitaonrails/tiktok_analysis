package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gCu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1156740gCu {
    public final int LIZ;
    public final long LIZIZ;
    public Long LIZJ = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1156740gCu)) {
            return false;
        }
        C1156740gCu c1156740gCu = (C1156740gCu) obj;
        return this.LIZ == c1156740gCu.LIZ && this.LIZIZ == c1156740gCu.LIZIZ && Intrinsics.LJFF(this.LIZJ, c1156740gCu.LIZJ);
    }

    public final int hashCode() {
        int iY2 = ((this.LIZ * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31;
        Long l = this.LIZJ;
        return iY2 + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Session(index=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", triggerTimeMs=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", footerSeenTimeMs=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1156740gCu(int i, long j) {
        this.LIZ = i;
        this.LIZIZ = j;
    }
}
