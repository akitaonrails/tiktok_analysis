package X;

import java.lang.reflect.Type;

/* JADX INFO: renamed from: X.12sc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C19894012sc {
    public final Type[] LIZ;
    public final boolean LIZIZ;

    public final boolean LIZ(Type type) {
        for (Type type2 : this.LIZ) {
            boolean zIsSubtypeOf = AbstractC19891512sD.of(type2).isSubtypeOf(type);
            boolean z = this.LIZIZ;
            if (zIsSubtypeOf == z) {
                return z;
            }
        }
        return !this.LIZIZ;
    }

    public final boolean LIZIZ(Type type) {
        AbstractC19891512sD<?> abstractC19891512sDOf = AbstractC19891512sD.of(type);
        for (Type type2 : this.LIZ) {
            boolean zIsSubtypeOf = abstractC19891512sDOf.isSubtypeOf(type2);
            boolean z = this.LIZIZ;
            if (zIsSubtypeOf == z) {
                return z;
            }
        }
        return !this.LIZIZ;
    }

    public C19894012sc(Type[] typeArr, boolean z) {
        this.LIZ = typeArr;
        this.LIZIZ = z;
    }
}
