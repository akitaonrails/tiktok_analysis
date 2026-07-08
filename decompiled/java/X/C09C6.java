package X;

import com.google.gson.Gson;
import com.google.gson.f;
import com.ss.android.ugc.aweme.experiment.GsonTypeAdapterOpt;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: renamed from: X.09C6, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09C6 {
    public static final Map<Gson, Gson> LIZ = new WeakHashMap();
    public static final Lock LIZIZ;
    public static final Lock LIZJ;

    static {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        LIZIZ = reentrantReadWriteLock.readLock();
        LIZJ = reentrantReadWriteLock.writeLock();
    }

    public static boolean LIZ(Type type) {
        if (!((GsonTypeAdapterOpt) C09CD.LIZIZ.getValue()).enable || type == null || f.LIZIZ(type)) {
            return false;
        }
        if (type instanceof Class) {
            Class cls = (Class) type;
            if (cls.isArray()) {
                return LIZ(cls.getComponentType());
            }
            if (Collection.class.isAssignableFrom(cls) || Map.class.isAssignableFrom(cls)) {
                return false;
            }
        }
        if (type instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) type;
            Type[] upperBounds = wildcardType.getUpperBounds();
            if (upperBounds != null) {
                for (Type type2 : upperBounds) {
                    if (Object.class != type2 && LIZ(type2)) {
                        return true;
                    }
                }
            }
            Type[] lowerBounds = wildcardType.getLowerBounds();
            if (lowerBounds != null) {
                for (Type type3 : lowerBounds) {
                    if (Object.class != type3 && LIZ(type3)) {
                        return true;
                    }
                }
            }
            return false;
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Type rawType = parameterizedType.getRawType();
            if (rawType instanceof Class) {
                Class cls2 = (Class) rawType;
                if (Map.class.isAssignableFrom(cls2) || Collection.class.isAssignableFrom(cls2)) {
                    Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                    if (actualTypeArguments != null && actualTypeArguments.length > 0) {
                        for (Type type4 : actualTypeArguments) {
                            if (LIZ(type4)) {
                                return true;
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
}
