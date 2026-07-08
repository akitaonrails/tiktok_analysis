package X;

import android.os.Debug;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.07mM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1962007mM {
    public static final Map<Integer, String> LIZ;

    static {
        String str;
        for (int i = 0; i < new String[]{"", "Pss", "Pss", "Shared", "Private", "Shared", "Private", "SwapPss", "Rss"}.length; i++) {
        }
        LIZ = new LinkedHashMap();
        try {
            Method declaredMethod = Debug.MemoryInfo.class.getDeclaredMethod("getOtherLabel", Integer.TYPE);
            declaredMethod.setAccessible(true);
            int i2 = 0;
            do {
                try {
                    Object objInvoke = declaredMethod.invoke(null, Integer.valueOf(i2));
                    if (!(objInvoke instanceof String) || (str = (String) objInvoke) == null) {
                        str = "????";
                    }
                    LIZ.put(Integer.valueOf(i2), str);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    LIZ.put(Integer.valueOf(i2), "????");
                }
                i2++;
            } while (i2 < 32);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
    }
}
