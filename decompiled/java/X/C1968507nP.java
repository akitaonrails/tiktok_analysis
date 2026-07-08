package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

/* JADX INFO: renamed from: X.07nP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1968507nP {
    public static Field LIZ(Class<?> cls, String str) {
        for (Class<?> superclass = cls; superclass != null; superclass = superclass.getSuperclass()) {
            try {
                Field declaredField = superclass.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                    return declaredField;
                }
                return declaredField;
            } catch (NoSuchFieldException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Field ");
        sbLIZ.append(str);
        sbLIZ.append(" not found in ");
        sbLIZ.append(cls);
        throw new NoSuchFieldException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static Method LIZIZ(Object obj, Class... clsArr) throws NoSuchMethodException {
        Class<?> superclass = obj.getClass();
        while (superclass != null) {
            try {
                Method declaredMethod = superclass.getDeclaredMethod("makePathElements", clsArr);
                if (!declaredMethod.isAccessible()) {
                    declaredMethod.setAccessible(true);
                    return declaredMethod;
                }
                return declaredMethod;
            } catch (NoSuchMethodException e) {
                TryCatchGuardChecker.doCheck(e);
                superclass = superclass.getSuperclass();
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Method ");
        sbLIZ.append("makePathElements");
        sbLIZ.append(" with parameters ");
        sbLIZ.append(Arrays.asList(clsArr));
        sbLIZ.append(" not found in ");
        sbLIZ.append(superclass);
        throw new NoSuchMethodException(C2188811AlT.LIZIZ(sbLIZ));
    }
}
