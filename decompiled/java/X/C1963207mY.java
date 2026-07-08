package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: X.07mY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1963207mY {
    public static Field LIZ(Class cls) {
        if (C1963007mW.LIZ()) {
            try {
                Field field = (Field) Class.class.getDeclaredMethod("getDeclaredField", String.class).invoke(cls, "mAttachInfo");
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
        return C1962907mV.LIZ(cls, "mAttachInfo");
    }
}
