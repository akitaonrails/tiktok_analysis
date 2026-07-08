package X;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* JADX INFO: renamed from: X.0pAs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public abstract class AbstractC1501440pAs {
    public InterfaceC1501650pBD<?, AbstractC842530X3j> requestBodyConverter(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, C1501450pAt c1501450pAt) {
        return null;
    }

    public InterfaceC1501650pBD<AbstractC842510X3h, ?> responseBodyConverter(Type type, Annotation[] annotationArr, C1501450pAt c1501450pAt) {
        return null;
    }

    public InterfaceC1501650pBD<?, String> stringConverter(Type type, Annotation[] annotationArr, C1501450pAt c1501450pAt) {
        return null;
    }

    public static Class<?> getRawType(Type type) {
        return C1502190pC5.LJFF(type);
    }

    public static Type getParameterUpperBound(int i, ParameterizedType parameterizedType) {
        return C1502190pC5.LJ(i, parameterizedType);
    }
}
