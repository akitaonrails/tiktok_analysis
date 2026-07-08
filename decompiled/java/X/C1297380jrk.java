package X;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;

/* JADX INFO: renamed from: X.0jrk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1297380jrk implements ParameterizedType {
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
        sb.append(C1297410jrn.LJII(this.LLILLJJLI));
        if (this.LLILLL.length == 0) {
            return sb.toString();
        }
        sb.append("<");
        sb.append(C1297410jrn.LJII(this.LLILLL[0]));
        for (int i = 1; i < this.LLILLL.length; i++) {
            sb.append(", ");
            sb.append(C1297410jrn.LJII(this.LLILLL[i]));
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
        if ((obj instanceof ParameterizedType) && C1297410jrn.LIZLLL(this, (Type) obj)) {
            return true;
        }
        return false;
    }

    public C1297380jrk(Type type, Type type2, Type... typeArr) {
        Type typeLIZ;
        boolean z;
        int i = 0;
        if (type2 instanceof Class) {
            if (type == null) {
                z = true;
            } else {
                z = false;
            }
            if (z != (((Class) type2).getEnclosingClass() == null)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("unexpected owner type for ");
                sbLIZ.append(type2);
                sbLIZ.append(": ");
                sbLIZ.append(type);
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        if (type == null) {
            typeLIZ = null;
        } else {
            typeLIZ = C1297410jrn.LIZ(type);
        }
        this.LL = typeLIZ;
        this.LLILLJJLI = C1297410jrn.LIZ(type2);
        this.LLILLL = (Type[]) typeArr.clone();
        while (true) {
            Type[] typeArr2 = this.LLILLL;
            if (i < typeArr2.length) {
                Type type3 = typeArr2[i];
                if (type3 != null) {
                    C1297410jrn.LIZIZ(type3);
                    Type[] typeArr3 = this.LLILLL;
                    typeArr3[i] = C1297410jrn.LIZ(typeArr3[i]);
                    i++;
                } else {
                    throw null;
                }
            } else {
                return;
            }
        }
    }
}
