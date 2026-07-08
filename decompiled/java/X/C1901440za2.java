package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.arch.widgets.base.ChangeLiveData;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.AwS156S0400000_28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0za2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1901440za2 {
    public static int LIZLLL;
    public static String LJ;
    public static int LJFF;
    public static boolean LJIIIIZZ;
    public static final C1901440za2 LIZ = new C1901440za2();
    public static final Set<String> LIZIZ = new LinkedHashSet();
    public static final Set<String> LIZJ = new LinkedHashSet();
    public static final ChangeLiveData<C1901480za6> LJI = new ChangeLiveData<>();
    public static boolean LJII = true;
    public static int LJIIIZ = -1;
    public static final Map<String, Boolean> LJIIJ = new LinkedHashMap();
    public static final C1901450za3 LJIIJJI = C1901450za3.LL;

    public static boolean LIZLLL() {
        Map<String, Boolean> map = LJIIJ;
        Boolean bool = (Boolean) ((LinkedHashMap) map).get(LIZIZ());
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            LIZ.getClass();
            boolean z = LIZ().getBoolean(C786410Ut5.j4("is_first_enter_activity_%s", Arrays.copyOf(new Object[]{LIZIZ()}, 1)), true);
            if (z) {
                LIZ().storeBoolean(C786410Ut5.j4("is_first_enter_activity_%s", Arrays.copyOf(new Object[]{LIZIZ()}, 1)), false);
                map.put(LIZIZ(), Boolean.FALSE);
            }
            return z;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                int i = C2187451AjH.LIZ;
                C1720106oR.LIZIZ("FloatingBubbleHelper", "getIsFirstEnterActivity error", thM5exceptionOrNullimpl);
            }
            return true;
        }
    }

    public static Keva LIZ() {
        String uid;
        User curUser = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser();
        if (curUser == null || (uid = curUser.getUid()) == null) {
            uid = "";
        }
        return Keva.getRepo(C786410Ut5.j4("unread_bubble_repo_%s", Arrays.copyOf(new Object[]{uid}, 1)));
    }

    public static String LIZIZ() {
        String uid;
        User curUser = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser();
        return (curUser == null || (uid = curUser.getUid()) == null) ? "" : uid;
    }

    public static void LJII(int i) {
        Object c098200Yq;
        try {
            LIZ.getClass();
            LIZ().storeInt(C786410Ut5.j4("cycle_times_%s", Arrays.copyOf(new Object[]{LIZIZ()}, 1)), i);
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            int i2 = C2187451AjH.LIZ;
            C1720106oR.LIZIZ("FloatingBubbleHelper", "storeCycleTimes error", thM5exceptionOrNullimpl);
        }
    }

    public static void LJIIIIZZ(long j) {
        Object c098200Yq;
        try {
            LIZ.getClass();
            LIZ().storeLong(C786410Ut5.j4("disable_time_%s", Arrays.copyOf(new Object[]{LIZIZ()}, 1)), j);
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            int i = C2187451AjH.LIZ;
            C1720106oR.LIZIZ("FloatingBubbleHelper", "storeDisableTime error", thM5exceptionOrNullimpl);
        }
    }

    public static void LJIIIZ(int i) {
        Object c098200Yq;
        try {
            LIZ.getClass();
            LIZ().storeInt(C786410Ut5.j4("show_count_%s", Arrays.copyOf(new Object[]{LIZIZ()}, 1)), i);
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            int i2 = C2187451AjH.LIZ;
            C1720106oR.LIZIZ("FloatingBubbleHelper", "storeShowCount error", thM5exceptionOrNullimpl);
        }
    }

    public static void LJIIJ(String str) {
        int i = C2187451AjH.LIZ;
        C1720106oR.LJI("FloatingBubbleHelper", str);
    }

    public final void LIZJ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("hideBubble by ");
        sbLIZ.append(str);
        LJIIJ(C2188811AlT.LIZIZ(sbLIZ));
        LJI(this, null, Boolean.TRUE, null, 5);
    }

    public final void LJ(MusNotice musNotice) {
        if (musNotice == null) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onNoticeExposed: ");
        sbLIZ.append(musNotice.nid);
        sbLIZ.append(", hasRead: ");
        sbLIZ.append(musNotice.hasRead);
        sbLIZ.append(", exposedNidSet size: ");
        Set<String> set = LIZIZ;
        sbLIZ.append(set.size());
        sbLIZ.append(", contains: ");
        sbLIZ.append(set.contains(musNotice.nid));
        sbLIZ.append(", affinityNid: ");
        Set<String> set2 = LIZJ;
        sbLIZ.append(set2);
        LJIIJ(C2188811AlT.LIZIZ(sbLIZ));
        String str = musNotice.nid;
        if (str == null || set.contains(str)) {
            return;
        }
        if (musNotice.hasRead) {
            LJIIJ("hideBubble by Notice HasRead Show");
            LJI(this, null, Boolean.TRUE, null, 5);
            return;
        }
        set.add(str);
        if (Intrinsics.LJFF(LJ, str)) {
            LJIIJ("All Notice Show, Hide Bubble");
            LJI(this, null, Boolean.TRUE, null, 5);
            return;
        }
        if (set2.contains(musNotice.nid)) {
            LJIIJ("hideAvatar by affinity Notice Show");
            LJI(this, null, null, Boolean.TRUE, 3);
        }
        LJFF = LIZLLL - set.size();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("update UnreadCount to ");
        sbLIZ2.append(LJFF);
        LJIIJ(C2188811AlT.LIZIZ(sbLIZ2));
        int i = LJFF;
        if (i < 0) {
            i = 0;
        }
        LJI(this, Integer.valueOf(i), null, null, 6);
    }

    public static void LJFF(int i, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onRefreshBack, totalUnreadCount: ");
        sbLIZ.append(i);
        LJIIJ(C2188811AlT.LIZIZ(sbLIZ));
        LIZLLL = i;
        LJ = str;
        LIZIZ.clear();
        LIZJ.clear();
        LJII = true;
    }

    public static void LJI(C1901440za2 c1901440za2, Integer num, Boolean bool, Boolean bool2, int i) {
        Boolean bool3 = bool2;
        Boolean bool4 = bool;
        Integer num2 = num;
        if ((i & 1) != 0) {
            num2 = null;
        }
        if ((i & 2) != 0) {
            bool4 = null;
        }
        if ((i & 4) != 0) {
            bool3 = null;
        }
        c1901440za2.getClass();
        C2450909j1.LIZIZ(new AwS156S0400000_28(num2, LJI.getValue(), bool3, bool4, 8));
    }
}
