package X;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* JADX INFO: renamed from: X.0jrl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1297390jrl implements GenericArrayType {
    public final Type LL;

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C1297410jrn.LJII(this.LL));
        sbLIZ.append("[]");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.LL;
    }

    public C1297390jrl(Type type) {
        this.LL = C1297410jrn.LIZ(type);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof GenericArrayType) && C1297410jrn.LIZLLL(this, (Type) obj)) {
            return true;
        }
        return false;
    }
}
