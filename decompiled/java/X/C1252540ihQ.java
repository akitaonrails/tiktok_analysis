package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ihQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1252540ihQ<T> extends AbstractC1252750ihl<T> {
    public final T LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1252540ihQ) && Intrinsics.LJFF(this.LIZ, ((C1252540ihQ) obj).LIZ);
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
        sbLIZ.append("Success(value=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1252750ihl
    public final T LIZ() {
        return this.LIZ;
    }

    public C1252540ihQ(T t) {
        this.LIZ = t;
    }
}
