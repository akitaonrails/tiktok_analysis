package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Constructor;

/* JADX INFO: renamed from: X.18BV, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18BV {
    public static C18BS LIZ = C18BR.LIZ;

    public static void LIZ() {
        C18BS c18bs = LIZ;
        if (c18bs instanceof C18BR) {
            c18bs.setInitPrerequisites(1);
            try {
                try {
                    Constructor<?> declaredConstructor = Class.forName("com.bytedance.android.bcm.impl.BcmServiceImpl").getDeclaredConstructor(new Class[0]);
                    declaredConstructor.setAccessible(true);
                    LIZ = (C18BS) declaredConstructor.newInstance(new Object[0]);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
            }
        }
    }
}
