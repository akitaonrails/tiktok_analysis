package X;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;

/* JADX INFO: renamed from: X.09a8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2395809a8 implements ParameterizedType {
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
        StringBuilder sb = new StringBuilder((this.LLILLL.length + 1) * 30);
        sb.append(C2396109aB.LJIILL(this.LLILLJJLI));
        if (this.LLILLL.length == 0) {
            return sb.toString();
        }
        sb.append("<");
        sb.append(C2396109aB.LJIILL(this.LLILLL[0]));
        for (int i = 1; i < this.LLILLL.length; i++) {
            sb.append(", ");
            sb.append(C2396109aB.LJIILL(this.LLILLL[i]));
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
        if ((obj instanceof ParameterizedType) && C2396109aB.LIZJ(this, (Type) obj)) {
            return true;
        }
        return false;
    }

    public C2395809a8(Type type, Type type2, Type... typeArr) {
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
        this.LL = type;
        this.LLILLJJLI = type2;
        this.LLILLL = (Type[]) typeArr.clone();
        for (Type type3 : typeArr) {
            C2396109aB.LIZ(type3, "typeArgument == null");
            C2396109aB.LIZIZ(type3);
        }
    }
}
