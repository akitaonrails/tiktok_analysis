package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* JADX INFO: renamed from: X.0jro, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1297420jro {
    public static Class<?> LIZ(Object obj, Class<?> cls, int i) {
        ParameterizedType parameterizedType;
        if (i < 0 || !cls.isInstance(obj)) {
            return null;
        }
        try {
            Type[] genericInterfaces = obj.getClass().getGenericInterfaces();
            int length = genericInterfaces.length;
            int i2 = 0;
            while (true) {
                if (i2 < length) {
                    Type type = genericInterfaces[i2];
                    if ((type instanceof ParameterizedType) && ((ParameterizedType) type).getRawType() == cls) {
                        parameterizedType = (ParameterizedType) type;
                        break;
                    }
                    i2++;
                } else {
                    parameterizedType = null;
                    break;
                }
            }
            if (parameterizedType == null) {
                Type genericSuperclass = obj.getClass().getGenericSuperclass();
                if ((genericSuperclass instanceof ParameterizedType) && ((ParameterizedType) genericSuperclass).getRawType() == cls) {
                    parameterizedType = (ParameterizedType) genericSuperclass;
                }
            }
            if (parameterizedType == null) {
                return null;
            }
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            if (i < actualTypeArguments.length) {
                return (Class) actualTypeArguments[i];
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return null;
    }
}
