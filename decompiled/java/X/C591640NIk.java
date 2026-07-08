package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: X.0NIk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C591640NIk {
    public static void LIZ(int i, List list) {
        ArrayList<Aweme> arrayList = new ArrayList();
        for (Object obj : list) {
            if (true ^ ((Aweme) obj).isAd()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        for (Aweme aweme : arrayList) {
            HashMap map = new HashMap();
            String aid = aweme.getAid();
            String str = "";
            if (aid == null) {
                aid = "";
            }
            map.put("aweme_id", aid);
            map.put("aweme_type", String.valueOf(aweme.getAwemeType()));
            int distributeType = aweme.getDistributeType();
            if (distributeType != 1) {
                if (distributeType != 2) {
                    if (distributeType == 3) {
                        str = "long_with_short";
                    }
                } else {
                    str = "long_direct";
                }
            } else {
                str = "short";
            }
            map.put("impr_type", str);
            map.put("feed_page_type", String.valueOf(i));
            arrayList2.add(map);
        }
        C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C01QA(arrayList2, null), 2);
    }
}
