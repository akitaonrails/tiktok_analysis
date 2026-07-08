package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.12tE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19897812tE {
    public static final C19897812tE LIZ = new C19897812tE();
    public static final Integer LIZIZ;

    static {
        Integer num = null;
        try {
            Object obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
            if (obj instanceof Integer) {
                Integer num2 = (Integer) obj;
                if (num2 != null && num2.intValue() > 0) {
                    num = num2;
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        LIZIZ = num;
    }
}
