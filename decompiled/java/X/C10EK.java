package X;

import android.app.Activity;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.ab.SubscribeSettingsExp;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.notification.ui.NotificationLiveBottomDialog;
import com.ss.android.ugc.aweme.profile.model.GeneralPermission;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Arrays;
import kotlin.jvm.internal.AFwS232S0000000_4;
import kotlin.jvm.internal.AFwS271S0000000_28;
import kotlin.jvm.internal.AwS111S1200000_28;
import kotlin.jvm.internal.AwS607S0100000_28;
import kotlin.jvm.internal.AwS653S0100000_4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.10EK, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10EK {
    public static final C10EK LIZ = new C10EK();
    public static PackageManager LIZIZ;
    public static C11RK<C10ET> LIZJ;

    public static long LJ() {
        String curUserId = ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ() == null ? "-1" : ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().getCurUserId();
        curUserId.toString();
        return CastLongProtector.parseLong(curUserId);
    }

    public static boolean LJFF() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("push_live_");
        sbLIZ.append(LJ());
        return KevaImpl.getRepo(C2188811AlT.LIZIZ(sbLIZ), 0).getBoolean("key_mt_live_push_switch", true);
    }

    public static boolean LJI() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("push_post_");
        sbLIZ.append(LJ());
        return Keva.getRepo(C2188811AlT.LIZIZ(sbLIZ)).getBoolean("key_post_push_switch", true);
    }

    public static boolean LJII(String str) {
        NotificationManager notificationManager;
        NotificationChannel notificationChannel;
        String realChannelId = C303010BuF.LIZ().getRealChannelId(str);
        C844470XAv.LIZ.getClass();
        Object objH2 = C786410Ut5.H2(C844470XAv.LIZ(), "notification");
        if (objH2 instanceof NotificationManager) {
            notificationManager = (NotificationManager) objH2;
        } else {
            notificationManager = null;
        }
        if (notificationManager == null || Build.VERSION.SDK_INT < 26 || realChannelId == null || realChannelId.length() == 0 || (notificationChannel = notificationManager.getNotificationChannel(realChannelId)) == null || notificationChannel.getImportance() != 0) {
            return true;
        }
        return false;
    }

    public static void LJIIJJI(Activity activity) {
        if (activity != null) {
            if (C0DHG.LIZ() && C1388190mED.LIZ(activity) != null) {
                C632670Orh.LIZIZ(activity, C341280DZm.LIZIZ);
                return;
            }
            C1397580mTM c1397580mTM = new C1397580mTM(activity);
            c1397580mTM.LJFF(2131834777);
            c1397580mTM.LIZ(2131845241);
            C985403tE.LIZ(c1397580mTM, AFwS271S0000000_28.get$arr$(123));
            new C1397510mTF(c1397580mTM).LIZLLL();
        }
    }

    public static boolean LIZ(Activity activity, User user) {
        int followToastType;
        int i;
        GeneralPermission generalPermission;
        if (user != null && (generalPermission = user.getGeneralPermission()) != null) {
            followToastType = generalPermission.getFollowToastType();
        } else {
            followToastType = 0;
        }
        if (followToastType != 1) {
            return true;
        }
        if (activity != null) {
            if (C0DHG.LIZ() && C1388190mED.LIZ(activity) != null) {
                C632670Orh.LIZIZ(activity, C341280DZm.LIZ);
            } else {
                C1397580mTM c1397580mTM = new C1397580mTM(activity);
                if (SubscribeSettingsExp.LIZIZ()) {
                    i = 2131849279;
                } else {
                    i = 2131834364;
                }
                c1397580mTM.LJFF(i);
                c1397580mTM.LIZ(2131826369);
                C985403tE.LIZ(c1397580mTM, AFwS271S0000000_28.get$arr$(120));
                new C1397510mTF(c1397580mTM).LIZLLL();
                return false;
            }
        }
        return false;
    }

    public static boolean LIZJ(Context context, User user) {
        if (LJI() && LJII("follow_new_video_push")) {
            return true;
        }
        C1397580mTM c1397580mTM = new C1397580mTM(context);
        c1397580mTM.LJFF(2131849298);
        c1397580mTM.LIZIZ(context.getString(2131849301, user.getNickname()));
        C985403tE.LIZ(c1397580mTM, new AwS607S0100000_28(context, 89));
        c1397580mTM.LIZLLL(AFwS271S0000000_28.get$arr$(121));
        c1397580mTM.LJ(AFwS271S0000000_28.get$arr$(122));
        new C1397510mTF(c1397580mTM).LIZLLL();
        return false;
    }

    public static void LJIIIIZZ(Context context, String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            Intent intent = new Intent("android.settings.CHANNEL_NOTIFICATION_SETTINGS");
            intent.setFlags(268435456);
            C844470XAv.LIZ.getClass();
            intent.putExtra("android.provider.extra.APP_PACKAGE", C844470XAv.LIZ().getPackageName());
            intent.putExtra("android.provider.extra.CHANNEL_ID", C303010BuF.LIZ().getRealChannelId(str));
            if (LIZIZ == null) {
                LIZIZ = C844470XAv.LIZ().getPackageManager();
            }
            PackageManager packageManager = LIZIZ;
            if (packageManager != null && packageManager.resolveActivity(intent, 65536) != null && context != null) {
                RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_1");
                C1701330uNH.LIZ(intent, context);
                C2204961BRm.LJJJJJL(context, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOahdZqA0j34YlnccEi5plT+UVIdJVH0hzvGpm1HaxGHcNJTu+g4QOOi0519gHBNdw==", null));
            }
        }
    }

    public static void LJIIJ(Context context, User user) {
        String uniqueId;
        C10EJ.LIZ.getClass();
        C10EJ.LJI("push_setting");
        if (context != null) {
            if (C0DHG.LIZ() && C1388190mED.LIZ(context) != null) {
                C632670Orh.LIZIZ(context, new C19719212De(-353614600, new AwS653S0100000_4(user, 4), true));
                return;
            }
            C1397580mTM c1397580mTM = new C1397580mTM(context);
            c1397580mTM.LJFF(2131857307);
            String string = context.getString(2131857308);
            Object[] objArr = new Object[1];
            if (user != null) {
                uniqueId = user.getUniqueId();
            } else {
                uniqueId = null;
            }
            objArr[0] = uniqueId;
            c1397580mTM.LIZIZ(C786410Ut5.j4(string, Arrays.copyOf(objArr, 1)));
            C985403tE.LIZ(c1397580mTM, AFwS232S0000000_4.get$arr$(45));
            new C1397510mTF(c1397580mTM).LIZLLL();
        }
    }

    public static TuxSheet LIZLLL(NotificationLiveBottomDialog notificationLiveBottomDialog, DialogInterface.OnDismissListener onDismissListener, Context context) {
        boolean z;
        C1119850fFP c1119850fFP = C011Z.LIZ;
        if (!c1119850fFP.LJIJJ(context) && c1119850fFP.LJIIZILJ(context)) {
            z = true;
        } else {
            z = false;
        }
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        c1390920mIc.LJIIIIZZ(1);
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJJIJI = notificationLiveBottomDialog;
        tuxSheet.LLILLJJLI = onDismissListener;
        tuxSheet.LL = notificationLiveBottomDialog.LLLI;
        if (z) {
            c1390920mIc.LIZLLL(c1119850fFP.LJIIIZ(), false);
        }
        return c1390920mIc.LIZ;
    }

    public static boolean LIZIZ(Activity activity, C10EW c10ew, User user, String str) {
        C10EF c10efLIZIZ;
        String uniqueId = null;
        if (c10ew != null) {
            c10efLIZIZ = c10ew.LIZIZ();
        } else {
            c10efLIZIZ = null;
        }
        if (Intrinsics.LJFF(str, "push_setting") && (!LJFF() || !LJII("live_push"))) {
            LJIIJ(activity, user);
            return false;
        }
        if (LJFF() && LJII("live_push")) {
            return true;
        }
        if (c10efLIZIZ != null) {
            C10EJ.LIZ.getClass();
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from_merge", c10efLIZIZ.LIZJ);
            c2344009Gk.LJIIIIZZ("enter_method", c10efLIZIZ.LIZLLL);
            c2344009Gk.LJIIIIZZ("room_id", c10efLIZIZ.LIZ);
            c2344009Gk.LJIIIIZZ("anchor_id", c10efLIZIZ.LIZIZ);
            C20684815ws.LJIILLIIL("livesdk_push_pre_permission_show", c2344009Gk.LIZ);
        } else {
            C10EJ.LIZ.getClass();
            C10EJ.LJI(str);
        }
        if (activity != null) {
            C1397580mTM c1397580mTM = new C1397580mTM(activity);
            c1397580mTM.LJFF(2131836695);
            String string = activity.getString(2131857308);
            Object[] objArr = new Object[1];
            if (user != null) {
                uniqueId = user.getUniqueId();
            }
            objArr[0] = uniqueId;
            c1397580mTM.LIZIZ(C786410Ut5.j4(string, Arrays.copyOf(objArr, 1)));
            C985403tE.LIZ(c1397580mTM, new AwS111S1200000_28(activity, c10efLIZIZ, str, 2));
            c1397580mTM.LIZLLL(new AwS607S0100000_28(c10ew, 214));
            c1397580mTM.LJ(AFwS271S0000000_28.get$arr$(267));
            new C1397510mTF(c1397580mTM).LIZLLL();
        }
        return false;
    }

    public static void LJIIIZ(Activity activity, User user, InterfaceC19225710Jj interfaceC19225710Jj, String str, String str2, String str3, String str4, AwemeRawAd awemeRawAd, C10EW c10ew) {
        if (user != null && (activity instanceof C19EG)) {
            NotificationLiveBottomDialog notificationLiveBottomDialog = new NotificationLiveBottomDialog(user, interfaceC19225710Jj, true, str, str2, str3, str4, awemeRawAd, c10ew);
            C19EG c19eg = (C19EG) activity;
            if (!c19eg.getSupportFragmentManager().LJLJJI()) {
                C10EK c10ek = LIZ;
                DialogInterfaceOnDismissListenerC19333210kM dialogInterfaceOnDismissListenerC19333210kM = notificationLiveBottomDialog.LLLFZ;
                c10ek.getClass();
                TuxSheet tuxSheetLIZLLL = LIZLLL(notificationLiveBottomDialog, dialogInterfaceOnDismissListenerC19333210kM, activity);
                C1391850mK7.LIZIZ(tuxSheetLIZLLL, "478");
                tuxSheetLIZLLL.show(c19eg.getSupportFragmentManager(), "NotificationLiveDialog");
            }
        }
    }
}
