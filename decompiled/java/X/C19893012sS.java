package X;

import java.lang.reflect.TypeVariable;
import java.util.Arrays;

/* JADX INFO: renamed from: X.12sS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19893012sS {
    public final TypeVariable<?> LIZ;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.LIZ.getGenericDeclaration(), this.LIZ.getName()});
    }

    public final String toString() {
        return this.LIZ.toString();
    }

    public C19893012sS(TypeVariable<?> typeVariable) {
        typeVariable.getClass();
        this.LIZ = typeVariable;
    }

    public final boolean LIZ(TypeVariable<?> typeVariable) {
        if (this.LIZ.getGenericDeclaration().equals(typeVariable.getGenericDeclaration()) && this.LIZ.getName().equals(typeVariable.getName())) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C19893012sS) {
            return LIZ(((C19893012sS) obj).LIZ);
        }
        return false;
    }
}
