package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0SQ1, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SQ1 {
    public final Aweme LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final int LIZLLL;
    public final String LJ;
    public final Integer LJFF;
    public final Set<String> LJI;
    public final Boolean LJII;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0SQ1)) {
            return false;
        }
        C0SQ1 c0sq1 = (C0SQ1) obj;
        return Intrinsics.LJFF(this.LIZ, c0sq1.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0sq1.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0sq1.LIZJ) && this.LIZLLL == c0sq1.LIZLLL && Intrinsics.LJFF(this.LJ, c0sq1.LJ) && Intrinsics.LJFF(this.LJFF, c0sq1.LJFF) && Intrinsics.LJFF(this.LJI, c0sq1.LJI) && Intrinsics.LJFF(this.LJII, c0sq1.LJII);
    }

    public final int hashCode() {
        Aweme aweme = this.LIZ;
        int iHashCode = (aweme == null ? 0 : aweme.hashCode()) * 31;
        String str = this.LIZIZ;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LIZJ;
        int iHashCode3 = (((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.LIZLLL) * 31;
        String str3 = this.LJ;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.LJFF;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Set<String> set = this.LJI;
        int iHashCode6 = (iHashCode5 + (set == null ? 0 : set.hashCode())) * 31;
        Boolean bool = this.LJII;
        return iHashCode6 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CommentAndLikeBubbleMobEventParam(aweme=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", enterFrom=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", groupId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", followStatus=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", storyType=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", pageType=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", reportShowSet=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", needSolidBackground=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0SQ1(Aweme aweme, String str, String str2, int i, String str3, Integer num, Set<String> set, Boolean bool) {
        this.LIZ = aweme;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = i;
        this.LJ = str3;
        this.LJFF = num;
        this.LJI = set;
        this.LJII = bool;
    }
}
