package X;

import android.content.Context;
import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: X.08Bw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2077408Bw {
    public static int LIZ(Context context) {
        int iIntValue = 0;
        if ("Xiaomi".equals(Build.MANUFACTURER)) {
            try {
                Class<?> clsLoadClass = context.getClassLoader().loadClass("android.os.SystemProperties");
                iIntValue = ((Integer) clsLoadClass.getMethod("getInt", String.class, Integer.TYPE).invoke(clsLoadClass, new String("ro.miui.notch"), new Integer(0))).intValue();
                return iIntValue;
            } catch (ClassNotFoundException e) {
                TryCatchGuardChecker.doCheck(e);
                return iIntValue;
            } catch (IllegalAccessException e2) {
                TryCatchGuardChecker.doCheck(e2);
                return iIntValue;
            } catch (IllegalArgumentException e3) {
                TryCatchGuardChecker.doCheck(e3);
            } catch (NoSuchMethodException e4) {
                TryCatchGuardChecker.doCheck(e4);
                return iIntValue;
            } catch (InvocationTargetException e5) {
                TryCatchGuardChecker.doCheck(e5);
                return iIntValue;
            }
        }
        return iIntValue;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x008b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00bc -> B:62:0x006e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZIZ(android.content.Context r6) {
        /*
            Method dump skipped, instruction units count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2077408Bw.LIZIZ(android.content.Context):boolean");
    }
}
