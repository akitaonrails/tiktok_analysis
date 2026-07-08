package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Yzp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C892510Yzp {
    public final int LIZ;
    public final List<C740650T3n> LIZIZ;
    public final boolean LIZJ;
    public final long LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C892510Yzp)) {
            return false;
        }
        C892510Yzp c892510Yzp = (C892510Yzp) obj;
        return this.LIZ == c892510Yzp.LIZ && Intrinsics.LJFF(this.LIZIZ, c892510Yzp.LIZIZ) && this.LIZJ == c892510Yzp.LIZJ && this.LIZLLL == c892510Yzp.LIZLLL;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ArchiveEntranceUnReadInfo(unreadCount=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", previewList=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", isPreviewHighValueUnreadItems=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", latestTime=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C892510Yzp(long j, int i, boolean z, List list) {
        this.LIZ = i;
        this.LIZIZ = list;
        this.LIZJ = z;
        this.LIZLLL = j;
    }
}
