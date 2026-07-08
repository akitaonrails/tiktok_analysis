package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ttvideoengine.TTVideoEngine;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: X.07n5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1966507n5 {
    public static Object LIZ(TTVideoEngine tTVideoEngine) throws NoSuchFieldException {
        Class<?> superclass = tTVideoEngine.getClass();
        Field declaredField = null;
        while (declaredField == null) {
            try {
                declaredField = superclass.getDeclaredField("mIsPlayComplete");
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                TryCatchGuardChecker.doCheck(e);
                superclass = superclass.getSuperclass();
            }
            if (superclass == null) {
                throw new NoSuchFieldException();
            }
        }
        declaredField.setAccessible(true);
        return declaredField.get(tTVideoEngine);
    }
}
