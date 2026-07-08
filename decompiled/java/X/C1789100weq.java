package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0weq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1789100weq<T, ERR> extends AbstractC1789120wes<T, ERR> {
    public final T LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1789100weq) && Intrinsics.LJFF(this.LIZ, ((C1789100weq) obj).LIZ);
    }

    public final int hashCode() {
        T t = this.LIZ;
        if (t == null) {
            return 0;
        }
        return t.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Success(data=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1789100weq(T t) {
        this.LIZ = t;
    }
}
