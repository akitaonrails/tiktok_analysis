package X;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.142e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C202002142e {
    public static final Map<String, Integer> LIZ;

    static {
        HashMap map = new HashMap();
        LIZ = map;
        map.put("android.permission.CAMERA", 2131855111);
        map.put("android.permission.RECORD_AUDIO", 2131855116);
        map.put("android.permission.READ_EXTERNAL_STORAGE", 2131855115);
        map.put("android.permission.WRITE_EXTERNAL_STORAGE", 2131855115);
    }

    public static String[] LIZ(Activity activity, String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (LIZJ(activity, str)) {
                arrayList.add(str);
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static String[] LIZIZ(Activity activity, String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (!LIZJ(activity, str)) {
                arrayList.add(str);
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static boolean LIZJ(Context context, String... strArr) {
        if (strArr == null) {
            return true;
        }
        if (!C0W7I.LIZ.LIZIZ()) {
            C830530Wi3<String, Integer> c830530Wi3 = C202003142f.LIZ;
            for (String str : strArr) {
                Integer num = C202003142f.LIZ.get(str);
                if ((num != null && Build.VERSION.SDK_INT < num.intValue()) || C838410Wul.LIZ(context, str) == 0) {
                    try {
                    } catch (RuntimeException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
                return false;
            }
            return true;
        }
        C1143300frE.LJIIJJI().getClass();
        AbstractC1143290frD.LJI("PermissionsHelper", "invoke PermissionCheckerManager.inst().check");
        C202005142h c202005142h = C202004142g.LIZ;
        c202005142h.getClass();
        for (String str2 : strArr) {
            if (!c202005142h.LIZ(context, str2)) {
                return false;
            }
        }
        return true;
    }

    public static boolean LIZLLL(Activity activity, String... strArr) {
        C830530Wi3<String, Integer> c830530Wi3 = C202003142f.LIZ;
        for (String str : strArr) {
            if (C0VE9.LJIIJ(activity, str)) {
                return true;
            }
        }
        return false;
    }
}
