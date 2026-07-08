package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Hko, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C450040Hko<T> extends AbstractC450030Hkn<T> {
    public final T LIZ;
    public final boolean LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C450040Hko)) {
            return false;
        }
        C450040Hko c450040Hko = (C450040Hko) obj;
        return Intrinsics.LJFF(this.LIZ, c450040Hko.LIZ) && this.LIZIZ == c450040Hko.LIZIZ;
    }

    public final int hashCode() {
        T t = this.LIZ;
        return ((t == null ? 0 : t.hashCode()) * 31) + C786410Ut5.Z2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Success(data=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", hasMore=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C450040Hko(T t, boolean z) {
        this.LIZ = t;
        this.LIZIZ = z;
    }
}
