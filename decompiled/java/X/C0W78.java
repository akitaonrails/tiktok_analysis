package X;

import android.app.AppOpsManager;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Process;
import android.provider.Settings;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.host.ILiveHostSandbox;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;

/* JADX INFO: renamed from: X.0W78, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0W78 {
    public static final String LIZ = C0W78.class.getCanonicalName();

    public static String LIZLLL() {
        return ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).context().getPackageName();
    }

    public static boolean LIZIZ(Context context) {
        String str = Build.MANUFACTURER;
        str.getClass();
        if (str.equals("Xiaomi")) {
            try {
                AppOpsManager appOpsManager = (AppOpsManager) C786410Ut5.H2(context, "appops");
                Class<?> cls = appOpsManager.getClass();
                Class<?> cls2 = Integer.TYPE;
                if (((Integer) cls.getMethod("checkOpNoThrow", cls2, cls2, String.class).invoke(appOpsManager, 10021, Integer.valueOf(Process.myUid()), context.getPackageName())).intValue() != 0) {
                    return false;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C20441214yg.LJFF(LIZ, "not support", e);
            }
        }
        return true;
    }

    public static void LJ(Context context) {
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", context.getPackageName(), null));
        ((ILiveHostSandbox) C1161920gLG.LIZJ(ILiveHostSandbox.class)).appendDataFlowId(intent, 1207965697);
        try {
            if (LJI(context, intent)) {
                LIZ(context, intent);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LIZLLL(e.getMessage());
        }
    }

    public static boolean LJFF(Context context) {
        try {
            return Settings.canDrawOverlays(context);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static void LJII(Context context) {
        String str = Build.MANUFACTURER;
        String canonicalName = C0W78.class.getCanonicalName();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("jumpPermissionPage --- name : ");
        sbLIZ.append(str);
        C20441214yg.LJ(canonicalName, C2188811AlT.LIZIZ(sbLIZ));
        str.getClass();
        byte b = -1;
        switch (str.hashCode()) {
            case -1678088054:
                if (str.equals("Coolpad")) {
                    b = 0;
                }
                break;
            case -1675632421:
                if (str.equals("Xiaomi")) {
                    b = 1;
                }
                break;
            case 2427:
                if (str.equals("LG")) {
                    b = 2;
                }
                break;
            case 2432928:
                if (str.equals("OPPO")) {
                    b = 3;
                }
                break;
            case 2582855:
                if (str.equals("Sony")) {
                    b = 4;
                }
                break;
            case 3620012:
                if (str.equals("vivo")) {
                    b = 5;
                }
                break;
            case 74224812:
                if (str.equals("Meizu")) {
                    b = 6;
                }
                break;
            case 1864941562:
                if (str.equals("samsung")) {
                    b = 7;
                }
                break;
            case 2141820391:
                if (str.equals("HUAWEI")) {
                    b = 8;
                }
                break;
        }
        String str2 = LIZ;
        switch (b) {
            case 0:
                LIZJ(context, "com.yulong.android.security:remote");
                break;
            case 1:
                String strLIZ = C2029607xG.LIZ("ro.miui.ui.version.name");
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("goMiaoMiMainager --- rom : ");
                sbLIZ2.append(strLIZ);
                C20441214yg.LJ(str2, C2188811AlT.LIZIZ(sbLIZ2));
                Intent intent = new Intent();
                if (!"V6".equals(strLIZ) && !"V7".equals(strLIZ)) {
                    if (!"V8".equals(strLIZ) && !"V9".equals(strLIZ) && !"V10".equals(strLIZ)) {
                        LJ(context);
                    } else {
                        intent.setAction("miui.intent.action.APP_PERM_EDITOR");
                        intent.setClassName("com.miui.securitycenter", "com.miui.permcenter.permissions.PermissionsEditorActivity");
                        intent.putExtra("extra_pkgname", LIZLLL());
                    }
                } else {
                    intent.setAction("miui.intent.action.APP_PERM_EDITOR");
                    intent.setClassName("com.miui.securitycenter", "com.miui.permcenter.permissions.AppPermissionsEditorActivity");
                    intent.putExtra("extra_pkgname", LIZLLL());
                }
                if (LJI(context, intent)) {
                    ((ILiveHostSandbox) C1161920gLG.LIZJ(ILiveHostSandbox.class)).appendDataFlowId(intent, 1207965697);
                    LIZ(context, intent);
                }
                break;
            case 2:
                try {
                    Intent intent2 = new Intent(LIZLLL());
                    intent2.setComponent(new ComponentName("com.android.settings", "com.android.settings.Settings$AccessLockSummaryActivity"));
                    if (LJI(context, intent2)) {
                        ((ILiveHostSandbox) C1161920gLG.LIZJ(ILiveHostSandbox.class)).appendDataFlowId(intent2, 1207965697);
                        LIZ(context, intent2);
                    } else {
                        LJ(context);
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    LJ(context);
                    return;
                }
                break;
            case 3:
                LIZJ(context, "com.coloros.safecenter");
                break;
            case 4:
                try {
                    Intent intent3 = new Intent(LIZLLL());
                    intent3.setComponent(new ComponentName("com.sonymobile.cta", "com.sonymobile.cta.SomcCTAMainActivity"));
                    if (LJI(context, intent3)) {
                        ((ILiveHostSandbox) C1161920gLG.LIZJ(ILiveHostSandbox.class)).appendDataFlowId(intent3, 1207965697);
                        LIZ(context, intent3);
                    } else {
                        LJ(context);
                    }
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    C20441214yg.LJFF(str2, "goSonyMainager: ", e2);
                    LJ(context);
                    return;
                }
                break;
            case 5:
                LIZJ(context, "com.bairenkeji.icaller");
                break;
            case 6:
                try {
                    Intent intent4 = new Intent("com.meizu.safe.security.SHOW_APPSEC");
                    intent4.addCategory("android.intent.category.DEFAULT");
                    intent4.putExtra("packageName", LIZLLL());
                    if (LJI(context, intent4)) {
                        ((ILiveHostSandbox) C1161920gLG.LIZJ(ILiveHostSandbox.class)).appendDataFlowId(intent4, 1207965697);
                        LIZ(context, intent4);
                    } else {
                        LJ(context);
                    }
                } catch (ActivityNotFoundException e3) {
                    TryCatchGuardChecker.doCheck(e3);
                    C20441214yg.LIZLLL(e3.getMessage());
                    LJ(context);
                    return;
                }
                break;
            case 7:
                LJ(context);
                break;
            case 8:
                try {
                    Intent intent5 = new Intent(LIZLLL());
                    intent5.setFlags(268435456);
                    intent5.setComponent(new ComponentName("com.huawei.systemmanager", "com.huawei.permissionmanager.ui.MainActivity"));
                    if (LJI(context, intent5)) {
                        ((ILiveHostSandbox) C1161920gLG.LIZJ(ILiveHostSandbox.class)).appendDataFlowId(intent5, 1207965697);
                        LIZ(context, intent5);
                    } else {
                        LJ(context);
                    }
                } catch (Exception e4) {
                    TryCatchGuardChecker.doCheck(e4);
                    LJ(context);
                    return;
                }
                break;
            default:
                LJ(context);
                break;
        }
    }

    public static void LIZ(Context context, Intent intent) {
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_1");
        C1701330uNH.LIZ(intent, context);
        C2204961BRm.LJJJJJL(context, intent, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl7SaYS7JCKpotS6POHFh4OUtvTMXY7mdpIVk=", null));
    }

    public static void LIZJ(Context context, String str) throws Throwable {
        String str2 = LIZ;
        try {
            PackageInfo packageInfoY3 = C786410Ut5.Y3(context.getPackageManager(), str, 0);
            if (packageInfoY3 != null) {
                Intent intent = new Intent("android.intent.action.MAIN", (Uri) null);
                intent.addCategory("android.intent.category.LAUNCHER");
                intent.setPackage(packageInfoY3.packageName);
                List listLJJJJZ = C2204961BRm.LJJJJZ(context.getPackageManager(), intent, 0, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl7SaYS7JCKpotS6POHFh4OUtvTMXY7mdpIVk=", null));
                C20441214yg.LJ("PermissionPageManager", "resolveinfoList" + listLJJJJZ.size());
                for (int i = 0; i < listLJJJJZ.size(); i++) {
                    C20441214yg.LJ("PermissionPageManager", ((ResolveInfo) ListProtector.get(listLJJJJZ, i)).activityInfo.packageName + ((ResolveInfo) ListProtector.get(listLJJJJZ, i)).activityInfo.name);
                }
                try {
                    ResolveInfo resolveInfo = (ResolveInfo) listLJJJJZ.iterator().next();
                    if (resolveInfo != null) {
                        ActivityInfo activityInfo = resolveInfo.activityInfo;
                        String str3 = activityInfo.packageName;
                        String str4 = activityInfo.name;
                        Intent intent2 = new Intent("android.intent.action.MAIN");
                        intent2.addCategory("android.intent.category.LAUNCHER");
                        intent2.setComponent(new ComponentName(str3, str4));
                        ((ILiveHostSandbox) C1161920gLG.LIZJ(ILiveHostSandbox.class)).appendDataFlowId(intent2, 1207965697);
                        LIZ(context, intent2);
                        return;
                    }
                    return;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    LJ(context);
                    C20441214yg.LJFF(str2, "doStartApplicationWithPackageName: ", e);
                    return;
                }
            }
        } catch (PackageManager.NameNotFoundException e2) {
            TryCatchGuardChecker.doCheck(e2);
            C20441214yg.LJFF(str2, "doStartApplicationWithPackageName: ", e2);
        }
        LJ(context);
    }

    public static boolean LJI(Context context, Intent intent) {
        if (context != null) {
            try {
                if (context.getPackageManager().resolveActivity(intent, 0) == null) {
                    return false;
                }
                return true;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C20441214yg.LIZLLL(e.getMessage());
            }
        }
        return false;
    }

    public static void LJIIIIZZ(Context context, String str) {
        Intent intent = new Intent(str);
        intent.setData(Uri.fromParts("package", context.getPackageName(), null));
        try {
            if (LJI(context, intent)) {
                ((ILiveHostSandbox) C1161920gLG.LIZJ(ILiveHostSandbox.class)).appendDataFlowId(intent, 1207965697);
                LIZ(context, intent);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LIZLLL(e.getMessage());
        }
    }
}
