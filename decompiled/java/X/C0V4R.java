package X;

import android.app.AppOpsManager;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.common.utility.reflect.Reflect;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.common.GoogleApiAvailability;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0V4R, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0V4R {
    public static Boolean LIZ;
    public static long LIZIZ;
    public static long LIZJ;
    public static boolean LIZLLL;
    public static boolean LJ;

    public static long LJ() {
        String str;
        long j = LIZIZ;
        if (j == 0) {
            if (C0V4S.LIZIZ == null) {
                synchronized (C0V4S.class) {
                    try {
                        if (C0V4S.LIZIZ == null) {
                            C0V4S.LIZIZ = new C0V4S();
                        }
                    } finally {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
            }
            C0V4S c0v4s = C0V4S.LIZIZ;
            c0v4s.getClass();
            try {
                Object objLIZ = c0v4s.LIZ();
                str = (String) objLIZ.getClass().getMethod("get", String.class).invoke(objLIZ, "log.tag.push.timestamp");
            } catch (IllegalArgumentException th) {
                throw th;
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                str = "";
            }
            if (!TextUtils.isEmpty(str)) {
                try {
                    LIZIZ = CastLongProtector.parseLong(str);
                } catch (Throwable th3) {
                    TryCatchGuardChecker.doCheck(th3);
                    LIZIZ = -1L;
                }
                LIZJ = System.currentTimeMillis();
                return LIZIZ;
            }
            LIZIZ = -1L;
        } else if (j != -1) {
            return j + (System.currentTimeMillis() - LIZJ);
        }
        return System.currentTimeMillis();
    }

    public static int LIZJ(Context context) {
        int iLIZLLL = LIZLLL(context);
        if (iLIZLLL < 0) {
            return -1;
        }
        return iLIZLLL;
    }

    public static int LIZLLL(Context context) {
        if (context == null) {
            return -1;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            try {
                return ((Boolean) Reflect.on((NotificationManager) C786410Ut5.H2(context, "notification")).call("areNotificationsEnabled").get()).booleanValue() ? 1 : 0;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        try {
            AppOpsManager appOpsManager = (AppOpsManager) C786410Ut5.H2(context, "appops");
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            String packageName = C786410Ut5.N3(context).getPackageName();
            int i = applicationInfo.uid;
            Reflect reflectOn = Reflect.on(appOpsManager);
            Class<?> cls = Integer.TYPE;
            if (((Integer) reflectOn.call("checkOpNoThrow", new Class[]{cls, cls, String.class}, Integer.valueOf(((Integer) reflectOn.field("OP_POST_NOTIFICATION", cls).get()).intValue()), Integer.valueOf(i), packageName).get()).intValue() == 0) {
                return 1;
            }
            return 0;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return -2;
        }
    }

    public static int LJFF(Context context) {
        if (context == null) {
            return -1;
        }
        try {
            GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.getInstance();
            int iB4 = C786410Ut5.b4(googleApiAvailability, context);
            if (iB4 != 0) {
                googleApiAvailability.isUserResolvableError(iB4);
            }
            return iB4;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return -1;
        }
    }

    public static boolean LJI(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str = C1967507nF.LIZ().LIZIZ("ro.build.version.emui");
        }
        if (!TextUtils.isEmpty(str) && str.toLowerCase().startsWith("emotionui")) {
            return true;
        }
        try {
            str2 = Build.BRAND;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        if (C2093608Ic.LJ(str2) || !str2.toLowerCase().startsWith("huawei")) {
            String str3 = Build.MANUFACTURER;
            if (!C2093608Ic.LJ(str3)) {
                if (str3.toLowerCase().startsWith("huawei")) {
                }
            }
            return false;
        }
        return true;
    }

    public static boolean LJII(Context context) {
        Boolean bool = LIZ;
        if (bool != null) {
            return bool.booleanValue();
        }
        String strLIZ = C2162308dZ.LIZ(context);
        boolean z = false;
        if (strLIZ != null) {
            if (strLIZ.contains(":")) {
                return false;
            }
            if (strLIZ.equals(context.getPackageName())) {
                z = true;
            }
        }
        Boolean boolValueOf = Boolean.valueOf(z);
        LIZ = boolValueOf;
        return boolValueOf.booleanValue();
    }

    public static String LIZ(String str, List<Pair<String, String>> list) {
        StringBuilder sb = new StringBuilder(str);
        if (str.indexOf(63) < 0) {
            sb.append("?");
        } else {
            sb.append("&");
        }
        sb.append(C804420Vh2.LIZJ(list));
        return sb.toString();
    }

    public static String LIZIZ(String str, Map<String, String> map) {
        ArrayList arrayList = new ArrayList();
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                arrayList.add(new Pair(entry.getKey(), entry.getValue()));
            }
        }
        return LIZ(str, arrayList);
    }
}
