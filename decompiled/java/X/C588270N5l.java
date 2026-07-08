package X;

import com.ss.android.ugc.aweme.profile.model.FollowerDetail;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0N5l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C588270N5l {
    public static boolean LIZ(User user) {
        if (user == null || C086I.LIZIZ(user.getFollowerDetailList())) {
            return false;
        }
        List<FollowerDetail> followerDetailList = user.getFollowerDetailList();
        ArrayList arrayList = new ArrayList();
        if (!C086I.LIZIZ(followerDetailList)) {
            arrayList.clear();
            arrayList.addAll(followerDetailList);
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                FollowerDetail followerDetail = (FollowerDetail) it2.next();
                if (followerDetail != null && followerDetail.getFansCount() <= 0) {
                    it2.remove();
                }
            }
        }
        if (C086I.LIZIZ(arrayList) || arrayList.size() <= 1) {
            return false;
        }
        return true;
    }
}
