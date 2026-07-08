package X;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.09Qu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2371009Qu implements GenericArrayType, Type {
    public final Type LL;

    public final int hashCode() {
        return this.LL.hashCode();
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C2371409Qy.LJ(this.LL));
        sbLIZ.append("[]");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String toString() {
        return getTypeName();
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.LL;
    }

    public C2371009Qu(Type type) {
        this.LL = type;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof GenericArrayType) && Intrinsics.LJFF(this.LL, ((GenericArrayType) obj).getGenericComponentType())) {
            return true;
        }
        return false;
    }
}
