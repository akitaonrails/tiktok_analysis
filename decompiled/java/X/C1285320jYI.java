package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Method;
import java.util.Locale;

/* JADX INFO: renamed from: X.0jYI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1285320jYI {
    public static Class<?> LIZ = null;
    public static Method LIZIZ = null;
    public static Method LIZJ = null;
    public static Method LIZLLL = null;
    public static Method LJ = null;
    public static int LJFF = 33554432;

    public static void LIZ(Object obj, String str, String str2) {
        LJ(67108864, str, str2, obj);
    }

    public static void LIZIZ(Object obj, String str, String str2) {
        LJ(33554432, str, str2, obj);
    }

    public static void LIZJ(Object obj, String str, String str2) {
        LJ(42926080, str, str2, obj);
    }

    public static void LIZLLL(Object obj, String str, String str2) {
        LJ(50331648, str, str2, obj);
    }

    public static void LJ(int i, String str, String str2, Object obj) {
        int iHashCode;
        if (i < (LJFF & (-65536))) {
            return;
        }
        if (LIZ == null) {
            try {
                Class<?> cls = Class.forName("com.ss.ttvideoengine.utils.TTVideoEngineLog");
                LIZ = cls;
                LIZJ = cls.getMethod("d", String.class, String.class);
                LIZIZ = LIZ.getMethod("i", String.class, String.class);
                LIZLLL = LIZ.getMethod("w", String.class, String.class);
                LJ = LIZ.getMethod("e", String.class, String.class);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                LIZ = null;
                return;
            }
        }
        Locale locale = Locale.US;
        Object[] objArr = new Object[3];
        objArr[0] = str;
        if (obj == null) {
            iHashCode = 0;
        } else {
            iHashCode = obj.hashCode();
        }
        objArr[1] = Integer.valueOf(iHashCode);
        objArr[2] = str2;
        String strK4 = C786410Ut5.k4(locale, "<%s,%x>%s", objArr);
        try {
            if (i != 0 && i != 16777216) {
                if (i != 33554432 && i != 34603008 && i != 42860544 && i != 42926080) {
                    if (i != 50331648) {
                        if (i == 67108864) {
                            LJ.invoke(LIZ, "ttmj", strK4);
                            return;
                        }
                        return;
                    }
                    LIZLLL.invoke(LIZ, "ttmj", strK4);
                    return;
                }
                LIZIZ.invoke(LIZ, "ttmj", strK4);
                return;
            }
            LIZJ.invoke(LIZ, "ttmj", strK4);
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
    }
}
