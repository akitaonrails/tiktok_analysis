package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: X.07ma, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1963407ma {
    public static Field LIZ(Class<?> cls, String str) {
        if (C1963507mb.LIZ()) {
            try {
                Field field = (Field) Class.class.getDeclaredMethod("getDeclaredField", String.class).invoke(cls, str);
                field.setAccessible(true);
                return field;
            } catch (Throwable th) {
                try {
                    TryCatchGuardChecker.doCheck(th);
                    return null;
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    return null;
                }
            }
        }
        return C1963307mZ.LIZ(cls, str);
    }
}
