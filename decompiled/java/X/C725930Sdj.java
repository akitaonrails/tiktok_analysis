package X;

import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Sdj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C725930Sdj implements C15W0 {
    public final String LIZ;
    public final Long LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;

    @Override // X.C15W0
    public final Map<String, String> LIZ() {
        Pair[] pairArr = new Pair[6];
        pairArr[0] = new Pair("enter_method", this.LIZ);
        pairArr[1] = new Pair("explore_session_id", C15UA.LIZJ());
        pairArr[2] = new Pair("is_first_refresh", String.valueOf(C15UA.LIZ.getInt("is_first_refresh", 0)));
        pairArr[3] = new Pair("explore_topic_id", String.valueOf(this.LIZIZ));
        C15TA c15ta = C15TA.LIZ;
        String strValueOf = String.valueOf(this.LIZIZ);
        String strValueOf2 = String.valueOf(this.LIZJ);
        c15ta.getClass();
        String strLIZIZ = C15TA.LIZIZ(strValueOf, strValueOf2);
        if (strLIZIZ == null) {
            strLIZIZ = "";
        }
        pairArr[4] = new Pair("explore_topic", strLIZIZ);
        pairArr[5] = new Pair("from_explore_page", String.valueOf(this.LIZLLL));
        return C2097608Jq.LJIIIIZZ(pairArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C725930Sdj)) {
            return false;
        }
        C725930Sdj c725930Sdj = (C725930Sdj) obj;
        return Intrinsics.LJFF(this.LIZ, c725930Sdj.LIZ) && Intrinsics.LJFF(this.LIZIZ, c725930Sdj.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c725930Sdj.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c725930Sdj.LIZLLL);
    }

    @Override // X.C15W0
    public final String getEventName() {
        return "refresh_homepage_explore";
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        Long l = this.LIZIZ;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.LIZJ;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LIZLLL;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RefreshExploreET(enter_method=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", tabId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", tabName=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", fromExplorePage=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C725930Sdj(Long l, String str, String str2, String str3) {
        this.LIZ = str;
        this.LIZIZ = l;
        this.LIZJ = str2;
        this.LIZLLL = str3;
    }
}
