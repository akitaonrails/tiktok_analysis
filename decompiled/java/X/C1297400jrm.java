package X;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;

/* JADX INFO: renamed from: X.0jrm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1297400jrm implements WildcardType {
    public final Type LL;
    public final Type LLILLJJLI;

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        return new Type[]{this.LL};
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.LLILLJJLI;
        return type != null ? new Type[]{type} : C1297410jrn.LIZ;
    }

    public final int hashCode() {
        Type type = this.LLILLJJLI;
        return (type != null ? type.hashCode() + 31 : 1) ^ (this.LL.hashCode() + 31);
    }

    public final String toString() {
        if (this.LLILLJJLI != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("? super ");
            sbLIZ.append(C1297410jrn.LJII(this.LLILLJJLI));
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        if (this.LL == Object.class) {
            return "?";
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("? extends ");
        sbLIZ2.append(C1297410jrn.LJII(this.LL));
        return C2188811AlT.LIZIZ(sbLIZ2);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof WildcardType) && C1297410jrn.LIZLLL(this, (Type) obj)) {
            return true;
        }
        return false;
    }

    public C1297400jrm(Type[] typeArr, Type[] typeArr2) {
        if (typeArr2.length <= 1) {
            if (typeArr.length == 1) {
                if (typeArr2.length == 1) {
                    Type type = typeArr2[0];
                    if (type != null) {
                        C1297410jrn.LIZIZ(type);
                        if (typeArr[0] == Object.class) {
                            this.LLILLJJLI = C1297410jrn.LIZ(typeArr2[0]);
                            this.LL = Object.class;
                            return;
                        }
                        throw new IllegalArgumentException();
                    }
                    throw null;
                }
                Type type2 = typeArr[0];
                if (type2 != null) {
                    C1297410jrn.LIZIZ(type2);
                    this.LLILLJJLI = null;
                    this.LL = C1297410jrn.LIZ(typeArr[0]);
                    return;
                }
                throw null;
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException();
    }
}
