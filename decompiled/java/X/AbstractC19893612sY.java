package X;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* JADX INFO: renamed from: X.12sY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC19893612sY<T> {
    public final Type LIZ() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        C19864312np.LIZJ(genericSuperclass, "%s isn't parameterized", genericSuperclass instanceof ParameterizedType);
        return ((ParameterizedType) genericSuperclass).getActualTypeArguments()[0];
    }
}
