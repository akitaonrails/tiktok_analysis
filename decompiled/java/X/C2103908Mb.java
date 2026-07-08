package X;

import android.text.TextUtils;
import com.bytedance.common.utility.reflect.Reflect;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.08Mb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2103908Mb {
    public static volatile String LIZ;
    public static Boolean LIZIZ;

    public static String LIZ() {
        if (TextUtils.isEmpty(LIZ)) {
            try {
                Object obj = Reflect.on(Class.forName("android.app.ActivityThread")).call("currentActivityThread").call("getProcessName").get();
                if (obj != null && (obj instanceof String)) {
                    LIZ = (String) obj;
                    return LIZ;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        return LIZ;
    }
}
