package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0NrN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C606990NrN {
    public final String LIZ;
    public final List<Aweme> LIZIZ;
    public int LJFF;
    public boolean LIZJ = true;
    public int LIZLLL = 0;
    public int LJ = 0;
    public boolean LJI = false;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C606990NrN)) {
            return false;
        }
        C606990NrN c606990NrN = (C606990NrN) obj;
        return Intrinsics.LJFF(this.LIZ, c606990NrN.LIZ) && Intrinsics.LJFF(this.LIZIZ, c606990NrN.LIZIZ) && this.LIZJ == c606990NrN.LIZJ && this.LIZLLL == c606990NrN.LIZLLL && this.LJ == c606990NrN.LJ && this.LJFF == c606990NrN.LJFF && this.LJI == c606990NrN.LJI;
    }

    public final int hashCode() {
        String str = this.LIZ;
        return ((((((((((((str == null ? 0 : str.hashCode()) * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + this.LIZLLL) * 31) + this.LJ) * 31) + this.LJFF) * 31) + C786410Ut5.Z2(this.LJI);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OfflineInsertSession(triggerRequestId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", insertedItems=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", isActive=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", consumedCount=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", stableNetStreak=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", lastPreloadMs=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", isAggressive=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C606990NrN(List list, String str, int i) {
        this.LIZ = str;
        this.LIZIZ = list;
        this.LJFF = i;
    }
}
