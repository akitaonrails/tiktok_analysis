package X;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.api.INotificationSettingPageAuthGuideService;
import com.ss.android.ugc.aweme.api.ISandboxService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.List;

/* JADX INFO: renamed from: X.0WVp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C824390WVp {
    public static boolean LIZJ(Context context) {
        try {
            return new C815520Vyw(context).LIZ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    public static void LIZLLL(Context context) {
        if (context == null) {
            return;
        }
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("package:");
            sbLIZ.append(context.getPackageName());
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", UriProtector.parse(C2188811AlT.LIZIZ(sbLIZ)));
            intent.addFlags(268435456);
            if (LIZIZ(context, intent)) {
                ISandboxService iSandboxServiceLIZ = C824400WVq.LIZ();
                if (iSandboxServiceLIZ != null) {
                    iSandboxServiceLIZ.appendDataFlowId(intent, 1207965697);
                }
                LIZ(context, intent);
                return;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LJI(context);
    }

    public static void LJ(Context context) {
        LJFF(context, "others");
    }

    public static void LJI(Context context) {
        try {
            Intent intent = new Intent("android.settings.APPLICATION_SETTINGS");
            intent.addFlags(268435456);
            if (!LIZIZ(context, intent)) {
                return;
            }
            ISandboxService iSandboxServiceLIZ = C824400WVq.LIZ();
            if (iSandboxServiceLIZ != null) {
                iSandboxServiceLIZ.appendDataFlowId(intent, 1207965697);
            }
            LIZ(context, intent);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static void LIZ(Context context, Intent intent) {
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_1");
        C1701330uNH.LIZ(intent, context);
        C2204961BRm.LJJJJJL(context, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP+8apPdkhyI+u0Rq9Nw2evFfP9dKP23", null));
    }

    public static boolean LIZIZ(Context context, Intent intent) {
        List listLJJJJZ;
        if (context != null && (listLJJJJZ = C2204961BRm.LJJJJZ(context.getPackageManager(), intent, 65536, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP+8apPdkhyI+u0Rq9Nw2evFfP9dKP23", null))) != null && listLJJJJZ.size() > 0) {
            return true;
        }
        return false;
    }

    public static void LJFF(Context context, String str) {
        if (context == null) {
            return;
        }
        INotificationSettingPageAuthGuideService iNotificationSettingPageAuthGuideService = (INotificationSettingPageAuthGuideService) PluggableExtentionKt.pluggableSpi$default(INotificationSettingPageAuthGuideService.class, false, false, false, 14, null);
        if (iNotificationSettingPageAuthGuideService != null && iNotificationSettingPageAuthGuideService.LIZLLL()) {
            try {
                if (Build.VERSION.SDK_INT >= 26 && !C815020Vy8.LIZ()) {
                    Intent intent = new Intent();
                    intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
                    intent.putExtra("android.provider.extra.APP_PACKAGE", context.getPackageName());
                    intent.putExtra("android.provider.extra.CHANNEL_ID", context.getApplicationInfo().uid);
                    ISandboxService iSandboxServiceLIZ = C824400WVq.LIZ();
                    if (iSandboxServiceLIZ != null) {
                        iSandboxServiceLIZ.appendDataFlowId(intent, 1207965697);
                    }
                    if (context.getPackageManager().resolveActivity(intent, 65536) != null) {
                        INotificationSettingPageAuthGuideService iNotificationSettingPageAuthGuideService2 = (INotificationSettingPageAuthGuideService) PluggableExtentionKt.pluggableSpi$default(INotificationSettingPageAuthGuideService.class, false, false, false, 14, null);
                        if (iNotificationSettingPageAuthGuideService2 != null) {
                            Intent intent2 = new Intent(context, iNotificationSettingPageAuthGuideService2.LJ());
                            intent2.putExtra("enter_from", str);
                            if (iNotificationSettingPageAuthGuideService2.LIZIZ()) {
                                iNotificationSettingPageAuthGuideService2.LIZ(context, intent2, intent);
                                return;
                            } else {
                                C2204961BRm.LJJJJIZL(context, new Intent[]{intent, intent2}, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP+8apPdkhyI+u0Rq9Nw2evFfP9dKP23", null));
                                return;
                            }
                        }
                        LIZ(context, intent);
                        return;
                    }
                    return;
                }
                LIZLLL(context);
                return;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        } else {
            try {
                if (Build.VERSION.SDK_INT >= 26 && !C815020Vy8.LIZ()) {
                    Intent intent3 = new Intent();
                    intent3.addFlags(268435456);
                    intent3.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
                    intent3.putExtra("android.provider.extra.APP_PACKAGE", context.getPackageName());
                    intent3.putExtra("android.provider.extra.CHANNEL_ID", context.getApplicationInfo().uid);
                    ISandboxService iSandboxServiceLIZ2 = C824400WVq.LIZ();
                    if (iSandboxServiceLIZ2 != null) {
                        iSandboxServiceLIZ2.appendDataFlowId(intent3, 1207965697);
                    }
                    if (context.getPackageManager().resolveActivity(intent3, 65536) != null) {
                        LIZ(context, intent3);
                        return;
                    }
                    return;
                }
                LIZLLL(context);
                return;
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
        LJI(context);
    }
}
