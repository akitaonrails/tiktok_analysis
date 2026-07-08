package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0IqK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C478940IqK {
    public final List<C479150Iqf> LIZ;
    public final long LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C478940IqK)) {
            return false;
        }
        C478940IqK c478940IqK = (C478940IqK) obj;
        return Intrinsics.LJFF(this.LIZ, c478940IqK.LIZ) && this.LIZIZ == c478940IqK.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + C786410Ut5.Y2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CachedPlayFeedData(feedItems=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", timestamp=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C478940IqK(List<C479150Iqf> list, long j) {
        this.LIZ = list;
        this.LIZIZ = j;
    }
}
