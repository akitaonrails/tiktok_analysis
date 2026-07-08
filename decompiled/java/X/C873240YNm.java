package X;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0YNm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C873240YNm {
    public final String LIZ;
    public final List<Long> LIZIZ;
    public final Map<String, String> LIZJ;
    public final boolean LIZLLL;
    public final Integer LJ;
    public final Long LJFF;
    public final Integer LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C873240YNm)) {
            return false;
        }
        C873240YNm c873240YNm = (C873240YNm) obj;
        return Intrinsics.LJFF(this.LIZ, c873240YNm.LIZ) && Intrinsics.LJFF(this.LIZIZ, c873240YNm.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c873240YNm.LIZJ) && this.LIZLLL == c873240YNm.LIZLLL && Intrinsics.LJFF(this.LJ, c873240YNm.LJ) && Intrinsics.LJFF(this.LJFF, c873240YNm.LJFF) && Intrinsics.LJFF(this.LJI, c873240YNm.LJI);
    }

    public final int hashCode() {
        int iHashCode = ((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31;
        Integer num = this.LJ;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Long l = this.LJFF;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        Integer num2 = this.LJI;
        return iHashCode3 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AddMemberRequest(conversationId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", uidList=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", bizExt=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", enableFakeWrite=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", inboxType=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", conversationShortId=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", conversationType=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C873240YNm(String str, List list, Map map, boolean z, int i) {
        this(str, list, map, (i & 8) != 0 ? true : z, null, null, null);
    }

    public static C873240YNm LIZ(C873240YNm c873240YNm, String str, List list, Map map, boolean z) {
        return new C873240YNm(str, list, map, z, c873240YNm.LJ, c873240YNm.LJFF, c873240YNm.LJI);
    }

    public C873240YNm(String str, List<Long> list, Map<String, String> map, boolean z, Integer num, Long l, Integer num2) {
        this.LIZ = str;
        this.LIZIZ = list;
        this.LIZJ = map;
        this.LIZLLL = z;
        this.LJ = num;
        this.LJFF = l;
        this.LJI = num2;
    }
}
