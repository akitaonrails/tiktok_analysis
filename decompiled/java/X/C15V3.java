package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15V3, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15V3 implements C15W0 {
    public final Aweme LIZ;
    public final C15V2 LIZIZ;
    public final C20521215Rq LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15V3)) {
            return false;
        }
        C15V3 c15v3 = (C15V3) obj;
        return Intrinsics.LJFF(this.LIZ, c15v3.LIZ) && Intrinsics.LJFF(this.LIZIZ, c15v3.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c15v3.LIZJ);
    }

    @Override // X.C15W0
    public final String getEventName() {
        return "dislike";
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        C15V2 c15v2 = this.LIZIZ;
        int iHashCode2 = (iHashCode + (c15v2 == null ? 0 : c15v2.hashCode())) * 31;
        C20521215Rq c20521215Rq = this.LIZJ;
        return iHashCode2 + (c20521215Rq != null ? c20521215Rq.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DisLikeItemET(aweme=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", explorePageContext=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", exploreMobContext=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C15W0
    public final Map<String, String> LIZ() {
        String uid;
        Pair[] pairArr = new Pair[16];
        pairArr[0] = new Pair("enter_from", "homepage_explore");
        String aid = this.LIZ.getAid();
        if (aid == null) {
            aid = "";
        }
        pairArr[1] = new Pair("group_id", aid);
        User author = this.LIZ.getAuthor();
        if (author == null || (uid = author.getUid()) == null) {
            uid = "";
        }
        pairArr[2] = new Pair("author_id", uid);
        pairArr[3] = new Pair("collect_info", "");
        pairArr[4] = new Pair("has_meta_poi", CardStruct.IStatusCode.DEFAULT);
        pairArr[5] = new Pair("enter_method", "long_press");
        pairArr[6] = new Pair("from_page", "explore_feedback_window");
        pairArr[7] = new Pair("request_id", C735370Ssx.LJIJJ(this.LIZ));
        pairArr[8] = new Pair("pic_cnt", String.valueOf(C735370Ssx.LJIILL(this.LIZ)));
        String logPbString = this.LIZ.getLogPbString();
        if (logPbString == null) {
            logPbString = "";
        }
        pairArr[9] = new Pair("log_pb", logPbString);
        String strValueOf = String.valueOf(this.LIZ.getAwemeType());
        if (strValueOf == null) {
            strValueOf = "";
        }
        pairArr[10] = new Pair("aweme_type", strValueOf);
        pairArr[11] = new Pair("explore_innerfeed_entrance_group_id", "");
        pairArr[12] = new Pair("is_explore_innerfeed", CardStruct.IStatusCode.DEFAULT);
        C15V2 c15v2 = this.LIZIZ;
        pairArr[13] = new Pair("explore_topic_id", String.valueOf(c15v2 != null ? c15v2.LIZIZ : null));
        C15TA c15ta = C15TA.LIZ;
        C15V2 c15v22 = this.LIZIZ;
        String strValueOf2 = String.valueOf(c15v22 != null ? c15v22.LIZIZ : null);
        C15V2 c15v23 = this.LIZIZ;
        String strValueOf3 = String.valueOf(c15v23 != null ? c15v23.LIZ : null);
        c15ta.getClass();
        String strLIZIZ = C15TA.LIZIZ(strValueOf2, strValueOf3);
        pairArr[14] = new Pair("explore_topic", strLIZIZ != null ? strLIZIZ : "");
        C20521215Rq c20521215Rq = this.LIZJ;
        pairArr[15] = new Pair("from_explore_page", String.valueOf(c20521215Rq != null ? c20521215Rq.LIZ : null));
        Map<String, String> mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        Map<String, String> mapLIZIZ = C1348720lCY.LIZIZ(this.LIZ);
        if (mapLIZIZ != null) {
            mapLJIIJ.putAll(mapLIZIZ);
        }
        return mapLJIIJ;
    }

    public C15V3(Aweme aweme, C15V2 c15v2, C20521215Rq c20521215Rq) {
        this.LIZ = aweme;
        this.LIZIZ = c15v2;
        this.LIZJ = c20521215Rq;
    }
}
