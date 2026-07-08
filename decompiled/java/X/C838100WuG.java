package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: X.0WuG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C838100WuG {
    public static final InterfaceC838120WuI LIZ;

    static {
        try {
            Field declaredField = Class.forName("com.bytedance.bpea.core.checker.CorePowerProvider").getDeclaredField("INSTANCE");
            declaredField.setAccessible(true);
            LIZ = (InterfaceC838120WuI) declaredField.get(null);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        InterfaceC838120WuI interfaceC838120WuI = LIZ;
    }
}
