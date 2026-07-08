package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00Bz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C039300Bz<T> extends AbstractC039000Bw<T> {
    public final T LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C039300Bz) && Intrinsics.LJFF(this.LIZ, ((C039300Bz) obj).LIZ);
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

    public C039300Bz(T t) {
        this.LIZ = t;
    }
}
