package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00nn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C187300nn {
    public final Class<?> LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C187300nn)) {
            return false;
        }
        C187300nn c187300nn = (C187300nn) obj;
        return Intrinsics.LJFF(this.LIZ, c187300nn.LIZ) && Intrinsics.LJFF(this.LIZIZ, c187300nn.LIZIZ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        String str = this.LIZIZ;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public C187300nn(Class<?> cls, String str) {
        this.LIZ = cls;
        this.LIZIZ = str;
    }
}
