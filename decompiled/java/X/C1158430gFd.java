package X;

import com.ss.android.ugc.aweme.explore.data.ExploreAwemeList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gFd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1158430gFd extends AbstractC1158440gFe {
    public final ExploreAwemeList LIZIZ;
    public final long LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1158430gFd)) {
            return false;
        }
        C1158430gFd c1158430gFd = (C1158430gFd) obj;
        return Intrinsics.LJFF(this.LIZIZ, c1158430gFd.LIZIZ) && this.LIZJ == c1158430gFd.LIZJ;
    }

    public final int hashCode() {
        return (this.LIZIZ.hashCode() * 31) + C786410Ut5.Y2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ApplyInterestPrefetchCache(list=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", interestId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1158430gFd(long j, ExploreAwemeList exploreAwemeList) {
        this.LIZIZ = exploreAwemeList;
        this.LIZJ = j;
    }
}
