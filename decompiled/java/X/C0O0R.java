package X;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.friends.FriendsFeed;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0O0R, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0O0R {
    public static boolean LIZIZ;
    public static boolean LJ;
    public static boolean LJI;
    public static boolean LJII;
    public static boolean LJIIIIZZ;
    public static int LJIIIZ;
    public static final C0O0R LIZ = new C0O0R();
    public static int LIZJ = -1;
    public static int LIZLLL = -1;
    public static String LJFF = "";

    public static long LIZIZ() {
        try {
            return SystemClock.elapsedRealtime() - C1150504el.LIZ().LJJIII;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return 0L;
        }
    }

    public static List LIZ(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : (ArrayList) list) {
            if (TextUtils.isDigitsOnly((String) obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static void LIZLLL(int i) {
        try {
            if (LJIIIIZZ) {
                LIZLLL = 1;
            } else {
                LIZLLL = i;
                C189200o6.m2constructorimpl(Unit.LIZ);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public final void LIZJ(List<FriendsFeed> list) {
        String aid;
        Aweme aweme;
        String aid2;
        try {
            if (LJII) {
                LIZJ = 1;
                return;
            }
            if (list == null) {
                LIZJ = -1;
                return;
            }
            if (list.isEmpty()) {
                LIZJ = 2;
                return;
            }
            FriendsFeed friendsFeed = (FriendsFeed) C13LP.LJJLIIIJL(list);
            if (friendsFeed != null && friendsFeed.getSource() == 4) {
                ArrayList arrayList = new ArrayList();
                for (FriendsFeed friendsFeed2 : list) {
                    FriendsFeed friendsFeed3 = friendsFeed2;
                    if (friendsFeed3.getSource() != 4 && (aweme = friendsFeed3.getAweme()) != null && (aid2 = aweme.getAid()) != null && TextUtils.isDigitsOnly(aid2)) {
                        arrayList.add(friendsFeed2);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    Aweme aweme2 = ((FriendsFeed) it2.next()).getAweme();
                    if (aweme2 != null && (aid = aweme2.getAid()) != null) {
                        arrayList2.add(aid);
                    }
                }
                List listLIZ = LIZ(arrayList2);
                if (((ArrayList) listLIZ).isEmpty()) {
                    LIZJ = 0;
                    return;
                } else {
                    C189200o6.m2constructorimpl(C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C0O0Q(this, listLIZ, null), 3));
                    return;
                }
            }
            LIZJ = 1;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }
}
