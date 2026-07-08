package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hpN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1219030hpN {
    public final List<Aweme> LIZ;
    public final List<String> LIZIZ;
    public AbstractC1588120rQg LIZJ;
    public List<String> LIZLLL;
    public boolean LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1219030hpN)) {
            return false;
        }
        C1219030hpN c1219030hpN = (C1219030hpN) obj;
        return Intrinsics.LJFF(this.LIZ, c1219030hpN.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1219030hpN.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1219030hpN.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1219030hpN.LIZLLL) && this.LJ == c1219030hpN.LJ;
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31;
        AbstractC1588120rQg abstractC1588120rQg = this.LIZJ;
        int iHashCode2 = (iHashCode + (abstractC1588120rQg == null ? 0 : abstractC1588120rQg.hashCode())) * 31;
        List<String> list = this.LIZLLL;
        return ((iHashCode2 + (list != null ? list.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StandaloneFeedState(awemes=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", outerAnchorKeys=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", nextPagination=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", sessionMafIds=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", hasMore=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1219030hpN() {
        this(new ArrayList(), new ArrayList(), null, null, false);
    }

    public C1219030hpN(List<Aweme> list, List<String> list2, AbstractC1588120rQg abstractC1588120rQg, List<String> list3, boolean z) {
        this.LIZ = list;
        this.LIZIZ = list2;
        this.LIZJ = abstractC1588120rQg;
        this.LIZLLL = list3;
        this.LJ = z;
    }
}
