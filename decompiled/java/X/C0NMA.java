package X;

import android.util.Log;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.friends.FriendsFeed;
import com.ss.android.ugc.aweme.friendstab.api.FriendsFeedResponse;
import java.util.List;
import kotlin.jvm.internal.AFwS195S0000000_9;

/* JADX INFO: renamed from: X.0NMA, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NMA {
    public static final C0NMA LIZ = new C0NMA();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(114));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(116));
    public static final C2232408os LIZLLL = new C2232408os(C823050WQl.LIZLLL());
    public static final C01GW LJ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(115));

    public static C0NMB LIZ() {
        Object objLJJJLL;
        FriendsFeedResponse friendsFeedResponse;
        List<FriendsFeed> list;
        try {
            String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
            LIZ.getClass();
            objLJJJLL = C13LP.LJJJLL(((C0NM9) LIZIZ.getValue()).LIZIZ(curUserId));
        } catch (Throwable th) {
            th = th;
            objLJJJLL = null;
        }
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("cached friends feed size = ");
            C0NMB c0nmb = (C0NMB) objLJJJLL;
            sbLIZ.append((c0nmb == null || (friendsFeedResponse = c0nmb.LIZIZ) == null || (list = friendsFeedResponse.friendFeedData) == null) ? null : Integer.valueOf(list.size()));
            sbLIZ.append(", createdTimeMillis = ");
            C0NMB c0nmb2 = (C0NMB) objLJJJLL;
            sbLIZ.append(c0nmb2 != null ? Long.valueOf(c0nmb2.LIZJ) : null);
            C189200o6.m2constructorimpl(Integer.valueOf(Log.d("FriendsFeedCache", C2188811AlT.LIZIZ(sbLIZ))));
        } catch (Throwable th2) {
            th = th2;
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        return (C0NMB) objLJJJLL;
    }
}
