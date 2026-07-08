package X;

import android.app.Activity;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Environment;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

/* JADX INFO: renamed from: X.12Lp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19741112Lp {
    public static final C19741112Lp LIZ = new C19741112Lp();

    public static Intent LIZJ(Context context) {
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("package:");
        sbLIZ.append(context.getPackageName());
        intent.setData(UriProtector.parse(C2188811AlT.LIZIZ(sbLIZ)));
        return intent;
    }

    public static boolean LJ(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return ((NotificationManager) context.getSystemService(NotificationManager.class)).areNotificationsEnabled();
        }
        Object objH2 = C786410Ut5.H2(context, "appops");
        try {
            Class<?> cls = objH2.getClass();
            Class<?> cls2 = Integer.TYPE;
            if (((Integer) cls.getMethod("checkOpNoThrow", cls2, cls2, String.class).invoke(objH2, Integer.valueOf(((Integer) objH2.getClass().getDeclaredField("OP_POST_NOTIFICATION").get(cls2)).intValue()), Integer.valueOf(context.getApplicationInfo().uid), context.getPackageName())).intValue() != 0) {
                return false;
            }
            return true;
        } catch (IllegalAccessException e) {
            TryCatchGuardChecker.doCheck(e);
            return true;
        } catch (NoSuchFieldException e2) {
            TryCatchGuardChecker.doCheck(e2);
            return true;
        } catch (NoSuchMethodException e3) {
            TryCatchGuardChecker.doCheck(e3);
            return true;
        } catch (RuntimeException e4) {
            TryCatchGuardChecker.doCheck(e4);
            return true;
        } catch (InvocationTargetException e5) {
            TryCatchGuardChecker.doCheck(e5);
            return true;
        }
    }

    public static boolean LJFF(Context context) {
        if (Build.VERSION.SDK_INT >= 30) {
            return Environment.isExternalStorageManager();
        }
        for (String str : C13LQ.LJJLL(new String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"})) {
            if (str != null) {
                LIZ.getClass();
                if (!LIZLLL(context, str)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void LJIIIIZZ(Context context) {
        LIZ(context, LIZJ(context));
    }

    public static void LIZ(Context context, Intent intent) {
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_1");
        C1701330uNH.LIZ(intent, context);
        C2204961BRm.LJJJJJL(context, intent, new C0WZX("dzBzEgAjS8/YVFkiQFyNY/5YtWRf5SngeebyHfsFH+mQi0dgMoiKins2Twypgt2+zg==", null));
    }

    public static boolean LIZIZ(Context context, Intent intent) {
        return !C2204961BRm.LJJJJZ(context.getPackageManager(), intent, 65536, new C0WZX("dzBzEgAjS8/YVFkiQFyNY/5YtWRf5SngeebyHfsFH+mQi0dgMoiKins2Twypgt2+zg==", null)).isEmpty();
    }

    public static boolean LIZLLL(Context context, String str) {
        InterfaceC19741212Lq interfaceC19741212Lq;
        HashMap<String, InterfaceC19741212Lq> map = C19741612Lu.LIZ;
        if (map.containsKey(str) && (interfaceC19741212Lq = map.get(str)) != null) {
            return interfaceC19741212Lq.LIZLLL((Activity) context);
        }
        try {
            if (C838410Wul.LIZ(context, str) == 0) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return false;
        }
    }

    public static void LJIIIZ(Context context, String str) {
        InterfaceC19741212Lq interfaceC19741212Lq = C19741612Lu.LIZ.get(str);
        if (interfaceC19741212Lq != null) {
            Intent intentLIZJ = interfaceC19741212Lq.LIZJ(context);
            if (intentLIZJ == null) {
                LIZ.getClass();
                intentLIZJ = LIZJ(context);
            }
            LIZ(context, intentLIZJ);
            return;
        }
        LIZ.getClass();
        LIZ(context, LIZJ(context));
    }

    public static boolean LJI(Activity activity, String str, boolean z) {
        boolean z2;
        boolean zR4;
        InterfaceC19741212Lq interfaceC19741212Lq;
        HashMap<String, InterfaceC19741212Lq> map = C19741612Lu.LIZ;
        if (map.containsKey(str) && (interfaceC19741212Lq = map.get(str)) != null) {
            if (interfaceC19741212Lq.LIZ(activity) && C1072200e0Y.LIZ(str)) {
                return true;
            }
            return false;
        }
        if (activity.checkSelfPermission(str) == -1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z) {
            zR4 = C0VE9.LJIIJ(activity, str);
        } else {
            zR4 = C786410Ut5.r4(activity, str);
        }
        boolean zLIZ = C1072200e0Y.LIZ(str);
        if (z2 && !zR4 && zLIZ) {
            return true;
        }
        return false;
    }
}
