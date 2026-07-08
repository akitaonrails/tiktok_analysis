package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import webcast.api.ranklist.RankInteractListResponse;
import webcast.data.RankUser;

/* JADX INFO: renamed from: X.07QX, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07QX {
    public static final List<RankUser> LIZ(RankInteractListResponse rankInteractListResponse) {
        RankInteractListResponse.Data data;
        List<RankInteractListResponse.Data.RankInfo> list;
        if (rankInteractListResponse != null && (data = rankInteractListResponse.data) != null && (list = data.ranks) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<RankInteractListResponse.Data.RankInfo> it2 = list.iterator();
            while (it2.hasNext()) {
                RankUser rankUser = it2.next().rankUser;
                if (rankUser != null) {
                    arrayList.add(rankUser);
                }
            }
            return arrayList;
        }
        return C13BV.INSTANCE;
    }
}
