package Y;

import X.AnonymousClass0207;
import X.C07QX;
import X.C07UB;
import X.C09JN;
import X.C09RB;
import X.C13LP;
import X.C1939607ik;
import X.C1C7U;
import X.C2029207xC;
import X.C20441214yg;
import X.C2188811AlT;
import X.InterfaceC2028607x6;
import com.bytedance.android.livesdk.rank.impl.RankService;
import java.util.List;
import webcast.api.ranklist.RankInteractListResponse;
import webcast.data.RankUser;

/* JADX INFO: loaded from: classes4.dex */
public class AfS2S0200200_3 implements C09JN {
    public final int $t;
    public long j2;
    public long j3;
    public Object l0;
    public Object l1;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS2S0200200_3 afS2S0200200_3, Object obj) {
        String str;
        long j;
        RankInteractListResponse.Data data;
        RankService rankService = (RankService) afS2S0200200_3.l0;
        long j2 = afS2S0200200_3.j2;
        long j3 = afS2S0200200_3.j3;
        InterfaceC2028607x6 interfaceC2028607x6 = (InterfaceC2028607x6) afS2S0200200_3.l1;
        RankInteractListResponse rankInteractListResponse = (RankInteractListResponse) obj;
        rankService.getClass();
        C1C7U.LIZ("RankService@216.requestFriendRankMatchSuggestion$1L");
        int size = C07QX.LIZ(rankInteractListResponse).size();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("requestFriendRankMatchSuggestion success, roomAnchorId=");
        sbLIZ.append(j2);
        sbLIZ.append(", toAnchorId=");
        sbLIZ.append(j3);
        sbLIZ.append(", rankUserCount=");
        sbLIZ.append(size);
        C20441214yg.LJIIIZ("RankService", C2188811AlT.LIZIZ(sbLIZ));
        List<RankUser> listLIZ = C07QX.LIZ(rankInteractListResponse);
        C07UB c07ub = null;
        if (!listLIZ.isEmpty()) {
            List listLJJII = C09RB.LJJII(C09RB.LJJI(C09RB.LJIJI(new C1939607ik(listLIZ), AnonymousClass0207.get$arr$(59)), 3));
            if (!listLJJII.isEmpty()) {
                RankUser rankUser = (RankUser) C13LP.LJJJLL(listLIZ);
                if (rankUser == null || (str = rankUser.nickname) == null) {
                    str = "";
                }
                if (rankInteractListResponse != null && (data = rankInteractListResponse.data) != null) {
                    j = data.totalInteractNum;
                } else {
                    j = 0;
                }
                c07ub = new C07UB(j3, j, str, listLJJII);
            }
        }
        rankService.LL = c07ub;
        interfaceC2028607x6.LIZ();
        C1C7U.LIZIZ("RankService@216.requestFriendRankMatchSuggestion$1L");
    }

    public static final void accept$1(AfS2S0200200_3 afS2S0200200_3, Object obj) {
        RankService rankService = (RankService) afS2S0200200_3.l0;
        long j = afS2S0200200_3.j2;
        long j2 = afS2S0200200_3.j3;
        InterfaceC2028607x6 interfaceC2028607x6 = (InterfaceC2028607x6) afS2S0200200_3.l1;
        rankService.getClass();
        C1C7U.LIZ("RankService@216.requestFriendRankMatchSuggestion$2L");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("requestFriendRankMatchSuggestion failed, roomAnchorId=");
        sbLIZ.append(j);
        sbLIZ.append(", toAnchorId=");
        sbLIZ.append(j2);
        C20441214yg.LJIILIIL("RankService", C2188811AlT.LIZIZ(sbLIZ), (Throwable) obj);
        rankService.LL = null;
        interfaceC2028607x6.LIZ();
        C1C7U.LIZIZ("RankService@216.requestFriendRankMatchSuggestion$2L");
    }

    public AfS2S0200200_3(RankService rankService, long j, long j2, C2029207xC c2029207xC, int i) {
        this.$t = i;
        this.l0 = rankService;
        this.j2 = j;
        this.j3 = j2;
        this.l1 = c2029207xC;
    }
}
