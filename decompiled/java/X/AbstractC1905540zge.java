package X;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* JADX INFO: renamed from: X.0zge, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public abstract class AbstractC1905540zge<T> extends AbstractC1869720yks<T> implements Serializable {
    public final Type LL;

    public AbstractC1905540zge() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        if (!(genericSuperclass instanceof ParameterizedType)) {
            throw new IllegalArgumentException(LIZ("%s isn't parameterized", genericSuperclass));
        }
        Type type = ((ParameterizedType) genericSuperclass).getActualTypeArguments()[0];
        this.LL = type;
        if (!(!(type instanceof TypeVariable))) {
            throw new IllegalStateException(LIZ("Cannot construct a TypeToken for a type variable.\nYou probably meant to call new TypeToken<%s>(getClass()) that can resolve the type variable for you.\nIf you do need to create a TypeToken of a type variable, please use TypeToken.of() instead.", type));
        }
    }

    public Type getType() {
        return this.LL;
    }

    public static String LIZ(String str, Object... objArr) {
        int iIndexOf;
        StringBuilder sb = new StringBuilder(str.length() + (objArr.length * 16));
        int i = 0;
        int i2 = 0;
        while (i < objArr.length && (iIndexOf = str.indexOf("%s", i2)) != -1) {
            sb.append((CharSequence) str, i2, iIndexOf);
            sb.append(objArr[i]);
            i2 = iIndexOf + 2;
            i++;
        }
        sb.append((CharSequence) str, i2, str.length());
        if (i < objArr.length) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i3 = i + 1; i3 < objArr.length; i3++) {
                sb.append(", ");
                sb.append(objArr[i3]);
            }
            sb.append(']');
        }
        return sb.toString();
    }
}
