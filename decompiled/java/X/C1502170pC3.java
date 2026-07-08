package X;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;

/* JADX INFO: renamed from: X.0pC3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1502170pC3 implements ParameterizedType {
    public final Type LL;
    public final Type LLILLJJLI;
    public final Type[] LLILLL;

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return (Type[]) this.LLILLL.clone();
    }

    public final int hashCode() {
        int iHashCode = Arrays.hashCode(this.LLILLL) ^ this.LLILLJJLI.hashCode();
        Type type = this.LL;
        return iHashCode ^ (type != null ? type.hashCode() : 0);
    }

    public final String toString() {
        Type[] typeArr = this.LLILLL;
        if (typeArr.length == 0) {
            return C1502190pC5.LJIILJJIL(this.LLILLJJLI);
        }
        StringBuilder sb = new StringBuilder((typeArr.length + 1) * 30);
        sb.append(C1502190pC5.LJIILJJIL(this.LLILLJJLI));
        sb.append("<");
        sb.append(C1502190pC5.LJIILJJIL(this.LLILLL[0]));
        for (int i = 1; i < this.LLILLL.length; i++) {
            sb.append(", ");
            sb.append(C1502190pC5.LJIILJJIL(this.LLILLL[i]));
        }
        sb.append(">");
        return sb.toString();
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.LL;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.LLILLJJLI;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof ParameterizedType) && C1502190pC5.LIZJ(this, (Type) obj)) {
            return true;
        }
        return false;
    }

    public C1502170pC3(Type type, Type type2, Type... typeArr) {
        boolean z;
        if (type2 instanceof Class) {
            if (type == null) {
                z = true;
            } else {
                z = false;
            }
            if (z != (((Class) type2).getEnclosingClass() == null)) {
                throw new IllegalArgumentException();
            }
        }
        for (Type type3 : typeArr) {
            C1502190pC5.LIZ(type3, "typeArgument == null");
            C1502190pC5.LIZIZ(type3);
        }
        this.LL = type;
        this.LLILLJJLI = type2;
        this.LLILLL = (Type[]) typeArr.clone();
    }
}
