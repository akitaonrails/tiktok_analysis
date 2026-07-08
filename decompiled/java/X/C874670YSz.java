package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0YSz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C874670YSz {
    public final long LIZ;
    public final long LIZIZ;
    public final C861890XrX LIZJ;
    public final String LIZLLL = "entrance";

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C874670YSz)) {
            return false;
        }
        C874670YSz c874670YSz = (C874670YSz) obj;
        return this.LIZ == c874670YSz.LIZ && this.LIZIZ == c874670YSz.LIZIZ && Intrinsics.LJFF(this.LIZJ, c874670YSz.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c874670YSz.LIZLLL);
    }

    public final int hashCode() {
        return (((((C786410Ut5.Y2(this.LIZ) * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DebugInfo(roomId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", creatorId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", key=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", source=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C874670YSz(long j, long j2, C861890XrX c861890XrX) {
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = c861890XrX;
    }
}
