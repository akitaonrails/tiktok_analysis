package X;

import Y.AfS132S0000000_7;
import android.app.Activity;
import android.text.TextUtils;
import com.bytedance.android.livesdk.drawerfeed.tab.DrawerTabsApi;
import com.bytedance.android.livesdk.drawerfeed.tab.DrawerTabsItem;
import com.bytedance.android.livesdk.livesetting.feed.LiveDrawerTabTypeSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveDrawerFollowSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveDrawerLoadOptSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.host.user.IHostPad;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0IKG, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IKG {
    public static Map<String, WeakReference<C0IFS>> LIZ;
    public static List<DrawerTabsItem> LIZIZ;
    public static String LIZJ;
    public static RunnableC469290Ial LIZLLL;

    public static boolean LJ() {
        LiveDrawerLoadOptSetting liveDrawerLoadOptSetting = LiveDrawerLoadOptSetting.INSTANCE;
        return LiveDrawerTabTypeSetting.INSTANCE.getValue() == 2 || (liveDrawerLoadOptSetting.getValue() != null ? liveDrawerLoadOptSetting.getValue().isLandingGame : false) || LiveDrawerFollowSetting.INSTANCE.isGameEntranceExp();
    }

    public static String LIZ(Activity activity) {
        if (activity != null) {
            return activity.getClass().getSimpleName();
        }
        return null;
    }

    public static C0IKH LIZJ(String str) {
        C0IFS c0ifsLIZIZ = LIZIZ(null, str);
        if (c0ifsLIZIZ == null) {
            return null;
        }
        return c0ifsLIZIZ.k6();
    }

    public static C472280Ifa LIZLLL(String str) {
        C0IKH c0ikhLIZJ = LIZJ(str);
        if (c0ikhLIZJ != null) {
            return c0ikhLIZJ.wx();
        }
        return null;
    }

    public static void LJII(C19EG c19eg) {
        C0IFS c0ifsLIZIZ;
        C0IKH c0ikhK6;
        if (c19eg != null && !c19eg.isFinishing() && (c0ifsLIZIZ = LIZIZ(c19eg, LIZ(c19eg))) != null && (c0ikhK6 = c0ifsLIZIZ.k6()) != null && Boolean.FALSE.equals(c0ikhK6.ot())) {
            long currentUserId = UserService.getInstance().user().getCurrentUserId();
            boolean zLIZJ = C469460Ib2.LIZJ();
            C480460Ism.LIZ().getClass();
            ((DrawerTabsApi) C480460Ism.LIZLLL(DrawerTabsApi.class)).queryDrawerTabs(currentUserId, zLIZJ ? 1 : 0).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS132S0000000_7(40), new AfS132S0000000_7(41));
            c0ikhK6.Iw("tryUpdateDrawerTabs");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C0IFS LIZIZ(C19EG c19eg, String str) {
        Reference reference;
        if (c19eg instanceof C0IFS) {
            return (C0IFS) c19eg;
        }
        if (LIZ != null && !TextUtils.isEmpty(str) && (reference = (Reference) ((HashMap) LIZ).get(str)) != null) {
            return (C0IFS) reference.get();
        }
        return null;
    }

    public static void LJFF(Activity activity, boolean z) {
        C0IKH c0ikhLIZJ;
        if (activity != null && !activity.isFinishing() && (c0ikhLIZJ = LIZJ(LIZ(activity))) != null) {
            c0ikhLIZJ.nt(z, true);
            if (!z) {
                C467800IWc.LJIJ.LJFF = C467800IWc.LJIJJ;
            }
        }
    }

    public static void LJI(C19EG c19eg, Boolean bool) {
        C472280Ifa c472280IfaLIZLLL = LIZLLL(LIZ(c19eg));
        if (c472280IfaLIZLLL != null) {
            c472280IfaLIZLLL.setDrawerEnable(bool.booleanValue());
            c472280IfaLIZLLL.setPadNewLandscape(((IHostPad) C1161920gLG.LIZJ(IHostPad.class)).isPad());
        }
    }
}
