package X;

import com.ss.android.ugc.aweme.creative.model.common.MentionDataItem;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04xd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1267504xd {
    public final boolean LIZ;
    public final List<MentionDataItem> LIZIZ;
    public final List<MentionDataItem> LIZJ;
    public final List<MentionDataItem> LIZLLL;
    public final boolean LJ;

    /* JADX WARN: Illegal instructions before constructor call */
    public C1267504xd() {
        C13BV c13bv = C13BV.INSTANCE;
        this(c13bv, c13bv, c13bv, true, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1267504xd)) {
            return false;
        }
        C1267504xd c1267504xd = (C1267504xd) obj;
        return this.LIZ == c1267504xd.LIZ && Intrinsics.LJFF(this.LIZIZ, c1267504xd.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1267504xd.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1267504xd.LIZLLL) && this.LJ == c1267504xd.LJ;
    }

    public final int hashCode() {
        return (((((((C786410Ut5.Z2(this.LIZ) * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + C786410Ut5.Z2(this.LJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MentionListState(isEnable=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", remainUsers=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", currentMentionedUsers=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", followPathUsers=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", isLoading=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1267504xd(List list, List list2, List list3, boolean z, boolean z2) {
        this.LIZ = z;
        this.LIZIZ = list;
        this.LIZJ = list2;
        this.LIZLLL = list3;
        this.LJ = z2;
    }
}
