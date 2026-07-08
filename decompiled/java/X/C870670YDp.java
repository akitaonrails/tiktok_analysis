package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0YDp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C870670YDp {
    public final long LIZ;
    public final String LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final long LJ;

    public C870670YDp() {
        this(0L, 0, null, 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C870670YDp)) {
            return false;
        }
        C870670YDp c870670YDp = (C870670YDp) obj;
        return this.LIZ == c870670YDp.LIZ && Intrinsics.LJFF(this.LIZIZ, c870670YDp.LIZIZ) && this.LIZJ == c870670YDp.LIZJ && this.LIZLLL == c870670YDp.LIZLLL && this.LJ == c870670YDp.LJ;
    }

    public final int hashCode() {
        return (((((((C786410Ut5.Y2(this.LIZ) * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ) * 31) + this.LIZLLL) * 31) + C786410Ut5.Y2(this.LJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ConversationBadgeInfo(conversationShortId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", conversationId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", readBadgeCount=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", badgeCount=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", badgeVersion=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C870670YDp(long j, int i, String str, int i2) {
        long j2;
        int i3;
        if ((i2 & 1) != 0) {
            j2 = -1;
        } else {
            j2 = 0;
        }
        str = (i2 & 2) != 0 ? "" : str;
        if ((i2 & 4) != 0) {
            i3 = -1;
        } else {
            i3 = 0;
        }
        i = (i2 & 8) != 0 ? -1 : i;
        j = (i2 & 16) != 0 ? -1L : j;
        this.LIZ = j2;
        this.LIZIZ = str;
        this.LIZJ = i3;
        this.LIZLLL = i;
        this.LJ = j;
    }
}
