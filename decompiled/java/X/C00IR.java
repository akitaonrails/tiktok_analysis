package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00IR, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00IR {
    public final String LIZ;
    public final long LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C00IR)) {
            return false;
        }
        C00IR c00ir = (C00IR) obj;
        return Intrinsics.LJFF(this.LIZ, c00ir.LIZ) && this.LIZIZ == c00ir.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + C786410Ut5.Y2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ProfileAIRemixData(latestCoverUrl=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", latestConversationUpdateTime=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C00IR() {
        this("", 0L);
    }

    public C00IR(String str, long j) {
        this.LIZ = str;
        this.LIZIZ = j;
    }
}
