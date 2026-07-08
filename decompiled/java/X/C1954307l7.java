package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: X.07l7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1954307l7 {
    public static final C1954307l7 LIZ = new C1954307l7();

    public static Field LIZ(Object obj, String str) {
        Class<?> cls;
        if (obj instanceof Class) {
            cls = (Class) obj;
        } else {
            cls = obj.getClass();
        }
        try {
            Field declaredField = cls.getDeclaredField(str);
            if (declaredField != null) {
                declaredField.setAccessible(true);
            }
            return declaredField;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            Object c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            return (Field) c098200Yq;
        }
    }
}
