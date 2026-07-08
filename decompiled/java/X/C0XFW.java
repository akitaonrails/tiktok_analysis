package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.account.TTAccountInit;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0XFW, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XFW {
    public static final List<String> LIZ = C1697810uHb.LJIIJJI("com.nc.tiktok.usmain", "com.zhiliaoapp.musically", "com.ss.android.ugc.trill");
    public static final List<String> LIZIZ = C1697810uHb.LJIIJJI("com.zhiliaoapp.musically", "com.ss.android.ugc.trill");
    public static final Map<String, String> LIZJ = C2097608Jq.LJIIIIZZ(new Pair("com.zhiliaoapp.musically", "1233"), new Pair("com.ss.android.ugc.trill", "1180"), new Pair("com.nc.tiktok.usmain", "259"), new Pair("web", "1459"));

    public static List LIZLLL() {
        TTAccountInit.LIZ().getClass();
        return LIZ;
    }

    public static String LIZIZ(Context context) {
        for (String str : LIZLLL()) {
            PackageManager packageManager = context.getPackageManager();
            Intent intent = new Intent();
            intent.setComponent(new ComponentName(str, "com.aweme.account.login.OTLIntentHandlerActivity"));
            ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent, 65536);
            if (resolveInfoResolveActivity != null && resolveInfoResolveActivity.activityInfo.exported) {
                return str;
            }
        }
        return null;
    }

    public static String LIZJ(Context context) {
        for (String str : LIZIZ) {
            if (LIZ(context, str) != null) {
                return str;
            }
        }
        return null;
    }

    public static String LJ(String str) {
        boolean z;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (!z && u.LJJIIJZLJL(str, "V3:", false)) {
            List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{":"}, 0, 6);
            if (listLJJLIIIJILLIZJL.size() > 2) {
                return ((String) ListProtector.get(listLJJLIIIJILLIZJL, 2)).toLowerCase(Locale.ROOT);
            }
        }
        return null;
    }

    public static String LIZ(Context context, String str) {
        try {
            return C786410Ut5.Y3(context.getPackageManager(), str, 0).versionName;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static String LJFF(Context context, String str) {
        if (str != null && LIZLLL().contains(str)) {
            return LIZ(context, str);
        }
        Iterator it2 = LIZLLL().iterator();
        while (it2.hasNext()) {
            String strLIZ = LIZ(context, (String) it2.next());
            if (strLIZ != null) {
                return strLIZ;
            }
        }
        return null;
    }

    public static boolean LJI(Context context, String str) {
        PackageManager packageManager;
        long longVersionCode;
        if (str == null || str.length() == 0 || (packageManager = context.getPackageManager()) == null) {
            return false;
        }
        try {
            if (Build.VERSION.SDK_INT >= 28) {
                longVersionCode = C786410Ut5.Y3(packageManager, str, 0).getLongVersionCode();
            } else {
                longVersionCode = C786410Ut5.Y3(packageManager, str, 0).versionCode;
            }
        } catch (PackageManager.NameNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            longVersionCode = -1;
        }
        List<String> list = LIZIZ;
        if (list.indexOf(str) == 0) {
            if (longVersionCode >= 2024301000) {
                return true;
            }
            return false;
        }
        if (list.indexOf(str) == 1 && longVersionCode >= 430100) {
            return true;
        }
        return false;
    }
}
