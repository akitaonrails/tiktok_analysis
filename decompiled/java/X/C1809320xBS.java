package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.rank.list.model.RankListV2Response;
import com.bytedance.android.livesdk.rank.model.PrimaryRankTabInfo;
import com.bytedance.android.livesdk.rank.model.SubRankTabInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0xBS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1809320xBS {
    public static AbstractC875030YUj LIZ(RankListV2Response rankListV2Response) {
        RankListV2Response.Data data;
        String string;
        String string2;
        RankListV2Response.RankInfo rankInfo;
        User user;
        List<RankListV2Response.RankInfo> list;
        List<RankListV2Response.RankInfo> list2;
        C20441214yg.LIZIZ("LiveCreatorRankingPageDataMapper", "map start");
        C1785370wYp c1785370wYpLIZIZ = null;
        if (rankListV2Response != null && (data = rankListV2Response.data) != null) {
            RankListV2Response.RankView rankView = data.rankView;
            if (rankView != null && (list2 = rankView.ranks) != null) {
                for (RankListV2Response.RankInfo rankInfo2 : list2) {
                    User user2 = rankInfo2.rankUser;
                    if (user2 != null) {
                        rankInfo2.user = user2;
                        rankInfo2.rankUser = null;
                    }
                }
            }
            RankListV2Response.RankView rankView2 = data.rankView;
            if (rankView2 != null && (list = rankView2.ranks) != null) {
                C1809330xBT.LIZ(list, AnonymousClass0207.get$arr$(165));
            }
            RankListV2Response.RankView rankView3 = data.rankView;
            if (rankView3 != null && (rankInfo = rankView3.ownerRank) != null && (user = rankInfo.rankUser) != null) {
                rankInfo.user = user;
                rankInfo.rankUser = null;
            }
            RankListV2Response.RankView rankView4 = data.rankView;
            if (rankView4 != null) {
                List list3 = rankView4.primaryTabs;
                List<SubRankTabInfo> list4 = rankView4.subTabs;
                boolean z = false;
                if (list3 == null || list3.isEmpty()) {
                    if (list4 != null && !list4.isEmpty()) {
                        if (list3 == null) {
                            list3 = C13BV.INSTANCE;
                        }
                    } else {
                        C20441214yg.LJIIL("LiveCreatorRankingPageDataMapper", "map failed: tabs are empty");
                        return new C0YUZ(new C874990YUf("tabs are empty"));
                    }
                }
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list3, 10));
                Iterator it2 = list3.iterator();
                while (true) {
                    String str = "";
                    if (!it2.hasNext()) {
                        break;
                    }
                    PrimaryRankTabInfo primaryRankTabInfo = (PrimaryRankTabInfo) it2.next();
                    Text text = primaryRankTabInfo.titleText;
                    if (text != null && (string2 = C1133830fbx.LJIILIIL(text, "").toString()) != null) {
                        str = string2;
                    }
                    arrayList.add(new C1779500wPM(primaryRankTabInfo.rankType, str));
                }
                if (list4 == null) {
                    list4 = C13BV.INSTANCE;
                }
                ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list4, 10));
                for (SubRankTabInfo subRankTabInfo : list4) {
                    Text text2 = subRankTabInfo.title;
                    if (text2 == null || (string = C1133830fbx.LJIILIIL(text2, "").toString()) == null) {
                        string = "";
                    }
                    arrayList2.add(new C1779500wPM(subRankTabInfo.rankType, string));
                }
                boolean z2 = rankView4.history;
                String str2 = rankView4.ruleUrl;
                String str3 = rankView4.emptyRankSchema;
                if (!(!a0.LJJJIL(str3))) {
                    str3 = null;
                }
                int i = rankView4.viewStatus;
                long j = rankView4.countdown;
                C1785500wZ2 c1785500wZ2 = new C1785500wZ2(j, i, str2, arrayList, z2, arrayList2, str3);
                if (arrayList2.isEmpty()) {
                    c1785500wZ2 = new C1785500wZ2(j, i, str2, arrayList, z2, arrayList, str3);
                }
                List list5 = rankView4.ranks;
                if (list5 == null) {
                    list5 = C13BV.INSTANCE;
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it3 = list5.iterator();
                while (it3.hasNext()) {
                    C1785370wYp c1785370wYpLIZIZ2 = LIZIZ((RankListV2Response.RankInfo) it3.next());
                    if (c1785370wYpLIZIZ2 != null) {
                        arrayList3.add(c1785370wYpLIZIZ2);
                    }
                }
                C1555950qan c1555950qan = new C1555950qan(arrayList3);
                RankListV2Response.RankInfo rankInfo3 = rankView4.ownerRank;
                if (rankInfo3 != null) {
                    c1785370wYpLIZIZ = LIZIZ(rankInfo3);
                }
                C1777390wLx c1777390wLx = new C1777390wLx(c1785370wYpLIZIZ);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("map success: firstTabs=");
                sbLIZ.append(c1785500wZ2.LIZ.size());
                sbLIZ.append(", subTabs=");
                sbLIZ.append(c1785500wZ2.LIZIZ.size());
                sbLIZ.append(", ranks=");
                sbLIZ.append(arrayList3.size());
                sbLIZ.append(", hasOwner=");
                if (c1785370wYpLIZIZ != null) {
                    z = true;
                }
                sbLIZ.append(z);
                C20441214yg.LIZIZ("LiveCreatorRankingPageDataMapper", C2188811AlT.LIZIZ(sbLIZ));
                return new C874940YUa(new C1785380wYq(c1785500wZ2, c1555950qan, c1777390wLx, rankView4));
            }
        }
        C20441214yg.LJIIL("LiveCreatorRankingPageDataMapper", "map failed: rank_view is null");
        return new C0YUZ(new C874990YUf("rank_view is null"));
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00c7 A[PHI: r3
      0x00c7: PHI (r3v3 java.lang.String) = (r3v0 java.lang.String), (r3v4 java.lang.String) binds: [B:48:0x00e3, B:40:0x00c5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e6 A[PHI: r3
      0x00e6: PHI (r3v1 java.lang.String) = (r3v0 java.lang.String), (r3v3 java.lang.String), (r3v3 java.lang.String) binds: [B:48:0x00e3, B:42:0x00c9, B:44:0x00d0] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C1785370wYp LIZIZ(com.bytedance.android.livesdk.rank.list.model.RankListV2Response.RankInfo r29) {
        /*
            Method dump skipped, instruction units count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1809320xBS.LIZIZ(com.bytedance.android.livesdk.rank.list.model.RankListV2Response$RankInfo):X.0wYp");
    }
}
