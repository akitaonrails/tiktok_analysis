package X;

import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* JADX INFO: renamed from: X.12sT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19893112sT implements GenericArrayType, Serializable {
    public static final long serialVersionUID = 0;
    public final Type LL;

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        Type type = this.LL;
        return String.valueOf(type instanceof Class ? ((Class) type).getName() : type.toString()).concat("[]");
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.LL;
    }

    public C19893112sT(Type type) {
        this.LL = EnumC19892112sJ.LLILLL.LJII(type);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof GenericArrayType) {
            return C19837412jU.LIZ(this.LL, ((GenericArrayType) obj).getGenericComponentType());
        }
        return false;
    }
}
